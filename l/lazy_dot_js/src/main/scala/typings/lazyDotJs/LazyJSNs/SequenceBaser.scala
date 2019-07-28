package typings.lazyDotJs.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceBaser[T] extends js.Object {
  // TODO improve define() (needs ugly overload)
  def async(interval: Double): AsyncSequence[T] = js.native
  def chunk(size: Double): Sequence[T] = js.native
  def compact(): Sequence[T] = js.native
  def concat(var_args: js.Array[T]): Sequence[T] = js.native
  def consecutive(length: Double): Sequence[T] = js.native
  def contains(value: T): Boolean = js.native
  def countBy(keyFn: GetKeyCallback[T]): ObjectLikeSequence[T] = js.native
  def countBy(propertyName: String): ObjectLikeSequence[T] = js.native
  def dropWhile(predicateFn: TestCallback[T, String | Double]): Sequence[T] = js.native
  def every(predicateFn: TestCallback[T, String | Double]): Boolean = js.native
  def filter(predicateFn: TestCallback[T, String | Double]): Sequence[T] = js.native
  def find(predicateFn: TestCallback[T, String | Double]): T = js.native
  def findWhere(properties: js.Any): T = js.native
  def flatten(): Sequence[T] = js.native
  def groupBy(keyFn: GetKeyCallback[T]): ObjectLikeSequence[T] = js.native
  def initial(): Sequence[T] = js.native
  def initial(count: Double): Sequence[T] = js.native
  def intersection(var_args: js.Array[T]): Sequence[T] = js.native
  def invoke(methodName: String): Sequence[T] = js.native
  def isEmpty(): Boolean = js.native
  def join(): String = js.native
  def join(delimiter: String): String = js.native
  def map[U](mapFn: MapCallback[T, U]): Sequence[U] = js.native
  def max(): T = js.native
  def max(valueFn: NumberCallback[T]): T = js.native
  def min(): T = js.native
  def min(valueFn: NumberCallback[T]): T = js.native
  def none(): Boolean = js.native
  def none(valueFn: TestCallback[T, String | Double]): Boolean = js.native
  def pluck(propertyName: String): Sequence[_] = js.native
  def reduce[U](aggregatorFn: MemoCallback[T, U]): U = js.native
  def reduce[U](aggregatorFn: MemoCallback[T, U], memo: U): U = js.native
  def reduceRight[U](aggregatorFn: MemoCallback[T, U], memo: U): U = js.native
  def reject(predicateFn: TestCallback[T, String | Double]): Sequence[T] = js.native
  def rest(): Sequence[T] = js.native
  def rest(count: Double): Sequence[T] = js.native
  def shuffle(): Sequence[T] = js.native
  def size(): Double = js.native
  def some(): Boolean = js.native
  def some(predicateFn: TestCallback[T, String | Double]): Boolean = js.native
  def sort(): Sequence[T] = js.native
  def sort(sortFn: CompareCallback): Sequence[T] = js.native
  def sort(sortFn: CompareCallback, descending: Boolean): Sequence[T] = js.native
  def sortBy(sortFn: String): Sequence[T] = js.native
  def sortBy(sortFn: String, descending: Boolean): Sequence[T] = js.native
  def sortBy(sortFn: NumberCallback[T]): Sequence[T] = js.native
  def sortBy(sortFn: NumberCallback[T], descending: Boolean): Sequence[T] = js.native
  def sortedIndex(value: T): Double = js.native
  def sum(): T = js.native
  def sum(valueFn: NumberCallback[T]): T = js.native
  def takeWhile(predicateFn: TestCallback[T, String | Double]): Sequence[T] = js.native
  def toArray(): js.Array[T] = js.native
  def toObject(): js.Any = js.native
  def union(var_args: js.Array[T]): Sequence[T] = js.native
  def uniq(): Sequence[T] = js.native
  def uniq(key: String): Sequence[T] = js.native
  def where(properties: js.Any): Sequence[T] = js.native
  def without(var_args: T*): Sequence[T] = js.native
  def without(var_args: js.Array[T]): Sequence[T] = js.native
  def zip(var_args: js.Array[T]): Sequence[T] = js.native
}

