package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RepoSource describes the location of the source in a Google Cloud Source
  * Repository.
  */
trait SchemaRepoSource extends StObject {
  
  /**
    * Name of the branch to build.
    */
  var branchName: js.UndefOr[String] = js.undefined
  
  /**
    * Explicit commit SHA to build.
    */
  var commitSha: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the project that owns the repo.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the repo.
    */
  var repoName: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the tag to build.
    */
  var tagName: js.UndefOr[String] = js.undefined
}
object SchemaRepoSource {
  
  inline def apply(): SchemaRepoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepoSource]
  }
  
  extension [Self <: SchemaRepoSource](x: Self) {
    
    inline def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    inline def setCommitSha(value: String): Self = StObject.set(x, "commitSha", value.asInstanceOf[js.Any])
    
    inline def setCommitShaUndefined: Self = StObject.set(x, "commitSha", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRepoName(value: String): Self = StObject.set(x, "repoName", value.asInstanceOf[js.Any])
    
    inline def setRepoNameUndefined: Self = StObject.set(x, "repoName", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
