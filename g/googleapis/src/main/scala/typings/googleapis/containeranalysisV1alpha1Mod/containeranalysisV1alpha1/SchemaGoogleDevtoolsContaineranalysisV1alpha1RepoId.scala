package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A unique identifier for a Cloud Repo.
  */
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId extends StObject {
  
  /**
    * A combination of a project ID and a repo name.
    */
  var projectRepoId: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId] = js.undefined
  
  /**
    * A server-assigned, globally unique identifier.
    */
  var uid: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId {
  
  inline def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId]
  }
  
  extension [Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId](x: Self) {
    
    inline def setProjectRepoId(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId): Self = StObject.set(x, "projectRepoId", value.asInstanceOf[js.Any])
    
    inline def setProjectRepoIdUndefined: Self = StObject.set(x, "projectRepoId", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
