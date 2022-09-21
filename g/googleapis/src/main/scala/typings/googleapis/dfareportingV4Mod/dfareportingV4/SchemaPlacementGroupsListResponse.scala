package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlacementGroupsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementGroupsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Placement group collection.
    */
  var placementGroups: js.UndefOr[js.Array[SchemaPlacementGroup]] = js.undefined
}
object SchemaPlacementGroupsListResponse {
  
  inline def apply(): SchemaPlacementGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementGroupsListResponse]
  }
  
  extension [Self <: SchemaPlacementGroupsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPlacementGroups(value: js.Array[SchemaPlacementGroup]): Self = StObject.set(x, "placementGroups", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupsUndefined: Self = StObject.set(x, "placementGroups", js.undefined)
    
    inline def setPlacementGroupsVarargs(value: SchemaPlacementGroup*): Self = StObject.set(x, "placementGroups", js.Array(value*))
  }
}
