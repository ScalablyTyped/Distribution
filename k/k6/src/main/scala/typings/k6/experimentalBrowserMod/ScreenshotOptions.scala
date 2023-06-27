package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotOptions extends StObject {
  
  /**
    * Hide default white background and allow capturing screenshots with transparency.
    * Not applicable to `jpeg` images.
    * @default false
    */
  var omitBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file path to save the image to. The screenshot type will be inferred from file extension.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The quality of the image, between 0-100. Not applicable to `png` images.
    * @default 100
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * The screenshot format.
    * @default 'png'
    */
  var `type`: js.UndefOr[ImageFormat] = js.undefined
}
object ScreenshotOptions {
  
  inline def apply(): ScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScreenshotOptions] (val x: Self) extends AnyVal {
    
    inline def setOmitBackground(value: Boolean): Self = StObject.set(x, "omitBackground", value.asInstanceOf[js.Any])
    
    inline def setOmitBackgroundUndefined: Self = StObject.set(x, "omitBackground", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setType(value: ImageFormat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
