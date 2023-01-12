package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateBitbucketServerConnectedRepositoriesResponse extends StObject {
  
  /** The connected Bitbucket Server repositories. */
  var bitbucketServerConnectedRepositories: js.UndefOr[js.Array[BitbucketServerConnectedRepository]] = js.undefined
}
object BatchCreateBitbucketServerConnectedRepositoriesResponse {
  
  inline def apply(): BatchCreateBitbucketServerConnectedRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateBitbucketServerConnectedRepositoriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateBitbucketServerConnectedRepositoriesResponse] (val x: Self) extends AnyVal {
    
    inline def setBitbucketServerConnectedRepositories(value: js.Array[BitbucketServerConnectedRepository]): Self = StObject.set(x, "bitbucketServerConnectedRepositories", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConnectedRepositoriesUndefined: Self = StObject.set(x, "bitbucketServerConnectedRepositories", js.undefined)
    
    inline def setBitbucketServerConnectedRepositoriesVarargs(value: BitbucketServerConnectedRepository*): Self = StObject.set(x, "bitbucketServerConnectedRepositories", js.Array(value*))
  }
}
