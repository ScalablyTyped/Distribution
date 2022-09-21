package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distance extends StObject {
  
  var angle: Double
  
  var distance: Double
  
  var scale: Double
  
  var startAngle: Double
  
  var startDistance: Double
}
object Distance {
  
  inline def apply(angle: Double, distance: Double, scale: Double, startAngle: Double, startDistance: Double): Distance = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], startDistance = startDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  
  extension [Self <: Distance](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartDistance(value: Double): Self = StObject.set(x, "startDistance", value.asInstanceOf[js.Any])
  }
}
