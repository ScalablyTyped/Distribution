package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Selects a repo using a Google Cloud Platform project ID (e.g.,
  * winged-cargo-31) and a repo name within that project.
  */
trait SchemaProjectRepoId extends StObject {
  
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the repo. Leave empty for the default repo.
    */
  var repoName: js.UndefOr[String] = js.undefined
}
object SchemaProjectRepoId {
  
  inline def apply(): SchemaProjectRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectRepoId]
  }
  
  extension [Self <: SchemaProjectRepoId](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRepoName(value: String): Self = StObject.set(x, "repoName", value.asInstanceOf[js.Any])
    
    inline def setRepoNameUndefined: Self = StObject.set(x, "repoName", js.undefined)
  }
}
