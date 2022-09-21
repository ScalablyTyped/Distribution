package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMosaicLayout extends StObject {
  
  /**
    * The number of columns in the mosaic grid. The number of columns must be between 1 and 12, inclusive.
    */
  var columns: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The tiles to display.
    */
  var tiles: js.UndefOr[js.Array[SchemaTile]] = js.undefined
}
object SchemaMosaicLayout {
  
  inline def apply(): SchemaMosaicLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMosaicLayout]
  }
  
  extension [Self <: SchemaMosaicLayout](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setTiles(value: js.Array[SchemaTile]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    inline def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
    
    inline def setTilesVarargs(value: SchemaTile*): Self = StObject.set(x, "tiles", js.Array(value*))
  }
}
