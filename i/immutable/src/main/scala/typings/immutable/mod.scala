package typings.immutable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.immutable.Immutable.Seq.Indexed
import typings.immutable.Immutable.Seq.Keyed
import typings.immutable.Immutable.Set
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
      context: js.UndefOr[scala.Nothing],
      notSetValue: V
    ): js.UndefOr[V] = js.native
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
      context: js.UndefOr[scala.Nothing],
      notSetValue: V
    ): js.UndefOr[js.Tuple2[K, V]] = js.native
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
      context: js.UndefOr[scala.Nothing],
      notSetValue: V
    ): js.UndefOr[V] = js.native
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
      context: js.UndefOr[scala.Nothing],
      notSetValue: V
    ): js.UndefOr[js.Tuple2[K, V]] = js.native
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
    def slice(begin: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
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
  object Collection {
    
    @JSImport("immutable", "Collection")
    @js.native
    def apply[I /* <: typings.immutable.Immutable.Collection[_, _] */](collection: I): I = js.native
    @JSImport("immutable", "Collection")
    @js.native
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Collection.Indexed[T] = js.native
    @JSImport("immutable", "Collection")
    @js.native
    def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.Collection.Keyed[String, V] = js.native
    
    @js.native
    trait Indexed[T]
      extends typings.immutable.Immutable.Collection[Double, T] {
      
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
      
      @JSName(js.Symbol.iterator)
      var iterator: js.Function0[IterableIterator[T]] = js.native
      
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
    @JSImport("immutable", "Collection.Indexed")
    @js.native
    def Indexed[T](collection: Iterable[T]): typings.immutable.Immutable.Collection.Indexed[T] = js.native
    
    @js.native
    trait Keyed[K, V]
      extends typings.immutable.Immutable.Collection[K, V] {
      
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
      
      @JSName(js.Symbol.iterator)
      var iterator: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
      
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
    @JSImport("immutable", "Collection.Keyed")
    @js.native
    def Keyed[V](obj: StringDictionary[V]): typings.immutable.Immutable.Collection.Keyed[String, V] = js.native
    @JSImport("immutable", "Collection.Keyed")
    @js.native
    def Keyed[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.Immutable.Collection.Keyed[K, V] = js.native
    
    @js.native
    trait Set[T]
      extends typings.immutable.Immutable.Collection[T, T] {
      
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
      
      @JSName(js.Symbol.iterator)
      var iterator: js.Function0[IterableIterator[T]] = js.native
    }
    @JSImport("immutable", "Collection.Set")
    @js.native
    def Set[T](collection: Iterable[T]): typings.immutable.Immutable.Collection.Set[T] = js.native
    
    /**
      * @deprecated use `const { isAssociative } = require('immutable')`
      */
    @JSImport("immutable", "Collection.isAssociative")
    @js.native
    def isAssociative(maybeAssociative: js.Any): Boolean = js.native
    
    /**
      * @deprecated use `const { isIndexed } = require('immutable')`
      */
    @JSImport("immutable", "Collection.isIndexed")
    @js.native
    def isIndexed(maybeIndexed: js.Any): /* is immutable.Immutable.Collection.Indexed<any> */ Boolean = js.native
    
    /**
      * @deprecated use `const { isKeyed } = require('immutable')`
      */
    @JSImport("immutable", "Collection.isKeyed")
    @js.native
    def isKeyed(maybeKeyed: js.Any): /* is immutable.Immutable.Collection.Keyed<any, any> */ Boolean = js.native
    
    /**
      * @deprecated use `const { isOrdered } = require('immutable')`
      */
    @JSImport("immutable", "Collection.isOrdered")
    @js.native
    def isOrdered(maybeOrdered: js.Any): Boolean = js.native
  }
  
  @js.native
  trait List[T]
    extends typings.immutable.Immutable.Collection.Indexed[T] {
    
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
      * The number of items in this List.
      */
    val size: Double = js.native
    
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
  object List {
    
    @JSImport("immutable", "List")
    @js.native
    def apply(): typings.immutable.Immutable.List[_] = js.native
    @JSImport("immutable", "List")
    @js.native
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
    @JSImport("immutable", "List.isList")
    @js.native
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
    @JSImport("immutable", "List.of")
    @js.native
    def of[T](values: T*): typings.immutable.Immutable.List[T] = js.native
  }
  
  @js.native
  trait Map[K, V]
    extends typings.immutable.Immutable.Collection.Keyed[K, V] {
    
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
    def filter_F_V_Map[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): typings.immutable.Immutable.Map[K, F] = js.native
    @JSName("filter")
    def filter_F_V_Map[F /* <: V */](
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): typings.immutable.Immutable.Map[K, F] = js.native
    
    def merge[C](collections: StringDictionary[C]*): typings.immutable.Immutable.Map[K | String, V | C] = js.native
    
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
    def merge_KCVC[KC, VC](collections: (Iterable[js.Tuple2[KC, VC]])*): typings.immutable.Immutable.Map[K | KC, V | VC] = js.native
    
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
      * The number of entries in this Map.
      */
    val size: Double = js.native
    
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
  object Map {
    
    @JSImport("immutable", "Map")
    @js.native
    def apply(): typings.immutable.Immutable.Map[_, _] = js.native
    @JSImport("immutable", "Map")
    @js.native
    def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.Map[String, V] = js.native
    @JSImport("immutable", "Map")
    @js.native
    def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.Immutable.Map[K, V] = js.native
    
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
    @JSImport("immutable", "Map.isMap")
    @js.native
    def isMap(maybeMap: js.Any): /* is immutable.Immutable.Map<any, any> */ Boolean = js.native
    
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
    @JSImport("immutable", "Map.of")
    @js.native
    def of(keyValues: js.Any*): typings.immutable.Immutable.Map[_, _] = js.native
  }
  
  @js.native
  trait OrderedMap[K, V]
    extends typings.immutable.Immutable.Map[K, V] {
    
    /**
      * Returns a new OrderedMap with only the entries for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_V_OrderedMap[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): typings.immutable.Immutable.OrderedMap[K, F] = js.native
    @JSName("filter")
    def filter_F_V_OrderedMap[F /* <: V */](
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): typings.immutable.Immutable.OrderedMap[K, F] = js.native
  }
  object OrderedMap {
    
    @JSImport("immutable", "OrderedMap")
    @js.native
    def apply(): typings.immutable.Immutable.OrderedMap[_, _] = js.native
    @JSImport("immutable", "OrderedMap")
    @js.native
    def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.OrderedMap[String, V] = js.native
    @JSImport("immutable", "OrderedMap")
    @js.native
    def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.Immutable.OrderedMap[K, V] = js.native
    
    /**
      * True if the provided value is an OrderedMap.
      */
    @JSImport("immutable", "OrderedMap.isOrderedMap")
    @js.native
    def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.Immutable.OrderedMap<any, any> */ Boolean = js.native
  }
  
  @js.native
  trait OrderedSet[T] extends Set[T] {
    
    /**
      * Returns a new OrderedSet with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_T_OrderedSet[F /* <: T */](predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean]): typings.immutable.Immutable.OrderedSet[F] = js.native
    @JSName("filter")
    def filter_F_T_OrderedSet[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): typings.immutable.Immutable.OrderedSet[F] = js.native
    
    def zip(collections: (typings.immutable.Immutable.Collection[_, _])*): typings.immutable.Immutable.OrderedSet[_] = js.native
    /**
      * Returns an OrderedSet of the same type "zipped" with the provided
      * collections.
      *
      * Like `zipWith`, but using the default `zipper`: creating an `Array`.
      *
      * ```js
      * const a = OrderedSet([ 1, 2, 3 ])
      * const b = OrderedSet([ 4, 5, 6 ])
      * const c = a.zip(b)
      * // OrderedSet [ [ 1, 4 ], [ 2, 5 ], [ 3, 6 ] ]
      * ```
      */
    def zip[U](other: typings.immutable.Immutable.Collection[_, U]): typings.immutable.Immutable.OrderedSet[js.Tuple2[T, U]] = js.native
    def zip[U, V](
      other1: typings.immutable.Immutable.Collection[_, U],
      other2: typings.immutable.Immutable.Collection[_, V]
    ): typings.immutable.Immutable.OrderedSet[js.Tuple3[T, U, V]] = js.native
    
    def zipAll(collections: (typings.immutable.Immutable.Collection[_, _])*): typings.immutable.Immutable.OrderedSet[_] = js.native
    /**
      * Returns a OrderedSet of the same type "zipped" with the provided
      * collections.
      *
      * Unlike `zip`, `zipAll` continues zipping until the longest collection is
      * exhausted. Missing values from shorter collections are filled with `undefined`.
      *
      * ```js
      * const a = OrderedSet([ 1, 2 ]);
      * const b = OrderedSet([ 3, 4, 5 ]);
      * const c = a.zipAll(b); // OrderedSet [ [ 1, 3 ], [ 2, 4 ], [ undefined, 5 ] ]
      * ```
      *
      * Note: Since zipAll will return a collection as large as the largest
      * input, some results may contain undefined values. TypeScript cannot
      * account for these without cases (as of v2.5).
      */
    def zipAll[U](other: typings.immutable.Immutable.Collection[_, U]): typings.immutable.Immutable.OrderedSet[js.Tuple2[T, U]] = js.native
    def zipAll[U, V](
      other1: typings.immutable.Immutable.Collection[_, U],
      other2: typings.immutable.Immutable.Collection[_, V]
    ): typings.immutable.Immutable.OrderedSet[js.Tuple3[T, U, V]] = js.native
    
    def zipWith[Z](
      zipper: js.Function1[/* repeated */ js.Any, Z],
      collections: (typings.immutable.Immutable.Collection[_, _])*
    ): typings.immutable.Immutable.OrderedSet[Z] = js.native
    /**
      * Returns an OrderedSet of the same type "zipped" with the provided
      * collections by using a custom `zipper` function.
      *
      * @see Seq.Indexed.zipWith
      */
    def zipWith[U, Z](
      zipper: js.Function2[/* value */ T, /* otherValue */ U, Z],
      otherCollection: typings.immutable.Immutable.Collection[_, U]
    ): typings.immutable.Immutable.OrderedSet[Z] = js.native
    def zipWith[U, V, Z](
      zipper: js.Function3[/* value */ T, /* otherValue */ U, /* thirdValue */ V, Z],
      otherCollection: typings.immutable.Immutable.Collection[_, U],
      thirdCollection: typings.immutable.Immutable.Collection[_, V]
    ): typings.immutable.Immutable.OrderedSet[Z] = js.native
  }
  object OrderedSet {
    
    @JSImport("immutable", "OrderedSet")
    @js.native
    def apply(): typings.immutable.Immutable.OrderedSet[_] = js.native
    @JSImport("immutable", "OrderedSet")
    @js.native
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.OrderedSet[T] = js.native
    
    @JSImport("immutable", "OrderedSet.fromKeys")
    @js.native
    def fromKeys(obj: StringDictionary[js.Any]): typings.immutable.Immutable.OrderedSet[String] = js.native
    /**
      * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
      * the keys from this Collection or JavaScript Object.
      */
    @JSImport("immutable", "OrderedSet.fromKeys")
    @js.native
    def fromKeys[T](iter: typings.immutable.Immutable.Collection[T, _]): typings.immutable.Immutable.OrderedSet[T] = js.native
    
    /**
      * True if the provided value is an OrderedSet.
      */
    @JSImport("immutable", "OrderedSet.isOrderedSet")
    @js.native
    def isOrderedSet(maybeOrderedSet: js.Any): Boolean = js.native
    
    /**
      * Creates a new OrderedSet containing `values`.
      */
    @JSImport("immutable", "OrderedSet.of")
    @js.native
    def of[T](values: T*): typings.immutable.Immutable.OrderedSet[T] = js.native
  }
  
  @JSImport("immutable", "Range")
  @js.native
  def Range(): Indexed[Double] = js.native
  @JSImport("immutable", "Range")
  @js.native
  def Range(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], step: Double): Indexed[Double] = js.native
  @JSImport("immutable", "Range")
  @js.native
  def Range(start: js.UndefOr[scala.Nothing], end: Double): Indexed[Double] = js.native
  @JSImport("immutable", "Range")
  @js.native
  def Range(start: js.UndefOr[scala.Nothing], end: Double, step: Double): Indexed[Double] = js.native
  @JSImport("immutable", "Range")
  @js.native
  def Range(start: Double): Indexed[Double] = js.native
  @JSImport("immutable", "Range")
  @js.native
  def Range(start: Double, end: js.UndefOr[scala.Nothing], step: Double): Indexed[Double] = js.native
  @JSImport("immutable", "Range")
  @js.native
  def Range(start: Double, end: Double): Indexed[Double] = js.native
  @JSImport("immutable", "Range")
  @js.native
  def Range(start: Double, end: Double, step: Double): Indexed[Double] = js.native
  
  @js.native
  trait Record[TProps /* <: js.Object */] extends StObject {
    
    /**
      * @see `Map#asImmutable`
      */
    def asImmutable(): this.type = js.native
    
    /**
      * @see `Map#asMutable`
      */
    def asMutable(): this.type = js.native
    
    /**
      * Returns a new instance of this Record type with all values set
      * to their default values.
      */
    def clear(): this.type = js.native
    
    /**
      * Returns a new instance of this Record type with the value for the
      * specific key set to its default value.
      *
      * @alias remove
      */
    def delete[K /* <: /* keyof TProps */ String */](key: K): this.type = js.native
    
    /**
      * @alias removeIn
      */
    def deleteIn(keyPath: Iterable[_]): this.type = js.native
    
    // Value equality
    def equals(other: js.Any): Boolean = js.native
    
    /**
      * Returns the value associated with the provided key, which may be the
      * default value defined when creating the Record factory function.
      *
      * If the requested key is not defined by this Record type, then
      * notSetValue will be returned if provided. Note that this scenario would
      * produce an error when using Flow or TypeScript.
      */
    def get[K /* <: /* keyof TProps */ String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
    def get[K /* <: /* keyof TProps */ String */](key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
    def get[T](key: String, notSetValue: T): T = js.native
    
    def getIn(keyPath: Iterable[_]): js.Any = js.native
    
    // Reading values
    def has(key: String): Boolean = js.native
    
    // Reading deep values
    def hasIn(keyPath: Iterable[_]): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[
        IterableIterator[
          js.Tuple2[
            /* keyof TProps */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: TProps[keyof TProps] */ js.Any
          ]
        ]
      ] = js.native
    
    def merge(collections: (Partial[TProps] | (Iterable[js.Tuple2[String, _]]))*): this.type = js.native
    
    def mergeDeep(collections: (Partial[TProps] | (Iterable[js.Tuple2[String, _]]))*): this.type = js.native
    
    def mergeDeepIn(keyPath: Iterable[_], collections: js.Any*): this.type = js.native
    
    def mergeDeepWith(
      merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
      collections: (Partial[TProps] | (Iterable[js.Tuple2[String, _]]))*
    ): this.type = js.native
    
    def mergeIn(keyPath: Iterable[_], collections: js.Any*): this.type = js.native
    
    def mergeWith(
      merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* keyof TProps */ /* key */ String, _],
      collections: (Partial[TProps] | (Iterable[js.Tuple2[String, _]]))*
    ): this.type = js.native
    
    def remove[K /* <: /* keyof TProps */ String */](key: K): this.type = js.native
    
    def removeIn(keyPath: Iterable[_]): this.type = js.native
    
    // Persistent changes
    def set[K /* <: /* keyof TProps */ String */](
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ): this.type = js.native
    
    // Deep persistent changes
    def setIn(keyPath: Iterable[_], value: js.Any): this.type = js.native
    
    // Conversion to JavaScript types
    /**
      * Deeply converts this Record to equivalent native JavaScript Object.
      *
      * Note: This method may not be overridden. Objects with custom
      * serialization to plain JS may override toJSON() instead.
      */
    def toJS(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof TProps ]: any}
      */ typings.immutable.immutableStrings.Record with TopLevel[js.Any] = js.native
    
    /**
      * Shallowly converts this Record to equivalent native JavaScript Object.
      */
    def toJSON(): TProps = js.native
    
    /**
      * Shallowly converts this Record to equivalent JavaScript Object.
      */
    def toObject(): TProps = js.native
    
    // Sequence algorithms
    def toSeq(): Keyed[
        /* keyof TProps */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[keyof TProps] */ js.Any
      ] = js.native
    
    def update[K /* <: /* keyof TProps */ String */](
      key: K,
      updater: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
        ]
    ): this.type = js.native
    
    def updateIn(keyPath: Iterable[_], updater: js.Function1[/* value */ js.Any, _]): this.type = js.native
    
    /**
      * @see `Map#wasAltered`
      */
    def wasAltered(): Boolean = js.native
    
    // Transient changes
    /**
      * Note: Not all methods can be used on a mutable collection or within
      * `withMutations`! Only `set` may be used mutatively.
      *
      * @see `Map#withMutations`
      */
    def withMutations(mutator: js.Function1[/* mutable */ this.type, _]): this.type = js.native
  }
  object Record {
    
    @JSImport("immutable", "Record")
    @js.native
    def apply[TProps](defaultValues: TProps): typings.immutable.Immutable.Record.Factory[TProps] = js.native
    @JSImport("immutable", "Record")
    @js.native
    def apply[TProps](defaultValues: TProps, name: String): typings.immutable.Immutable.Record.Factory[TProps] = js.native
    
    @js.native
    trait Factory[TProps /* <: js.Object */]
      extends Instantiable0[typings.immutable.Immutable.Record[TProps] with TProps]
         with Instantiable1[
              (/* values */ Iterable[js.Tuple2[String, js.Any]]) | (/* values */ Partial[TProps]), 
              typings.immutable.Immutable.Record[TProps] with TProps
            ] {
      
      def apply(): typings.immutable.Immutable.Record[TProps] with TProps = js.native
      def apply(values: Iterable[js.Tuple2[String, _]]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
      def apply(values: Partial[TProps]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
      
      /**
        * The name provided to `Record(values, name)` can be accessed with
        * `displayName`.
        */
      var displayName: String = js.native
    }
    @JSImport("immutable", "Record.Factory")
    @js.native
    def Factory[TProps /* <: js.Object */](): typings.immutable.Immutable.Record[TProps] with TProps = js.native
    @JSImport("immutable", "Record.Factory")
    @js.native
    def Factory[TProps /* <: js.Object */](values: Iterable[js.Tuple2[String, _]]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
    @JSImport("immutable", "Record.Factory")
    @js.native
    def Factory[TProps /* <: js.Object */](values: Partial[TProps]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
    
    @JSImport("immutable", "Record.getDescriptiveName")
    @js.native
    def getDescriptiveName(record: typings.immutable.Immutable.Record[_]): String = js.native
    
    @JSImport("immutable", "Record.isRecord")
    @js.native
    def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
  }
  
  @JSImport("immutable", "Repeat")
  @js.native
  def Repeat[T](value: T): Indexed[T] = js.native
  @JSImport("immutable", "Repeat")
  @js.native
  def Repeat[T](value: T, times: Double): Indexed[T] = js.native
  
  @js.native
  trait Seq[K, V]
    extends typings.immutable.Immutable.Collection[K, V] {
    
    // Force evaluation
    /**
      * Because Sequences are lazy and designed to be chained together, they do
      * not cache their results. For example, this map function is called a total
      * of 6 times, as each `join` iterates the Seq of three values.
      *
      *     var squares = Seq([ 1, 2, 3 ]).map(x => x * x)
      *     squares.join() + squares.join()
      *
      * If you know a `Seq` will be used multiple times, it may be more
      * efficient to first cache it in memory. Here, the map function is called
      * only 3 times.
      *
      *     var squares = Seq([ 1, 2, 3 ]).map(x => x * x).cacheResult()
      *     squares.join() + squares.join()
      *
      * Use this method judiciously, as it must fully evaluate a Seq which can be
      * a burden on memory and possibly performance.
      *
      * Note: after calling `cacheResult`, a Seq will always have a `size`.
      */
    def cacheResult(): this.type = js.native
    
    /**
      * Returns a new Seq with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_V_Seq[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): typings.immutable.Immutable.Seq[K, F] = js.native
    @JSName("filter")
    def filter_F_V_Seq[F /* <: V */](
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): typings.immutable.Immutable.Seq[K, F] = js.native
    
    /**
      * Some Seqs can describe their size lazily. When this is the case,
      * size will be an integer. Otherwise it will be undefined.
      *
      * For example, Seqs returned from `map()` or `reverse()`
      * preserve the size of the original `Seq` while `filter()` does not.
      *
      * Note: `Range`, `Repeat` and `Seq`s made from `Array`s and `Object`s will
      * always have a size.
      */
    val size: js.UndefOr[Double] = js.native
  }
  object Seq {
    
    @JSImport("immutable", "Seq")
    @js.native
    def apply(): typings.immutable.Immutable.Seq[_, _] = js.native
    @JSImport("immutable", "Seq")
    @js.native
    def apply[T](collection: typings.immutable.Immutable.Collection.Indexed[T]): typings.immutable.Immutable.Seq.Indexed[T] = js.native
    @JSImport("immutable", "Seq")
    @js.native
    def apply[T](collection: typings.immutable.Immutable.Collection.Set[T]): typings.immutable.Immutable.Seq.Set[T] = js.native
    @JSImport("immutable", "Seq")
    @js.native
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Seq.Indexed[T] = js.native
    @JSImport("immutable", "Seq")
    @js.native
    def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.Seq.Keyed[String, V] = js.native
    @JSImport("immutable", "Seq")
    @js.native
    def apply[S /* <: typings.immutable.Immutable.Seq[_, _] */](seq: S): S = js.native
    @JSImport("immutable", "Seq")
    @js.native
    def apply[K, V](collection: typings.immutable.Immutable.Collection.Keyed[K, V]): typings.immutable.Immutable.Seq.Keyed[K, V] = js.native
    
    @js.native
    trait Indexed[T]
      extends typings.immutable.Immutable.Seq[Double, T]
         with typings.immutable.Immutable.Collection.Indexed[T]
    /**
      * `Seq` which represents an ordered indexed list of values.
      */
    object Indexed {
      
      @JSImport("immutable", "Seq.Indexed")
      @js.native
      def apply(): typings.immutable.Immutable.Seq.Indexed[_] = js.native
      @JSImport("immutable", "Seq.Indexed")
      @js.native
      def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Seq.Indexed[T] = js.native
      
      /**
        * Provides an Seq.Indexed of the values provided.
        */
      @JSImport("immutable", "Seq.Indexed.of")
      @js.native
      def of[T](values: T*): typings.immutable.Immutable.Seq.Indexed[T] = js.native
    }
    
    @js.native
    trait Keyed[K, V]
      extends typings.immutable.Immutable.Seq[K, V]
         with typings.immutable.Immutable.Collection.Keyed[K, V]
    @JSImport("immutable", "Seq.Keyed")
    @js.native
    def Keyed(): typings.immutable.Immutable.Seq.Keyed[_, _] = js.native
    @JSImport("immutable", "Seq.Keyed")
    @js.native
    def Keyed[V](obj: StringDictionary[V]): typings.immutable.Immutable.Seq.Keyed[String, V] = js.native
    @JSImport("immutable", "Seq.Keyed")
    @js.native
    def Keyed[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.Immutable.Seq.Keyed[K, V] = js.native
    @JSImport("immutable", "Seq.Keyed")
    @js.native
    def Keyed_KV[K, V](): typings.immutable.Immutable.Seq.Keyed[K, V] = js.native
    
    @js.native
    trait Set[T]
      extends typings.immutable.Immutable.Seq[T, T]
         with typings.immutable.Immutable.Collection.Set[T]
    object Set {
      
      @JSImport("immutable", "Seq.Set")
      @js.native
      def apply(): typings.immutable.Immutable.Seq.Set[_] = js.native
      @JSImport("immutable", "Seq.Set")
      @js.native
      def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Seq.Set[T] = js.native
      
      /**
        * Returns a Seq.Set of the provided values
        */
      @JSImport("immutable", "Seq.Set.of")
      @js.native
      def of[T](values: T*): typings.immutable.Immutable.Seq.Set[T] = js.native
    }
    
    /**
      * True if `maybeSeq` is a Seq, it is not backed by a concrete
      * structure such as Map, List, or Set.
      */
    @JSImport("immutable", "Seq.isSeq")
    @js.native
    def isSeq(maybeSeq: js.Any): Boolean = js.native
  }
  
  @js.native
  trait Set_[T]
    extends typings.immutable.Immutable.Collection.Set[T] {
    
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
    def intersect(collections: Iterable[T]*): this.type = js.native
    
    def merge[C](collections: Iterable[C]*): Set[T | C] = js.native
    
    def remove(value: T): this.type = js.native
    
    /**
      * The number of items in this Set.
      */
    val size: Double = js.native
    
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
    def subtract(collections: Iterable[T]*): this.type = js.native
    
    /**
      * Returns a Set including any value from `collections` that does not already
      * exist in this Set.
      *
      * Note: `union` can be used in `withMutations`.
      * @alias merge
      * @alias concat
      */
    def union[C](collections: Iterable[C]*): Set[T | C] = js.native
    
    /**
      * @see `Map#wasAltered`
      */
    def wasAltered(): Boolean = js.native
    
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
  object Set_ {
    
    @JSImport("immutable", "Set")
    @js.native
    def apply(): Set[_] = js.native
    @JSImport("immutable", "Set")
    @js.native
    def apply[T](collection: Iterable[T]): Set[T] = js.native
    
    @JSImport("immutable", "Set.fromKeys")
    @js.native
    def fromKeys(obj: StringDictionary[js.Any]): Set[String] = js.native
    /**
      * `Set.fromKeys()` creates a new immutable Set containing the keys from
      * this Collection or JavaScript Object.
      */
    @JSImport("immutable", "Set.fromKeys")
    @js.native
    def fromKeys[T](iter: typings.immutable.Immutable.Collection[T, _]): Set[T] = js.native
    
    /**
      * `Set.intersect()` creates a new immutable Set that is the intersection of
      * a collection of other sets.
      *
      * ```js
      * const { Set } = require('immutable')
      * const intersected = Set.intersect([
      *   Set([ 'a', 'b', 'c' ])
      *   Set([ 'c', 'a', 't' ])
      * ])
      * // Set [ "a", "c"" ]
      * ```
      */
    @JSImport("immutable", "Set.intersect")
    @js.native
    def intersect[T](sets: Iterable[Iterable[T]]): Set[T] = js.native
    
    /**
      * True if the provided value is a Set
      */
    @JSImport("immutable", "Set.isSet")
    @js.native
    def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
    
    /**
      * Creates a new Set containing `values`.
      */
    @JSImport("immutable", "Set.of")
    @js.native
    def of[T](values: T*): Set[T] = js.native
    
    /**
      * `Set.union()` creates a new immutable Set that is the union of a
      * collection of other sets.
      *
      * ```js
      * const { Set } = require('immutable')
      * const unioned = Set.union([
      *   Set([ 'a', 'b', 'c' ])
      *   Set([ 'c', 'a', 't' ])
      * ])
      * // Set [ "a", "b", "c", "t"" ]
      * ```
      */
    @JSImport("immutable", "Set.union")
    @js.native
    def union[T](sets: Iterable[Iterable[T]]): Set[T] = js.native
  }
  
  @js.native
  trait Stack[T]
    extends typings.immutable.Immutable.Collection.Indexed[T] {
    
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
    
    // Persistent changes
    /**
      * Returns a new Stack with 0 size and no values.
      *
      * Note: `clear` can be used in `withMutations`.
      */
    def clear(): typings.immutable.Immutable.Stack[T] = js.native
    
    /**
      * Returns a new Set with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_T_Set[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean]
    ): Set[F] = js.native
    @JSName("filter")
    def filter_F_T_Set[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): Set[F] = js.native
    
    // Reading values
    /**
      * Alias for `Stack.first()`.
      */
    def peek(): js.UndefOr[T] = js.native
    
    /**
      * Alias for `Stack#shift` and is not equivalent to `List#pop`.
      */
    def pop(): typings.immutable.Immutable.Stack[T] = js.native
    
    /**
      * Alias for `Stack#unshift` and is not equivalent to `List#push`.
      */
    def push(values: T*): typings.immutable.Immutable.Stack[T] = js.native
    
    /**
      * Alias for `Stack#unshiftAll`.
      */
    def pushAll(iter: Iterable[T]): typings.immutable.Immutable.Stack[T] = js.native
    
    /**
      * Returns a new Stack with a size ones less than this Stack, excluding
      * the first item in this Stack, shifting all other values to a lower index.
      *
      * Note: this differs from `Array#shift` because it returns a new
      * Stack rather than the removed value. Use `first()` or `peek()` to get the
      * first value in this Stack.
      *
      * Note: `shift` can be used in `withMutations`.
      */
    def shift(): typings.immutable.Immutable.Stack[T] = js.native
    
    /**
      * The number of items in this Stack.
      */
    val size: Double = js.native
    
    /**
      * Returns a new Stack with the provided `values` prepended, shifting other
      * values ahead to higher indices.
      *
      * This is very efficient for Stack.
      *
      * Note: `unshift` can be used in `withMutations`.
      */
    def unshift(values: T*): typings.immutable.Immutable.Stack[T] = js.native
    
    /**
      * Like `Stack#unshift`, but accepts a collection rather than varargs.
      *
      * Note: `unshiftAll` can be used in `withMutations`.
      */
    def unshiftAll(iter: Iterable[T]): typings.immutable.Immutable.Stack[T] = js.native
    
    /**
      * @see `Map#wasAltered`
      */
    def wasAltered(): Boolean = js.native
    
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
  object Stack {
    
    @JSImport("immutable", "Stack")
    @js.native
    def apply(): typings.immutable.Immutable.Stack[_] = js.native
    @JSImport("immutable", "Stack")
    @js.native
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Stack[T] = js.native
    
    /**
      * True if the provided value is a Stack
      */
    @JSImport("immutable", "Stack.isStack")
    @js.native
    def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
    
    /**
      * Creates a new Stack containing `values`.
      */
    @JSImport("immutable", "Stack.of")
    @js.native
    def of[T](values: T*): typings.immutable.Immutable.Stack[T] = js.native
  }
  
  @JSImport("immutable", "fromJS")
  @js.native
  def fromJS(jsValue: js.Any): js.Any = js.native
  @JSImport("immutable", "fromJS")
  @js.native
  def fromJS(
    jsValue: js.Any,
    reviver: js.Function3[
      Double | String, 
      typings.immutable.Immutable.Collection.Indexed[_] | (typings.immutable.Immutable.Collection.Keyed[String, _]), 
      js.UndefOr[js.Array[Double | String]], 
      _
    ]
  ): js.Any = js.native
  
  @JSImport("immutable", "get")
  @js.native
  def get[V](collection: js.Array[V], key: Double): js.UndefOr[V] = js.native
  @JSImport("immutable", "get")
  @js.native
  def get[V](collection: StringDictionary[V], key: String): js.UndefOr[V] = js.native
  @JSImport("immutable", "get")
  @js.native
  def get[V, NSV](collection: js.Array[V], key: Double, notSetValue: NSV): V | NSV = js.native
  @JSImport("immutable", "get")
  @js.native
  def get[V, NSV](collection: StringDictionary[V], key: String, notSetValue: NSV): V | NSV = js.native
  @JSImport("immutable", "get")
  @js.native
  def get[K, V](collection: typings.immutable.Immutable.Collection[K, V], key: K): js.UndefOr[V] = js.native
  @JSImport("immutable", "get")
  @js.native
  def get[C /* <: js.Object */, K /* <: /* keyof C */ String */](`object`: C, key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any = js.native
  @JSImport("immutable", "get")
  @js.native
  def get[TProps, K /* <: /* keyof TProps */ String */](record: typings.immutable.Immutable.Record[TProps], key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
  @JSImport("immutable", "get")
  @js.native
  def get[K, V, NSV](collection: typings.immutable.Immutable.Collection[K, V], key: K, notSetValue: NSV): V | NSV = js.native
  
  @JSImport("immutable", "getIn")
  @js.native
  def getIn(collection: js.Any, keyPath: Iterable[_], notSetValue: js.Any): js.Any = js.native
  
  @JSImport("immutable", "has")
  @js.native
  def has(collection: js.Object, key: js.Any): Boolean = js.native
  
  @JSImport("immutable", "hasIn")
  @js.native
  def hasIn(collection: js.Any, keyPath: Iterable[_]): Boolean = js.native
  
  @JSImport("immutable", "hash")
  @js.native
  def hash(value: js.Any): Double = js.native
  
  @JSImport("immutable", "is")
  @js.native
  def is(first: js.Any, second: js.Any): Boolean = js.native
  
  @JSImport("immutable", "isAssociative")
  @js.native
  def isAssociative(maybeAssociative: js.Any): Boolean = js.native
  
  @JSImport("immutable", "isCollection")
  @js.native
  def isCollection(maybeCollection: js.Any): /* is immutable.Immutable.Collection<any, any> */ Boolean = js.native
  
  @JSImport("immutable", "isImmutable")
  @js.native
  def isImmutable(maybeImmutable: js.Any): /* is immutable.Immutable.Collection<any, any> */ Boolean = js.native
  
  @JSImport("immutable", "isIndexed")
  @js.native
  def isIndexed(maybeIndexed: js.Any): /* is immutable.Immutable.Collection.Indexed<any> */ Boolean = js.native
  
  @JSImport("immutable", "isKeyed")
  @js.native
  def isKeyed(maybeKeyed: js.Any): /* is immutable.Immutable.Collection.Keyed<any, any> */ Boolean = js.native
  
  @JSImport("immutable", "isList")
  @js.native
  def isList(maybeList: js.Any): /* is immutable.Immutable.List<any> */ Boolean = js.native
  
  @JSImport("immutable", "isMap")
  @js.native
  def isMap(maybeMap: js.Any): /* is immutable.Immutable.Map<any, any> */ Boolean = js.native
  
  @JSImport("immutable", "isOrdered")
  @js.native
  def isOrdered(maybeOrdered: js.Any): Boolean = js.native
  
  @JSImport("immutable", "isOrderedMap")
  @js.native
  def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.Immutable.OrderedMap<any, any> */ Boolean = js.native
  
  @JSImport("immutable", "isOrderedSet")
  @js.native
  def isOrderedSet(maybeOrderedSet: js.Any): /* is immutable.Immutable.OrderedSet<any> */ Boolean = js.native
  
  @JSImport("immutable", "isRecord")
  @js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
  
  @JSImport("immutable", "isSeq")
  @js.native
  def isSeq(maybeSeq: js.Any): Boolean = js.native
  
  @JSImport("immutable", "isSet")
  @js.native
  def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
  
  @JSImport("immutable", "isStack")
  @js.native
  def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
  
  @JSImport("immutable", "isValueObject")
  @js.native
  def isValueObject(maybeValue: js.Any): /* is immutable.Immutable.ValueObject */ Boolean = js.native
  
  @JSImport("immutable", "merge")
  @js.native
  def merge[C](collection: C, collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
  
  @JSImport("immutable", "mergeDeep")
  @js.native
  def mergeDeep[C](collection: C, collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
  
  @JSImport("immutable", "mergeDeepWith")
  @js.native
  def mergeDeepWith[C](
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collection: C,
    collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
  ): C = js.native
  
  @JSImport("immutable", "mergeWith")
  @js.native
  def mergeWith[C](
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collection: C,
    collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
  ): C = js.native
  
  @JSImport("immutable", "remove")
  @js.native
  def remove[C /* <: js.Array[_] */](collection: C, key: Double): C = js.native
  @JSImport("immutable", "remove")
  @js.native
  def remove[C, K /* <: /* keyof C */ String */](collection: C, key: K): C = js.native
  
  @JSImport("immutable", "removeIn")
  @js.native
  def removeIn[C](collection: C, keyPath: Iterable[_]): C = js.native
  
  @JSImport("immutable", "remove")
  @js.native
  def remove_C_StringDictionaryAnyK_String[C /* <: StringDictionary[js.Any] */, K /* <: /* keyof C */ String */](collection: C, key: K): C = js.native
  @JSImport("immutable", "remove")
  @js.native
  def remove_KC_CollectionKWildcard[K, C /* <: typings.immutable.Immutable.Collection[K, _] */](collection: C, key: K): C = js.native
  @JSImport("immutable", "remove")
  @js.native
  def remove_TPropsC_RecordTPropsK_String[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: /* keyof TProps */ String */](collection: C, key: K): C = js.native
  
  @JSImport("immutable", "set")
  @js.native
  def set[V, C /* <: StringDictionary[V] */](collection: C, key: String, value: V): C = js.native
  @JSImport("immutable", "set")
  @js.native
  def set[V, C /* <: js.Array[V] */](collection: C, key: Double, value: V): C = js.native
  @JSImport("immutable", "set")
  @js.native
  def set[C, K /* <: /* keyof C */ String */](
    `object`: C,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ): C = js.native
  @JSImport("immutable", "set")
  @js.native
  def set[K, V, C /* <: typings.immutable.Immutable.Collection[K, V] */](collection: C, key: K, value: V): C = js.native
  
  @JSImport("immutable", "setIn")
  @js.native
  def setIn[C](collection: C, keyPath: Iterable[_], value: js.Any): C = js.native
  
  @JSImport("immutable", "set")
  @js.native
  def set_TPropsC_RecordTPropsK_String[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: /* keyof TProps */ String */](
    record: C,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
  ): C = js.native
  
  @JSImport("immutable", "update")
  @js.native
  def update[V](collection: js.Array[V], key: Double, updater: js.Function1[/* value */ V, V]): js.Array[V] = js.native
  @JSImport("immutable", "update")
  @js.native
  def update[V, NSV](
    collection: js.Array[V],
    key: Double,
    notSetValue: NSV,
    updater: js.Function1[/* value */ V | NSV, V]
  ): js.Array[V] = js.native
  @JSImport("immutable", "update")
  @js.native
  def update[C, K /* <: /* keyof C */ String */](
    `object`: C,
    key: K,
    updater: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = js.native
  @JSImport("immutable", "update")
  @js.native
  def update[C, K /* <: /* keyof C */ String */, NSV](
    `object`: C,
    key: K,
    notSetValue: NSV,
    updater: js.Function1[
      /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any) | NSV, 
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = js.native
  
  @JSImport("immutable", "updateIn")
  @js.native
  def updateIn[C](
    collection: C,
    keyPath: Iterable[_],
    notSetValue: js.Any,
    updater: js.Function1[/* value */ js.Any, _]
  ): C = js.native
  @JSImport("immutable", "updateIn")
  @js.native
  def updateIn[C](collection: C, keyPath: Iterable[_], updater: js.Function1[/* value */ js.Any, _]): C = js.native
  
  @JSImport("immutable", "update")
  @js.native
  def update_KVC_CollectionKV[K, V, C /* <: typings.immutable.Immutable.Collection[K, V] */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): C = js.native
  @JSImport("immutable", "update")
  @js.native
  def update_KVC_CollectionKVNSV[K, V, C /* <: typings.immutable.Immutable.Collection[K, V] */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[NSV | V, V]): C = js.native
  @JSImport("immutable", "update")
  @js.native
  def update_TPropsC_RecordTPropsK_String[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: /* keyof TProps */ String */](
    record: C,
    key: K,
    updater: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): C = js.native
  @JSImport("immutable", "update")
  @js.native
  def update_TPropsC_RecordTPropsK_StringNSV[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: /* keyof TProps */ String */, NSV](
    record: C,
    key: K,
    notSetValue: NSV,
    updater: js.Function1[
      (/* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any) | NSV, 
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): C = js.native
  @JSImport("immutable", "update")
  @js.native
  def update_VC_StringDictionaryVK_StringNSV_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): StringDictionary[V] = js.native
  @JSImport("immutable", "update")
  @js.native
  def update_VC_StringDictionaryVK_String_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): StringDictionary[V] = js.native
  
  @js.native
  trait ValueObject extends StObject {
    
    /**
      * True if this and the other Collection have value equality, as defined
      * by `Immutable.is()`.
      *
      * Note: This is equivalent to `Immutable.is(this, other)`, but provided to
      * allow for chained expressions.
      */
    def equals(other: js.Any): Boolean = js.native
  }
  object ValueObject {
    
    @scala.inline
    def apply(equals_ : js.Any => Boolean): ValueObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[ValueObject]
    }
    
    @scala.inline
    implicit class ValueObjectMutableBuilder[Self <: ValueObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: js.Any => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    }
  }
}
