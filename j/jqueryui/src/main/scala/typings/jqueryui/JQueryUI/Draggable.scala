package typings.jqueryui.JQueryUI

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draggable
  extends DraggableEvent
     with Widget
     with DraggableOptions {
  /* InferMemberOverrides */
  override def apply(T0: /* event */ Event, T1: /* ui */ DraggableEventUIParams): Unit = js.native
}

