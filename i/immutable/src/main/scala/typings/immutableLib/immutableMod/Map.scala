package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map[K, V]
  extends immutableLib.immutableMod.CollectionNs.Keyed[K, V] {
  /**
       * The yin to `asMutable`'s yang. Because it applies to mutable collections,
       * this operation is *mutable* and returns itself. Once performed, the mutable
       * copy has become immutable and can be safely returned from a function.
       */
  def asImmutable(): Map[K, V] = js.native
  /**
       * Another way to avoid creation of intermediate Immutable maps is to create
       * a mutable copy of this collection. Mutable copies *always* return `this`,
       * and thus shouldn't be used for equality. Your function should never return
       * a mutable copy of a collection, only use it internally to create a new
       * collection. If possible, use `withMutations` as it provides an easier to
       * use API.
       *
       * Note: if the collection is already mutable, `asMutable` returns itself.
       *
       * Note: Not all methods can be used on a mutable collection or within
       * `withMutations`! Only `set` and `merge` may be used mutatively.
       */
  def asMutable(): Map[K, V] = js.native
  /**
       * Returns a new Map containing no keys or values.
       */
  def clear(): Map[K, V] = js.native
  /**
       * Returns a new Map which excludes this `key`.
       *
       * Note: `delete` cannot be safely used in IE8, but is provided to mirror
       * the ES6 collection API.
       * @alias remove
       */
  def delete(key: K): Map[K, V] = js.native
  def deleteIn(keyPath: Iterable[_, _]): Map[K, V] = js.native
  /**
       * Returns a new Map having removed the value at this `keyPath`. If any keys
       * in `keyPath` do not exist, no change will occur.
       *
       * @alias removeIn
       */
  def deleteIn(keyPath: js.Array[_]): Map[K, V] = js.native
  /**
       * Returns a new Map resulting from merging the provided Iterables
       * (or JS objects) into this Map. In other words, this takes each entry of
       * each iterable and sets it on this Map.
       *
       * If any of the values provided to `merge` are not Iterable (would return
       * false for `Immutable.Iterable.isIterable`) then they are deeply converted
       * via `Immutable.fromJS` before being merged. However, if the value is an
       * Iterable but includes non-iterable JS objects or arrays, those nested
       * values will be preserved.
       *
       *     var x = Immutable.Map({a: 10, b: 20, c: 30});
       *     var y = Immutable.Map({b: 40, a: 50, d: 60});
       *     x.merge(y) // { a: 50, b: 40, c: 30, d: 60 }
       *     y.merge(x) // { b: 20, a: 10, d: 60, c: 30 }
       *
       */
  def merge(iterables: (ScalablyTyped.runtime.StringDictionary[V] | (Iterable[K, V]))*): Map[K, V] = js.native
  /**
       * Like `merge()`, but when two Iterables conflict, it merges them as well,
       * recursing deeply through the nested data.
       *
       *     var x = Immutable.fromJS({a: { x: 10, y: 10 }, b: { x: 20, y: 50 } });
       *     var y = Immutable.fromJS({a: { x: 2 }, b: { y: 5 }, c: { z: 3 } });
       *     x.mergeDeep(y) // {a: { x: 2, y: 10 }, b: { x: 20, y: 5 }, c: { z: 3 } }
       *
       */
  def mergeDeep(iterables: (ScalablyTyped.runtime.StringDictionary[V] | (Iterable[K, V]))*): Map[K, V] = js.native
  /**
       * A combination of `updateIn` and `mergeDeep`, returning a new Map, but
       * performing the deep merge at a point arrived at by following the keyPath.
       * In other words, these two lines are equivalent:
       *
       *     x.updateIn(['a', 'b', 'c'], abc => abc.mergeDeep(y));
       *     x.mergeDeepIn(['a', 'b', 'c'], y);
       *
       */
  def mergeDeepIn(keyPath: Iterable[_, _], iterables: (Iterable[K, V])*): Map[K, V] = js.native
  def mergeDeepIn(keyPath: js.Array[_], iterables: (ScalablyTyped.runtime.StringDictionary[V] | (Iterable[K, V]))*): Map[K, V] = js.native
  /**
       * Like `mergeDeep()`, but when two non-Iterables conflict, it uses the
       * `merger` function to determine the resulting value.
       *
       *     var x = Immutable.fromJS({a: { x: 10, y: 10 }, b: { x: 20, y: 50 } });
       *     var y = Immutable.fromJS({a: { x: 2 }, b: { y: 5 }, c: { z: 3 } });
       *     x.mergeDeepWith((prev, next) => prev / next, y)
       *     // {a: { x: 5, y: 10 }, b: { x: 20, y: 10 }, c: { z: 3 } }
       *
       */
  def mergeDeepWith(
    merger: js.Function3[/* previous */ js.UndefOr[V], /* next */ js.UndefOr[V], /* key */ js.UndefOr[K], V],
    iterables: (ScalablyTyped.runtime.StringDictionary[V] | (Iterable[K, V]))*
  ): Map[K, V] = js.native
  /**
       * A combination of `updateIn` and `merge`, returning a new Map, but
       * performing the merge at a point arrived at by following the keyPath.
       * In other words, these two lines are equivalent:
       *
       *     x.updateIn(['a', 'b', 'c'], abc => abc.merge(y));
       *     x.mergeIn(['a', 'b', 'c'], y);
       *
       */
  def mergeIn(keyPath: Iterable[_, _], iterables: (Iterable[K, V])*): Map[K, V] = js.native
  def mergeIn(keyPath: js.Array[_], iterables: (ScalablyTyped.runtime.StringDictionary[V] | (Iterable[K, V]))*): Map[K, V] = js.native
  /**
       * Like `merge()`, `mergeWith()` returns a new Map resulting from merging
       * the provided Iterables (or JS objects) into this Map, but uses the
       * `merger` function for dealing with conflicts.
       *
       *     var x = Immutable.Map({a: 10, b: 20, c: 30});
       *     var y = Immutable.Map({b: 40, a: 50, d: 60});
       *     x.mergeWith((prev, next) => prev / next, y) // { a: 0.2, b: 0.5, c: 30, d: 60 }
       *     y.mergeWith((prev, next) => prev / next, x) // { b: 2, a: 5, d: 60, c: 30 }
       *
       */
  def mergeWith(
    merger: js.Function3[/* previous */ js.UndefOr[V], /* next */ js.UndefOr[V], /* key */ js.UndefOr[K], V],
    iterables: (ScalablyTyped.runtime.StringDictionary[V] | (Iterable[K, V]))*
  ): Map[K, V] = js.native
  def remove(key: K): Map[K, V] = js.native
  def removeIn(keyPath: Iterable[_, _]): Map[K, V] = js.native
  def removeIn(keyPath: js.Array[_]): Map[K, V] = js.native
  // Persistent changes
  /**
       * Returns a new Map also containing the new key, value pair. If an equivalent
       * key already exists in this Map, it will be replaced.
       */
  def set(key: K, value: V): Map[K, V] = js.native
  def setIn(KeyPath: Iterable[_, _], value: js.Any): Map[K, V] = js.native
  // Deep persistent changes
  /**
       * Returns a new Map having set `value` at this `keyPath`. If any keys in
       * `keyPath` do not exist, a new immutable Map will be created at that key.
       */
  def setIn(keyPath: js.Array[_], value: js.Any): Map[K, V] = js.native
  def update(key: K, notSetValue: V, updater: js.Function1[/* value */ V, V]): Map[K, V] = js.native
  def update(key: K, updater: js.Function1[/* value */ V, V]): Map[K, V] = js.native
  /**
       * Returns a new Map having updated the value at this `key` with the return
       * value of calling `updater` with the existing value, or `notSetValue` if
       * the key was not set. If called with only a single argument, `updater` is
       * called with the Map itself.
       *
       * Equivalent to: `map.set(key, updater(map.get(key, notSetValue)))`.
       */
  def update(updater: js.Function1[/* value */ Map[K, V], Map[K, V]]): Map[K, V] = js.native
  def updateIn(keyPath: Iterable[_, _], notSetValue: js.Any, updater: js.Function1[/* value */ js.Any, _]): Map[K, V] = js.native
  def updateIn(keyPath: Iterable[_, _], updater: js.Function1[/* value */ js.Any, _]): Map[K, V] = js.native
  def updateIn(keyPath: js.Array[_], notSetValue: js.Any, updater: js.Function1[/* value */ js.Any, _]): Map[K, V] = js.native
  /**
       * Returns a new Map having applied the `updater` to the entry found at the
       * keyPath.
       *
       * If any keys in `keyPath` do not exist, new Immutable `Map`s will
       * be created at those keys. If the `keyPath` does not already contain a
       * value, the `updater` function will be called with `notSetValue`, if
       * provided, otherwise `undefined`.
       *
       *     var data = Immutable.fromJS({ a: { b: { c: 10 } } });
       *     data = data.updateIn(['a', 'b', 'c'], val => val * 2);
       *     // { a: { b: { c: 20 } } }
       *
       * If the `updater` function returns the same value it was called with, then
       * no change will occur. This is still true if `notSetValue` is provided.
       *
       *     var data1 = Immutable.fromJS({ a: { b: { c: 10 } } });
       *     data2 = data1.updateIn(['x', 'y', 'z'], 100, val => val);
       *     assert(data2 === data1);
       *
       */
  def updateIn(keyPath: js.Array[_], updater: js.Function1[/* value */ js.Any, _]): Map[K, V] = js.native
  // Transient changes
  /**
       * Every time you call one of the above functions, a new immutable Map is
       * created. If a pure function calls a number of these to produce a final
       * return value, then a penalty on performance and memory has been paid by
       * creating all of the intermediate immutable Maps.
       *
       * If you need to apply a series of mutations to produce a new immutable
       * Map, `withMutations()` creates a temporary mutable copy of the Map which
       * can apply mutations in a highly performant manner. In fact, this is
       * exactly how complex mutations like `merge` are done.
       *
       * As an example, this results in the creation of 2, not 4, new Maps:
       *
       *     var map1 = Immutable.Map();
       *     var map2 = map1.withMutations(map => {
       *       map.set('a', 1).set('b', 2).set('c', 3);
       *     });
       *     assert(map1.size === 0);
       *     assert(map2.size === 3);
       *
       * Note: Not all methods can be used on a mutable collection or within
       * `withMutations`! Only `set` and `merge` may be used mutatively.
       *
       */
  def withMutations(mutator: js.Function1[/* mutable */ Map[K, V], _]): Map[K, V] = js.native
}

