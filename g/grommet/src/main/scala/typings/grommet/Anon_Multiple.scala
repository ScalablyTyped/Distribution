package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Multiple extends js.Object {
  var multiple: js.UndefOr[String] = js.undefined
}

object Anon_Multiple {
  @scala.inline
  def apply(multiple: String = null): Anon_Multiple = {
    val __obj = js.Dynamic.literal()
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Multiple]
  }
}

