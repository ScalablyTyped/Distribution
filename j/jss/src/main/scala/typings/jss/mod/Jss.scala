package typings.jss.mod

import typings.jss.anon.PartialJssOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jss extends StObject {
  
  def createRule(style: JssStyle[Any, Unit]): Rule = js.native
  def createRule(style: JssStyle[Any, Unit], options: RuleFactoryOptions): Rule = js.native
  def createRule[Name /* <: String */](name: Name, style: JssStyle[Any, Unit]): Rule = js.native
  def createRule[Name /* <: String */](name: Name, style: JssStyle[Any, Unit], options: RuleFactoryOptions): Rule = js.native
  
  def createStyleSheet[Name /* <: String | Double | js.Symbol */](styles: Partial[Styles[Name, Any, Unit]]): StyleSheet[Name] = js.native
  def createStyleSheet[Name /* <: String | Double | js.Symbol */](styles: Partial[Styles[Name, Any, Unit]], options: StyleSheetFactoryOptions): StyleSheet[Name] = js.native
  
  def removeStyleSheet(sheet: StyleSheet[String | Double | js.Symbol]): this.type = js.native
  
  def setup(): this.type = js.native
  def setup(options: PartialJssOptions): this.type = js.native
  
  def use(plugins: Plugin*): this.type = js.native
}
