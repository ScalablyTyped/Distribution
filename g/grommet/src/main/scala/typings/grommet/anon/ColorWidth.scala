package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorWidth extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object ColorWidth {
  @scala.inline
  def apply(color: ColorType = null, width: String = null): ColorWidth = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorWidth]
  }
}

