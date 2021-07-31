package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Selects a repo using a Google Cloud Platform project ID (e.g.,
  * winged-cargo-31) and a repo name within that project.
  */
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId extends StObject {
  
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the repo. Leave empty for the default repo.
    */
  var repoName: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdMutableBuilder[Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId] (val x: Self) extends AnyVal {
    
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
