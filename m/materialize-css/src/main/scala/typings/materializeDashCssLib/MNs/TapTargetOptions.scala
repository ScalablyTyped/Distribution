package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapTargetOptions extends js.Object {
  /**
    * Callback function called when Tap Target is closed
    * @default null
    */
  def onClose(`this`: TapTarget, origin: stdLib.Element): scala.Unit
  /**
    * Callback function called when Tap Target is opened
    * @default null
    */
  def onOpen(`this`: TapTarget, origin: stdLib.Element): scala.Unit
}

object TapTargetOptions {
  @scala.inline
  def apply(
    onClose: (TapTarget, stdLib.Element) => scala.Unit,
    onOpen: (TapTarget, stdLib.Element) => scala.Unit
  ): TapTargetOptions = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction2(onClose), onOpen = js.Any.fromFunction2(onOpen))
  
    __obj.asInstanceOf[TapTargetOptions]
  }
}

