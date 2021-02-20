package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisjunctiveMatchStatement extends StObject {
  
  /** The event filters contained within this disjunctive match statement. */
  var eventFilters: js.UndefOr[js.Array[EventFilter]] = js.native
  
  /** The kind of resource this is, in this case dfareporting#disjunctiveMatchStatement. */
  var kind: js.UndefOr[String] = js.native
}
object DisjunctiveMatchStatement {
  
  @scala.inline
  def apply(): DisjunctiveMatchStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisjunctiveMatchStatement]
  }
  
  @scala.inline
  implicit class DisjunctiveMatchStatementMutableBuilder[Self <: DisjunctiveMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventFilters(value: js.Array[EventFilter]): Self = StObject.set(x, "eventFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFiltersUndefined: Self = StObject.set(x, "eventFilters", js.undefined)
    
    @scala.inline
    def setEventFiltersVarargs(value: EventFilter*): Self = StObject.set(x, "eventFilters", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
