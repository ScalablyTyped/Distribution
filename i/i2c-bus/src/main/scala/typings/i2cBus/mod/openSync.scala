package typings.i2cBus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("i2c-bus", "openSync")
@js.native
object openSync extends js.Object {
  
  def apply(busNumber: Double): I2CBus = js.native
  def apply(busNumber: Double, options: OpenOptions): I2CBus = js.native
}
