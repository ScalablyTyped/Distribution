package typings.luminoDatagrid

import typings.luminoDatagrid.luminoDatagridStrings.`column-resize`
import typings.luminoDatagrid.luminoDatagridStrings.`row-resize`
import typings.luminoDatagrid.luminoDatagridStrings.select
import typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.PressData
import typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.SelectData
import typings.luminoDatagrid.typesCellrendererMod.CellRenderer.CellConfig
import typings.luminoDatagrid.typesDatagridMod.DataGrid
import typings.luminoDatagrid.typesDatagridMod.DataGrid.HitTestResult
import typings.luminoDatagrid.typesDatagridMod.DataGrid.IMouseHandler
import typings.luminoDatagrid.typesDatamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.typesDatamodelMod.DataModel.ColumnRegion
import typings.luminoDatagrid.typesDatamodelMod.DataModel.RowRegion
import typings.luminoDisposable.mod.IDisposable
import typings.std.MouseEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBasicmousehandlerMod {
  
  @JSImport("@lumino/datagrid/types/basicmousehandler", "BasicMouseHandler")
  @js.native
  open class BasicMouseHandler ()
    extends StObject
       with IMouseHandler {
    
    /* private */ var _disposed: Any = js.native
    
    /* protected */ var _pressData: PressData | Null = js.native
    
    /**
      * Convert a resize handle into a cursor.
      */
    def cursorForHandle(handle: ResizeHandle): String = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * Handle the context menu event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The context menu event of interest.
      */
    /* CompleteClass */
    override def onContextMenu(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse double click event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse double click event of interest.
      */
    /* CompleteClass */
    override def onMouseDoubleClick(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse down event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse down event of interest.
      */
    /* CompleteClass */
    override def onMouseDown(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse hover event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse hover event of interest.
      */
    /* CompleteClass */
    override def onMouseHover(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse leave event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse hover event of interest.
      */
    /* CompleteClass */
    override def onMouseLeave(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse move event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse move event of interest.
      */
    /* CompleteClass */
    override def onMouseMove(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse up event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse up event of interest.
      */
    /* CompleteClass */
    override def onMouseUp(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the wheel event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The wheel event of interest.
      */
    /* CompleteClass */
    override def onWheel(grid: DataGrid, event: WheelEvent): Unit = js.native
    
    /**
      * Get the current pressData
      */
    val pressData: PressData | Null = js.native
    
    /**
      * Release any resources acquired during a mouse press.
      *
      * #### Notes
      * This method is called when the mouse should be released
      * independent of a mouseup event, such as an early detach.
      */
    /* CompleteClass */
    override def release(): Unit = js.native
  }
  
  object Private {
    
    @JSImport("@lumino/datagrid/types/basicmousehandler", "Private")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A timer callback for the autoselect loop.
      *
      * @param grid - The datagrid of interest.
      *
      * @param data - The select data of interest.
      */
    inline def autoselect(grid: DataGrid, data: SelectData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoselect")(grid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Compute the scroll timeout for the given delta distance.
      *
      * @param delta - The delta pixels from the origin.
      *
      * @returns The scaled timeout in milliseconds.
      */
    inline def computeTimeout(delta: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTimeout")(delta.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Creates a CellConfig object from a hit region.
      */
    inline def createCellConfigObject(grid: DataGrid, hit: HitTestResult): js.UndefOr[CellConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCellConfigObject")(grid.asInstanceOf[js.Any], hit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CellConfig]]
    
    /**
      * A mapping of resize handle to cursor.
      */
    object cursorMap {
      
      @JSImport("@lumino/datagrid/types/basicmousehandler", "Private.cursorMap")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@lumino/datagrid/types/basicmousehandler", "Private.cursorMap.bottom")
      @js.native
      def bottom: String = js.native
      inline def bottom_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
      
      @JSImport("@lumino/datagrid/types/basicmousehandler", "Private.cursorMap.hyperlink")
      @js.native
      def hyperlink: String = js.native
      inline def hyperlink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(x.asInstanceOf[js.Any])
      
      @JSImport("@lumino/datagrid/types/basicmousehandler", "Private.cursorMap.left")
      @js.native
      def left: String = js.native
      inline def left_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
      
      @JSImport("@lumino/datagrid/types/basicmousehandler", "Private.cursorMap.none")
      @js.native
      def none: String = js.native
      inline def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
      
      @JSImport("@lumino/datagrid/types/basicmousehandler", "Private.cursorMap.right")
      @js.native
      def right: String = js.native
      inline def right_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
      
      @JSImport("@lumino/datagrid/types/basicmousehandler", "Private.cursorMap.top")
      @js.native
      def top: String = js.native
      inline def top_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Get the resize handle for a grid hit test.
      */
    inline def resizeHandleForHitTest(hit: HitTestResult): ResizeHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeHandleForHitTest")(hit.asInstanceOf[js.Any]).asInstanceOf[ResizeHandle]
  }
  
  object PressData {
    
    /**
      * A type alias for the column resize data.
      */
    trait ColumnResizeData
      extends StObject
         with typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.PressData {
      
      /**
        * The original client X position of the mouse.
        */
      val clientX: Double
      
      /**
        * The index of the section being resized.
        */
      val index: Double
      
      /**
        * The disposable to clear the cursor override.
        */
      val `override`: IDisposable
      
      /**
        * The column region which holds the section being resized.
        */
      val region: ColumnRegion
      
      /**
        * The original size of the section.
        */
      val size: Double
      
      /**
        * The descriminated type for the data.
        */
      val `type`: `column-resize`
    }
    object ColumnResizeData {
      
      inline def apply(clientX: Double, index: Double, `override`: IDisposable, region: ColumnRegion, size: Double): ColumnResizeData = {
        val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
        __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("column-resize")
        __obj.asInstanceOf[ColumnResizeData]
      }
      
      extension [Self <: ColumnResizeData](x: Self) {
        
        inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setOverride(value: IDisposable): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: ColumnRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setType(value: `column-resize`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the resize handler press data.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.RowResizeData
      - typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.ColumnResizeData
      - typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.SelectData
    */
    trait PressData extends StObject
    object PressData {
      
      inline def ColumnResizeData(clientX: Double, index: Double, `override`: IDisposable, region: ColumnRegion, size: Double): typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.ColumnResizeData = {
        val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
        __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("column-resize")
        __obj.asInstanceOf[typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.ColumnResizeData]
      }
      
      inline def RowResizeData(clientY: Double, index: Double, `override`: IDisposable, region: RowRegion, size: Double): typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.RowResizeData = {
        val __obj = js.Dynamic.literal(clientY = clientY.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
        __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("row-resize")
        __obj.asInstanceOf[typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.RowResizeData]
      }
      
      inline def SelectData(
        column: Double,
        localX: Double,
        localY: Double,
        `override`: IDisposable,
        region: CellRegion,
        row: Double,
        timeout: Double
      ): typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.SelectData = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], localX = localX.asInstanceOf[js.Any], localY = localY.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
        __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("select")
        __obj.asInstanceOf[typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.SelectData]
      }
    }
    
    /**
      * A type alias for the row resize data.
      */
    trait RowResizeData
      extends StObject
         with typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.PressData {
      
      /**
        * The original client Y position of the mouse.
        */
      val clientY: Double
      
      /**
        * The index of the section being resized.
        */
      val index: Double
      
      /**
        * The disposable to clear the cursor override.
        */
      val `override`: IDisposable
      
      /**
        * The row region which holds the section being resized.
        */
      val region: RowRegion
      
      /**
        * The original size of the section.
        */
      val size: Double
      
      /**
        * The descriminated type for the data.
        */
      val `type`: `row-resize`
    }
    object RowResizeData {
      
      inline def apply(clientY: Double, index: Double, `override`: IDisposable, region: RowRegion, size: Double): RowResizeData = {
        val __obj = js.Dynamic.literal(clientY = clientY.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
        __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("row-resize")
        __obj.asInstanceOf[RowResizeData]
      }
      
      extension [Self <: RowResizeData](x: Self) {
        
        inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setOverride(value: IDisposable): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: RowRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setType(value: `row-resize`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the select data.
      */
    trait SelectData
      extends StObject
         with typings.luminoDatagrid.typesBasicmousehandlerMod.PressData.PressData {
      
      /**
        * The original column that was selected.
        */
      val column: Double
      
      /**
        * The current local X position of the mouse.
        */
      var localX: Double
      
      /**
        * The current local Y position of the mouse.
        */
      var localY: Double
      
      /**
        * The disposable to clear the cursor override.
        */
      val `override`: IDisposable
      
      /**
        * The original region for the mouse press.
        */
      val region: CellRegion
      
      /**
        * The original row that was selected.
        */
      val row: Double
      
      /**
        * The timeout delay for the autoselect loop.
        */
      var timeout: Double
      
      /**
        * The descriminated type for the data.
        */
      val `type`: select
    }
    object SelectData {
      
      inline def apply(
        column: Double,
        localX: Double,
        localY: Double,
        `override`: IDisposable,
        region: CellRegion,
        row: Double,
        timeout: Double
      ): SelectData = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], localX = localX.asInstanceOf[js.Any], localY = localY.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
        __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("select")
        __obj.asInstanceOf[SelectData]
      }
      
      extension [Self <: SelectData](x: Self) {
        
        inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setLocalX(value: Double): Self = StObject.set(x, "localX", value.asInstanceOf[js.Any])
        
        inline def setLocalY(value: Double): Self = StObject.set(x, "localY", value.asInstanceOf[js.Any])
        
        inline def setOverride(value: IDisposable): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: CellRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setType(value: select): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luminoDatagrid.luminoDatagridStrings.top
    - typings.luminoDatagrid.luminoDatagridStrings.left
    - typings.luminoDatagrid.luminoDatagridStrings.right
    - typings.luminoDatagrid.luminoDatagridStrings.bottom
    - typings.luminoDatagrid.luminoDatagridStrings.none
    - typings.luminoDatagrid.luminoDatagridStrings.hyperlink
  */
  trait ResizeHandle extends StObject
  object ResizeHandle {
    
    inline def bottom: typings.luminoDatagrid.luminoDatagridStrings.bottom = "bottom".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.bottom]
    
    inline def hyperlink: typings.luminoDatagrid.luminoDatagridStrings.hyperlink = "hyperlink".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.hyperlink]
    
    inline def left: typings.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.left]
    
    inline def none: typings.luminoDatagrid.luminoDatagridStrings.none = "none".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.none]
    
    inline def right: typings.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.right]
    
    inline def top: typings.luminoDatagrid.luminoDatagridStrings.top = "top".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.top]
  }
}
