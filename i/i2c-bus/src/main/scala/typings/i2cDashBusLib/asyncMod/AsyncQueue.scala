package typings
package i2cDashBusLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncQueue[T] extends js.Object {
  var buffer: scala.Double = js.native
  var concurrency: scala.Double = js.native
  var paused: scala.Boolean = js.native
  var started: scala.Boolean = js.native
  def drain(): js.Any = js.native
  def empty(): js.Any = js.native
  def error(error: nodeLib.Error, data: js.Any): scala.Unit = js.native
  def idle(): scala.Boolean = js.native
  def kill(): scala.Unit = js.native
  def length(): scala.Double = js.native
  def pause(): scala.Unit = js.native
  def push[R, E](task: T): scala.Unit = js.native
  def push[R, E](task: T, callback: AsyncResultCallback[R, E]): scala.Unit = js.native
  def push[R, E](task: js.Array[T]): scala.Unit = js.native
  def push[R, E](task: js.Array[T], callback: AsyncResultCallback[R, E]): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def running(): scala.Double = js.native
  def saturated(): js.Any = js.native
  def unsaturated(): scala.Unit = js.native
  def unshift[E](task: T): scala.Unit = js.native
  def unshift[E](task: T, callback: ErrorCallback[E]): scala.Unit = js.native
  def unshift[E](task: js.Array[T]): scala.Unit = js.native
  def unshift[E](task: js.Array[T], callback: ErrorCallback[E]): scala.Unit = js.native
  def workersList(): js.Array[i2cDashBusLib.Anon_Callback[T]] = js.native
}

