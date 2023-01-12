package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageCropStyle extends StObject {
  
  /** The aspect ratio to use if the crop type is RECTANGLE_CUSTOM. */
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  /** The crop type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ImageCropStyle {
  
  inline def apply(): ImageCropStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageCropStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageCropStyle] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
