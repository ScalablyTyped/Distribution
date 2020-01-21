package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeBackground> */
@js.native
trait PartialTypeBackground extends js.Object {
  var default: js.UndefOr[String] = js.native
  var paper: js.UndefOr[String] = js.native
}

object PartialTypeBackground {
  @scala.inline
  def apply(default: String = null, paper: String = null): PartialTypeBackground = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (paper != null) __obj.updateDynamic("paper")(paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTypeBackground]
  }
}

