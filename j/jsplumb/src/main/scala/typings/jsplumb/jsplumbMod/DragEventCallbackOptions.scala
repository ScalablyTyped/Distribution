package typings.jsplumb.jsplumbMod

import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEventCallbackOptions extends js.Object {
  var drag: js.Object
   // The associated Drag instance
  var e: MouseEvent
  var el: HTMLElement
   // element being dragged
  var pos: js.Tuple2[Double, Double]
}

object DragEventCallbackOptions {
  @scala.inline
  def apply(drag: js.Object, e: MouseEvent, el: HTMLElement, pos: js.Tuple2[Double, Double]): DragEventCallbackOptions = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DragEventCallbackOptions]
  }
}

