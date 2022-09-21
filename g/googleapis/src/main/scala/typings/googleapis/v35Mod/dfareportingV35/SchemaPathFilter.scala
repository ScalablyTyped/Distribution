package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathFilter extends StObject {
  
  /**
    * Event filters in path report.
    */
  var eventFilters: js.UndefOr[js.Array[SchemaEventFilter]] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#pathFilter.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Determines how the 'value' field is matched when filtering. If not specified, defaults to EXACT. If set to WILDCARD_EXPRESSION, '*' is allowed as a placeholder for variable length character sequences, and it can be escaped with a backslash. Note, only paid search dimensions ('dfa:paidSearch*') allow a matchType other than EXACT.
    */
  var pathMatchPosition: js.UndefOr[String | Null] = js.undefined
}
object SchemaPathFilter {
  
  inline def apply(): SchemaPathFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathFilter]
  }
  
  extension [Self <: SchemaPathFilter](x: Self) {
    
    inline def setEventFilters(value: js.Array[SchemaEventFilter]): Self = StObject.set(x, "eventFilters", value.asInstanceOf[js.Any])
    
    inline def setEventFiltersUndefined: Self = StObject.set(x, "eventFilters", js.undefined)
    
    inline def setEventFiltersVarargs(value: SchemaEventFilter*): Self = StObject.set(x, "eventFilters", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPathMatchPosition(value: String): Self = StObject.set(x, "pathMatchPosition", value.asInstanceOf[js.Any])
    
    inline def setPathMatchPositionNull: Self = StObject.set(x, "pathMatchPosition", null)
    
    inline def setPathMatchPositionUndefined: Self = StObject.set(x, "pathMatchPosition", js.undefined)
  }
}
