package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepoSource extends StObject {
  
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
  implicit class RepoSourceMutableBuilder[Self <: RepoSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    @scala.inline
    def setCommitSha(value: String): Self = StObject.set(x, "commitSha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitShaUndefined: Self = StObject.set(x, "commitSha", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setInvertRegex(value: Boolean): Self = StObject.set(x, "invertRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertRegexUndefined: Self = StObject.set(x, "invertRegex", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRepoName(value: String): Self = StObject.set(x, "repoName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoNameUndefined: Self = StObject.set(x, "repoName", js.undefined)
    
    @scala.inline
    def setSubstitutions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.RepoSource with TopLevel[js.Any]
    ): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionsUndefined: Self = StObject.set(x, "substitutions", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
