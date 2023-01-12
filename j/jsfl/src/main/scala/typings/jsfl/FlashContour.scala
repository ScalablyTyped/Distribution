package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashContour extends StObject {
  
  var fill: FlashFill
  
  def getHalfEdge(): FlashHalfEdge
  
  var interior: Boolean
  
  var orientation: Double
}
object FlashContour {
  
  inline def apply(fill: FlashFill, getHalfEdge: () => FlashHalfEdge, interior: Boolean, orientation: Double): FlashContour = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], getHalfEdge = js.Any.fromFunction0(getHalfEdge), interior = interior.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashContour]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashContour] (val x: Self) extends AnyVal {
    
    inline def setFill(value: FlashFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setGetHalfEdge(value: () => FlashHalfEdge): Self = StObject.set(x, "getHalfEdge", js.Any.fromFunction0(value))
    
    inline def setInterior(value: Boolean): Self = StObject.set(x, "interior", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
