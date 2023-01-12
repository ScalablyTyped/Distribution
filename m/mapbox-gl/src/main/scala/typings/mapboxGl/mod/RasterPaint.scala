package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.linear
import typings.mapboxGl.mapboxGlStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterPaint
  extends StObject
     with AnyPaint {
  
  var `raster-brightness-max`: js.UndefOr[Double | Expression] = js.undefined
  
  var `raster-brightness-max-transition`: js.UndefOr[Transition] = js.undefined
  
  var `raster-brightness-min`: js.UndefOr[Double | Expression] = js.undefined
  
  var `raster-brightness-min-transition`: js.UndefOr[Transition] = js.undefined
  
  var `raster-contrast`: js.UndefOr[Double | Expression] = js.undefined
  
  var `raster-contrast-transition`: js.UndefOr[Transition] = js.undefined
  
  var `raster-fade-duration`: js.UndefOr[Double | Expression] = js.undefined
  
  var `raster-hue-rotate`: js.UndefOr[Double | Expression] = js.undefined
  
  var `raster-hue-rotate-transition`: js.UndefOr[Transition] = js.undefined
  
  var `raster-opacity`: js.UndefOr[Double | Expression] = js.undefined
  
  var `raster-opacity-transition`: js.UndefOr[Transition] = js.undefined
  
  var `raster-resampling`: js.UndefOr[linear | nearest] = js.undefined
  
  var `raster-saturation`: js.UndefOr[Double | Expression] = js.undefined
  
  var `raster-saturation-transition`: js.UndefOr[Transition] = js.undefined
}
object RasterPaint {
  
  inline def apply(): RasterPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterPaint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterPaint] (val x: Self) extends AnyVal {
    
    inline def `setRaster-brightness-max`(value: Double | Expression): Self = StObject.set(x, "raster-brightness-max", value.asInstanceOf[js.Any])
    
    inline def `setRaster-brightness-max-transition`(value: Transition): Self = StObject.set(x, "raster-brightness-max-transition", value.asInstanceOf[js.Any])
    
    inline def `setRaster-brightness-max-transitionUndefined`: Self = StObject.set(x, "raster-brightness-max-transition", js.undefined)
    
    inline def `setRaster-brightness-maxUndefined`: Self = StObject.set(x, "raster-brightness-max", js.undefined)
    
    inline def `setRaster-brightness-min`(value: Double | Expression): Self = StObject.set(x, "raster-brightness-min", value.asInstanceOf[js.Any])
    
    inline def `setRaster-brightness-min-transition`(value: Transition): Self = StObject.set(x, "raster-brightness-min-transition", value.asInstanceOf[js.Any])
    
    inline def `setRaster-brightness-min-transitionUndefined`: Self = StObject.set(x, "raster-brightness-min-transition", js.undefined)
    
    inline def `setRaster-brightness-minUndefined`: Self = StObject.set(x, "raster-brightness-min", js.undefined)
    
    inline def `setRaster-contrast`(value: Double | Expression): Self = StObject.set(x, "raster-contrast", value.asInstanceOf[js.Any])
    
    inline def `setRaster-contrast-transition`(value: Transition): Self = StObject.set(x, "raster-contrast-transition", value.asInstanceOf[js.Any])
    
    inline def `setRaster-contrast-transitionUndefined`: Self = StObject.set(x, "raster-contrast-transition", js.undefined)
    
    inline def `setRaster-contrastUndefined`: Self = StObject.set(x, "raster-contrast", js.undefined)
    
    inline def `setRaster-fade-duration`(value: Double | Expression): Self = StObject.set(x, "raster-fade-duration", value.asInstanceOf[js.Any])
    
    inline def `setRaster-fade-durationUndefined`: Self = StObject.set(x, "raster-fade-duration", js.undefined)
    
    inline def `setRaster-hue-rotate`(value: Double | Expression): Self = StObject.set(x, "raster-hue-rotate", value.asInstanceOf[js.Any])
    
    inline def `setRaster-hue-rotate-transition`(value: Transition): Self = StObject.set(x, "raster-hue-rotate-transition", value.asInstanceOf[js.Any])
    
    inline def `setRaster-hue-rotate-transitionUndefined`: Self = StObject.set(x, "raster-hue-rotate-transition", js.undefined)
    
    inline def `setRaster-hue-rotateUndefined`: Self = StObject.set(x, "raster-hue-rotate", js.undefined)
    
    inline def `setRaster-opacity`(value: Double | Expression): Self = StObject.set(x, "raster-opacity", value.asInstanceOf[js.Any])
    
    inline def `setRaster-opacity-transition`(value: Transition): Self = StObject.set(x, "raster-opacity-transition", value.asInstanceOf[js.Any])
    
    inline def `setRaster-opacity-transitionUndefined`: Self = StObject.set(x, "raster-opacity-transition", js.undefined)
    
    inline def `setRaster-opacityUndefined`: Self = StObject.set(x, "raster-opacity", js.undefined)
    
    inline def `setRaster-resampling`(value: linear | nearest): Self = StObject.set(x, "raster-resampling", value.asInstanceOf[js.Any])
    
    inline def `setRaster-resamplingUndefined`: Self = StObject.set(x, "raster-resampling", js.undefined)
    
    inline def `setRaster-saturation`(value: Double | Expression): Self = StObject.set(x, "raster-saturation", value.asInstanceOf[js.Any])
    
    inline def `setRaster-saturation-transition`(value: Transition): Self = StObject.set(x, "raster-saturation-transition", value.asInstanceOf[js.Any])
    
    inline def `setRaster-saturation-transitionUndefined`: Self = StObject.set(x, "raster-saturation-transition", js.undefined)
    
    inline def `setRaster-saturationUndefined`: Self = StObject.set(x, "raster-saturation", js.undefined)
  }
}
