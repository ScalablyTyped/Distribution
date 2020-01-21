package typings.immutable.mod

import typings.immutable.Immutable.Collection.Indexed
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T] extends Indexed[T] {
  /**
    * The number of items in this List.
    */
  val size: Double = js.native
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
  def clear(): typings.immutable.Immutable.List[T] = js.native
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
  def delete(index: Double): typings.immutable.Immutable.List[T] = js.native
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
  def deleteIn(keyPath: Iterable[_]): this.type = js.native
  /**
    * Returns a new List with only the values for which the `predicate`
    * function returns true.
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_F_T_List[F /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean]
  ): typings.immutable.Immutable.List[F] = js.native
  @JSName("filter")
  def filter_F_T_List[F /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean],
    context: js.Any
  ): typings.immutable.Immutable.List[F] = js.native
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
  def insert(index: Double, value: T): typings.immutable.Immutable.List[T] = js.native
  def merge[C](collections: Iterable[C]*): typings.immutable.Immutable.List[T | C] = js.native
  /**
    * Note: `mergeDeepIn` can be used in `withMutations`.
    *
    * @see `Map#mergeDeepIn`
    */
  def mergeDeepIn(keyPath: Iterable[_], collections: js.Any*): this.type = js.native
  /**
    * Note: `mergeIn` can be used in `withMutations`.
    *
    * @see `Map#mergeIn`
    */
  def mergeIn(keyPath: Iterable[_], collections: js.Any*): this.type = js.native
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
  def pop(): typings.immutable.Immutable.List[T] = js.native
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
  def push(values: T*): typings.immutable.Immutable.List[T] = js.native
  def remove(index: Double): typings.immutable.Immutable.List[T] = js.native
  def removeIn(keyPath: Iterable[_]): this.type = js.native
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
  def set(index: Double, value: T): typings.immutable.Immutable.List[T] = js.native
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
  def setIn(keyPath: Iterable[_], value: js.Any): this.type = js.native
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
  def setSize(size: Double): typings.immutable.Immutable.List[T] = js.native
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
  def shift(): typings.immutable.Immutable.List[T] = js.native
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
  def unshift(values: T*): typings.immutable.Immutable.List[T] = js.native
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
  def update(index: Double, notSetValue: T, updater: js.Function1[/* value */ T, T]): this.type = js.native
  def update(index: Double, updater: js.Function1[/* value */ T, T]): this.type = js.native
  /**
    * Note: `updateIn` can be used in `withMutations`.
    *
    * @see `Map#updateIn`
    */
  def updateIn(keyPath: Iterable[_], notSetValue: js.Any, updater: js.Function1[/* value */ js.Any, _]): this.type = js.native
  def updateIn(keyPath: Iterable[_], updater: js.Function1[/* value */ js.Any, _]): this.type = js.native
  /**
    * @see `Map#wasAltered`
    */
  def wasAltered(): Boolean = js.native
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

@JSImport("immutable", "List")
@js.native
object List extends js.Object {
  def apply(): typings.immutable.Immutable.List[_] = js.native
  def apply[T](collection: Iterable[T]): typings.immutable.Immutable.List[T] = js.native
  /**
    * True if the provided value is a List
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable');
    * List.isList([]); // false
    * List.isList(List()); // true
    * ```
    */
  def isList(maybeList: js.Any): /* is immutable.Immutable.List<any> */ Boolean = js.native
  /**
    * Creates a new List containing `values`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable');
    * List.of(1, 2, 3, 4)
    * // List [ 1, 2, 3, 4 ]
    * ```
    *
    * Note: Values are not altered or converted in any way.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable');
    * List.of({x:1}, 2, [3], 4)
    * // List [ { x: 1 }, 2, [ 3 ], 4 ]
    * ```
    */
  def of[T](values: T*): typings.immutable.Immutable.List[T] = js.native
}

