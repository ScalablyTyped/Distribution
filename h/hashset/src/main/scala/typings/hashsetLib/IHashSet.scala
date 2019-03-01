package typings
package hashsetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashSet[TValue] extends js.Object {
  def add(value: TValue): scala.Unit
  def addAll(arr: js.Array[TValue]): scala.Unit
  def clear(): scala.Unit
  def complement(set: IHashSet[TValue]): IHashSet[TValue]
  def contains(value: TValue): scala.Boolean
  def intersection(set: IHashSet[TValue]): IHashSet[TValue]
  def isEmpty(): scala.Boolean
  def isSubsetOf(set: IHashSet[TValue]): scala.Boolean
  def remove(value: TValue): scala.Unit
  def size(): scala.Double
  def union(set: IHashSet[TValue]): IHashSet[TValue]
  def values(): js.Array[TValue]
}

object IHashSet {
  @scala.inline
  def apply[TValue](
    add: js.Function1[TValue, scala.Unit],
    addAll: js.Function1[js.Array[TValue], scala.Unit],
    clear: js.Function0[scala.Unit],
    clone: js.Function0[IHashSet[TValue]],
    complement: js.Function1[IHashSet[TValue], IHashSet[TValue]],
    contains: js.Function1[TValue, scala.Boolean],
    intersection: js.Function1[IHashSet[TValue], IHashSet[TValue]],
    isEmpty: js.Function0[scala.Boolean],
    isSubsetOf: js.Function1[IHashSet[TValue], scala.Boolean],
    remove: js.Function1[TValue, scala.Unit],
    size: js.Function0[scala.Double],
    union: js.Function1[IHashSet[TValue], IHashSet[TValue]],
    values: js.Function0[js.Array[TValue]]
  ): IHashSet[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addAll")(addAll)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("complement")(complement)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("intersection")(intersection)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("isSubsetOf")(isSubsetOf)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("union")(union)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[IHashSet[TValue]]
  }
}

