package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayoutOptions extends StObject {
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var columnsWidth: js.UndefOr[String | Double] = js.undefined
  
  var containers: js.UndefOr[js.Array[TileLayoutContainer]] = js.undefined
  
  var gap: js.UndefOr[TileLayoutGap] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var reorder: js.UndefOr[js.Function1[/* e */ TileLayoutReorderEvent, Unit]] = js.undefined
  
  var reorderable: js.UndefOr[Boolean] = js.undefined
  
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[js.Function1[/* e */ TileLayoutResizeEvent, Unit]] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  var rowsHeight: js.UndefOr[String | Double] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object TileLayoutOptions {
  
  @scala.inline
  def apply(): TileLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutOptions]
  }
  
  @scala.inline
  implicit class TileLayoutOptionsMutableBuilder[Self <: TileLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsWidth(value: String | Double): Self = StObject.set(x, "columnsWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsWidthUndefined: Self = StObject.set(x, "columnsWidth", js.undefined)
    
    @scala.inline
    def setContainers(value: js.Array[TileLayoutContainer]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    @scala.inline
    def setContainersVarargs(value: TileLayoutContainer*): Self = StObject.set(x, "containers", js.Array(value :_*))
    
    @scala.inline
    def setGap(value: TileLayoutGap): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReorder(value: /* e */ TileLayoutReorderEvent => Unit): Self = StObject.set(x, "reorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReorderUndefined: Self = StObject.set(x, "reorder", js.undefined)
    
    @scala.inline
    def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ TileLayoutResizeEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsHeight(value: String | Double): Self = StObject.set(x, "rowsHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsHeightUndefined: Self = StObject.set(x, "rowsHeight", js.undefined)
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
