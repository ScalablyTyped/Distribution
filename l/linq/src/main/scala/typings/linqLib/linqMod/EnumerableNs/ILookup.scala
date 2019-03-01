package typings
package linqLib.linqMod.EnumerableNs

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
    contains: js.Function1[TKey, scala.Boolean],
    count: js.Function0[scala.Double],
    get: js.Function1[TKey, IEnumerable[TElement]],
    toEnumerable: js.Function0[IEnumerable[IGrouping[TKey, TElement]]]
  ): ILookup[TKey, TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("toEnumerable")(toEnumerable)
    __obj.asInstanceOf[ILookup[TKey, TElement]]
  }
}

