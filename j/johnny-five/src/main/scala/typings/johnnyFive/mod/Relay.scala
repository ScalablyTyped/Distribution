package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Relay")
@js.native
class Relay protected () extends StObject {
  def this(option: Double) = this()
  def this(option: RelayOption) = this()
  
  def close(): Unit = js.native
  
  var id: String = js.native
  
  val isOn: Boolean = js.native
  
  def open(): Unit = js.native
  
  var pin: Double | String = js.native
  
  def toggle(): Unit = js.native
  
  val `type`: String = js.native
}
