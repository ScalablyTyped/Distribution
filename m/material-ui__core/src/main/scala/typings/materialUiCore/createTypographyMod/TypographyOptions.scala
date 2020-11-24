package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontWeightProperty
import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Record<@material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyleOptions> & @material-ui/core.@material-ui/core/styles/createTypography.FontStyleOptions> */
@js.native
trait TypographyOptions extends js.Object {
  
  var allVariants: js.UndefOr[CSSProperties] = js.native
  
  var body1: js.UndefOr[TypographyStyleOptions] = js.native
  
  var body2: js.UndefOr[TypographyStyleOptions] = js.native
  
  var button: js.UndefOr[TypographyStyleOptions] = js.native
  
  var caption: js.UndefOr[TypographyStyleOptions] = js.native
  
  var display1: js.UndefOr[TypographyStyleOptions] = js.native
  
  var display2: js.UndefOr[TypographyStyleOptions] = js.native
  
  var display3: js.UndefOr[TypographyStyleOptions] = js.native
  
  var display4: js.UndefOr[TypographyStyleOptions] = js.native
  
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontWeightLight: js.UndefOr[FontWeightProperty] = js.native
  
  var fontWeightMedium: js.UndefOr[FontWeightProperty] = js.native
  
  var fontWeightRegular: js.UndefOr[FontWeightProperty] = js.native
  
  var h1: js.UndefOr[TypographyStyleOptions] = js.native
  
  var h2: js.UndefOr[TypographyStyleOptions] = js.native
  
  var h3: js.UndefOr[TypographyStyleOptions] = js.native
  
  var h4: js.UndefOr[TypographyStyleOptions] = js.native
  
  var h5: js.UndefOr[TypographyStyleOptions] = js.native
  
  var h6: js.UndefOr[TypographyStyleOptions] = js.native
  
  var headline: js.UndefOr[TypographyStyleOptions] = js.native
  
  var htmlFontSize: js.UndefOr[Double] = js.native
  
  var overline: js.UndefOr[TypographyStyleOptions] = js.native
  
  var subheading: js.UndefOr[TypographyStyleOptions] = js.native
  
  var subtitle1: js.UndefOr[TypographyStyleOptions] = js.native
  
  var subtitle2: js.UndefOr[TypographyStyleOptions] = js.native
  
  var title: js.UndefOr[TypographyStyleOptions] = js.native
  
  var useNextVariants: js.UndefOr[Boolean] = js.native
}
object TypographyOptions {
  
  @scala.inline
  def apply(): TypographyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyOptions]
  }
  
  @scala.inline
  implicit class TypographyOptionsOps[Self <: TypographyOptions] (val x: Self) extends AnyVal {
    
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
    def setAllVariants(value: CSSProperties): Self = this.set("allVariants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllVariants: Self = this.set("allVariants", js.undefined)
    
    @scala.inline
    def setBody1(value: TypographyStyleOptions): Self = this.set("body1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody1: Self = this.set("body1", js.undefined)
    
    @scala.inline
    def setBody2(value: TypographyStyleOptions): Self = this.set("body2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody2: Self = this.set("body2", js.undefined)
    
    @scala.inline
    def setButton(value: TypographyStyleOptions): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setCaption(value: TypographyStyleOptions): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setDisplay1(value: TypographyStyleOptions): Self = this.set("display1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay1: Self = this.set("display1", js.undefined)
    
    @scala.inline
    def setDisplay2(value: TypographyStyleOptions): Self = this.set("display2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay2: Self = this.set("display2", js.undefined)
    
    @scala.inline
    def setDisplay3(value: TypographyStyleOptions): Self = this.set("display3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay3: Self = this.set("display3", js.undefined)
    
    @scala.inline
    def setDisplay4(value: TypographyStyleOptions): Self = this.set("display4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay4: Self = this.set("display4", js.undefined)
    
    @scala.inline
    def setFontFamily(value: FontFamilyProperty): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontWeightLight(value: FontWeightProperty): Self = this.set("fontWeightLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeightLight: Self = this.set("fontWeightLight", js.undefined)
    
    @scala.inline
    def setFontWeightMedium(value: FontWeightProperty): Self = this.set("fontWeightMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeightMedium: Self = this.set("fontWeightMedium", js.undefined)
    
    @scala.inline
    def setFontWeightRegular(value: FontWeightProperty): Self = this.set("fontWeightRegular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeightRegular: Self = this.set("fontWeightRegular", js.undefined)
    
    @scala.inline
    def setH1(value: TypographyStyleOptions): Self = this.set("h1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH1: Self = this.set("h1", js.undefined)
    
    @scala.inline
    def setH2(value: TypographyStyleOptions): Self = this.set("h2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH2: Self = this.set("h2", js.undefined)
    
    @scala.inline
    def setH3(value: TypographyStyleOptions): Self = this.set("h3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH3: Self = this.set("h3", js.undefined)
    
    @scala.inline
    def setH4(value: TypographyStyleOptions): Self = this.set("h4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH4: Self = this.set("h4", js.undefined)
    
    @scala.inline
    def setH5(value: TypographyStyleOptions): Self = this.set("h5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH5: Self = this.set("h5", js.undefined)
    
    @scala.inline
    def setH6(value: TypographyStyleOptions): Self = this.set("h6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH6: Self = this.set("h6", js.undefined)
    
    @scala.inline
    def setHeadline(value: TypographyStyleOptions): Self = this.set("headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadline: Self = this.set("headline", js.undefined)
    
    @scala.inline
    def setHtmlFontSize(value: Double): Self = this.set("htmlFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlFontSize: Self = this.set("htmlFontSize", js.undefined)
    
    @scala.inline
    def setOverline(value: TypographyStyleOptions): Self = this.set("overline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverline: Self = this.set("overline", js.undefined)
    
    @scala.inline
    def setSubheading(value: TypographyStyleOptions): Self = this.set("subheading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubheading: Self = this.set("subheading", js.undefined)
    
    @scala.inline
    def setSubtitle1(value: TypographyStyleOptions): Self = this.set("subtitle1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle1: Self = this.set("subtitle1", js.undefined)
    
    @scala.inline
    def setSubtitle2(value: TypographyStyleOptions): Self = this.set("subtitle2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle2: Self = this.set("subtitle2", js.undefined)
    
    @scala.inline
    def setTitle(value: TypographyStyleOptions): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUseNextVariants(value: Boolean): Self = this.set("useNextVariants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNextVariants: Self = this.set("useNextVariants", js.undefined)
  }
}
