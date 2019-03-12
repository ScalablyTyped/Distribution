package typings
package lodashDashDecoratorsLib.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoizeMap[T, U] extends js.Object {
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def delete(key: T): scala.Unit
  def get(key: T): U
  def has(key: T): scala.Boolean
  def set(key: T, value: U): scala.Unit
}

object MemoizeMap {
  @scala.inline
  def apply[T, U](
    delete: T => scala.Unit,
    get: T => U,
    has: T => scala.Boolean,
    set: (T, U) => scala.Unit,
    clear: () => scala.Unit = null
  ): MemoizeMap[T, U] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    __obj.asInstanceOf[MemoizeMap[T, U]]
  }
}

