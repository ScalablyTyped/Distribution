package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragOptions extends StObject {
  
  var containment: js.UndefOr[String] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var drag: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.native
  
  var start: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.native
  
  var stop: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object DragOptions {
  
  @scala.inline
  def apply(): DragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragOptions]
  }
  
  @scala.inline
  implicit class DragOptionsMutableBuilder[Self <: DragOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainment(value: String): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDrag(value: /* params */ DragEventCallbackOptions => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setStart(value: /* params */ DragEventCallbackOptions => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: /* params */ DragEventCallbackOptions => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
