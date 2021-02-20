package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "ShiftRegister")
@js.native
class ShiftRegister protected () extends StObject {
  def this(option: ShiftRegisterOption) = this()
  
  def clear(): Unit = js.native
  
  def display(number: String): Unit = js.native
  def display(number: Double): Unit = js.native
  
  var id: String = js.native
  
  val isAnode: Boolean = js.native
  
  var pins: js.Any = js.native
  
  def reset(): Unit = js.native
  
  def send(value: Double*): Unit = js.native
  
  val value: js.Any = js.native
}
