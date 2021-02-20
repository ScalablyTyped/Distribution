package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFilesResponse extends StObject {
  
  /** The files returned. */
  var files: js.UndefOr[js.Array[File]] = js.native
  
  /** The token to retrieve the next page of files, or empty if there are no more files to return. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListFilesResponse {
  
  @scala.inline
  def apply(): ListFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFilesResponse]
  }
  
  @scala.inline
  implicit class ListFilesResponseMutableBuilder[Self <: ListFilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
