package typings.gsap.gsap

import typings.gsap.gsapStrings.both
import typings.gsap.gsapStrings.in
import typings.gsap.gsapStrings.none
import typings.gsap.gsapStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoughEaseConfig extends StObject {
  
  var clamp: js.UndefOr[Boolean] = js.undefined
  
  var points: js.UndefOr[Double] = js.undefined
  
  var randomize: js.UndefOr[Boolean] = js.undefined
  
  var strength: js.UndefOr[Double] = js.undefined
  
  var taper: js.UndefOr[in | out | both | none] = js.undefined
  
  var template: js.UndefOr[Ease] = js.undefined
}
object RoughEaseConfig {
  
  inline def apply(): RoughEaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoughEaseConfig]
  }
  
  extension [Self <: RoughEaseConfig](x: Self) {
    
    inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
    
    inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setTaper(value: in | out | both | none): Self = StObject.set(x, "taper", value.asInstanceOf[js.Any])
    
    inline def setTaperUndefined: Self = StObject.set(x, "taper", js.undefined)
    
    inline def setTemplate(value: Ease): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
