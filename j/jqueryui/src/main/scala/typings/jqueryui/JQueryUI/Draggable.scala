package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draggable
  extends DraggableEvent
     with Widget
     with DraggableOptions {
  
  /* InferMemberOverrides */
  override def apply(T0: /* event */ JQueryEventObject, T1: /* ui */ DraggableEventUIParams): Unit = js.native
}
