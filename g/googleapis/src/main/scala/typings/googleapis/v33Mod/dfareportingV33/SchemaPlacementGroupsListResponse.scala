package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placement Group List Response
  */
trait SchemaPlacementGroupsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Placement group collection.
    */
  var placementGroups: js.UndefOr[js.Array[SchemaPlacementGroup]] = js.undefined
}
object SchemaPlacementGroupsListResponse {
  
  @scala.inline
  def apply(): SchemaPlacementGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementGroupsListResponse]
  }
  
  @scala.inline
  implicit class SchemaPlacementGroupsListResponseMutableBuilder[Self <: SchemaPlacementGroupsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPlacementGroups(value: js.Array[SchemaPlacementGroup]): Self = StObject.set(x, "placementGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroupsUndefined: Self = StObject.set(x, "placementGroups", js.undefined)
    
    @scala.inline
    def setPlacementGroupsVarargs(value: SchemaPlacementGroup*): Self = StObject.set(x, "placementGroups", js.Array(value :_*))
  }
}
