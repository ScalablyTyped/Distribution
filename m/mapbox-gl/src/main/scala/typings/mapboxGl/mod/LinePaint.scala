package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinePaint
  extends StObject
     with AnyPaint {
  
  var `line-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `line-blur-transition`: js.UndefOr[Transition] = js.undefined
  
  var `line-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `line-color-transition`: js.UndefOr[Transition] = js.undefined
  
  var `line-dasharray`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  
  var `line-dasharray-transition`: js.UndefOr[Transition] = js.undefined
  
  var `line-gap-width`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `line-gap-width-transition`: js.UndefOr[Transition] = js.undefined
  
  var `line-gradient`: js.UndefOr[Expression] = js.undefined
  
  var `line-offset`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `line-offset-transition`: js.UndefOr[Transition] = js.undefined
  
  var `line-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `line-opacity-transition`: js.UndefOr[Transition] = js.undefined
  
  var `line-pattern`: js.UndefOr[String | Expression] = js.undefined
  
  var `line-pattern-transition`: js.UndefOr[Transition] = js.undefined
  
  var `line-translate`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  
  var `line-translate-anchor`: js.UndefOr[map | viewport] = js.undefined
  
  var `line-translate-transition`: js.UndefOr[Transition] = js.undefined
  
  var `line-width`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `line-width-transition`: js.UndefOr[Transition] = js.undefined
}
object LinePaint {
  
  inline def apply(): LinePaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinePaint]
  }
  
  extension [Self <: LinePaint](x: Self) {
    
    inline def `setLine-blur`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "line-blur", value.asInstanceOf[js.Any])
    
    inline def `setLine-blur-transition`(value: Transition): Self = StObject.set(x, "line-blur-transition", value.asInstanceOf[js.Any])
    
    inline def `setLine-blur-transitionUndefined`: Self = StObject.set(x, "line-blur-transition", js.undefined)
    
    inline def `setLine-blurUndefined`: Self = StObject.set(x, "line-blur", js.undefined)
    
    inline def `setLine-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    inline def `setLine-color-transition`(value: Transition): Self = StObject.set(x, "line-color-transition", value.asInstanceOf[js.Any])
    
    inline def `setLine-color-transitionUndefined`: Self = StObject.set(x, "line-color-transition", js.undefined)
    
    inline def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
    inline def `setLine-dasharray`(value: js.Array[Double] | Expression): Self = StObject.set(x, "line-dasharray", value.asInstanceOf[js.Any])
    
    inline def `setLine-dasharray-transition`(value: Transition): Self = StObject.set(x, "line-dasharray-transition", value.asInstanceOf[js.Any])
    
    inline def `setLine-dasharray-transitionUndefined`: Self = StObject.set(x, "line-dasharray-transition", js.undefined)
    
    inline def `setLine-dasharrayUndefined`: Self = StObject.set(x, "line-dasharray", js.undefined)
    
    inline def `setLine-dasharrayVarargs`(value: Double*): Self = StObject.set(x, "line-dasharray", js.Array(value*))
    
    inline def `setLine-gap-width`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "line-gap-width", value.asInstanceOf[js.Any])
    
    inline def `setLine-gap-width-transition`(value: Transition): Self = StObject.set(x, "line-gap-width-transition", value.asInstanceOf[js.Any])
    
    inline def `setLine-gap-width-transitionUndefined`: Self = StObject.set(x, "line-gap-width-transition", js.undefined)
    
    inline def `setLine-gap-widthUndefined`: Self = StObject.set(x, "line-gap-width", js.undefined)
    
    inline def `setLine-gradient`(value: Expression): Self = StObject.set(x, "line-gradient", value.asInstanceOf[js.Any])
    
    inline def `setLine-gradientUndefined`: Self = StObject.set(x, "line-gradient", js.undefined)
    
    inline def `setLine-offset`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "line-offset", value.asInstanceOf[js.Any])
    
    inline def `setLine-offset-transition`(value: Transition): Self = StObject.set(x, "line-offset-transition", value.asInstanceOf[js.Any])
    
    inline def `setLine-offset-transitionUndefined`: Self = StObject.set(x, "line-offset-transition", js.undefined)
    
    inline def `setLine-offsetUndefined`: Self = StObject.set(x, "line-offset", js.undefined)
    
    inline def `setLine-opacity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "line-opacity", value.asInstanceOf[js.Any])
    
    inline def `setLine-opacity-transition`(value: Transition): Self = StObject.set(x, "line-opacity-transition", value.asInstanceOf[js.Any])
    
    inline def `setLine-opacity-transitionUndefined`: Self = StObject.set(x, "line-opacity-transition", js.undefined)
    
    inline def `setLine-opacityUndefined`: Self = StObject.set(x, "line-opacity", js.undefined)
    
    inline def `setLine-pattern`(value: String | Expression): Self = StObject.set(x, "line-pattern", value.asInstanceOf[js.Any])
    
    inline def `setLine-pattern-transition`(value: Transition): Self = StObject.set(x, "line-pattern-transition", value.asInstanceOf[js.Any])
    
    inline def `setLine-pattern-transitionUndefined`: Self = StObject.set(x, "line-pattern-transition", js.undefined)
    
    inline def `setLine-patternUndefined`: Self = StObject.set(x, "line-pattern", js.undefined)
    
    inline def `setLine-translate`(value: js.Array[Double] | Expression): Self = StObject.set(x, "line-translate", value.asInstanceOf[js.Any])
    
    inline def `setLine-translate-anchor`(value: map | viewport): Self = StObject.set(x, "line-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setLine-translate-anchorUndefined`: Self = StObject.set(x, "line-translate-anchor", js.undefined)
    
    inline def `setLine-translate-transition`(value: Transition): Self = StObject.set(x, "line-translate-transition", value.asInstanceOf[js.Any])
    
    inline def `setLine-translate-transitionUndefined`: Self = StObject.set(x, "line-translate-transition", js.undefined)
    
    inline def `setLine-translateUndefined`: Self = StObject.set(x, "line-translate", js.undefined)
    
    inline def `setLine-translateVarargs`(value: Double*): Self = StObject.set(x, "line-translate", js.Array(value*))
    
    inline def `setLine-width`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "line-width", value.asInstanceOf[js.Any])
    
    inline def `setLine-width-transition`(value: Transition): Self = StObject.set(x, "line-width-transition", value.asInstanceOf[js.Any])
    
    inline def `setLine-width-transitionUndefined`: Self = StObject.set(x, "line-width-transition", js.undefined)
    
    inline def `setLine-widthUndefined`: Self = StObject.set(x, "line-width", js.undefined)
  }
}
