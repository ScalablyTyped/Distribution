package typings.mangopay2NodejsSdk.mod.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClientLogo extends js.Object {
  /**
    * The base64 encoded file which needs to be uploaded
    */
  var File: String = js.native
}

object UpdateClientLogo {
  @scala.inline
  def apply(File: String): UpdateClientLogo = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClientLogo]
  }
  @scala.inline
  implicit class UpdateClientLogoOps[Self <: UpdateClientLogo] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("File", value.asInstanceOf[js.Any])
  }
  
}

