package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleapis.anon.Background
import typings.googleapis.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdStyle extends js.Object {
  /**
    * The colors which are included in the style. These are represented as six
    * hexadecimal characters, similar to HTML color codes, but without the
    * leading hash.
    */
  var colors: js.UndefOr[Background] = js.native
  /**
    * The style of the corners in the ad (deprecated: never populated,
    * ignored).
    */
  var corners: js.UndefOr[String] = js.native
  /**
    * The font which is included in the style.
    */
  var font: js.UndefOr[Size] = js.native
  /**
    * Kind this is, in this case adsense#adStyle.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAdStyle {
  @scala.inline
  def apply(colors: Background = null, corners: String = null, font: Size = null, kind: String = null): SchemaAdStyle = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (corners != null) __obj.updateDynamic("corners")(corners.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdStyle]
  }
}

