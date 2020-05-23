package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
}

object `0` {
  @scala.inline
  def apply(color: ColorType = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

