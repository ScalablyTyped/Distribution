package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Easing extends StObject {
  
  var duration: Double
  
  def easing(_underscore: Double): Double
  
  var start: Double
}
object Easing {
  
  inline def apply(duration: Double, easing: Double => Double, start: Double): Easing = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  
  extension [Self <: Easing](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
