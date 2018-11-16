package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stylesWithStylesMod {
  type ClassNameMap[ClassKey /* <: java.lang.String */] = stdLib.Record[ClassKey, java.lang.String]
  type StyleRules[ClassKey /* <: java.lang.String */] = stdLib.Record[ClassKey, CSSProperties]
  type StyleRulesCallback[ClassKey /* <: java.lang.String */] = js.Function1[
    /* theme */ atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme, 
    StyleRules[ClassKey]
  ]
  type WithStyles[T /* <: java.lang.String | StyleRules[java.lang.String] | StyleRulesCallback[java.lang.String] */, IncludeTheme /* <: js.UndefOr[scala.Boolean] */] = (js.Object | atMaterialDashUiCoreLib.Anon_Theme) with atMaterialDashUiCoreLib.Anon_Classes[T]
}
