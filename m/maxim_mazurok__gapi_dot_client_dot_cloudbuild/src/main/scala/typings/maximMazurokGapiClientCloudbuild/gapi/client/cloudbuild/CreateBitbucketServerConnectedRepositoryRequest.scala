package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBitbucketServerConnectedRepositoryRequest extends StObject {
  
  /** Required. The Bitbucket Server repository to connect. */
  var bitbucketServerConnectedRepository: js.UndefOr[BitbucketServerConnectedRepository] = js.undefined
  
  /** Required. The name of the `BitbucketServerConfig` that added connected repository. Format: `projects/{project}/locations/{location}/bitbucketServerConfigs/{config}` */
  var parent: js.UndefOr[String] = js.undefined
}
object CreateBitbucketServerConnectedRepositoryRequest {
  
  inline def apply(): CreateBitbucketServerConnectedRepositoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBitbucketServerConnectedRepositoryRequest]
  }
  
  extension [Self <: CreateBitbucketServerConnectedRepositoryRequest](x: Self) {
    
    inline def setBitbucketServerConnectedRepository(value: BitbucketServerConnectedRepository): Self = StObject.set(x, "bitbucketServerConnectedRepository", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConnectedRepositoryUndefined: Self = StObject.set(x, "bitbucketServerConnectedRepository", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
