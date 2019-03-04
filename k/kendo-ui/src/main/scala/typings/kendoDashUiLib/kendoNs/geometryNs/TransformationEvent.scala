package typings
package kendoDashUiLib.kendoNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Transformation
  def isDefaultPrevented(): scala.Boolean
}

object TransformationEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Transformation
  ): TransformationEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[TransformationEvent]
  }
}

