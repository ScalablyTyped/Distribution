package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricMatrixRow extends StObject {
  
  /**
    * The columns of the row.
    */
  var cols: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaMetricMatrixRow {
  
  inline def apply(): SchemaMetricMatrixRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricMatrixRow]
  }
  
  extension [Self <: SchemaMetricMatrixRow](x: Self) {
    
    inline def setCols(value: js.Array[Double]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsNull: Self = StObject.set(x, "cols", null)
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setColsVarargs(value: Double*): Self = StObject.set(x, "cols", js.Array(value*))
  }
}
