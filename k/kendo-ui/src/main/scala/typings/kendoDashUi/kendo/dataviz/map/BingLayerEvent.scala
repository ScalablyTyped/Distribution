package typings.kendoDashUi.kendo.dataviz.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingLayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: BingLayer
  def isDefaultPrevented(): Boolean
}

object BingLayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: BingLayer): BingLayerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[BingLayerEvent]
  }
}

