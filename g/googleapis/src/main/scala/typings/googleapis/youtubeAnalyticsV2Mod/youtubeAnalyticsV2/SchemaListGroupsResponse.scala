package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for GroupsService.ListGroups.
  */
trait SchemaListGroupsResponse extends StObject {
  
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
  
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * A list of groups that match the API request parameters. Each item in the
    * list represents a `group` resource.
    */
  var items: js.UndefOr[js.Array[SchemaGroup]] = js.undefined
  
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#groupListResponse`.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The token that can be used as the value of the `pageToken` parameter to
    * retrieve the next page in the result set.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListGroupsResponse {
  
  inline def apply(): SchemaListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGroupsResponse]
  }
  
  extension [Self <: SchemaListGroupsResponse](x: Self) {
    
    inline def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaGroup]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGroup*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
