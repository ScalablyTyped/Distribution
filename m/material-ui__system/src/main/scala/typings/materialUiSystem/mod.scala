package typings.materialUiSystem

import typings.materialUiSystem.anon.Css
import typings.materialUiSystem.anon.Sx
import typings.materialUiSystem.anon.ThemeTheme
import typings.react.mod.CSSProperties
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material-ui/system", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@material-ui/system", "bgcolor")
  @js.native
  val bgcolor: SimpleStyleFunction["bgcolor"] = js.native
  
  @JSImport("@material-ui/system", "border")
  @js.native
  val border: SimpleStyleFunction["border"] = js.native
  
  @JSImport("@material-ui/system", "borderBottom")
  @js.native
  val borderBottom: SimpleStyleFunction["borderBottom"] = js.native
  
  @JSImport("@material-ui/system", "borderColor")
  @js.native
  val borderColor: SimpleStyleFunction["borderColor"] = js.native
  
  @JSImport("@material-ui/system", "borderLeft")
  @js.native
  val borderLeft: SimpleStyleFunction["borderLeft"] = js.native
  
  @JSImport("@material-ui/system", "borderRadius")
  @js.native
  val borderRadius: SimpleStyleFunction["borderRadius"] = js.native
  
  @JSImport("@material-ui/system", "borderRight")
  @js.native
  val borderRight: SimpleStyleFunction["borderRight"] = js.native
  
  @JSImport("@material-ui/system", "borderTop")
  @js.native
  val borderTop: SimpleStyleFunction["borderTop"] = js.native
  
  @JSImport("@material-ui/system", "borders")
  @js.native
  val borders: SimpleStyleFunction[
    "border" | "borderTop" | "borderRight" | "borderBottom" | "borderLeft" | "borderColor" | "borderRadius"
  ] = js.native
  
  @JSImport("@material-ui/system", "boxSizing")
  @js.native
  val boxSizing: SimpleStyleFunction["boxSizing"] = js.native
  
  inline def breakpoints[Props, Breakpoints /* <: String */](styleFunction: StyleFunction[Props]): StyleFunction[(Partial[Record[Breakpoints, Props]]) & Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("breakpoints")(styleFunction.asInstanceOf[js.Any]).asInstanceOf[StyleFunction[(Partial[Record[Breakpoints, Props]]) & Props]]
  
  @JSImport("@material-ui/system", "color")
  @js.native
  val color: SimpleStyleFunction["color"] = js.native
  
  inline def compose[T /* <: js.Array[StyleFunction[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): ComposedStyleFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(args.asInstanceOf[js.Any]).asInstanceOf[ComposedStyleFunction[T]]
  
  inline def css[Props](styleFunction: StyleFunction[Props]): StyleFunction[Props & Css[Props]] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(styleFunction.asInstanceOf[js.Any]).asInstanceOf[StyleFunction[Props & Css[Props]]]
  
  @JSImport("@material-ui/system", "display")
  @js.native
  val display: SimpleStyleFunction[
    "display" | "displayPrint" | "overflow" | "textOverflow" | "visibility" | "whiteSpace"
  ] = js.native
  
  @JSImport("@material-ui/system", "flexbox")
  @js.native
  val flexbox: SimpleStyleFunction[
    "flexBasis" | "flexDirection" | "flexWrap" | "justifyContent" | "alignItems" | "alignContent" | "order" | "flex" | "flexGrow" | "flexShrink" | "alignSelf" | "justifyItems" | "justifySelf"
  ] = js.native
  
  @JSImport("@material-ui/system", "fontFamily")
  @js.native
  val fontFamily: SimpleStyleFunction["fontFamily"] = js.native
  
  @JSImport("@material-ui/system", "fontSize")
  @js.native
  val fontSize: SimpleStyleFunction["fontSize"] = js.native
  
  @JSImport("@material-ui/system", "fontStyle")
  @js.native
  val fontStyle: SimpleStyleFunction["fontStyle"] = js.native
  
  @JSImport("@material-ui/system", "fontWeight")
  @js.native
  val fontWeight: SimpleStyleFunction["fontWeight"] = js.native
  
  @JSImport("@material-ui/system", "grid")
  @js.native
  val grid: SimpleStyleFunction[
    "gridGap" | "gridColumnGap" | "gridRowGap" | "gridColumn" | "gridRow" | "gridAutoFlow" | "gridAutoColumns" | "gridAutoRows" | "gridTemplateColumns" | "gridTemplateRows" | "gridTemplateAreas" | "gridArea"
  ] = js.native
  
  @JSImport("@material-ui/system", "height")
  @js.native
  val height: SimpleStyleFunction["height"] = js.native
  
  @JSImport("@material-ui/system", "letterSpacing")
  @js.native
  val letterSpacing: SimpleStyleFunction["letterSpacing"] = js.native
  
  @JSImport("@material-ui/system", "lineHeight")
  @js.native
  val lineHeight: SimpleStyleFunction["lineHeight"] = js.native
  
  @JSImport("@material-ui/system", "maxHeight")
  @js.native
  val maxHeight: SimpleStyleFunction["maxHeight"] = js.native
  
  @JSImport("@material-ui/system", "maxWidth")
  @js.native
  val maxWidth: SimpleStyleFunction["maxWidth"] = js.native
  
  @JSImport("@material-ui/system", "minHeight")
  @js.native
  val minHeight: SimpleStyleFunction["minHeight"] = js.native
  
  @JSImport("@material-ui/system", "minWidth")
  @js.native
  val minWidth: SimpleStyleFunction["minWidth"] = js.native
  
  @JSImport("@material-ui/system", "palette")
  @js.native
  val palette: SimpleStyleFunction["bgcolor" | "color"] = js.native
  
  @JSImport("@material-ui/system", "positions")
  @js.native
  val positions: SimpleStyleFunction["zIndex" | "position" | "top" | "right" | "bottom" | "left"] = js.native
  
  @JSImport("@material-ui/system", "shadows")
  @js.native
  val shadows: SimpleStyleFunction["boxShadow"] = js.native
  
  @JSImport("@material-ui/system", "sizeHeight")
  @js.native
  val sizeHeight: SimpleStyleFunction["sizeHeight"] = js.native
  
  @JSImport("@material-ui/system", "sizeWidth")
  @js.native
  val sizeWidth: SimpleStyleFunction["sizeWidth"] = js.native
  
  @JSImport("@material-ui/system", "sizing")
  @js.native
  val sizing: SimpleStyleFunction[
    "width" | "maxWidth" | "minWidth" | "height" | "maxHeight" | "minHeight" | "sizeWidth" | "sizeHeight" | "boxSizing"
  ] = js.native
  
  @JSImport("@material-ui/system", "spacing")
  @js.native
  val spacing: SimpleStyleFunction[
    "m" | "mt" | "mr" | "mb" | "ml" | "mx" | "my" | "p" | "pt" | "pr" | "pb" | "pl" | "px" | "py" | "margin" | "marginTop" | "marginRight" | "marginBottom" | "marginLeft" | "marginX" | "marginY" | "padding" | "paddingTop" | "paddingRight" | "paddingBottom" | "paddingLeft" | "paddingX" | "paddingY"
  ] = js.native
  
  inline def style[PropKey /* <: String */, Theme /* <: js.Object */](options: StyleOptions[PropKey, Theme]): StyleFunction[
    (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in PropKey ]:? unknown} */ js.Any) & ThemeTheme[Theme]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(options.asInstanceOf[js.Any]).asInstanceOf[StyleFunction[
    (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in PropKey ]:? unknown} */ js.Any) & ThemeTheme[Theme]
  ]]
  
  inline def styleFunctionSx[Props](styleFunction: StyleFunction[Props]): StyleFunction[Props & Sx[Props]] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleFunctionSx")(styleFunction.asInstanceOf[js.Any]).asInstanceOf[StyleFunction[Props & Sx[Props]]]
  
  @JSImport("@material-ui/system", "textAlign")
  @js.native
  val textAlign: SimpleStyleFunction["textAlign"] = js.native
  
  @JSImport("@material-ui/system", "typography")
  @js.native
  val typography: SimpleStyleFunction[
    "fontFamily" | "fontSize" | "fontStyle" | "fontWeight" | "letterSpacing" | "lineHeight" | "textAlign"
  ] = js.native
  
  @JSImport("@material-ui/system", "width")
  @js.native
  val width: SimpleStyleFunction["width"] = js.native
  
  type BordersProps = PropsFor[
    SimpleStyleFunction[
      "border" | "borderTop" | "borderRight" | "borderBottom" | "borderLeft" | "borderColor" | "borderRadius"
    ]
  ]
  
  // compose.js
  /**
    * given a list of StyleFunction return the intersection of the props each individual
    * StyleFunction requires.
    *
    * If `firstFn` requires { color: string } and `secondFn` requires { spacing: number }
    * their composed function requires { color: string, spacing: number }
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends std.Array<(arg : infer P): any> ? P : never
    }}}
    */
  @js.native
  trait ComposedArg[T] extends StObject
  
  type ComposedStyleFunction[T /* <: js.Array[StyleFunction[Any]] */] = StyleFunction[ComposedStyleProps[T]]
  
  type ComposedStyleProps[T] = ComposedArg[T]
  
  object DefaultBreakPoints {
    
    inline def lg: "lg" = "lg".asInstanceOf["lg"]
    
    inline def md: "md" = "md".asInstanceOf["md"]
    
    inline def sm: "sm" = "sm".asInstanceOf["sm"]
    
    inline def xl: "xl" = "xl".asInstanceOf["xl"]
    
    inline def xs: "xs" = "xs".asInstanceOf["xs"]
  }
  // breakpoints.js
  type DefaultBreakPoints = "xs" | "sm" | "md" | "lg" | "xl"
  
  type DisplayProps = PropsFor[
    SimpleStyleFunction[
      "display" | "displayPrint" | "overflow" | "textOverflow" | "visibility" | "whiteSpace"
    ]
  ]
  
  type FlexboxProps = PropsFor[
    SimpleStyleFunction[
      "flexBasis" | "flexDirection" | "flexWrap" | "justifyContent" | "alignItems" | "alignContent" | "order" | "flex" | "flexGrow" | "flexShrink" | "alignSelf" | "justifyItems" | "justifySelf"
    ]
  ]
  
  type GridProps = PropsFor[
    SimpleStyleFunction[
      "gridGap" | "gridColumnGap" | "gridRowGap" | "gridColumn" | "gridRow" | "gridAutoFlow" | "gridAutoColumns" | "gridAutoRows" | "gridTemplateColumns" | "gridTemplateRows" | "gridTemplateAreas" | "gridArea"
    ]
  ]
  
  // utils
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type PaletteProps = PropsFor[SimpleStyleFunction["bgcolor" | "color"]]
  
  type PositionsProps = PropsFor[SimpleStyleFunction["zIndex" | "position" | "top" | "right" | "bottom" | "left"]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    SomeStyleFunction extends @material-ui/system.@material-ui/system.StyleFunction<infer Props> ? Props : never
    }}}
    */
  @js.native
  trait PropsFor[SomeStyleFunction] extends StObject
  
  type ShadowsProps = PropsFor[SimpleStyleFunction["boxShadow"]]
  
  type SimpleStyleFunction[PropKey /* <: /* keyof any */ String */] = StyleFunction[Partial[Record[PropKey, Any]]]
  
  type SizingProps = PropsFor[
    SimpleStyleFunction[
      "width" | "maxWidth" | "minWidth" | "height" | "maxHeight" | "minHeight" | "sizeWidth" | "sizeHeight" | "boxSizing"
    ]
  ]
  
  type SpacingProps = PropsFor[
    SimpleStyleFunction[
      "m" | "mt" | "mr" | "mb" | "ml" | "mx" | "my" | "p" | "pt" | "pr" | "pb" | "pl" | "px" | "py" | "margin" | "marginTop" | "marginRight" | "marginBottom" | "marginLeft" | "marginX" | "marginY" | "padding" | "paddingTop" | "paddingRight" | "paddingBottom" | "paddingLeft" | "paddingX" | "paddingY"
    ]
  ]
  
  type StyleFunction[Props] = js.Function1[/* props */ Props, Any]
  
  trait StyleOptions[PropKey, Theme /* <: js.Object */] extends StObject {
    
    var cssProperty: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 791, starting with PropKey, "accentColor", "alignContent" */ Any
      ] = js.undefined
    
    var prop: PropKey
    
    /**
      * dot access in `Theme`
      */
    var themeKey: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* cssValue */ Any, Double | String | CSSProperties]] = js.undefined
  }
  object StyleOptions {
    
    inline def apply[PropKey, Theme /* <: js.Object */](prop: PropKey): StyleOptions[PropKey, Theme] = {
      val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleOptions[PropKey, Theme]]
    }
    
    extension [Self <: StyleOptions[?, ?], PropKey, Theme /* <: js.Object */](x: Self & (StyleOptions[PropKey, Theme])) {
      
      inline def setCssProperty(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 791, starting with PropKey, "accentColor", "alignContent" */ Any
      ): Self = StObject.set(x, "cssProperty", value.asInstanceOf[js.Any])
      
      inline def setCssPropertyUndefined: Self = StObject.set(x, "cssProperty", js.undefined)
      
      inline def setProp(value: PropKey): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setThemeKey(value: String): Self = StObject.set(x, "themeKey", value.asInstanceOf[js.Any])
      
      inline def setThemeKeyUndefined: Self = StObject.set(x, "themeKey", js.undefined)
      
      inline def setTransform(value: /* cssValue */ Any => Double | String | CSSProperties): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type TypographyProps = PropsFor[
    SimpleStyleFunction[
      "fontFamily" | "fontSize" | "fontStyle" | "fontWeight" | "letterSpacing" | "lineHeight" | "textAlign"
    ]
  ]
}
