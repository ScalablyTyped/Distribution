package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputAttributes extends StObject {
  
  var `input-auto-scaling`: js.UndefOr[Boolean] = js.undefined
  
  var `input-auto-skew-correction`: js.UndefOr[Boolean] = js.undefined
  
  var `input-brightness`: js.UndefOr[Double] = js.undefined
  
  var `input-color-mode`: js.UndefOr[InputColorMode] = js.undefined
  
  var `input-content-type`: js.UndefOr[InputContentType] = js.undefined
  
  var `input-contrast`: js.UndefOr[Double] = js.undefined
  
  var `input-film-scan-mode`: js.UndefOr[InputFilmScanMode] = js.undefined
  
  var `input-images-to-transfer`: js.UndefOr[Double] = js.undefined
  
  var `input-media`: js.UndefOr[MediaName | MediaSizeName] = js.undefined
  
  var `input-orientation-requested`: js.UndefOr[OrientationRequested] = js.undefined
  
  var `input-quality`: js.UndefOr[PrintQuality] = js.undefined
  
  var `input-resolution`: js.UndefOr[Resolution] = js.undefined
  
  var `input-scaling-height`: js.UndefOr[Double] = js.undefined
  
  var `input-scaling-width`: js.UndefOr[Double] = js.undefined
  
  var `input-scan-regions`: js.UndefOr[js.Array[PPScanRegions]] = js.undefined
  
  var `input-sharpness`: js.UndefOr[Double] = js.undefined
  
  var `input-sides`: js.UndefOr[Sides] = js.undefined
  
  var `input-source`: js.UndefOr[InputSource] = js.undefined
}
object InputAttributes {
  
  @scala.inline
  def apply(): InputAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputAttributes]
  }
  
  @scala.inline
  implicit class InputAttributesMutableBuilder[Self <: InputAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setInput-auto-scaling`(value: Boolean): Self = StObject.set(x, "input-auto-scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-auto-scalingUndefined`: Self = StObject.set(x, "input-auto-scaling", js.undefined)
    
    @scala.inline
    def `setInput-auto-skew-correction`(value: Boolean): Self = StObject.set(x, "input-auto-skew-correction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-auto-skew-correctionUndefined`: Self = StObject.set(x, "input-auto-skew-correction", js.undefined)
    
    @scala.inline
    def `setInput-brightness`(value: Double): Self = StObject.set(x, "input-brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-brightnessUndefined`: Self = StObject.set(x, "input-brightness", js.undefined)
    
    @scala.inline
    def `setInput-color-mode`(value: InputColorMode): Self = StObject.set(x, "input-color-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-color-modeUndefined`: Self = StObject.set(x, "input-color-mode", js.undefined)
    
    @scala.inline
    def `setInput-content-type`(value: InputContentType): Self = StObject.set(x, "input-content-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-content-typeUndefined`: Self = StObject.set(x, "input-content-type", js.undefined)
    
    @scala.inline
    def `setInput-contrast`(value: Double): Self = StObject.set(x, "input-contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-contrastUndefined`: Self = StObject.set(x, "input-contrast", js.undefined)
    
    @scala.inline
    def `setInput-film-scan-mode`(value: InputFilmScanMode): Self = StObject.set(x, "input-film-scan-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-film-scan-modeUndefined`: Self = StObject.set(x, "input-film-scan-mode", js.undefined)
    
    @scala.inline
    def `setInput-images-to-transfer`(value: Double): Self = StObject.set(x, "input-images-to-transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-images-to-transferUndefined`: Self = StObject.set(x, "input-images-to-transfer", js.undefined)
    
    @scala.inline
    def `setInput-media`(value: MediaName | MediaSizeName): Self = StObject.set(x, "input-media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-mediaUndefined`: Self = StObject.set(x, "input-media", js.undefined)
    
    @scala.inline
    def `setInput-orientation-requested`(value: OrientationRequested): Self = StObject.set(x, "input-orientation-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-orientation-requestedUndefined`: Self = StObject.set(x, "input-orientation-requested", js.undefined)
    
    @scala.inline
    def `setInput-quality`(value: PrintQuality): Self = StObject.set(x, "input-quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-qualityUndefined`: Self = StObject.set(x, "input-quality", js.undefined)
    
    @scala.inline
    def `setInput-resolution`(value: Resolution): Self = StObject.set(x, "input-resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-resolutionUndefined`: Self = StObject.set(x, "input-resolution", js.undefined)
    
    @scala.inline
    def `setInput-scaling-height`(value: Double): Self = StObject.set(x, "input-scaling-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-scaling-heightUndefined`: Self = StObject.set(x, "input-scaling-height", js.undefined)
    
    @scala.inline
    def `setInput-scaling-width`(value: Double): Self = StObject.set(x, "input-scaling-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-scaling-widthUndefined`: Self = StObject.set(x, "input-scaling-width", js.undefined)
    
    @scala.inline
    def `setInput-scan-regions`(value: js.Array[PPScanRegions]): Self = StObject.set(x, "input-scan-regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-scan-regionsUndefined`: Self = StObject.set(x, "input-scan-regions", js.undefined)
    
    @scala.inline
    def `setInput-scan-regionsVarargs`(value: PPScanRegions*): Self = StObject.set(x, "input-scan-regions", js.Array(value :_*))
    
    @scala.inline
    def `setInput-sharpness`(value: Double): Self = StObject.set(x, "input-sharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-sharpnessUndefined`: Self = StObject.set(x, "input-sharpness", js.undefined)
    
    @scala.inline
    def `setInput-sides`(value: Sides): Self = StObject.set(x, "input-sides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-sidesUndefined`: Self = StObject.set(x, "input-sides", js.undefined)
    
    @scala.inline
    def `setInput-source`(value: InputSource): Self = StObject.set(x, "input-source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-sourceUndefined`: Self = StObject.set(x, "input-source", js.undefined)
  }
}
