package typings.jqueryContextmenu

import typings.jqueryContextmenu.anon.Duration
import typings.jqueryContextmenu.anon.Hide
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryContextMenuOptions extends js.Object {
  var animation: js.UndefOr[Duration] = js.native
  var appendTo: js.UndefOr[String] = js.native
  var autoHide: js.UndefOr[Boolean] = js.native
  var build: js.UndefOr[js.Function2[/* triggerElement */ JQuery, /* e */ Event, _]] = js.native
  var callback: js.UndefOr[js.Function2[/* key */ js.Any, /* options */ js.Any, _]] = js.native
  var className: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var determinePosition: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.native
  var events: js.UndefOr[Hide] = js.native
  var itemClickEvent: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Any] = js.native
  var position: js.UndefOr[js.Function3[/* opt */ JQuery, /* x */ Double, /* y */ Double, Unit]] = js.native
  var positionSubmenu: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.native
  var reposition: js.UndefOr[Boolean] = js.native
  var selector: String = js.native
  var trigger: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object JQueryContextMenuOptions {
  @scala.inline
  def apply(selector: String): JQueryContextMenuOptions = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryContextMenuOptions]
  }
  @scala.inline
  implicit class JQueryContextMenuOptionsOps[Self <: JQueryContextMenuOptions] (val x: Self) extends AnyVal {
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
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: Duration): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAppendTo(value: String): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    @scala.inline
    def setBuild(value: (/* triggerElement */ JQuery, /* e */ Event) => _): Self = this.set("build", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    @scala.inline
    def setCallback(value: (/* key */ js.Any, /* options */ js.Any) => _): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDeterminePosition(value: /* menu */ JQuery => Unit): Self = this.set("determinePosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeterminePosition: Self = this.set("determinePosition", js.undefined)
    @scala.inline
    def setEvents(value: Hide): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setItemClickEvent(value: String): Self = this.set("itemClickEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemClickEvent: Self = this.set("itemClickEvent", js.undefined)
    @scala.inline
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setPosition(value: (/* opt */ JQuery, /* x */ Double, /* y */ Double) => Unit): Self = this.set("position", js.Any.fromFunction3(value))
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionSubmenu(value: /* menu */ JQuery => Unit): Self = this.set("positionSubmenu", js.Any.fromFunction1(value))
    @scala.inline
    def deletePositionSubmenu: Self = this.set("positionSubmenu", js.undefined)
    @scala.inline
    def setReposition(value: Boolean): Self = this.set("reposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReposition: Self = this.set("reposition", js.undefined)
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

