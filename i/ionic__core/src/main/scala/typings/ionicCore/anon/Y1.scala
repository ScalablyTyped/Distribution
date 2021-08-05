package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y1 extends StObject {
  
  var style: Transform
  
  var y1: Double
  
  var y2: Double
}
object Y1 {
  
  inline def apply(style: Transform, y1: Double, y2: Double): Y1 = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y1]
  }
  
  extension [Self <: Y1](x: Self) {
    
    inline def setStyle(value: Transform): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
