package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridSelection
  extends /**
	 * Option for igTreeGridSelection
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables / disables activation of rows and cells. Activation implies ability to perform navigating through cells and rows via the keyboard, and selecting rows and cells using CTRL / SHIFT - in the way cells/rows are selected in Ms Excel
  	 *
  	 */
  var activation: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired after a cell becomes active (focus style applied).
  	 */
  var activeCellChanged: js.UndefOr[ActiveCellChangedEvent] = js.undefined
  /**
  	 * Event fired before a cell becomes active (focus style applied) (cancellable).
  	 * Return false in order to cancel active cell changing.
  	 */
  var activeCellChanging: js.UndefOr[ActiveCellChangingEvent] = js.undefined
  /**
  	 * Event fired after a row becomes active (focus style applied).
  	 */
  var activeRowChanged: js.UndefOr[ActiveRowChangedEvent] = js.undefined
  /**
  	 * Event fired before a row becomes active (focus style applied) (cancellable).
  	 * Return false in order to cancel active row changing.
  	 */
  var activeRowChanging: js.UndefOr[ActiveRowChangingEvent] = js.undefined
  /**
  	 * Enables / disables the ability to ctrl drag multiple selection windows when selection mode is 'cell'
  	 *
  	 */
  var allowMultipleRangeSelection: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired after cell(s) are selected.
  	 */
  var cellSelectionChanged: js.UndefOr[CellSelectionChangedEvent] = js.undefined
  /**
  	 * Event fired before cell(s) are about to be selected (cancellable).
  	 * Return false in order to cancel cell selection changing.
  	 */
  var cellSelectionChanging: js.UndefOr[CellSelectionChangingEvent] = js.undefined
  /**
  	 * Defines type of the selection.
  	 *
  	 *
  	 * Valid values:
  	 * "row" Defines row selection mode.
  	 * "cell" Defines cell selection mode.
  	 */
  var mode: js.UndefOr[String] = js.undefined
  /**
  	 * Enables / disables selection via dragging with the mouse - only applicable for cell selection
  	 *
  	 */
  var mouseDragSelect: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If true multiple selection of cells is done as if CTRL is being held. the option is disregarded if mode is set to row. this option is useful for enabling multiple discountinued selection on touch environments.
  	 *
  	 */
  var multipleCellSelectOnClick: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enables / Disables multiple selection of cells and rows - depending on the mode
  	 *
  	 */
  var multipleSelection: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enables / disables selection persistance between states.
  	 *
  	 */
  var persist: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired after row(s) are selected.
  	 */
  var rowSelectionChanged: js.UndefOr[RowSelectionChangedEvent] = js.undefined
  /**
  	 * Event fired before row(s) are about to be selected (cancellable).
  	 * Return false in order to cancel selection changing.
  	 */
  var rowSelectionChanging: js.UndefOr[RowSelectionChangingEvent] = js.undefined
  /**
  	 * If true will basically skip going into child grids with down / up / right / left arrow keys, when in the context of hierarchical grid
  	 *
  	 */
  var skipChildren: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Deprecated="true" Enables / disables selection via continuous touch event - only applicable for cell selection and touch-supported environments
  	 *
  	 */
  var touchDragSelect: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If wrapAround is enabled and selection is on the first or last row or cell, then when the end user tries to go beyond that, the first/last row or cell will be selected
  	 *
  	 */
  var wrapAround: js.UndefOr[Boolean] = js.undefined
}

object IgTreeGridSelection {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTreeGridSelection
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    activation: js.UndefOr[Boolean] = js.undefined,
    activeCellChanged: (/* event */ Event, /* ui */ ActiveCellChangedEventUIParam) => Unit = null,
    activeCellChanging: (/* event */ Event, /* ui */ ActiveCellChangingEventUIParam) => Unit = null,
    activeRowChanged: (/* event */ Event, /* ui */ ActiveRowChangedEventUIParam) => Unit = null,
    activeRowChanging: (/* event */ Event, /* ui */ ActiveRowChangingEventUIParam) => Unit = null,
    allowMultipleRangeSelection: js.UndefOr[Boolean] = js.undefined,
    cellSelectionChanged: (/* event */ Event, /* ui */ CellSelectionChangedEventUIParam) => Unit = null,
    cellSelectionChanging: (/* event */ Event, /* ui */ CellSelectionChangingEventUIParam) => Unit = null,
    mode: String = null,
    mouseDragSelect: js.UndefOr[Boolean] = js.undefined,
    multipleCellSelectOnClick: js.UndefOr[Boolean] = js.undefined,
    multipleSelection: js.UndefOr[Boolean] = js.undefined,
    persist: js.UndefOr[Boolean] = js.undefined,
    rowSelectionChanged: (/* event */ Event, /* ui */ RowSelectionChangedEventUIParam) => Unit = null,
    rowSelectionChanging: (/* event */ Event, /* ui */ RowSelectionChangingEventUIParam) => Unit = null,
    skipChildren: js.UndefOr[Boolean] = js.undefined,
    touchDragSelect: js.UndefOr[Boolean] = js.undefined,
    wrapAround: js.UndefOr[Boolean] = js.undefined
  ): IgTreeGridSelection = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(activation)) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (activeCellChanged != null) __obj.updateDynamic("activeCellChanged")(js.Any.fromFunction2(activeCellChanged))
    if (activeCellChanging != null) __obj.updateDynamic("activeCellChanging")(js.Any.fromFunction2(activeCellChanging))
    if (activeRowChanged != null) __obj.updateDynamic("activeRowChanged")(js.Any.fromFunction2(activeRowChanged))
    if (activeRowChanging != null) __obj.updateDynamic("activeRowChanging")(js.Any.fromFunction2(activeRowChanging))
    if (!js.isUndefined(allowMultipleRangeSelection)) __obj.updateDynamic("allowMultipleRangeSelection")(allowMultipleRangeSelection.asInstanceOf[js.Any])
    if (cellSelectionChanged != null) __obj.updateDynamic("cellSelectionChanged")(js.Any.fromFunction2(cellSelectionChanged))
    if (cellSelectionChanging != null) __obj.updateDynamic("cellSelectionChanging")(js.Any.fromFunction2(cellSelectionChanging))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseDragSelect)) __obj.updateDynamic("mouseDragSelect")(mouseDragSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleCellSelectOnClick)) __obj.updateDynamic("multipleCellSelectOnClick")(multipleCellSelectOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleSelection)) __obj.updateDynamic("multipleSelection")(multipleSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (rowSelectionChanged != null) __obj.updateDynamic("rowSelectionChanged")(js.Any.fromFunction2(rowSelectionChanged))
    if (rowSelectionChanging != null) __obj.updateDynamic("rowSelectionChanging")(js.Any.fromFunction2(rowSelectionChanging))
    if (!js.isUndefined(skipChildren)) __obj.updateDynamic("skipChildren")(skipChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(touchDragSelect)) __obj.updateDynamic("touchDragSelect")(touchDragSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridSelection]
  }
}

