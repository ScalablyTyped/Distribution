package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A channel banner returned as the response to a channel_banner.insert call.
  */
trait SchemaChannelBannerResource extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channelBannerResource&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of this banner image.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaChannelBannerResource {
  
  inline def apply(): SchemaChannelBannerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelBannerResource]
  }
  
  extension [Self <: SchemaChannelBannerResource](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
