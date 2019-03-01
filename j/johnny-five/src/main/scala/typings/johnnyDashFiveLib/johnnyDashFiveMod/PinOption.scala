package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinOption extends js.Object {
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var pin: scala.Double | java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PinOption {
  @scala.inline
  def apply(
    pin: scala.Double | java.lang.String,
    id: scala.Double | java.lang.String = null,
    `type`: java.lang.String = null
  ): PinOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PinOption]
  }
}

