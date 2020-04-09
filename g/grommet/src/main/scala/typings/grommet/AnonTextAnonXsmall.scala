package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextAnonXsmall extends js.Object {
  var text: js.UndefOr[AnonXsmall] = js.undefined
}

object AnonTextAnonXsmall {
  @scala.inline
  def apply(text: AnonXsmall = null): AnonTextAnonXsmall = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextAnonXsmall]
  }
}

