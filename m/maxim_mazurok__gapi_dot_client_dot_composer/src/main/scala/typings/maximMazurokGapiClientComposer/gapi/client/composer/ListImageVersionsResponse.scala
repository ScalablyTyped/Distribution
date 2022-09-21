package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImageVersionsResponse extends StObject {
  
  /** The list of supported ImageVersions in a location. */
  var imageVersions: js.UndefOr[js.Array[ImageVersion]] = js.undefined
  
  /** The page token used to query for the next page if one exists. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListImageVersionsResponse {
  
  inline def apply(): ListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageVersionsResponse]
  }
  
  extension [Self <: ListImageVersionsResponse](x: Self) {
    
    inline def setImageVersions(value: js.Array[ImageVersion]): Self = StObject.set(x, "imageVersions", value.asInstanceOf[js.Any])
    
    inline def setImageVersionsUndefined: Self = StObject.set(x, "imageVersions", js.undefined)
    
    inline def setImageVersionsVarargs(value: ImageVersion*): Self = StObject.set(x, "imageVersions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
