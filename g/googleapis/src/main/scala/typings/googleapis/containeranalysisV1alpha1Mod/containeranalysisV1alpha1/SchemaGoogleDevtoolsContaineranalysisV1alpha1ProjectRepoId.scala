package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId extends StObject {
  
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the repo. Leave empty for the default repo.
    */
  var repoName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId {
  
  inline def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId]
  }
  
  extension [Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRepoName(value: String): Self = StObject.set(x, "repoName", value.asInstanceOf[js.Any])
    
    inline def setRepoNameNull: Self = StObject.set(x, "repoName", null)
    
    inline def setRepoNameUndefined: Self = StObject.set(x, "repoName", js.undefined)
  }
}
