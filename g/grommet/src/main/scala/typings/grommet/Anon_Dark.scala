package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dark extends js.Object {
  var dark: js.UndefOr[String] = js.undefined
  var light: js.UndefOr[String] = js.undefined
}

object Anon_Dark {
  @scala.inline
  def apply(dark: String = null, light: String = null): Anon_Dark = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark)
    if (light != null) __obj.updateDynamic("light")(light)
    __obj.asInstanceOf[Anon_Dark]
  }
}

