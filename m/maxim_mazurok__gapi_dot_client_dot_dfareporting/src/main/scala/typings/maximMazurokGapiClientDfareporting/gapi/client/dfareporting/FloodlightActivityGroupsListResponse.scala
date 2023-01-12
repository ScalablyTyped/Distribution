package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloodlightActivityGroupsListResponse extends StObject {
  
  /** Floodlight activity group collection. */
  var floodlightActivityGroups: js.UndefOr[js.Array[FloodlightActivityGroup]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivityGroupsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object FloodlightActivityGroupsListResponse {
  
  inline def apply(): FloodlightActivityGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityGroupsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FloodlightActivityGroupsListResponse] (val x: Self) extends AnyVal {
    
    inline def setFloodlightActivityGroups(value: js.Array[FloodlightActivityGroup]): Self = StObject.set(x, "floodlightActivityGroups", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityGroupsUndefined: Self = StObject.set(x, "floodlightActivityGroups", js.undefined)
    
    inline def setFloodlightActivityGroupsVarargs(value: FloodlightActivityGroup*): Self = StObject.set(x, "floodlightActivityGroups", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
