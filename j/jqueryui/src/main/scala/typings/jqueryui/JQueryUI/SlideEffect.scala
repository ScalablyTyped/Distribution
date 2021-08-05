package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideEffect extends StObject {
  
  var direction: js.UndefOr[String] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
}
object SlideEffect {
  
  inline def apply(): SlideEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideEffect]
  }
  
  extension [Self <: SlideEffect](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
  }
}
