package typings.i2cBus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("i2c-bus", "openPromisified")
@js.native
object openPromisified extends js.Object {
  
  def apply(busNumber: Double): js.Promise[PromisifiedBus] = js.native
  def apply(busNumber: Double, options: OpenOptions): js.Promise[PromisifiedBus] = js.native
}
