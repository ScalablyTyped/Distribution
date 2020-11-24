package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableOptions extends js.Object {
  
  var autoScroll: js.UndefOr[Boolean] = js.native
  
  var axis: js.UndefOr[String] = js.native
  
  var cancel: js.UndefOr[js.Function1[/* e */ SortableCancelEvent, Unit]] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ SortableChangeEvent, Unit]] = js.native
  
  var connectWith: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String | JQuery] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var cursorOffset: js.UndefOr[SortableCursorOffset] = js.native
  
  var disabled: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[js.Function1[/* e */ SortableEndEvent, Unit]] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var handler: js.UndefOr[String] = js.native
  
  var hint: js.UndefOr[js.Function | String | JQuery] = js.native
  
  var holdToDrag: js.UndefOr[Boolean] = js.native
  
  var ignore: js.UndefOr[String] = js.native
  
  var move: js.UndefOr[js.Function1[/* e */ SortableMoveEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[js.Function | String | JQuery] = js.native
  
  var start: js.UndefOr[js.Function1[/* e */ SortableStartEvent, Unit]] = js.native
}
object SortableOptions {
  
  @scala.inline
  def apply(): SortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableOptions]
  }
  
  @scala.inline
  implicit class SortableOptionsOps[Self <: SortableOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoScroll(value: Boolean): Self = this.set("autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScroll: Self = this.set("autoScroll", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ SortableCancelEvent => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ SortableChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setConnectWith(value: String): Self = this.set("connectWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectWith: Self = this.set("connectWith", js.undefined)
    
    @scala.inline
    def setContainer(value: String | JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setCursorOffset(value: SortableCursorOffset): Self = this.set("cursorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorOffset: Self = this.set("cursorOffset", js.undefined)
    
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEnd(value: /* e */ SortableEndEvent => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setHandler(value: String): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setHint(value: js.Function | String | JQuery): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setHoldToDrag(value: Boolean): Self = this.set("holdToDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoldToDrag: Self = this.set("holdToDrag", js.undefined)
    
    @scala.inline
    def setIgnore(value: String): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setMove(value: /* e */ SortableMoveEvent => Unit): Self = this.set("move", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: js.Function | String | JQuery): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setStart(value: /* e */ SortableStartEvent => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
