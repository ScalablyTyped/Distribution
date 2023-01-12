package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWorkspaceId extends StObject {
  
  /** The unique name of the workspace within the repo. This is the name chosen by the client in the Source API's CreateWorkspace method. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The ID of the repo containing the workspace. */
  var repoId: js.UndefOr[RepoId] = js.undefined
}
object CloudWorkspaceId {
  
  inline def apply(): CloudWorkspaceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWorkspaceId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWorkspaceId] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRepoId(value: RepoId): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    inline def setRepoIdUndefined: Self = StObject.set(x, "repoId", js.undefined)
  }
}
