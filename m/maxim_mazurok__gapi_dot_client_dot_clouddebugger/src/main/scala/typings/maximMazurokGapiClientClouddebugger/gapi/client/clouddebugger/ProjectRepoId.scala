package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectRepoId extends StObject {
  
  /** The ID of the project. */
  var projectId: js.UndefOr[String] = js.native
  
  /** The name of the repo. Leave empty for the default repo. */
  var repoName: js.UndefOr[String] = js.native
}
object ProjectRepoId {
  
  @scala.inline
  def apply(): ProjectRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectRepoId]
  }
  
  @scala.inline
  implicit class ProjectRepoIdMutableBuilder[Self <: ProjectRepoId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRepoName(value: String): Self = StObject.set(x, "repoName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoNameUndefined: Self = StObject.set(x, "repoName", js.undefined)
  }
}
