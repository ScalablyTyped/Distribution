package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnimation extends StObject {
  
  /**
    * End previous animation.
    */
  var animationEnd: js.UndefOr[SchemaAnimationEnd] = js.undefined
  
  /**
    * Display overlay object with fade animation.
    */
  var animationFade: js.UndefOr[SchemaAnimationFade] = js.undefined
  
  /**
    * Display static overlay object.
    */
  var animationStatic: js.UndefOr[SchemaAnimationStatic] = js.undefined
}
object SchemaAnimation {
  
  inline def apply(): SchemaAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnimation]
  }
  
  extension [Self <: SchemaAnimation](x: Self) {
    
    inline def setAnimationEnd(value: SchemaAnimationEnd): Self = StObject.set(x, "animationEnd", value.asInstanceOf[js.Any])
    
    inline def setAnimationEndUndefined: Self = StObject.set(x, "animationEnd", js.undefined)
    
    inline def setAnimationFade(value: SchemaAnimationFade): Self = StObject.set(x, "animationFade", value.asInstanceOf[js.Any])
    
    inline def setAnimationFadeUndefined: Self = StObject.set(x, "animationFade", js.undefined)
    
    inline def setAnimationStatic(value: SchemaAnimationStatic): Self = StObject.set(x, "animationStatic", value.asInstanceOf[js.Any])
    
    inline def setAnimationStaticUndefined: Self = StObject.set(x, "animationStatic", js.undefined)
  }
}
