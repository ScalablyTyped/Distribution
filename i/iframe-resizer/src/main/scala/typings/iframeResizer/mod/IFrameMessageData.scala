package typings.iframeResizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IFrameMessageData extends js.Object {
  var iframe: IFrameComponent = js.native
  var message: js.Any = js.native
}

object IFrameMessageData {
  @scala.inline
  def apply(iframe: IFrameComponent, message: js.Any): IFrameMessageData = {
    val __obj = js.Dynamic.literal(iframe = iframe.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFrameMessageData]
  }
  @scala.inline
  implicit class IFrameMessageDataOps[Self <: IFrameMessageData] (val x: Self) extends AnyVal {
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
    def setIframe(value: IFrameComponent): Self = this.set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

