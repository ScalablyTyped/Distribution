package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.linear
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.nearest
import typings.maplibreMaplibreGlStyleSpec.mod.PropertyValueSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rasterbrightnessmax extends StObject {
  
  var `raster-brightness-max`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `raster-brightness-min`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `raster-contrast`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `raster-fade-duration`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `raster-hue-rotate`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `raster-opacity`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `raster-resampling`: js.UndefOr[PropertyValueSpecification[linear | nearest]] = js.undefined
  
  var `raster-saturation`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
}
object Rasterbrightnessmax {
  
  inline def apply(): Rasterbrightnessmax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rasterbrightnessmax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rasterbrightnessmax] (val x: Self) extends AnyVal {
    
    inline def `setRaster-brightness-max`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "raster-brightness-max", value.asInstanceOf[js.Any])
    
    inline def `setRaster-brightness-maxUndefined`: Self = StObject.set(x, "raster-brightness-max", js.undefined)
    
    inline def `setRaster-brightness-min`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "raster-brightness-min", value.asInstanceOf[js.Any])
    
    inline def `setRaster-brightness-minUndefined`: Self = StObject.set(x, "raster-brightness-min", js.undefined)
    
    inline def `setRaster-contrast`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "raster-contrast", value.asInstanceOf[js.Any])
    
    inline def `setRaster-contrastUndefined`: Self = StObject.set(x, "raster-contrast", js.undefined)
    
    inline def `setRaster-fade-duration`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "raster-fade-duration", value.asInstanceOf[js.Any])
    
    inline def `setRaster-fade-durationUndefined`: Self = StObject.set(x, "raster-fade-duration", js.undefined)
    
    inline def `setRaster-hue-rotate`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "raster-hue-rotate", value.asInstanceOf[js.Any])
    
    inline def `setRaster-hue-rotateUndefined`: Self = StObject.set(x, "raster-hue-rotate", js.undefined)
    
    inline def `setRaster-opacity`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "raster-opacity", value.asInstanceOf[js.Any])
    
    inline def `setRaster-opacityUndefined`: Self = StObject.set(x, "raster-opacity", js.undefined)
    
    inline def `setRaster-resampling`(value: PropertyValueSpecification[linear | nearest]): Self = StObject.set(x, "raster-resampling", value.asInstanceOf[js.Any])
    
    inline def `setRaster-resamplingUndefined`: Self = StObject.set(x, "raster-resampling", js.undefined)
    
    inline def `setRaster-saturation`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "raster-saturation", value.asInstanceOf[js.Any])
    
    inline def `setRaster-saturationUndefined`: Self = StObject.set(x, "raster-saturation", js.undefined)
  }
}
