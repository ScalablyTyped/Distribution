package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a color in the RGB color space.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Color extends js.Object {
  /**
    * The amount of blue in the color as a value in the interval [0, 1].
    */
  var blue: js.UndefOr[Double] = js.native
  /**
    * The amount of green in the color as a value in the interval [0, 1].
    */
  var green: js.UndefOr[Double] = js.native
  /**
    * The amount of red in the color as a value in the interval [0, 1].
    */
  var red: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2Color {
  @scala.inline
  def apply(
    blue: js.UndefOr[Double] = js.undefined,
    green: js.UndefOr[Double] = js.undefined,
    red: js.UndefOr[Double] = js.undefined
  ): SchemaGooglePrivacyDlpV2Color = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blue)) __obj.updateDynamic("blue")(blue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(green)) __obj.updateDynamic("green")(green.get.asInstanceOf[js.Any])
    if (!js.isUndefined(red)) __obj.updateDynamic("red")(red.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Color]
  }
}

