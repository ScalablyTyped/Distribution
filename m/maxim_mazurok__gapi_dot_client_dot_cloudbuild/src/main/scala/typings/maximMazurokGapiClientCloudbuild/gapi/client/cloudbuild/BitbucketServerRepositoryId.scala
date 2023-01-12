package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitbucketServerRepositoryId extends StObject {
  
  /** Required. Identifier for the project storing the repository. */
  var projectKey: js.UndefOr[String] = js.undefined
  
  /** Required. Identifier for the repository. */
  var repoSlug: js.UndefOr[String] = js.undefined
  
  /** Output only. The ID of the webhook that was created for receiving events from this repo. We only create and manage a single webhook for each repo. */
  var webhookId: js.UndefOr[Double] = js.undefined
}
object BitbucketServerRepositoryId {
  
  inline def apply(): BitbucketServerRepositoryId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitbucketServerRepositoryId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitbucketServerRepositoryId] (val x: Self) extends AnyVal {
    
    inline def setProjectKey(value: String): Self = StObject.set(x, "projectKey", value.asInstanceOf[js.Any])
    
    inline def setProjectKeyUndefined: Self = StObject.set(x, "projectKey", js.undefined)
    
    inline def setRepoSlug(value: String): Self = StObject.set(x, "repoSlug", value.asInstanceOf[js.Any])
    
    inline def setRepoSlugUndefined: Self = StObject.set(x, "repoSlug", js.undefined)
    
    inline def setWebhookId(value: Double): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
    
    inline def setWebhookIdUndefined: Self = StObject.set(x, "webhookId", js.undefined)
  }
}
