package typings.haxballHeadlessBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollisionFlagsObject extends StObject {
  
  var all: Double
  
  var ball: Double
  
  var blue: Double
  
  var blueKO: Double
  
  var c0: Double
  
  var c1: Double
  
  var c2: Double
  
  var c3: Double
  
  var kick: Double
  
  var red: Double
  
  var redKO: Double
  
  var score: Double
  
  var wall: Double
}
object CollisionFlagsObject {
  
  inline def apply(
    all: Double,
    ball: Double,
    blue: Double,
    blueKO: Double,
    c0: Double,
    c1: Double,
    c2: Double,
    c3: Double,
    kick: Double,
    red: Double,
    redKO: Double,
    score: Double,
    wall: Double
  ): CollisionFlagsObject = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], ball = ball.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], blueKO = blueKO.asInstanceOf[js.Any], c0 = c0.asInstanceOf[js.Any], c1 = c1.asInstanceOf[js.Any], c2 = c2.asInstanceOf[js.Any], c3 = c3.asInstanceOf[js.Any], kick = kick.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], redKO = redKO.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], wall = wall.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionFlagsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollisionFlagsObject] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setBall(value: Double): Self = StObject.set(x, "ball", value.asInstanceOf[js.Any])
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setBlueKO(value: Double): Self = StObject.set(x, "blueKO", value.asInstanceOf[js.Any])
    
    inline def setC0(value: Double): Self = StObject.set(x, "c0", value.asInstanceOf[js.Any])
    
    inline def setC1(value: Double): Self = StObject.set(x, "c1", value.asInstanceOf[js.Any])
    
    inline def setC2(value: Double): Self = StObject.set(x, "c2", value.asInstanceOf[js.Any])
    
    inline def setC3(value: Double): Self = StObject.set(x, "c3", value.asInstanceOf[js.Any])
    
    inline def setKick(value: Double): Self = StObject.set(x, "kick", value.asInstanceOf[js.Any])
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setRedKO(value: Double): Self = StObject.set(x, "redKO", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setWall(value: Double): Self = StObject.set(x, "wall", value.asInstanceOf[js.Any])
  }
}
