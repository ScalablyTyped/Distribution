package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[K, V] extends ValueObject {
  /**
    * Returns a new Collection of the same type containing all entries except
    * the last.
    */
  def butLast(): this.type = js.native
  // Combination
  /**
    * Returns a new Collection of the same type with other values and
    * collection-like concatenated to this one.
    *
    * For Seqs, all entries will be present in the resulting Seq, even if they
    * have the same key.
    */
  def concat(valuesOrCollections: js.Any*): Collection[_, _] = js.native
  def contains(value: V): scala.Boolean = js.native
  /**
    * Returns the size of this Collection.
    *
    * Regardless of if this Collection can describe its size lazily (some Seqs
    * cannot), this method will always return the correct size. E.g. it
    * evaluates a lazy `Seq` if necessary.
    *
    * If `predicate` is provided, then this returns the count of entries in the
    * Collection for which the `predicate` returns true.
    */
  def count(): scala.Double = js.native
  def count(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): scala.Double = js.native
  def count(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): scala.Double = js.native
  /**
    * Returns a `Seq.Keyed` of counts, grouped by the return value of
    * the `grouper` function.
    *
    * Note: This is not a lazy operation.
    */
  def countBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G]): Map[G, scala.Double] = js.native
  def countBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G], context: js.Any): Map[G, scala.Double] = js.native
  /**
    * An iterator of this `Collection`'s entries as `[ key, value ]` tuples.
    *
    * Note: this will return an ES6 iterator which does not support
    * Immutable.js sequence algorithms. Use `entrySeq` instead, if this is
    * what you want.
    */
  def entries(): stdLib.IterableIterator[js.Tuple2[K, V]] = js.native
  /**
    * Returns a new Seq.Indexed of [key, value] tuples.
    */
  def entrySeq(): immutableLib.immutableMod.SeqNs.Indexed[js.Tuple2[K, V]] = js.native
  /**
    * True if `predicate` returns true for all entries in the Collection.
    */
  def every(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): scala.Boolean = js.native
  def every(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  def filter(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, _]): this.type = js.native
  def filter(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, _], context: js.Any): this.type = js.native
  /**
    * Returns a new Collection of the same type with only the entries for which
    * the `predicate` function returns false.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * Map({ a: 1, b: 2, c: 3, d: 4}).filterNot(x => x % 2 === 0)
    * // Map { "a": 1, "c": 3 }
    * ```
    *
    * Note: `filterNot()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  def filterNot(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): this.type = js.native
  def filterNot(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): this.type = js.native
  /**
    * Returns a new Collection of the same type with only the entries for which
    * the `predicate` function returns true.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * Map({ a: 1, b: 2, c: 3, d: 4}).filter(x => x % 2 === 0)
    * // Map { "b": 2, "d": 4 }
    * ```
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_FVCollection[F /* <: V */](
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ scala.Boolean]
  ): Collection[K, F] = js.native
  @JSName("filter")
  def filter_FVCollection[F /* <: V */](
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ scala.Boolean],
    context: js.Any
  ): Collection[K, F] = js.native
  // Search for value
  /**
    * Returns the first value for which the `predicate` returns true.
    */
  def find(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): js.UndefOr[V] = js.native
  def find(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): js.UndefOr[V] = js.native
  def find(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any,
    notSetValue: V
  ): js.UndefOr[V] = js.native
  /**
    * Returns the first [key, value] entry for which the `predicate` returns true.
    */
  def findEntry(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): js.UndefOr[js.Tuple2[K, V]] = js.native
  def findEntry(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): js.UndefOr[js.Tuple2[K, V]] = js.native
  def findEntry(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any,
    notSetValue: V
  ): js.UndefOr[js.Tuple2[K, V]] = js.native
  /**
    * Returns the key for which the `predicate` returns true.
    */
  def findKey(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): js.UndefOr[K] = js.native
  def findKey(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): js.UndefOr[K] = js.native
  /**
    * Returns the last value for which the `predicate` returns true.
    *
    * Note: `predicate` will be called for each entry in reverse.
    */
  def findLast(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): js.UndefOr[V] = js.native
  def findLast(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): js.UndefOr[V] = js.native
  def findLast(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any,
    notSetValue: V
  ): js.UndefOr[V] = js.native
  /**
    * Returns the last [key, value] entry for which the `predicate`
    * returns true.
    *
    * Note: `predicate` will be called for each entry in reverse.
    */
  def findLastEntry(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): js.UndefOr[js.Tuple2[K, V]] = js.native
  def findLastEntry(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): js.UndefOr[js.Tuple2[K, V]] = js.native
  def findLastEntry(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any,
    notSetValue: V
  ): js.UndefOr[js.Tuple2[K, V]] = js.native
  /**
    * Returns the last key for which the `predicate` returns true.
    *
    * Note: `predicate` will be called for each entry in reverse.
    */
  def findLastKey(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): js.UndefOr[K] = js.native
  def findLastKey(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): js.UndefOr[K] = js.native
  /**
    * In case the `Collection` is not empty returns the first element of the
    * `Collection`.
    * In case the `Collection` is empty returns the optional default
    * value if provided, if no default value is provided returns undefined.
    */
  def first[NSV](): V | NSV = js.native
  def first[NSV](notSetValue: NSV): V | NSV = js.native
  /**
    * Flat-maps the Collection, returning a Collection of the same type.
    *
    * Similar to `collection.map(...).flatten(true)`.
    */
  def flatMap[M](mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, stdLib.Iterable[M]]): Collection[K, M] = js.native
  def flatMap[M](
    mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, stdLib.Iterable[M]],
    context: js.Any
  ): Collection[K, M] = js.native
  /**
    * Flat-maps the Collection, returning a Collection of the same type.
    *
    * Similar to `collection.map(...).flatten(true)`.
    * Used for Dictionaries only.
    */
  @JSName("flatMap")
  def flatMap_KMVM[KM, VM](
    mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, stdLib.Iterable[js.Tuple2[KM, VM]]]
  ): Collection[KM, VM] = js.native
  @JSName("flatMap")
  def flatMap_KMVM[KM, VM](
    mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, stdLib.Iterable[js.Tuple2[KM, VM]]],
    context: js.Any
  ): Collection[KM, VM] = js.native
  /**
    * Flattens nested Collections.
    *
    * Will deeply flatten the Collection by default, returning a Collection of the
    * same type, but a `depth` can be provided in the form of a number or
    * boolean (where true means to shallowly flatten one level). A depth of 0
    * (or shallow: false) will deeply flatten.
    *
    * Flattens only others Collection, not Arrays or Objects.
    *
    * Note: `flatten(true)` operates on Collection<any, Collection<K, V>> and
    * returns Collection<K, V>
    */
  def flatten(): Collection[_, _] = js.native
  def flatten(depth: scala.Double): Collection[_, _] = js.native
  def flatten(shallow: scala.Boolean): Collection[_, _] = js.native
  // Side effects
  /**
    * The `sideEffect` is executed for every entry in the Collection.
    *
    * Unlike `Array#forEach`, if any call of `sideEffect` returns
    * `false`, the iteration will stop. Returns the number of entries iterated
    * (including the last iteration which returned false).
    */
  def forEach(sideEffect: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, _]): scala.Double = js.native
  def forEach(sideEffect: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, _], context: js.Any): scala.Double = js.native
  def get(key: K): js.UndefOr[V] = js.native
  // Reading values
  /**
    * Returns the value associated with the provided key, or notSetValue if
    * the Collection does not contain this key.
    *
    * Note: it is possible a key may be associated with an `undefined` value,
    * so if `notSetValue` is not provided and this method returns `undefined`,
    * that does not guarantee the key was not found.
    */
  def get[NSV](key: K, notSetValue: NSV): V | NSV = js.native
  // Reading deep values
  /**
    * Returns the value found by following a path of keys or indices through
    * nested Collections.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map, List } = require('immutable')
    * const deepData = Map({ x: List([ Map({ y: 123 }) ]) });
    * deepData.getIn(['x', 0, 'y']) // 123
    * ```
    *
    * Plain JavaScript Object or Arrays may be nested within an Immutable.js
    * Collection, and getIn() can access those values as well:
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map, List } = require('immutable')
    * const deepData = Map({ x: [ { y: 123 } ] });
    * deepData.getIn(['x', 0, 'y']) // 123
    * ```
    */
  def getIn(searchKeyPath: stdLib.Iterable[_]): js.Any = js.native
  def getIn(searchKeyPath: stdLib.Iterable[_], notSetValue: js.Any): js.Any = js.native
  /**
    * Returns a `Collection.Keyed` of `Collection.Keyeds`, grouped by the return
    * value of the `grouper` function.
    *
    * Note: This is always an eager operation.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List, Map } = require('immutable')
    * const listOfMaps = List([
    *   Map({ v: 0 }),
    *   Map({ v: 1 }),
    *   Map({ v: 1 }),
    *   Map({ v: 0 }),
    *   Map({ v: 2 })
    * ])
    * const groupsOfMaps = listOfMaps.groupBy(x => x.get('v'))
    * // Map {
    * //   0: List [ Map{ "v": 0 }, Map { "v": 0 } ],
    * //   1: List [ Map{ "v": 1 }, Map { "v": 1 } ],
    * //   2: List [ Map{ "v": 2 } ],
    * // }
    * ```
    */
  def groupBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G]): /*Map*/ immutableLib.immutableMod.SeqNs.Keyed[G, /*this*/ Collection[K, V]] = js.native
  def groupBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G], context: js.Any): /*Map*/ immutableLib.immutableMod.SeqNs.Keyed[G, /*this*/ Collection[K, V]] = js.native
  /**
    * True if a key exists within this `Collection`, using `Immutable.is`
    * to determine equality
    */
  def has(key: K): scala.Boolean = js.native
  /**
    * True if the result of following a path of keys or indices through nested
    * Collections results in a set value.
    */
  def hasIn(searchKeyPath: stdLib.Iterable[_]): scala.Boolean = js.native
  /**
    * True if a value exists within this `Collection`, using `Immutable.is`
    * to determine equality
    * @alias contains
    */
  def includes(value: V): scala.Boolean = js.native
  /**
    * Returns true if this Collection includes no values.
    *
    * For some lazy `Seq`, `isEmpty` might need to iterate to determine
    * emptiness. At most one iteration will occur.
    */
  def isEmpty(): scala.Boolean = js.native
  // Comparison
  /**
    * True if `iter` includes every value in this Collection.
    */
  def isSubset(iter: stdLib.Iterable[V]): scala.Boolean = js.native
  /**
    * True if this Collection includes every value in `iter`.
    */
  def isSuperset(iter: stdLib.Iterable[V]): scala.Boolean = js.native
  /**
    * Joins values together as a string, inserting a separator between each.
    * The default separator is `","`.
    */
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  /**
    * Returns the key associated with the search value, or undefined.
    */
  def keyOf(searchValue: V): js.UndefOr[K] = js.native
  // Collections (Seq)
  /**
    * Returns a new Seq.Indexed of the keys of this Collection,
    * discarding values.
    */
  def keySeq(): immutableLib.immutableMod.SeqNs.Indexed[K] = js.native
  // Iterators
  /**
    * An iterator of this `Collection`'s keys.
    *
    * Note: this will return an ES6 iterator which does not support
    * Immutable.js sequence algorithms. Use `keySeq` instead, if this is
    * what you want.
    */
  def keys(): stdLib.IterableIterator[K] = js.native
  /**
    * In case the `Collection` is not empty returns the last element of the
    * `Collection`.
    * In case the `Collection` is empty returns the optional default
    * value if provided, if no default value is provided returns undefined.
    */
  def last[NSV](): V | NSV = js.native
  def last[NSV](notSetValue: NSV): V | NSV = js.native
  /**
    * Returns the last key associated with the search value, or undefined.
    */
  def lastKeyOf(searchValue: V): js.UndefOr[K] = js.native
  /**
    * Note: used only for sets, which return Collection<M, M> but are otherwise
    * identical to normal `map()`.
    *
    * @ignore
    */
  def map[M](args: scala.Nothing*): js.Any = js.native
  // Sequence algorithms
  /**
    * Returns a new Collection of the same type with values passed through a
    * `mapper` function.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Collection } = require('immutable')
    * Collection({ a: 1, b: 2 }).map(x => 10 * x)
    * // Seq { "a": 10, "b": 20 }
    * ```
    *
    * Note: `map()` always returns a new instance, even if it produced the same
    * value at every step.
    */
  def map[M](mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, M]): Collection[K, M] = js.native
  def map[M](mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, M], context: js.Any): Collection[K, M] = js.native
  /**
    * Returns the maximum value in this collection. If any values are
    * comparatively equivalent, the first one found will be returned.
    *
    * The `comparator` is used in the same way as `Collection#sort`. If it is not
    * provided, the default comparator is `>`.
    *
    * When two values are considered equivalent, the first encountered will be
    * returned. Otherwise, `max` will operate independent of the order of input
    * as long as the comparator is commutative. The default comparator `>` is
    * commutative *only* when types do not differ.
    *
    * If `comparator` returns 0 and either value is NaN, undefined, or null,
    * that value will be returned.
    */
  def max(): js.UndefOr[V] = js.native
  def max(comparator: js.Function2[/* valueA */ V, /* valueB */ V, scala.Double]): js.UndefOr[V] = js.native
  /**
    * Like `max`, but also accepts a `comparatorValueMapper` which allows for
    * comparing by more sophisticated means:
    *
    *     hitters.maxBy(hitter => hitter.avgHits);
    *
    */
  def maxBy[C](comparatorValueMapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, C]): js.UndefOr[V] = js.native
  def maxBy[C](
    comparatorValueMapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, C],
    comparator: js.Function2[/* valueA */ C, /* valueB */ C, scala.Double]
  ): js.UndefOr[V] = js.native
  /**
    * Returns the minimum value in this collection. If any values are
    * comparatively equivalent, the first one found will be returned.
    *
    * The `comparator` is used in the same way as `Collection#sort`. If it is not
    * provided, the default comparator is `<`.
    *
    * When two values are considered equivalent, the first encountered will be
    * returned. Otherwise, `min` will operate independent of the order of input
    * as long as the comparator is commutative. The default comparator `<` is
    * commutative *only* when types do not differ.
    *
    * If `comparator` returns 0 and either value is NaN, undefined, or null,
    * that value will be returned.
    */
  def min(): js.UndefOr[V] = js.native
  def min(comparator: js.Function2[/* valueA */ V, /* valueB */ V, scala.Double]): js.UndefOr[V] = js.native
  /**
    * Like `min`, but also accepts a `comparatorValueMapper` which allows for
    * comparing by more sophisticated means:
    *
    *     hitters.minBy(hitter => hitter.avgHits);
    *
    */
  def minBy[C](comparatorValueMapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, C]): js.UndefOr[V] = js.native
  def minBy[C](
    comparatorValueMapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, C],
    comparator: js.Function2[/* valueA */ C, /* valueB */ C, scala.Double]
  ): js.UndefOr[V] = js.native
  def reduce[R](reducer: js.Function4[/* reduction */ V | R, /* value */ V, /* key */ K, /* iter */ this.type, R]): R = js.native
  // Reducing a value
  /**
    * Reduces the Collection to a value by calling the `reducer` for every entry
    * in the Collection and passing along the reduced value.
    *
    * If `initialReduction` is not provided, the first item in the
    * Collection will be used.
    *
    * @see `Array#reduce`.
    */
  def reduce[R](
    reducer: js.Function4[/* reduction */ R, /* value */ V, /* key */ K, /* iter */ this.type, R],
    initialReduction: R
  ): R = js.native
  def reduce[R](
    reducer: js.Function4[/* reduction */ R, /* value */ V, /* key */ K, /* iter */ this.type, R],
    initialReduction: R,
    context: js.Any
  ): R = js.native
  def reduceRight[R](reducer: js.Function4[/* reduction */ V | R, /* value */ V, /* key */ K, /* iter */ this.type, R]): R = js.native
  /**
    * Reduces the Collection in reverse (from the right side).
    *
    * Note: Similar to this.reverse().reduce(), and provided for parity
    * with `Array#reduceRight`.
    */
  def reduceRight[R](
    reducer: js.Function4[/* reduction */ R, /* value */ V, /* key */ K, /* iter */ this.type, R],
    initialReduction: R
  ): R = js.native
  def reduceRight[R](
    reducer: js.Function4[/* reduction */ R, /* value */ V, /* key */ K, /* iter */ this.type, R],
    initialReduction: R,
    context: js.Any
  ): R = js.native
  /**
    * Returns a new Collection of the same type containing all entries except
    * the first.
    */
  def rest(): this.type = js.native
  /**
    * Returns a new Collection of the same type in reverse order.
    */
  def reverse(): this.type = js.native
  /**
    * Returns a new Collection of the same type which excludes the first `amount`
    * entries from this Collection.
    */
  def skip(amount: scala.Double): this.type = js.native
  /**
    * Returns a new Collection of the same type which excludes the last `amount`
    * entries from this Collection.
    */
  def skipLast(amount: scala.Double): this.type = js.native
  /**
    * Returns a new Collection of the same type which includes entries starting
    * from when `predicate` first returns true.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable')
    * List([ 'dog', 'frog', 'cat', 'hat', 'god' ])
    *   .skipUntil(x => x.match(/hat/))
    * // List [ "hat", "god"" ]
    * ```
    */
  def skipUntil(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): this.type = js.native
  def skipUntil(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): this.type = js.native
  /**
    * Returns a new Collection of the same type which includes entries starting
    * from when `predicate` first returns false.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable')
    * List([ 'dog', 'frog', 'cat', 'hat', 'god' ])
    *   .skipWhile(x => x.match(/g/))
    * // List [ "cat", "hat", "god"" ]
    * ```
    */
  def skipWhile(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): this.type = js.native
  def skipWhile(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): this.type = js.native
  // Creating subsets
  /**
    * Returns a new Collection of the same type representing a portion of this
    * Collection from start up to but not including end.
    *
    * If begin is negative, it is offset from the end of the Collection. e.g.
    * `slice(-2)` returns a Collection of the last two entries. If it is not
    * provided the new Collection will begin at the beginning of this Collection.
    *
    * If end is negative, it is offset from the end of the Collection. e.g.
    * `slice(0, -1)` returns a Collection of everything but the last entry. If
    * it is not provided, the new Collection will continue through the end of
    * this Collection.
    *
    * If the requested slice is equivalent to the current Collection, then it
    * will return itself.
    */
  def slice(): this.type = js.native
  def slice(begin: scala.Double): this.type = js.native
  def slice(begin: scala.Double, end: scala.Double): this.type = js.native
  /**
    * True if `predicate` returns true for any entry in the Collection.
    */
  def some(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): scala.Boolean = js.native
  def some(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  /**
    * Returns a new Collection of the same type which includes the same entries,
    * stably sorted by using a `comparator`.
    *
    * If a `comparator` is not provided, a default comparator uses `<` and `>`.
    *
    * `comparator(valueA, valueB)`:
    *
    *   * Returns `0` if the elements should not be swapped.
    *   * Returns `-1` (or any negative number) if `valueA` comes before `valueB`
    *   * Returns `1` (or any positive number) if `valueA` comes after `valueB`
    *   * Is pure, i.e. it must always return the same value for the same pair
    *     of values.
    *
    * When sorting collections which have no defined order, their ordered
    * equivalents will be returned. e.g. `map.sort()` returns OrderedMap.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * Map({ "c": 3, "a": 1, "b": 2 }).sort((a, b) => {
    *   if (a < b) { return -1; }
    *   if (a > b) { return 1; }
    *   if (a === b) { return 0; }
    * });
    * // OrderedMap { "a": 1, "b": 2, "c": 3 }
    * ```
    *
    * Note: `sort()` Always returns a new instance, even if the original was
    * already sorted.
    *
    * Note: This is always an eager operation.
    */
  def sort(): this.type = js.native
  def sort(comparator: js.Function2[/* valueA */ V, /* valueB */ V, scala.Double]): this.type = js.native
  /**
    * Like `sort`, but also accepts a `comparatorValueMapper` which allows for
    * sorting by more sophisticated means:
    *
    *     hitters.sortBy(hitter => hitter.avgHits)
    *
    * Note: `sortBy()` Always returns a new instance, even if the original was
    * already sorted.
    *
    * Note: This is always an eager operation.
    */
  def sortBy[C](comparatorValueMapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, C]): this.type = js.native
  def sortBy[C](
    comparatorValueMapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, C],
    comparator: js.Function2[/* valueA */ C, /* valueB */ C, scala.Double]
  ): this.type = js.native
  /**
    * Returns a new Collection of the same type which includes the first `amount`
    * entries from this Collection.
    */
  def take(amount: scala.Double): this.type = js.native
  /**
    * Returns a new Collection of the same type which includes the last `amount`
    * entries from this Collection.
    */
  def takeLast(amount: scala.Double): this.type = js.native
  /**
    * Returns a new Collection of the same type which includes entries from this
    * Collection as long as the `predicate` returns false.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable')
    * List([ 'dog', 'frog', 'cat', 'hat', 'god' ])
    *   .takeUntil(x => x.match(/at/))
    * // List [ "dog", "frog" ]
    * ```
    */
  def takeUntil(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): this.type = js.native
  def takeUntil(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): this.type = js.native
  /**
    * Returns a new Collection of the same type which includes entries from this
    * Collection as long as the `predicate` returns true.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable')
    * List([ 'dog', 'frog', 'cat', 'hat', 'god' ])
    *   .takeWhile(x => x.match(/o/))
    * // List [ "dog", "frog" ]
    * ```
    */
  def takeWhile(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean]): this.type = js.native
  def takeWhile(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, scala.Boolean],
    context: js.Any
  ): this.type = js.native
  /**
    * Shallowly converts this collection to an Array.
    *
    * `Collection.Indexed`, and `Collection.Set` produce an Array of values.
    * `Collection.Keyed` produce an Array of [key, value] tuples.
    */
  def toArray(): js.Array[V] | (js.Array[js.Tuple2[K, V]]) = js.native
  /**
    * Returns an Seq.Indexed of the values of this Collection, discarding keys.
    */
  def toIndexedSeq(): immutableLib.immutableMod.SeqNs.Indexed[V] = js.native
  // Conversion to JavaScript types
  /**
    * Deeply converts this Collection to equivalent native JavaScript Array or Object.
    *
    * `Collection.Indexed`, and `Collection.Set` become `Array`, while
    * `Collection.Keyed` become `Object`, converting keys to Strings.
    */
  def toJS(): js.Array[_] | org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Shallowly converts this Collection to equivalent native JavaScript Array or Object.
    *
    * `Collection.Indexed`, and `Collection.Set` become `Array`, while
    * `Collection.Keyed` become `Object`, converting keys to Strings.
    */
  def toJSON(): js.Array[V] | org.scalablytyped.runtime.StringDictionary[V] = js.native
  /**
    * Returns a Seq.Keyed from this Collection where indices are treated as keys.
    *
    * This is useful if you want to operate on an
    * Collection.Indexed and preserve the [index, value] pairs.
    *
    * The returned Seq will have identical iteration order as
    * this Collection.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Seq } = require('immutable')
    * const indexedSeq = Seq([ 'A', 'B', 'C' ])
    * // Seq [ "A", "B", "C" ]
    * indexedSeq.filter(v => v === 'B')
    * // Seq [ "B" ]
    * const keyedSeq = indexedSeq.toKeyedSeq()
    * // Seq { 0: "A", 1: "B", 2: "C" }
    * keyedSeq.filter(v => v === 'B')
    * // Seq { 1: "B" }
    * ```
    */
  def toKeyedSeq(): immutableLib.immutableMod.SeqNs.Keyed[K, V] = js.native
  /**
    * Converts this Collection to a List, discarding keys.
    *
    * This is similar to `List(collection)`, but provided to allow for chained
    * expressions. However, when called on `Map` or other keyed collections,
    * `collection.toList()` discards the keys and creates a list of only the
    * values, whereas `List(collection)` creates a list of entry tuples.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map, List } = require('immutable')
    * var myMap = Map({ a: 'Apple', b: 'Banana' })
    * List(myMap) // List [ [ "a", "Apple" ], [ "b", "Banana" ] ]
    * myMap.toList() // List [ "Apple", "Banana" ]
    * ```
    */
  def toList(): List[V] = js.native
  // Conversion to Collections
  /**
    * Converts this Collection to a Map, Throws if keys are not hashable.
    *
    * Note: This is equivalent to `Map(this.toKeyedSeq())`, but provided
    * for convenience and to allow for chained expressions.
    */
  def toMap(): Map[K, V] = js.native
  /**
    * Shallowly converts this Collection to an Object.
    *
    * Converts keys to Strings.
    */
  def toObject(): org.scalablytyped.runtime.StringDictionary[V] = js.native
  /**
    * Converts this Collection to a Map, maintaining the order of iteration.
    *
    * Note: This is equivalent to `OrderedMap(this.toKeyedSeq())`, but
    * provided for convenience and to allow for chained expressions.
    */
  def toOrderedMap(): OrderedMap[K, V] = js.native
  /**
    * Converts this Collection to a Set, maintaining the order of iteration and
    * discarding keys.
    *
    * Note: This is equivalent to `OrderedSet(this.valueSeq())`, but provided
    * for convenience and to allow for chained expressions.
    */
  def toOrderedSet(): OrderedSet[V] = js.native
  // Conversion to Seq
  /**
    * Converts this Collection to a Seq of the same kind (indexed,
    * keyed, or set).
    */
  def toSeq(): Seq[K, V] = js.native
  /**
    * Converts this Collection to a Set, discarding keys. Throws if values
    * are not hashable.
    *
    * Note: This is equivalent to `Set(this)`, but provided to allow for
    * chained expressions.
    */
  def toSet(): Set[V] = js.native
  /**
    * Returns a Seq.Set of the values of this Collection, discarding keys.
    */
  def toSetSeq(): immutableLib.immutableMod.SeqNs.Set[V] = js.native
  /**
    * Converts this Collection to a Stack, discarding keys. Throws if values
    * are not hashable.
    *
    * Note: This is equivalent to `Stack(this)`, but provided to allow for
    * chained expressions.
    */
  def toStack(): Stack[V] = js.native
  // Persistent changes
  /**
    * This can be very useful as a way to "chain" a normal function into a
    * sequence of methods. RxJS calls this "let" and lodash calls it "thru".
    *
    * For example, to sum a Seq after mapping and filtering:
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Seq } = require('immutable')
    *
    * function sum(collection) {
    *   return collection.reduce((sum, x) => sum + x, 0)
    * }
    *
    * Seq([ 1, 2, 3 ])
    *   .map(x => x + 1)
    *   .filter(x => x % 2 === 0)
    *   .update(sum)
    * // 6
    * ```
    */
  def update[R](updater: js.Function1[/* value */ this.type, R]): R = js.native
  /**
    * Returns an Seq.Indexed of the values of this Collection, discarding keys.
    */
  def valueSeq(): immutableLib.immutableMod.SeqNs.Indexed[V] = js.native
  /**
    * An iterator of this `Collection`'s values.
    *
    * Note: this will return an ES6 iterator which does not support
    * Immutable.js sequence algorithms. Use `valueSeq` instead, if this is
    * what you want.
    */
  def values(): stdLib.IterableIterator[V] = js.native
}

