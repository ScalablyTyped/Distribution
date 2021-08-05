package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRichMediaEvents extends StObject {
  
  /** List of custom rich media event IDs. Dimension values must be all of type dfa:richMediaEventTypeIdAndName. */
  var filteredEventIds: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#customRichMediaEvents. */
  var kind: js.UndefOr[String] = js.undefined
}
object CustomRichMediaEvents {
  
  inline def apply(): CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRichMediaEvents]
  }
  
  extension [Self <: CustomRichMediaEvents](x: Self) {
    
    inline def setFilteredEventIds(value: js.Array[DimensionValue]): Self = StObject.set(x, "filteredEventIds", value.asInstanceOf[js.Any])
    
    inline def setFilteredEventIdsUndefined: Self = StObject.set(x, "filteredEventIds", js.undefined)
    
    inline def setFilteredEventIdsVarargs(value: DimensionValue*): Self = StObject.set(x, "filteredEventIds", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
