package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitHubEventsConfig extends StObject {
  
  /** The installationID that emits the GitHub event. */
  var installationId: js.UndefOr[String] = js.undefined
  
  /** Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-builders is "cloud-builders". */
  var name: js.UndefOr[String] = js.undefined
  
  /** Owner of the repository. For example: The owner for https://github.com/googlecloudplatform/cloud-builders is "googlecloudplatform". */
  var owner: js.UndefOr[String] = js.undefined
  
  /** filter to match changes in pull requests. */
  var pullRequest: js.UndefOr[PullRequestFilter] = js.undefined
  
  /** filter to match changes in refs like branches, tags. */
  var push: js.UndefOr[PushFilter] = js.undefined
}
object GitHubEventsConfig {
  
  inline def apply(): GitHubEventsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitHubEventsConfig]
  }
  
  extension [Self <: GitHubEventsConfig](x: Self) {
    
    inline def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    inline def setInstallationIdUndefined: Self = StObject.set(x, "installationId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPullRequest(value: PullRequestFilter): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    inline def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
    
    inline def setPush(value: PushFilter): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
  }
}
