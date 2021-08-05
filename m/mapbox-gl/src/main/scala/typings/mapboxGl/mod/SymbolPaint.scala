package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolPaint
  extends StObject
     with AnyPaint {
  
  var `icon-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `icon-color-transition`: js.UndefOr[Transition] = js.undefined
  
  var `icon-halo-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `icon-halo-blur-transition`: js.UndefOr[Transition] = js.undefined
  
  var `icon-halo-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `icon-halo-color-transition`: js.UndefOr[Transition] = js.undefined
  
  var `icon-halo-width`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `icon-halo-width-transition`: js.UndefOr[Transition] = js.undefined
  
  var `icon-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `icon-opacity-transition`: js.UndefOr[Transition] = js.undefined
  
  var `icon-translate`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  
  var `icon-translate-anchor`: js.UndefOr[map | viewport] = js.undefined
  
  var `icon-translate-transition`: js.UndefOr[Transition] = js.undefined
  
  var `text-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `text-color-transition`: js.UndefOr[Transition] = js.undefined
  
  var `text-halo-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `text-halo-blur-transition`: js.UndefOr[Transition] = js.undefined
  
  var `text-halo-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `text-halo-color-transition`: js.UndefOr[Transition] = js.undefined
  
  var `text-halo-width`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `text-halo-width-transition`: js.UndefOr[Transition] = js.undefined
  
  var `text-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `text-opacity-transition`: js.UndefOr[Transition] = js.undefined
  
  var `text-translate`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  
  var `text-translate-anchor`: js.UndefOr[map | viewport] = js.undefined
  
  var `text-translate-transition`: js.UndefOr[Transition] = js.undefined
}
object SymbolPaint {
  
