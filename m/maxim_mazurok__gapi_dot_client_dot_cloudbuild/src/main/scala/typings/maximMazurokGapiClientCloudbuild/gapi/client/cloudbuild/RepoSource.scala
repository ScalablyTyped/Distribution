package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoSource extends StObject {
  
  /** Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax */
  var branchName: js.UndefOr[String] = js.undefined
  
  /** Explicit commit SHA to build. */
  var commitSha: js.UndefOr[String] = js.undefined
  
  /**
    * Directory, relative to the source root, in which to run the build. This must be a relative path. If a step's `dir` is specified and is an absolute path, this value is ignored for
    * that step's execution.
    */
  var dir: js.UndefOr[String] = js.undefined
  
  /** Only trigger a build if the revision regex does NOT match the revision regex. */
  var invertRegex: js.UndefOr[Boolean] = js.undefined
  
  /** ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Name of the Cloud Source Repository. */
  var repoName: js.UndefOr[String] = js.undefined
  
  /** Substitutions to use in a triggered build. Should only be used with RunBuildTrigger */
  var substitutions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax */
  var tagName: js.UndefOr[String] = js.undefined
}
object RepoSource {
  
  inline def apply(): RepoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepoSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepoSource] (val x: Self) extends AnyVal {
    
    inline def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    inline def setCommitSha(value: String): Self = StObject.set(x, "commitSha", value.asInstanceOf[js.Any])
    
    inline def setCommitShaUndefined: Self = StObject.set(x, "commitSha", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setInvertRegex(value: Boolean): Self = StObject.set(x, "invertRegex", value.asInstanceOf[js.Any])
    
    inline def setInvertRegexUndefined: Self = StObject.set(x, "invertRegex", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRepoName(value: String): Self = StObject.set(x, "repoName", value.asInstanceOf[js.Any])
    
    inline def setRepoNameUndefined: Self = StObject.set(x, "repoName", js.undefined)
    
    inline def setSubstitutions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionsUndefined: Self = StObject.set(x, "substitutions", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
