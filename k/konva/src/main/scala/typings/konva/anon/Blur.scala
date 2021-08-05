package typings.konva.anon

import typings.konva.nodeMod.Filter
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blur extends StObject {
  
  def Blur(imageData: ImageData): Unit
  @JSName("Blur")
  var Blur_Original: Filter
  
  def Brighten(imageData: ImageData): Unit
  @JSName("Brighten")
  var Brighten_Original: Filter
  
  def Contrast(imageData: ImageData): Unit
  @JSName("Contrast")
  var Contrast_Original: Filter
  
  def Emboss(imageData: ImageData): Unit
  @JSName("Emboss")
  var Emboss_Original: Filter
  
  def Enhance(imageData: ImageData): Unit
  @JSName("Enhance")
  var Enhance_Original: Filter
  
  def Grayscale(imageData: ImageData): Unit
  @JSName("Grayscale")
  var Grayscale_Original: Filter
  
  def HSL(imageData: ImageData): Unit
  @JSName("HSL")
  var HSL_Original: Filter
  
  def HSV(imageData: ImageData): Unit
  @JSName("HSV")
  var HSV_Original: Filter
  
  def Invert(imageData: ImageData): Unit
  @JSName("Invert")
  var Invert_Original: Filter
  
  def Kaleidoscope(imageData: ImageData): Unit
  @JSName("Kaleidoscope")
  var Kaleidoscope_Original: Filter
  
  def Mask(imageData: ImageData): Unit
  @JSName("Mask")
  var Mask_Original: Filter
  
  def Noise(imageData: ImageData): Unit
  @JSName("Noise")
  var Noise_Original: Filter
  
  def Pixelate(imageData: ImageData): Unit
  @JSName("Pixelate")
  var Pixelate_Original: Filter
  
  def Posterize(imageData: ImageData): Unit
  @JSName("Posterize")
  var Posterize_Original: Filter
  
  def RGB(imageData: ImageData): Unit
  
  def RGBA(imageData: ImageData): Unit
  @JSName("RGBA")
  var RGBA_Original: Filter
  
  @JSName("RGB")
  var RGB_Original: Filter
  
  def Sepia(imageData: ImageData): Unit
  @JSName("Sepia")
  var Sepia_Original: Filter
  
  def Solarize(imageData: ImageData): Unit
  @JSName("Solarize")
  var Solarize_Original: Filter
  
  def Threshold(imageData: ImageData): Unit
  @JSName("Threshold")
  var Threshold_Original: Filter
}
object Blur {
  
  inline def apply(
    Blur: Filter,
    Brighten: Filter,
    Contrast: Filter,
    Emboss: Filter,
    Enhance: Filter,
    Grayscale: Filter,
    HSL: Filter,
    HSV: Filter,
    Invert: Filter,
    Kaleidoscope: Filter,
    Mask: Filter,
    Noise: Filter,
    Pixelate: Filter,
    Posterize: Filter,
    RGB: Filter,
    RGBA: Filter,
    Sepia: Filter,
    Solarize: Filter,
    Threshold: Filter
  ): Blur = {
    val __obj = js.Dynamic.literal(Blur = Blur.asInstanceOf[js.Any], Brighten = Brighten.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Emboss = Emboss.asInstanceOf[js.Any], Enhance = Enhance.asInstanceOf[js.Any], Grayscale = Grayscale.asInstanceOf[js.Any], HSL = HSL.asInstanceOf[js.Any], HSV = HSV.asInstanceOf[js.Any], Invert = Invert.asInstanceOf[js.Any], Kaleidoscope = Kaleidoscope.asInstanceOf[js.Any], Mask = Mask.asInstanceOf[js.Any], Noise = Noise.asInstanceOf[js.Any], Pixelate = Pixelate.asInstanceOf[js.Any], Posterize = Posterize.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], RGBA = RGBA.asInstanceOf[js.Any], Sepia = Sepia.asInstanceOf[js.Any], Solarize = Solarize.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blur]
  }
  
  extension [Self <: Blur](x: Self) {
    
    inline def setBlur(value: Filter): Self = StObject.set(x, "Blur", value.asInstanceOf[js.Any])
    
    inline def setBrighten(value: Filter): Self = StObject.set(x, "Brighten", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: Filter): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    inline def setEmboss(value: Filter): Self = StObject.set(x, "Emboss", value.asInstanceOf[js.Any])
    
    inline def setEnhance(value: Filter): Self = StObject.set(x, "Enhance", value.asInstanceOf[js.Any])
    
    inline def setGrayscale(value: Filter): Self = StObject.set(x, "Grayscale", value.asInstanceOf[js.Any])
    
    inline def setHSL(value: Filter): Self = StObject.set(x, "HSL", value.asInstanceOf[js.Any])
    
    inline def setHSV(value: Filter): Self = StObject.set(x, "HSV", value.asInstanceOf[js.Any])
    
    inline def setInvert(value: Filter): Self = StObject.set(x, "Invert", value.asInstanceOf[js.Any])
    
    inline def setKaleidoscope(value: Filter): Self = StObject.set(x, "Kaleidoscope", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Filter): Self = StObject.set(x, "Mask", value.asInstanceOf[js.Any])
    
    inline def setNoise(value: Filter): Self = StObject.set(x, "Noise", value.asInstanceOf[js.Any])
    
    inline def setPixelate(value: Filter): Self = StObject.set(x, "Pixelate", value.asInstanceOf[js.Any])
    
    inline def setPosterize(value: Filter): Self = StObject.set(x, "Posterize", value.asInstanceOf[js.Any])
    
    inline def setRGB(value: Filter): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
    
    inline def setRGBA(value: Filter): Self = StObject.set(x, "RGBA", value.asInstanceOf[js.Any])
    
    inline def setSepia(value: Filter): Self = StObject.set(x, "Sepia", value.asInstanceOf[js.Any])
    
    inline def setSolarize(value: Filter): Self = StObject.set(x, "Solarize", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Filter): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
  }
}
