package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object Shape {
  @scala.inline
  def apply(color: ColorType = null, shape: String = null, size: String = null, width: String = null): Shape = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

