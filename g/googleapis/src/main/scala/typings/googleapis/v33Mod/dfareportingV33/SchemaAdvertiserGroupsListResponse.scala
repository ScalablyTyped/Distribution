package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiserGroupsListResponse extends StObject {
  
  /**
    * Advertiser group collection.
    */
  var advertiserGroups: js.UndefOr[js.Array[SchemaAdvertiserGroup]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertiserGroupsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdvertiserGroupsListResponse {
  
  inline def apply(): SchemaAdvertiserGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserGroupsListResponse]
  }
  
  extension [Self <: SchemaAdvertiserGroupsListResponse](x: Self) {
    
    inline def setAdvertiserGroups(value: js.Array[SchemaAdvertiserGroup]): Self = StObject.set(x, "advertiserGroups", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserGroupsUndefined: Self = StObject.set(x, "advertiserGroups", js.undefined)
    
    inline def setAdvertiserGroupsVarargs(value: SchemaAdvertiserGroup*): Self = StObject.set(x, "advertiserGroups", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
