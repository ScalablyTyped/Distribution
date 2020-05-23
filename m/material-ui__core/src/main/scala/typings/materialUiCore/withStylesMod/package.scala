package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withStylesMod {
  type ClassNameMap[ClassKey /* <: java.lang.String */] = typings.std.Record[ClassKey, java.lang.String]
  type StyleRules[ClassKey /* <: java.lang.String */] = typings.std.Record[ClassKey, typings.materialUiCore.withStylesMod.CSSProperties]
  type StyleRulesCallback[ClassKey /* <: java.lang.String */] = js.Function1[
    /* theme */ typings.materialUiCore.createMuiThemeMod.Theme, 
    typings.materialUiCore.withStylesMod.StyleRules[ClassKey]
  ]
  type WithStyles[T /* <: java.lang.String | typings.materialUiCore.withStylesMod.StyleRules[java.lang.String] | typings.materialUiCore.withStylesMod.StyleRulesCallback[java.lang.String] */, IncludeTheme /* <: js.UndefOr[scala.Boolean] */] = (js.Object | typings.materialUiCore.anon.Theme) with typings.materialUiCore.anon.Classes[T]
}
