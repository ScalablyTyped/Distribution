package typings.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGPIOModule extends js.Object {
  var PULL_DOWN: Double = js.native
  var PULL_NONE: Double = js.native
  var PULL_UP: Double = js.native
  def createDigitalInput(config: String): IDigitalInput = js.native
  def createDigitalInput(config: Double): IDigitalInput = js.native
  def createDigitalInput(config: IGPIOConfig): IDigitalInput = js.native
  def createDigitalOutput(config: String): IDigitalOutput = js.native
  def createDigitalOutput(config: Double): IDigitalOutput = js.native
  def createDigitalOutput(config: IGPIOConfig): IDigitalOutput = js.native
}

