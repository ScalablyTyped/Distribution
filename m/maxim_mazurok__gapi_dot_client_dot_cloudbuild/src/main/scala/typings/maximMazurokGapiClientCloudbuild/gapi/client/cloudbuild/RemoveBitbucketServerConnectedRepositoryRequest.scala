package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveBitbucketServerConnectedRepositoryRequest extends StObject {
  
  /** The connected repository to remove. */
  var connectedRepository: js.UndefOr[BitbucketServerRepositoryId] = js.undefined
}
object RemoveBitbucketServerConnectedRepositoryRequest {
  
  inline def apply(): RemoveBitbucketServerConnectedRepositoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveBitbucketServerConnectedRepositoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveBitbucketServerConnectedRepositoryRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectedRepository(value: BitbucketServerRepositoryId): Self = StObject.set(x, "connectedRepository", value.asInstanceOf[js.Any])
    
    inline def setConnectedRepositoryUndefined: Self = StObject.set(x, "connectedRepository", js.undefined)
  }
}
