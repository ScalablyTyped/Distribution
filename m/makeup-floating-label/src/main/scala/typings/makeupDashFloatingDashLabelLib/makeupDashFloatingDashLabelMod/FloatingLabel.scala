package typings
package makeupDashFloatingDashLabelLib.makeupDashFloatingDashLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingLabel extends js.Object {
  def refresh(): scala.Unit
}

object FloatingLabel {
  @scala.inline
  def apply(refresh: js.Function0[scala.Unit]): FloatingLabel = {
    val __obj = js.Dynamic.literal(refresh = refresh)
  
    __obj.asInstanceOf[FloatingLabel]
  }
}

