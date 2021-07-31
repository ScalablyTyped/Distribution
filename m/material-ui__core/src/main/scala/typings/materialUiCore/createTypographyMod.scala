package typings.materialUiCore

import typings.csstype.mod.ColorProperty
import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontSizeProperty
import typings.csstype.mod.FontWeightProperty
import typings.csstype.mod.LetterSpacingProperty
import typings.csstype.mod.LineHeightProperty
import typings.csstype.mod.TextTransformProperty
import typings.materialUiCore.createPaletteMod.Palette
import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTypographyMod {
  
  @JSImport("@material-ui/core/styles/createTypography", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(palette: Palette, typography: js.Function1[/* palette */ Palette, TypographyOptions]): Typography = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(palette.asInstanceOf[js.Any], typography.asInstanceOf[js.Any])).asInstanceOf[Typography]
  @scala.inline
  def default(palette: Palette, typography: TypographyOptions): Typography = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(palette.asInstanceOf[js.Any], typography.asInstanceOf[js.Any])).asInstanceOf[Typography]
  
  /* Inlined parent std.Required<{  fontFamily :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontFamily'],   fontSize :number,   fontWeightLight :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightRegular :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightMedium :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight']}> */
  trait FontStyle extends StObject {
    
    var fontFamily: FontFamilyProperty
    
    var fontSize: Double
    
    var fontWeightLight: FontWeightProperty
    
    var fontWeightMedium: FontWeightProperty
    
    var fontWeightRegular: FontWeightProperty
  }
  object FontStyle {
    
    @scala.inline
    def apply(
      fontFamily: FontFamilyProperty,
      fontSize: Double,
      fontWeightLight: FontWeightProperty,
      fontWeightMedium: FontWeightProperty,
      fontWeightRegular: FontWeightProperty
    ): FontStyle = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontStyle]
    }
    
    @scala.inline
    implicit class FontStyleMutableBuilder[Self <: FontStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLight(value: FontWeightProperty): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMedium(value: FontWeightProperty): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegular(value: FontWeightProperty): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.FontStyle> */
  trait FontStyleOptions extends StObject {
    
    var allVariants: js.UndefOr[CSSProperties] = js.undefined
    
    var fontFamily: js.UndefOr[FontFamilyProperty] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontWeightLight: js.UndefOr[FontWeightProperty] = js.undefined
    
    var fontWeightMedium: js.UndefOr[FontWeightProperty] = js.undefined
    
    var fontWeightRegular: js.UndefOr[FontWeightProperty] = js.undefined
    
    var htmlFontSize: js.UndefOr[Double] = js.undefined
    
    var useNextVariants: js.UndefOr[Boolean] = js.undefined
  }
  object FontStyleOptions {
    
    @scala.inline
    def apply(): FontStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontStyleOptions]
    }
    
    @scala.inline
    implicit class FontStyleOptionsMutableBuilder[Self <: FontStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllVariants(value: CSSProperties): Self = StObject.set(x, "allVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllVariantsUndefined: Self = StObject.set(x, "allVariants", js.undefined)
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeightLight(value: FontWeightProperty): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLightUndefined: Self = StObject.set(x, "fontWeightLight", js.undefined)
      
      @scala.inline
      def setFontWeightMedium(value: FontWeightProperty): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMediumUndefined: Self = StObject.set(x, "fontWeightMedium", js.undefined)
      
      @scala.inline
      def setFontWeightRegular(value: FontWeightProperty): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegularUndefined: Self = StObject.set(x, "fontWeightRegular", js.undefined)
      
      @scala.inline
      def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFontSizeUndefined: Self = StObject.set(x, "htmlFontSize", js.undefined)
      
      @scala.inline
      def setUseNextVariants(value: Boolean): Self = StObject.set(x, "useNextVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNextVariantsUndefined: Self = StObject.set(x, "useNextVariants", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.h1
    - typings.materialUiCore.materialUiCoreStrings.h2
    - typings.materialUiCore.materialUiCoreStrings.h3
    - typings.materialUiCore.materialUiCoreStrings.h4
    - typings.materialUiCore.materialUiCoreStrings.h5
    - typings.materialUiCore.materialUiCoreStrings.h6
    - typings.materialUiCore.materialUiCoreStrings.subtitle1
    - typings.materialUiCore.materialUiCoreStrings.subtitle2
    - typings.materialUiCore.materialUiCoreStrings.body1
    - typings.materialUiCore.materialUiCoreStrings.body2
    - typings.materialUiCore.materialUiCoreStrings.caption
    - typings.materialUiCore.materialUiCoreStrings.button
    - typings.materialUiCore.materialUiCoreStrings.overline
    - typings.materialUiCore.materialUiCoreStrings.display4
    - typings.materialUiCore.materialUiCoreStrings.display3
    - typings.materialUiCore.materialUiCoreStrings.display2
    - typings.materialUiCore.materialUiCoreStrings.display1
    - typings.materialUiCore.materialUiCoreStrings.headline
    - typings.materialUiCore.materialUiCoreStrings.title
    - typings.materialUiCore.materialUiCoreStrings.subheading
  */
  trait ThemeStyle extends StObject
  object ThemeStyle {
    
    @scala.inline
    def body1: typings.materialUiCore.materialUiCoreStrings.body1 = "body1".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.body1]
    
    @scala.inline
    def body2: typings.materialUiCore.materialUiCoreStrings.body2 = "body2".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.body2]
    
    @scala.inline
    def button: typings.materialUiCore.materialUiCoreStrings.button = "button".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.button]
    
    @scala.inline
    def caption: typings.materialUiCore.materialUiCoreStrings.caption = "caption".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.caption]
    
    @scala.inline
    def display1: typings.materialUiCore.materialUiCoreStrings.display1 = "display1".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.display1]
    
    @scala.inline
    def display2: typings.materialUiCore.materialUiCoreStrings.display2 = "display2".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.display2]
    
    @scala.inline
    def display3: typings.materialUiCore.materialUiCoreStrings.display3 = "display3".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.display3]
    
    @scala.inline
    def display4: typings.materialUiCore.materialUiCoreStrings.display4 = "display4".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.display4]
    
    @scala.inline
    def h1: typings.materialUiCore.materialUiCoreStrings.h1 = "h1".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h1]
    
    @scala.inline
    def h2: typings.materialUiCore.materialUiCoreStrings.h2 = "h2".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h2]
    
    @scala.inline
    def h3: typings.materialUiCore.materialUiCoreStrings.h3 = "h3".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h3]
    
    @scala.inline
    def h4: typings.materialUiCore.materialUiCoreStrings.h4 = "h4".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h4]
    
    @scala.inline
    def h5: typings.materialUiCore.materialUiCoreStrings.h5 = "h5".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h5]
    
    @scala.inline
    def h6: typings.materialUiCore.materialUiCoreStrings.h6 = "h6".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h6]
    
    @scala.inline
    def headline: typings.materialUiCore.materialUiCoreStrings.headline = "headline".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.headline]
    
    @scala.inline
    def overline: typings.materialUiCore.materialUiCoreStrings.overline = "overline".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.overline]
    
    @scala.inline
    def subheading: typings.materialUiCore.materialUiCoreStrings.subheading = "subheading".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.subheading]
    
    @scala.inline
    def subtitle1: typings.materialUiCore.materialUiCoreStrings.subtitle1 = "subtitle1".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.subtitle1]
    
    @scala.inline
    def subtitle2: typings.materialUiCore.materialUiCoreStrings.subtitle2 = "subtitle2".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.subtitle2]
    
    @scala.inline
    def title: typings.materialUiCore.materialUiCoreStrings.title = "title".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.title]
  }
  
  /* Inlined parent std.Record<@material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
  /* Inlined parent @material-ui/core.@material-ui/core/styles/createTypography.FontStyle */
  /* Inlined parent @material-ui/core.@material-ui/core/styles/createTypography.TypographyUtils */
  trait Typography extends StObject {
    
    var body1: TypographyStyle
    
    var body2: TypographyStyle
    
    var button: TypographyStyle
    
    var caption: TypographyStyle
    
    var display1: TypographyStyle
    
    var display2: TypographyStyle
    
    var display3: TypographyStyle
    
    var display4: TypographyStyle
    
    var fontFamily: FontFamilyProperty
    
    var fontSize: Double
    
    var fontWeightLight: FontWeightProperty
    
    var fontWeightMedium: FontWeightProperty
    
    var fontWeightRegular: FontWeightProperty
    
    var h1: TypographyStyle
    
    var h2: TypographyStyle
    
    var h3: TypographyStyle
    
    var h4: TypographyStyle
    
    var h5: TypographyStyle
    
    var h6: TypographyStyle
    
    var headline: TypographyStyle
    
    var overline: TypographyStyle
    
    def pxToRem(px: Double): String
    
    var subheading: TypographyStyle
    
    var subtitle1: TypographyStyle
    
    var subtitle2: TypographyStyle
    
    var title: TypographyStyle
  }
  object Typography {
    
    @scala.inline
    def apply(
      body1: TypographyStyle,
      body2: TypographyStyle,
      button: TypographyStyle,
      caption: TypographyStyle,
      display1: TypographyStyle,
      display2: TypographyStyle,
      display3: TypographyStyle,
      display4: TypographyStyle,
      fontFamily: FontFamilyProperty,
      fontSize: Double,
      fontWeightLight: FontWeightProperty,
      fontWeightMedium: FontWeightProperty,
      fontWeightRegular: FontWeightProperty,
      h1: TypographyStyle,
      h2: TypographyStyle,
      h3: TypographyStyle,
      h4: TypographyStyle,
      h5: TypographyStyle,
      h6: TypographyStyle,
      headline: TypographyStyle,
      overline: TypographyStyle,
      pxToRem: Double => String,
      subheading: TypographyStyle,
      subtitle1: TypographyStyle,
      subtitle2: TypographyStyle,
      title: TypographyStyle
    ): Typography = {
      val __obj = js.Dynamic.literal(body1 = body1.asInstanceOf[js.Any], body2 = body2.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], display1 = display1.asInstanceOf[js.Any], display2 = display2.asInstanceOf[js.Any], display3 = display3.asInstanceOf[js.Any], display4 = display4.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], overline = overline.asInstanceOf[js.Any], pxToRem = js.Any.fromFunction1(pxToRem), subheading = subheading.asInstanceOf[js.Any], subtitle1 = subtitle1.asInstanceOf[js.Any], subtitle2 = subtitle2.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typography]
    }
    
    @scala.inline
    implicit class TypographyMutableBuilder[Self <: Typography] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody1(value: TypographyStyle): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody2(value: TypographyStyle): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: TypographyStyle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: TypographyStyle): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay1(value: TypographyStyle): Self = StObject.set(x, "display1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay2(value: TypographyStyle): Self = StObject.set(x, "display2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay3(value: TypographyStyle): Self = StObject.set(x, "display3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay4(value: TypographyStyle): Self = StObject.set(x, "display4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLight(value: FontWeightProperty): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMedium(value: FontWeightProperty): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegular(value: FontWeightProperty): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1(value: TypographyStyle): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2(value: TypographyStyle): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3(value: TypographyStyle): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4(value: TypographyStyle): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5(value: TypographyStyle): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6(value: TypographyStyle): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadline(value: TypographyStyle): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverline(value: TypographyStyle): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPxToRem(value: Double => String): Self = StObject.set(x, "pxToRem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubheading(value: TypographyStyle): Self = StObject.set(x, "subheading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle1(value: TypographyStyle): Self = StObject.set(x, "subtitle1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle2(value: TypographyStyle): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: TypographyStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<std.Record<@material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyleOptions> & @material-ui/core.@material-ui/core/styles/createTypography.FontStyleOptions> */
  trait TypographyOptions extends StObject {
    
    var allVariants: js.UndefOr[CSSProperties] = js.undefined
    
    var body1: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var body2: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var button: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var caption: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var display1: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var display2: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var display3: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var display4: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var fontFamily: js.UndefOr[FontFamilyProperty] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontWeightLight: js.UndefOr[FontWeightProperty] = js.undefined
    
    var fontWeightMedium: js.UndefOr[FontWeightProperty] = js.undefined
    
    var fontWeightRegular: js.UndefOr[FontWeightProperty] = js.undefined
    
    var h1: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var h2: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var h3: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var h4: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var h5: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var h6: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var headline: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var htmlFontSize: js.UndefOr[Double] = js.undefined
    
    var overline: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var subheading: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var subtitle1: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var subtitle2: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var title: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var useNextVariants: js.UndefOr[Boolean] = js.undefined
  }
  object TypographyOptions {
    
    @scala.inline
    def apply(): TypographyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyOptions]
    }
    
    @scala.inline
    implicit class TypographyOptionsMutableBuilder[Self <: TypographyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllVariants(value: CSSProperties): Self = StObject.set(x, "allVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllVariantsUndefined: Self = StObject.set(x, "allVariants", js.undefined)
      
      @scala.inline
      def setBody1(value: TypographyStyleOptions): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody1Undefined: Self = StObject.set(x, "body1", js.undefined)
      
      @scala.inline
      def setBody2(value: TypographyStyleOptions): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody2Undefined: Self = StObject.set(x, "body2", js.undefined)
      
      @scala.inline
      def setButton(value: TypographyStyleOptions): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setCaption(value: TypographyStyleOptions): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setDisplay1(value: TypographyStyleOptions): Self = StObject.set(x, "display1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay1Undefined: Self = StObject.set(x, "display1", js.undefined)
      
      @scala.inline
      def setDisplay2(value: TypographyStyleOptions): Self = StObject.set(x, "display2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay2Undefined: Self = StObject.set(x, "display2", js.undefined)
      
      @scala.inline
      def setDisplay3(value: TypographyStyleOptions): Self = StObject.set(x, "display3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay3Undefined: Self = StObject.set(x, "display3", js.undefined)
      
      @scala.inline
      def setDisplay4(value: TypographyStyleOptions): Self = StObject.set(x, "display4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay4Undefined: Self = StObject.set(x, "display4", js.undefined)
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeightLight(value: FontWeightProperty): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLightUndefined: Self = StObject.set(x, "fontWeightLight", js.undefined)
      
      @scala.inline
      def setFontWeightMedium(value: FontWeightProperty): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMediumUndefined: Self = StObject.set(x, "fontWeightMedium", js.undefined)
      
      @scala.inline
      def setFontWeightRegular(value: FontWeightProperty): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegularUndefined: Self = StObject.set(x, "fontWeightRegular", js.undefined)
      
      @scala.inline
      def setH1(value: TypographyStyleOptions): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      @scala.inline
      def setH2(value: TypographyStyleOptions): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      @scala.inline
      def setH3(value: TypographyStyleOptions): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      @scala.inline
      def setH4(value: TypographyStyleOptions): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      @scala.inline
      def setH5(value: TypographyStyleOptions): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      @scala.inline
      def setH6(value: TypographyStyleOptions): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      @scala.inline
      def setHeadline(value: TypographyStyleOptions): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
      
      @scala.inline
      def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFontSizeUndefined: Self = StObject.set(x, "htmlFontSize", js.undefined)
      
      @scala.inline
      def setOverline(value: TypographyStyleOptions): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlineUndefined: Self = StObject.set(x, "overline", js.undefined)
      
      @scala.inline
      def setSubheading(value: TypographyStyleOptions): Self = StObject.set(x, "subheading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubheadingUndefined: Self = StObject.set(x, "subheading", js.undefined)
      
      @scala.inline
      def setSubtitle1(value: TypographyStyleOptions): Self = StObject.set(x, "subtitle1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle1Undefined: Self = StObject.set(x, "subtitle1", js.undefined)
      
      @scala.inline
      def setSubtitle2(value: TypographyStyleOptions): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle2Undefined: Self = StObject.set(x, "subtitle2", js.undefined)
      
      @scala.inline
      def setTitle(value: TypographyStyleOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUseNextVariants(value: Boolean): Self = StObject.set(x, "useNextVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNextVariantsUndefined: Self = StObject.set(x, "useNextVariants", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'fontFamily' | 'fontSize' | 'fontWeight' | 'color'>> & std.Partial<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'letterSpacing' | 'lineHeight' | 'textTransform'>> */
  trait TypographyStyle extends StObject {
    
    var color: ColorProperty
    
    var fontFamily: FontFamilyProperty
    
    var fontSize: FontSizeProperty[Double | String]
    
    var fontWeight: FontWeightProperty
    
    var letterSpacing: js.UndefOr[LetterSpacingProperty[Double | String]] = js.undefined
    
    var lineHeight: js.UndefOr[LineHeightProperty[Double | String]] = js.undefined
    
    var textTransform: js.UndefOr[TextTransformProperty] = js.undefined
  }
  object TypographyStyle {
    
    @scala.inline
    def apply(
      color: ColorProperty,
      fontFamily: FontFamilyProperty,
      fontSize: FontSizeProperty[Double | String],
      fontWeight: FontWeightProperty
    ): TypographyStyle = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographyStyle]
    }
    
    @scala.inline
    implicit class TypographyStyleMutableBuilder[Self <: TypographyStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: FontSizeProperty[Double | String]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(value: FontWeightProperty): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacing(value: LetterSpacingProperty[Double | String]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLineHeight(value: LineHeightProperty[Double | String]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setTextTransform(value: TextTransformProperty): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
  trait TypographyStyleOptions extends StObject {
    
    var color: js.UndefOr[ColorProperty] = js.undefined
    
    var fontFamily: js.UndefOr[FontFamilyProperty] = js.undefined
    
    var fontSize: js.UndefOr[FontSizeProperty[Double | String]] = js.undefined
    
    var fontWeight: js.UndefOr[FontWeightProperty] = js.undefined
    
    var letterSpacing: js.UndefOr[LetterSpacingProperty[Double | String]] = js.undefined
    
    var lineHeight: js.UndefOr[LineHeightProperty[Double | String]] = js.undefined
    
    var textTransform: js.UndefOr[TextTransformProperty] = js.undefined
  }
  object TypographyStyleOptions {
    
    @scala.inline
    def apply(): TypographyStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyStyleOptions]
    }
    
    @scala.inline
    implicit class TypographyStyleOptionsMutableBuilder[Self <: TypographyStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: FontSizeProperty[Double | String]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeightProperty): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: LetterSpacingProperty[Double | String]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLineHeight(value: LineHeightProperty[Double | String]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setTextTransform(value: TextTransformProperty): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    }
  }
  
  trait TypographyUtils extends StObject {
    
    def pxToRem(px: Double): String
  }
  object TypographyUtils {
    
    @scala.inline
    def apply(pxToRem: Double => String): TypographyUtils = {
      val __obj = js.Dynamic.literal(pxToRem = js.Any.fromFunction1(pxToRem))
      __obj.asInstanceOf[TypographyUtils]
    }
    
    @scala.inline
    implicit class TypographyUtilsMutableBuilder[Self <: TypographyUtils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPxToRem(value: Double => String): Self = StObject.set(x, "pxToRem", js.Any.fromFunction1(value))
    }
  }
}
