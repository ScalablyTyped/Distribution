package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circles extends StObject {
  
  var circles: js.Array[Double]
  
  var collisionDetected: Boolean
  
  var offscreen: Boolean
}
object Circles {
  
  inline def apply(circles: js.Array[Double], collisionDetected: Boolean, offscreen: Boolean): Circles = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], collisionDetected = collisionDetected.asInstanceOf[js.Any], offscreen = offscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circles]
  }
  
  extension [Self <: Circles](x: Self) {
    
    inline def setCircles(value: js.Array[Double]): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
    
    inline def setCirclesVarargs(value: Double*): Self = StObject.set(x, "circles", js.Array(value*))
    
    inline def setCollisionDetected(value: Boolean): Self = StObject.set(x, "collisionDetected", value.asInstanceOf[js.Any])
    
    inline def setOffscreen(value: Boolean): Self = StObject.set(x, "offscreen", value.asInstanceOf[js.Any])
  }
}
