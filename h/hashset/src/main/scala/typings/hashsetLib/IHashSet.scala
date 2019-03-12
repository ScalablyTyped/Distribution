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
    add: TValue => scala.Unit,
    addAll: js.Array[TValue] => scala.Unit,
    clear: () => scala.Unit,
    clone: () => IHashSet[TValue],
    complement: IHashSet[TValue] => IHashSet[TValue],
    contains: TValue => scala.Boolean,
    intersection: IHashSet[TValue] => IHashSet[TValue],
    isEmpty: () => scala.Boolean,
    isSubsetOf: IHashSet[TValue] => scala.Boolean,
    remove: TValue => scala.Unit,
    size: () => scala.Double,
    union: IHashSet[TValue] => IHashSet[TValue],
    values: () => js.Array[TValue]
  ): IHashSet[TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), clear = js.Any.fromFunction0(clear), clone = js.Any.fromFunction0(clone), complement = js.Any.fromFunction1(complement), contains = js.Any.fromFunction1(contains), intersection = js.Any.fromFunction1(intersection), isEmpty = js.Any.fromFunction0(isEmpty), isSubsetOf = js.Any.fromFunction1(isSubsetOf), remove = js.Any.fromFunction1(remove), size = js.Any.fromFunction0(size), union = js.Any.fromFunction1(union), values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[IHashSet[TValue]]
  }
}

