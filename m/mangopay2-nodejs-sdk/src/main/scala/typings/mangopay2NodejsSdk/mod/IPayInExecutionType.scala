package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPayInExecutionType extends js.Object {
  var Direct: DIRECT = js.native
  var Web: WEB = js.native
}

object IPayInExecutionType {
  @scala.inline
  def apply(Direct: DIRECT, Web: WEB): IPayInExecutionType = {
    val __obj = js.Dynamic.literal(Direct = Direct.asInstanceOf[js.Any], Web = Web.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayInExecutionType]
  }
  @scala.inline
  implicit class IPayInExecutionTypeOps[Self <: IPayInExecutionType] (val x: Self) extends AnyVal {
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
    def setDirect(value: DIRECT): Self = this.set("Direct", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeb(value: WEB): Self = this.set("Web", value.asInstanceOf[js.Any])
  }
  
}

