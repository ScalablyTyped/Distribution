package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBitbucketServerConfigsResponse extends StObject {
  
  /** A list of BitbucketServerConfigs */
  var bitbucketServerConfigs: js.UndefOr[js.Array[BitbucketServerConfig]] = js.undefined
  
  /** A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBitbucketServerConfigsResponse {
  
  inline def apply(): ListBitbucketServerConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBitbucketServerConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBitbucketServerConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setBitbucketServerConfigs(value: js.Array[BitbucketServerConfig]): Self = StObject.set(x, "bitbucketServerConfigs", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConfigsUndefined: Self = StObject.set(x, "bitbucketServerConfigs", js.undefined)
    
    inline def setBitbucketServerConfigsVarargs(value: BitbucketServerConfig*): Self = StObject.set(x, "bitbucketServerConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
