package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisjunctiveMatchStatement extends StObject {
  
  /** The event filters contained within this disjunctive match statement. */
  var eventFilters: js.UndefOr[js.Array[EventFilter]] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#disjunctiveMatchStatement. */
  var kind: js.UndefOr[String] = js.undefined
}
object DisjunctiveMatchStatement {
  
  inline def apply(): DisjunctiveMatchStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisjunctiveMatchStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisjunctiveMatchStatement] (val x: Self) extends AnyVal {
    
    inline def setEventFilters(value: js.Array[EventFilter]): Self = StObject.set(x, "eventFilters", value.asInstanceOf[js.Any])
    
    inline def setEventFiltersUndefined: Self = StObject.set(x, "eventFilters", js.undefined)
    
    inline def setEventFiltersVarargs(value: EventFilter*): Self = StObject.set(x, "eventFilters", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
