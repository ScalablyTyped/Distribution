package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeclaredUboStatus extends js.Object {
  var Created: CREATED = js.native
  var Refused: REFUSED = js.native
  var Validated: VALIDATED = js.native
}

object IDeclaredUboStatus {
  @scala.inline
  def apply(Created: CREATED, Refused: REFUSED, Validated: VALIDATED): IDeclaredUboStatus = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], Refused = Refused.asInstanceOf[js.Any], Validated = Validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeclaredUboStatus]
  }
  @scala.inline
  implicit class IDeclaredUboStatusOps[Self <: IDeclaredUboStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated(value: CREATED): Self = this.set("Created", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefused(value: REFUSED): Self = this.set("Refused", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidated(value: VALIDATED): Self = this.set("Validated", value.asInstanceOf[js.Any])
  }
  
}

