package typings
package i2cDashBusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ObjLimit extends js.Object {
  def apply[T, E](
    obj: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncForEachOfIterator[T, E]
  ): scala.Unit = js.native
  def apply[T, E](
    obj: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncForEachOfIterator[T, E],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
}

