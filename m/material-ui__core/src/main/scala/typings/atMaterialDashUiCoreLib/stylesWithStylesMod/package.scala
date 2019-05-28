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
}
