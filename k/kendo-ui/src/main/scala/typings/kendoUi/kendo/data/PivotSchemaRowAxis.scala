package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotSchemaRowAxis extends StObject {
  
  var tuples: js.Array[PivotTupleModel]
}
object PivotSchemaRowAxis {
  
  @scala.inline
  def apply(tuples: js.Array[PivotTupleModel]): PivotSchemaRowAxis = {
    val __obj = js.Dynamic.literal(tuples = tuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotSchemaRowAxis]
  }
  
  @scala.inline
  implicit class PivotSchemaRowAxisMutableBuilder[Self <: PivotSchemaRowAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTuples(value: js.Array[PivotTupleModel]): Self = StObject.set(x, "tuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuplesVarargs(value: PivotTupleModel*): Self = StObject.set(x, "tuples", js.Array(value :_*))
  }
}
