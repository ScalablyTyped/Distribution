package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  var angle: Double
  
  var down: Boolean
  
  var left: Boolean
  
  var right: Boolean
  
  var speed: Double
  
  var up: Boolean
  
  var velocity: X
}
object Angle {
  
  inline def apply(
    angle: Double,
    down: Boolean,
    left: Boolean,
    right: Boolean,
    speed: Double,
    up: Boolean,
    velocity: X
  ): Angle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
  
  extension [Self <: Angle](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: X): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
