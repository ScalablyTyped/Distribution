package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashVertex extends StObject {
  
  def getHalfEdge(): FlashHalfEdge
  
  def setLocation(x: Double, y: Double): Any
  
  var x: Double
  
  var y: Double
}
object FlashVertex {
  
  inline def apply(getHalfEdge: () => FlashHalfEdge, setLocation: (Double, Double) => Any, x: Double, y: Double): FlashVertex = {
    val __obj = js.Dynamic.literal(getHalfEdge = js.Any.fromFunction0(getHalfEdge), setLocation = js.Any.fromFunction2(setLocation), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashVertex]
  }
  
  extension [Self <: FlashVertex](x: Self) {
    
    inline def setGetHalfEdge(value: () => FlashHalfEdge): Self = StObject.set(x, "getHalfEdge", js.Any.fromFunction0(value))
    
    inline def setSetLocation(value: (Double, Double) => Any): Self = StObject.set(x, "setLocation", js.Any.fromFunction2(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
