package typings.materialUiCore

import typings.materialUiCore.anon.PartialCommonColors
import typings.materialUiCore.anon.PartialTypeAction
import typings.materialUiCore.anon.PartialTypeBackground
import typings.materialUiCore.anon.PartialTypeText
import typings.materialUiCore.commonMod.CommonColors
import typings.materialUiCore.mod.Color
import typings.materialUiCore.mod.PaletteType
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPaletteMod {
  
  @JSImport("@material-ui/core/styles/createPalette", JSImport.Default)
  @js.native
  def default(palette: PaletteOptions): Palette = js.native
  
  @JSImport("@material-ui/core/styles/createPalette", "dark")
  @js.native
  val dark: TypeObject = js.native
  
  @JSImport("@material-ui/core/styles/createPalette", "light")
  @js.native
  val light: TypeObject = js.native
  
  /* Inlined std.Partial<@material-ui/core.@material-ui/core.Color> */
  @js.native
  trait ColorPartial extends PaletteColorOptions {
    
    var `100`: js.UndefOr[String] = js.native
    
    var `200`: js.UndefOr[String] = js.native
    
    var `300`: js.UndefOr[String] = js.native
    
    var `400`: js.UndefOr[String] = js.native
    
    var `50`: js.UndefOr[String] = js.native
    
    var `500`: js.UndefOr[String] = js.native
    
    var `600`: js.UndefOr[String] = js.native
    
    var `700`: js.UndefOr[String] = js.native
    
    var `800`: js.UndefOr[String] = js.native
    
    var `900`: js.UndefOr[String] = js.native
    
    var A100: js.UndefOr[String] = js.native
    
    var A200: js.UndefOr[String] = js.native
    
    var A400: js.UndefOr[String] = js.native
    
    var A700: js.UndefOr[String] = js.native
  }
  object ColorPartial {
    
    @scala.inline
    def apply(): ColorPartial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPartial]
    }
    
    @scala.inline
    implicit class ColorPartialMutableBuilder[Self <: ColorPartial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set100(value: String): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set100Undefined: Self = StObject.set(x, "100", js.undefined)
      
      @scala.inline
      def set200(value: String): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set200Undefined: Self = StObject.set(x, "200", js.undefined)
      
      @scala.inline
      def set300(value: String): Self = StObject.set(x, "300", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set300Undefined: Self = StObject.set(x, "300", js.undefined)
      
      @scala.inline
      def set400(value: String): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set400Undefined: Self = StObject.set(x, "400", js.undefined)
      
      @scala.inline
      def set50(value: String): Self = StObject.set(x, "50", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set500(value: String): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set500Undefined: Self = StObject.set(x, "500", js.undefined)
      
      @scala.inline
      def set50Undefined: Self = StObject.set(x, "50", js.undefined)
      
      @scala.inline
      def set600(value: String): Self = StObject.set(x, "600", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set600Undefined: Self = StObject.set(x, "600", js.undefined)
      
      @scala.inline
      def set700(value: String): Self = StObject.set(x, "700", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set700Undefined: Self = StObject.set(x, "700", js.undefined)
      
      @scala.inline
      def set800(value: String): Self = StObject.set(x, "800", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set800Undefined: Self = StObject.set(x, "800", js.undefined)
      
      @scala.inline
      def set900(value: String): Self = StObject.set(x, "900", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set900Undefined: Self = StObject.set(x, "900", js.undefined)
      
      @scala.inline
      def setA100(value: String): Self = StObject.set(x, "A100", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA100Undefined: Self = StObject.set(x, "A100", js.undefined)
      
      @scala.inline
      def setA200(value: String): Self = StObject.set(x, "A200", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA200Undefined: Self = StObject.set(x, "A200", js.undefined)
      
      @scala.inline
      def setA400(value: String): Self = StObject.set(x, "A400", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA400Undefined: Self = StObject.set(x, "A400", js.undefined)
      
      @scala.inline
      def setA700(value: String): Self = StObject.set(x, "A700", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA700Undefined: Self = StObject.set(x, "A700", js.undefined)
    }
  }
  
  @js.native
  trait Palette extends StObject {
    
    var action: TypeAction = js.native
    
    def augmentColor(color: ColorPartial): Unit = js.native
    def augmentColor(
      color: ColorPartial,
      mainShade: js.UndefOr[scala.Nothing],
      lightShade: js.UndefOr[scala.Nothing],
      darkShade: String
    ): Unit = js.native
    def augmentColor(
      color: ColorPartial,
      mainShade: js.UndefOr[scala.Nothing],
      lightShade: js.UndefOr[scala.Nothing],
      darkShade: Double
    ): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: js.UndefOr[scala.Nothing], lightShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: js.UndefOr[scala.Nothing], lightShade: String, darkShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: js.UndefOr[scala.Nothing], lightShade: String, darkShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: js.UndefOr[scala.Nothing], lightShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: js.UndefOr[scala.Nothing], lightShade: Double, darkShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: js.UndefOr[scala.Nothing], lightShade: Double, darkShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: js.UndefOr[scala.Nothing], darkShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: js.UndefOr[scala.Nothing], darkShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: String, darkShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: String, darkShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: Double, darkShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: Double, darkShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: js.UndefOr[scala.Nothing], darkShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: js.UndefOr[scala.Nothing], darkShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: String, darkShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: String, darkShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Double): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Double, darkShade: String): Unit = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Double, darkShade: Double): Unit = js.native
    def augmentColor(color: PaletteColorOptions): Unit = js.native
    
    var background: TypeBackground = js.native
    
    var common: CommonColors = js.native
    
    var contrastThreshold: Double = js.native
    
    var divider: TypeDivider = js.native
    
    var error: PaletteColor = js.native
    
    def getContrastText(background: String): String = js.native
    
    var grey: Color = js.native
    
    var primary: PaletteColor = js.native
    
    var secondary: PaletteColor = js.native
    
    var text: TypeText = js.native
    
    var tonalOffset: Double = js.native
    
    var `type`: PaletteType = js.native
  }
  
  @js.native
  trait PaletteColor extends StObject {
    
    var contrastText: String = js.native
    
    var dark: String = js.native
    
    var light: String = js.native
    
    var main: String = js.native
  }
  object PaletteColor {
    
    @scala.inline
    def apply(contrastText: String, dark: String, light: String, main: String): PaletteColor = {
      val __obj = js.Dynamic.literal(contrastText = contrastText.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteColor]
    }
    
    @scala.inline
    implicit class PaletteColorMutableBuilder[Self <: PaletteColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContrastText(value: String): Self = StObject.set(x, "contrastText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.createPaletteMod.SimplePaletteColorOptions
    - typings.materialUiCore.createPaletteMod.ColorPartial
  */
  trait PaletteColorOptions extends StObject
  object PaletteColorOptions {
    
    @scala.inline
    def ColorPartial(): typings.materialUiCore.createPaletteMod.ColorPartial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.materialUiCore.createPaletteMod.ColorPartial]
    }
    
    @scala.inline
    def SimplePaletteColorOptions(main: String): typings.materialUiCore.createPaletteMod.SimplePaletteColorOptions = {
      val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.materialUiCore.createPaletteMod.SimplePaletteColorOptions]
    }
  }
  
  @js.native
  trait PaletteOptions extends StObject {
    
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
    implicit class PaletteOptionsMutableBuilder[Self <: PaletteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: PartialTypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setBackground(value: PartialTypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setCommon(value: PartialCommonColors): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      @scala.inline
      def setContrastThreshold(value: Double): Self = StObject.set(x, "contrastThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContrastThresholdUndefined: Self = StObject.set(x, "contrastThreshold", js.undefined)
      
      @scala.inline
      def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setError(value: PaletteColorOptions): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setGetContrastText(value: /* background */ String => String): Self = StObject.set(x, "getContrastText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContrastTextUndefined: Self = StObject.set(x, "getContrastText", js.undefined)
      
      @scala.inline
      def setGrey(value: ColorPartial): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreyUndefined: Self = StObject.set(x, "grey", js.undefined)
      
      @scala.inline
      def setPrimary(value: PaletteColorOptions): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setSecondary(value: PaletteColorOptions): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      @scala.inline
      def setText(value: PartialTypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTonalOffset(value: Double): Self = StObject.set(x, "tonalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTonalOffsetUndefined: Self = StObject.set(x, "tonalOffset", js.undefined)
      
      @scala.inline
      def setType(value: PaletteType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined {[ P in keyof @material-ui/core.@material-ui/core/styles/createPalette.TypeObject ]:? std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeObject[P]>} */
  @js.native
  trait PartialTypeObject extends StObject {
    
    var action: js.UndefOr[PartialTypeAction] = js.native
    
    var background: js.UndefOr[PartialTypeBackground] = js.native
    
    var divider: js.UndefOr[Partial[TypeDivider]] = js.native
    
    var text: js.UndefOr[PartialTypeText] = js.native
  }
  object PartialTypeObject {
    
    @scala.inline
    def apply(): PartialTypeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTypeObject]
    }
    
    @scala.inline
    implicit class PartialTypeObjectMutableBuilder[Self <: PartialTypeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: PartialTypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setBackground(value: PartialTypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setDivider(value: Partial[TypeDivider]): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setText(value: PartialTypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait SimplePaletteColorOptions extends PaletteColorOptions {
    
    var contrastText: js.UndefOr[String] = js.native
    
    var dark: js.UndefOr[String] = js.native
    
    var light: js.UndefOr[String] = js.native
    
    var main: String = js.native
  }
  object SimplePaletteColorOptions {
    
    @scala.inline
    def apply(main: String): SimplePaletteColorOptions = {
      val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimplePaletteColorOptions]
    }
    
    @scala.inline
    implicit class SimplePaletteColorOptionsMutableBuilder[Self <: SimplePaletteColorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContrastText(value: String): Self = StObject.set(x, "contrastText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContrastTextUndefined: Self = StObject.set(x, "contrastText", js.undefined)
      
      @scala.inline
      def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      @scala.inline
      def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeAction extends StObject {
    
    var active: String = js.native
    
    var disabled: String = js.native
    
    var disabledBackground: String = js.native
    
    var hover: String = js.native
    
    var hoverOpacity: Double = js.native
    
    var selected: String = js.native
  }
  object TypeAction {
    
    @scala.inline
    def apply(
      active: String,
      disabled: String,
      disabledBackground: String,
      hover: String,
      hoverOpacity: Double,
      selected: String
    ): TypeAction = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledBackground = disabledBackground.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], hoverOpacity = hoverOpacity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeAction]
    }
    
    @scala.inline
    implicit class TypeActionMutableBuilder[Self <: TypeAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledBackground(value: String): Self = StObject.set(x, "disabledBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverOpacity(value: Double): Self = StObject.set(x, "hoverOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeBackground extends StObject {
    
    var default: String = js.native
    
    var paper: String = js.native
  }
  object TypeBackground {
    
    @scala.inline
    def apply(default: String, paper: String): TypeBackground = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeBackground]
    }
    
    @scala.inline
    implicit class TypeBackgroundMutableBuilder[Self <: TypeBackground] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeDivider = String
  
  @js.native
  trait TypeObject extends StObject {
    
    var action: TypeAction = js.native
    
    var background: TypeBackground = js.native
    
    var divider: TypeDivider = js.native
    
    var text: TypeText = js.native
  }
  object TypeObject {
    
    @scala.inline
    def apply(action: TypeAction, background: TypeBackground, divider: TypeDivider, text: TypeText): TypeObject = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeObject]
    }
    
    @scala.inline
    implicit class TypeObjectMutableBuilder[Self <: TypeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: TypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackground(value: TypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivider(value: TypeDivider): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: TypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeText extends StObject {
    
    var disabled: String = js.native
    
    var hint: String = js.native
    
    var primary: String = js.native
    
    var secondary: String = js.native
  }
  object TypeText {
    
    @scala.inline
    def apply(disabled: String, hint: String, primary: String, secondary: String): TypeText = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeText]
    }
    
    @scala.inline
    implicit class TypeTextMutableBuilder[Self <: TypeText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    }
  }
}
