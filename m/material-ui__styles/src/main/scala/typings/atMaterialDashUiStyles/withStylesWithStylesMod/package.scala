package typings.atMaterialDashUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withStylesWithStylesMod {
  import typings.atMaterialDashUiTypes.atMaterialDashUiTypesMod.CoerceEmptyInterface
  import typings.std.Record

  type ClassKeyInferable[Theme, Props /* <: js.Object */] = String | (Styles[Theme, Props, String])
  type ClassKeyOfStyles[StylesOrClassKey] = js.Any | StylesOrClassKey
  type ClassNameMap[ClassKey /* <: String */] = Record[ClassKey, String]
  type PropsOfStyles[StylesType] = js.Object | CoerceEmptyInterface[js.Any]
  type StyleRules[Props /* <: js.Object */, ClassKey /* <: String */] = Record[
    ClassKey, 
    CreateCSSProperties[Props] | (js.Function1[/* props */ Props, CreateCSSProperties[Props]]) | CSSProperties | js.Function0[CSSProperties]
  ]
  type StyleRulesCallback[Theme, Props /* <: js.Object */, ClassKey /* <: String */] = js.Function1[/* theme */ Theme, StyleRules[Props, ClassKey]]
  type Styles[Theme, Props /* <: js.Object */, ClassKey /* <: String */] = (StyleRules[Props, ClassKey]) | (StyleRulesCallback[Theme, Props, ClassKey])
  type ThemeOfStyles[StylesType] = js.Object
}
