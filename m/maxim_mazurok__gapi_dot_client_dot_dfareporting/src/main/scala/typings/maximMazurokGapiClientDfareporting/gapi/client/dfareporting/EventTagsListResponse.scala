package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTagsListResponse extends StObject {
  
  /** Event tag collection. */
  var eventTags: js.UndefOr[js.Array[EventTag]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTagsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object EventTagsListResponse {
  
  inline def apply(): EventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTagsListResponse]
  }
  
  extension [Self <: EventTagsListResponse](x: Self) {
    
    inline def setEventTags(value: js.Array[EventTag]): Self = StObject.set(x, "eventTags", value.asInstanceOf[js.Any])
    
    inline def setEventTagsUndefined: Self = StObject.set(x, "eventTags", js.undefined)
    
    inline def setEventTagsVarargs(value: EventTag*): Self = StObject.set(x, "eventTags", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
