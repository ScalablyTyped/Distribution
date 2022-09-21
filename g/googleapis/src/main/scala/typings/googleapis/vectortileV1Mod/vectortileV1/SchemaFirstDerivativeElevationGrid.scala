package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirstDerivativeElevationGrid extends StObject {
  
  /**
    * A multiplier applied to the altitude fields below to extract the actual altitudes in meters from the elevation grid.
    */
  var altitudeMultiplier: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rows of points containing altitude data making up the elevation grid. Each row is the same length. Rows are ordered from north to south. E.g: rows[0] is the north-most row, and rows[n] is the south-most row.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.undefined
}
object SchemaFirstDerivativeElevationGrid {
  
  inline def apply(): SchemaFirstDerivativeElevationGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirstDerivativeElevationGrid]
  }
  
  extension [Self <: SchemaFirstDerivativeElevationGrid](x: Self) {
    
    inline def setAltitudeMultiplier(value: Double): Self = StObject.set(x, "altitudeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setAltitudeMultiplierNull: Self = StObject.set(x, "altitudeMultiplier", null)
    
    inline def setAltitudeMultiplierUndefined: Self = StObject.set(x, "altitudeMultiplier", js.undefined)
    
    inline def setRows(value: js.Array[SchemaRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
