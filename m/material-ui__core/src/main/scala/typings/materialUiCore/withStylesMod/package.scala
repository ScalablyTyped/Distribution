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
}
