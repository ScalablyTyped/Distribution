package typings.jpm.anon

import typings.jpm.FFAddonSDK.FrameEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  var name: js.UndefOr[String] = js.native
  var onAttach: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.native
  var onDetach: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.native
  var onMessage: js.UndefOr[js.Function1[/* message */ FrameEvent, _]] = js.native
  var onReady: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.native
  var url: String = js.native
}

object Name {
  @scala.inline
  def apply(url: String): Name = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnAttach(value: /* event */ FrameEvent => _): Self = this.set("onAttach", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAttach: Self = this.set("onAttach", js.undefined)
    @scala.inline
    def setOnDetach(value: /* event */ FrameEvent => _): Self = this.set("onDetach", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDetach: Self = this.set("onDetach", js.undefined)
    @scala.inline
    def setOnLoad(value: /* event */ FrameEvent => _): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnMessage(value: /* message */ FrameEvent => _): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    @scala.inline
    def setOnReady(value: /* event */ FrameEvent => _): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
  }
  
}

