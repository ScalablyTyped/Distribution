package typings.jsplumb.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEventCallbackOptions extends StObject {
  
  var drag: js.Object = js.native
  
  // The associated Drag instance
  var e: MouseEvent = js.native
  
  var el: HTMLElement = js.native
  
  // element being dragged
  var pos: js.Tuple2[Double, Double] = js.native
}
object DragEventCallbackOptions {
  
  @scala.inline
  def apply(drag: js.Object, e: MouseEvent, el: HTMLElement, pos: js.Tuple2[Double, Double]): DragEventCallbackOptions = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEventCallbackOptions]
  }
  
  @scala.inline
  implicit class DragEventCallbackOptionsMutableBuilder[Self <: DragEventCallbackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrag(value: js.Object): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: MouseEvent): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
