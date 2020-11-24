package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotSchemaColumnAxis extends js.Object {
  
  var tuples: js.Array[PivotTupleModel] = js.native
}
object PivotSchemaColumnAxis {
  
  @scala.inline
  def apply(tuples: js.Array[PivotTupleModel]): PivotSchemaColumnAxis = {
    val __obj = js.Dynamic.literal(tuples = tuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotSchemaColumnAxis]
  }
  
  @scala.inline
  implicit class PivotSchemaColumnAxisOps[Self <: PivotSchemaColumnAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTuplesVarargs(value: PivotTupleModel*): Self = this.set("tuples", js.Array(value :_*))
    
    @scala.inline
    def setTuples(value: js.Array[PivotTupleModel]): Self = this.set("tuples", value.asInstanceOf[js.Any])
  }
}
