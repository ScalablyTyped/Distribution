package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndent extends js.Object {
  var indent: js.UndefOr[Double] = js.undefined
}

object AnonIndent {
  @scala.inline
  def apply(indent: Int | Double = null): AnonIndent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndent]
  }
}

