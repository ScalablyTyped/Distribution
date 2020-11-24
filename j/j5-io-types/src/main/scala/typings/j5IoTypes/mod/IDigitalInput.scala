package typings.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDigitalInput extends IPeripheral {
  
  val pullResistor: Double = js.native
  
  def read(): Double = js.native
  
  val value: Value = js.native
}
