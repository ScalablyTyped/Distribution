package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Border extends js.Object {
  var border: js.UndefOr[Anon_ColorRadius] = js.undefined
  var disabled: js.UndefOr[Anon_Opacity] = js.undefined
}

object Anon_Border {
  @scala.inline
  def apply(border: Anon_ColorRadius = null, disabled: Anon_Opacity = null): Anon_Border = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Anon_Border]
  }
}

