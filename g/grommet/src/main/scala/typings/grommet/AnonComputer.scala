package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComputer extends js.Object {
  var computer: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
  var tablet: js.UndefOr[String] = js.undefined
}

object AnonComputer {
  @scala.inline
  def apply(computer: String = null, phone: String = null, tablet: String = null): AnonComputer = {
    val __obj = js.Dynamic.literal()
    if (computer != null) __obj.updateDynamic("computer")(computer.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComputer]
  }
}

