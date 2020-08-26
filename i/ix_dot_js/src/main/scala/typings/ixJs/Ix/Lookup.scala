package typings.ixJs.Ix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lookup[TKey, TValue] extends js.Object {
  def get(key: TKey): Enumerable[TValue] = js.native
  def has(key: TKey): Boolean = js.native
  def length(): Double = js.native
  def toEnumerable(): Enumerable[Grouping[TKey, TValue]] = js.native
}

object Lookup {
  @scala.inline
  def apply[TKey, TValue](
    get: TKey => Enumerable[TValue],
    has: TKey => Boolean,
    length: () => Double,
    toEnumerable: () => Enumerable[Grouping[TKey, TValue]]
  ): Lookup[TKey, TValue] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), length = js.Any.fromFunction0(length), toEnumerable = js.Any.fromFunction0(toEnumerable))
    __obj.asInstanceOf[Lookup[TKey, TValue]]
  }
  @scala.inline
  implicit class LookupOps[Self <: Lookup[_, _], TKey, TValue] (val x: Self with (Lookup[TKey, TValue])) extends AnyVal {
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
    def setGet(value: TKey => Enumerable[TValue]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: TKey => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setToEnumerable(value: () => Enumerable[Grouping[TKey, TValue]]): Self = this.set("toEnumerable", js.Any.fromFunction0(value))
  }
  
}

