package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.Base> */
@js.native
trait CustomBase extends js.Object {
  
  var borderRadius: js.UndefOr[String] = js.native
  
  var boxShadowActionable: js.UndefOr[String] = js.native
  
  var boxShadowColorActionable: js.UndefOr[String] = js.native
  
  var boxShadowColorElevated: js.UndefOr[String] = js.native
  
  var boxShadowColorModal: js.UndefOr[String] = js.native
  
  var boxShadowColorStatic: js.UndefOr[String] = js.native
  
  var boxShadowElevated: js.UndefOr[String] = js.native
  
  var boxShadowModal: js.UndefOr[String] = js.native
  
  var boxShadowStatic: js.UndefOr[String] = js.native
  
  var durationFast: js.UndefOr[String] = js.native
  
  var durationNormal: js.UndefOr[String] = js.native
  
  var durationSlow: js.UndefOr[String] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSizeLg: js.UndefOr[String] = js.native
  
  var fontSizeMd: js.UndefOr[String] = js.native
  
  var fontSizeSm: js.UndefOr[String] = js.native
  
  var fontWeightBold: js.UndefOr[String] = js.native
  
  var fontWeightMedium: js.UndefOr[String] = js.native
  
  var fontWeightNormal: js.UndefOr[String] = js.native
  
  var lineHeight: js.UndefOr[String] = js.native
  
  var opacityLarge: js.UndefOr[String] = js.native
  
  var opacityMedium: js.UndefOr[String] = js.native
  
  var opacitySmall: js.UndefOr[String] = js.native
  
  var size2xl: js.UndefOr[String] = js.native
  
  var sizeLg: js.UndefOr[String] = js.native
  
  var sizeMd: js.UndefOr[String] = js.native
  
  var sizeSm: js.UndefOr[String] = js.native
  
  var sizeXl: js.UndefOr[String] = js.native
  
  var space2xl: js.UndefOr[String] = js.native
  
  var space2xs: js.UndefOr[String] = js.native
  
  var space3xl: js.UndefOr[String] = js.native
  
  var spaceLg: js.UndefOr[String] = js.native
  
  var spaceMd: js.UndefOr[String] = js.native
  
  var spaceSm: js.UndefOr[String] = js.native
  
  var spaceXl: js.UndefOr[String] = js.native
  
  var spaceXs: js.UndefOr[String] = js.native
  
  var transitionDefault: js.UndefOr[String] = js.native
}
object CustomBase {
  
