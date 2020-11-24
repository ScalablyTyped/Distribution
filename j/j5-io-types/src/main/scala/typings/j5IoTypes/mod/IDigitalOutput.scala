package typings.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDigitalOutput extends IPeripheral {
  
  val value: Double = js.native
  
  def write(value: Value): Unit = js.native
}
