package typings.materialUiCore

import typings.materialUiCore.anon.Dark
import typings.materialUiCore.anon.PartialCommonColors
import typings.materialUiCore.anon.PartialTypeAction
import typings.materialUiCore.anon.PartialTypeBackground
import typings.materialUiCore.anon.PartialTypeText
import typings.materialUiCore.mod.Color
import typings.materialUiCore.mod.PaletteType
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesCreatePaletteMod {
  
  @JSImport("@material-ui/core/styles/createPalette", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(palette: PaletteOptions): Palette = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(palette.asInstanceOf[js.Any]).asInstanceOf[Palette]
  
  @JSImport("@material-ui/core/styles/createPalette", "dark")
  @js.native
  val dark: TypeObject = js.native
  
  @JSImport("@material-ui/core/styles/createPalette", "light")
  @js.native
  val light: TypeObject = js.native
  
  /* Inlined std.Partial<@material-ui/core.@material-ui/core.Color> */
  trait ColorPartial
    extends StObject
       with PaletteColorOptions {
    
    var `100`: js.UndefOr[String] = js.undefined
    
    var `200`: js.UndefOr[String] = js.undefined
    
    var `300`: js.UndefOr[String] = js.undefined
    
    var `400`: js.UndefOr[String] = js.undefined
    
    var `50`: js.UndefOr[String] = js.undefined
    
    var `500`: js.UndefOr[String] = js.undefined
    
    var `600`: js.UndefOr[String] = js.undefined
    
    var `700`: js.UndefOr[String] = js.undefined
    
    var `800`: js.UndefOr[String] = js.undefined
    
    var `900`: js.UndefOr[String] = js.undefined
    
    var A100: js.UndefOr[String] = js.undefined
    
    var A200: js.UndefOr[String] = js.undefined
    
    var A400: js.UndefOr[String] = js.undefined
    
    var A700: js.UndefOr[String] = js.undefined
  }
  object ColorPartial {
    
    inline def apply(): ColorPartial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPartial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPartial] (val x: Self) extends AnyVal {
      
      inline def set100(value: String): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
      
      inline def set100Undefined: Self = StObject.set(x, "100", js.undefined)
      
      inline def set200(value: String): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
      
      inline def set200Undefined: Self = StObject.set(x, "200", js.undefined)
      
      inline def set300(value: String): Self = StObject.set(x, "300", value.asInstanceOf[js.Any])
      
      inline def set300Undefined: Self = StObject.set(x, "300", js.undefined)
      
      inline def set400(value: String): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
      
      inline def set400Undefined: Self = StObject.set(x, "400", js.undefined)
      
      inline def set50(value: String): Self = StObject.set(x, "50", value.asInstanceOf[js.Any])
      
      inline def set500(value: String): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
      
      inline def set500Undefined: Self = StObject.set(x, "500", js.undefined)
      
      inline def set50Undefined: Self = StObject.set(x, "50", js.undefined)
      
      inline def set600(value: String): Self = StObject.set(x, "600", value.asInstanceOf[js.Any])
      
      inline def set600Undefined: Self = StObject.set(x, "600", js.undefined)
      
      inline def set700(value: String): Self = StObject.set(x, "700", value.asInstanceOf[js.Any])
      
      inline def set700Undefined: Self = StObject.set(x, "700", js.undefined)
      
      inline def set800(value: String): Self = StObject.set(x, "800", value.asInstanceOf[js.Any])
      
      inline def set800Undefined: Self = StObject.set(x, "800", js.undefined)
      
      inline def set900(value: String): Self = StObject.set(x, "900", value.asInstanceOf[js.Any])
      
      inline def set900Undefined: Self = StObject.set(x, "900", js.undefined)
      
      inline def setA100(value: String): Self = StObject.set(x, "A100", value.asInstanceOf[js.Any])
      
      inline def setA100Undefined: Self = StObject.set(x, "A100", js.undefined)
      
      inline def setA200(value: String): Self = StObject.set(x, "A200", value.asInstanceOf[js.Any])
      
      inline def setA200Undefined: Self = StObject.set(x, "A200", js.undefined)
      
      inline def setA400(value: String): Self = StObject.set(x, "A400", value.asInstanceOf[js.Any])
      
      inline def setA400Undefined: Self = StObject.set(x, "A400", js.undefined)
      
      inline def setA700(value: String): Self = StObject.set(x, "A700", value.asInstanceOf[js.Any])
      
      inline def setA700Undefined: Self = StObject.set(x, "A700", js.undefined)
    }
  }
  
  trait CommonColors extends StObject {
    
    var black: String
    
    var white: String
  }
  object CommonColors {
    
    inline def apply(black: String, white: String): CommonColors = {
      val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonColors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonColors] (val x: Self) extends AnyVal {
      
      inline def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Palette extends StObject {
    
    var action: TypeAction = js.native
    
    def augmentColor(color: ColorPartial): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: String, darkShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: String, darkShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: Double, darkShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: Double, darkShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: Unit, darkShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: String, lightShade: Unit, darkShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: String, darkShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: String, darkShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Double, darkShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Double, darkShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Unit, darkShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Double, lightShade: Unit, darkShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Unit, lightShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Unit, lightShade: String, darkShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Unit, lightShade: String, darkShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Unit, lightShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Unit, lightShade: Double, darkShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Unit, lightShade: Double, darkShade: Double): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Unit, lightShade: Unit, darkShade: String): PaletteColor = js.native
    def augmentColor(color: ColorPartial, mainShade: Unit, lightShade: Unit, darkShade: Double): PaletteColor = js.native
    def augmentColor(color: PaletteColorOptions): PaletteColor = js.native
    
    var background: TypeBackground = js.native
    
    var common: CommonColors = js.native
    
    var contrastThreshold: Double = js.native
    
    var divider: TypeDivider = js.native
    
    var error: PaletteColor = js.native
    
    def getContrastText(background: String): String = js.native
    
    var grey: Color = js.native
    
    var info: PaletteColor = js.native
    
    var primary: PaletteColor = js.native
    
    var secondary: PaletteColor = js.native
    
    var success: PaletteColor = js.native
    
    var text: TypeText = js.native
    
    var tonalOffset: PaletteTonalOffset = js.native
    
    var `type`: PaletteType = js.native
    
    var warning: PaletteColor = js.native
  }
  
  trait PaletteColor extends StObject {
    
    var contrastText: String
    
    var dark: String
    
    var light: String
    
    var main: String
  }
  object PaletteColor {
    
    inline def apply(contrastText: String, dark: String, light: String, main: String): PaletteColor = {
      val __obj = js.Dynamic.literal(contrastText = contrastText.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaletteColor] (val x: Self) extends AnyVal {
      
      inline def setContrastText(value: String): Self = StObject.set(x, "contrastText", value.asInstanceOf[js.Any])
      
      inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.stylesCreatePaletteMod.SimplePaletteColorOptions
    - typings.materialUiCore.stylesCreatePaletteMod.ColorPartial
  */
  trait PaletteColorOptions extends StObject
  object PaletteColorOptions {
    
    inline def ColorPartial(): typings.materialUiCore.stylesCreatePaletteMod.ColorPartial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.materialUiCore.stylesCreatePaletteMod.ColorPartial]
    }
    
    inline def SimplePaletteColorOptions(main: String): typings.materialUiCore.stylesCreatePaletteMod.SimplePaletteColorOptions = {
      val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.materialUiCore.stylesCreatePaletteMod.SimplePaletteColorOptions]
    }
  }
  
  trait PaletteOptions extends StObject {
    
    var action: js.UndefOr[PartialTypeAction] = js.undefined
    
    var background: js.UndefOr[PartialTypeBackground] = js.undefined
    
    var common: js.UndefOr[PartialCommonColors] = js.undefined
    
    var contrastThreshold: js.UndefOr[Double] = js.undefined
    
    var divider: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[PaletteColorOptions] = js.undefined
    
    var getContrastText: js.UndefOr[js.Function1[/* background */ String, String]] = js.undefined
    
    var grey: js.UndefOr[ColorPartial] = js.undefined
    
    var info: js.UndefOr[PaletteColorOptions] = js.undefined
    
    var primary: js.UndefOr[PaletteColorOptions] = js.undefined
    
    var secondary: js.UndefOr[PaletteColorOptions] = js.undefined
    
    var success: js.UndefOr[PaletteColorOptions] = js.undefined
    
    var text: js.UndefOr[PartialTypeText] = js.undefined
    
    var tonalOffset: js.UndefOr[PaletteTonalOffset] = js.undefined
    
    var `type`: js.UndefOr[PaletteType] = js.undefined
    
    var warning: js.UndefOr[PaletteColorOptions] = js.undefined
  }
  object PaletteOptions {
    
    inline def apply(): PaletteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaletteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaletteOptions] (val x: Self) extends AnyVal {
      
      inline def setAction(value: PartialTypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setBackground(value: PartialTypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setCommon(value: PartialCommonColors): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      inline def setContrastThreshold(value: Double): Self = StObject.set(x, "contrastThreshold", value.asInstanceOf[js.Any])
      
      inline def setContrastThresholdUndefined: Self = StObject.set(x, "contrastThreshold", js.undefined)
      
      inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setError(value: PaletteColorOptions): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setGetContrastText(value: /* background */ String => String): Self = StObject.set(x, "getContrastText", js.Any.fromFunction1(value))
      
      inline def setGetContrastTextUndefined: Self = StObject.set(x, "getContrastText", js.undefined)
      
      inline def setGrey(value: ColorPartial): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
      
      inline def setGreyUndefined: Self = StObject.set(x, "grey", js.undefined)
      
      inline def setInfo(value: PaletteColorOptions): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setPrimary(value: PaletteColorOptions): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setSecondary(value: PaletteColorOptions): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      inline def setSuccess(value: PaletteColorOptions): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setText(value: PartialTypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTonalOffset(value: PaletteTonalOffset): Self = StObject.set(x, "tonalOffset", value.asInstanceOf[js.Any])
      
      inline def setTonalOffsetUndefined: Self = StObject.set(x, "tonalOffset", js.undefined)
      
      inline def setType(value: PaletteType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWarning(value: PaletteColorOptions): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type PaletteTonalOffset = Double | Dark
  
  /* Inlined {[ P in keyof @material-ui/core.@material-ui/core/styles/createPalette.TypeObject ]:? std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeObject[P]>} */
  trait PartialTypeObject extends StObject {
    
    var action: js.UndefOr[PartialTypeAction] = js.undefined
    
    var background: js.UndefOr[PartialTypeBackground] = js.undefined
    
    var divider: js.UndefOr[Partial[TypeDivider]] = js.undefined
    
    var text: js.UndefOr[PartialTypeText] = js.undefined
  }
  object PartialTypeObject {
    
    inline def apply(): PartialTypeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTypeObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialTypeObject] (val x: Self) extends AnyVal {
      
      inline def setAction(value: PartialTypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setBackground(value: PartialTypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDivider(value: Partial[TypeDivider]): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setText(value: PartialTypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait SimplePaletteColorOptions
    extends StObject
       with PaletteColorOptions {
    
    var contrastText: js.UndefOr[String] = js.undefined
    
    var dark: js.UndefOr[String] = js.undefined
    
    var light: js.UndefOr[String] = js.undefined
    
    var main: String
  }
  object SimplePaletteColorOptions {
    
    inline def apply(main: String): SimplePaletteColorOptions = {
      val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimplePaletteColorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplePaletteColorOptions] (val x: Self) extends AnyVal {
      
      inline def setContrastText(value: String): Self = StObject.set(x, "contrastText", value.asInstanceOf[js.Any])
      
      inline def setContrastTextUndefined: Self = StObject.set(x, "contrastText", js.undefined)
      
      inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeAction extends StObject {
    
    var activatedOpacity: Double
    
    var active: String
    
    var disabled: String
    
    var disabledBackground: String
    
    var disabledOpacity: Double
    
    var focus: String
    
    var focusOpacity: Double
    
    var hover: String
    
    var hoverOpacity: Double
    
    var selected: String
    
    var selectedOpacity: Double
  }
  object TypeAction {
    
    inline def apply(
      activatedOpacity: Double,
      active: String,
      disabled: String,
      disabledBackground: String,
      disabledOpacity: Double,
      focus: String,
      focusOpacity: Double,
      hover: String,
      hoverOpacity: Double,
      selected: String,
      selectedOpacity: Double
    ): TypeAction = {
      val __obj = js.Dynamic.literal(activatedOpacity = activatedOpacity.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledBackground = disabledBackground.asInstanceOf[js.Any], disabledOpacity = disabledOpacity.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusOpacity = focusOpacity.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], hoverOpacity = hoverOpacity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedOpacity = selectedOpacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeAction] (val x: Self) extends AnyVal {
      
      inline def setActivatedOpacity(value: Double): Self = StObject.set(x, "activatedOpacity", value.asInstanceOf[js.Any])
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledBackground(value: String): Self = StObject.set(x, "disabledBackground", value.asInstanceOf[js.Any])
      
      inline def setDisabledOpacity(value: Double): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusOpacity(value: Double): Self = StObject.set(x, "focusOpacity", value.asInstanceOf[js.Any])
      
      inline def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverOpacity(value: Double): Self = StObject.set(x, "hoverOpacity", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedOpacity(value: Double): Self = StObject.set(x, "selectedOpacity", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeBackground extends StObject {
    
    var default: String
    
    var paper: String
  }
  object TypeBackground {
    
    inline def apply(default: String, paper: String): TypeBackground = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeBackground]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeBackground] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeDivider = String
  
  trait TypeObject extends StObject {
    
    var action: TypeAction
    
    var background: TypeBackground
    
    var divider: TypeDivider
    
    var text: TypeText
  }
  object TypeObject {
    
    inline def apply(action: TypeAction, background: TypeBackground, divider: TypeDivider, text: TypeText): TypeObject = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeObject] (val x: Self) extends AnyVal {
      
      inline def setAction(value: TypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setBackground(value: TypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setDivider(value: TypeDivider): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setText(value: TypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeText extends StObject {
    
    var disabled: String
    
    var hint: String
    
    var primary: String
    
    var secondary: String
  }
  object TypeText {
    
    inline def apply(disabled: String, hint: String, primary: String, secondary: String): TypeText = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeText] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    }
  }
}
