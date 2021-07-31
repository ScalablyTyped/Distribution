package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoId extends StObject {
  
  /** A combination of a project ID and a repo name. */
  var projectRepoId: js.UndefOr[ProjectRepoId] = js.undefined
  
  /** A server-assigned, globally unique identifier. */
  var uid: js.UndefOr[String] = js.undefined
}
object RepoId {
  
  @scala.inline
  def apply(): RepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepoId]
  }
  
  @scala.inline
  implicit class RepoIdMutableBuilder[Self <: RepoId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectRepoId(value: ProjectRepoId): Self = StObject.set(x, "projectRepoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectRepoIdUndefined: Self = StObject.set(x, "projectRepoId", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
