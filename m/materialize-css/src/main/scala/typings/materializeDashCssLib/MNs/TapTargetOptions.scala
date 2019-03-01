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
    onClose: js.Function2[TapTarget, stdLib.Element, scala.Unit],
    onOpen: js.Function2[TapTarget, stdLib.Element, scala.Unit]
  ): TapTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClose")(onClose)
    __obj.updateDynamic("onOpen")(onOpen)
    __obj.asInstanceOf[TapTargetOptions]
  }
}

