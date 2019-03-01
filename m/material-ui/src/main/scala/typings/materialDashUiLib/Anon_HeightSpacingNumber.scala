package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightSpacingNumber extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
}

object Anon_HeightSpacingNumber {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, spacing: scala.Int | scala.Double = null): Anon_HeightSpacingNumber = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightSpacingNumber]
  }
}

