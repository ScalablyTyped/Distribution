package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDarkArray extends js.Object {
  var dark: js.UndefOr[js.Array[String]] = js.undefined
  var light: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonDarkArray {
  @scala.inline
  def apply(dark: js.Array[String] = null, light: js.Array[String] = null): AnonDarkArray = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDarkArray]
  }
}

