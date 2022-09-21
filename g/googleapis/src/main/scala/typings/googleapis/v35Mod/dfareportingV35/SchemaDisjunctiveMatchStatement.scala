package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisjunctiveMatchStatement extends StObject {
  
  /**
    * The event filters contained within this disjunctive match statement.
    */
  var eventFilters: js.UndefOr[js.Array[SchemaEventFilter]] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#disjunctiveMatchStatement.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDisjunctiveMatchStatement {
  
  inline def apply(): SchemaDisjunctiveMatchStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisjunctiveMatchStatement]
  }
  
  extension [Self <: SchemaDisjunctiveMatchStatement](x: Self) {
    
    inline def setEventFilters(value: js.Array[SchemaEventFilter]): Self = StObject.set(x, "eventFilters", value.asInstanceOf[js.Any])
    
    inline def setEventFiltersUndefined: Self = StObject.set(x, "eventFilters", js.undefined)
    
    inline def setEventFiltersVarargs(value: SchemaEventFilter*): Self = StObject.set(x, "eventFilters", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
