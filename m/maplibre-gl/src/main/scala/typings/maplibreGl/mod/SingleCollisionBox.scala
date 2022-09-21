package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleCollisionBox extends StObject {
  
  var anchorPointX: Double
  
  var anchorPointY: Double
  
  var x1: Double
  
  var x2: Double
  
  var y1: Double
  
  var y2: Double
}
object SingleCollisionBox {
  
  inline def apply(anchorPointX: Double, anchorPointY: Double, x1: Double, x2: Double, y1: Double, y2: Double): SingleCollisionBox = {
    val __obj = js.Dynamic.literal(anchorPointX = anchorPointX.asInstanceOf[js.Any], anchorPointY = anchorPointY.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleCollisionBox]
  }
  
  extension [Self <: SingleCollisionBox](x: Self) {
    
    inline def setAnchorPointX(value: Double): Self = StObject.set(x, "anchorPointX", value.asInstanceOf[js.Any])
    
    inline def setAnchorPointY(value: Double): Self = StObject.set(x, "anchorPointY", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
