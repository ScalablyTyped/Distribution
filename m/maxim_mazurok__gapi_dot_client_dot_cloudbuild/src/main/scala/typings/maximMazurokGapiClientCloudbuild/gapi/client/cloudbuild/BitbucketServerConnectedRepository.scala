package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitbucketServerConnectedRepository extends StObject {
  
  /** The name of the `BitbucketServerConfig` that added connected repository. Format: `projects/{project}/locations/{location}/bitbucketServerConfigs/{config}` */
  var parent: js.UndefOr[String] = js.undefined
  
  /** The Bitbucket Server repositories to connect. */
  var repo: js.UndefOr[BitbucketServerRepositoryId] = js.undefined
  
  /** Output only. The status of the repo connection request. */
  var status: js.UndefOr[Status] = js.undefined
}
object BitbucketServerConnectedRepository {
  
  inline def apply(): BitbucketServerConnectedRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitbucketServerConnectedRepository]
  }
  
  extension [Self <: BitbucketServerConnectedRepository](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRepo(value: BitbucketServerRepositoryId): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
