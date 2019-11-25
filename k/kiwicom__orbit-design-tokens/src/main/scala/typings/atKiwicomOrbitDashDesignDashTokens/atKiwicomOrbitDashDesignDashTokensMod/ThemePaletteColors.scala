package typings.atKiwicomOrbitDashDesignDashTokens.atKiwicomOrbitDashDesignDashTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemePaletteColors extends js.Object {
  var productDark: String
  var productDarkActive: js.UndefOr[String] = js.undefined
  var productDarkHover: js.UndefOr[String] = js.undefined
  var productDarker: js.UndefOr[String] = js.undefined
  var productLight: String
  var productLightActive: String
  var productLightHover: String
  var productNormal: String
  var productNormalActive: String
  var productNormalHover: String
}

object ThemePaletteColors {
  @scala.inline
  def apply(
    productDark: String,
    productLight: String,
    productLightActive: String,
    productLightHover: String,
    productNormal: String,
    productNormalActive: String,
    productNormalHover: String,
    productDarkActive: String = null,
    productDarkHover: String = null,
    productDarker: String = null
  ): ThemePaletteColors = {
    val __obj = js.Dynamic.literal(productDark = productDark.asInstanceOf[js.Any], productLight = productLight.asInstanceOf[js.Any], productLightActive = productLightActive.asInstanceOf[js.Any], productLightHover = productLightHover.asInstanceOf[js.Any], productNormal = productNormal.asInstanceOf[js.Any], productNormalActive = productNormalActive.asInstanceOf[js.Any], productNormalHover = productNormalHover.asInstanceOf[js.Any])
    if (productDarkActive != null) __obj.updateDynamic("productDarkActive")(productDarkActive.asInstanceOf[js.Any])
    if (productDarkHover != null) __obj.updateDynamic("productDarkHover")(productDarkHover.asInstanceOf[js.Any])
    if (productDarker != null) __obj.updateDynamic("productDarker")(productDarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemePaletteColors]
  }
}

