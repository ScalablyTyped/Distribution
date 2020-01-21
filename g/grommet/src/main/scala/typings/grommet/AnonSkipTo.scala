package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSkipTo extends js.Object {
  var skipTo: js.UndefOr[String] = js.undefined
}

object AnonSkipTo {
  @scala.inline
  def apply(skipTo: String = null): AnonSkipTo = {
    val __obj = js.Dynamic.literal()
    if (skipTo != null) __obj.updateDynamic("skipTo")(skipTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSkipTo]
  }
}

