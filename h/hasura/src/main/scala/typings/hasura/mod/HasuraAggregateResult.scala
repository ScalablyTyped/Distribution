package typings.hasura.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasuraAggregateResult[T /* <: Record[String, _] */] extends js.Object {
  
  var aggregate: js.UndefOr[AggregateResult[T]] = js.native
  
  var nodes: js.UndefOr[js.Array[HasuraDataItem[T]]] = js.native
}
object HasuraAggregateResult {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](): HasuraAggregateResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasuraAggregateResult[T]]
  }
  
  @scala.inline
  implicit class HasuraAggregateResultOps[Self <: HasuraAggregateResult[_], T /* <: Record[String, _] */] (val x: Self with HasuraAggregateResult[T]) extends AnyVal {
    
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
    def setAggregate(value: AggregateResult[T]): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: HasuraDataItem[T]*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[HasuraDataItem[T]]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
  }
}
