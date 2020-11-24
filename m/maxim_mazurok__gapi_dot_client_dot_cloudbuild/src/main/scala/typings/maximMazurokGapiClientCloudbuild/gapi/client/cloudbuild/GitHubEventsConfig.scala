package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitHubEventsConfig extends js.Object {
  
  /** The installationID that emits the GitHub event. */
  var installationId: js.UndefOr[String] = js.native
  
  /** Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-builders is "cloud-builders". */
  var name: js.UndefOr[String] = js.native
  
  /** Owner of the repository. For example: The owner for https://github.com/googlecloudplatform/cloud-builders is "googlecloudplatform". */
  var owner: js.UndefOr[String] = js.native
  
  /** filter to match changes in pull requests. */
  var pullRequest: js.UndefOr[PullRequestFilter] = js.native
  
  /** filter to match changes in refs like branches, tags. */
  var push: js.UndefOr[PushFilter] = js.native
}
object GitHubEventsConfig {
  
  @scala.inline
  def apply(): GitHubEventsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitHubEventsConfig]
  }
  
  @scala.inline
  implicit class GitHubEventsConfigOps[Self <: GitHubEventsConfig] (val x: Self) extends AnyVal {
    
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
    def setInstallationId(value: String): Self = this.set("installationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallationId: Self = this.set("installationId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPullRequest(value: PullRequestFilter): Self = this.set("pullRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequest: Self = this.set("pullRequest", js.undefined)
    
    @scala.inline
    def setPush(value: PushFilter): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
  }
}
