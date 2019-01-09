package typings
package i2cDashBusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrCallbackIterator extends js.Object {
  def apply[T, R, E](
    arr: i2cDashBusLib.asyncMod.Dictionary[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](
    arr: i2cDashBusLib.asyncMod.Dictionary[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](arr: js.Array[T], iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](arr: nodeLib.IterableIterator[T], iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: nodeLib.IterableIterator[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
}

