package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridSelection
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables / disables activation of rows and cells. Activation implies ability to perform navigating through cells and rows via the keyboard, and selecting rows and cells using CTRL / SHIFT - in the way cells/rows are selected in Ms Excel
    *
    */
  var activation: js.UndefOr[Boolean] = js.native
  /**
    * Event fired after a cell becomes active (focus style applied).
    */
  var activeCellChanged: js.UndefOr[ActiveCellChangedEvent] = js.native
  /**
    * Event fired before a cell becomes active (focus style applied) (cancellable).
    * Return false in order to cancel active cell changing.
    */
  var activeCellChanging: js.UndefOr[ActiveCellChangingEvent] = js.native
  /**
    * Event fired after a row becomes active (focus style applied).
    */
  var activeRowChanged: js.UndefOr[ActiveRowChangedEvent] = js.native
  /**
    * Event fired before a row becomes active (focus style applied) (cancellable).
    * Return false in order to cancel active row changing.
    */
  var activeRowChanging: js.UndefOr[ActiveRowChangingEvent] = js.native
  /**
    * Enables / disables the ability to ctrl drag multiple selection windows when selection mode is 'cell'
    *
    */
  var allowMultipleRangeSelection: js.UndefOr[Boolean] = js.native
  /**
    * Event fired after cell(s) are selected.
    */
  var cellSelectionChanged: js.UndefOr[CellSelectionChangedEvent] = js.native
  /**
    * Event fired before cell(s) are about to be selected (cancellable).
    * Return false in order to cancel cell selection changing.
    */
  var cellSelectionChanging: js.UndefOr[CellSelectionChangingEvent] = js.native
  /**
    * Defines type of the selection.
    *
    *
    * Valid values:
    * "row" Defines row selection mode.
    * "cell" Defines cell selection mode.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * Enables / disables selection via dragging with the mouse - only applicable for cell selection
    *
    */
  var mouseDragSelect: js.UndefOr[Boolean] = js.native
  /**
    * If true multiple selection of cells is done as if CTRL is being held. the option is disregarded if mode is set to row. this option is useful for enabling multiple discountinued selection on touch environments.
    *
    */
  var multipleCellSelectOnClick: js.UndefOr[Boolean] = js.native
  /**
    * Enables / Disables multiple selection of cells and rows - depending on the mode
    *
    */
  var multipleSelection: js.UndefOr[Boolean] = js.native
  /**
    * Enables / disables selection persistance between states.
    *
    */
  var persist: js.UndefOr[Boolean] = js.native
  /**
    * Event fired after row(s) are selected.
    */
  var rowSelectionChanged: js.UndefOr[RowSelectionChangedEvent] = js.native
  /**
    * Event fired before row(s) are about to be selected (cancellable).
    * Return false in order to cancel selection changing.
    */
  var rowSelectionChanging: js.UndefOr[RowSelectionChangingEvent] = js.native
  /**
    * If true will basically skip going into child grids with down / up / right / left arrow keys, when in the context of hierarchical grid
    *
    */
  var skipChildren: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated="true" Enables / disables selection via continuous touch event - only applicable for cell selection and touch-supported environments
    *
    */
  var touchDragSelect: js.UndefOr[Boolean] = js.native
  /**
    * If wrapAround is enabled and selection is on the first or last row or cell, then when the end user tries to go beyond that, the first/last row or cell will be selected
    *
    */
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object IgTreeGridSelection {
  @scala.inline
  def apply(): IgTreeGridSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridSelection]
  }
  @scala.inline
  implicit class IgTreeGridSelectionOps[Self <: IgTreeGridSelection] (val x: Self) extends AnyVal {
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
    def setActivation(value: Boolean): Self = this.set("activation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivation: Self = this.set("activation", js.undefined)
    @scala.inline
    def setActiveCellChanged(value: (/* event */ Event, /* ui */ ActiveCellChangedEventUIParam) => Unit): Self = this.set("activeCellChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteActiveCellChanged: Self = this.set("activeCellChanged", js.undefined)
    @scala.inline
    def setActiveCellChanging(value: (/* event */ Event, /* ui */ ActiveCellChangingEventUIParam) => Unit): Self = this.set("activeCellChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteActiveCellChanging: Self = this.set("activeCellChanging", js.undefined)
    @scala.inline
    def setActiveRowChanged(value: (/* event */ Event, /* ui */ ActiveRowChangedEventUIParam) => Unit): Self = this.set("activeRowChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteActiveRowChanged: Self = this.set("activeRowChanged", js.undefined)
    @scala.inline
    def setActiveRowChanging(value: (/* event */ Event, /* ui */ ActiveRowChangingEventUIParam) => Unit): Self = this.set("activeRowChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteActiveRowChanging: Self = this.set("activeRowChanging", js.undefined)
    @scala.inline
    def setAllowMultipleRangeSelection(value: Boolean): Self = this.set("allowMultipleRangeSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultipleRangeSelection: Self = this.set("allowMultipleRangeSelection", js.undefined)
    @scala.inline
    def setCellSelectionChanged(value: (/* event */ Event, /* ui */ CellSelectionChangedEventUIParam) => Unit): Self = this.set("cellSelectionChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellSelectionChanged: Self = this.set("cellSelectionChanged", js.undefined)
    @scala.inline
    def setCellSelectionChanging(value: (/* event */ Event, /* ui */ CellSelectionChangingEventUIParam) => Unit): Self = this.set("cellSelectionChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellSelectionChanging: Self = this.set("cellSelectionChanging", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMouseDragSelect(value: Boolean): Self = this.set("mouseDragSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseDragSelect: Self = this.set("mouseDragSelect", js.undefined)
    @scala.inline
    def setMultipleCellSelectOnClick(value: Boolean): Self = this.set("multipleCellSelectOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleCellSelectOnClick: Self = this.set("multipleCellSelectOnClick", js.undefined)
    @scala.inline
    def setMultipleSelection(value: Boolean): Self = this.set("multipleSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleSelection: Self = this.set("multipleSelection", js.undefined)
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    @scala.inline
    def setRowSelectionChanged(value: (/* event */ Event, /* ui */ RowSelectionChangedEventUIParam) => Unit): Self = this.set("rowSelectionChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowSelectionChanged: Self = this.set("rowSelectionChanged", js.undefined)
    @scala.inline
    def setRowSelectionChanging(value: (/* event */ Event, /* ui */ RowSelectionChangingEventUIParam) => Unit): Self = this.set("rowSelectionChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowSelectionChanging: Self = this.set("rowSelectionChanging", js.undefined)
    @scala.inline
    def setSkipChildren(value: Boolean): Self = this.set("skipChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipChildren: Self = this.set("skipChildren", js.undefined)
    @scala.inline
    def setTouchDragSelect(value: Boolean): Self = this.set("touchDragSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchDragSelect: Self = this.set("touchDragSelect", js.undefined)
    @scala.inline
    def setWrapAround(value: Boolean): Self = this.set("wrapAround", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapAround: Self = this.set("wrapAround", js.undefined)
  }
  
}

