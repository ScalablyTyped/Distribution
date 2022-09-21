package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathFilter extends StObject {
  
  /** Event filters in path report. */
  var eventFilters: js.UndefOr[js.Array[EventFilter]] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#pathFilter. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Determines how the 'value' field is matched when filtering. If not specified, defaults to EXACT. If set to WILDCARD_EXPRESSION, '*' is allowed as a placeholder for variable length
    * character sequences, and it can be escaped with a backslash. Note, only paid search dimensions ('dfa:paidSearch*') allow a matchType other than EXACT.
    */
  var pathMatchPosition: js.UndefOr[String] = js.undefined
}
object PathFilter {
  
  inline def apply(): PathFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathFilter]
  }
  
  extension [Self <: PathFilter](x: Self) {
    
    inline def setEventFilters(value: js.Array[EventFilter]): Self = StObject.set(x, "eventFilters", value.asInstanceOf[js.Any])
    
    inline def setEventFiltersUndefined: Self = StObject.set(x, "eventFilters", js.undefined)
    
    inline def setEventFiltersVarargs(value: EventFilter*): Self = StObject.set(x, "eventFilters", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPathMatchPosition(value: String): Self = StObject.set(x, "pathMatchPosition", value.asInstanceOf[js.Any])
    
    inline def setPathMatchPositionUndefined: Self = StObject.set(x, "pathMatchPosition", js.undefined)
  }
}