  inline def apply(): SymbolPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolPaint]
  }
  
  extension [Self <: SymbolPaint](x: Self) {
    
    inline def `setIcon-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "icon-color", value.asInstanceOf[js.Any])
    
    inline def `setIcon-color-transition`(value: Transition): Self = StObject.set(x, "icon-color-transition", value.asInstanceOf[js.Any])
    
    inline def `setIcon-color-transitionUndefined`: Self = StObject.set(x, "icon-color-transition", js.undefined)
    
    inline def `setIcon-colorUndefined`: Self = StObject.set(x, "icon-color", js.undefined)
    
    inline def `setIcon-halo-blur`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "icon-halo-blur", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-blur-transition`(value: Transition): Self = StObject.set(x, "icon-halo-blur-transition", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-blur-transitionUndefined`: Self = StObject.set(x, "icon-halo-blur-transition", js.undefined)
    
    inline def `setIcon-halo-blurUndefined`: Self = StObject.set(x, "icon-halo-blur", js.undefined)
    
    inline def `setIcon-halo-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "icon-halo-color", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-color-transition`(value: Transition): Self = StObject.set(x, "icon-halo-color-transition", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-color-transitionUndefined`: Self = StObject.set(x, "icon-halo-color-transition", js.undefined)
    
    inline def `setIcon-halo-colorUndefined`: Self = StObject.set(x, "icon-halo-color", js.undefined)
    
    inline def `setIcon-halo-width`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "icon-halo-width", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-width-transition`(value: Transition): Self = StObject.set(x, "icon-halo-width-transition", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-width-transitionUndefined`: Self = StObject.set(x, "icon-halo-width-transition", js.undefined)
    
    inline def `setIcon-halo-widthUndefined`: Self = StObject.set(x, "icon-halo-width", js.undefined)
    
    inline def `setIcon-opacity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "icon-opacity", value.asInstanceOf[js.Any])
    
    inline def `setIcon-opacity-transition`(value: Transition): Self = StObject.set(x, "icon-opacity-transition", value.asInstanceOf[js.Any])
    
    inline def `setIcon-opacity-transitionUndefined`: Self = StObject.set(x, "icon-opacity-transition", js.undefined)
    
    inline def `setIcon-opacityUndefined`: Self = StObject.set(x, "icon-opacity", js.undefined)
    
    inline def `setIcon-translate`(value: js.Array[Double] | Expression): Self = StObject.set(x, "icon-translate", value.asInstanceOf[js.Any])
    
    inline def `setIcon-translate-anchor`(value: map | viewport): Self = StObject.set(x, "icon-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setIcon-translate-anchorUndefined`: Self = StObject.set(x, "icon-translate-anchor", js.undefined)
    
    inline def `setIcon-translate-transition`(value: Transition): Self = StObject.set(x, "icon-translate-transition", value.asInstanceOf[js.Any])
    
    inline def `setIcon-translate-transitionUndefined`: Self = StObject.set(x, "icon-translate-transition", js.undefined)
    
    inline def `setIcon-translateUndefined`: Self = StObject.set(x, "icon-translate", js.undefined)
    
    inline def `setIcon-translateVarargs`(value: Double*): Self = StObject.set(x, "icon-translate", js.Array(value :_*))
    
    inline def `setText-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "text-color", value.asInstanceOf[js.Any])
    
    inline def `setText-color-transition`(value: Transition): Self = StObject.set(x, "text-color-transition", value.asInstanceOf[js.Any])
    
    inline def `setText-color-transitionUndefined`: Self = StObject.set(x, "text-color-transition", js.undefined)
    
    inline def `setText-colorUndefined`: Self = StObject.set(x, "text-color", js.undefined)
    
    inline def `setText-halo-blur`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "text-halo-blur", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-blur-transition`(value: Transition): Self = StObject.set(x, "text-halo-blur-transition", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-blur-transitionUndefined`: Self = StObject.set(x, "text-halo-blur-transition", js.undefined)
    
    inline def `setText-halo-blurUndefined`: Self = StObject.set(x, "text-halo-blur", js.undefined)
    
    inline def `setText-halo-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "text-halo-color", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-color-transition`(value: Transition): Self = StObject.set(x, "text-halo-color-transition", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-color-transitionUndefined`: Self = StObject.set(x, "text-halo-color-transition", js.undefined)
    
    inline def `setText-halo-colorUndefined`: Self = StObject.set(x, "text-halo-color", js.undefined)
    
    inline def `setText-halo-width`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "text-halo-width", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-width-transition`(value: Transition): Self = StObject.set(x, "text-halo-width-transition", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-width-transitionUndefined`: Self = StObject.set(x, "text-halo-width-transition", js.undefined)
    
    inline def `setText-halo-widthUndefined`: Self = StObject.set(x, "text-halo-width", js.undefined)
    
    inline def `setText-opacity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "text-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-opacity-transition`(value: Transition): Self = StObject.set(x, "text-opacity-transition", value.asInstanceOf[js.Any])
    
    inline def `setText-opacity-transitionUndefined`: Self = StObject.set(x, "text-opacity-transition", js.undefined)
    
    inline def `setText-opacityUndefined`: Self = StObject.set(x, "text-opacity", js.undefined)
    
    inline def `setText-translate`(value: js.Array[Double] | Expression): Self = StObject.set(x, "text-translate", value.asInstanceOf[js.Any])
    
    inline def `setText-translate-anchor`(value: map | viewport): Self = StObject.set(x, "text-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-translate-anchorUndefined`: Self = StObject.set(x, "text-translate-anchor", js.undefined)
    
    inline def `setText-translate-transition`(value: Transition): Self = StObject.set(x, "text-translate-transition", value.asInstanceOf[js.Any])
    
    inline def `setText-translate-transitionUndefined`: Self = StObject.set(x, "text-translate-transition", js.undefined)
    
    inline def `setText-translateUndefined`: Self = StObject.set(x, "text-translate", js.undefined)
    
    inline def `setText-translateVarargs`(value: Double*): Self = StObject.set(x, "text-translate", js.Array(value :_*))
  }
}
