package typings.granim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait X0 extends StObject {
    
    var x0: String
    
    var x1: String
    
    var y0: String
    
    var y1: String
  }
  object X0 {
    
    inline def apply(x0: String, x1: String, y0: String, y1: String): X0 = {
      val __obj = js.Dynamic.literal(x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.asInstanceOf[X0]
    }
    
    extension [Self <: X0](x: Self) {
      
      inline def setX0(value: String): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      inline def setX1(value: String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setY0(value: String): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    }
  }
}
