package typings.i2cDashBus.i2cDashBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def open(busNumber: Double, callback: CompletionCallback): I2cBus = js.native
  def openSync(busNumber: Double): I2cBus = js.native
}

