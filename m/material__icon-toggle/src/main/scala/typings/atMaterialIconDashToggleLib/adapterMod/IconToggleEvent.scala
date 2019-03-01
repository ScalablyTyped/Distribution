package typings
package atMaterialIconDashToggleLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconToggleEvent extends js.Object {
  var isOn: scala.Boolean
}

object IconToggleEvent {
  @scala.inline
  def apply(isOn: scala.Boolean): IconToggleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isOn")(isOn)
    __obj.asInstanceOf[IconToggleEvent]
  }
}

