package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillPaint
  extends StObject
     with AnyPaint {
  
  var `fill-antialias`: js.UndefOr[Boolean | Expression] = js.undefined
  
  var `fill-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `fill-color-transition`: js.UndefOr[Transition] = js.undefined
  
  var `fill-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `fill-opacity-transition`: js.UndefOr[Transition] = js.undefined
  
  var `fill-outline-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `fill-outline-color-transition`: js.UndefOr[Transition] = js.undefined
  
  var `fill-pattern`: js.UndefOr[String | Expression] = js.undefined
  
  var `fill-pattern-transition`: js.UndefOr[Transition] = js.undefined
  
  var `fill-translate`: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `fill-translate-anchor`: js.UndefOr[map | viewport] = js.undefined
  
  var `fill-translate-transition`: js.UndefOr[Transition] = js.undefined
}
object FillPaint {
  
  inline def apply(): FillPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillPaint]
  }
  
  extension [Self <: FillPaint](x: Self) {
    
    inline def `setFill-antialias`(value: Boolean | Expression): Self = StObject.set(x, "fill-antialias", value.asInstanceOf[js.Any])
    
    inline def `setFill-antialiasUndefined`: Self = StObject.set(x, "fill-antialias", js.undefined)
    
    inline def `setFill-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "fill-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-color-transition`(value: Transition): Self = StObject.set(x, "fill-color-transition", value.asInstanceOf[js.Any])
    
    inline def `setFill-color-transitionUndefined`: Self = StObject.set(x, "fill-color-transition", js.undefined)
    
    inline def `setFill-colorUndefined`: Self = StObject.set(x, "fill-color", js.undefined)
    
    inline def `setFill-opacity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacity-transition`(value: Transition): Self = StObject.set(x, "fill-opacity-transition", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacity-transitionUndefined`: Self = StObject.set(x, "fill-opacity-transition", js.undefined)
    
    inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    inline def `setFill-outline-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "fill-outline-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-outline-color-transition`(value: Transition): Self = StObject.set(x, "fill-outline-color-transition", value.asInstanceOf[js.Any])
    
    inline def `setFill-outline-color-transitionUndefined`: Self = StObject.set(x, "fill-outline-color-transition", js.undefined)
    
    inline def `setFill-outline-colorUndefined`: Self = StObject.set(x, "fill-outline-color", js.undefined)
    
    inline def `setFill-pattern`(value: String | Expression): Self = StObject.set(x, "fill-pattern", value.asInstanceOf[js.Any])
    
    inline def `setFill-pattern-transition`(value: Transition): Self = StObject.set(x, "fill-pattern-transition", value.asInstanceOf[js.Any])
    
    inline def `setFill-pattern-transitionUndefined`: Self = StObject.set(x, "fill-pattern-transition", js.undefined)
    
    inline def `setFill-patternUndefined`: Self = StObject.set(x, "fill-pattern", js.undefined)
    
    inline def `setFill-translate`(value: js.Array[Double]): Self = StObject.set(x, "fill-translate", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate-anchor`(value: map | viewport): Self = StObject.set(x, "fill-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate-anchorUndefined`: Self = StObject.set(x, "fill-translate-anchor", js.undefined)
    
    inline def `setFill-translate-transition`(value: Transition): Self = StObject.set(x, "fill-translate-transition", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate-transitionUndefined`: Self = StObject.set(x, "fill-translate-transition", js.undefined)
    
    inline def `setFill-translateUndefined`: Self = StObject.set(x, "fill-translate", js.undefined)
    
    inline def `setFill-translateVarargs`(value: Double*): Self = StObject.set(x, "fill-translate", js.Array(value*))
  }
}
