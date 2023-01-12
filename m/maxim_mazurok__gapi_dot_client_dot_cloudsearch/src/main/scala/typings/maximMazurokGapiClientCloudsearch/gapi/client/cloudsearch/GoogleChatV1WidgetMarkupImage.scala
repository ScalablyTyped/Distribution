package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1WidgetMarkupImage extends StObject {
  
  /**
    * The aspect ratio of this image (width/height). This field allows clients to reserve the right height for the image while waiting for it to load. It's not meant to override the
    * native aspect ratio of the image. If unset, the server fills it by prefetching the image.
    */
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  /** The URL of the image. */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /** The onclick action. */
  var onClick: js.UndefOr[GoogleChatV1WidgetMarkupOnClick] = js.undefined
}
object GoogleChatV1WidgetMarkupImage {
  
  inline def apply(): GoogleChatV1WidgetMarkupImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1WidgetMarkupImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleChatV1WidgetMarkupImage] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setOnClick(value: GoogleChatV1WidgetMarkupOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
