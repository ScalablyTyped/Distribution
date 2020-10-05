package typings.materialUiCore.createPaletteMod

import typings.materialUiCore.anon.PartialCommonColors
import typings.materialUiCore.anon.PartialTypeAction
import typings.materialUiCore.anon.PartialTypeBackground
import typings.materialUiCore.anon.PartialTypeText
import typings.materialUiCore.mod.PaletteType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaletteOptions extends js.Object {
  var action: js.UndefOr[PartialTypeAction] = js.native
  var background: js.UndefOr[PartialTypeBackground] = js.native
  var common: js.UndefOr[PartialCommonColors] = js.native
  var contrastThreshold: js.UndefOr[Double] = js.native
  var divider: js.UndefOr[String] = js.native
  var error: js.UndefOr[PaletteColorOptions] = js.native
  var getContrastText: js.UndefOr[js.Function1[/* background */ String, String]] = js.native
  var grey: js.UndefOr[ColorPartial] = js.native
  var primary: js.UndefOr[PaletteColorOptions] = js.native
  var secondary: js.UndefOr[PaletteColorOptions] = js.native
  var text: js.UndefOr[PartialTypeText] = js.native
  var tonalOffset: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[PaletteType] = js.native
}

object PaletteOptions {
  @scala.inline
  def apply(): PaletteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaletteOptions]
  }
  @scala.inline
  implicit class PaletteOptionsOps[Self <: PaletteOptions] (val x: Self) extends AnyVal {
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
    def setAction(value: PartialTypeAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setBackground(value: PartialTypeBackground): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setCommon(value: PartialCommonColors): Self = this.set("common", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    @scala.inline
    def setContrastThreshold(value: Double): Self = this.set("contrastThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContrastThreshold: Self = this.set("contrastThreshold", js.undefined)
    @scala.inline
    def setDivider(value: String): Self = this.set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    @scala.inline
    def setError(value: PaletteColorOptions): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setGetContrastText(value: /* background */ String => String): Self = this.set("getContrastText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetContrastText: Self = this.set("getContrastText", js.undefined)
    @scala.inline
    def setGrey(value: ColorPartial): Self = this.set("grey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrey: Self = this.set("grey", js.undefined)
    @scala.inline
    def setPrimary(value: PaletteColorOptions): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setSecondary(value: PaletteColorOptions): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    @scala.inline
    def setText(value: PartialTypeText): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTonalOffset(value: Double): Self = this.set("tonalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTonalOffset: Self = this.set("tonalOffset", js.undefined)
    @scala.inline
    def setType(value: PaletteType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

