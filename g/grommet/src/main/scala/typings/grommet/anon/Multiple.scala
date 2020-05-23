package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multiple extends js.Object {
  var multiple: js.UndefOr[String] = js.undefined
}

object Multiple {
  @scala.inline
  def apply(multiple: String = null): Multiple = {
    val __obj = js.Dynamic.literal()
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiple]
  }
}

