package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamily extends js.Object {
  /**
    * @default sans-serif
    * @since 6.0.0
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 900
    * @since 6.0.0
    */
  var fontWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_FontFamily {
  @scala.inline
  def apply(fontFamily: java.lang.String = null, fontWeight: scala.Double | java.lang.String = null): Anon_FontFamily = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FontFamily]
  }
}

