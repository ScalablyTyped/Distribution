package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridSelection
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
object IgGridSelection {
  
  inline def apply(): IgGridSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgGridSelection] (val x: Self) extends AnyVal {
    
    inline def setActivation(value: Boolean): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    inline def setActiveCellChanged(value: (/* event */ Event, /* ui */ ActiveCellChangedEventUIParam) => Unit): Self = StObject.set(x, "activeCellChanged", js.Any.fromFunction2(value))
    
    inline def setActiveCellChangedUndefined: Self = StObject.set(x, "activeCellChanged", js.undefined)
    
    inline def setActiveCellChanging(value: (/* event */ Event, /* ui */ ActiveCellChangingEventUIParam) => Unit): Self = StObject.set(x, "activeCellChanging", js.Any.fromFunction2(value))
    
    inline def setActiveCellChangingUndefined: Self = StObject.set(x, "activeCellChanging", js.undefined)
    
    inline def setActiveRowChanged(value: (/* event */ Event, /* ui */ ActiveRowChangedEventUIParam) => Unit): Self = StObject.set(x, "activeRowChanged", js.Any.fromFunction2(value))
    
    inline def setActiveRowChangedUndefined: Self = StObject.set(x, "activeRowChanged", js.undefined)
    
    inline def setActiveRowChanging(value: (/* event */ Event, /* ui */ ActiveRowChangingEventUIParam) => Unit): Self = StObject.set(x, "activeRowChanging", js.Any.fromFunction2(value))
    
    inline def setActiveRowChangingUndefined: Self = StObject.set(x, "activeRowChanging", js.undefined)
    
    inline def setAllowMultipleRangeSelection(value: Boolean): Self = StObject.set(x, "allowMultipleRangeSelection", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleRangeSelectionUndefined: Self = StObject.set(x, "allowMultipleRangeSelection", js.undefined)
    
    inline def setCellSelectionChanged(value: (/* event */ Event, /* ui */ CellSelectionChangedEventUIParam) => Unit): Self = StObject.set(x, "cellSelectionChanged", js.Any.fromFunction2(value))
    
    inline def setCellSelectionChangedUndefined: Self = StObject.set(x, "cellSelectionChanged", js.undefined)
    
    inline def setCellSelectionChanging(value: (/* event */ Event, /* ui */ CellSelectionChangingEventUIParam) => Unit): Self = StObject.set(x, "cellSelectionChanging", js.Any.fromFunction2(value))
    
    inline def setCellSelectionChangingUndefined: Self = StObject.set(x, "cellSelectionChanging", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMouseDragSelect(value: Boolean): Self = StObject.set(x, "mouseDragSelect", value.asInstanceOf[js.Any])
    
    inline def setMouseDragSelectUndefined: Self = StObject.set(x, "mouseDragSelect", js.undefined)
    
    inline def setMultipleCellSelectOnClick(value: Boolean): Self = StObject.set(x, "multipleCellSelectOnClick", value.asInstanceOf[js.Any])
    
    inline def setMultipleCellSelectOnClickUndefined: Self = StObject.set(x, "multipleCellSelectOnClick", js.undefined)
    
    inline def setMultipleSelection(value: Boolean): Self = StObject.set(x, "multipleSelection", value.asInstanceOf[js.Any])
    
    inline def setMultipleSelectionUndefined: Self = StObject.set(x, "multipleSelection", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setRowSelectionChanged(value: (/* event */ Event, /* ui */ RowSelectionChangedEventUIParam) => Unit): Self = StObject.set(x, "rowSelectionChanged", js.Any.fromFunction2(value))
    
    inline def setRowSelectionChangedUndefined: Self = StObject.set(x, "rowSelectionChanged", js.undefined)
    
    inline def setRowSelectionChanging(value: (/* event */ Event, /* ui */ RowSelectionChangingEventUIParam) => Unit): Self = StObject.set(x, "rowSelectionChanging", js.Any.fromFunction2(value))
    
    inline def setRowSelectionChangingUndefined: Self = StObject.set(x, "rowSelectionChanging", js.undefined)
    
    inline def setSkipChildren(value: Boolean): Self = StObject.set(x, "skipChildren", value.asInstanceOf[js.Any])
    
    inline def setSkipChildrenUndefined: Self = StObject.set(x, "skipChildren", js.undefined)
    
    inline def setTouchDragSelect(value: Boolean): Self = StObject.set(x, "touchDragSelect", value.asInstanceOf[js.Any])
    
    inline def setTouchDragSelectUndefined: Self = StObject.set(x, "touchDragSelect", js.undefined)
    
    inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
    
    inline def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
  }
}
