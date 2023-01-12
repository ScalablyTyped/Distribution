package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDockerImagesResponse extends StObject {
  
  /** The docker images returned. */
  var dockerImages: js.UndefOr[js.Array[DockerImage]] = js.undefined
  
  /** The token to retrieve the next page of artifacts, or empty if there are no more artifacts to return. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDockerImagesResponse {
  
  inline def apply(): ListDockerImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDockerImagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDockerImagesResponse] (val x: Self) extends AnyVal {
    
    inline def setDockerImages(value: js.Array[DockerImage]): Self = StObject.set(x, "dockerImages", value.asInstanceOf[js.Any])
    
    inline def setDockerImagesUndefined: Self = StObject.set(x, "dockerImages", js.undefined)
    
    inline def setDockerImagesVarargs(value: DockerImage*): Self = StObject.set(x, "dockerImages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
