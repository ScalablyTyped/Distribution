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
  
  @scala.inline
  def apply(): ListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageVersionsResponse]
  }
  
  @scala.inline
  implicit class ListImageVersionsResponseMutableBuilder[Self <: ListImageVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageVersions(value: js.Array[ImageVersion]): Self = StObject.set(x, "imageVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionsUndefined: Self = StObject.set(x, "imageVersions", js.undefined)
    
    @scala.inline
    def setImageVersionsVarargs(value: ImageVersion*): Self = StObject.set(x, "imageVersions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
