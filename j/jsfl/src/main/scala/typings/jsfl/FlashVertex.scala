package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashVertex extends StObject {
  
  def getHalfEdge(): FlashHalfEdge = js.native
  
  def setLocation(x: Double, y: Double): js.Any = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object FlashVertex {
  
  @scala.inline
  def apply(getHalfEdge: () => FlashHalfEdge, setLocation: (Double, Double) => js.Any, x: Double, y: Double): FlashVertex = {
    val __obj = js.Dynamic.literal(getHalfEdge = js.Any.fromFunction0(getHalfEdge), setLocation = js.Any.fromFunction2(setLocation), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashVertex]
  }
  
  @scala.inline
  implicit class FlashVertexMutableBuilder[Self <: FlashVertex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHalfEdge(value: () => FlashHalfEdge): Self = StObject.set(x, "getHalfEdge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLocation(value: (Double, Double) => js.Any): Self = StObject.set(x, "setLocation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
