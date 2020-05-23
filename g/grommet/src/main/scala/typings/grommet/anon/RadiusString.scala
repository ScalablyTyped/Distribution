package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiusString extends js.Object {
  var radius: js.UndefOr[String] = js.undefined
}

object RadiusString {
  @scala.inline
  def apply(radius: String = null): RadiusString = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiusString]
  }
}

