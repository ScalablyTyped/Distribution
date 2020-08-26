package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemePaletteColors extends js.Object {
  var productDark: String = js.native
  var productDarkActive: js.UndefOr[String] = js.native
  var productDarkHover: js.UndefOr[String] = js.native
  var productDarker: js.UndefOr[String] = js.native
  var productLight: String = js.native
  var productLightActive: String = js.native
  var productLightHover: String = js.native
  var productNormal: String = js.native
  var productNormalActive: String = js.native
  var productNormalHover: String = js.native
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
    productNormalHover: String
  ): ThemePaletteColors = {
    val __obj = js.Dynamic.literal(productDark = productDark.asInstanceOf[js.Any], productLight = productLight.asInstanceOf[js.Any], productLightActive = productLightActive.asInstanceOf[js.Any], productLightHover = productLightHover.asInstanceOf[js.Any], productNormal = productNormal.asInstanceOf[js.Any], productNormalActive = productNormalActive.asInstanceOf[js.Any], productNormalHover = productNormalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemePaletteColors]
  }
  @scala.inline
  implicit class ThemePaletteColorsOps[Self <: ThemePaletteColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProductDark(value: String): Self = this.set("productDark", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductLight(value: String): Self = this.set("productLight", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductLightActive(value: String): Self = this.set("productLightActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductLightHover(value: String): Self = this.set("productLightHover", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductNormal(value: String): Self = this.set("productNormal", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductNormalActive(value: String): Self = this.set("productNormalActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductNormalHover(value: String): Self = this.set("productNormalHover", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductDarkActive(value: String): Self = this.set("productDarkActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductDarkActive: Self = this.set("productDarkActive", js.undefined)
    @scala.inline
    def setProductDarkHover(value: String): Self = this.set("productDarkHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductDarkHover: Self = this.set("productDarkHover", js.undefined)
    @scala.inline
    def setProductDarker(value: String): Self = this.set("productDarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductDarker: Self = this.set("productDarker", js.undefined)
  }
  
}

