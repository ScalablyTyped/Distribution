package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamily extends js.Object {
  var fontFamily: js.UndefOr[csstypeLib.csstypeMod.FontFamilyProperty]
  var fontSize: scala.Double
  var fontWeightLight: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]
  var fontWeightMedium: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]
  var fontWeightRegular: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]
}

object Anon_FontFamily {
  @scala.inline
  def apply(
    fontSize: scala.Double,
    fontFamily: csstypeLib.csstypeMod.FontFamilyProperty = null,
    fontWeightLight: csstypeLib.csstypeMod.FontWeightProperty = null,
    fontWeightMedium: csstypeLib.csstypeMod.FontWeightProperty = null,
    fontWeightRegular: csstypeLib.csstypeMod.FontWeightProperty = null
  ): Anon_FontFamily = {
    val __obj = js.Dynamic.literal(fontSize = fontSize)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontWeightLight != null) __obj.updateDynamic("fontWeightLight")(fontWeightLight)
    if (fontWeightMedium != null) __obj.updateDynamic("fontWeightMedium")(fontWeightMedium)
    if (fontWeightRegular != null) __obj.updateDynamic("fontWeightRegular")(fontWeightRegular)
    __obj.asInstanceOf[Anon_FontFamily]
  }
}

