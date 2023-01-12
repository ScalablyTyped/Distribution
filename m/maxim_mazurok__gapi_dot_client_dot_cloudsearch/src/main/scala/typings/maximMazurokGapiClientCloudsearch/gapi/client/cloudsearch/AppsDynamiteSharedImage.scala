package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedImage extends StObject {
  
  /** The alternative text of this image, used for accessibility. */
  var altText: js.UndefOr[String] = js.undefined
  
  /** An image URL. */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[AppsDynamiteSharedOnClick] = js.undefined
}
object AppsDynamiteSharedImage {
  
  inline def apply(): AppsDynamiteSharedImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedImage] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setOnClick(value: AppsDynamiteSharedOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
