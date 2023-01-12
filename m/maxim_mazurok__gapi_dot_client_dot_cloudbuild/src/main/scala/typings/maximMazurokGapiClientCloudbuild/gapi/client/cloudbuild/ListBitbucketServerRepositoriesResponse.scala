package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBitbucketServerRepositoriesResponse extends StObject {
  
  /** List of Bitbucket Server repositories. */
  var bitbucketServerRepositories: js.UndefOr[js.Array[BitbucketServerRepository]] = js.undefined
  
  /** A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBitbucketServerRepositoriesResponse {
  
  inline def apply(): ListBitbucketServerRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBitbucketServerRepositoriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBitbucketServerRepositoriesResponse] (val x: Self) extends AnyVal {
    
    inline def setBitbucketServerRepositories(value: js.Array[BitbucketServerRepository]): Self = StObject.set(x, "bitbucketServerRepositories", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerRepositoriesUndefined: Self = StObject.set(x, "bitbucketServerRepositories", js.undefined)
    
    inline def setBitbucketServerRepositoriesVarargs(value: BitbucketServerRepository*): Self = StObject.set(x, "bitbucketServerRepositories", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
