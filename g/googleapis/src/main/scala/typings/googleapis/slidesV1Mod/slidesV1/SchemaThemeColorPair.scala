package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pair mapping a theme color type to the concrete color it represents.
  */
@js.native
trait SchemaThemeColorPair extends js.Object {
  /**
    * The concrete color corresponding to the theme color type above.
    */
  var color: js.UndefOr[SchemaRgbColor] = js.native
  /**
    * The type of the theme color.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaThemeColorPair {
  @scala.inline
  def apply(color: SchemaRgbColor = null, `type`: String = null): SchemaThemeColorPair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThemeColorPair]
  }
}

