package typings.kendoDashUi.kendo.dataviz.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Transformation
  def isDefaultPrevented(): Boolean
}

object TransformationEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Transformation): TransformationEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[TransformationEvent]
  }
}

