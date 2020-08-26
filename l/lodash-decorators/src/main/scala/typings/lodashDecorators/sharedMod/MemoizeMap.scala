package typings.lodashDecorators.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoizeMap[T, U] extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  def delete(key: T): Unit = js.native
  def get(key: T): U = js.native
  def has(key: T): Boolean = js.native
  def set(key: T, value: U): Unit = js.native
}

object MemoizeMap {
  @scala.inline
  def apply[T, U](delete: T => Unit, get: T => U, has: T => Boolean, set: (T, U) => Unit): MemoizeMap[T, U] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[MemoizeMap[T, U]]
  }
  @scala.inline
  implicit class MemoizeMapOps[Self <: MemoizeMap[_, _], T, U] (val x: Self with (MemoizeMap[T, U])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: T => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: T => U): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: T => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (T, U) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
  }
  
}

