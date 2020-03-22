package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  var text: js.UndefOr[AnonXsmall] = js.undefined
}

object AnonText {
  @scala.inline
  def apply(text: AnonXsmall = null): AnonText = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}

