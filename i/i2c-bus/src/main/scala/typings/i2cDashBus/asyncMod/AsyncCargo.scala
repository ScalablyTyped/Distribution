package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncCargo extends js.Object {
  var payload: js.UndefOr[Double] = js.native
  def drain(): Unit = js.native
  def empty(): Unit = js.native
  def idle(): Boolean = js.native
  def kill(): Unit = js.native
  def length(): Double = js.native
  def pause(): Unit = js.native
  def push(task: js.Any): Unit = js.native
  def push(task: js.Any, callback: js.Function): Unit = js.native
  def resume(): Unit = js.native
  def saturated(): Unit = js.native
}

