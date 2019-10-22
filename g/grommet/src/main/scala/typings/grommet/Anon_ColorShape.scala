package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorShape extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object Anon_ColorShape {
  @scala.inline
  def apply(color: ColorType = null, shape: String = null, size: String = null, width: String = null): Anon_ColorShape = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (size != null) __obj.updateDynamic("size")(size)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_ColorShape]
  }
}

