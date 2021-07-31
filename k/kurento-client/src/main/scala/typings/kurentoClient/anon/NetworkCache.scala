package typings.kurentoClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkCache extends StObject {
  
  var networkCache: js.UndefOr[Double] = js.undefined
  
  var uri: String
  
  var useEncodedMedia: js.UndefOr[Boolean] = js.undefined
}
object NetworkCache {
  
  @scala.inline
  def apply(uri: String): NetworkCache = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkCache]
  }
  
  @scala.inline
  implicit class NetworkCacheMutableBuilder[Self <: NetworkCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkCache(value: Double): Self = StObject.set(x, "networkCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkCacheUndefined: Self = StObject.set(x, "networkCache", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEncodedMedia(value: Boolean): Self = StObject.set(x, "useEncodedMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEncodedMediaUndefined: Self = StObject.set(x, "useEncodedMedia", js.undefined)
  }
}
