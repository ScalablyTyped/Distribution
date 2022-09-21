package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragStopEventUIParam extends StObject {
  
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the offset.
    */
  var offset: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the original position of the draggable element.
    */
  var originalPosition: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[Any] = js.undefined
}
object DragStopEventUIParam {
  
  inline def apply(): DragStopEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragStopEventUIParam]
  }
  
  extension [Self <: DragStopEventUIParam](x: Self) {
    
    inline def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOriginalPosition(value: Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    inline def setOriginalPositionUndefined: Self = StObject.set(x, "originalPosition", js.undefined)
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
