package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDown extends js.Object {
  var down: js.UndefOr[js.Any] = js.undefined
}

object AnonDown {
  @scala.inline
  def apply(down: js.Any = null): AnonDown = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDown]
  }
}

