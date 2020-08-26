package typings.inboxsdk.mod.ButterBar

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingMessageDescriptorHtmlElement
  extends LoadingMessageDescriptorBase
     with LoadingMessageDescriptor {
  var el: HTMLElement = js.native
}

object LoadingMessageDescriptorHtmlElement {
  @scala.inline
  def apply(el: HTMLElement): LoadingMessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptorHtmlElement]
  }
  @scala.inline
  implicit class LoadingMessageDescriptorHtmlElementOps[Self <: LoadingMessageDescriptorHtmlElement] (val x: Self) extends AnyVal {
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
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
  }
  
}

