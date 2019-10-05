package typings.materialDashUi.__MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawTheme extends js.Object {
  var fontFamily: js.UndefOr[String] = js.undefined
  var palette: js.UndefOr[ThemePalette] = js.undefined
  var spacing: js.UndefOr[Spacing] = js.undefined
}

object RawTheme {
  @scala.inline
  def apply(fontFamily: String = null, palette: ThemePalette = null, spacing: Spacing = null): RawTheme = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    __obj.asInstanceOf[RawTheme]
  }
}

