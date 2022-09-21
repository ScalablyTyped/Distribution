package typings.hasura.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasuraAggregateResult[T /* <: Record[String, Any] */] extends StObject {
  
  var aggregate: js.UndefOr[AggregateResult[T]] = js.undefined
  
  var nodes: js.UndefOr[js.Array[HasuraDataItem[T]]] = js.undefined
}
object HasuraAggregateResult {
  
  inline def apply[T /* <: Record[String, Any] */](): HasuraAggregateResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasuraAggregateResult[T]]
  }
  
  extension [Self <: HasuraAggregateResult[?], T /* <: Record[String, Any] */](x: Self & HasuraAggregateResult[T]) {
    
    inline def setAggregate(value: AggregateResult[T]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setNodes(value: js.Array[HasuraDataItem[T]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: HasuraDataItem[T]*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
