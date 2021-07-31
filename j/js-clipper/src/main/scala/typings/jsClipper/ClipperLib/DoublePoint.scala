package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoublePoint extends StObject {
  
  var X: Double
  
  var Y: Double
}
object DoublePoint {
  
  @scala.inline
  def apply(X: Double, Y: Double): DoublePoint = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoublePoint]
  }
  
  @scala.inline
  implicit class DoublePointMutableBuilder[Self <: DoublePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
