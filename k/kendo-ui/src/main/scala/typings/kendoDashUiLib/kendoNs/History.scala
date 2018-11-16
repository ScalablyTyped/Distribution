package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.History")
@js.native
class History () extends Observable {
  var current: java.lang.String = js.native
  var root: java.lang.String = js.native
  def change(callback: js.Function): scala.Unit = js.native
  def navigate(location: java.lang.String): scala.Unit = js.native
  def navigate(location: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
  def start(options: js.Object): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

