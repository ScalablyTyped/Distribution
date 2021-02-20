package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashContour extends StObject {
  
  var fill: FlashFill = js.native
  
  def getHalfEdge(): FlashHalfEdge = js.native
  
  var interior: Boolean = js.native
  
  var orientation: Double = js.native
}
object FlashContour {
  
  @scala.inline
  def apply(fill: FlashFill, getHalfEdge: () => FlashHalfEdge, interior: Boolean, orientation: Double): FlashContour = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], getHalfEdge = js.Any.fromFunction0(getHalfEdge), interior = interior.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashContour]
  }
  
  @scala.inline
  implicit class FlashContourMutableBuilder[Self <: FlashContour] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: FlashFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHalfEdge(value: () => FlashHalfEdge): Self = StObject.set(x, "getHalfEdge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInterior(value: Boolean): Self = StObject.set(x, "interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
