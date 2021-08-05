package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advertiser Group List Response
  */
trait SchemaAdvertiserGroupsListResponse extends StObject {
  
  /**
    * Advertiser group collection.
    */
  var advertiserGroups: js.UndefOr[js.Array[SchemaAdvertiserGroup]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiserGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaAdvertiserGroupsListResponse {
  
  inline def apply(): SchemaAdvertiserGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserGroupsListResponse]
  }
  
  extension [Self <: SchemaAdvertiserGroupsListResponse](x: Self) {
    
    inline def setAdvertiserGroups(value: js.Array[SchemaAdvertiserGroup]): Self = StObject.set(x, "advertiserGroups", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserGroupsUndefined: Self = StObject.set(x, "advertiserGroups", js.undefined)
    
    inline def setAdvertiserGroupsVarargs(value: SchemaAdvertiserGroup*): Self = StObject.set(x, "advertiserGroups", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
