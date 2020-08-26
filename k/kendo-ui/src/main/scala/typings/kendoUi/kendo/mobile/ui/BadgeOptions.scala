package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeOptions extends js.Object {
  var appearance: js.UndefOr[String] = js.native
  var change: js.UndefOr[js.Function1[/* e */ BadgeChangeEvent, Unit]] = js.native
  var hide: js.UndefOr[js.Function1[/* e */ BadgeEvent, Unit]] = js.native
  var look: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var show: js.UndefOr[js.Function1[/* e */ BadgeEvent, Unit]] = js.native
  var template: js.UndefOr[String | js.Function] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object BadgeOptions {
  @scala.inline
  def apply(): BadgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeOptions]
  }
  @scala.inline
  implicit class BadgeOptionsOps[Self <: BadgeOptions] (val x: Self) extends AnyVal {
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
    def setAppearance(value: String): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setChange(value: /* e */ BadgeChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setHide(value: /* e */ BadgeEvent => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setLook(value: String): Self = this.set("look", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLook: Self = this.set("look", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setShow(value: /* e */ BadgeEvent => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

