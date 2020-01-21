package typings.googleapis.v41Mod.adsensehostV41

import typings.googleapis.AnonBackground
import typings.googleapis.AnonFamilySize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdStyle extends js.Object {
  /**
    * The colors included in the style. These are represented as six
    * hexadecimal characters, similar to HTML color codes, but without the
    * leading hash.
    */
  var colors: js.UndefOr[AnonBackground] = js.native
  /**
    * The style of the corners in the ad (deprecated: never populated,
    * ignored).
    */
  var corners: js.UndefOr[String] = js.native
  /**
    * The font which is included in the style.
    */
  var font: js.UndefOr[AnonFamilySize] = js.native
  /**
    * Kind this is, in this case adsensehost#adStyle.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAdStyle {
  @scala.inline
  def apply(
    colors: AnonBackground = null,
    corners: String = null,
    font: AnonFamilySize = null,
    kind: String = null
  ): SchemaAdStyle = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (corners != null) __obj.updateDynamic("corners")(corners.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdStyle]
  }
}

