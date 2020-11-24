package typings.kendoUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait History extends Observable {
  
  def change(callback: js.Function): Unit = js.native
  
  var current: String = js.native
  
  def navigate(location: String): Unit = js.native
  def navigate(location: String, silent: Boolean): Unit = js.native
  
  var root: String = js.native
  
  def start(options: js.Object): Unit = js.native
  
  def stop(): Unit = js.native
}
