package typings.atMaterialDashUiLab

import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.circle
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.rect
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circle extends js.Object {
  var disableAnimate: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var variant: js.UndefOr[text | rect | circle] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object Anon_Circle {
  @scala.inline
  def apply(
    disableAnimate: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    variant: text | rect | circle = null,
    width: Double | String = null
  ): Anon_Circle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableAnimate)) __obj.updateDynamic("disableAnimate")(disableAnimate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Circle]
  }
}

