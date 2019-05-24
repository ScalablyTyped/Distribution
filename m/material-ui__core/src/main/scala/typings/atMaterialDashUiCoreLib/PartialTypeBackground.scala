package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeBackground> */
trait PartialTypeBackground extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var paper: js.UndefOr[java.lang.String] = js.undefined
}

object PartialTypeBackground {
  @scala.inline
  def apply(default: java.lang.String = null, paper: java.lang.String = null): PartialTypeBackground = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (paper != null) __obj.updateDynamic("paper")(paper)
    __obj.asInstanceOf[PartialTypeBackground]
  }
}

