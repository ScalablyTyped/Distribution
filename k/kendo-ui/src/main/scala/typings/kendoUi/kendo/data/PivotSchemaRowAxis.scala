package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotSchemaRowAxis extends StObject {
  
  var tuples: js.Array[PivotTupleModel]
}
object PivotSchemaRowAxis {
  
  inline def apply(tuples: js.Array[PivotTupleModel]): PivotSchemaRowAxis = {
    val __obj = js.Dynamic.literal(tuples = tuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotSchemaRowAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotSchemaRowAxis] (val x: Self) extends AnyVal {
    
    inline def setTuples(value: js.Array[PivotTupleModel]): Self = StObject.set(x, "tuples", value.asInstanceOf[js.Any])
    
    inline def setTuplesVarargs(value: PivotTupleModel*): Self = StObject.set(x, "tuples", js.Array(value*))
  }
}
