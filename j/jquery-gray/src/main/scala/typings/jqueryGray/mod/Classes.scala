package typings.jqueryGray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  fade  :string}> */
trait Classes extends js.Object {
  var fade: js.UndefOr[String] = js.undefined
}

object Classes {
  @scala.inline
  def apply(fade: String = null): Classes = {
    val __obj = js.Dynamic.literal()
    if (fade != null) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
}

