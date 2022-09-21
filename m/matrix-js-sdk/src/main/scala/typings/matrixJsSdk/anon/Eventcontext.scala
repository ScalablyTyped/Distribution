package typings.matrixJsSdk.anon

import typings.matrixJsSdk.mod.IncludeEventContext
import typings.matrixJsSdk.mod.SearchKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eventcontext extends StObject {
  
  var event_context: js.UndefOr[IncludeEventContext] = js.undefined
  
  var filter: js.UndefOr[Any] = js.undefined
  
  var groupings: js.UndefOr[Any] = js.undefined
  
  var include_state: js.UndefOr[Boolean] = js.undefined
  
  var keys: js.UndefOr[js.Array[SearchKey]] = js.undefined
  
  var order_by: js.UndefOr[Any] = js.undefined
  
  var search_term: String
}
object Eventcontext {
  
  inline def apply(search_term: String): Eventcontext = {
    val __obj = js.Dynamic.literal(search_term = search_term.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventcontext]
  }
  
  extension [Self <: Eventcontext](x: Self) {
    
    inline def setEvent_context(value: IncludeEventContext): Self = StObject.set(x, "event_context", value.asInstanceOf[js.Any])
    
    inline def setEvent_contextUndefined: Self = StObject.set(x, "event_context", js.undefined)
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGroupings(value: Any): Self = StObject.set(x, "groupings", value.asInstanceOf[js.Any])
    
    inline def setGroupingsUndefined: Self = StObject.set(x, "groupings", js.undefined)
    
    inline def setInclude_state(value: Boolean): Self = StObject.set(x, "include_state", value.asInstanceOf[js.Any])
    
    inline def setInclude_stateUndefined: Self = StObject.set(x, "include_state", js.undefined)
    
    inline def setKeys(value: js.Array[SearchKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SearchKey*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setOrder_by(value: Any): Self = StObject.set(x, "order_by", value.asInstanceOf[js.Any])
    
    inline def setOrder_byUndefined: Self = StObject.set(x, "order_by", js.undefined)
    
    inline def setSearch_term(value: String): Self = StObject.set(x, "search_term", value.asInstanceOf[js.Any])
  }
}
