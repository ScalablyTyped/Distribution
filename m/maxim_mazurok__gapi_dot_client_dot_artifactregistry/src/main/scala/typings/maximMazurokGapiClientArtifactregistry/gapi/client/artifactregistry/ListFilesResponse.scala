package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFilesResponse extends StObject {
  
  /** The files returned. */
  var files: js.UndefOr[js.Array[GoogleDevtoolsArtifactregistryV1File]] = js.undefined
  
  /** The token to retrieve the next page of files, or empty if there are no more files to return. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListFilesResponse {
  
  inline def apply(): ListFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFilesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFilesResponse] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: js.Array[GoogleDevtoolsArtifactregistryV1File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: GoogleDevtoolsArtifactregistryV1File*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
