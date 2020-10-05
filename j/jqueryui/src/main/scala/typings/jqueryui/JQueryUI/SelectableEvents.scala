package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import typings.jqueryui.anon.Selected
import typings.jqueryui.anon.Selecting
import typings.jqueryui.anon.Unselected
import typings.jqueryui.anon.Unselecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectableEvents extends js.Object {
  var selected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Selected, Unit]] = js.native
  var selecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Selecting, Unit]] = js.native
  var start: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ js.Any, Unit]] = js.native
  var stop: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ js.Any, Unit]] = js.native
  var unselected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Unselected, Unit]] = js.native
  var unselecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Unselecting, Unit]] = js.native
}

object SelectableEvents {
  @scala.inline
  def apply(): SelectableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectableEvents]
  }
  @scala.inline
  implicit class SelectableEventsOps[Self <: SelectableEvents] (val x: Self) extends AnyVal {
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
    def setSelected(value: (/* event */ JQueryEventObject, /* ui */ Selected) => Unit): Self = this.set("selected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSelecting(value: (/* event */ JQueryEventObject, /* ui */ Selecting) => Unit): Self = this.set("selecting", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelecting: Self = this.set("selecting", js.undefined)
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit): Self = this.set("stop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    @scala.inline
    def setUnselected(value: (/* event */ JQueryEventObject, /* ui */ Unselected) => Unit): Self = this.set("unselected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUnselected: Self = this.set("unselected", js.undefined)
    @scala.inline
    def setUnselecting(value: (/* event */ JQueryEventObject, /* ui */ Unselecting) => Unit): Self = this.set("unselecting", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUnselecting: Self = this.set("unselecting", js.undefined)
  }
  
}

