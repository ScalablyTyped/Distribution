package typings
package jssLib.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jss", "JSS")
@js.native
class JSS () extends js.Object {
  def this(options: stdLib.Partial[JSSOptions]) = this()
  def createRule(style: jssLib.cssMod.Style): Rule = js.native
  def createRule(style: jssLib.cssMod.Style, options: RuleFactoryOptions[_]): Rule = js.native
  def createRule[Name /* <: java.lang.String */](name: Name, style: jssLib.cssMod.Style): Rule = js.native
  def createRule[Name /* <: java.lang.String */](name: Name, style: jssLib.cssMod.Style, options: RuleFactoryOptions[Name]): Rule = js.native
  def createStyleSheet[Name /* <: java.lang.String */](styles: stdLib.Partial[Styles[Name]]): StyleSheet[Name] = js.native
  def createStyleSheet[Name /* <: java.lang.String */](styles: stdLib.Partial[Styles[Name]], options: CreateStyleSheetOptions[Name]): StyleSheet[Name] = js.native
  def removeStyleSheet(sheet: StyleSheet[_]): this.type = js.native
  def setup(): this.type = js.native
  def setup(options: stdLib.Partial[JSSOptions]): this.type = js.native
  def use(plugins: JSSPlugin*): this.type = js.native
}

