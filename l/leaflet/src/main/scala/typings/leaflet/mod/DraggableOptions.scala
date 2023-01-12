package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableOptions extends StObject {
  
  /**
    * The max number of pixels a user can shift the mouse pointer during a click
    * for it to be considered a valid click (as opposed to a mouse drag).
    */
  var clickTolerance: Double
}
object DraggableOptions {
  
  inline def apply(clickTolerance: Double): DraggableOptions = {
    val __obj = js.Dynamic.literal(clickTolerance = clickTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableOptions] (val x: Self) extends AnyVal {
    
    inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
  }
}
