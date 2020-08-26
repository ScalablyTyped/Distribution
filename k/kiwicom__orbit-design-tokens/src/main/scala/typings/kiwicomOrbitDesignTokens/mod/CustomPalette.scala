package typings.kiwicomOrbitDesignTokens.mod

import typings.kiwicomOrbitDesignTokens.anon.PartialCloudColor
import typings.kiwicomOrbitDesignTokens.anon.PartialInkColor
import typings.kiwicomOrbitDesignTokens.anon.PartialProductColor
import typings.kiwicomOrbitDesignTokens.anon.PartialSocialColor
import typings.kiwicomOrbitDesignTokens.anon.PartialStatusColor
import typings.kiwicomOrbitDesignTokens.anon.PartialWhiteColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPalette extends js.Object {
  var blue: js.UndefOr[PartialStatusColor] = js.native
  var cloud: js.UndefOr[PartialCloudColor] = js.native
  var green: js.UndefOr[PartialStatusColor] = js.native
  var ink: js.UndefOr[PartialInkColor] = js.native
  var orange: js.UndefOr[PartialStatusColor] = js.native
  var product: js.UndefOr[PartialProductColor] = js.native
  var red: js.UndefOr[PartialStatusColor] = js.native
  var social: js.UndefOr[PartialSocialColor] = js.native
  var white: js.UndefOr[PartialWhiteColor] = js.native
}

object CustomPalette {
  @scala.inline
  def apply(): CustomPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPalette]
  }
  @scala.inline
  implicit class CustomPaletteOps[Self <: CustomPalette] (val x: Self) extends AnyVal {
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
    def setBlue(value: PartialStatusColor): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlue: Self = this.set("blue", js.undefined)
    @scala.inline
    def setCloud(value: PartialCloudColor): Self = this.set("cloud", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloud: Self = this.set("cloud", js.undefined)
    @scala.inline
    def setGreen(value: PartialStatusColor): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreen: Self = this.set("green", js.undefined)
    @scala.inline
    def setInk(value: PartialInkColor): Self = this.set("ink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInk: Self = this.set("ink", js.undefined)
    @scala.inline
    def setOrange(value: PartialStatusColor): Self = this.set("orange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrange: Self = this.set("orange", js.undefined)
    @scala.inline
    def setProduct(value: PartialProductColor): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    @scala.inline
    def setRed(value: PartialStatusColor): Self = this.set("red", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRed: Self = this.set("red", js.undefined)
    @scala.inline
    def setSocial(value: PartialSocialColor): Self = this.set("social", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocial: Self = this.set("social", js.undefined)
    @scala.inline
    def setWhite(value: PartialWhiteColor): Self = this.set("white", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhite: Self = this.set("white", js.undefined)
  }
  
}

