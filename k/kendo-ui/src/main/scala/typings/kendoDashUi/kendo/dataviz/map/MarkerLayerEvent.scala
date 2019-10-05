package typings.kendoDashUi.kendo.dataviz.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerLayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MarkerLayer
  def isDefaultPrevented(): Boolean
}

object MarkerLayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: MarkerLayer): MarkerLayerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MarkerLayerEvent]
  }
}

