package typings.luminoDatagrid

import typings.luminoDatagrid.typesCellrendererMod.CellRenderer
import typings.luminoDatagrid.typesCellrendererMod.CellRenderer.CellConfig
import typings.luminoDatagrid.typesCellrendererMod.CellRenderer.ConfigFunc
import typings.luminoDatagrid.typesRenderermapMod.RendererMap.Values
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRenderermapMod {
  
  @JSImport("@lumino/datagrid/types/renderermap", "RendererMap")
  @js.native
  /**
    * Construct a new renderer map.
    *
    * @param values - The initial values for the map.
    *
    * @param fallback - The renderer of last resort.
    */
  open class RendererMap () extends StObject {
    def this(values: Values) = this()
    def this(values: Unit, fallback: CellRenderer) = this()
    def this(values: Values, fallback: CellRenderer) = this()
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _fallback: Any = js.native
    
    /* private */ var _values: Any = js.native
    
    /**
      * A signal emitted when the renderer map has changed.
      */
    def changed: ISignal[this.type, Unit] = js.native
    
    /**
      * Get the cell renderer to use for the given cell config.
      *
      * @param config - The cell config of interest.
      *
      * @returns The renderer to use for the cell.
      */
    def get(config: CellConfig): CellRenderer = js.native
    
    /**
      * Update the renderer map with new values
      *
      * @param values - The updated values for the map.
      *
      * @param fallback - The renderer of last resort.
      *
      * #### Notes
      * This method always emits the `changed` signal.
      */
    def update(): Unit = js.native
    def update(values: Unit, fallback: CellRenderer): Unit = js.native
    def update(values: Values): Unit = js.native
    def update(values: Values, fallback: CellRenderer): Unit = js.native
  }
  object RendererMap {
    
    /**
      * A type alias for a cell renderer resolver function.
      */
    type Resolver = ConfigFunc[js.UndefOr[CellRenderer]]
    
    /**
      * A type alias for a `RendererMap` values type.
      */
    /* Inlined {[ R in @lumino/datagrid.@lumino/datagrid/types/datamodel.DataModel.CellRegion ]:? @lumino/datagrid.@lumino/datagrid/types/renderermap.RendererMap.Resolver | @lumino/datagrid.@lumino/datagrid/types/cellrenderer.CellRenderer | undefined} */
    trait Values extends StObject {
      
      var body: js.UndefOr[Resolver | CellRenderer] = js.undefined
      
      var `column-header`: js.UndefOr[Resolver | CellRenderer] = js.undefined
      
      var `corner-header`: js.UndefOr[Resolver | CellRenderer] = js.undefined
      
      var `row-header`: js.UndefOr[Resolver | CellRenderer] = js.undefined
    }
    object Values {
      
      inline def apply(): Values = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Values]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Values] (val x: Self) extends AnyVal {
        
        inline def setBody(value: Resolver | CellRenderer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyFunction1(value: /* config */ CellConfig => js.UndefOr[CellRenderer]): Self = StObject.set(x, "body", js.Any.fromFunction1(value))
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def `setColumn-header`(value: Resolver | CellRenderer): Self = StObject.set(x, "column-header", value.asInstanceOf[js.Any])
        
        inline def `setColumn-headerFunction1`(value: /* config */ CellConfig => js.UndefOr[CellRenderer]): Self = StObject.set(x, "column-header", js.Any.fromFunction1(value))
        
        inline def `setColumn-headerUndefined`: Self = StObject.set(x, "column-header", js.undefined)
        
        inline def `setCorner-header`(value: Resolver | CellRenderer): Self = StObject.set(x, "corner-header", value.asInstanceOf[js.Any])
        
        inline def `setCorner-headerFunction1`(value: /* config */ CellConfig => js.UndefOr[CellRenderer]): Self = StObject.set(x, "corner-header", js.Any.fromFunction1(value))
        
        inline def `setCorner-headerUndefined`: Self = StObject.set(x, "corner-header", js.undefined)
        
        inline def `setRow-header`(value: Resolver | CellRenderer): Self = StObject.set(x, "row-header", value.asInstanceOf[js.Any])
        
        inline def `setRow-headerFunction1`(value: /* config */ CellConfig => js.UndefOr[CellRenderer]): Self = StObject.set(x, "row-header", js.Any.fromFunction1(value))
        
        inline def `setRow-headerUndefined`: Self = StObject.set(x, "row-header", js.undefined)
      }
    }
  }
}
