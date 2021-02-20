package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitHubEventsConfig extends StObject {
  
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
  implicit class GitHubEventsConfigMutableBuilder[Self <: GitHubEventsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationIdUndefined: Self = StObject.set(x, "installationId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPullRequest(value: PullRequestFilter): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
    
    @scala.inline
    def setPush(value: PushFilter): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
  }
}
