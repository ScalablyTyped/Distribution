package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFoldersResponse extends StObject {
  
  /** A possibly paginated folder search results. the specified parent resource. */
  var folders: js.UndefOr[js.Array[Folder]] = js.undefined
  
  /** A pagination token returned from a previous call to `SearchFolders` that indicates from where searching should continue. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SearchFoldersResponse {
  
  inline def apply(): SearchFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFoldersResponse]
  }
  
  extension [Self <: SearchFoldersResponse](x: Self) {
    
    inline def setFolders(value: js.Array[Folder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: Folder*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
