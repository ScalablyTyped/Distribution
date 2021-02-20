package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Placement collection. */
  var placements: js.UndefOr[js.Array[Placement]] = js.native
}
object PlacementsListResponse {
  
  @scala.inline
  def apply(): PlacementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementsListResponse]
  }
  
  @scala.inline
  implicit class PlacementsListResponseMutableBuilder[Self <: PlacementsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPlacements(value: js.Array[Placement]): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementsUndefined: Self = StObject.set(x, "placements", js.undefined)
    
    @scala.inline
    def setPlacementsVarargs(value: Placement*): Self = StObject.set(x, "placements", js.Array(value :_*))
  }
}
