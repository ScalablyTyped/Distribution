package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnalog extends js.Object {
  var analog: js.UndefOr[AnonHour] = js.undefined
  var digital: js.UndefOr[AnonTextAnonXsmall] = js.undefined
}

object AnonAnalog {
  @scala.inline
  def apply(analog: AnonHour = null, digital: AnonTextAnonXsmall = null): AnonAnalog = {
    val __obj = js.Dynamic.literal()
    if (analog != null) __obj.updateDynamic("analog")(analog.asInstanceOf[js.Any])
    if (digital != null) __obj.updateDynamic("digital")(digital.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnalog]
  }
}

