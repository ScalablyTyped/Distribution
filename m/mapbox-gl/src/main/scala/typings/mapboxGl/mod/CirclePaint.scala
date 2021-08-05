package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CirclePaint
  extends StObject
     with AnyPaint {
  
  var `circle-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `circle-blur-transition`: js.UndefOr[Transition] = js.undefined
  
  var `circle-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `circle-color-transition`: js.UndefOr[Transition] = js.undefined
  
  var `circle-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `circle-opacity-transition`: js.UndefOr[Transition] = js.undefined
  
  var `circle-pitch-alignment`: js.UndefOr[map | viewport] = js.undefined
  
  var `circle-pitch-scale`: js.UndefOr[map | viewport] = js.undefined
  
  var `circle-radius`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `circle-radius-transition`: js.UndefOr[Transition] = js.undefined
  
  var `circle-stroke-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `circle-stroke-color-transition`: js.UndefOr[Transition] = js.undefined
  
  var `circle-stroke-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `circle-stroke-opacity-transition`: js.UndefOr[Transition] = js.undefined
  
  var `circle-stroke-width`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `circle-stroke-width-transition`: js.UndefOr[Transition] = js.undefined
  
  var `circle-translate`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  
  var `circle-translate-anchor`: js.UndefOr[map | viewport] = js.undefined
  
  var `circle-translate-transition`: js.UndefOr[Transition] = js.undefined
}
object CirclePaint {
  
  inline def apply(): CirclePaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CirclePaint]
  }
  
  extension [Self <: CirclePaint](x: Self) {
    
    inline def `setCircle-blur`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "circle-blur", value.asInstanceOf[js.Any])
    
    inline def `setCircle-blur-transition`(value: Transition): Self = StObject.set(x, "circle-blur-transition", value.asInstanceOf[js.Any])
    
    inline def `setCircle-blur-transitionUndefined`: Self = StObject.set(x, "circle-blur-transition", js.undefined)
    
    inline def `setCircle-blurUndefined`: Self = StObject.set(x, "circle-blur", js.undefined)
    
    inline def `setCircle-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "circle-color", value.asInstanceOf[js.Any])
    
    inline def `setCircle-color-transition`(value: Transition): Self = StObject.set(x, "circle-color-transition", value.asInstanceOf[js.Any])
    
    inline def `setCircle-color-transitionUndefined`: Self = StObject.set(x, "circle-color-transition", js.undefined)
    
    inline def `setCircle-colorUndefined`: Self = StObject.set(x, "circle-color", js.undefined)
    
    inline def `setCircle-opacity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "circle-opacity", value.asInstanceOf[js.Any])
    
    inline def `setCircle-opacity-transition`(value: Transition): Self = StObject.set(x, "circle-opacity-transition", value.asInstanceOf[js.Any])
    
    inline def `setCircle-opacity-transitionUndefined`: Self = StObject.set(x, "circle-opacity-transition", js.undefined)
    
    inline def `setCircle-opacityUndefined`: Self = StObject.set(x, "circle-opacity", js.undefined)
    
    inline def `setCircle-pitch-alignment`(value: map | viewport): Self = StObject.set(x, "circle-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setCircle-pitch-alignmentUndefined`: Self = StObject.set(x, "circle-pitch-alignment", js.undefined)
    
    inline def `setCircle-pitch-scale`(value: map | viewport): Self = StObject.set(x, "circle-pitch-scale", value.asInstanceOf[js.Any])
    
    inline def `setCircle-pitch-scaleUndefined`: Self = StObject.set(x, "circle-pitch-scale", js.undefined)
    
    inline def `setCircle-radius`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "circle-radius", value.asInstanceOf[js.Any])
    
    inline def `setCircle-radius-transition`(value: Transition): Self = StObject.set(x, "circle-radius-transition", value.asInstanceOf[js.Any])
    
    inline def `setCircle-radius-transitionUndefined`: Self = StObject.set(x, "circle-radius-transition", js.undefined)
    
    inline def `setCircle-radiusUndefined`: Self = StObject.set(x, "circle-radius", js.undefined)
    
    inline def `setCircle-stroke-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "circle-stroke-color", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-color-transition`(value: Transition): Self = StObject.set(x, "circle-stroke-color-transition", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-color-transitionUndefined`: Self = StObject.set(x, "circle-stroke-color-transition", js.undefined)
    
    inline def `setCircle-stroke-colorUndefined`: Self = StObject.set(x, "circle-stroke-color", js.undefined)
    
    inline def `setCircle-stroke-opacity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "circle-stroke-opacity", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-opacity-transition`(value: Transition): Self = StObject.set(x, "circle-stroke-opacity-transition", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-opacity-transitionUndefined`: Self = StObject.set(x, "circle-stroke-opacity-transition", js.undefined)
    
    inline def `setCircle-stroke-opacityUndefined`: Self = StObject.set(x, "circle-stroke-opacity", js.undefined)
    
    inline def `setCircle-stroke-width`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "circle-stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-width-transition`(value: Transition): Self = StObject.set(x, "circle-stroke-width-transition", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-width-transitionUndefined`: Self = StObject.set(x, "circle-stroke-width-transition", js.undefined)
    
    inline def `setCircle-stroke-widthUndefined`: Self = StObject.set(x, "circle-stroke-width", js.undefined)
    
    inline def `setCircle-translate`(value: js.Array[Double] | Expression): Self = StObject.set(x, "circle-translate", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate-anchor`(value: map | viewport): Self = StObject.set(x, "circle-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate-anchorUndefined`: Self = StObject.set(x, "circle-translate-anchor", js.undefined)
    
    inline def `setCircle-translate-transition`(value: Transition): Self = StObject.set(x, "circle-translate-transition", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate-transitionUndefined`: Self = StObject.set(x, "circle-translate-transition", js.undefined)
    
    inline def `setCircle-translateUndefined`: Self = StObject.set(x, "circle-translate", js.undefined)
    
    inline def `setCircle-translateVarargs`(value: Double*): Self = StObject.set(x, "circle-translate", js.Array(value :_*))
  }
}
