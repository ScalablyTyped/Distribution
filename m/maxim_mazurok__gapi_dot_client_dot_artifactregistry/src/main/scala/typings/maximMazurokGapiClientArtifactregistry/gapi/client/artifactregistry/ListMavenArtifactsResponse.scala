package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMavenArtifactsResponse extends StObject {
  
  /** The maven artifacts returned. */
  var mavenArtifacts: js.UndefOr[js.Array[MavenArtifact]] = js.undefined
  
  /** The token to retrieve the next page of artifacts, or empty if there are no more artifacts to return. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListMavenArtifactsResponse {
  
  inline def apply(): ListMavenArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMavenArtifactsResponse]
  }
  
  extension [Self <: ListMavenArtifactsResponse](x: Self) {
    
    inline def setMavenArtifacts(value: js.Array[MavenArtifact]): Self = StObject.set(x, "mavenArtifacts", value.asInstanceOf[js.Any])
    
    inline def setMavenArtifactsUndefined: Self = StObject.set(x, "mavenArtifacts", js.undefined)
    
    inline def setMavenArtifactsVarargs(value: MavenArtifact*): Self = StObject.set(x, "mavenArtifacts", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
