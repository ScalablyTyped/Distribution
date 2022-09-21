package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricMatrix extends StObject {
  
  /**
    * The rows of the matrix.
    */
  var rows: js.UndefOr[js.Array[SchemaMetricMatrixRow]] = js.undefined
}
object SchemaMetricMatrix {
  
  inline def apply(): SchemaMetricMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricMatrix]
  }
  
  extension [Self <: SchemaMetricMatrix](x: Self) {
    
    inline def setRows(value: js.Array[SchemaMetricMatrixRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaMetricMatrixRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
