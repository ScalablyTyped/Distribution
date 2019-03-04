package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeLayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ShapeLayer
  def isDefaultPrevented(): scala.Boolean
}

object ShapeLayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: ShapeLayer): ShapeLayerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ShapeLayerEvent]
  }
}

