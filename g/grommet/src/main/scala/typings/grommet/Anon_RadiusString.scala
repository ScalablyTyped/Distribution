package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RadiusString extends js.Object {
  var radius: js.UndefOr[String] = js.undefined
}

object Anon_RadiusString {
  @scala.inline
  def apply(radius: String = null): Anon_RadiusString = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius)
    __obj.asInstanceOf[Anon_RadiusString]
  }
}

