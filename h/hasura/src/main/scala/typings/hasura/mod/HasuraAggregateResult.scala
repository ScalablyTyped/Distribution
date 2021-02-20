package typings.hasura.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasuraAggregateResult[T /* <: Record[String, _] */] extends StObject {
  
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
  implicit class HasuraAggregateResultMutableBuilder[Self <: HasuraAggregateResult[_], T /* <: Record[String, _] */] (val x: Self with HasuraAggregateResult[T]) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: AggregateResult[T]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setNodes(value: js.Array[HasuraDataItem[T]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: HasuraDataItem[T]*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
