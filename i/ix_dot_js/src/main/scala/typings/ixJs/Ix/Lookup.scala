package typings.ixJs.Ix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup[TKey, TValue] extends js.Object {
  def get(key: TKey): Enumerable[TValue]
  def has(key: TKey): Boolean
  def length(): Double
  def toEnumerable(): Enumerable[Grouping[TKey, TValue]]
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
}

