package typings.jqueryDotAjaxfile

import typings.jqueryDotAjaxfile.KnockoutComponentTypes.Config
import typings.jqueryDotAjaxfile.KnockoutComponentTypes.Definition
import typings.jqueryDotAjaxfile.KnockoutComponentTypes.EmptyConfig
import typings.jqueryDotAjaxfile.KnockoutComponentTypes.Loader
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComponents extends js.Object {
  var defaultLoader: Loader = js.native
  var loaders: js.Array[Loader] = js.native
  def clearCachedDefinition(componentName: String): Unit = js.native
  def get(componentName: String, callback: js.Function1[/* definition */ Definition, Unit]): Unit = js.native
  def getComponentNameForNode(node: Node): String = js.native
  def isRegistered(componentName: String): Boolean = js.native
  // overloads for register method:
  def register(componentName: String, config: Config): Unit = js.native
  def register(componentName: String, config: EmptyConfig): Unit = js.native
  def unregister(componentName: String): Unit = js.native
}

