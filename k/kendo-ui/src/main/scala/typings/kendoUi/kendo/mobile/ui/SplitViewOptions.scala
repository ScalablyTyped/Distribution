package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitViewOptions extends js.Object {
  var init: js.UndefOr[js.Function1[/* e */ SplitViewInitEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var show: js.UndefOr[js.Function1[/* e */ SplitViewShowEvent, Unit]] = js.native
  var style: js.UndefOr[String] = js.native
}

object SplitViewOptions {
  @scala.inline
  def apply(): SplitViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitViewOptions]
  }
  @scala.inline
  implicit class SplitViewOptionsOps[Self <: SplitViewOptions] (val x: Self) extends AnyVal {
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
    def setInit(value: /* e */ SplitViewInitEvent => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setShow(value: /* e */ SplitViewShowEvent => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

