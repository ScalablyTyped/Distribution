package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Placement collection. */
  var placements: js.UndefOr[js.Array[Placement]] = js.undefined
}
object PlacementsListResponse {
  
  inline def apply(): PlacementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementsListResponse]
  }
  
  extension [Self <: PlacementsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPlacements(value: js.Array[Placement]): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
    
    inline def setPlacementsUndefined: Self = StObject.set(x, "placements", js.undefined)
    
    inline def setPlacementsVarargs(value: Placement*): Self = StObject.set(x, "placements", js.Array(value*))
  }
}
