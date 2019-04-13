package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEventCallbackOptions extends js.Object {
  var drag: js.Object
   // The associated Drag instance
  var e: stdLib.MouseEvent
  var el: stdLib.HTMLElement
   // element being dragged
  var pos: js.Tuple2[scala.Double, scala.Double]
}

object DragEventCallbackOptions {
  @scala.inline
  def apply(
    drag: js.Object,
    e: stdLib.MouseEvent,
    el: stdLib.HTMLElement,
    pos: js.Tuple2[scala.Double, scala.Double]
  ): DragEventCallbackOptions = {
    val __obj = js.Dynamic.literal(drag = drag, e = e, el = el, pos = pos)
  
    __obj.asInstanceOf[DragEventCallbackOptions]
  }
}

