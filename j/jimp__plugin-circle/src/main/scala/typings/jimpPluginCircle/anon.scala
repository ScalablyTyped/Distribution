package typings.jimpPluginCircle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Radius extends StObject {
    
    var radius: Double
    
    var x: Double
    
    var y: Double
  }
  object Radius {
    
    inline def apply(radius: Double, x: Double, y: Double): Radius = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Radius]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Radius] (val x: Self) extends AnyVal {
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
