package typings.atIonicReact

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var isOpen: Boolean
  def onDidDismiss(
    event: CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_core.OverlayEventDetail<any> */ _
    ]
  ): Unit
}

object Anon_Event {
  @scala.inline
  def apply(
    isOpen: Boolean,
    onDidDismiss: CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_core.OverlayEventDetail<any> */ _
    ] => Unit
  ): Anon_Event = {
    val __obj = js.Dynamic.literal(isOpen = isOpen, onDidDismiss = js.Any.fromFunction1(onDidDismiss))
  
    __obj.asInstanceOf[Anon_Event]
  }
}

