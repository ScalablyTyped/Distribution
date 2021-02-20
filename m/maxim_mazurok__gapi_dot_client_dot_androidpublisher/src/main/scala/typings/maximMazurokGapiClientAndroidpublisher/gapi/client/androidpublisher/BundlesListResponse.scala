package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundlesListResponse extends StObject {
  
  /** All bundles. */
  var bundles: js.UndefOr[js.Array[Bundle]] = js.native
  
  /** The kind of this response ("androidpublisher#bundlesListResponse"). */
  var kind: js.UndefOr[String] = js.native
}
object BundlesListResponse {
  
  @scala.inline
  def apply(): BundlesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundlesListResponse]
  }
  
  @scala.inline
  implicit class BundlesListResponseMutableBuilder[Self <: BundlesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundles(value: js.Array[Bundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    @scala.inline
    def setBundlesVarargs(value: Bundle*): Self = StObject.set(x, "bundles", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
