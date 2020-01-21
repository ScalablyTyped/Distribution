package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHorizontal extends js.Object {
  var horizontal: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object AnonHorizontal {
  @scala.inline
  def apply(horizontal: String = null, vertical: String = null): AnonHorizontal = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHorizontal]
  }
}

