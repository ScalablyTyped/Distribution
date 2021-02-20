package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A channel banner returned as the response to a channel_banner.insert call.
  */
@js.native
trait SchemaChannelBannerResource extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channelBannerResource&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The URL of this banner image.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaChannelBannerResource {
  
  @scala.inline
  def apply(): SchemaChannelBannerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelBannerResource]
  }
  
  @scala.inline
  implicit class SchemaChannelBannerResourceMutableBuilder[Self <: SchemaChannelBannerResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
