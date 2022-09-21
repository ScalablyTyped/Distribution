package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserEvents
  extends StObject
     with Observable {
  
  def cancel(): Unit = js.native
  
  def capture(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def end(x: Any, y: Any): Unit = js.native
  
  def move(x: Any, y: Any): Unit = js.native
  
  def notify(eventName: String): Boolean = js.native
  def notify(eventName: String, data: Any): Boolean = js.native
  def notify(eventName: Unit, data: Any): Boolean = js.native
  
  // API
  def press(x: Any, y: Any, target: Any): Unit = js.native
  
  def preventIfMoving(): Unit = js.native
  def preventIfMoving(e: Any): Unit = js.native
}
