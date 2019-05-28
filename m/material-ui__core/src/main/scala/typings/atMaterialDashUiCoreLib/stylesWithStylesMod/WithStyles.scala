package typings
package atMaterialDashUiCoreLib.stylesWithStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined IncludeTheme extends true ? {  theme  :@material-ui/core.@material-ui/core/styles/createMuiTheme.Theme} : {} & {  classes  :@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<T extends string ? T : T extends @material-ui/core.@material-ui/core/styles/withStyles.StyleRulesCallback<infer K> ? K : T extends @material-ui/core.@material-ui/core/styles/withStyles.StyleRules<infer K> ? K : never>} */
trait WithStyles[T /* <: java.lang.String | StyleRules[java.lang.String] | StyleRulesCallback[java.lang.String] */, IncludeTheme /* <: js.UndefOr[scala.Boolean] */] extends js.Object {
  var classes: ClassNameMap[_ | T]
}

object WithStyles {
  @scala.inline
  def apply[T /* <: java.lang.String | StyleRules[java.lang.String] | StyleRulesCallback[java.lang.String] */, IncludeTheme /* <: js.UndefOr[scala.Boolean] */](classes: ClassNameMap[_ | T]): WithStyles[T, IncludeTheme] = {
    val __obj = js.Dynamic.literal(classes = classes)
  
    __obj.asInstanceOf[WithStyles[T, IncludeTheme]]
  }
}

