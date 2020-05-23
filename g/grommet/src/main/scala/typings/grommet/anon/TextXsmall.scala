package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextXsmall extends js.Object {
  var text: js.UndefOr[Xsmall] = js.undefined
}

object TextXsmall {
  @scala.inline
  def apply(text: Xsmall = null): TextXsmall = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextXsmall]
  }
}

