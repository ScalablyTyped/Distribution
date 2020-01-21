package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A solid color.
  */
@js.native
trait SchemaColor extends js.Object {
  /**
    * The RGB color value.
    */
  var rgbColor: js.UndefOr[SchemaRgbColor] = js.native
}

object SchemaColor {
  @scala.inline
  def apply(rgbColor: SchemaRgbColor = null): SchemaColor = {
    val __obj = js.Dynamic.literal()
    if (rgbColor != null) __obj.updateDynamic("rgbColor")(rgbColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaColor]
  }
}

