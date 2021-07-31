package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementGroupsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementGroupsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Placement group collection. */
  var placementGroups: js.UndefOr[js.Array[PlacementGroup]] = js.undefined
}
object PlacementGroupsListResponse {
  
  @scala.inline
  def apply(): PlacementGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroupsListResponse]
  }
  
  @scala.inline
  implicit class PlacementGroupsListResponseMutableBuilder[Self <: PlacementGroupsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPlacementGroups(value: js.Array[PlacementGroup]): Self = StObject.set(x, "placementGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroupsUndefined: Self = StObject.set(x, "placementGroups", js.undefined)
    
    @scala.inline
    def setPlacementGroupsVarargs(value: PlacementGroup*): Self = StObject.set(x, "placementGroups", js.Array(value :_*))
  }
}
