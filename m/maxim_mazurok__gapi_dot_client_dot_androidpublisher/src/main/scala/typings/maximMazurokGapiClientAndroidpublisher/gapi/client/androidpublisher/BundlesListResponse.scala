package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundlesListResponse extends js.Object {
  
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
  implicit class BundlesListResponseOps[Self <: BundlesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBundlesVarargs(value: Bundle*): Self = this.set("bundles", js.Array(value :_*))
    
    @scala.inline
    def setBundles(value: js.Array[Bundle]): Self = this.set("bundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundles: Self = this.set("bundles", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
