package typings.k6.anon

import typings.k6.k6Strings.jpeg
import typings.k6.k6Strings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clip extends StObject {
  
  /**
    * An object which specifies clipping of the resulting image.
    */
  var clip: js.UndefOr[Height] = js.undefined
  
  /**
    * When true, takes a screenshot of the full scrollable page, instead of
    * the currently visible viewport. Defaults to `false`.
    */
  var fullPage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hides default white background and allows capturing screenshots with
    * transparency. Not applicable to `jpeg` images. Defaults to `false`.
    */
  var omitBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file path to save the image to. The screenshot type will be inferred
    * from file extension. If `path` is a relative path, then it is resolved
    * relative to the current working directory. If no path is provided, the
    * image won't be saved to the disk.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The quality of the image, between 0-100; `jpeg` only.
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify screenshot type, defaults to `png`.
    */
  var `type`: js.UndefOr[png | jpeg] = js.undefined
}
object Clip {
  
  inline def apply(): Clip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clip] (val x: Self) extends AnyVal {
    
    inline def setClip(value: Height): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
    
    inline def setFullPageUndefined: Self = StObject.set(x, "fullPage", js.undefined)
    
    inline def setOmitBackground(value: Boolean): Self = StObject.set(x, "omitBackground", value.asInstanceOf[js.Any])
    
    inline def setOmitBackgroundUndefined: Self = StObject.set(x, "omitBackground", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setType(value: png | jpeg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
