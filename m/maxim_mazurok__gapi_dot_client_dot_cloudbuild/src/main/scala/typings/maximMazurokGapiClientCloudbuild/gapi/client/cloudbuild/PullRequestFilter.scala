package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullRequestFilter extends StObject {
  
  /** Regex of branches to match. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax */
  var branch: js.UndefOr[String] = js.undefined
  
  /** Configure builds to run whether a repository owner or collaborator need to comment `/gcbrun`. */
  var commentControl: js.UndefOr[String] = js.undefined
  
  /** If true, branches that do NOT match the git_ref will trigger a build. */
  var invertRegex: js.UndefOr[Boolean] = js.undefined
}
object PullRequestFilter {
  
  inline def apply(): PullRequestFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestFilter]
  }
  
  extension [Self <: PullRequestFilter](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCommentControl(value: String): Self = StObject.set(x, "commentControl", value.asInstanceOf[js.Any])
    
    inline def setCommentControlUndefined: Self = StObject.set(x, "commentControl", js.undefined)
    
    inline def setInvertRegex(value: Boolean): Self = StObject.set(x, "invertRegex", value.asInstanceOf[js.Any])
    
    inline def setInvertRegexUndefined: Self = StObject.set(x, "invertRegex", js.undefined)
  }
}
