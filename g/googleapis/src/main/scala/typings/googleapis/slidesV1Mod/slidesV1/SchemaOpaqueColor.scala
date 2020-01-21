package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A themeable solid color value.
  */
@js.native
trait SchemaOpaqueColor extends js.Object {
  /**
    * An opaque RGB color.
    */
  var rgbColor: js.UndefOr[SchemaRgbColor] = js.native
  /**
    * An opaque theme color.
    */
  var themeColor: js.UndefOr[String] = js.native
}

object SchemaOpaqueColor {
  @scala.inline
  def apply(rgbColor: SchemaRgbColor = null, themeColor: String = null): SchemaOpaqueColor = {
    val __obj = js.Dynamic.literal()
    if (rgbColor != null) __obj.updateDynamic("rgbColor")(rgbColor.asInstanceOf[js.Any])
    if (themeColor != null) __obj.updateDynamic("themeColor")(themeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOpaqueColor]
  }
}

