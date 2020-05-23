package typings.immutable.mod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.Seq.Indexed
import typings.immutable.Immutable.Seq.Keyed
import typings.immutable.Immutable.Set
import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[K, V]
  extends typings.immutable.Immutable.ValueObject {
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
  def concat(valuesOrCollections: js.Any*): typings.immutable.Immutable.Collection[_, _] = js.native
  def contains(value: V): Boolean = js.native
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
  def count(): Double = js.native
  def count(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): Double = js.native
  def count(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any
  ): Double = js.native
  /**
    * Returns a `Seq.Keyed` of counts, grouped by the return value of
    * the `grouper` function.
    *
    * Note: This is not a lazy operation.
    */
  def countBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G]): typings.immutable.Immutable.Map[G, Double] = js.native
  def countBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G], context: js.Any): typings.immutable.Immutable.Map[G, Double] = js.native
  /**
    * An iterator of this `Collection`'s entries as `[ key, value ]` tuples.
    *
    * Note: this will return an ES6 iterator which does not support
    * Immutable.js sequence algorithms. Use `entrySeq` instead, if this is
    * what you want.
    */
  def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
  /**
    * Returns a new Seq.Indexed of [key, value] tuples.
    */
  def entrySeq(): Indexed[js.Tuple2[K, V]] = js.native
  /**
    * True if `predicate` returns true for all entries in the Collection.
    */
  def every(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): Boolean = js.native
  def every(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any
  ): Boolean = js.native
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
  def filterNot(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): this.type = js.native
  def filterNot(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
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
  def filter_F_V_Collection[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): typings.immutable.Immutable.Collection[K, F] = js.native
  @JSName("filter")
  def filter_F_V_Collection[F /* <: V */](
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
    context: js.Any
  ): typings.immutable.Immutable.Collection[K, F] = js.native
  // Search for value
  /**
    * Returns the first value for which the `predicate` returns true.
    */
  def find(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[V] = js.native
  def find(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any
  ): js.UndefOr[V] = js.native
  def find(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any,
    notSetValue: V
  ): js.UndefOr[V] = js.native
  /**
    * Returns the first [key, value] entry for which the `predicate` returns true.
    */
  def findEntry(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[js.Tuple2[K, V]] = js.native
  def findEntry(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any
  ): js.UndefOr[js.Tuple2[K, V]] = js.native
  def findEntry(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any,
    notSetValue: V
  ): js.UndefOr[js.Tuple2[K, V]] = js.native
  /**
    * Returns the key for which the `predicate` returns true.
    */
  def findKey(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[K] = js.native
  def findKey(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any
  ): js.UndefOr[K] = js.native
  /**
    * Returns the last value for which the `predicate` returns true.
    *
    * Note: `predicate` will be called for each entry in reverse.
    */
  def findLast(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[V] = js.native
  def findLast(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any
  ): js.UndefOr[V] = js.native
  def findLast(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any,
    notSetValue: V
  ): js.UndefOr[V] = js.native
  /**
    * Returns the last [key, value] entry for which the `predicate`
    * returns true.
    *
    * Note: `predicate` will be called for each entry in reverse.
    */
  def findLastEntry(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[js.Tuple2[K, V]] = js.native
  def findLastEntry(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any
  ): js.UndefOr[js.Tuple2[K, V]] = js.native
  def findLastEntry(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any,
    notSetValue: V
  ): js.UndefOr[js.Tuple2[K, V]] = js.native
  /**
    * Returns the last key for which the `predicate` returns true.
    *
    * Note: `predicate` will be called for each entry in reverse.
    */
  def findLastKey(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[K] = js.native
  def findLastKey(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
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
  def flatMap[M](mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Iterable[M]]): typings.immutable.Immutable.Collection[K, M] = js.native
  def flatMap[M](
    mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Iterable[M]],
    context: js.Any
  ): typings.immutable.Immutable.Collection[K, M] = js.native
  /**
    * Flat-maps the Collection, returning a Collection of the same type.
    *
    * Similar to `collection.map(...).flatten(true)`.
    * Used for Dictionaries only.
    */
  @JSName("flatMap")
  def flatMap_KMVM[KM, VM](
    mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Iterable[js.Tuple2[KM, VM]]]
  ): typings.immutable.Immutable.Collection[KM, VM] = js.native
  @JSName("flatMap")
  def flatMap_KMVM[KM, VM](
    mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Iterable[js.Tuple2[KM, VM]]],
    context: js.Any
  ): typings.immutable.Immutable.Collection[KM, VM] = js.native
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
  def flatten(): typings.immutable.Immutable.Collection[_, _] = js.native
  def flatten(depth: Double): typings.immutable.Immutable.Collection[_, _] = js.native
  def flatten(shallow: Boolean): typings.immutable.Immutable.Collection[_, _] = js.native
  // Side effects
  /**
    * The `sideEffect` is executed for every entry in the Collection.
    *
    * Unlike `Array#forEach`, if any call of `sideEffect` returns
    * `false`, the iteration will stop. Returns the number of entries iterated
    * (including the last iteration which returned false).
    */
  def forEach(sideEffect: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, _]): Double = js.native
  def forEach(sideEffect: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, _], context: js.Any): Double = js.native
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
  def getIn(searchKeyPath: Iterable[_]): js.Any = js.native
  def getIn(searchKeyPath: Iterable[_], notSetValue: js.Any): js.Any = js.native
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
  def groupBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G]): /*Map*/ Keyed[G, /*this*/ typings.immutable.Immutable.Collection[K, V]] = js.native
  def groupBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G], context: js.Any): /*Map*/ Keyed[G, /*this*/ typings.immutable.Immutable.Collection[K, V]] = js.native
  /**
    * True if a key exists within this `Collection`, using `Immutable.is`
    * to determine equality
    */
  def has(key: K): Boolean = js.native
  /**
    * True if the result of following a path of keys or indices through nested
    * Collections results in a set value.
    */
  def hasIn(searchKeyPath: Iterable[_]): Boolean = js.native
  /**
    * True if a value exists within this `Collection`, using `Immutable.is`
    * to determine equality
    * @alias contains
    */
  def includes(value: V): Boolean = js.native
  /**
    * Returns true if this Collection includes no values.
    *
    * For some lazy `Seq`, `isEmpty` might need to iterate to determine
    * emptiness. At most one iteration will occur.
    */
  def isEmpty(): Boolean = js.native
  // Comparison
  /**
    * True if `iter` includes every value in this Collection.
    */
  def isSubset(iter: Iterable[V]): Boolean = js.native
  /**
    * True if this Collection includes every value in `iter`.
    */
  def isSuperset(iter: Iterable[V]): Boolean = js.native
  /**
    * Joins values together as a string, inserting a separator between each.
    * The default separator is `","`.
    */
  def join(): String = js.native
  def join(separator: String): String = js.native
  /**
    * Returns the key associated with the search value, or undefined.
    */
  def keyOf(searchValue: V): js.UndefOr[K] = js.native
  // Collections (Seq)
  /**
    * Returns a new Seq.Indexed of the keys of this Collection,
    * discarding values.
    */
  def keySeq(): Indexed[K] = js.native
  // Iterators
  /**
    * An iterator of this `Collection`'s keys.
    *
    * Note: this will return an ES6 iterator which does not support
    * Immutable.js sequence algorithms. Use `keySeq` instead, if this is
    * what you want.
    */
  def keys(): IterableIterator[K] = js.native
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
  def map[M](mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, M]): typings.immutable.Immutable.Collection[K, M] = js.native
  def map[M](mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, M], context: js.Any): typings.immutable.Immutable.Collection[K, M] = js.native
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
  def max(comparator: js.Function2[/* valueA */ V, /* valueB */ V, Double]): js.UndefOr[V] = js.native
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
    comparator: js.Function2[/* valueA */ C, /* valueB */ C, Double]
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
  def min(comparator: js.Function2[/* valueA */ V, /* valueB */ V, Double]): js.UndefOr[V] = js.native
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
    comparator: js.Function2[/* valueA */ C, /* valueB */ C, Double]
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
  def skip(amount: Double): this.type = js.native
  /**
    * Returns a new Collection of the same type which excludes the last `amount`
    * entries from this Collection.
    */
  def skipLast(amount: Double): this.type = js.native
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
  def skipUntil(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): this.type = js.native
  def skipUntil(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
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
  def skipWhile(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): this.type = js.native
  def skipWhile(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
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
  def slice(begin: Double): this.type = js.native
  def slice(begin: Double, end: Double): this.type = js.native
  /**
    * True if `predicate` returns true for any entry in the Collection.
    */
  def some(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): Boolean = js.native
  def some(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any
  ): Boolean = js.native
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
  def sort(comparator: js.Function2[/* valueA */ V, /* valueB */ V, Double]): this.type = js.native
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
    comparator: js.Function2[/* valueA */ C, /* valueB */ C, Double]
  ): this.type = js.native
  /**
    * Returns a new Collection of the same type which includes the first `amount`
    * entries from this Collection.
    */
  def take(amount: Double): this.type = js.native
  /**
    * Returns a new Collection of the same type which includes the last `amount`
    * entries from this Collection.
    */
  def takeLast(amount: Double): this.type = js.native
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
  def takeUntil(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): this.type = js.native
  def takeUntil(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
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
  def takeWhile(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): this.type = js.native
  def takeWhile(
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
    context: js.Any
  ): this.type = js.native
  /**
    * Shallowly converts this collection to an Array.
    *
    * `Collection.Indexed`, and `Collection.Set` produce an Array of values.
    * `Collection.Keyed` produce an Array of [key, value] tuples.
    */
  def toArray(): js.Array[(js.Tuple2[K, V]) | V] = js.native
  /**
    * Returns an Seq.Indexed of the values of this Collection, discarding keys.
    */
  def toIndexedSeq(): Indexed[V] = js.native
  // Conversion to JavaScript types
  /**
    * Deeply converts this Collection to equivalent native JavaScript Array or Object.
    *
    * `Collection.Indexed`, and `Collection.Set` become `Array`, while
    * `Collection.Keyed` become `Object`, converting keys to Strings.
    */
  def toJS(): js.Array[_] | StringDictionary[js.Any] = js.native
  /**
    * Shallowly converts this Collection to equivalent native JavaScript Array or Object.
    *
    * `Collection.Indexed`, and `Collection.Set` become `Array`, while
    * `Collection.Keyed` become `Object`, converting keys to Strings.
    */
  def toJSON(): js.Array[V] | StringDictionary[V] = js.native
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
  def toKeyedSeq(): Keyed[K, V] = js.native
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
  def toList(): typings.immutable.Immutable.List[V] = js.native
  // Conversion to Collections
  /**
    * Converts this Collection to a Map, Throws if keys are not hashable.
    *
    * Note: This is equivalent to `Map(this.toKeyedSeq())`, but provided
    * for convenience and to allow for chained expressions.
    */
  def toMap(): typings.immutable.Immutable.Map[K, V] = js.native
  /**
    * Shallowly converts this Collection to an Object.
    *
    * Converts keys to Strings.
    */
  def toObject(): StringDictionary[V] = js.native
  /**
    * Converts this Collection to a Map, maintaining the order of iteration.
    *
    * Note: This is equivalent to `OrderedMap(this.toKeyedSeq())`, but
    * provided for convenience and to allow for chained expressions.
    */
  def toOrderedMap(): typings.immutable.Immutable.OrderedMap[K, V] = js.native
  /**
    * Converts this Collection to a Set, maintaining the order of iteration and
    * discarding keys.
    *
    * Note: This is equivalent to `OrderedSet(this.valueSeq())`, but provided
    * for convenience and to allow for chained expressions.
    */
  def toOrderedSet(): typings.immutable.Immutable.OrderedSet[V] = js.native
  // Conversion to Seq
  /**
    * Converts this Collection to a Seq of the same kind (indexed,
    * keyed, or set).
    */
  def toSeq(): typings.immutable.Immutable.Seq[K, V] = js.native
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
  def toSetSeq(): typings.immutable.Immutable.Seq.Set[V] = js.native
  /**
    * Converts this Collection to a Stack, discarding keys. Throws if values
    * are not hashable.
    *
    * Note: This is equivalent to `Stack(this)`, but provided to allow for
    * chained expressions.
    */
  def toStack(): typings.immutable.Immutable.Stack[V] = js.native
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
  def valueSeq(): Indexed[V] = js.native
  /**
    * An iterator of this `Collection`'s values.
    *
    * Note: this will return an ES6 iterator which does not support
    * Immutable.js sequence algorithms. Use `valueSeq` instead, if this is
    * what you want.
    */
  def values(): IterableIterator[V] = js.native
}

@JSImport("immutable", "Collection")
@js.native
object Collection extends js.Object {
  @js.native
  trait Indexed[T]
    extends typings.immutable.Immutable.Collection[Double, T] {
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[T]] = js.native
    /**
      * Returns a new Collection with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_T_Indexed[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean]
    ): typings.immutable.Immutable.Collection.Indexed[F] = js.native
    @JSName("filter")
    def filter_F_T_Indexed[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): typings.immutable.Immutable.Collection.Indexed[F] = js.native
    /**
      * Returns the first index in the Collection where a value satisfies the
      * provided predicate function. Otherwise -1 is returned.
      */
    def findIndex(predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, Boolean]): Double = js.native
    def findIndex(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, Boolean],
      context: js.Any
    ): Double = js.native
    /**
      * Returns the last index in the Collection where a value satisfies the
      * provided predicate function. Otherwise -1 is returned.
      */
    def findLastIndex(predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, Boolean]): Double = js.native
    def findLastIndex(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, Boolean],
      context: js.Any
    ): Double = js.native
    /**
      * If this is a collection of [key, value] entry tuples, it will return a
      * Seq.Keyed of those entries.
      */
    def fromEntrySeq(): typings.immutable.Immutable.Seq.Keyed[_, _] = js.native
    // Search for value
    /**
      * Returns the first index at which a given value can be found in the
      * Collection, or -1 if it is not present.
      */
    def indexOf(searchValue: T): Double = js.native
    /**
      * Returns a Collection of the same type with the provided `collections`
      * interleaved into this collection.
      *
      * The resulting Collection includes the first item from each, then the
      * second from each, etc.
      *
      * <!-- runkit:activate
      *      { "preamble": "require('immutable')"}
      * -->
      * ```js
      * const { List } = require('immutable')
      * List([ 1, 2, 3 ]).interleave(List([ 'A', 'B', 'C' ]))
      * // List [ 1, "A", 2, "B", 3, "C"" ]
      * ```
      *
      * The shortest Collection stops interleave.
      *
      * <!-- runkit:activate
      *      { "preamble": "const { List } = require('immutable')" }
      * -->
      * ```js
      * List([ 1, 2, 3 ]).interleave(
      *   List([ 'A', 'B' ]),
      *   List([ 'X', 'Y', 'Z' ])
      * )
      * // List [ 1, "A", "X", 2, "B", "Y"" ]
      * ```
      *
      * Since `interleave()` re-indexes values, it produces a complete copy,
      * which has `O(N)` complexity.
      *
      * Note: `interleave` *cannot* be used in `withMutations`.
      */
    def interleave(collections: (typings.immutable.Immutable.Collection[_, T])*): this.type = js.native
    // Combination
    /**
      * Returns a Collection of the same type with `separator` between each item
      * in this Collection.
      */
    def interpose(separator: T): this.type = js.native
    /**
      * Returns the last index at which a given value can be found in the
      * Collection, or -1 if it is not present.
      */
    def lastIndexOf(searchValue: T): Double = js.native
    /**
      * Splice returns a new indexed Collection by replacing a region of this
      * Collection with new values. If values are not provided, it only skips the
      * region to be removed.
      *
      * `index` may be a negative number, which indexes back from the end of the
      * Collection. `s.splice(-2)` splices after the second to last item.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { List } = require('immutable')
      * List([ 'a', 'b', 'c', 'd' ]).splice(1, 2, 'q', 'r', 's')
      * // List [ "a", "q", "r", "s", "d" ]
      * ```
      *
      * Since `splice()` re-indexes values, it produces a complete copy, which
      * has `O(N)` complexity.
      *
      * Note: `splice` *cannot* be used in `withMutations`.
      */
    def splice(index: Double, removeNum: Double, values: T*): this.type = js.native
    def zip(collections: (typings.immutable.Immutable.Collection[_, _])*): typings.immutable.Immutable.Collection.Indexed[_] = js.native
    /**
      * Returns a Collection of the same type "zipped" with the provided
      * collections.
      *
      * Like `zipWith`, but using the default `zipper`: creating an `Array`.
      *
      *
      * <!-- runkit:activate
      *      { "preamble": "const { List } = require('immutable')" }
      * -->
      * ```js
      * const a = List([ 1, 2, 3 ]);
      * const b = List([ 4, 5, 6 ]);
      * const c = a.zip(b); // List [ [ 1, 4 ], [ 2, 5 ], [ 3, 6 ] ]
      * ```
      */
    def zip[U](other: typings.immutable.Immutable.Collection[_, U]): typings.immutable.Immutable.Collection.Indexed[js.Tuple2[T, U]] = js.native
    def zip[U, V](
      other: typings.immutable.Immutable.Collection[_, U],
      other2: typings.immutable.Immutable.Collection[_, V]
    ): typings.immutable.Immutable.Collection.Indexed[js.Tuple3[T, U, V]] = js.native
    def zipAll(collections: (typings.immutable.Immutable.Collection[_, _])*): typings.immutable.Immutable.Collection.Indexed[_] = js.native
    /**
      * Returns a Collection "zipped" with the provided collections.
      *
      * Unlike `zip`, `zipAll` continues zipping until the longest collection is
      * exhausted. Missing values from shorter collections are filled with `undefined`.
      *
      * ```js
      * const a = List([ 1, 2 ]);
      * const b = List([ 3, 4, 5 ]);
      * const c = a.zipAll(b); // List [ [ 1, 3 ], [ 2, 4 ], [ undefined, 5 ] ]
      * ```
      */
    def zipAll[U](other: typings.immutable.Immutable.Collection[_, U]): typings.immutable.Immutable.Collection.Indexed[js.Tuple2[T, U]] = js.native
    def zipAll[U, V](
      other: typings.immutable.Immutable.Collection[_, U],
      other2: typings.immutable.Immutable.Collection[_, V]
    ): typings.immutable.Immutable.Collection.Indexed[js.Tuple3[T, U, V]] = js.native
    def zipWith[Z](
      zipper: js.Function1[/* repeated */ js.Any, Z],
      collections: (typings.immutable.Immutable.Collection[_, _])*
    ): typings.immutable.Immutable.Collection.Indexed[Z] = js.native
    /**
      * Returns a Collection of the same type "zipped" with the provided
      * collections by using a custom `zipper` function.
      *
      * <!-- runkit:activate
      *      { "preamble": "const { List } = require('immutable')" }
      * -->
      * ```js
      * const a = List([ 1, 2, 3 ]);
      * const b = List([ 4, 5, 6 ]);
      * const c = a.zipWith((a, b) => a + b, b);
      * // List [ 5, 7, 9 ]
      * ```
      */
    def zipWith[U, Z](
      zipper: js.Function2[/* value */ T, /* otherValue */ U, Z],
      otherCollection: typings.immutable.Immutable.Collection[_, U]
    ): typings.immutable.Immutable.Collection.Indexed[Z] = js.native
    def zipWith[U, V, Z](
      zipper: js.Function3[/* value */ T, /* otherValue */ U, /* thirdValue */ V, Z],
      otherCollection: typings.immutable.Immutable.Collection[_, U],
      thirdCollection: typings.immutable.Immutable.Collection[_, V]
    ): typings.immutable.Immutable.Collection.Indexed[Z] = js.native
  }
  
  @js.native
  trait Keyed[K, V]
    extends typings.immutable.Immutable.Collection[K, V] {
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    /**
      * Returns a new Collection with other collections concatenated to this one.
      */
    @JSName("concat")
    def concat_KCVC[KC, VC](collections: (Iterable[js.Tuple2[KC, VC]])*): typings.immutable.Immutable.Collection.Keyed[K | KC, V | VC] = js.native
    /**
      * Returns a new Collection with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_V_Keyed[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): typings.immutable.Immutable.Collection.Keyed[K, F] = js.native
    @JSName("filter")
    def filter_F_V_Keyed[F /* <: V */](
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): typings.immutable.Immutable.Collection.Keyed[K, F] = js.native
    // Sequence functions
    /**
      * Returns a new Collection.Keyed of the same type where the keys and values
      * have been flipped.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * Map({ a: 'z', b: 'y' }).flip()
      * // Map { "z": "a", "y": "b" }
      * ```
      */
    def flip(): typings.immutable.Immutable.Collection.Keyed[V, K] = js.native
    /**
      * Returns a new Collection.Keyed of the same type with entries
      * ([key, value] tuples) passed through a `mapper` function.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * Map({ a: 1, b: 2 })
      *   .mapEntries(([ k, v ]) => [ k.toUpperCase(), v * 2 ])
      * // Map { "A": 2, "B": 4 }
      * ```
      *
      * Note: `mapEntries()` always returns a new instance, even if it produced
      * the same entry at every step.
      */
    def mapEntries[KM, VM](
      mapper: js.Function3[
          /* entry */ js.Tuple2[K, V], 
          /* index */ Double, 
          /* iter */ this.type, 
          js.Tuple2[KM, VM]
        ]
    ): typings.immutable.Immutable.Collection.Keyed[KM, VM] = js.native
    def mapEntries[KM, VM](
      mapper: js.Function3[
          /* entry */ js.Tuple2[K, V], 
          /* index */ Double, 
          /* iter */ this.type, 
          js.Tuple2[KM, VM]
        ],
      context: js.Any
    ): typings.immutable.Immutable.Collection.Keyed[KM, VM] = js.native
    /**
      * Returns a new Collection.Keyed of the same type with keys passed through
      * a `mapper` function.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * Map({ a: 1, b: 2 }).mapKeys(x => x.toUpperCase())
      * // Map { "A": 1, "B": 2 }
      * ```
      *
      * Note: `mapKeys()` always returns a new instance, even if it produced
      * the same key at every step.
      */
    def mapKeys[M](mapper: js.Function3[/* key */ K, /* value */ V, /* iter */ this.type, M]): typings.immutable.Immutable.Collection.Keyed[M, V] = js.native
    def mapKeys[M](mapper: js.Function3[/* key */ K, /* value */ V, /* iter */ this.type, M], context: js.Any): typings.immutable.Immutable.Collection.Keyed[M, V] = js.native
  }
  
  @js.native
  trait Set[T]
    extends typings.immutable.Immutable.Collection[T, T] {
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[T]] = js.native
    /**
      * Returns a new Collection with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_T_Set[F /* <: T */](predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean]): typings.immutable.Immutable.Collection.Set[F] = js.native
    @JSName("filter")
    def filter_F_T_Set[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): typings.immutable.Immutable.Collection.Set[F] = js.native
  }
  
  def apply[I /* <: typings.immutable.Immutable.Collection[_, _] */](collection: I): I = js.native
  def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Collection.Indexed[T] = js.native
  def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.Collection.Keyed[String, V] = js.native
  /**
    * @deprecated use `const { isAssociative } = require('immutable')`
    */
  def isAssociative(maybeAssociative: js.Any): Boolean = js.native
  /**
    * @deprecated use `const { isIndexed } = require('immutable')`
    */
  def isIndexed(maybeIndexed: js.Any): /* is immutable.Immutable.Collection.Indexed<any> */ Boolean = js.native
  /**
    * @deprecated use `const { isKeyed } = require('immutable')`
    */
  def isKeyed(maybeKeyed: js.Any): /* is immutable.Immutable.Collection.Keyed<any, any> */ Boolean = js.native
  /**
    * @deprecated use `const { isOrdered } = require('immutable')`
    */
  def isOrdered(maybeOrdered: js.Any): Boolean = js.native
  @js.native
  object Indexed extends js.Object {
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Collection.Indexed[T] = js.native
  }
  
  @js.native
  object Keyed extends js.Object {
    def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.Collection.Keyed[String, V] = js.native
    def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.Immutable.Collection.Keyed[K, V] = js.native
  }
  
  @js.native
  object Set extends js.Object {
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Collection.Set[T] = js.native
  }
  
}

