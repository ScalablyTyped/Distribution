package typings.kendoUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ RouterChangeEvent, Unit]] = js.native
  var hashBang: js.UndefOr[Boolean] = js.native
  var ignoreCase: js.UndefOr[Boolean] = js.native
  var init: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.native
  var pushState: js.UndefOr[Boolean] = js.native
  var root: js.UndefOr[String] = js.native
  var routeMissing: js.UndefOr[js.Function1[/* e */ RouterRouteMissingEvent, Unit]] = js.native
  var same: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.native
}

object RouterOptions {
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions] (val x: Self) extends AnyVal {
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
    def setChange(value: /* e */ RouterChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setHashBang(value: Boolean): Self = this.set("hashBang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashBang: Self = this.set("hashBang", js.undefined)
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    @scala.inline
    def setInit(value: /* e */ RouterEvent => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setPushState(value: Boolean): Self = this.set("pushState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushState: Self = this.set("pushState", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRouteMissing(value: /* e */ RouterRouteMissingEvent => Unit): Self = this.set("routeMissing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRouteMissing: Self = this.set("routeMissing", js.undefined)
    @scala.inline
    def setSame(value: /* e */ RouterEvent => Unit): Self = this.set("same", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSame: Self = this.set("same", js.undefined)
  }
  
}

