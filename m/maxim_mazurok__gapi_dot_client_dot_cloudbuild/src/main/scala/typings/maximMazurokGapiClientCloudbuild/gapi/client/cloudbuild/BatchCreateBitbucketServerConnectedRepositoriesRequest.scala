package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateBitbucketServerConnectedRepositoriesRequest extends StObject {
  
  /** Required. Requests to connect Bitbucket Server repositories. */
  var requests: js.UndefOr[js.Array[CreateBitbucketServerConnectedRepositoryRequest]] = js.undefined
}
object BatchCreateBitbucketServerConnectedRepositoriesRequest {
  
  inline def apply(): BatchCreateBitbucketServerConnectedRepositoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateBitbucketServerConnectedRepositoriesRequest]
  }
  
  extension [Self <: BatchCreateBitbucketServerConnectedRepositoriesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[CreateBitbucketServerConnectedRepositoryRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: CreateBitbucketServerConnectedRepositoryRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
