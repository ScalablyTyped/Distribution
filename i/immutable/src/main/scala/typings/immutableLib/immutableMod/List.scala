package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T]
  extends immutableLib.immutableMod.CollectionNs.Indexed[T] {
  /**
    * The number of items in this List.
    */
  val size: scala.Double = js.native
  /**
    * @see `Map#asImmutable`
    */
  def asImmutable(): this.type = js.native
  /**
    * An alternative API for withMutations()
    *
    * Note: Not all methods can be safely used on a mutable collection or within
    * `withMutations`! Check the documentation for each method to see if it
    * allows being used in `withMutations`.
    *
    * @see `Map#asMutable`
    */
  def asMutable(): this.type = js.native
  /**
    * Returns a new List with 0 size and no values in constant time.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { List } = require('immutable');" }
    * -->
    * ```js
    * List([ 1, 2, 3, 4 ]).clear()
    * // List []
    * ```
    *
    * Note: `clear` can be used in `withMutations`.
    */
  def clear(): List[T] = js.native
  /**
    * Returns a new List which excludes this `index` and with a size 1 less
    * than this List. Values at indices above `index` are shifted down by 1 to
    * fill the position.
    *
    * This is synonymous with `list.splice(index, 1)`.
    *
    * `index` may be a negative number, which indexes back from the end of the
    * List. `v.delete(-1)` deletes the last item in the List.
    *
    * Note: `delete` cannot be safely used in IE8
    *
    * <!-- runkit:activate
    *      { "preamble": "const { List } = require('immutable');" }
    * -->
    * ```js
    * List([ 0, 1, 2, 3, 4 ]).delete(0);
    * // List [ 1, 2, 3, 4 ]
    * ```
    *
    * Since `delete()` re-indexes values, it produces a complete copy, which
    * has `O(N)` complexity.
    *
    * Note: `delete` *cannot* be used in `withMutations`.
    *
    * @alias remove
    */
  def delete(index: scala.Double): List[T] = js.native
  /**
    * Returns a new List having removed the value at this `keyPath`. If any
    * keys in `keyPath` do not exist, no change will occur.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable')
    * const list = List([ 0, 1, 2, List([ 3, 4 ])])
    * list.deleteIn([3, 0]);
    * // List [ 0, 1, 2, List [ 4 ] ]
    * ```
    *
    * Plain JavaScript Object or Arrays may be nested within an Immutable.js
    * Collection, and removeIn() can update those values as well, treating them
    * immutably by creating new copies of those values with the changes applied.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable')
    * const list = List([ 0, 1, 2, { plain: 'object' }])
    * list.removeIn([3, 'plain']);
    * // List([ 0, 1, 2, {}])
    * ```
    *
    * Note: `deleteIn` *cannot* be safely used in `withMutations`.
    *
    * @alias removeIn
    */
  def deleteIn(keyPath: stdLib.Iterable[_]): this.type = js.native
  /**
    * Returns a new List with only the values for which the `predicate`
    * function returns true.
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_FTList[F /* <: T */](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* iter */ this.type, 
      /* is F */ scala.Boolean
    ]
  ): List[F] = js.native
  @JSName("filter")
  def filter_FTList[F /* <: T */](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* iter */ this.type, 
      /* is F */ scala.Boolean
    ],
    context: js.Any
  ): List[F] = js.native
  /**
    * Returns a new List with `value` at `index` with a size 1 more than this
    * List. Values at indices above `index` are shifted over by 1.
    *
    * This is synonymous with `list.splice(index, 0, value)`.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { List } = require('immutable');" }
    * -->
    * ```js
    * List([ 0, 1, 2, 3, 4 ]).insert(6, 5)
    * // List [ 0, 1, 2, 3, 4, 5 ]
    * ```
    *
    * Since `insert()` re-indexes values, it produces a complete copy, which
    * has `O(N)` complexity.
    *
    * Note: `insert` *cannot* be used in `withMutations`.
    */
  def insert(index: scala.Double, value: T): List[T] = js.native
  def merge[C](collections: stdLib.Iterable[C]*): List[T | C] = js.native
  /**
    * Note: `mergeDeepIn` can be used in `withMutations`.
    *
    * @see `Map#mergeDeepIn`
    */
  def mergeDeepIn(keyPath: stdLib.Iterable[_], collections: js.Any*): this.type = js.native
  /**
    * Note: `mergeIn` can be used in `withMutations`.
    *
    * @see `Map#mergeIn`
    */
  def mergeIn(keyPath: stdLib.Iterable[_], collections: js.Any*): this.type = js.native
  /**
    * Returns a new List with a size ones less than this List, excluding
    * the last index in this List.
    *
    * Note: this differs from `Array#pop` because it returns a new
    * List rather than the removed value. Use `last()` to get the last value
    * in this List.
    *
    * ```js
    * List([ 1, 2, 3, 4 ]).pop()
    * // List[ 1, 2, 3 ]
    * ```
    *
    * Note: `pop` can be used in `withMutations`.
    */
  def pop(): List[T] = js.native
  /**
    * Returns a new List with the provided `values` appended, starting at this
    * List's `size`.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { List } = require('immutable');" }
    * -->
    * ```js
    * List([ 1, 2, 3, 4 ]).push(5)
    * // List [ 1, 2, 3, 4, 5 ]
    * ```
    *
    * Note: `push` can be used in `withMutations`.
    */
  def push(values: T*): List[T] = js.native
  def remove(index: scala.Double): List[T] = js.native
  def removeIn(keyPath: stdLib.Iterable[_]): this.type = js.native
  // Persistent changes
  /**
    * Returns a new List which includes `value` at `index`. If `index` already
    * exists in this List, it will be replaced.
    *
    * `index` may be a negative number, which indexes back from the end of the
    * List. `v.set(-1, "value")` sets the last item in the List.
    *
    * If `index` larger than `size`, the returned List's `size` will be large
    * enough to include the `index`.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { List } = require('immutable');" }
    * -->
    * ```js
    * const originalList = List([ 0 ]);
    * // List [ 0 ]
    * originalList.set(1, 1);
    * // List [ 0, 1 ]
    * originalList.set(0, 'overwritten');
    * // List [ "overwritten" ]
    * originalList.set(2, 2);
    * // List [ 0, undefined, 2 ]
    *
    * List().set(50000, 'value').size;
    * // 50001
    * ```
    *
    * Note: `set` can be used in `withMutations`.
    */
  def set(index: scala.Double, value: T): List[T] = js.native
  // Deep persistent changes
  /**
    * Returns a new List having set `value` at this `keyPath`. If any keys in
    * `keyPath` do not exist, a new immutable Map will be created at that key.
    *
    * Index numbers are used as keys to determine the path to follow in
    * the List.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable')
    * const list = List([ 0, 1, 2, List([ 3, 4 ])])
    * list.setIn([3, 0], 999);
    * // List [ 0, 1, 2, List [ 999, 4 ] ]
    * ```
    *
    * Plain JavaScript Object or Arrays may be nested within an Immutable.js
    * Collection, and setIn() can update those values as well, treating them
    * immutably by creating new copies of those values with the changes applied.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable')
    * const list = List([ 0, 1, 2, { plain: 'object' }])
    * list.setIn([3, 'plain'], 'value');
    * // List([ 0, 1, 2, { plain: 'value' }])
    * ```
    *
    * Note: `setIn` can be used in `withMutations`.
    */
  def setIn(keyPath: stdLib.Iterable[_], value: js.Any): this.type = js.native
  /**
    * Returns a new List with size `size`. If `size` is less than this
    * List's size, the new List will exclude values at the higher indices.
    * If `size` is greater than this List's size, the new List will have
    * undefined values for the newly available indices.
    *
    * When building a new List and the final size is known up front, `setSize`
    * used in conjunction with `withMutations` may result in the more
    * performant construction.
    */
  def setSize(size: scala.Double): List[T] = js.native
  /**
    * Returns a new List with a size ones less than this List, excluding
    * the first index in this List, shifting all other values to a lower index.
    *
    * Note: this differs from `Array#shift` because it returns a new
    * List rather than the removed value. Use `first()` to get the first
    * value in this List.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { List } = require('immutable');" }
    * -->
    * ```js
    * List([ 0, 1, 2, 3, 4 ]).shift();
    * // List [ 1, 2, 3, 4 ]
    * ```
    *
    * Note: `shift` can be used in `withMutations`.
    */
  def shift(): List[T] = js.native
  /**
    * Returns a new List with the provided `values` prepended, shifting other
    * values ahead to higher indices.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { List } = require('immutable');" }
    * -->
    * ```js
    * List([ 2, 3, 4]).unshift(1);
    * // List [ 1, 2, 3, 4 ]
    * ```
    *
    * Note: `unshift` can be used in `withMutations`.
    */
  def unshift(values: T*): List[T] = js.native
  /**
    * Returns a new List with an updated value at `index` with the return
    * value of calling `updater` with the existing value, or `notSetValue` if
    * `index` was not set. If called with a single argument, `updater` is
    * called with the List itself.
    *
    * `index` may be a negative number, which indexes back from the end of the
    * List. `v.update(-1)` updates the last item in the List.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { List } = require('immutable');" }
    * -->
    * ```js
    * const list = List([ 'a', 'b', 'c' ])
    * const result = list.update(2, val => val.toUpperCase())
    * // List [ "a", "b", "C" ]
    * ```
    *
    * This can be very useful as a way to "chain" a normal function into a
    * sequence of methods. RxJS calls this "let" and lodash calls it "thru".
    *
    * For example, to sum a List after mapping and filtering:
    *
    * <!-- runkit:activate
    *      { "preamble": "const { List } = require('immutable');" }
    * -->
    * ```js
    * function sum(collection) {
    *   return collection.reduce((sum, x) => sum + x, 0)
    * }
    *
    * List([ 1, 2, 3 ])
    *   .map(x => x + 1)
    *   .filter(x => x % 2 === 0)
    *   .update(sum)
    * // 6
    * ```
    *
    * Note: `update(index)` can be used in `withMutations`.
    *
    * @see `Map#update`
    */
  def update(index: scala.Double, notSetValue: T, updater: js.Function1[/* value */ T, T]): this.type = js.native
  def update(index: scala.Double, updater: js.Function1[/* value */ T, T]): this.type = js.native
  /**
    * Note: `updateIn` can be used in `withMutations`.
    *
    * @see `Map#updateIn`
    */
  def updateIn(keyPath: stdLib.Iterable[_], notSetValue: js.Any, updater: js.Function1[/* value */ js.Any, _]): this.type = js.native
  def updateIn(keyPath: stdLib.Iterable[_], updater: js.Function1[/* value */ js.Any, _]): this.type = js.native
  /**
    * @see `Map#wasAltered`
    */
  def wasAltered(): scala.Boolean = js.native
  // Transient changes
  /**
    * Note: Not all methods can be safely used on a mutable collection or within
    * `withMutations`! Check the documentation for each method to see if it
    * allows being used in `withMutations`.
    *
    * @see `Map#withMutations`
    */
  def withMutations(mutator: js.Function1[/* mutable */ this.type, _]): this.type = js.native
}

