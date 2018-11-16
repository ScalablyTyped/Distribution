package typings
package i2cDashBusLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncCargo extends js.Object {
  var payload: js.UndefOr[scala.Double] = js.native
  def drain(): scala.Unit = js.native
  def empty(): scala.Unit = js.native
  def idle(): scala.Boolean = js.native
  def kill(): scala.Unit = js.native
  def length(): scala.Double = js.native
  def pause(): scala.Unit = js.native
  def push(task: js.Any): scala.Unit = js.native
  def push(task: js.Any, callback: js.Function): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def saturated(): scala.Unit = js.native
}

