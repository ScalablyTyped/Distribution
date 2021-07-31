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
  
  @scala.inline
  def apply(): SchemaAdvertiserGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserGroupsListResponse]
  }
  
  @scala.inline
  implicit class SchemaAdvertiserGroupsListResponseMutableBuilder[Self <: SchemaAdvertiserGroupsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserGroups(value: js.Array[SchemaAdvertiserGroup]): Self = StObject.set(x, "advertiserGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserGroupsUndefined: Self = StObject.set(x, "advertiserGroups", js.undefined)
    
    @scala.inline
    def setAdvertiserGroupsVarargs(value: SchemaAdvertiserGroup*): Self = StObject.set(x, "advertiserGroups", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
