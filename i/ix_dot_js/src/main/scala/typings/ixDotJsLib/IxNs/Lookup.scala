package typings
package ixDotJsLib.IxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup[TKey, TValue] extends js.Object {
  def get(key: TKey): Enumerable[TValue]
  def has(key: TKey): scala.Boolean
  def length(): scala.Double
  def toEnumerable(): Enumerable[Grouping[TKey, TValue]]
}

object Lookup {
  @scala.inline
  def apply[TKey, TValue](
    get: js.Function1[TKey, Enumerable[TValue]],
    has: js.Function1[TKey, scala.Boolean],
    length: js.Function0[scala.Double],
    toEnumerable: js.Function0[Enumerable[Grouping[TKey, TValue]]]
  ): Lookup[TKey, TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("toEnumerable")(toEnumerable)
    __obj.asInstanceOf[Lookup[TKey, TValue]]
  }
}

