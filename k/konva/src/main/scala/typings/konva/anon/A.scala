package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A extends StObject {
  
  var a: Double
  
  var b: js.Any
  
  var g: js.Any
  
  var r: js.Any
}
object A {
  
  inline def apply(a: Double, b: js.Any, g: js.Any, r: js.Any): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
  
  extension [Self <: A](x: Self) {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: js.Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: js.Any): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: js.Any): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
