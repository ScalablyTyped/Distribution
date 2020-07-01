package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Outline extends js.Object {
  var border: js.UndefOr[`1`] = js.undefined
  var outline: js.UndefOr[Size] = js.undefined
  var shadow: js.UndefOr[Size] = js.undefined
}

object Outline {
  @scala.inline
  def apply(border: `1` = null, outline: Size = null, shadow: Size = null): Outline = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outline]
  }
}

