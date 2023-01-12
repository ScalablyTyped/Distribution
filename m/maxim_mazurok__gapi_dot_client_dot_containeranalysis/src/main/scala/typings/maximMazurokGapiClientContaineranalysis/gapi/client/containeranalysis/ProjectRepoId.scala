package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectRepoId extends StObject {
  
  /** The ID of the project. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** The name of the repo. Leave empty for the default repo. */
  var repoName: js.UndefOr[String] = js.undefined
}
object ProjectRepoId {
  
  inline def apply(): ProjectRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectRepoId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectRepoId] (val x: Self) extends AnyVal {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRepoName(value: String): Self = StObject.set(x, "repoName", value.asInstanceOf[js.Any])
    
    inline def setRepoNameUndefined: Self = StObject.set(x, "repoName", js.undefined)
  }
}
