package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set[T]
  extends immutableLib.immutableMod.CollectionNs.Set[T] {
  /**
    * The number of items in this Set.
    */
  val size: scala.Double = js.native
  // Persistent changes
  /**
    * Returns a new Set which also includes this value.
    *
    * Note: `add` can be used in `withMutations`.
    */
  def add(value: T): this.type = js.native
  /**
    * @see `Map#asImmutable`
    */
  def asImmutable(): this.type = js.native
  /**
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Check the documentation for each method to see if it
    * mentions being safe to use in `withMutations`.
    *
    * @see `Map#asMutable`
    */
  def asMutable(): this.type = js.native
  /**
    * Returns a new Set containing no values.
    *
    * Note: `clear` can be used in `withMutations`.
    */
  def clear(): this.type = js.native
  /**
    * Returns a new Set which excludes this value.
    *
    * Note: `delete` can be used in `withMutations`.
    *
    * Note: `delete` **cannot** be safely used in IE8, use `remove` if
    * supporting old browsers.
    *
    * @alias remove
    */
  def delete(value: T): this.type = js.native
  /**
    * Returns a Set which has removed any values not also contained
    * within `collections`.
    *
    * Note: `intersect` can be used in `withMutations`.
    */
  def intersect(collections: stdLib.Iterable[T]*): this.type = js.native
  def merge[C](collections: stdLib.Iterable[C]*): Set[T | C] = js.native
  def remove(value: T): this.type = js.native
  /**
    * Returns a Set excluding any values contained within `collections`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { OrderedSet } = require('immutable')
    * OrderedSet([ 1, 2, 3 ]).subtract([1, 3])
    * // OrderedSet [2]
    * ```
    *
    * Note: `subtract` can be used in `withMutations`.
    */
  def subtract(collections: stdLib.Iterable[T]*): this.type = js.native
  /**
    * Returns a Set including any value from `collections` that does not already
    * exist in this Set.
    *
    * Note: `union` can be used in `withMutations`.
    * @alias merge
    * @alias concat
    */
  def union[C](collections: stdLib.Iterable[C]*): Set[T | C] = js.native
  /**
    * @see `Map#wasAltered`
    */
  def wasAltered(): scala.Boolean = js.native
  // Transient changes
  /**
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Check the documentation for each method to see if it
    * mentions being safe to use in `withMutations`.
    *
    * @see `Map#withMutations`
    */
  def withMutations(mutator: js.Function1[/* mutable */ this.type, _]): this.type = js.native
}

