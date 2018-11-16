package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.Router")
@js.native
class Router () extends Observable {
  def this(options: RouterOptions) = this()
  var routes: js.Array[Route] = js.native
  def destroy(): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def init(options: RouterOptions): scala.Unit = js.native
  def navigate(location: java.lang.String): scala.Unit = js.native
  def navigate(location: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
  def replace(location: java.lang.String): scala.Unit = js.native
  def replace(location: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
  def route(route: java.lang.String, callback: js.Function): scala.Unit = js.native
  def start(): scala.Unit = js.native
}

