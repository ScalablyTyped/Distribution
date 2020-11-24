package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepoSource extends js.Object {
  
  /** Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax */
  var branchName: js.UndefOr[String] = js.native
  
  /** Explicit commit SHA to build. */
  var commitSha: js.UndefOr[String] = js.native
  
  /**
    * Directory, relative to the source root, in which to run the build. This must be a relative path. If a step's `dir` is specified and is an absolute path, this value is ignored for
    * that step's execution.
    */
  var dir: js.UndefOr[String] = js.native
  
  /** Only trigger a build if the revision regex does NOT match the revision regex. */
  var invertRegex: js.UndefOr[Boolean] = js.native
  
  /** ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Required. Name of the Cloud Source Repository. */
  var repoName: js.UndefOr[String] = js.native
  
  /** Substitutions to use in a triggered build. Should only be used with RunBuildTrigger */
  var substitutions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.RepoSource with TopLevel[js.Any]
  ] = js.native
  
  /** Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax */
  var tagName: js.UndefOr[String] = js.native
}
object RepoSource {
  
  @scala.inline
  def apply(): RepoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepoSource]
  }
  
  @scala.inline
  implicit class RepoSourceOps[Self <: RepoSource] (val x: Self) extends AnyVal {
    
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
    def setInvertRegex(value: Boolean): Self = this.set("invertRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertRegex: Self = this.set("invertRegex", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setRepoName(value: String): Self = this.set("repoName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepoName: Self = this.set("repoName", js.undefined)
    
    @scala.inline
    def setSubstitutions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.RepoSource with TopLevel[js.Any]
    ): Self = this.set("substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitutions: Self = this.set("substitutions", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
}
