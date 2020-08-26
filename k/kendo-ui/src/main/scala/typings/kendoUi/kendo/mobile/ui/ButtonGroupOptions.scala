package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonGroupOptions extends js.Object {
  var enable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var select: js.UndefOr[js.Function1[/* e */ ButtonGroupSelectEvent, Unit]] = js.native
  var selectOn: js.UndefOr[String] = js.native
}

object ButtonGroupOptions {
  @scala.inline
  def apply(): ButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonGroupOptions]
  }
  @scala.inline
  implicit class ButtonGroupOptionsOps[Self <: ButtonGroupOptions] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelect(value: /* e */ ButtonGroupSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectOn(value: String): Self = this.set("selectOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOn: Self = this.set("selectOn", js.undefined)
  }
  
}

