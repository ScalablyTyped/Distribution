package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendBucketCdnPolicyBypassCacheOnRequestHeader extends StObject {
  
  /** The header field name to match on when bypassing cache. Values are case-insensitive. */
  var headerName: js.UndefOr[String] = js.undefined
}
object BackendBucketCdnPolicyBypassCacheOnRequestHeader {
  
  inline def apply(): BackendBucketCdnPolicyBypassCacheOnRequestHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendBucketCdnPolicyBypassCacheOnRequestHeader]
  }
  
  extension [Self <: BackendBucketCdnPolicyBypassCacheOnRequestHeader](x: Self) {
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
  }
}
