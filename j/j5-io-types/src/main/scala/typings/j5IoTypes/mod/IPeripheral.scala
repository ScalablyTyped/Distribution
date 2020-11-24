package typings.j5IoTypes.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPeripheral extends EventEmitter {
  
  val alive: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  val pins: js.Array[Double] = js.native
  
  def validateAlive(): Unit = js.native
}
