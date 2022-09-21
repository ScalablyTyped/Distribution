package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  var delta: X
  
  var distance: Double
  
  var inRange: Boolean
  
  var range: Double
  
  var target: Any
}
object Delta {
  
  inline def apply(delta: X, distance: Double, inRange: Boolean, range: Double, target: Any): Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], inRange = inRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  extension [Self <: Delta](x: Self) {
    
    inline def setDelta(value: X): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setInRange(value: Boolean): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
