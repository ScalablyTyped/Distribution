package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVersionsResponse extends StObject {
  
  /** The token to retrieve the next page of versions, or empty if there are no more versions to return. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The versions returned. */
  var versions: js.UndefOr[js.Array[Version]] = js.undefined
}
object ListVersionsResponse {
  
  @scala.inline
  def apply(): ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVersionsResponse]
  }
  
  @scala.inline
  implicit class ListVersionsResponseMutableBuilder[Self <: ListVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: Version*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
