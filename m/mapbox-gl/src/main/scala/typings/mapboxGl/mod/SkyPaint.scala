package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.atmosphere
import typings.mapboxGl.mapboxGlStrings.gradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkyPaint
  extends StObject
     with AnyPaint {
  
  var `sky-atmosphere-color`: js.UndefOr[String | Expression] = js.undefined
  
  var `sky-atmosphere-halo-color`: js.UndefOr[String | Expression] = js.undefined
  
  var `sky-atmosphere-sun`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  
  var `sky-atmosphere-sun-intensity`: js.UndefOr[Double | Expression] = js.undefined
  
  var `sky-gradient`: js.UndefOr[String | Expression] = js.undefined
  
  var `sky-gradient-center`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  
  var `sky-gradient-radius`: js.UndefOr[Double | Expression] = js.undefined
  
  var `sky-opacity`: js.UndefOr[Double | Expression] = js.undefined
  
  var `sky-type`: js.UndefOr[gradient | atmosphere] = js.undefined
}
object SkyPaint {
  
  inline def apply(): SkyPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkyPaint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkyPaint] (val x: Self) extends AnyVal {
    
    inline def `setSky-atmosphere-color`(value: String | Expression): Self = StObject.set(x, "sky-atmosphere-color", value.asInstanceOf[js.Any])
    
    inline def `setSky-atmosphere-colorUndefined`: Self = StObject.set(x, "sky-atmosphere-color", js.undefined)
    
    inline def `setSky-atmosphere-halo-color`(value: String | Expression): Self = StObject.set(x, "sky-atmosphere-halo-color", value.asInstanceOf[js.Any])
    
    inline def `setSky-atmosphere-halo-colorUndefined`: Self = StObject.set(x, "sky-atmosphere-halo-color", js.undefined)
    
    inline def `setSky-atmosphere-sun`(value: js.Array[Double] | Expression): Self = StObject.set(x, "sky-atmosphere-sun", value.asInstanceOf[js.Any])
    
    inline def `setSky-atmosphere-sun-intensity`(value: Double | Expression): Self = StObject.set(x, "sky-atmosphere-sun-intensity", value.asInstanceOf[js.Any])
    
    inline def `setSky-atmosphere-sun-intensityUndefined`: Self = StObject.set(x, "sky-atmosphere-sun-intensity", js.undefined)
    
    inline def `setSky-atmosphere-sunUndefined`: Self = StObject.set(x, "sky-atmosphere-sun", js.undefined)
    
    inline def `setSky-atmosphere-sunVarargs`(value: Double*): Self = StObject.set(x, "sky-atmosphere-sun", js.Array(value*))
    
    inline def `setSky-gradient`(value: String | Expression): Self = StObject.set(x, "sky-gradient", value.asInstanceOf[js.Any])
    
    inline def `setSky-gradient-center`(value: js.Array[Double] | Expression): Self = StObject.set(x, "sky-gradient-center", value.asInstanceOf[js.Any])
    
    inline def `setSky-gradient-centerUndefined`: Self = StObject.set(x, "sky-gradient-center", js.undefined)
    
    inline def `setSky-gradient-centerVarargs`(value: Double*): Self = StObject.set(x, "sky-gradient-center", js.Array(value*))
    
    inline def `setSky-gradient-radius`(value: Double | Expression): Self = StObject.set(x, "sky-gradient-radius", value.asInstanceOf[js.Any])
    
    inline def `setSky-gradient-radiusUndefined`: Self = StObject.set(x, "sky-gradient-radius", js.undefined)
    
    inline def `setSky-gradientUndefined`: Self = StObject.set(x, "sky-gradient", js.undefined)
    
    inline def `setSky-opacity`(value: Double | Expression): Self = StObject.set(x, "sky-opacity", value.asInstanceOf[js.Any])
    
    inline def `setSky-opacityUndefined`: Self = StObject.set(x, "sky-opacity", js.undefined)
    
    inline def `setSky-type`(value: gradient | atmosphere): Self = StObject.set(x, "sky-type", value.asInstanceOf[js.Any])
    
    inline def `setSky-typeUndefined`: Self = StObject.set(x, "sky-type", js.undefined)
  }
}
