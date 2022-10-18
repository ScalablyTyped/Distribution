package typings.materialUiCore

import typings.csstype.mod.Property.FontFamily
import typings.csstype.mod.Property.FontWeight
import typings.materialUiCore.stylesCreatePaletteMod.Palette
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesCreateTypographyMod {
  
  @JSImport("@material-ui/core/styles/createTypography", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(palette: Palette, typography: js.Function1[/* palette */ Palette, TypographyOptions]): Typography = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(palette.asInstanceOf[js.Any], typography.asInstanceOf[js.Any])).asInstanceOf[Typography]
  inline def default(palette: Palette, typography: TypographyOptions): Typography = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(palette.asInstanceOf[js.Any], typography.asInstanceOf[js.Any])).asInstanceOf[Typography]
  
  /* Inlined parent std.Required<{  fontFamily :react.react.CSSProperties['fontFamily'],   fontSize :number,   fontWeightLight :react.react.CSSProperties['fontWeight'],   fontWeightRegular :react.react.CSSProperties['fontWeight'],   fontWeightMedium :react.react.CSSProperties['fontWeight'],   fontWeightBold :react.react.CSSProperties['fontWeight']}> */
  trait FontStyle extends StObject {
    
    var fontFamily: FontFamily
    
    var fontSize: Double
    
    var fontWeightBold: FontWeight
    
    var fontWeightLight: FontWeight
    
    var fontWeightMedium: FontWeight
    
    var fontWeightRegular: FontWeight
  }
  object FontStyle {
    
    inline def apply(
      fontFamily: FontFamily,
      fontSize: Double,
      fontWeightBold: FontWeight,
      fontWeightLight: FontWeight,
      fontWeightMedium: FontWeight,
      fontWeightRegular: FontWeight
    ): FontStyle = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightBold = fontWeightBold.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontStyle]
    }
    
    extension [Self <: FontStyle](x: Self) {
      
      inline def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
      
      inline def setFontWeightLight(value: FontWeight): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightMedium(value: FontWeight): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      inline def setFontWeightRegular(value: FontWeight): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.FontStyle> */
  trait FontStyleOptions extends StObject {
    
    var allVariants: js.UndefOr[CSSProperties] = js.undefined
    
    var fontFamily: js.UndefOr[FontFamily] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontWeightBold: js.UndefOr[FontWeight] = js.undefined
    
    var fontWeightLight: js.UndefOr[FontWeight] = js.undefined
    
    var fontWeightMedium: js.UndefOr[FontWeight] = js.undefined
    
    var fontWeightRegular: js.UndefOr[FontWeight] = js.undefined
    
    var htmlFontSize: js.UndefOr[Double] = js.undefined
  }
  object FontStyleOptions {
    
    inline def apply(): FontStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontStyleOptions]
    }
    
    extension [Self <: FontStyleOptions](x: Self) {
      
      inline def setAllVariants(value: CSSProperties): Self = StObject.set(x, "allVariants", value.asInstanceOf[js.Any])
      
      inline def setAllVariantsUndefined: Self = StObject.set(x, "allVariants", js.undefined)
      
      inline def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
      
      inline def setFontWeightBoldUndefined: Self = StObject.set(x, "fontWeightBold", js.undefined)
      
      inline def setFontWeightLight(value: FontWeight): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightLightUndefined: Self = StObject.set(x, "fontWeightLight", js.undefined)
      
      inline def setFontWeightMedium(value: FontWeight): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      inline def setFontWeightMediumUndefined: Self = StObject.set(x, "fontWeightMedium", js.undefined)
      
      inline def setFontWeightRegular(value: FontWeight): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      inline def setFontWeightRegularUndefined: Self = StObject.set(x, "fontWeightRegular", js.undefined)
      
      inline def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
      
      inline def setHtmlFontSizeUndefined: Self = StObject.set(x, "htmlFontSize", js.undefined)
    }
  }
  
  /* Inlined parent std.Record<@material-ui/core.@material-ui/core/styles/createTypography.Variant, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
  /* Inlined parent @material-ui/core.@material-ui/core/styles/createTypography.FontStyle */
  /* Inlined parent @material-ui/core.@material-ui/core/styles/createTypography.TypographyUtils */
  trait Typography extends StObject {
    
    var body1: TypographyStyle
    
    var body2: TypographyStyle
    
    var button: TypographyStyle
    
    var caption: TypographyStyle
    
    var fontFamily: FontFamily
    
    var fontSize: Double
    
    var fontWeightBold: FontWeight
    
    var fontWeightLight: FontWeight
    
    var fontWeightMedium: FontWeight
    
    var fontWeightRegular: FontWeight
    
    var h1: TypographyStyle
    
    var h2: TypographyStyle
    
    var h3: TypographyStyle
    
    var h4: TypographyStyle
    
    var h5: TypographyStyle
    
    var h6: TypographyStyle
    
    var overline: TypographyStyle
    
    def pxToRem(px: Double): String
    
    var subtitle1: TypographyStyle
    
    var subtitle2: TypographyStyle
  }
  object Typography {
    
    inline def apply(
      body1: TypographyStyle,
      body2: TypographyStyle,
      button: TypographyStyle,
      caption: TypographyStyle,
      fontFamily: FontFamily,
      fontSize: Double,
      fontWeightBold: FontWeight,
      fontWeightLight: FontWeight,
      fontWeightMedium: FontWeight,
      fontWeightRegular: FontWeight,
      h1: TypographyStyle,
      h2: TypographyStyle,
      h3: TypographyStyle,
      h4: TypographyStyle,
      h5: TypographyStyle,
      h6: TypographyStyle,
      overline: TypographyStyle,
      pxToRem: Double => String,
      subtitle1: TypographyStyle,
      subtitle2: TypographyStyle
    ): Typography = {
      val __obj = js.Dynamic.literal(body1 = body1.asInstanceOf[js.Any], body2 = body2.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightBold = fontWeightBold.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], overline = overline.asInstanceOf[js.Any], pxToRem = js.Any.fromFunction1(pxToRem), subtitle1 = subtitle1.asInstanceOf[js.Any], subtitle2 = subtitle2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typography]
    }
    
    extension [Self <: Typography](x: Self) {
      
      inline def setBody1(value: TypographyStyle): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      inline def setBody2(value: TypographyStyle): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      inline def setButton(value: TypographyStyle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: TypographyStyle): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
      
      inline def setFontWeightLight(value: FontWeight): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightMedium(value: FontWeight): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      inline def setFontWeightRegular(value: FontWeight): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      inline def setH1(value: TypographyStyle): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH2(value: TypographyStyle): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH3(value: TypographyStyle): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH4(value: TypographyStyle): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH5(value: TypographyStyle): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH6(value: TypographyStyle): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setOverline(value: TypographyStyle): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      inline def setPxToRem(value: Double => String): Self = StObject.set(x, "pxToRem", js.Any.fromFunction1(value))
      
      inline def setSubtitle1(value: TypographyStyle): Self = StObject.set(x, "subtitle1", value.asInstanceOf[js.Any])
      
      inline def setSubtitle2(value: TypographyStyle): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<std.Record<@material-ui/core.@material-ui/core/styles/createTypography.Variant, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyleOptions> & @material-ui/core.@material-ui/core/styles/createTypography.FontStyleOptions> */
  trait TypographyOptions extends StObject {
    
    var allVariants: js.UndefOr[CSSProperties] = js.undefined
    
    var body1: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var body2: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var button: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var caption: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var fontFamily: js.UndefOr[FontFamily] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontWeightBold: js.UndefOr[FontWeight] = js.undefined
    
    var fontWeightLight: js.UndefOr[FontWeight] = js.undefined
    
    var fontWeightMedium: js.UndefOr[FontWeight] = js.undefined
    
    var fontWeightRegular: js.UndefOr[FontWeight] = js.undefined
    
    var h1: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var h2: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var h3: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var h4: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var h5: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var h6: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var htmlFontSize: js.UndefOr[Double] = js.undefined
    
    var overline: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var subtitle1: js.UndefOr[TypographyStyleOptions] = js.undefined
    
    var subtitle2: js.UndefOr[TypographyStyleOptions] = js.undefined
  }
  object TypographyOptions {
    
    inline def apply(): TypographyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyOptions]
    }
    
    extension [Self <: TypographyOptions](x: Self) {
      
      inline def setAllVariants(value: CSSProperties): Self = StObject.set(x, "allVariants", value.asInstanceOf[js.Any])
      
      inline def setAllVariantsUndefined: Self = StObject.set(x, "allVariants", js.undefined)
      
      inline def setBody1(value: TypographyStyleOptions): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      inline def setBody1Undefined: Self = StObject.set(x, "body1", js.undefined)
      
      inline def setBody2(value: TypographyStyleOptions): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      inline def setBody2Undefined: Self = StObject.set(x, "body2", js.undefined)
      
      inline def setButton(value: TypographyStyleOptions): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setCaption(value: TypographyStyleOptions): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
      
      inline def setFontWeightBoldUndefined: Self = StObject.set(x, "fontWeightBold", js.undefined)
      
      inline def setFontWeightLight(value: FontWeight): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightLightUndefined: Self = StObject.set(x, "fontWeightLight", js.undefined)
      
      inline def setFontWeightMedium(value: FontWeight): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      inline def setFontWeightMediumUndefined: Self = StObject.set(x, "fontWeightMedium", js.undefined)
      
      inline def setFontWeightRegular(value: FontWeight): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      inline def setFontWeightRegularUndefined: Self = StObject.set(x, "fontWeightRegular", js.undefined)
      
      inline def setH1(value: TypographyStyleOptions): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      inline def setH2(value: TypographyStyleOptions): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      inline def setH3(value: TypographyStyleOptions): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      inline def setH4(value: TypographyStyleOptions): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      inline def setH5(value: TypographyStyleOptions): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      inline def setH6(value: TypographyStyleOptions): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      inline def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
      
      inline def setHtmlFontSizeUndefined: Self = StObject.set(x, "htmlFontSize", js.undefined)
      
      inline def setOverline(value: TypographyStyleOptions): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      inline def setOverlineUndefined: Self = StObject.set(x, "overline", js.undefined)
      
      inline def setSubtitle1(value: TypographyStyleOptions): Self = StObject.set(x, "subtitle1", value.asInstanceOf[js.Any])
      
      inline def setSubtitle1Undefined: Self = StObject.set(x, "subtitle1", js.undefined)
      
      inline def setSubtitle2(value: TypographyStyleOptions): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
      
      inline def setSubtitle2Undefined: Self = StObject.set(x, "subtitle2", js.undefined)
    }
  }
  
  type TypographyStyle = typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
  
  type TypographyStyleOptions = TypographyStyle
  
  trait TypographyUtils extends StObject {
    
    def pxToRem(px: Double): String
  }
  object TypographyUtils {
    
    inline def apply(pxToRem: Double => String): TypographyUtils = {
      val __obj = js.Dynamic.literal(pxToRem = js.Any.fromFunction1(pxToRem))
      __obj.asInstanceOf[TypographyUtils]
    }
    
    extension [Self <: TypographyUtils](x: Self) {
      
      inline def setPxToRem(value: Double => String): Self = StObject.set(x, "pxToRem", js.Any.fromFunction1(value))
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
  */
  trait Variant extends StObject
  object Variant {
    
    inline def body1: typings.materialUiCore.materialUiCoreStrings.body1 = "body1".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.body1]
    
    inline def body2: typings.materialUiCore.materialUiCoreStrings.body2 = "body2".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.body2]
    
    inline def button: typings.materialUiCore.materialUiCoreStrings.button = "button".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.button]
    
    inline def caption: typings.materialUiCore.materialUiCoreStrings.caption = "caption".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.caption]
    
    inline def h1: typings.materialUiCore.materialUiCoreStrings.h1 = "h1".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h1]
    
    inline def h2: typings.materialUiCore.materialUiCoreStrings.h2 = "h2".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h2]
    
    inline def h3: typings.materialUiCore.materialUiCoreStrings.h3 = "h3".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h3]
    
    inline def h4: typings.materialUiCore.materialUiCoreStrings.h4 = "h4".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h4]
    
    inline def h5: typings.materialUiCore.materialUiCoreStrings.h5 = "h5".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h5]
    
    inline def h6: typings.materialUiCore.materialUiCoreStrings.h6 = "h6".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.h6]
    
    inline def overline: typings.materialUiCore.materialUiCoreStrings.overline = "overline".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.overline]
    
    inline def subtitle1: typings.materialUiCore.materialUiCoreStrings.subtitle1 = "subtitle1".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.subtitle1]
    
    inline def subtitle2: typings.materialUiCore.materialUiCoreStrings.subtitle2 = "subtitle2".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.subtitle2]
  }
}
