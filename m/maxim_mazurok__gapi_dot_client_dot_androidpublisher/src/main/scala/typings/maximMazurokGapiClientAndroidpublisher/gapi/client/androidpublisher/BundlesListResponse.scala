package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundlesListResponse extends StObject {
  
  /** All app bundles. */
  var bundles: js.UndefOr[js.Array[Bundle]] = js.undefined
  
  /** The kind of this response ("androidpublisher#bundlesListResponse"). */
  var kind: js.UndefOr[String] = js.undefined
}
object BundlesListResponse {
  
  inline def apply(): BundlesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundlesListResponse]
  }
  
  extension [Self <: BundlesListResponse](x: Self) {
    
    inline def setBundles(value: js.Array[Bundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: Bundle*): Self = StObject.set(x, "bundles", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
