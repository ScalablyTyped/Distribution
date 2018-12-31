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

