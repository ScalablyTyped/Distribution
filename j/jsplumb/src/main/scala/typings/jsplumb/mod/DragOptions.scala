package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragOptions extends StObject {
  
  var containment: js.UndefOr[String] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object DragOptions {
  
  inline def apply(): DragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragOptions] (val x: Self) extends AnyVal {
    
    inline def setContainment(value: String): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    inline def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDrag(value: /* params */ DragEventCallbackOptions => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setStart(value: /* params */ DragEventCallbackOptions => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: /* params */ DragEventCallbackOptions => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
