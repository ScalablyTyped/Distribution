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

