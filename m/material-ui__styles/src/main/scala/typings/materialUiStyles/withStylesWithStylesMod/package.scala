package typings.materialUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withStylesWithStylesMod {
  type ClassKeyInferable[Theme, Props /* <: js.Object */] = java.lang.String | (typings.materialUiStyles.withStylesWithStylesMod.Styles[Theme, Props, java.lang.String])
  type ClassKeyOfStyles[StylesOrClassKey] = js.Any | StylesOrClassKey
  type ClassNameMap[ClassKey /* <: java.lang.String */] = typings.std.Record[ClassKey, java.lang.String]
  type PropsOfStyles[StylesType] = js.Object
  type StyleRules[Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = typings.std.Record[
    ClassKey, 
    typings.materialUiStyles.withStylesWithStylesMod.CSSProperties | typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[Props] | (js.Function1[
      /* props */ Props, 
      typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[Props]
    ])
  ]
  type StyleRulesCallback[Theme, Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = js.Function1[
    /* theme */ Theme, 
    typings.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]
  ]
  type Styles[Theme, Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = (typings.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]) | (typings.materialUiStyles.withStylesWithStylesMod.StyleRulesCallback[Theme, Props, ClassKey])
  type ThemeOfStyles[StylesType] = js.Object
}
