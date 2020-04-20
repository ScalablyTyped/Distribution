package typings.hashset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashSet[TValue] extends js.Object {
  def add(value: TValue): Unit
  def addAll(arr: js.Array[TValue]): Unit
  def clear(): Unit
  def complement(set: IHashSet[TValue]): IHashSet[TValue]
  def contains(value: TValue): Boolean
  def intersection(set: IHashSet[TValue]): IHashSet[TValue]
  def isEmpty(): Boolean
  def isSubsetOf(set: IHashSet[TValue]): Boolean
  def remove(value: TValue): Unit
  def size(): Double
  def union(set: IHashSet[TValue]): IHashSet[TValue]
  def values(): js.Array[TValue]
}

object IHashSet {
  @scala.inline
  def apply[TValue](
    add: TValue => Unit,
    addAll: js.Array[TValue] => Unit,
    clear: () => Unit,
    complement: IHashSet[TValue] => IHashSet[TValue],
    contains: TValue => Boolean,
    intersection: IHashSet[TValue] => IHashSet[TValue],
    isEmpty: () => Boolean,
    isSubsetOf: IHashSet[TValue] => Boolean,
    remove: TValue => Unit,
    size: () => Double,
    union: IHashSet[TValue] => IHashSet[TValue],
    values: () => js.Array[TValue]
  ): IHashSet[TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), clear = js.Any.fromFunction0(clear), complement = js.Any.fromFunction1(complement), contains = js.Any.fromFunction1(contains), intersection = js.Any.fromFunction1(intersection), isEmpty = js.Any.fromFunction0(isEmpty), isSubsetOf = js.Any.fromFunction1(isSubsetOf), remove = js.Any.fromFunction1(remove), size = js.Any.fromFunction0(size), union = js.Any.fromFunction1(union), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IHashSet[TValue]]
  }
}

