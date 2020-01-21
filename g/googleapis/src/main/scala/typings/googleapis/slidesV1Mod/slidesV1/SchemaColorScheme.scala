package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The palette of predefined colors for a page.
  */
@js.native
trait SchemaColorScheme extends js.Object {
  /**
    * The ThemeColorType and corresponding concrete color pairs.
    */
  var colors: js.UndefOr[js.Array[SchemaThemeColorPair]] = js.native
}

object SchemaColorScheme {
  @scala.inline
  def apply(colors: js.Array[SchemaThemeColorPair] = null): SchemaColorScheme = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaColorScheme]
  }
}

