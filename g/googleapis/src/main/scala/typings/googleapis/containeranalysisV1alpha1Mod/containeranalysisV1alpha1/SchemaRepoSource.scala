package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RepoSource describes the location of the source in a Google Cloud Source
  * Repository.
  */
@js.native
trait SchemaRepoSource extends js.Object {
  
  /**
    * Name of the branch to build.
    */
  var branchName: js.UndefOr[String] = js.native
  
  /**
    * Explicit commit SHA to build.
    */
  var commitSha: js.UndefOr[String] = js.native
  
  /**
    * ID of the project that owns the repo.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Name of the repo.
    */
  var repoName: js.UndefOr[String] = js.native
  
  /**
    * Name of the tag to build.
    */
  var tagName: js.UndefOr[String] = js.native
}
object SchemaRepoSource {
  
  @scala.inline
  def apply(): SchemaRepoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepoSource]
  }
  
  @scala.inline
  implicit class SchemaRepoSourceOps[Self <: SchemaRepoSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBranchName(value: String): Self = this.set("branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchName: Self = this.set("branchName", js.undefined)
    
    @scala.inline
    def setCommitSha(value: String): Self = this.set("commitSha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitSha: Self = this.set("commitSha", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setRepoName(value: String): Self = this.set("repoName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepoName: Self = this.set("repoName", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
}
