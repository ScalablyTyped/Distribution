package typings.kendoDashUi.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.History")
@js.native
class History () extends Observable {
  var current: String = js.native
  var root: String = js.native
  def change(callback: js.Function): Unit = js.native
  def navigate(location: String): Unit = js.native
  def navigate(location: String, silent: Boolean): Unit = js.native
  def start(options: js.Object): Unit = js.native
  def stop(): Unit = js.native
}

