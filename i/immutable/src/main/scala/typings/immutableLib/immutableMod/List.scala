package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T]
  extends immutableLib.immutableMod.CollectionNs.Indexed[T] {
  /**
       * @see `Map#asImmutable`
       */
  def asImmutable(): List[T] = js.native
  /**
       * @see `Map#asMutable`
       */
  def asMutable(): List[T] = js.native
  /**
       * Returns a new List with 0 size and no values.
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
       * @alias remove
       */
  def delete(index: scala.Double): List[T] = js.native
  def deleteIn(keyPath: Iterable[_, _]): List[T] = js.native
  /**
       * Returns a new List having removed the value at this `keyPath`. If any
       * keys in `keyPath` do not exist, no change will occur.
       *
       * @alias removeIn
       */
  def deleteIn(keyPath: js.Array[_]): List[T] = js.native
  /**
       * Returns a new List with `value` at `index` with a size 1 more than this
       * List. Values at indices above `index` are shifted over by 1.
       *
       * This is synonymous with `list.splice(index, 0, value)
       */
  def insert(index: scala.Double, value: T): List[T] = js.native
  /**
       * @see `Map#merge`
       */
  def merge(iterables: (immutableLib.immutableMod.IterableNs.Indexed[T] | js.Array[T])*): List[T] = js.native
  /**
       * @see `Map#mergeDeep`
       */
  def mergeDeep(iterables: (immutableLib.immutableMod.IterableNs.Indexed[T] | js.Array[T])*): List[T] = js.native
  /**
       * @see `Map#mergeDeepIn`
       */
  def mergeDeepIn(keyPath: Iterable[_, _], iterables: immutableLib.immutableMod.IterableNs.Indexed[T]*): List[T] = js.native
  def mergeDeepIn(keyPath: js.Array[_], iterables: (immutableLib.immutableMod.IterableNs.Indexed[T] | js.Array[T])*): List[T] = js.native
  /**
       * @see `Map#mergeDeepWith`
       */
  def mergeDeepWith(
    merger: js.Function3[
      /* previous */ js.UndefOr[T], 
      /* next */ js.UndefOr[T], 
      /* key */ js.UndefOr[scala.Double], 
      T
    ],
    iterables: (immutableLib.immutableMod.IterableNs.Indexed[T] | js.Array[T])*
  ): List[T] = js.native
  /**
       * @see `Map#mergeIn`
       */
  def mergeIn(keyPath: Iterable[_, _], iterables: immutableLib.immutableMod.IterableNs.Indexed[T]*): List[T] = js.native
  def mergeIn(keyPath: js.Array[_], iterables: (immutableLib.immutableMod.IterableNs.Indexed[T] | js.Array[T])*): List[T] = js.native
  /**
       * @see `Map#mergeWith`
       */
  def mergeWith(
    merger: js.Function3[
      /* previous */ js.UndefOr[T], 
      /* next */ js.UndefOr[T], 
      /* key */ js.UndefOr[scala.Double], 
      T
    ],
    iterables: (immutableLib.immutableMod.IterableNs.Indexed[T] | js.Array[T])*
  ): List[T] = js.native
  /**
       * Returns a new List with a size ones less than this List, excluding
       * the last index in this List.
       *
       * Note: this differs from `Array#pop` because it returns a new
       * List rather than the removed value. Use `last()` to get the last value
       * in this List.
       */
  def pop(): List[T] = js.native
  /**
       * Returns a new List with the provided `values` appended, starting at this
       * List's `size`.
       */
  def push(values: T*): List[T] = js.native
  def remove(index: scala.Double): List[T] = js.native
  def removeIn(keyPath: Iterable[_, _]): List[T] = js.native
  def removeIn(keyPath: js.Array[_]): List[T] = js.native
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
       */
  def set(index: scala.Double, value: T): List[T] = js.native
  def setIn(keyPath: Iterable[_, _], value: js.Any): List[T] = js.native
  // Deep persistent changes
  /**
       * Returns a new List having set `value` at this `keyPath`. If any keys in
       * `keyPath` do not exist, a new immutable Map will be created at that key.
       *
       * Index numbers are used as keys to determine the path to follow in
       * the List.
       */
  def setIn(keyPath: js.Array[_], value: js.Any): List[T] = js.native
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
       */
  def shift(): List[T] = js.native
  /**
       * Returns a new List with the provided `values` prepended, shifting other
       * values ahead to higher indices.
       */
  def unshift(values: T*): List[T] = js.native
  def update(index: scala.Double, notSetValue: T, updater: js.Function1[/* value */ T, T]): List[T] = js.native
  def update(index: scala.Double, updater: js.Function1[/* value */ T, T]): List[T] = js.native
  /**
       * Returns a new List with an updated value at `index` with the return
       * value of calling `updater` with the existing value, or `notSetValue` if
       * `index` was not set. If called with a single argument, `updater` is
       * called with the List itself.
       *
       * `index` may be a negative number, which indexes back from the end of the
       * List. `v.update(-1)` updates the last item in the List.
       *
       * @see `Map#update`
       */
  def update(updater: js.Function1[/* value */ List[T], List[T]]): List[T] = js.native
  def updateIn(keyPath: Iterable[_, _], notSetValue: js.Any, updater: js.Function1[/* value */ js.Any, _]): List[T] = js.native
  def updateIn(keyPath: Iterable[_, _], updater: js.Function1[/* value */ js.Any, _]): List[T] = js.native
  def updateIn(keyPath: js.Array[_], notSetValue: js.Any, updater: js.Function1[/* value */ js.Any, _]): List[T] = js.native
  /**
       * @see `Map#updateIn`
       */
  def updateIn(keyPath: js.Array[_], updater: js.Function1[/* value */ js.Any, _]): List[T] = js.native
  // Transient changes
  /**
       * Note: Not all methods can be used on a mutable collection or within
       * `withMutations`! Only `set`, `push`, `pop`, `shift`, `unshift` and
       * `merge` may be used mutatively.
       *
       * @see `Map#withMutations`
       */
  def withMutations(mutator: js.Function1[/* mutable */ List[T], _]): List[T] = js.native
}

