package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set[T]
  extends immutableLib.immutableMod.CollectionNs.Set[T] {
  // Persistent changes
  /**
       * Returns a new Set which also includes this value.
       */
  def add(value: T): Set[T] = js.native
  /**
       * @see `Map#asImmutable`
       */
  def asImmutable(): Set[T] = js.native
  /**
       * @see `Map#asMutable`
       */
  def asMutable(): Set[T] = js.native
  /**
       * Returns a new Set containing no values.
       */
  def clear(): Set[T] = js.native
  /**
       * Returns a new Set which excludes this value.
       *
       * Note: `delete` cannot be safely used in IE8
       * @alias remove
       */
  def delete(value: T): Set[T] = js.native
  /**
       * Returns a Set which has removed any values not also contained
       * within `iterables`.
       */
  def intersect(iterables: ((Iterable[_, T]) | js.Array[T])*): Set[T] = js.native
  def merge(iterables: ((Iterable[_, T]) | js.Array[T])*): Set[T] = js.native
  def remove(value: T): Set[T] = js.native
  /**
       * Returns a Set excluding any values contained within `iterables`.
       */
  def subtract(iterables: ((Iterable[_, T]) | js.Array[T])*): Set[T] = js.native
  /**
       * Returns a Set including any value from `iterables` that does not already
       * exist in this Set.
       * @alias merge
       */
  def union(iterables: ((Iterable[_, T]) | js.Array[T])*): Set[T] = js.native
  // Transient changes
  /**
       * Note: Not all methods can be used on a mutable collection or within
       * `withMutations`! Only `add` may be used mutatively.
       *
       * @see `Map#withMutations`
       */
  def withMutations(mutator: js.Function1[/* mutable */ Set[T], _]): Set[T] = js.native
}

