package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Size {
  @scala.inline
  def apply(color: ColorType = null, size: String = null): Size = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

