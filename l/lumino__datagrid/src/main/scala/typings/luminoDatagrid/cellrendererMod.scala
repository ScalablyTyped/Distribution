package typings.luminoDatagrid

import typings.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typings.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.datamodelMod.DataModel.Metadata
import typings.luminoDatagrid.graphicscontextMod.GraphicsContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellrendererMod {
  
  @JSImport("@lumino/datagrid/lib/cellrenderer", "CellRenderer")
  @js.native
  abstract class CellRenderer () extends StObject {
    
    /**
      * Paint the content for a cell.
      *
      * @param gc - The graphics context to use for drawing.
      *
      * @param config - The configuration data for the cell.
      *
      * #### Notes
      * The grid will save/restore the `gc` state before/after invoking
      * the renderer.
      *
      * For performance, the cell content is efficiently clipped to the
      * width of the column, but *the height is not clipped*. If height
      * clipping is needed, the renderer must set up its own clip rect.
      *
      * The renderer **must not** draw outside the cell bounding height.
      */
    def paint(gc: GraphicsContext, config: CellConfig): Unit = js.native
  }
  object CellRenderer {
    
    @JSImport("@lumino/datagrid/lib/cellrenderer", "CellRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Resolve a config option for a cell renderer.
      *
      * @param option - The config option to resolve.
      *
      * @param config - The cell config object.
      *
      * @returns The resolved value for the option.
      */
    inline def resolveOption[T](option: ConfigOption[T], config: CellConfig): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOption")(option.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * An object which holds the configuration data for a cell.
      */
    trait CellConfig extends StObject {
      
      /**
        * The column index of the cell.
        */
      val column: Double
      
      /**
        * The height of the cell rectangle, in viewport pixels.
        */
      val height: Double
      
      /**
        * The metadata for the cell.
        */
      val metadata: Metadata
      
      /**
        * The region for the cell.
        */
      val region: CellRegion
      
      /**
        * The row index of the cell.
        */
      val row: Double
      
      /**
        * The value for the cell.
        */
      val value: js.Any
      
      /**
        * The width of the cell rectangle, in viewport pixels.
        */
      val width: Double
      
      /**
        * The X position of the cell rectangle, in viewport coordinates.
        */
      val x: Double
      
      /**
        * The Y position of the cell rectangle, in viewport coordinates.
        */
      val y: Double
    }
    object CellConfig {
      
      inline def apply(
        column: Double,
        height: Double,
        metadata: Metadata,
        region: CellRegion,
        row: Double,
        value: js.Any,
        width: Double,
        x: Double,
        y: Double
      ): CellConfig = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[CellConfig]
      }
      
      extension [Self <: CellConfig](x: Self) {
        
        inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: CellRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
        
        inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for a cell renderer config function.
      *
      * This type is used to compute a value from a cell config object.
      */
    type ConfigFunc[T] = js.Function1[/* config */ CellConfig, T]
    
    /**
      * A type alias for a cell renderer config option.
      *
      * A config option can be a static value or a config function.
      */
    type ConfigOption[T] = T | ConfigFunc[T]
  }
}
