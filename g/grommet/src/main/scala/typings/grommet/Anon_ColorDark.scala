package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDark extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dark: js.UndefOr[String] = js.undefined
  var light: js.UndefOr[String] = js.undefined
}

object Anon_ColorDark {
  @scala.inline
  def apply(color: String = null, dark: String = null, light: String = null): Anon_ColorDark = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorDark]
  }
}

