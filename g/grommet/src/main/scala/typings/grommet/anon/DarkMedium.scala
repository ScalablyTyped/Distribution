package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkMedium extends js.Object {
  var dark: js.UndefOr[Medium] = js.undefined
  var light: js.UndefOr[Medium] = js.undefined
}

object DarkMedium {
  @scala.inline
  def apply(dark: Medium = null, light: Medium = null): DarkMedium = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[DarkMedium]
  }
}

