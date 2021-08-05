package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotSchemaColumnAxis extends StObject {
  
  var tuples: js.Array[PivotTupleModel]
}
object PivotSchemaColumnAxis {
  
  inline def apply(tuples: js.Array[PivotTupleModel]): PivotSchemaColumnAxis = {
    val __obj = js.Dynamic.literal(tuples = tuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotSchemaColumnAxis]
  }
  
  extension [Self <: PivotSchemaColumnAxis](x: Self) {
    
    inline def setTuples(value: js.Array[PivotTupleModel]): Self = StObject.set(x, "tuples", value.asInstanceOf[js.Any])
    
    inline def setTuplesVarargs(value: PivotTupleModel*): Self = StObject.set(x, "tuples", js.Array(value :_*))
  }
}
