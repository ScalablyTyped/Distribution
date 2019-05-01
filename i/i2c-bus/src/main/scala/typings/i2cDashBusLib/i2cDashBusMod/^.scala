package typings
package i2cDashBusLib.i2cDashBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def open(busNumber: scala.Double, callback: CompletionCallback): I2cBus = js.native
  def openSync(busNumber: scala.Double): I2cBus = js.native
}