  @scala.inline
  def apply(): CustomBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomBase]
  }
  
  @scala.inline
  implicit class CustomBaseOps[Self <: CustomBase] (val x: Self) extends AnyVal {
    
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
    def setBorderRadius(value: String): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBoxShadowActionable(value: String): Self = this.set("boxShadowActionable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxShadowActionable: Self = this.set("boxShadowActionable", js.undefined)
    
    @scala.inline
    def setBoxShadowColorActionable(value: String): Self = this.set("boxShadowColorActionable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxShadowColorActionable: Self = this.set("boxShadowColorActionable", js.undefined)
    
    @scala.inline
    def setBoxShadowColorElevated(value: String): Self = this.set("boxShadowColorElevated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxShadowColorElevated: Self = this.set("boxShadowColorElevated", js.undefined)
    
    @scala.inline
    def setBoxShadowColorModal(value: String): Self = this.set("boxShadowColorModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxShadowColorModal: Self = this.set("boxShadowColorModal", js.undefined)
    
    @scala.inline
    def setBoxShadowColorStatic(value: String): Self = this.set("boxShadowColorStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxShadowColorStatic: Self = this.set("boxShadowColorStatic", js.undefined)
    
    @scala.inline
    def setBoxShadowElevated(value: String): Self = this.set("boxShadowElevated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxShadowElevated: Self = this.set("boxShadowElevated", js.undefined)
    
    @scala.inline
    def setBoxShadowModal(value: String): Self = this.set("boxShadowModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxShadowModal: Self = this.set("boxShadowModal", js.undefined)
    
    @scala.inline
    def setBoxShadowStatic(value: String): Self = this.set("boxShadowStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxShadowStatic: Self = this.set("boxShadowStatic", js.undefined)
    
    @scala.inline
    def setDurationFast(value: String): Self = this.set("durationFast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationFast: Self = this.set("durationFast", js.undefined)
    
    @scala.inline
    def setDurationNormal(value: String): Self = this.set("durationNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationNormal: Self = this.set("durationNormal", js.undefined)
    
    @scala.inline
    def setDurationSlow(value: String): Self = this.set("durationSlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationSlow: Self = this.set("durationSlow", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSizeLg(value: String): Self = this.set("fontSizeLg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeLg: Self = this.set("fontSizeLg", js.undefined)
    
    @scala.inline
    def setFontSizeMd(value: String): Self = this.set("fontSizeMd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeMd: Self = this.set("fontSizeMd", js.undefined)
    
    @scala.inline
    def setFontSizeSm(value: String): Self = this.set("fontSizeSm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeSm: Self = this.set("fontSizeSm", js.undefined)
    
    @scala.inline
    def setFontWeightBold(value: String): Self = this.set("fontWeightBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeightBold: Self = this.set("fontWeightBold", js.undefined)
    
    @scala.inline
    def setFontWeightMedium(value: String): Self = this.set("fontWeightMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeightMedium: Self = this.set("fontWeightMedium", js.undefined)
    
    @scala.inline
    def setFontWeightNormal(value: String): Self = this.set("fontWeightNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeightNormal: Self = this.set("fontWeightNormal", js.undefined)
    
    @scala.inline
    def setLineHeight(value: String): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setOpacityLarge(value: String): Self = this.set("opacityLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacityLarge: Self = this.set("opacityLarge", js.undefined)
    
    @scala.inline
    def setOpacityMedium(value: String): Self = this.set("opacityMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacityMedium: Self = this.set("opacityMedium", js.undefined)
    
    @scala.inline
    def setOpacitySmall(value: String): Self = this.set("opacitySmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacitySmall: Self = this.set("opacitySmall", js.undefined)
    
    @scala.inline
    def setSize2xl(value: String): Self = this.set("size2xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize2xl: Self = this.set("size2xl", js.undefined)
    
    @scala.inline
    def setSizeLg(value: String): Self = this.set("sizeLg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeLg: Self = this.set("sizeLg", js.undefined)
    
    @scala.inline
    def setSizeMd(value: String): Self = this.set("sizeMd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeMd: Self = this.set("sizeMd", js.undefined)
    
    @scala.inline
    def setSizeSm(value: String): Self = this.set("sizeSm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeSm: Self = this.set("sizeSm", js.undefined)
    
    @scala.inline
    def setSizeXl(value: String): Self = this.set("sizeXl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeXl: Self = this.set("sizeXl", js.undefined)
    
    @scala.inline
    def setSpace2xl(value: String): Self = this.set("space2xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace2xl: Self = this.set("space2xl", js.undefined)
    
    @scala.inline
    def setSpace2xs(value: String): Self = this.set("space2xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace2xs: Self = this.set("space2xs", js.undefined)
    
    @scala.inline
    def setSpace3xl(value: String): Self = this.set("space3xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace3xl: Self = this.set("space3xl", js.undefined)
    
    @scala.inline
    def setSpaceLg(value: String): Self = this.set("spaceLg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceLg: Self = this.set("spaceLg", js.undefined)
    
    @scala.inline
    def setSpaceMd(value: String): Self = this.set("spaceMd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceMd: Self = this.set("spaceMd", js.undefined)
    
    @scala.inline
    def setSpaceSm(value: String): Self = this.set("spaceSm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceSm: Self = this.set("spaceSm", js.undefined)
    
    @scala.inline
    def setSpaceXl(value: String): Self = this.set("spaceXl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceXl: Self = this.set("spaceXl", js.undefined)
    
    @scala.inline
    def setSpaceXs(value: String): Self = this.set("spaceXs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceXs: Self = this.set("spaceXs", js.undefined)
    
    @scala.inline
    def setTransitionDefault(value: String): Self = this.set("transitionDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDefault: Self = this.set("transitionDefault", js.undefined)
  }
}
