package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location of the source in a Google Cloud Source Repository.
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
    * Directory, relative to the source root, in which to run the build.  This
    * must be a relative path. If a step&#39;s `dir` is specified and is an
    * absolute path, this value is ignored for that step&#39;s execution.
    */
  var dir: js.UndefOr[String] = js.native
  
  /**
    * ID of the project that owns the Cloud Source Repository. If omitted, the
    * project ID requesting the build is assumed.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Name of the Cloud Source Repository. If omitted, the name
    * &quot;default&quot; is assumed.
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
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
