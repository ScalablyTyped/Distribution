package typings.hammerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HammerPoint extends StObject {
  
  var x: Double
  
  var y: Double
}
object HammerPoint {
  
  @scala.inline
  def apply(x: Double, y: Double): HammerPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[HammerPoint]
  }
  
  @scala.inline
  implicit class HammerPointMutableBuilder[Self <: HammerPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
