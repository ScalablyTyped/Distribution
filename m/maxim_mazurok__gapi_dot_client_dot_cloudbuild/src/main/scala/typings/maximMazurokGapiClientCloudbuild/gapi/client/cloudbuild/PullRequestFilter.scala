package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequestFilter extends js.Object {
  
  /** Regex of branches to match. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax */
  var branch: js.UndefOr[String] = js.native
  
  /** Configure builds to run whether a repository owner or collaborator need to comment `/gcbrun`. */
  var commentControl: js.UndefOr[String] = js.native
  
  /** If true, branches that do NOT match the git_ref will trigger a build. */
  var invertRegex: js.UndefOr[Boolean] = js.native
}
object PullRequestFilter {
  
  @scala.inline
  def apply(): PullRequestFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestFilter]
  }
  
  @scala.inline
  implicit class PullRequestFilterOps[Self <: PullRequestFilter] (val x: Self) extends AnyVal {
    
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
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    
    @scala.inline
    def setCommentControl(value: String): Self = this.set("commentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentControl: Self = this.set("commentControl", js.undefined)
    
    @scala.inline
    def setInvertRegex(value: Boolean): Self = this.set("invertRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertRegex: Self = this.set("invertRegex", js.undefined)
  }
}
