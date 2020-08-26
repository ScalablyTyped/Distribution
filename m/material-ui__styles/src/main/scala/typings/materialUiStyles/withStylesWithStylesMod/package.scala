package typings.materialUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withStylesWithStylesMod {
  type ClassKeyInferable[Theme, Props /* <: js.Object */] = java.lang.String | (typings.materialUiStyles.withStylesWithStylesMod.Styles[Theme, Props, java.lang.String])
  type ClassKeyOfStyles[StylesOrClassKey] = js.Any | StylesOrClassKey
  type ClassNameMap[ClassKey /* <: java.lang.String */] = typings.std.Record[ClassKey, java.lang.String]
  type JSSFontface = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFace */ js.Any) with typings.materialUiStyles.anon.Fallbacks
  type PropsFunc[Props /* <: js.Object */, T] = js.Function1[/* props */ Props, T]
  type PropsOfStyles[StylesType] = js.Object
  type StyleRules[Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = typings.std.Record[
    ClassKey, 
    typings.materialUiStyles.withStylesWithStylesMod.CSSProperties | typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[Props] | (typings.materialUiStyles.withStylesWithStylesMod.PropsFunc[Props, typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[Props]])
  ]
  type StyleRulesCallback[Theme, Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = js.Function1[
    /* theme */ Theme, 
    typings.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]
  ]
  type Styles[Theme, Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = (typings.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]) | (typings.materialUiStyles.withStylesWithStylesMod.StyleRulesCallback[Theme, Props, ClassKey])
  type ThemeOfStyles[StylesType] = js.Object
  type WithStyles[StylesType /* <: typings.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable[_, _] */, IncludeTheme /* <: js.UndefOr[scala.Boolean] */] = (js.Object | typings.materialUiStyles.anon.Theme[StylesType]) with typings.materialUiStyles.anon.Classes[StylesType] with typings.materialUiStyles.withStylesWithStylesMod.PropsOfStyles[StylesType]
}
