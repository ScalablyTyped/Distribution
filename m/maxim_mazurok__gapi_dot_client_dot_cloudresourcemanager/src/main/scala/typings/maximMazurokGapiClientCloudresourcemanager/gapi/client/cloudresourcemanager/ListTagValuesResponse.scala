package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagValuesResponse extends StObject {
  
  /**
    * A pagination token returned from a previous call to `ListTagValues` that indicates from where listing should continue. This is currently not used, but the server may at any point
    * start supplying a valid token.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A possibly paginated list of TagValues that are direct descendants of the specified parent TagKey. */
  var tagValues: js.UndefOr[js.Array[TagValue]] = js.undefined
}
object ListTagValuesResponse {
  
  inline def apply(): ListTagValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagValuesResponse]
  }
  
  extension [Self <: ListTagValuesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTagValues(value: js.Array[TagValue]): Self = StObject.set(x, "tagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesUndefined: Self = StObject.set(x, "tagValues", js.undefined)
    
    inline def setTagValuesVarargs(value: TagValue*): Self = StObject.set(x, "tagValues", js.Array(value*))
  }
}
