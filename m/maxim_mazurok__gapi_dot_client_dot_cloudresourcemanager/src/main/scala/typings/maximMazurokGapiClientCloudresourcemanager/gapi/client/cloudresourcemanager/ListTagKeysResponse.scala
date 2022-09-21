package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagKeysResponse extends StObject {
  
  /** A pagination token returned from a previous call to `ListTagKeys` that indicates from where listing should continue. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of TagKeys that live under the specified parent in the request. */
  var tagKeys: js.UndefOr[js.Array[TagKey]] = js.undefined
}
object ListTagKeysResponse {
  
  inline def apply(): ListTagKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagKeysResponse]
  }
  
  extension [Self <: ListTagKeysResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTagKeys(value: js.Array[TagKey]): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysUndefined: Self = StObject.set(x, "tagKeys", js.undefined)
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "tagKeys", js.Array(value*))
  }
}
