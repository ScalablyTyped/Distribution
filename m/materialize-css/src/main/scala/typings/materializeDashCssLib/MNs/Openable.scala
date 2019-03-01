package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Openable extends js.Object {
  var isOpen: scala.Boolean
  def close(): scala.Unit
  def open(): scala.Unit
}

object Openable {
  @scala.inline
  def apply(close: js.Function0[scala.Unit], isOpen: scala.Boolean, open: js.Function0[scala.Unit]): Openable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("isOpen")(isOpen)
    __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[Openable]
  }
}

