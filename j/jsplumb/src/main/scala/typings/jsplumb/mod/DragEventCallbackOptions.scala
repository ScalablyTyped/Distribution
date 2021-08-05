package typings.jsplumb.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEventCallbackOptions extends StObject {
  
  var drag: js.Object
  
  // The associated Drag instance
  var e: MouseEvent
  
  var el: HTMLElement
  
  // element being dragged
  var pos: js.Tuple2[Double, Double]
}
object DragEventCallbackOptions {
  
  inline def apply(drag: js.Object, e: MouseEvent, el: HTMLElement, pos: js.Tuple2[Double, Double]): DragEventCallbackOptions = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEventCallbackOptions]
  }
  
  extension [Self <: DragEventCallbackOptions](x: Self) {
    
    inline def setDrag(value: js.Object): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setE(value: MouseEvent): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
