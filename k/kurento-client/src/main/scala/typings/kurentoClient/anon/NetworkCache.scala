package typings.kurentoClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkCache extends js.Object {
  
  var networkCache: js.UndefOr[Double] = js.native
  
  var uri: String = js.native
  
  var useEncodedMedia: js.UndefOr[Boolean] = js.native
}
object NetworkCache {
  
  @scala.inline
  def apply(uri: String): NetworkCache = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkCache]
  }
  
  @scala.inline
  implicit class NetworkCacheOps[Self <: NetworkCache] (val x: Self) extends AnyVal {
    
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkCache(value: Double): Self = this.set("networkCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkCache: Self = this.set("networkCache", js.undefined)
    
    @scala.inline
    def setUseEncodedMedia(value: Boolean): Self = this.set("useEncodedMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEncodedMedia: Self = this.set("useEncodedMedia", js.undefined)
  }
}
