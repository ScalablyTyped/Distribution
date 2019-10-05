package typings.immutable.immutableMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.Collection.Keyed
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map[K, V] extends Keyed[K, V] {
  /**
    * The number of entries in this Map.
    */
  val size: Double = js.native
  /**
    * The yin to `asMutable`'s yang. Because it applies to mutable collections,
    * this operation is *mutable* and may return itself (though may not
    * return itself, i.e. if the result is an empty collection). Once
    * performed, the original mutable copy must no longer be mutated since it
    * may be the immutable result.
    *
    * If possible, use `withMutations` to work with temporary mutable copies as
    * it provides an easier to use API and considers many common optimizations.
    *
    * @see `Map#asMutable`
    */
  def asImmutable(): this.type = js.native
  /**
    * Another way to avoid creation of intermediate Immutable maps is to create
    * a mutable copy of this collection. Mutable copies *always* return `this`,
    * and thus shouldn't be used for equality. Your function should never return
    * a mutable copy of a collection, only use it internally to create a new
    * collection.
    *
    * If possible, use `withMutations` to work with temporary mutable copies as
    * it provides an easier to use API and considers many common optimizations.
    *
    * Note: if the collection is already mutable, `asMutable` returns itself.
    *
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Read the documentation for each method to see if it
    * is safe to use in `withMutations`.
    *
    * @see `Map#asImmutable`
    */
  def asMutable(): this.type = js.native
  /**
    * Returns a new Map containing no keys or values.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * Map({ key: 'value' }).clear()
    * // Map {}
    * ```
    *
    * Note: `clear` can be used in `withMutations`.
    */
  def clear(): this.type = js.native
  /**
    * Returns a new Map which excludes this `key`.
    *
    * Note: `delete` cannot be safely used in IE8, but is provided to mirror
    * the ES6 collection API.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const originalMap = Map({
    *   key: 'value',
    *   otherKey: 'other value'
    * })
    * // Map { "key": "value", "otherKey": "other value" }
    * originalMap.delete('otherKey')
    * // Map { "key": "value" }
    * ```
    *
    * Note: `delete` can be used in `withMutations`.
    *
    * @alias remove
    */
  def delete(key: K): this.type = js.native
  /**
    * Returns a new Map which excludes the provided `keys`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const names = Map({ a: "Aaron", b: "Barry", c: "Connor" })
    * names.deleteAll([ 'a', 'c' ])
    * // Map { "b": "Barry" }
    * ```
    *
    * Note: `deleteAll` can be used in `withMutations`.
    *
    * @alias removeAll
    */
  def deleteAll(keys: Iterable[K]): this.type = js.native
  /**
    * Returns a new Map having removed the value at this `keyPath`. If any keys
    * in `keyPath` do not exist, no change will occur.
    *
    * Note: `deleteIn` can be used in `withMutations`.
    *
    * @alias removeIn
    */
  def deleteIn(keyPath: Iterable[_]): this.type = js.native
  /**
    * Returns a new Map with only the entries for which the `predicate`
    * function returns true.
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_F_V_Map[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): Map[K, F] = js.native
  @JSName("filter")
  def filter_F_V_Map[F /* <: V */](
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
    context: js.Any
  ): Map[K, F] = js.native
  def merge[C](collections: StringDictionary[C]*): Map[K | String, V | C] = js.native
  /**
    * Like `merge()`, but when two Collections conflict, it merges them as well,
    * recursing deeply through the nested data.
    *
    * Note: Values provided to `merge` are shallowly converted before being
    * merged. No nested values are altered unless they will also be merged at
    * a deeper level.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const one = Map({ a: Map({ x: 10, y: 10 }), b: Map({ x: 20, y: 50 }) })
    * const two = Map({ a: Map({ x: 2 }), b: Map({ y: 5 }), c: Map({ z: 3 }) })
    * one.mergeDeep(two)
    * // Map {
    * //   "a": Map { "x": 2, "y": 10 },
    * //   "b": Map { "x": 20, "y": 5 },
    * //   "c": Map { "z": 3 }
    * // }
    * ```
    *
    * Note: `mergeDeep` can be used in `withMutations`.
    */
  def mergeDeep(collections: ((Iterable[js.Tuple2[K, V]]) | StringDictionary[V])*): this.type = js.native
  /**
    * A combination of `updateIn` and `mergeDeep`, returning a new Map, but
    * performing the deep merge at a point arrived at by following the keyPath.
    * In other words, these two lines are equivalent:
    *
    * ```js
    * map.updateIn(['a', 'b', 'c'], abc => abc.mergeDeep(y))
    * map.mergeDeepIn(['a', 'b', 'c'], y)
    * ```
    *
    * Note: `mergeDeepIn` can be used in `withMutations`.
    */
  def mergeDeepIn(keyPath: Iterable[_], collections: js.Any*): this.type = js.native
  /**
    * Like `mergeDeep()`, but when two non-Collections conflict, it uses the
    * `merger` function to determine the resulting value.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const one = Map({ a: Map({ x: 10, y: 10 }), b: Map({ x: 20, y: 50 }) })
    * const two = Map({ a: Map({ x: 2 }), b: Map({ y: 5 }), c: Map({ z: 3 }) })
    * one.mergeDeepWith((oldVal, newVal) => oldVal / newVal, two)
    * // Map {
    * //   "a": Map { "x": 5, "y": 10 },
    * //   "b": Map { "x": 20, "y": 10 },
    * //   "c": Map { "z": 3 }
    * // }
    * ```
    * Note: `mergeDeepWith` can be used in `withMutations`.
    */
  def mergeDeepWith(
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collections: ((Iterable[js.Tuple2[K, V]]) | StringDictionary[V])*
  ): this.type = js.native
  /**
    * A combination of `updateIn` and `merge`, returning a new Map, but
    * performing the merge at a point arrived at by following the keyPath.
    * In other words, these two lines are equivalent:
    *
    * ```js
    * map.updateIn(['a', 'b', 'c'], abc => abc.merge(y))
    * map.mergeIn(['a', 'b', 'c'], y)
    * ```
    *
    * Note: `mergeIn` can be used in `withMutations`.
    */
  def mergeIn(keyPath: Iterable[_], collections: js.Any*): this.type = js.native
  /**
    * Like `merge()`, `mergeWith()` returns a new Map resulting from merging
    * the provided Collections (or JS objects) into this Map, but uses the
    * `merger` function for dealing with conflicts.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const one = Map({ a: 10, b: 20, c: 30 })
    * const two = Map({ b: 40, a: 50, d: 60 })
    * one.mergeWith((oldVal, newVal) => oldVal / newVal, two)
    * // { "a": 0.2, "b": 0.5, "c": 30, "d": 60 }
    * two.mergeWith((oldVal, newVal) => oldVal / newVal, one)
    * // { "b": 2, "a": 5, "d": 60, "c": 30 }
    * ```
    *
    * Note: `mergeWith` can be used in `withMutations`.
    */
  def mergeWith(
    merger: js.Function3[/* oldVal */ V, /* newVal */ V, /* key */ K, V],
    collections: ((Iterable[js.Tuple2[K, V]]) | StringDictionary[V])*
  ): this.type = js.native
  /**
    * Returns a new Map resulting from merging the provided Collections
    * (or JS objects) into this Map. In other words, this takes each entry of
    * each collection and sets it on this Map.
    *
    * Note: Values provided to `merge` are shallowly converted before being
    * merged. No nested values are altered.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const one = Map({ a: 10, b: 20, c: 30 })
    * const two = Map({ b: 40, a: 50, d: 60 })
    * one.merge(two) // Map { "a": 50, "b": 40, "c": 30, "d": 60 }
    * two.merge(one) // Map { "b": 20, "a": 10, "d": 60, "c": 30 }
    * ```
    *
    * Note: `merge` can be used in `withMutations`.
    *
    * @alias concat
    */
  @JSName("merge")
  def merge_KCVC[KC, VC](collections: (Iterable[js.Tuple2[KC, VC]])*): Map[K | KC, V | VC] = js.native
  def remove(key: K): this.type = js.native
  def removeAll(keys: Iterable[K]): this.type = js.native
  def removeIn(keyPath: Iterable[_]): this.type = js.native
  // Persistent changes
  /**
    * Returns a new Map also containing the new key, value pair. If an equivalent
    * key already exists in this Map, it will be replaced.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const originalMap = Map()
    * const newerMap = originalMap.set('key', 'value')
    * const newestMap = newerMap.set('key', 'newer value')
    *
    * originalMap
    * // Map {}
    * newerMap
    * // Map { "key": "value" }
    * newestMap
    * // Map { "key": "newer value" }
    * ```
    *
    * Note: `set` can be used in `withMutations`.
    */
  def set(key: K, value: V): this.type = js.native
  // Deep persistent changes
  /**
    * Returns a new Map having set `value` at this `keyPath`. If any keys in
    * `keyPath` do not exist, a new immutable Map will be created at that key.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const originalMap = Map({
    *   subObject: Map({
    *     subKey: 'subvalue',
    *     subSubObject: Map({
    *       subSubKey: 'subSubValue'
    *     })
    *   })
    * })
    *
    * const newMap = originalMap.setIn(['subObject', 'subKey'], 'ha ha!')
    * // Map {
    * //   "subObject": Map {
    * //     "subKey": "ha ha!",
    * //     "subSubObject": Map { "subSubKey": "subSubValue" }
    * //   }
    * // }
    *
    * const newerMap = originalMap.setIn(
    *   ['subObject', 'subSubObject', 'subSubKey'],
    *   'ha ha ha!'
    * )
    * // Map {
    * //   "subObject": Map {
    * //     "subKey": "subvalue",
    * //     "subSubObject": Map { "subSubKey": "ha ha ha!" }
    * //   }
    * // }
    * ```
    *
    * Plain JavaScript Object or Arrays may be nested within an Immutable.js
    * Collection, and setIn() can update those values as well, treating them
    * immutably by creating new copies of those values with the changes applied.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const originalMap = Map({
    *   subObject: {
    *     subKey: 'subvalue',
    *     subSubObject: {
    *       subSubKey: 'subSubValue'
    *     }
    *   }
    * })
    *
    * originalMap.setIn(['subObject', 'subKey'], 'ha ha!')
    * // Map {
    * //   "subObject": {
    * //     subKey: "ha ha!",
    * //     subSubObject: { subSubKey: "subSubValue" }
    * //   }
    * // }
    * ```
    *
    * If any key in the path exists but cannot be updated (such as a primitive
    * like number or a custom Object like Date), an error will be thrown.
    *
    * Note: `setIn` can be used in `withMutations`.
    */
  def setIn(keyPath: Iterable[_], value: js.Any): this.type = js.native
  /**
    * Returns a new Map having updated the value at this `key` with the return
    * value of calling `updater` with the existing value.
    *
    * Similar to: `map.set(key, updater(map.get(key)))`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const aMap = Map({ key: 'value' })
    * const newMap = aMap.update('key', value => value + value)
    * // Map { "key": "valuevalue" }
    * ```
    *
    * This is most commonly used to call methods on collections within a
    * structure of data. For example, in order to `.push()` onto a nested `List`,
    * `update` and `push` can be used together:
    *
    * <!-- runkit:activate
    *      { "preamble": "const { Map, List } = require('immutable');" }
    * -->
    * ```js
    * const aMap = Map({ nestedList: List([ 1, 2, 3 ]) })
    * const newMap = aMap.update('nestedList', list => list.push(4))
    * // Map { "nestedList": List [ 1, 2, 3, 4 ] }
    * ```
    *
    * When a `notSetValue` is provided, it is provided to the `updater`
    * function when the value at the key does not exist in the Map.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { Map } = require('immutable');" }
    * -->
    * ```js
    * const aMap = Map({ key: 'value' })
    * const newMap = aMap.update('noKey', 'no value', value => value + value)
    * // Map { "key": "value", "noKey": "no valueno value" }
    * ```
    *
    * However, if the `updater` function returns the same value it was called
    * with, then no change will occur. This is still true if `notSetValue`
    * is provided.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { Map } = require('immutable');" }
    * -->
    * ```js
    * const aMap = Map({ apples: 10 })
    * const newMap = aMap.update('oranges', 0, val => val)
    * // Map { "apples": 10 }
    * assert.strictEqual(newMap, map);
    * ```
    *
    * For code using ES2015 or later, using `notSetValue` is discourged in
    * favor of function parameter default values. This helps to avoid any
    * potential confusion with identify functions as described above.
    *
    * The previous example behaves differently when written with default values:
    *
    * <!-- runkit:activate
    *      { "preamble": "const { Map } = require('immutable');" }
    * -->
    * ```js
    * const aMap = Map({ apples: 10 })
    * const newMap = aMap.update('oranges', (val = 0) => val)
    * // Map { "apples": 10, "oranges": 0 }
    * ```
    *
    * If no key is provided, then the `updater` function return value is
    * returned as well.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { Map } = require('immutable');" }
    * -->
    * ```js
    * const aMap = Map({ key: 'value' })
    * const result = aMap.update(aMap => aMap.get('key'))
    * // "value"
    * ```
    *
    * This can be very useful as a way to "chain" a normal function into a
    * sequence of methods. RxJS calls this "let" and lodash calls it "thru".
    *
    * For example, to sum the values in a Map
    *
    * <!-- runkit:activate
    *      { "preamble": "const { Map } = require('immutable');" }
    * -->
    * ```js
    * function sum(collection) {
    *   return collection.reduce((sum, x) => sum + x, 0)
    * }
    *
    * Map({ x: 1, y: 2, z: 3 })
    *   .map(x => x + 1)
    *   .filter(x => x % 2 === 0)
    *   .update(sum)
    * // 6
    * ```
    *
    * Note: `update(key)` can be used in `withMutations`.
    */
  def update(key: K, notSetValue: V, updater: js.Function1[/* value */ V, V]): this.type = js.native
  def update(key: K, updater: js.Function1[/* value */ V, V]): this.type = js.native
  /**
    * Returns a new Map having applied the `updater` to the entry found at the
    * keyPath.
    *
    * This is most commonly used to call methods on collections nested within a
    * structure of data. For example, in order to `.push()` onto a nested `List`,
    * `updateIn` and `push` can be used together:
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map, List } = require('immutable')
    * const map = Map({ inMap: Map({ inList: List([ 1, 2, 3 ]) }) })
    * const newMap = map.updateIn(['inMap', 'inList'], list => list.push(4))
    * // Map { "inMap": Map { "inList": List [ 1, 2, 3, 4 ] } }
    * ```
    *
    * If any keys in `keyPath` do not exist, new Immutable `Map`s will
    * be created at those keys. If the `keyPath` does not already contain a
    * value, the `updater` function will be called with `notSetValue`, if
    * provided, otherwise `undefined`.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { Map } = require('immutable')" }
    * -->
    * ```js
    * const map = Map({ a: Map({ b: Map({ c: 10 }) }) })
    * const newMap = map.updateIn(['a', 'b', 'c'], val => val * 2)
    * // Map { "a": Map { "b": Map { "c": 20 } } }
    * ```
    *
    * If the `updater` function returns the same value it was called with, then
    * no change will occur. This is still true if `notSetValue` is provided.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { Map } = require('immutable')" }
    * -->
    * ```js
    * const map = Map({ a: Map({ b: Map({ c: 10 }) }) })
    * const newMap = map.updateIn(['a', 'b', 'x'], 100, val => val)
    * // Map { "a": Map { "b": Map { "c": 10 } } }
    * assert.strictEqual(newMap, aMap)
    * ```
    *
    * For code using ES2015 or later, using `notSetValue` is discourged in
    * favor of function parameter default values. This helps to avoid any
    * potential confusion with identify functions as described above.
    *
    * The previous example behaves differently when written with default values:
    *
    * <!-- runkit:activate
    *      { "preamble": "const { Map } = require('immutable')" }
    * -->
    * ```js
    * const map = Map({ a: Map({ b: Map({ c: 10 }) }) })
    * const newMap = map.updateIn(['a', 'b', 'x'], (val = 100) => val)
    * // Map { "a": Map { "b": Map { "c": 10, "x": 100 } } }
    * ```
    *
    * Plain JavaScript Object or Arrays may be nested within an Immutable.js
    * Collection, and updateIn() can update those values as well, treating them
    * immutably by creating new copies of those values with the changes applied.
    *
    * <!-- runkit:activate
    *      { "preamble": "const { Map } = require('immutable')" }
    * -->
    * ```js
    * const map = Map({ a: { b: { c: 10 } } })
    * const newMap = map.updateIn(['a', 'b', 'c'], val => val * 2)
    * // Map { "a": { b: { c: 20 } } }
    * ```
    *
    * If any key in the path exists but cannot be updated (such as a primitive
    * like number or a custom Object like Date), an error will be thrown.
    *
    * Note: `updateIn` can be used in `withMutations`.
    */
  def updateIn(keyPath: Iterable[_], notSetValue: js.Any, updater: js.Function1[/* value */ js.Any, _]): this.type = js.native
  def updateIn(keyPath: Iterable[_], updater: js.Function1[/* value */ js.Any, _]): this.type = js.native
  /**
    * Returns true if this is a mutable copy (see `asMutable()`) and mutative
    * alterations have been applied.
    *
    * @see `Map#asMutable`
    */
  def wasAltered(): Boolean = js.native
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
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const map1 = Map()
    * const map2 = map1.withMutations(map => {
    *   map.set('a', 1).set('b', 2).set('c', 3)
    * })
    * assert.equal(map1.size, 0)
    * assert.equal(map2.size, 3)
    * ```
    *
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Read the documentation for each method to see if it
    * is safe to use in `withMutations`.
    */
  def withMutations(mutator: js.Function1[/* mutable */ this.type, _]): this.type = js.native
}

@JSImport("immutable", "Map")
@js.native
object Map extends js.Object {
  def apply(): Map[_, _] = js.native
  def apply[V](obj: StringDictionary[V]): Map[String, V] = js.native
  def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): Map[K, V] = js.native
  /**
    * True if the provided value is a Map
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * Map.isMap({}) // false
    * Map.isMap(Map()) // true
    * ```
    */
  def isMap(maybeMap: js.Any): /* is immutable.immutable.Map<any, any> */ Boolean = js.native
  /**
    * Creates a new Map from alternating keys and values
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * Map.of(
    *   'key', 'value',
    *   'numerical value', 3,
    *    0, 'numerical key'
    * )
    * // Map { 0: "numerical key", "key": "value", "numerical value": 3 }
    * ```
    *
    * @deprecated Use Map([ [ 'k', 'v' ] ]) or Map({ k: 'v' })
    */
  def of(keyValues: js.Any*): Map[_, _] = js.native
}

