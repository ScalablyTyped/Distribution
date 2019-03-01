package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorFontFamily extends js.Object {
  /**
    * @default "contrast"
    * @since 6.0.0
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default "11px"
    * @since 6.0.0
    */
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default "normal"
    * @since 6.0.0
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColorFontFamily {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String = null,
    fontWeight: java.lang.String = null,
    textAlign: java.lang.String = null
  ): Anon_ColorFontFamily = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    __obj.asInstanceOf[Anon_ColorFontFamily]
  }
}

