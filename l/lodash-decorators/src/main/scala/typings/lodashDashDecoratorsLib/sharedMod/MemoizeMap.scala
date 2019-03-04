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
    delete: js.Function1[T, scala.Unit],
    get: js.Function1[T, U],
    has: js.Function1[T, scala.Boolean],
    set: js.Function2[T, U, scala.Unit],
    clear: js.Function0[scala.Unit] = null
  ): MemoizeMap[T, U] = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, has = has, set = set)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    __obj.asInstanceOf[MemoizeMap[T, U]]
  }
}

