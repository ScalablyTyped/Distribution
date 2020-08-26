package typings.hashset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashSet[TValue] extends js.Object {
  def add(value: TValue): Unit = js.native
  def addAll(arr: js.Array[TValue]): Unit = js.native
  def clear(): Unit = js.native
  def complement(set: IHashSet[TValue]): IHashSet[TValue] = js.native
  def contains(value: TValue): Boolean = js.native
  def intersection(set: IHashSet[TValue]): IHashSet[TValue] = js.native
  def isEmpty(): Boolean = js.native
  def isSubsetOf(set: IHashSet[TValue]): Boolean = js.native
  def remove(value: TValue): Unit = js.native
  def size(): Double = js.native
  def union(set: IHashSet[TValue]): IHashSet[TValue] = js.native
  def values(): js.Array[TValue] = js.native
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
  @scala.inline
  implicit class IHashSetOps[Self <: IHashSet[_], TValue] (val x: Self with IHashSet[TValue]) extends AnyVal {
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
    def setAdd(value: TValue => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setAddAll(value: js.Array[TValue] => Unit): Self = this.set("addAll", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setComplement(value: IHashSet[TValue] => IHashSet[TValue]): Self = this.set("complement", js.Any.fromFunction1(value))
    @scala.inline
    def setContains(value: TValue => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setIntersection(value: IHashSet[TValue] => IHashSet[TValue]): Self = this.set("intersection", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSubsetOf(value: IHashSet[TValue] => Boolean): Self = this.set("isSubsetOf", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: TValue => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    @scala.inline
    def setUnion(value: IHashSet[TValue] => IHashSet[TValue]): Self = this.set("union", js.Any.fromFunction1(value))
    @scala.inline
    def setValues(value: () => js.Array[TValue]): Self = this.set("values", js.Any.fromFunction0(value))
  }
  
}

