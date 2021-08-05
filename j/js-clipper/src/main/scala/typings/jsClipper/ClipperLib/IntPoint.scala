package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntPoint extends StObject {
  
  var X: Double
  
  var Y: Double
}
object IntPoint {
  
  inline def apply(X: Double, Y: Double): IntPoint = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntPoint]
  }
  
  extension [Self <: IntPoint](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
