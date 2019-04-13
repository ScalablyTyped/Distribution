package typings
package linqLib.linqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookup[TKey, TElement] extends js.Object {
  def contains(key: TKey): scala.Boolean
  def count(): scala.Double
  def get(key: TKey): IEnumerable[TElement]
  def toEnumerable(): IEnumerable[IGrouping[TKey, TElement]]
}

object ILookup {
  @scala.inline
  def apply[TKey, TElement](
    contains: TKey => scala.Boolean,
    count: () => scala.Double,
    get: TKey => IEnumerable[TElement],
    toEnumerable: () => IEnumerable[IGrouping[TKey, TElement]]
  ): ILookup[TKey, TElement] = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), count = js.Any.fromFunction0(count), get = js.Any.fromFunction1(get), toEnumerable = js.Any.fromFunction0(toEnumerable))
  
    __obj.asInstanceOf[ILookup[TKey, TElement]]
  }
}

