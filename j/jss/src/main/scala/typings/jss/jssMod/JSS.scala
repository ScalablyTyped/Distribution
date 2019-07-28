package typings.jss.jssMod

import typings.jss.cssMod.Style
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jss", "JSS")
@js.native
class JSS () extends js.Object {
  def this(options: Partial[JSSOptions]) = this()
  def createRule(style: Style): Rule = js.native
  def createRule(style: Style, options: RuleFactoryOptions[_]): Rule = js.native
  def createRule[Name /* <: String */](name: Name, style: Style): Rule = js.native
  def createRule[Name /* <: String */](name: Name, style: Style, options: RuleFactoryOptions[Name]): Rule = js.native
  def createStyleSheet[Name /* <: String */](styles: Partial[Styles[Name]]): StyleSheet[Name] = js.native
  def createStyleSheet[Name /* <: String */](styles: Partial[Styles[Name]], options: CreateStyleSheetOptions[Name]): StyleSheet[Name] = js.native
  def removeStyleSheet(sheet: StyleSheet[_]): this.type = js.native
  def setup(): this.type = js.native
  def setup(options: Partial[JSSOptions]): this.type = js.native
  def use(plugins: JSSPlugin*): this.type = js.native
}

