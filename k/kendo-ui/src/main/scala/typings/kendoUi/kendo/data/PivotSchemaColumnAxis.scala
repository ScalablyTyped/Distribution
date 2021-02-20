package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotSchemaColumnAxis extends StObject {
  
  var tuples: js.Array[PivotTupleModel] = js.native
}
object PivotSchemaColumnAxis {
  
  @scala.inline
  def apply(tuples: js.Array[PivotTupleModel]): PivotSchemaColumnAxis = {
    val __obj = js.Dynamic.literal(tuples = tuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotSchemaColumnAxis]
  }
  
  @scala.inline
  implicit class PivotSchemaColumnAxisMutableBuilder[Self <: PivotSchemaColumnAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTuples(value: js.Array[PivotTupleModel]): Self = StObject.set(x, "tuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuplesVarargs(value: PivotTupleModel*): Self = StObject.set(x, "tuples", js.Array(value :_*))
  }
}
