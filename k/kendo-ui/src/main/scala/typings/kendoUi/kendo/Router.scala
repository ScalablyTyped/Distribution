package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router
  extends StObject
     with Observable {
  
  def destroy(): Unit = js.native
  
  def init(): Unit = js.native
  def init(options: RouterOptions): Unit = js.native
  
  def navigate(location: String): Unit = js.native
  def navigate(location: String, silent: Boolean): Unit = js.native
  
  def replace(location: String): Unit = js.native
  def replace(location: String, silent: Boolean): Unit = js.native
  
  def route(route: String, callback: js.Function): Unit = js.native
  
  var routes: js.Array[Route] = js.native
  
  def start(): Unit = js.native
}
