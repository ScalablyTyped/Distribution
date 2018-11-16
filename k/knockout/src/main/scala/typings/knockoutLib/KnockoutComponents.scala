package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComponents extends js.Object {
  var defaultLoader: knockoutLib.KnockoutComponentTypesNs.Loader = js.native
  var loaders: js.Array[knockoutLib.KnockoutComponentTypesNs.Loader] = js.native
  def clearCachedDefinition(componentName: java.lang.String): scala.Unit = js.native
  def get(
    componentName: java.lang.String,
    callback: js.Function1[/* definition */ knockoutLib.KnockoutComponentTypesNs.Definition, scala.Unit]
  ): scala.Unit = js.native
  def getComponentNameForNode(node: stdLib.Node): java.lang.String = js.native
  def isRegistered(componentName: java.lang.String): scala.Boolean = js.native
  // overloads for register method:
  def register(componentName: java.lang.String, config: knockoutLib.KnockoutComponentTypesNs.Config): scala.Unit = js.native
  // overloads for register method:
  def register(componentName: java.lang.String, config: knockoutLib.KnockoutComponentTypesNs.EmptyConfig): scala.Unit = js.native
  def unregister(componentName: java.lang.String): scala.Unit = js.native
}

