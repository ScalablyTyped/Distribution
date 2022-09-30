package typings.immutable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.immutable.mod.Seq.Indexed
import typings.immutable.mod.Seq.Keyed
import typings.immutable.mod.Seq.Set
import typings.std.ArrayLike
import typings.std.IterableIterator
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Collection[K, V]
    extends StObject
       with ValueObject {
    
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
    def concat(valuesOrCollections: Any*): Collection[Any, Any] = js.native
    
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
    def count(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): Double = js.native
    
    /**
      * Returns a `Seq.Keyed` of counts, grouped by the return value of
      * the `grouper` function.
      *
      * Note: This is not a lazy operation.
      */
    def countBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G]): Map[G, Double] = js.native
    def countBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G], context: Any): Map[G, Double] = js.native
    
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
    def every(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): Boolean = js.native
    
    def filter(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Any]): this.type = js.native
    def filter(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Any], context: Any): this.type = js.native
    
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
    def filterNot(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): this.type = js.native
    
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
    def filter_F_Collection[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): Collection[K, F] = js.native
    @JSName("filter")
    def filter_F_Collection[F /* <: V */](
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
      context: Any
    ): Collection[K, F] = js.native
    
    // Search for value
    /**
      * Returns the first value for which the `predicate` returns true.
      */
    def find(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[V] = js.native
    def find(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): js.UndefOr[V] = js.native
    def find(
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
      context: Any,
      notSetValue: V
    ): js.UndefOr[V] = js.native
    def find(
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
      context: Unit,
      notSetValue: V
    ): js.UndefOr[V] = js.native
    
    /**
      * Returns the first [key, value] entry for which the `predicate` returns true.
      */
    def findEntry(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[js.Tuple2[K, V]] = js.native
    def findEntry(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): js.UndefOr[js.Tuple2[K, V]] = js.native
    def findEntry(
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
      context: Any,
      notSetValue: V
    ): js.UndefOr[js.Tuple2[K, V]] = js.native
    def findEntry(
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
      context: Unit,
      notSetValue: V
    ): js.UndefOr[js.Tuple2[K, V]] = js.native
    
    /**
      * Returns the key for which the `predicate` returns true.
      */
    def findKey(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[K] = js.native
    def findKey(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): js.UndefOr[K] = js.native
    
    /**
      * Returns the last value for which the `predicate` returns true.
      *
      * Note: `predicate` will be called for each entry in reverse.
      */
    def findLast(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[V] = js.native
    def findLast(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): js.UndefOr[V] = js.native
    def findLast(
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
      context: Any,
      notSetValue: V
    ): js.UndefOr[V] = js.native
    def findLast(
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
      context: Unit,
      notSetValue: V
    ): js.UndefOr[V] = js.native
    
    /**
      * Returns the last [key, value] entry for which the `predicate`
      * returns true.
      *
      * Note: `predicate` will be called for each entry in reverse.
      */
    def findLastEntry(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[js.Tuple2[K, V]] = js.native
    def findLastEntry(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): js.UndefOr[js.Tuple2[K, V]] = js.native
    def findLastEntry(
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
      context: Any,
      notSetValue: V
    ): js.UndefOr[js.Tuple2[K, V]] = js.native
    def findLastEntry(
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean],
      context: Unit,
      notSetValue: V
    ): js.UndefOr[js.Tuple2[K, V]] = js.native
    
    /**
      * Returns the last key for which the `predicate` returns true.
      *
      * Note: `predicate` will be called for each entry in reverse.
      */
    def findLastKey(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): js.UndefOr[K] = js.native
    def findLastKey(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): js.UndefOr[K] = js.native
    
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
    def flatMap[M](mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, js.Iterable[M]]): Collection[K, M] = js.native
    def flatMap[M](
      mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, js.Iterable[M]],
      context: Any
    ): Collection[K, M] = js.native
    /**
      * Flat-maps the Collection, returning a Collection of the same type.
      *
      * Similar to `collection.map(...).flatten(true)`.
      * Used for Dictionaries only.
      */
    @JSName("flatMap")
    def flatMap_KMVM[KM, VM](
      mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, js.Iterable[js.Tuple2[KM, VM]]]
    ): Collection[KM, VM] = js.native
    @JSName("flatMap")
    def flatMap_KMVM[KM, VM](
      mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, js.Iterable[js.Tuple2[KM, VM]]],
      context: Any
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
      * Note: `flatten(true)` operates on Collection<unknown, Collection<K, V>> and
      * returns Collection<K, V>
      */
    def flatten(): Collection[Any, Any] = js.native
    def flatten(depth: Double): Collection[Any, Any] = js.native
    def flatten(shallow: Boolean): Collection[Any, Any] = js.native
    
    // Side effects
    /**
      * The `sideEffect` is executed for every entry in the Collection.
      *
      * Unlike `Array#forEach`, if any call of `sideEffect` returns
      * `false`, the iteration will stop. Returns the number of entries iterated
      * (including the last iteration which returned false).
      */
    def forEach(sideEffect: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Any]): Double = js.native
    def forEach(sideEffect: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Any], context: Any): Double = js.native
    
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
    def getIn(searchKeyPath: js.Iterable[Any]): Any = js.native
    def getIn(searchKeyPath: js.Iterable[Any], notSetValue: Any): Any = js.native
    
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
    def groupBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G]): /*Map*/ Keyed[G, /*this*/ Collection[K, V]] = js.native
    def groupBy[G](grouper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, G], context: Any): /*Map*/ Keyed[G, /*this*/ Collection[K, V]] = js.native
    
    /**
      * True if a key exists within this `Collection`, using `Immutable.is`
      * to determine equality
      */
    def has(key: K): Boolean = js.native
    
    /**
      * True if the result of following a path of keys or indices through nested
      * Collections results in a set value.
      */
    def hasIn(searchKeyPath: js.Iterable[Any]): Boolean = js.native
    
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
    def isSubset(iter: js.Iterable[V]): Boolean = js.native
    
    /**
      * True if this Collection includes every value in `iter`.
      */
    def isSuperset(iter: js.Iterable[V]): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[Any]] = js.native
    
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
    def map(args: scala.Nothing*): Any = js.native
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
    def map[M](mapper: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, M], context: Any): Collection[K, M] = js.native
    
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
      * <!-- runkit:activate -->
      * ```js
      * const { List, } = require('immutable');
      * const l = List([
      *   { name: 'Bob', avgHit: 1 },
      *   { name: 'Max', avgHit: 3 },
      *   { name: 'Lili', avgHit: 2 } ,
      * ]);
      * l.maxBy(i => i.avgHit); // will output { name: 'Max', avgHit: 3 }
      * ```
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
      * <!-- runkit:activate -->
      * ```js
      * const { List, } = require('immutable');
      * const l = List([
      *   { name: 'Bob', avgHit: 1 },
      *   { name: 'Max', avgHit: 3 },
      *   { name: 'Lili', avgHit: 2 } ,
      * ]);
      * l.minBy(i => i.avgHit); // will output { name: 'Bob', avgHit: 1 }
      * ```
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
      context: Any
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
      context: Any
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
      * // List [ "hat", "god" ]
      * ```
      */
    def skipUntil(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): this.type = js.native
    def skipUntil(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): this.type = js.native
    
    /**
      * Returns a new Collection of the same type which includes entries starting
      * from when `predicate` first returns false.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { List } = require('immutable')
      * List([ 'dog', 'frog', 'cat', 'hat', 'god' ])
      *   .skipWhile(x => x.match(/g/))
      * // List [ "cat", "hat", "god" ]
      * ```
      */
    def skipWhile(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): this.type = js.native
    def skipWhile(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): this.type = js.native
    
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
    def slice(begin: Unit, end: Double): this.type = js.native
    
    /**
      * True if `predicate` returns true for any entry in the Collection.
      */
    def some(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean]): Boolean = js.native
    def some(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): Boolean = js.native
    
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
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * const beattles = Map({
      *   John: { name: "Lennon" },
      *   Paul: { name: "McCartney" },
      *   George: { name: "Harrison" },
      *   Ringo: { name: "Starr" },
      * });
      * beattles.sortBy(member => member.name);
      * ```
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
    def takeUntil(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): this.type = js.native
    
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
    def takeWhile(predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, Boolean], context: Any): this.type = js.native
    
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
    def toJS(): js.Array[Any] | StringDictionary[Any] = js.native
    
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
    def toList(): typings.immutable.mod.List[V] = js.native
    
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
    def toObject(): StringDictionary[V] = js.native
    
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
    def toSet(): Set_[V] = js.native
    
    /**
      * Returns a Seq.Set of the values of this Collection, discarding keys.
      */
    def toSetSeq(): Set[V] = js.native
    
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
  /**
    * The `Collection` is a set of (key, value) entries which can be iterated, and
    * is the base class for all collections in `immutable`, allowing them to
    * make use of all the Collection methods (such as `map` and `filter`).
    *
    * Note: A collection is always iterated in the same order, however that order
    * may not always be well defined, as is the case for the `Map` and `Set`.
    *
    * Collection is the abstract base class for concrete data structures. It
    * cannot be constructed directly.
    *
    * Implementations should extend one of the subclasses, `Collection.Keyed`,
    * `Collection.Indexed`, or `Collection.Set`.
    */
  object Collection {
    
    /**
      * Creates a Collection.
      *
      * The type of Collection created is based on the input.
      *
      *   * If an `Collection`, that same `Collection`.
      *   * If an Array-like, an `Collection.Indexed`.
      *   * If an Object with an Iterator defined, an `Collection.Indexed`.
      *   * If an Object, an `Collection.Keyed`.
      *
      * This methods forces the conversion of Objects and Strings to Collections.
      * If you want to ensure that a Collection of one item is returned, use
      * `Seq.of`.
      *
      * Note: An Iterator itself will be treated as an object, becoming a `Seq.Keyed`,
      * which is usually not what you want. You should turn your Iterator Object into
      * an iterable object by defining a Symbol.iterator (or @@iterator) method which
      * returns `this`.
      *
      * Note: `Collection` is a conversion function and not a class, and does not
      * use the `new` keyword during construction.
      */
    inline def apply[I /* <: Collection[Any, Any] */](collection: I): I = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[I]
    inline def apply[T](collection: js.Iterable[T]): typings.immutable.mod.Collection.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.Collection.Indexed[T]]
    inline def apply[T](collection: ArrayLike[T]): typings.immutable.mod.Collection.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.Collection.Indexed[T]]
    inline def apply[V](obj: StringDictionary[V]): typings.immutable.mod.Collection.Keyed[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.Collection.Keyed[String, V]]
    inline def apply[K, V](): Collection[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Collection[K, V]]
    
    @JSImport("immutable", "Collection")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    trait Indexed[T]
      extends StObject
         with Collection[Double, T] {
      
      /**
        * Returns a new Collection with only the values for which the `predicate`
        * function returns true.
        *
        * Note: `filter()` always returns a new instance, even if it results in
        * not filtering out any values.
        */
      @JSName("filter")
      def filter_F_Indexed[F /* <: T */](
        predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean]
      ): typings.immutable.mod.Collection.Indexed[F] = js.native
      @JSName("filter")
      def filter_F_Indexed[F /* <: T */](
        predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean],
        context: Any
      ): typings.immutable.mod.Collection.Indexed[F] = js.native
      
      /**
        * Returns the first index in the Collection where a value satisfies the
        * provided predicate function. Otherwise -1 is returned.
        */
      def findIndex(predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, Boolean]): Double = js.native
      def findIndex(
        predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, Boolean],
        context: Any
      ): Double = js.native
      
      /**
        * Returns the last index in the Collection where a value satisfies the
        * provided predicate function. Otherwise -1 is returned.
        */
      def findLastIndex(predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, Boolean]): Double = js.native
      def findLastIndex(
        predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, Boolean],
        context: Any
      ): Double = js.native
      
      /**
        * If this is a collection of [key, value] entry tuples, it will return a
        * Seq.Keyed of those entries.
        */
      def fromEntrySeq(): typings.immutable.mod.Seq.Keyed[Any, Any] = js.native
      
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
        * // List [ 1, "A", 2, "B", 3, "C" ]
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
        * // List [ 1, "A", "X", 2, "B", "Y" ]
        * ```
        *
        * Since `interleave()` re-indexes values, it produces a complete copy,
        * which has `O(N)` complexity.
        *
        * Note: `interleave` *cannot* be used in `withMutations`.
        */
      def interleave(collections: (Collection[Any, T])*): this.type = js.native
      
      // Combination
      /**
        * Returns a Collection of the same type with `separator` between each item
        * in this Collection.
        */
      def interpose(separator: T): this.type = js.native
      
      @JSName(js.Symbol.iterator)
      var iterator_Indexed: js.Function0[IterableIterator[T]] = js.native
      
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
      
      def zip(collections: (Collection[Any, Any])*): typings.immutable.mod.Collection.Indexed[Any] = js.native
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
      def zip[U](other: Collection[Any, U]): typings.immutable.mod.Collection.Indexed[js.Tuple2[T, U]] = js.native
      def zip[U, V](other: Collection[Any, U], other2: Collection[Any, V]): typings.immutable.mod.Collection.Indexed[js.Tuple3[T, U, V]] = js.native
      
      def zipAll(collections: (Collection[Any, Any])*): typings.immutable.mod.Collection.Indexed[Any] = js.native
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
      def zipAll[U](other: Collection[Any, U]): typings.immutable.mod.Collection.Indexed[js.Tuple2[T, U]] = js.native
      def zipAll[U, V](other: Collection[Any, U], other2: Collection[Any, V]): typings.immutable.mod.Collection.Indexed[js.Tuple3[T, U, V]] = js.native
      
      def zipWith[Z](zipper: js.Function1[/* repeated */ Any, Z], collections: (Collection[Any, Any])*): typings.immutable.mod.Collection.Indexed[Z] = js.native
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
      def zipWith[U, Z](zipper: js.Function2[/* value */ T, /* otherValue */ U, Z], otherCollection: Collection[Any, U]): typings.immutable.mod.Collection.Indexed[Z] = js.native
      def zipWith[U, V, Z](
        zipper: js.Function3[/* value */ T, /* otherValue */ U, /* thirdValue */ V, Z],
        otherCollection: Collection[Any, U],
        thirdCollection: Collection[Any, V]
      ): typings.immutable.mod.Collection.Indexed[Z] = js.native
    }
    object Indexed {
      
      /**
        * Creates a new Collection.Indexed.
        *
        * Note: `Collection.Indexed` is a conversion function and not a class, and
        * does not use the `new` keyword during construction.
        */
      /**
        * Indexed Collections have incrementing numeric keys. They exhibit
        * slightly different behavior than `Collection.Keyed` for some methods in order
        * to better mirror the behavior of JavaScript's `Array`, and add methods
        * which do not make sense on non-indexed Collections such as `indexOf`.
        *
        * Unlike JavaScript arrays, `Collection.Indexed`s are always dense. "Unset"
        * indices and `undefined` indices are indistinguishable, and all indices from
        * 0 to `size` are visited when iterated.
        *
        * All Collection.Indexed methods return re-indexed Collections. In other words,
        * indices always start at 0 and increment until size. If you wish to
        * preserve indices, using them as keys, convert to a Collection.Keyed by
        * calling `toKeyedSeq`.
        */
      inline def apply[T](): typings.immutable.mod.Collection.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")().asInstanceOf[typings.immutable.mod.Collection.Indexed[T]]
      /**
        * Indexed Collections have incrementing numeric keys. They exhibit
        * slightly different behavior than `Collection.Keyed` for some methods in order
        * to better mirror the behavior of JavaScript's `Array`, and add methods
        * which do not make sense on non-indexed Collections such as `indexOf`.
        *
        * Unlike JavaScript arrays, `Collection.Indexed`s are always dense. "Unset"
        * indices and `undefined` indices are indistinguishable, and all indices from
        * 0 to `size` are visited when iterated.
        *
        * All Collection.Indexed methods return re-indexed Collections. In other words,
        * indices always start at 0 and increment until size. If you wish to
        * preserve indices, using them as keys, convert to a Collection.Keyed by
        * calling `toKeyedSeq`.
        */
      inline def apply[T](collection: js.Iterable[T]): typings.immutable.mod.Collection.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(collection.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.Collection.Indexed[T]]
      /**
        * Indexed Collections have incrementing numeric keys. They exhibit
        * slightly different behavior than `Collection.Keyed` for some methods in order
        * to better mirror the behavior of JavaScript's `Array`, and add methods
        * which do not make sense on non-indexed Collections such as `indexOf`.
        *
        * Unlike JavaScript arrays, `Collection.Indexed`s are always dense. "Unset"
        * indices and `undefined` indices are indistinguishable, and all indices from
        * 0 to `size` are visited when iterated.
        *
        * All Collection.Indexed methods return re-indexed Collections. In other words,
        * indices always start at 0 and increment until size. If you wish to
        * preserve indices, using them as keys, convert to a Collection.Keyed by
        * calling `toKeyedSeq`.
        */
      inline def apply[T](collection: ArrayLike[T]): typings.immutable.mod.Collection.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(collection.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.Collection.Indexed[T]]
    }
    
    @js.native
    trait Keyed[K, V]
      extends StObject
         with Collection[K, V] {
      
      /**
        * Returns a new Collection with other collections concatenated to this one.
        */
      @JSName("concat")
      def concat_KCVC[KC, VC](collections: (js.Iterable[js.Tuple2[KC, VC]])*): typings.immutable.mod.Collection.Keyed[K | KC, V | VC] = js.native
      
      /**
        * Returns a new Collection with only the values for which the `predicate`
        * function returns true.
        *
        * Note: `filter()` always returns a new instance, even if it results in
        * not filtering out any values.
        */
      @JSName("filter")
      def filter_F_Keyed[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): typings.immutable.mod.Collection.Keyed[K, F] = js.native
      @JSName("filter")
      def filter_F_Keyed[F /* <: V */](
        predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
        context: Any
      ): typings.immutable.mod.Collection.Keyed[K, F] = js.native
      
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
      def flip(): typings.immutable.mod.Collection.Keyed[V, K] = js.native
      
      @JSName(js.Symbol.iterator)
      var iterator_Keyed: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
      
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
        *
        * If the mapper function returns `undefined`, then the entry will be filtered
        */
      def mapEntries[KM, VM](
        mapper: js.Function3[
              /* entry */ js.Tuple2[K, V], 
              /* index */ Double, 
              /* iter */ this.type, 
              js.UndefOr[js.Tuple2[KM, VM]]
            ]
      ): typings.immutable.mod.Collection.Keyed[KM, VM] = js.native
      def mapEntries[KM, VM](
        mapper: js.Function3[
              /* entry */ js.Tuple2[K, V], 
              /* index */ Double, 
              /* iter */ this.type, 
              js.UndefOr[js.Tuple2[KM, VM]]
            ],
        context: Any
      ): typings.immutable.mod.Collection.Keyed[KM, VM] = js.native
      
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
      def mapKeys[M](mapper: js.Function3[/* key */ K, /* value */ V, /* iter */ this.type, M]): typings.immutable.mod.Collection.Keyed[M, V] = js.native
      def mapKeys[M](mapper: js.Function3[/* key */ K, /* value */ V, /* iter */ this.type, M], context: Any): typings.immutable.mod.Collection.Keyed[M, V] = js.native
    }
    object Keyed {
      
      /**
        * Keyed Collections have discrete keys tied to each value.
        *
        * When iterating `Collection.Keyed`, each iteration will yield a `[K, V]`
        * tuple, in other words, `Collection#entries` is the default iterator for
        * Keyed Collections.
        */
      inline def apply[V](obj: StringDictionary[V]): typings.immutable.mod.Collection.Keyed[String, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.Collection.Keyed[String, V]]
      /**
        * Creates a Collection.Keyed
        *
        * Similar to `Collection()`, however it expects collection-likes of [K, V]
        * tuples if not constructed from a Collection.Keyed or JS Object.
        *
        * Note: `Collection.Keyed` is a conversion function and not a class, and
        * does not use the `new` keyword during construction.
        */
      /**
        * Keyed Collections have discrete keys tied to each value.
        *
        * When iterating `Collection.Keyed`, each iteration will yield a `[K, V]`
        * tuple, in other words, `Collection#entries` is the default iterator for
        * Keyed Collections.
        */
      inline def apply[K, V](): typings.immutable.mod.Collection.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")().asInstanceOf[typings.immutable.mod.Collection.Keyed[K, V]]
      /**
        * Keyed Collections have discrete keys tied to each value.
        *
        * When iterating `Collection.Keyed`, each iteration will yield a `[K, V]`
        * tuple, in other words, `Collection#entries` is the default iterator for
        * Keyed Collections.
        */
      inline def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): typings.immutable.mod.Collection.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(collection.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.Collection.Keyed[K, V]]
    }
    
    @js.native
    trait Set[T]
      extends StObject
         with Collection[T, T] {
      
      /**
        * Returns a new Collection with only the values for which the `predicate`
        * function returns true.
        *
        * Note: `filter()` always returns a new instance, even if it results in
        * not filtering out any values.
        */
      @JSName("filter")
      def filter_F_Set[F /* <: T */](predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean]): typings.immutable.mod.Collection.Set[F] = js.native
      @JSName("filter")
      def filter_F_Set[F /* <: T */](
        predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean],
        context: Any
      ): typings.immutable.mod.Collection.Set[F] = js.native
      
      @JSName(js.Symbol.iterator)
      var iterator_Set: js.Function0[IterableIterator[T]] = js.native
    }
    object Set {
      
      /**
        * Similar to `Collection()`, but always returns a Collection.Set.
        *
        * Note: `Collection.Set` is a factory function and not a class, and does
        * not use the `new` keyword during construction.
        */
      /**
        * Set Collections only represent values. They have no associated keys or
        * indices. Duplicate values are possible in the lazy `Seq.Set`s, however
        * the concrete `Set` Collection does not allow duplicate values.
        *
        * Collection methods on Collection.Set such as `map` and `forEach` will provide
        * the value as both the first and second arguments to the provided function.
        *
        * ```js
        * const { Collection } = require('immutable')
        * const seq = Collection.Set([ 'A', 'B', 'C' ])
        * // Seq { "A", "B", "C" }
        * seq.forEach((v, k) =>
        *  assert.equal(v, k)
        * )
        * ```
        */
      inline def apply[T](): typings.immutable.mod.Collection.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")().asInstanceOf[typings.immutable.mod.Collection.Set[T]]
      /**
        * Set Collections only represent values. They have no associated keys or
        * indices. Duplicate values are possible in the lazy `Seq.Set`s, however
        * the concrete `Set` Collection does not allow duplicate values.
        *
        * Collection methods on Collection.Set such as `map` and `forEach` will provide
        * the value as both the first and second arguments to the provided function.
        *
        * ```js
        * const { Collection } = require('immutable')
        * const seq = Collection.Set([ 'A', 'B', 'C' ])
        * // Seq { "A", "B", "C" }
        * seq.forEach((v, k) =>
        *  assert.equal(v, k)
        * )
        * ```
        */
      inline def apply[T](collection: js.Iterable[T]): typings.immutable.mod.Collection.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(collection.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.Collection.Set[T]]
      /**
        * Set Collections only represent values. They have no associated keys or
        * indices. Duplicate values are possible in the lazy `Seq.Set`s, however
        * the concrete `Set` Collection does not allow duplicate values.
        *
        * Collection methods on Collection.Set such as `map` and `forEach` will provide
        * the value as both the first and second arguments to the provided function.
        *
        * ```js
        * const { Collection } = require('immutable')
        * const seq = Collection.Set([ 'A', 'B', 'C' ])
        * // Seq { "A", "B", "C" }
        * seq.forEach((v, k) =>
        *  assert.equal(v, k)
        * )
        * ```
        */
      inline def apply[T](collection: ArrayLike[T]): typings.immutable.mod.Collection.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(collection.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.Collection.Set[T]]
    }
    
    /**
      * @deprecated use `const { isAssociative } = require('immutable')`
      */
    inline def isAssociative(maybeAssociative: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssociative")(maybeAssociative.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * @deprecated use `const { isIndexed } = require('immutable')`
      */
    inline def isIndexed(maybeIndexed: Any): /* is immutable.immutable.Collection.Indexed<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(maybeIndexed.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Collection.Indexed<unknown> */ Boolean]
    
    /**
      * @deprecated use `const { isKeyed } = require('immutable')`
      */
    inline def isKeyed(maybeKeyed: Any): /* is immutable.immutable.Collection.Keyed<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyed")(maybeKeyed.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Collection.Keyed<unknown, unknown> */ Boolean]
    
    /**
      * @deprecated use `const { isOrdered } = require('immutable')`
      */
    inline def isOrdered(maybeOrdered: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrdered")(maybeOrdered.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  trait List[T]
    extends StObject
       with typings.immutable.mod.Collection.Indexed[T] {
    
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
    def clear(): typings.immutable.mod.List[T] = js.native
    
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
    def delete(index: Double): typings.immutable.mod.List[T] = js.native
    
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
    def deleteIn(keyPath: js.Iterable[Any]): this.type = js.native
    
    /**
      * Returns a new List with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_List[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean]
    ): typings.immutable.mod.List[F] = js.native
    @JSName("filter")
    def filter_F_List[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean],
      context: Any
    ): typings.immutable.mod.List[F] = js.native
    
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
    def insert(index: Double, value: T): typings.immutable.mod.List[T] = js.native
    
    def merge[C](collections: js.Iterable[C]*): typings.immutable.mod.List[T | C] = js.native
    
    /**
      * Note: `mergeDeepIn` can be used in `withMutations`.
      *
      * @see `Map#mergeDeepIn`
      */
    def mergeDeepIn(keyPath: js.Iterable[Any], collections: Any*): this.type = js.native
    
    /**
      * Note: `mergeIn` can be used in `withMutations`.
      *
      * @see `Map#mergeIn`
      */
    def mergeIn(keyPath: js.Iterable[Any], collections: Any*): this.type = js.native
    
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
    def pop(): typings.immutable.mod.List[T] = js.native
    
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
    def push(values: T*): typings.immutable.mod.List[T] = js.native
    
    def remove(index: Double): typings.immutable.mod.List[T] = js.native
    
    def removeIn(keyPath: js.Iterable[Any]): this.type = js.native
    
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
    def set(index: Double, value: T): typings.immutable.mod.List[T] = js.native
    
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
    def setIn(keyPath: js.Iterable[Any], value: Any): this.type = js.native
    
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
    def setSize(size: Double): typings.immutable.mod.List[T] = js.native
    
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
    def shift(): typings.immutable.mod.List[T] = js.native
    
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
    def unshift(values: T*): typings.immutable.mod.List[T] = js.native
    
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
    def update(index: Double, updater: js.Function1[/* value */ js.UndefOr[T], T]): this.type = js.native
    
    /**
      * Note: `updateIn` can be used in `withMutations`.
      *
      * @see `Map#updateIn`
      */
    def updateIn(keyPath: js.Iterable[Any], notSetValue: Any, updater: js.Function1[/* value */ Any, Any]): this.type = js.native
    def updateIn(keyPath: js.Iterable[Any], updater: js.Function1[/* value */ Any, Any]): this.type = js.native
    
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
    def withMutations(mutator: js.Function1[/* mutable */ this.type, Any]): this.type = js.native
  }
  /**
    * Lists are ordered indexed dense collections, much like a JavaScript
    * Array.
    *
    * Lists are immutable and fully persistent with O(log32 N) gets and sets,
    * and O(1) push and pop.
    *
    * Lists implement Deque, with efficient addition and removal from both the
    * end (`push`, `pop`) and beginning (`unshift`, `shift`).
    *
    * Unlike a JavaScript Array, there is no distinction between an
    * "unset" index and an index set to `undefined`. `List#forEach` visits all
    * indices from 0 to size, regardless of whether they were explicitly defined.
    */
  object List {
    
    /**
      * Create a new immutable List containing the values of the provided
      * collection-like.
      *
      * Note: `List` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { List, Set } = require('immutable')
      *
      * const emptyList = List()
      * // List []
      *
      * const plainArray = [ 1, 2, 3, 4 ]
      * const listFromPlainArray = List(plainArray)
      * // List [ 1, 2, 3, 4 ]
      *
      * const plainSet = Set([ 1, 2, 3, 4 ])
      * const listFromPlainSet = List(plainSet)
      * // List [ 1, 2, 3, 4 ]
      *
      * const arrayIterator = plainArray[Symbol.iterator]()
      * const listFromCollectionArray = List(arrayIterator)
      * // List [ 1, 2, 3, 4 ]
      *
      * listFromPlainArray.equals(listFromCollectionArray) // true
      * listFromPlainSet.equals(listFromCollectionArray) // true
      * listFromPlainSet.equals(listFromPlainArray) // true
      * ```
      */
    inline def apply[T](): typings.immutable.mod.List[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.immutable.mod.List[T]]
    inline def apply[T](collection: js.Iterable[T]): typings.immutable.mod.List[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.List[T]]
    inline def apply[T](collection: ArrayLike[T]): typings.immutable.mod.List[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[typings.immutable.mod.List[T]]
    
    @JSImport("immutable", "List")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def isList(maybeList: Any): /* is immutable.immutable.List<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isList")(maybeList.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.List<unknown> */ Boolean]
    
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
    inline def of[T](values: T*): typings.immutable.mod.List[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[typings.immutable.mod.List[T]]
  }
  
  @js.native
  trait Map[K, V]
    extends StObject
       with typings.immutable.mod.Collection.Keyed[K, V] {
    
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
    def deleteAll(keys: js.Iterable[K]): this.type = js.native
    
    /**
      * Returns a new Map having removed the value at this `keyPath`. If any keys
      * in `keyPath` do not exist, no change will occur.
      *
      * Note: `deleteIn` can be used in `withMutations`.
      *
      * @alias removeIn
      */
    def deleteIn(keyPath: js.Iterable[Any]): this.type = js.native
    
    /**
      * Returns a new Map with only the entries for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_Map[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): Map[K, F] = js.native
    @JSName("filter")
    def filter_F_Map[F /* <: V */](
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
      context: Any
    ): Map[K, F] = js.native
    
    def merge[C](collections: StringDictionary[C]*): Map[K | String, V | C] = js.native
    
    /**
      * Like `merge()`, but when two compatible collections are encountered with
      * the same key, it merges them as well, recursing deeply through the nested
      * data. Two collections are considered to be compatible (and thus will be
      * merged together) if they both fall into one of three categories: keyed
      * (e.g., `Map`s, `Record`s, and objects), indexed (e.g., `List`s and
      * arrays), or set-like (e.g., `Set`s). If they fall into separate
      * categories, `mergeDeep` will replace the existing collection with the
      * collection being merged in. This behavior can be customized by using
      * `mergeDeepWith()`.
      *
      * Note: Indexed and set-like collections are merged using
      * `concat()`/`union()` and therefore do not recurse.
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
    def mergeDeep(collections: ((js.Iterable[js.Tuple2[K, V]]) | StringDictionary[V])*): this.type = js.native
    
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
    def mergeDeepIn(keyPath: js.Iterable[Any], collections: Any*): this.type = js.native
    
    /**
      * Like `mergeDeep()`, but when two non-collections or incompatible
      * collections are encountered at the same key, it uses the `merger`
      * function to determine the resulting value. Collections are considered
      * incompatible if they fall into separate categories between keyed,
      * indexed, and set-like.
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
      *
      * Note: `mergeDeepWith` can be used in `withMutations`.
      */
    def mergeDeepWith(
      merger: js.Function3[/* oldVal */ Any, /* newVal */ Any, /* key */ Any, Any],
      collections: ((js.Iterable[js.Tuple2[K, V]]) | StringDictionary[V])*
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
    def mergeIn(keyPath: js.Iterable[Any], collections: Any*): this.type = js.native
    
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
      collections: ((js.Iterable[js.Tuple2[K, V]]) | StringDictionary[V])*
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
    def merge_KCVC[KC, VC](collections: (js.Iterable[js.Tuple2[KC, VC]])*): Map[K | KC, V | VC] = js.native
    
    def remove(key: K): this.type = js.native
    
    def removeAll(keys: js.Iterable[K]): this.type = js.native
    
    def removeIn(keyPath: js.Iterable[Any]): this.type = js.native
    
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
    def setIn(keyPath: js.Iterable[Any], value: Any): this.type = js.native
    
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
    def update(key: K, updater: js.Function1[/* value */ js.UndefOr[V], V]): this.type = js.native
    
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
    def updateIn(keyPath: js.Iterable[Any], notSetValue: Any, updater: js.Function1[/* value */ Any, Any]): this.type = js.native
    def updateIn(keyPath: js.Iterable[Any], updater: js.Function1[/* value */ Any, Any]): this.type = js.native
    
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
    def withMutations(mutator: js.Function1[/* mutable */ this.type, Any]): this.type = js.native
  }
  /**
    * Immutable Map is an unordered Collection.Keyed of (key, value) pairs with
    * `O(log32 N)` gets and `O(log32 N)` persistent sets.
    *
    * Iteration order of a Map is undefined, however is stable. Multiple
    * iterations of the same Map will iterate in the same order.
    *
    * Map's keys can be of any type, and use `Immutable.is` to determine key
    * equality. This allows the use of any value (including NaN) as a key.
    *
    * Because `Immutable.is` returns equality based on value semantics, and
    * Immutable collections are treated as values, any Immutable collection may
    * be used as a key.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map, List } = require('immutable');
    * Map().set(List([ 1 ]), 'listofone').get(List([ 1 ]));
    * // 'listofone'
    * ```
    *
    * Any JavaScript object may be used as a key, however strict identity is used
    * to evaluate key equality. Two similar looking objects will represent two
    * different keys.
    *
    * Implemented by a hash-array mapped trie.
    */
  object Map {
    
    inline def apply[V](obj: StringDictionary[V]): Map[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Map[String, V]]
    /**
      * Creates a new Immutable Map.
      *
      * Created with the same key value pairs as the provided Collection.Keyed or
      * JavaScript Object or expects a Collection of [K, V] tuple entries.
      *
      * Note: `Map` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * Map({ key: "value" })
      * Map([ [ "key", "value" ] ])
      * ```
      *
      * Keep in mind, when using JS objects to construct Immutable Maps, that
      * JavaScript Object properties are always strings, even if written in a
      * quote-less shorthand, while Immutable Maps accept keys of any type.
      *
      * <!-- runkit:activate
      *      { "preamble": "const { Map } = require('immutable');" }
      * -->
      * ```js
      * let obj = { 1: "one" }
      * Object.keys(obj) // [ "1" ]
      * assert.equal(obj["1"], obj[1]) // "one" === "one"
      *
      * let map = Map(obj)
      * assert.notEqual(map.get("1"), map.get(1)) // "one" !== undefined
      * ```
      *
      * Property access for JavaScript Objects first converts the key to a string,
      * but since Immutable Map keys can be of any type the argument to `get()` is
      * not altered.
      */
    inline def apply[K, V](): Map[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Map[K, V]]
    inline def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Map[K, V]]
    inline def apply[K /* <: String | js.Symbol */, V](
      obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]:? V}
      */ typings.immutable.immutableStrings.^ & TopLevel[Any]
    ): Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Map[K, V]]
    
    @JSImport("immutable", "Map")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def isMap(maybeMap: Any): /* is immutable.immutable.Map<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(maybeMap.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Map<unknown, unknown> */ Boolean]
    
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
    inline def of(keyValues: Any*): Map[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(keyValues.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[Map[Any, Any]]
  }
  
  @js.native
  trait OrderedMap[K, V]
    extends StObject
       with Map[K, V] {
    
    /**
      * Returns a new OrderedMap with only the entries for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_OrderedMap[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): OrderedMap[K, F] = js.native
    @JSName("filter")
    def filter_F_OrderedMap[F /* <: V */](
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
      context: Any
    ): OrderedMap[K, F] = js.native
  }
  /**
    * A type of Map that has the additional guarantee that the iteration order of
    * entries will be the order in which they were set().
    *
    * The iteration behavior of OrderedMap is the same as native ES6 Map and
    * JavaScript Object.
    *
    * Note that `OrderedMap` are more expensive than non-ordered `Map` and may
    * consume more memory. `OrderedMap#set` is amortized O(log32 N), but not
    * stable.
    */
  object OrderedMap {
    
    inline def apply[V](obj: StringDictionary[V]): OrderedMap[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[String, V]]
    /**
      * Creates a new Immutable OrderedMap.
      *
      * Created with the same key value pairs as the provided Collection.Keyed or
      * JavaScript Object or expects a Collection of [K, V] tuple entries.
      *
      * The iteration order of key-value pairs provided to this constructor will
      * be preserved in the OrderedMap.
      *
      *     let newOrderedMap = OrderedMap({key: "value"})
      *     let newOrderedMap = OrderedMap([["key", "value"]])
      *
      * Note: `OrderedMap` is a factory function and not a class, and does not use
      * the `new` keyword during construction.
      */
    inline def apply[K, V](): OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[OrderedMap[K, V]]
    inline def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[K, V]]
    
    @JSImport("immutable", "OrderedMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * True if the provided value is an OrderedMap.
      */
    inline def isOrderedMap(maybeOrderedMap: Any): /* is immutable.immutable.OrderedMap<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrderedMap")(maybeOrderedMap.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.OrderedMap<unknown, unknown> */ Boolean]
  }
  
  @js.native
  trait OrderedSet[T]
    extends StObject
       with Set_[T] {
    
    /**
      * Returns a new OrderedSet with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_OrderedSet[F /* <: T */](predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean]): OrderedSet[F] = js.native
    @JSName("filter")
    def filter_F_OrderedSet[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean],
      context: Any
    ): OrderedSet[F] = js.native
    
    def zip(collections: (Collection[Any, Any])*): OrderedSet[Any] = js.native
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
    def zip[U](other: Collection[Any, U]): OrderedSet[js.Tuple2[T, U]] = js.native
    def zip[U, V](other1: Collection[Any, U], other2: Collection[Any, V]): OrderedSet[js.Tuple3[T, U, V]] = js.native
    
    def zipAll(collections: (Collection[Any, Any])*): OrderedSet[Any] = js.native
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
    def zipAll[U](other: Collection[Any, U]): OrderedSet[js.Tuple2[T, U]] = js.native
    def zipAll[U, V](other1: Collection[Any, U], other2: Collection[Any, V]): OrderedSet[js.Tuple3[T, U, V]] = js.native
    
    def zipWith[Z](zipper: js.Function1[/* repeated */ Any, Z], collections: (Collection[Any, Any])*): OrderedSet[Z] = js.native
    /**
      * Returns an OrderedSet of the same type "zipped" with the provided
      * collections by using a custom `zipper` function.
      *
      * @see Seq.Indexed.zipWith
      */
    def zipWith[U, Z](zipper: js.Function2[/* value */ T, /* otherValue */ U, Z], otherCollection: Collection[Any, U]): OrderedSet[Z] = js.native
    def zipWith[U, V, Z](
      zipper: js.Function3[/* value */ T, /* otherValue */ U, /* thirdValue */ V, Z],
      otherCollection: Collection[Any, U],
      thirdCollection: Collection[Any, V]
    ): OrderedSet[Z] = js.native
  }
  /**
    * A type of Set that has the additional guarantee that the iteration order of
    * values will be the order in which they were `add`ed.
    *
    * The iteration behavior of OrderedSet is the same as native ES6 Set.
    *
    * Note that `OrderedSet` are more expensive than non-ordered `Set` and may
    * consume more memory. `OrderedSet#add` is amortized O(log32 N), but not
    * stable.
    */
  object OrderedSet {
    
    /**
      * Create a new immutable OrderedSet containing the values of the provided
      * collection-like.
      *
      * Note: `OrderedSet` is a factory function and not a class, and does not use
      * the `new` keyword during construction.
      */
    inline def apply[T](): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[OrderedSet[T]]
    inline def apply[T](collection: js.Iterable[T]): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[T]]
    inline def apply[T](collection: ArrayLike[T]): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[T]]
    
    @JSImport("immutable", "OrderedSet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromKeys(obj: StringDictionary[Any]): OrderedSet[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[String]]
    /**
      * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
      * the keys from this Collection or JavaScript Object.
      */
    inline def fromKeys[T](iter: Collection[T, Any]): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(iter.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[T]]
    
    /**
      * True if the provided value is an OrderedSet.
      */
    inline def isOrderedSet(maybeOrderedSet: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrderedSet")(maybeOrderedSet.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Creates a new OrderedSet containing `values`.
      */
    inline def of[T](values: T*): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[OrderedSet[T]]
  }
  
  /**
    * Returns a Seq.Indexed of numbers from `start` (inclusive) to `end`
    * (exclusive), by `step`, where `start` defaults to 0, `step` to 1, and `end` to
    * infinity. When `start` is equal to `end`, returns empty range.
    *
    * Note: `Range` is a factory function and not a class, and does not use the
    * `new` keyword during construction.
    *
    * ```js
    * const { Range } = require('immutable')
    * Range() // [ 0, 1, 2, 3, ... ]
    * Range(10) // [ 10, 11, 12, 13, ... ]
    * Range(10, 15) // [ 10, 11, 12, 13, 14 ]
    * Range(10, 30, 5) // [ 10, 15, 20, 25 ]
    * Range(30, 10, 5) // [ 30, 25, 20, 15 ]
    * Range(30, 30, 5) // []
    * ```
    */
  inline def Range(): Indexed[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("Range")().asInstanceOf[Indexed[Double]]
  inline def Range(start: Double): Indexed[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any]).asInstanceOf[Indexed[Double]]
  inline def Range(start: Double, end: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  inline def Range(start: Double, end: Double, step: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  inline def Range(start: Double, end: Unit, step: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  inline def Range(start: Unit, end: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  inline def Range(start: Unit, end: Double, step: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  inline def Range(start: Unit, end: Unit, step: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  
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
    def deleteIn(keyPath: js.Iterable[Any]): this.type = js.native
    
    /**
      * Returns the value associated with the provided key, which may be the
      * default value defined when creating the Record factory function.
      *
      * If the requested key is not defined by this Record type, then
      * notSetValue will be returned if provided. Note that this scenario would
      * produce an error when using Flow or TypeScript.
      */
    def get[K /* <: /* keyof TProps */ String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
    def get[K /* <: /* keyof TProps */ String */](key: K, notSetValue: Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
    def get[T](key: String, notSetValue: T): T = js.native
    
    def getIn(keyPath: js.Iterable[Any]): Any = js.native
    
    // Reading values
    def has(key: String): Boolean = js.native
    
    // Reading deep values
    def hasIn(keyPath: js.Iterable[Any]): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[
        IterableIterator[
          js.Tuple2[
            /* keyof TProps */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: TProps[keyof TProps] */ js.Any
          ]
        ]
      ] = js.native
    
    def merge(collections: (Partial[TProps] | (js.Iterable[js.Tuple2[String, Any]]))*): this.type = js.native
    
    def mergeDeep(collections: (Partial[TProps] | (js.Iterable[js.Tuple2[String, Any]]))*): this.type = js.native
    
    def mergeDeepIn(keyPath: js.Iterable[Any], collections: Any*): this.type = js.native
    
    def mergeDeepWith(
      merger: js.Function3[/* oldVal */ Any, /* newVal */ Any, /* key */ Any, Any],
      collections: (Partial[TProps] | (js.Iterable[js.Tuple2[String, Any]]))*
    ): this.type = js.native
    
    def mergeIn(keyPath: js.Iterable[Any], collections: Any*): this.type = js.native
    
    def mergeWith(
      merger: js.Function3[/* oldVal */ Any, /* newVal */ Any, /* keyof TProps */ /* key */ String, Any],
      collections: (Partial[TProps] | (js.Iterable[js.Tuple2[String, Any]]))*
    ): this.type = js.native
    
    def remove[K /* <: /* keyof TProps */ String */](key: K): this.type = js.native
    
    def removeIn(keyPath: js.Iterable[Any]): this.type = js.native
    
    // Persistent changes
    def set[K /* <: /* keyof TProps */ String */](
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ): this.type = js.native
    
    // Deep persistent changes
    def setIn(keyPath: js.Iterable[Any], value: Any): this.type = js.native
    
    // Conversion to JavaScript types
    /**
      * Deeply converts this Record to equivalent native JavaScript Object.
      *
      * Note: This method may not be overridden. Objects with custom
      * serialization to plain JS may override toJSON() instead.
      */
    def toJS(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof TProps ]: unknown}
      */ typings.immutable.immutableStrings.Record & TopLevel[Any] = js.native
    
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
    
    def updateIn(keyPath: js.Iterable[Any], updater: js.Function1[/* value */ Any, Any]): this.type = js.native
    
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
    def withMutations(mutator: js.Function1[/* mutable */ this.type, Any]): this.type = js.native
  }
  /**
    * A record is similar to a JS object, but enforces a specific set of allowed
    * string keys, and has default values.
    *
    * The `Record()` function produces new Record Factories, which when called
    * create Record instances.
    *
    * ```js
    * const { Record } = require('immutable')
    * const ABRecord = Record({ a: 1, b: 2 })
    * const myRecord = ABRecord({ b: 3 })
    * ```
    *
    * Records always have a value for the keys they define. `remove`ing a key
    * from a record simply resets it to the default value for that key.
    *
    * ```js
    * myRecord.get('a') // 1
    * myRecord.get('b') // 3
    * const myRecordWithoutB = myRecord.remove('b')
    * myRecordWithoutB.get('b') // 2
    * ```
    *
    * Values provided to the constructor not found in the Record type will
    * be ignored. For example, in this case, ABRecord is provided a key "x" even
    * though only "a" and "b" have been defined. The value for "x" will be
    * ignored for this record.
    *
    * ```js
    * const myRecord = ABRecord({ b: 3, x: 10 })
    * myRecord.get('x') // undefined
    * ```
    *
    * Because Records have a known set of string keys, property get access works
    * as expected, however property sets will throw an Error.
    *
    * Note: IE8 does not support property access. Only use `get()` when
    * supporting IE8.
    *
    * ```js
    * myRecord.b // 3
    * myRecord.b = 5 // throws Error
    * ```
    *
    * Record Types can be extended as well, allowing for custom methods on your
    * Record. This is not a common pattern in functional environments, but is in
    * many JS programs.
    *
    * However Record Types are more restricted than typical JavaScript classes.
    * They do not use a class constructor, which also means they cannot use
    * class properties (since those are technically part of a constructor).
    *
    * While Record Types can be syntactically created with the JavaScript `class`
    * form, the resulting Record function is actually a factory function, not a
    * class constructor. Even though Record Types are not classes, JavaScript
    * currently requires the use of `new` when creating new Record instances if
    * they are defined as a `class`.
    *
    * ```
    * class ABRecord extends Record({ a: 1, b: 2 }) {
    *   getAB() {
    *     return this.a + this.b;
    *   }
    * }
    *
    * var myRecord = new ABRecord({b: 3})
    * myRecord.getAB() // 4
    * ```
    *
    *
    * **Flow Typing Records:**
    *
    * Immutable.js exports two Flow types designed to make it easier to use
    * Records with flow typed code, `RecordOf<TProps>` and `RecordFactory<TProps>`.
    *
    * When defining a new kind of Record factory function, use a flow type that
    * describes the values the record contains along with `RecordFactory<TProps>`.
    * To type instances of the Record (which the factory function returns),
    * use `RecordOf<TProps>`.
    *
    * Typically, new Record definitions will export both the Record factory
    * function as well as the Record instance type for use in other code.
    *
    * ```js
    * import type { RecordFactory, RecordOf } from 'immutable';
    *
    * // Use RecordFactory<TProps> for defining new Record factory functions.
    * type Point3DProps = { x: number, y: number, z: number };
    * const defaultValues: Point3DProps = { x: 0, y: 0, z: 0 };
    * const makePoint3D: RecordFactory<Point3DProps> = Record(defaultValues);
    * export makePoint3D;
    *
    * // Use RecordOf<T> for defining new instances of that Record.
    * export type Point3D = RecordOf<Point3DProps>;
    * const some3DPoint: Point3D = makePoint3D({ x: 10, y: 20, z: 30 });
    * ```
    *
    * **Flow Typing Record Subclasses:**
    *
    * Records can be subclassed as a means to add additional methods to Record
    * instances. This is generally discouraged in favor of a more functional API,
    * since Subclasses have some minor overhead. However the ability to create
    * a rich API on Record types can be quite valuable.
    *
    * When using Flow to type Subclasses, do not use `RecordFactory<TProps>`,
    * instead apply the props type when subclassing:
    *
    * ```js
    * type PersonProps = {name: string, age: number};
    * const defaultValues: PersonProps = {name: 'Aristotle', age: 2400};
    * const PersonRecord = Record(defaultValues);
    * class Person extends PersonRecord<PersonProps> {
    *   getName(): string {
    *     return this.get('name')
    *   }
    *
    *   setName(name: string): this {
    *     return this.set('name', name);
    *   }
    * }
    * ```
    *
    * **Choosing Records vs plain JavaScript objects**
    *
    * Records offer a persistently immutable alternative to plain JavaScript
    * objects, however they're not required to be used within Immutable.js
    * collections. In fact, the deep-access and deep-updating functions
    * like `getIn()` and `setIn()` work with plain JavaScript Objects as well.
    *
    * Deciding to use Records or Objects in your application should be informed
    * by the tradeoffs and relative benefits of each:
    *
    * - *Runtime immutability*: plain JS objects may be carefully treated as
    *   immutable, however Record instances will *throw* if attempted to be
    *   mutated directly. Records provide this additional guarantee, however at
    *   some marginal runtime cost. While JS objects are mutable by nature, the
    *   use of type-checking tools like [Flow](https://medium.com/@gcanti/immutability-with-flow-faa050a1aef4)
    *   can help gain confidence in code written to favor immutability.
    *
    * - *Value equality*: Records use value equality when compared with `is()`
    *   or `record.equals()`. That is, two Records with the same keys and values
    *   are equal. Plain objects use *reference equality*. Two objects with the
    *   same keys and values are not equal since they are different objects.
    *   This is important to consider when using objects as keys in a `Map` or
    *   values in a `Set`, which use equality when retrieving values.
    *
    * - *API methods*: Records have a full featured API, with methods like
    *   `.getIn()`, and `.equals()`. These can make working with these values
    *   easier, but comes at the cost of not allowing keys with those names.
    *
    * - *Default values*: Records provide default values for every key, which
    *   can be useful when constructing Records with often unchanging values.
    *   However default values can make using Flow and TypeScript more laborious.
    *
    * - *Serialization*: Records use a custom internal representation to
    *   efficiently store and update their values. Converting to and from this
    *   form isn't free. If converting Records to plain objects is common,
    *   consider sticking with plain objects to begin with.
    */
  object Record {
    
    /**
      * Unlike other types in Immutable.js, the `Record()` function creates a new
      * Record Factory, which is a function that creates Record instances.
      *
      * See above for examples of using `Record()`.
      *
      * Note: `Record` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      */
    inline def apply[TProps /* <: js.Object */](defaultValues: TProps): Factory[TProps] = ^.asInstanceOf[js.Dynamic].apply(defaultValues.asInstanceOf[js.Any]).asInstanceOf[Factory[TProps]]
    inline def apply[TProps /* <: js.Object */](defaultValues: TProps, name: String): Factory[TProps] = (^.asInstanceOf[js.Dynamic].apply(defaultValues.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Factory[TProps]]
    
    @JSImport("immutable", "Record")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    trait Factory[TProps /* <: js.Object */]
      extends StObject
         with Instantiable0[Record[TProps] & TProps]
         with Instantiable1[
              (/* values */ js.Iterable[js.Tuple2[String, Any]]) | (/* values */ Partial[TProps]), 
              Record[TProps] & TProps
            ] {
      
      def apply(): Record[TProps] & TProps = js.native
      def apply(values: js.Iterable[js.Tuple2[String, Any]]): Record[TProps] & TProps = js.native
      def apply(values: Partial[TProps]): Record[TProps] & TProps = js.native
      
      /**
        * The name provided to `Record(values, name)` can be accessed with
        * `displayName`.
        */
      var displayName: String = js.native
    }
    object Factory {
      
      /**
        * A Record.Factory is created by the `Record()` function. Record instances
        * are created by passing it some of the accepted values for that Record
        * type:
        *
        * <!-- runkit:activate
        *      { "preamble": "const { Record } = require('immutable')" }
        * -->
        * ```js
        * // makePerson is a Record Factory function
        * const makePerson = Record({ name: null, favoriteColor: 'unknown' });
        *
        * // alan is a Record instance
        * const alan = makePerson({ name: 'Alan' });
        * ```
        *
        * Note that Record Factories return `Record<TProps> & Readonly<TProps>`,
        * this allows use of both the Record instance API, and direct property
        * access on the resulting instances:
        *
        * <!-- runkit:activate
        *      { "preamble": "const { Record } = require('immutable');const makePerson = Record({ name: null, favoriteColor: 'unknown' });const alan = makePerson({ name: 'Alan' });" }
        * -->
        * ```js
        * // Use the Record API
        * console.log('Record API: ' + alan.get('name'))
        *
        * // Or direct property access (Readonly)
        * console.log('property access: ' + alan.name)
        * ```
        *
        * **Flow Typing Records:**
        *
        * Use the `RecordFactory<TProps>` Flow type to get high quality type checking of
        * Records:
        *
        * ```js
        * import type { RecordFactory, RecordOf } from 'immutable';
        *
        * // Use RecordFactory<TProps> for defining new Record factory functions.
        * type PersonProps = { name: ?string, favoriteColor: string };
        * const makePerson: RecordFactory<PersonProps> = Record({ name: null, favoriteColor: 'unknown' });
        *
        * // Use RecordOf<T> for defining new instances of that Record.
        * type Person = RecordOf<PersonProps>;
        * const alan: Person = makePerson({ name: 'Alan' });
        * ```
        */
      inline def apply[TProps /* <: js.Object */](): Record[TProps] & TProps = ^.asInstanceOf[js.Dynamic].applyDynamic("Factory")().asInstanceOf[Record[TProps] & TProps]
      /**
        * A Record.Factory is created by the `Record()` function. Record instances
        * are created by passing it some of the accepted values for that Record
        * type:
        *
        * <!-- runkit:activate
        *      { "preamble": "const { Record } = require('immutable')" }
        * -->
        * ```js
        * // makePerson is a Record Factory function
        * const makePerson = Record({ name: null, favoriteColor: 'unknown' });
        *
        * // alan is a Record instance
        * const alan = makePerson({ name: 'Alan' });
        * ```
        *
        * Note that Record Factories return `Record<TProps> & Readonly<TProps>`,
        * this allows use of both the Record instance API, and direct property
        * access on the resulting instances:
        *
        * <!-- runkit:activate
        *      { "preamble": "const { Record } = require('immutable');const makePerson = Record({ name: null, favoriteColor: 'unknown' });const alan = makePerson({ name: 'Alan' });" }
        * -->
        * ```js
        * // Use the Record API
        * console.log('Record API: ' + alan.get('name'))
        *
        * // Or direct property access (Readonly)
        * console.log('property access: ' + alan.name)
        * ```
        *
        * **Flow Typing Records:**
        *
        * Use the `RecordFactory<TProps>` Flow type to get high quality type checking of
        * Records:
        *
        * ```js
        * import type { RecordFactory, RecordOf } from 'immutable';
        *
        * // Use RecordFactory<TProps> for defining new Record factory functions.
        * type PersonProps = { name: ?string, favoriteColor: string };
        * const makePerson: RecordFactory<PersonProps> = Record({ name: null, favoriteColor: 'unknown' });
        *
        * // Use RecordOf<T> for defining new instances of that Record.
        * type Person = RecordOf<PersonProps>;
        * const alan: Person = makePerson({ name: 'Alan' });
        * ```
        */
      inline def apply[TProps /* <: js.Object */](values: js.Iterable[js.Tuple2[String, Any]]): Record[TProps] & TProps = ^.asInstanceOf[js.Dynamic].applyDynamic("Factory")(values.asInstanceOf[js.Any]).asInstanceOf[Record[TProps] & TProps]
      /**
        * A Record.Factory is created by the `Record()` function. Record instances
        * are created by passing it some of the accepted values for that Record
        * type:
        *
        * <!-- runkit:activate
        *      { "preamble": "const { Record } = require('immutable')" }
        * -->
        * ```js
        * // makePerson is a Record Factory function
        * const makePerson = Record({ name: null, favoriteColor: 'unknown' });
        *
        * // alan is a Record instance
        * const alan = makePerson({ name: 'Alan' });
        * ```
        *
        * Note that Record Factories return `Record<TProps> & Readonly<TProps>`,
        * this allows use of both the Record instance API, and direct property
        * access on the resulting instances:
        *
        * <!-- runkit:activate
        *      { "preamble": "const { Record } = require('immutable');const makePerson = Record({ name: null, favoriteColor: 'unknown' });const alan = makePerson({ name: 'Alan' });" }
        * -->
        * ```js
        * // Use the Record API
        * console.log('Record API: ' + alan.get('name'))
        *
        * // Or direct property access (Readonly)
        * console.log('property access: ' + alan.name)
        * ```
        *
        * **Flow Typing Records:**
        *
        * Use the `RecordFactory<TProps>` Flow type to get high quality type checking of
        * Records:
        *
        * ```js
        * import type { RecordFactory, RecordOf } from 'immutable';
        *
        * // Use RecordFactory<TProps> for defining new Record factory functions.
        * type PersonProps = { name: ?string, favoriteColor: string };
        * const makePerson: RecordFactory<PersonProps> = Record({ name: null, favoriteColor: 'unknown' });
        *
        * // Use RecordOf<T> for defining new instances of that Record.
        * type Person = RecordOf<PersonProps>;
        * const alan: Person = makePerson({ name: 'Alan' });
        * ```
        */
      inline def apply[TProps /* <: js.Object */](values: Partial[TProps]): Record[TProps] & TProps = ^.asInstanceOf[js.Dynamic].applyDynamic("Factory")(values.asInstanceOf[js.Any]).asInstanceOf[Record[TProps] & TProps]
    }
    
    /**
      * Records allow passing a second parameter to supply a descriptive name
      * that appears when converting a Record to a string or in any error
      * messages. A descriptive name for any record can be accessed by using this
      * method. If one was not provided, the string "Record" is returned.
      *
      * ```js
      * const { Record } = require('immutable')
      * const Person = Record({
      *   name: null
      * }, 'Person')
      *
      * var me = Person({ name: 'My Name' })
      * me.toString() // "Person { "name": "My Name" }"
      * Record.getDescriptiveName(me) // "Person"
      * ```
      */
    inline def getDescriptiveName(record: Record[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescriptiveName")(record.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * True if `maybeRecord` is an instance of a Record.
      */
    inline def isRecord(maybeRecord: Any): /* is immutable.immutable.Record<{}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRecord")(maybeRecord.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Record<{}> */ Boolean]
  }
  
  /**
    * Returns a Seq.Indexed of `value` repeated `times` times. When `times` is
    * not defined, returns an infinite `Seq` of `value`.
    *
    * Note: `Repeat` is a factory function and not a class, and does not use the
    * `new` keyword during construction.
    *
    * ```js
    * const { Repeat } = require('immutable')
    * Repeat('foo') // [ 'foo', 'foo', 'foo', ... ]
    * Repeat('bar', 4) // [ 'bar', 'bar', 'bar', 'bar' ]
    * ```
    */
  inline def Repeat[T](value: T): Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Repeat")(value.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
  inline def Repeat[T](value: T, times: Double): Indexed[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Repeat")(value.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[Indexed[T]]
  
  @js.native
  trait Seq[K, V]
    extends StObject
       with Collection[K, V] {
    
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
    def filter_F_Seq[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): Seq[K, F] = js.native
    @JSName("filter")
    def filter_F_Seq[F /* <: V */](
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
      context: Any
    ): Seq[K, F] = js.native
    
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
  /**
    * `Seq` describes a lazy operation, allowing them to efficiently chain
    * use of all the higher-order collection methods (such as `map` and `filter`)
    * by not creating intermediate collections.
    *
    * **Seq is immutable** — Once a Seq is created, it cannot be
    * changed, appended to, rearranged or otherwise modified. Instead, any
    * mutative method called on a `Seq` will return a new `Seq`.
    *
    * **Seq is lazy** — `Seq` does as little work as necessary to respond to any
    * method call. Values are often created during iteration, including implicit
    * iteration when reducing or converting to a concrete data structure such as
    * a `List` or JavaScript `Array`.
    *
    * For example, the following performs no work, because the resulting
    * `Seq`'s values are never iterated:
    *
    * ```js
    * const { Seq } = require('immutable')
    * const oddSquares = Seq([ 1, 2, 3, 4, 5, 6, 7, 8 ])
    *   .filter(x => x % 2 !== 0)
    *   .map(x => x * x)
    * ```
    *
    * Once the `Seq` is used, it performs only the work necessary. In this
    * example, no intermediate arrays are ever created, filter is called three
    * times, and map is only called once:
    *
    * ```js
    * oddSquares.get(1); // 9
    * ```
    *
    * Any collection can be converted to a lazy Seq with `Seq()`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * const map = Map({ a: 1, b: 2, c: 3 })
    * const lazySeq = Seq(map)
    * ```
    *
    * `Seq` allows for the efficient chaining of operations, allowing for the
    * expression of logic that can otherwise be very tedious:
    *
    * ```js
    * lazySeq
    *   .flip()
    *   .map(key => key.toUpperCase())
    *   .flip()
    * // Seq { A: 1, B: 1, C: 1 }
    * ```
    *
    * As well as expressing logic that would otherwise seem memory or time
    * limited, for example `Range` is a special kind of Lazy sequence.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Range } = require('immutable')
    * Range(1, Infinity)
    *   .skip(1000)
    *   .map(n => -n)
    *   .filter(n => n % 2 === 0)
    *   .take(2)
    *   .reduce((r, n) => r * n, 1)
    * // 1006008
    * ```
    *
    * Seq is often used to provide a rich collection API to JavaScript Object.
    *
    * ```js
    * Seq({ x: 0, y: 1, z: 2 }).map(v => v * 2).toObject();
    * // { x: 0, y: 2, z: 4 }
    * ```
    */
  object Seq {
    
    inline def apply[T](collection: js.Iterable[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
    inline def apply[T](collection: typings.immutable.mod.Collection.Indexed[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
    inline def apply[T](collection: typings.immutable.mod.Collection.Set[T]): Set[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
    inline def apply[T](collection: ArrayLike[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
    inline def apply[V](obj: StringDictionary[V]): Keyed[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Keyed[String, V]]
    /**
      * Creates a Seq.
      *
      * Returns a particular kind of `Seq` based on the input.
      *
      *   * If a `Seq`, that same `Seq`.
      *   * If an `Collection`, a `Seq` of the same kind (Keyed, Indexed, or Set).
      *   * If an Array-like, an `Seq.Indexed`.
      *   * If an Iterable Object, an `Seq.Indexed`.
      *   * If an Object, a `Seq.Keyed`.
      *
      * Note: An Iterator itself will be treated as an object, becoming a `Seq.Keyed`,
      * which is usually not what you want. You should turn your Iterator Object into
      * an iterable object by defining a Symbol.iterator (or @@iterator) method which
      * returns `this`.
      *
      * Note: `Seq` is a conversion function and not a class, and does not use the
      * `new` keyword during construction.
      */
    inline def apply[S /* <: Seq[Any, Any] */](seq: S): S = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[S]
    inline def apply[K, V](): Seq[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Seq[K, V]]
    inline def apply[K, V](collection: typings.immutable.mod.Collection.Keyed[K, V]): Keyed[K, V] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Keyed[K, V]]
    
    @JSImport("immutable", "Seq")
    @js.native
    val ^ : js.Any = js.native
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.immutable.mod.ValueObject because Already inherited
    - typings.immutable.mod.Collection because Already inherited
    - typings.immutable.mod.Collection.Indexed because var conflicts: iterator. Inlined fromEntrySeq, interpose, interleave, splice, zip, zip, zip, zipAll, zipAll, zipAll, zipWith, zipWith, zipWith, indexOf, lastIndexOf, findIndex, findIndex, findLastIndex, findLastIndex */ @js.native
    trait Indexed[T]
      extends StObject
         with Seq[Double, T] {
      
      /**
        * Returns a new Seq with only the values for which the `predicate`
        * function returns true.
        *
        * Note: `filter()` always returns a new instance, even if it results in
        * not filtering out any values.
        */
      @JSName("filter")
      def filter_F_Indexed[F /* <: T */](
        predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean]
      ): Indexed[F] = js.native
      @JSName("filter")
      def filter_F_Indexed[F /* <: T */](
        predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean],
        context: Any
      ): Indexed[F] = js.native
      
      /**
        * Returns the first index in the Collection where a value satisfies the
        * provided predicate function. Otherwise -1 is returned.
        */
      def findIndex(predicate: js.Function3[T, /* index */ Double, /* iter */ this.type, Boolean]): Double = js.native
      def findIndex(predicate: js.Function3[T, /* index */ Double, /* iter */ this.type, Boolean], context: Any): Double = js.native
      
      /**
        * Returns the last index in the Collection where a value satisfies the
        * provided predicate function. Otherwise -1 is returned.
        */
      def findLastIndex(predicate: js.Function3[T, /* index */ Double, /* iter */ this.type, Boolean]): Double = js.native
      def findLastIndex(predicate: js.Function3[T, /* index */ Double, /* iter */ this.type, Boolean], context: Any): Double = js.native
      
      /**
        * If this is a collection of [key, value] entry tuples, it will return a
        * Seq.Keyed of those entries.
        */
      def fromEntrySeq(): Keyed[Any, Any] = js.native
      
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
        * // List [ 1, "A", 2, "B", 3, "C" ]
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
        * // List [ 1, "A", "X", 2, "B", "Y" ]
        * ```
        *
        * Since `interleave()` re-indexes values, it produces a complete copy,
        * which has `O(N)` complexity.
        *
        * Note: `interleave` *cannot* be used in `withMutations`.
        */
      def interleave(collections: (Collection[Any, T])*): this.type = js.native
      
      // Combination
      /**
        * Returns a Collection of the same type with `separator` between each item
        * in this Collection.
        */
      def interpose(separator: T): this.type = js.native
      
      @JSName(js.Symbol.iterator)
      var iterator_Indexed: js.Function0[IterableIterator[T]] = js.native
      
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
      
      def zip(collections: (Collection[Any, Any])*): typings.immutable.mod.Collection.Indexed[Any] = js.native
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
      def zip[U](other: Collection[Any, U]): typings.immutable.mod.Collection.Indexed[js.Tuple2[T, U]] = js.native
      def zip[U, V](other: Collection[Any, U], other2: Collection[Any, V]): Indexed[js.Tuple3[T, U, V]] = js.native
      
      def zipAll(collections: (Collection[Any, Any])*): typings.immutable.mod.Collection.Indexed[Any] = js.native
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
      def zipAll[U](other: Collection[Any, U]): typings.immutable.mod.Collection.Indexed[js.Tuple2[T, U]] = js.native
      def zipAll[U, V](other: Collection[Any, U], other2: Collection[Any, V]): Indexed[js.Tuple3[T, U, V]] = js.native
      @JSName("zipAll")
      def zipAll_Indexed(collections: (Collection[Any, Any])*): Indexed[Any] = js.native
      @JSName("zipAll")
      def zipAll_UV_Indexed[U, V](other: Collection[Any, U], other2: Collection[Any, V]): typings.immutable.mod.Collection.Indexed[js.Tuple3[T, U, V]] = js.native
      /**
        * Returns a Seq "zipped" with the provided collections.
        *
        * Unlike `zip`, `zipAll` continues zipping until the longest collection is
        * exhausted. Missing values from shorter collections are filled with `undefined`.
        *
        * ```js
        * const a = Seq([ 1, 2 ]);
        * const b = Seq([ 3, 4, 5 ]);
        * const c = a.zipAll(b); // Seq [ [ 1, 3 ], [ 2, 4 ], [ undefined, 5 ] ]
        * ```
        */
      @JSName("zipAll")
      def zipAll_U_Indexed[U](other: Collection[Any, U]): Indexed[js.Tuple2[T, U]] = js.native
      
      def zipWith[Z](zipper: js.Function1[/* repeated */ Any, Z], collections: (Collection[Any, Any])*): typings.immutable.mod.Collection.Indexed[Z] = js.native
      /**
        * Returns a Seq "zipped" with the provided collections by using a
        * custom `zipper` function.
        *
        * ```js
        * const a = Seq([ 1, 2, 3 ]);
        * const b = Seq([ 4, 5, 6 ]);
        * const c = a.zipWith((a, b) => a + b, b);
        * // Seq [ 5, 7, 9 ]
        * ```
        */
      def zipWith[U, Z](zipper: js.Function2[/* value */ T, /* otherValue */ U, Z], otherCollection: Collection[Any, U]): Indexed[Z] = js.native
      def zipWith[U, V, Z](
        zipper: js.Function3[T, /* otherValue */ U, /* thirdValue */ V, Z],
        otherCollection: Collection[Any, U],
        thirdCollection: Collection[Any, V]
      ): typings.immutable.mod.Collection.Indexed[Z] = js.native
      @JSName("zipWith")
      def zipWith_UVZ_Indexed[U, V, Z](
        zipper: js.Function3[/* value */ T, /* otherValue */ U, /* thirdValue */ V, Z],
        otherCollection: Collection[Any, U],
        thirdCollection: Collection[Any, V]
      ): Indexed[Z] = js.native
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
      @JSName("zipWith")
      def zipWith_UZ_Indexed[U, Z](zipper: js.Function2[T, /* otherValue */ U, Z], otherCollection: Collection[Any, U]): typings.immutable.mod.Collection.Indexed[Z] = js.native
      @JSName("zipWith")
      def zipWith_Z_Indexed[Z](zipper: js.Function1[/* repeated */ Any, Z], collections: (Collection[Any, Any])*): Indexed[Z] = js.native
      
      @JSName("zip")
      def zip_Indexed(collections: (Collection[Any, Any])*): Indexed[Any] = js.native
      @JSName("zip")
      def zip_UV_Indexed[U, V](other: Collection[Any, U], other2: Collection[Any, V]): typings.immutable.mod.Collection.Indexed[js.Tuple3[T, U, V]] = js.native
      /**
        * Returns a Seq "zipped" with the provided collections.
        *
        * Like `zipWith`, but using the default `zipper`: creating an `Array`.
        *
        * ```js
        * const a = Seq([ 1, 2, 3 ]);
        * const b = Seq([ 4, 5, 6 ]);
        * const c = a.zip(b); // Seq [ [ 1, 4 ], [ 2, 5 ], [ 3, 6 ] ]
        * ```
        */
      @JSName("zip")
      def zip_U_Indexed[U](other: Collection[Any, U]): Indexed[js.Tuple2[T, U]] = js.native
    }
    /**
      * `Seq` which represents an ordered indexed list of values.
      */
    object Indexed {
      
      /**
        * Always returns Seq.Indexed, discarding associated keys and
        * supplying incrementing indices.
        *
        * Note: `Seq.Indexed` is a conversion function and not a class, and does
        * not use the `new` keyword during construction.
        */
      inline def apply[T](): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Indexed[T]]
      inline def apply[T](collection: js.Iterable[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
      inline def apply[T](collection: ArrayLike[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
      
      @JSImport("immutable", "Seq.Indexed")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Provides an Seq.Indexed of the values provided.
        */
      inline def of[T](values: T*): Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[Indexed[T]]
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.immutable.mod.ValueObject because Already inherited
    - typings.immutable.mod.Collection because Already inherited
    - typings.immutable.mod.Collection.Keyed because var conflicts: iterator. Inlined flip, mapKeys, mapKeys, mapEntries, mapEntries */ @js.native
    trait Keyed[K, V]
      extends StObject
         with Seq[K, V] {
      
      /**
        * Returns a new Seq with other collections concatenated to this one.
        *
        * All entries will be present in the resulting Seq, even if they
        * have the same key.
        */
      @JSName("concat")
      def concat_KCVC[KC, VC](collections: (js.Iterable[js.Tuple2[KC, VC]])*): Keyed[K | KC, V | VC] = js.native
      
      /**
        * Returns a new Seq with only the entries for which the `predicate`
        * function returns true.
        *
        * Note: `filter()` always returns a new instance, even if it results in
        * not filtering out any values.
        */
      @JSName("filter")
      def filter_F_Keyed[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): Keyed[K, F] = js.native
      @JSName("filter")
      def filter_F_Keyed[F /* <: V */](
        predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
        context: Any
      ): Keyed[K, F] = js.native
      
      /**
        * @see Collection.Keyed.flip
        */
      def flip(): Keyed[V, K] = js.native
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
      @JSName("flip")
      def flip_Keyed(): typings.immutable.mod.Collection.Keyed[V, K] = js.native
      
      @JSName(js.Symbol.iterator)
      var iterator_Keyed: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
      
      /**
        * @see Collection.Keyed.mapEntries
        */
      def mapEntries[KM, VM](
        mapper: js.Function3[
              /* entry */ js.Tuple2[K, V], 
              /* index */ Double, 
              /* iter */ this.type, 
              js.UndefOr[js.Tuple2[KM, VM]]
            ]
      ): Keyed[KM, VM] = js.native
      def mapEntries[KM, VM](
        mapper: js.Function3[
              /* entry */ js.Tuple2[K, V], 
              /* index */ Double, 
              /* iter */ this.type, 
              js.UndefOr[js.Tuple2[KM, VM]]
            ],
        context: Any
      ): Keyed[KM, VM] = js.native
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
        *
        * If the mapper function returns `undefined`, then the entry will be filtered
        */
      @JSName("mapEntries")
      def mapEntries_KMVM_Keyed[KM, VM](
        mapper: js.Function3[
              /* entry */ js.Tuple2[K, V], 
              /* index */ Double, 
              /* iter */ this.type, 
              js.UndefOr[js.Tuple2[KM, VM]]
            ]
      ): typings.immutable.mod.Collection.Keyed[KM, VM] = js.native
      @JSName("mapEntries")
      def mapEntries_KMVM_Keyed[KM, VM](
        mapper: js.Function3[
              /* entry */ js.Tuple2[K, V], 
              /* index */ Double, 
              /* iter */ this.type, 
              js.UndefOr[js.Tuple2[KM, VM]]
            ],
        context: Any
      ): typings.immutable.mod.Collection.Keyed[KM, VM] = js.native
      
      /**
        * @see Collection.Keyed.mapKeys
        */
      def mapKeys[M](mapper: js.Function3[/* key */ K, /* value */ V, /* iter */ this.type, M]): Keyed[M, V] = js.native
      def mapKeys[M](mapper: js.Function3[/* key */ K, /* value */ V, /* iter */ this.type, M], context: Any): Keyed[M, V] = js.native
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
      @JSName("mapKeys")
      def mapKeys_M_Keyed[M](mapper: js.Function3[K, V, /* iter */ this.type, M]): typings.immutable.mod.Collection.Keyed[M, V] = js.native
      @JSName("mapKeys")
      def mapKeys_M_Keyed[M](mapper: js.Function3[K, V, /* iter */ this.type, M], context: Any): typings.immutable.mod.Collection.Keyed[M, V] = js.native
    }
    object Keyed {
      
      /**
        * `Seq` which represents key-value pairs.
        */
      inline def apply[V](obj: StringDictionary[V]): Keyed[String, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(obj.asInstanceOf[js.Any]).asInstanceOf[Keyed[String, V]]
      /**
        * Always returns a Seq.Keyed, if input is not keyed, expects an
        * collection of [K, V] tuples.
        *
        * Note: `Seq.Keyed` is a conversion function and not a class, and does not
        * use the `new` keyword during construction.
        */
      /**
        * `Seq` which represents key-value pairs.
        */
      inline def apply[K, V](): Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")().asInstanceOf[Keyed[K, V]]
      /**
        * `Seq` which represents key-value pairs.
        */
      inline def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(collection.asInstanceOf[js.Any]).asInstanceOf[Keyed[K, V]]
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.immutable.mod.ValueObject because Already inherited
    - typings.immutable.mod.Collection because Already inherited
    - typings.immutable.mod.Collection.Set because var conflicts: iterator. Inlined  */ @js.native
    trait Set[T]
      extends StObject
         with Seq[T, T] {
      
      /**
        * Returns a new Seq with only the values for which the `predicate`
        * function returns true.
        *
        * Note: `filter()` always returns a new instance, even if it results in
        * not filtering out any values.
        */
      @JSName("filter")
      def filter_F_Set[F /* <: T */](predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean]): Set[F] = js.native
      @JSName("filter")
      def filter_F_Set[F /* <: T */](
        predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean],
        context: Any
      ): Set[F] = js.native
      
      @JSName(js.Symbol.iterator)
      var iterator_Set: js.Function0[IterableIterator[T]] = js.native
    }
    /**
      * `Seq` which represents a set of values.
      *
      * Because `Seq` are often lazy, `Seq.Set` does not provide the same guarantee
      * of value uniqueness as the concrete `Set`.
      */
    object Set {
      
      /**
        * Always returns a Seq.Set, discarding associated indices or keys.
        *
        * Note: `Seq.Set` is a conversion function and not a class, and does not
        * use the `new` keyword during construction.
        */
      inline def apply[T](): Set[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Set[T]]
      inline def apply[T](collection: js.Iterable[T]): Set[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
      inline def apply[T](collection: ArrayLike[T]): Set[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
      
      @JSImport("immutable", "Seq.Set")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns a Seq.Set of the provided values
        */
      inline def of[T](values: T*): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[Set[T]]
    }
    
    /**
      * True if `maybeSeq` is a Seq, it is not backed by a concrete
      * structure such as Map, List, or Set.
      */
    inline def isSeq(maybeSeq: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSeq")(maybeSeq.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  trait Set_[T]
    extends StObject
       with typings.immutable.mod.Collection.Set[T] {
    
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
      * Returns a new Set with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_Set_[F /* <: T */](predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean]): Set_[F] = js.native
    @JSName("filter")
    def filter_F_Set_[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean],
      context: Any
    ): Set_[F] = js.native
    
    /**
      * Returns a Set which has removed any values not also contained
      * within `collections`.
      *
      * Note: `intersect` can be used in `withMutations`.
      */
    def intersect(collections: js.Iterable[T]*): this.type = js.native
    
    def merge[C](collections: js.Iterable[C]*): Set_[T | C] = js.native
    
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
    def subtract(collections: js.Iterable[T]*): this.type = js.native
    
    /**
      * Returns a Set including any value from `collections` that does not already
      * exist in this Set.
      *
      * Note: `union` can be used in `withMutations`.
      * @alias merge
      * @alias concat
      */
    def union[C](collections: js.Iterable[C]*): Set_[T | C] = js.native
    
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
    def withMutations(mutator: js.Function1[/* mutable */ this.type, Any]): this.type = js.native
  }
  /**
    * A Collection of unique values with `O(log32 N)` adds and has.
    *
    * When iterating a Set, the entries will be (value, value) pairs. Iteration
    * order of a Set is undefined, however is stable. Multiple iterations of the
    * same Set will iterate in the same order.
    *
    * Set values, like Map keys, may be of any type. Equality is determined using
    * `Immutable.is`, enabling Sets to uniquely include other Immutable
    * collections, custom value types, and NaN.
    */
  object Set_ {
    
    /**
      * Create a new immutable Set containing the values of the provided
      * collection-like.
      *
      * Note: `Set` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      */
    inline def apply[T](): Set_[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Set_[T]]
    inline def apply[T](collection: js.Iterable[T]): Set_[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Set_[T]]
    inline def apply[T](collection: ArrayLike[T]): Set_[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Set_[T]]
    
    @JSImport("immutable", "Set")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromKeys(obj: StringDictionary[Any]): Set_[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[Set_[String]]
    /**
      * `Set.fromKeys()` creates a new immutable Set containing the keys from
      * this Collection or JavaScript Object.
      */
    inline def fromKeys[T](iter: Collection[T, Any]): Set_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(iter.asInstanceOf[js.Any]).asInstanceOf[Set_[T]]
    
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
      * // Set [ "a", "c" ]
      * ```
      */
    inline def intersect[T](sets: js.Iterable[js.Iterable[T]]): Set_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(sets.asInstanceOf[js.Any]).asInstanceOf[Set_[T]]
    
    /**
      * True if the provided value is a Set
      */
    inline def isSet(maybeSet: Any): /* is immutable.immutable.Set<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(maybeSet.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Set<unknown> */ Boolean]
    
    /**
      * Creates a new Set containing `values`.
      */
    inline def of[T](values: T*): Set_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[Set_[T]]
    
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
      * // Set [ "a", "b", "c", "t" ]
      * ```
      */
    inline def union[T](sets: js.Iterable[js.Iterable[T]]): Set_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(sets.asInstanceOf[js.Any]).asInstanceOf[Set_[T]]
  }
  
  @js.native
  trait Stack[T]
    extends StObject
       with typings.immutable.mod.Collection.Indexed[T] {
    
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
    def clear(): Stack[T] = js.native
    
    /**
      * Returns a new Set with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_Set_[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean]
    ): Set_[F] = js.native
    @JSName("filter")
    def filter_F_Set_[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean],
      context: Any
    ): Set_[F] = js.native
    
    // Reading values
    /**
      * Alias for `Stack.first()`.
      */
    def peek(): js.UndefOr[T] = js.native
    
    /**
      * Alias for `Stack#shift` and is not equivalent to `List#pop`.
      */
    def pop(): Stack[T] = js.native
    
    /**
      * Alias for `Stack#unshift` and is not equivalent to `List#push`.
      */
    def push(values: T*): Stack[T] = js.native
    
    /**
      * Alias for `Stack#unshiftAll`.
      */
    def pushAll(iter: js.Iterable[T]): Stack[T] = js.native
    
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
    def shift(): Stack[T] = js.native
    
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
    def unshift(values: T*): Stack[T] = js.native
    
    /**
      * Like `Stack#unshift`, but accepts a collection rather than varargs.
      *
      * Note: `unshiftAll` can be used in `withMutations`.
      */
    def unshiftAll(iter: js.Iterable[T]): Stack[T] = js.native
    
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
    def withMutations(mutator: js.Function1[/* mutable */ this.type, Any]): this.type = js.native
  }
  /**
    * Stacks are indexed collections which support very efficient O(1) addition
    * and removal from the front using `unshift(v)` and `shift()`.
    *
    * For familiarity, Stack also provides `push(v)`, `pop()`, and `peek()`, but
    * be aware that they also operate on the front of the list, unlike List or
    * a JavaScript Array.
    *
    * Note: `reverse()` or any inherent reverse traversal (`reduceRight`,
    * `lastIndexOf`, etc.) is not efficient with a Stack.
    *
    * Stack is implemented with a Single-Linked List.
    */
  object Stack {
    
    /**
      * Create a new immutable Stack containing the values of the provided
      * collection-like.
      *
      * The iteration order of the provided collection is preserved in the
      * resulting `Stack`.
      *
      * Note: `Stack` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      */
    inline def apply[T](): Stack[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Stack[T]]
    inline def apply[T](collection: js.Iterable[T]): Stack[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Stack[T]]
    inline def apply[T](collection: ArrayLike[T]): Stack[T] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[Stack[T]]
    
    @JSImport("immutable", "Stack")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * True if the provided value is a Stack
      */
    inline def isStack(maybeStack: Any): /* is immutable.immutable.Stack<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStack")(maybeStack.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Stack<unknown> */ Boolean]
    
    /**
      * Creates a new Stack containing `values`.
      */
    inline def of[T](values: T*): Stack[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[Stack[T]]
  }
  
  /**
    * Deeply converts plain JS objects and arrays to Immutable Maps and Lists.
    *
    * `fromJS` will convert Arrays and [array-like objects][2] to a List, and
    * plain objects (without a custom prototype) to a Map. [Iterable objects][3]
    * may be converted to List, Map, or Set.
    *
    * If a `reviver` is optionally provided, it will be called with every
    * collection as a Seq (beginning with the most nested collections
    * and proceeding to the top-level collection itself), along with the key
    * referring to each collection and the parent JS object provided as `this`.
    * For the top level, object, the key will be `""`. This `reviver` is expected
    * to return a new Immutable Collection, allowing for custom conversions from
    * deep JS objects. Finally, a `path` is provided which is the sequence of
    * keys to this value from the starting value.
    *
    * `reviver` acts similarly to the [same parameter in `JSON.parse`][1].
    *
    * If `reviver` is not provided, the default behavior will convert Objects
    * into Maps and Arrays into Lists like so:
    *
    * <!-- runkit:activate -->
    * ```js
    * const { fromJS, isKeyed } = require('immutable')
    * function (key, value) {
    *   return isKeyed(value) ? value.toMap() : value.toList()
    * }
    * ```
    *
    * Accordingly, this example converts native JS data to OrderedMap and List:
    *
    * <!-- runkit:activate -->
    * ```js
    * const { fromJS, isKeyed } = require('immutable')
    * fromJS({ a: {b: [10, 20, 30]}, c: 40}, function (key, value, path) {
    *   console.log(key, value, path)
    *   return isKeyed(value) ? value.toOrderedMap() : value.toList()
    * })
    *
    * > "b", [ 10, 20, 30 ], [ "a", "b" ]
    * > "a", {b: [10, 20, 30]}, [ "a" ]
    * > "", {a: {b: [10, 20, 30]}, c: 40}, []
    * ```
    *
    * Keep in mind, when using JS objects to construct Immutable Maps, that
    * JavaScript Object properties are always strings, even if written in a
    * quote-less shorthand, while Immutable Maps accept keys of any type.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * let obj = { 1: "one" };
    * Object.keys(obj); // [ "1" ]
    * assert.equal(obj["1"], obj[1]); // "one" === "one"
    *
    * let map = Map(obj);
    * assert.notEqual(map.get("1"), map.get(1)); // "one" !== undefined
    * ```
    *
    * Property access for JavaScript Objects first converts the key to a string,
    * but since Immutable Map keys can be of any type the argument to `get()` is
    * not altered.
    *
    * [1]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#Example.3A_Using_the_reviver_parameter
    *      "Using the reviver parameter"
    * [2]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Indexed_collections#working_with_array-like_objects
    *      "Working with array-like objects"
    * [3]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#the_iterable_protocol
    *      "The iterable protocol"
    */
  inline def fromJS(jsValue: Any): Collection[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJS")(jsValue.asInstanceOf[js.Any]).asInstanceOf[Collection[Any, Any]]
  inline def fromJS(
    jsValue: Any,
    reviver: js.Function3[
      /* key */ String | Double, 
      /* sequence */ (typings.immutable.mod.Collection.Keyed[String, Any]) | typings.immutable.mod.Collection.Indexed[Any], 
      /* path */ js.UndefOr[js.Array[String | Double]], 
      Any
    ]
  ): Collection[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJS")(jsValue.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Collection[Any, Any]]
  
  inline def get[V](collection: js.Array[V], key: Double): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
  inline def get[V](collection: StringDictionary[V], key: String): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
  inline def get[V, NSV](collection: js.Array[V], key: Double, notSetValue: NSV): V | NSV = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any])).asInstanceOf[V | NSV]
  inline def get[V, NSV](collection: StringDictionary[V], key: String, notSetValue: NSV): V | NSV = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any])).asInstanceOf[V | NSV]
  /**
    * Returns the value within the provided collection associated with the
    * provided key, or notSetValue if the key is not defined in the collection.
    *
    * A functional alternative to `collection.get(key)` which will also work on
    * plain Objects and Arrays as an alternative for `collection[key]`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { get } = require('immutable')
    * get([ 'dog', 'frog', 'cat' ], 2) // 'frog'
    * get({ x: 123, y: 456 }, 'x') // 123
    * get({ x: 123, y: 456 }, 'z', 'ifNotSet') // 'ifNotSet'
    * ```
    */
  inline def get[K, V](collection: Collection[K, V], key: K): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
  inline def get[C /* <: js.Object */, K /* <: /* keyof C */ String */](`object`: C, key: K, notSetValue: Any): /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any]
  inline def get[TProps /* <: js.Object */, K /* <: /* keyof TProps */ String */](record: Record[TProps], key: K, notSetValue: Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(record.asInstanceOf[js.Any], key.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any]
  inline def get[K, V, NSV](collection: Collection[K, V], key: K, notSetValue: NSV): V | NSV = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any])).asInstanceOf[V | NSV]
  
  /**
    * Returns the value at the provided key path starting at the provided
    * collection, or notSetValue if the key path is not defined.
    *
    * A functional alternative to `collection.getIn(keypath)` which will also
    * work with plain Objects and Arrays.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { getIn } = require('immutable')
    * getIn({ x: { y: { z: 123 }}}, ['x', 'y', 'z']) // 123
    * getIn({ x: { y: { z: 123 }}}, ['x', 'q', 'p'], 'ifNotSet') // 'ifNotSet'
    * ```
    */
  inline def getIn(collection: Any, keyPath: js.Iterable[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(collection.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(collection: Any, keyPath: js.Iterable[Any], notSetValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(collection.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Returns true if the key is defined in the provided collection.
    *
    * A functional alternative to `collection.has(key)` which will also work with
    * plain Objects and Arrays as an alternative for
    * `collection.hasOwnProperty(key)`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { has } = require('immutable')
    * has([ 'dog', 'frog', 'cat' ], 2) // true
    * has([ 'dog', 'frog', 'cat' ], 5) // false
    * has({ x: 123, y: 456 }, 'x') // true
    * has({ x: 123, y: 456 }, 'z') // false
    * ```
    */
  inline def has(collection: js.Object, key: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true if the key path is defined in the provided collection.
    *
    * A functional alternative to `collection.hasIn(keypath)` which will also
    * work with plain Objects and Arrays.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { hasIn } = require('immutable')
    * hasIn({ x: { y: { z: 123 }}}, ['x', 'y', 'z']) // true
    * hasIn({ x: { y: { z: 123 }}}, ['x', 'q', 'p']) // false
    * ```
    */
  inline def hasIn(collection: Any, keyPath: js.Iterable[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasIn")(collection.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * The `hash()` function is an important part of how Immutable determines if
    * two values are equivalent and is used to determine how to store those
    * values. Provided with any value, `hash()` will return a 31-bit integer.
    *
    * When designing Objects which may be equal, it's important that when a
    * `.equals()` method returns true, that both values `.hashCode()` method
    * return the same value. `hash()` may be used to produce those values.
    *
    * For non-Immutable Objects that do not provide a `.hashCode()` functions
    * (including plain Objects, plain Arrays, Date objects, etc), a unique hash
    * value will be created for each *instance*. That is, the create hash
    * represents referential equality, and not value equality for Objects. This
    * ensures that if that Object is mutated over time that its hash code will
    * remain consistent, allowing Objects to be used as keys and values in
    * Immutable.js collections.
    *
    * Note that `hash()` attempts to balance between speed and avoiding
    * collisions, however it makes no attempt to produce secure hashes.
    *
    * *New in Version 4.0*
    */
  inline def hash(value: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Value equality check with semantics similar to `Object.is`, but treats
    * Immutable `Collection`s as values, equal if the second `Collection` includes
    * equivalent values.
    *
    * It's used throughout Immutable when checking for equality, including `Map`
    * key equality and `Set` membership.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map, is } = require('immutable')
    * const map1 = Map({ a: 1, b: 1, c: 1 })
    * const map2 = Map({ a: 1, b: 1, c: 1 })
    * assert.equal(map1 !== map2, true)
    * assert.equal(Object.is(map1, map2), false)
    * assert.equal(is(map1, map2), true)
    * ```
    *
    * `is()` compares primitive types like strings and numbers, Immutable.js
    * collections like `Map` and `List`, but also any custom object which
    * implements `ValueObject` by providing `equals()` and `hashCode()` methods.
    *
    * Note: Unlike `Object.is`, `Immutable.is` assumes `0` and `-0` are the same
    * value, matching the behavior of ES6 Map key equality.
    */
  inline def is(first: Any, second: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * True if `maybeAssociative` is either a Keyed or Indexed Collection.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { isAssociative, Map, List, Stack, Set } = require('immutable');
    * isAssociative([]); // false
    * isAssociative({}); // false
    * isAssociative(Map()); // true
    * isAssociative(List()); // true
    * isAssociative(Stack()); // true
    * isAssociative(Set()); // false
    * ```
    */
  inline def isAssociative(maybeAssociative: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssociative")(maybeAssociative.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * True if `maybeCollection` is a Collection, or any of its subclasses.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { isCollection, Map, List, Stack } = require('immutable');
    * isCollection([]); // false
    * isCollection({}); // false
    * isCollection(Map()); // true
    * isCollection(List()); // true
    * isCollection(Stack()); // true
    * ```
    */
  inline def isCollection(maybeCollection: Any): /* is immutable.immutable.Collection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(maybeCollection.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Collection<unknown, unknown> */ Boolean]
  
  /**
    * True if `maybeImmutable` is an Immutable Collection or Record.
    *
    * Note: Still returns true even if the collections is within a `withMutations()`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { isImmutable, Map, List, Stack } = require('immutable');
    * isImmutable([]); // false
    * isImmutable({}); // false
    * isImmutable(Map()); // true
    * isImmutable(List()); // true
    * isImmutable(Stack()); // true
    * isImmutable(Map().asMutable()); // true
    * ```
    */
  inline def isImmutable(maybeImmutable: Any): /* is immutable.immutable.Collection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(maybeImmutable.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Collection<unknown, unknown> */ Boolean]
  
  /**
    * True if `maybeIndexed` is a Collection.Indexed, or any of its subclasses.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { isIndexed, Map, List, Stack, Set } = require('immutable');
    * isIndexed([]); // false
    * isIndexed({}); // false
    * isIndexed(Map()); // false
    * isIndexed(List()); // true
    * isIndexed(Stack()); // true
    * isIndexed(Set()); // false
    * ```
    */
  inline def isIndexed(maybeIndexed: Any): /* is immutable.immutable.Collection.Indexed<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(maybeIndexed.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Collection.Indexed<unknown> */ Boolean]
  
  /**
    * True if `maybeKeyed` is a Collection.Keyed, or any of its subclasses.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { isKeyed, Map, List, Stack } = require('immutable');
    * isKeyed([]); // false
    * isKeyed({}); // false
    * isKeyed(Map()); // true
    * isKeyed(List()); // false
    * isKeyed(Stack()); // false
    * ```
    */
  inline def isKeyed(maybeKeyed: Any): /* is immutable.immutable.Collection.Keyed<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyed")(maybeKeyed.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Collection.Keyed<unknown, unknown> */ Boolean]
  
  /**
    * True if `maybeList` is a List.
    */
  inline def isList(maybeList: Any): /* is immutable.immutable.List<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isList")(maybeList.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.List<unknown> */ Boolean]
  
  /**
    * True if `maybeMap` is a Map.
    *
    * Also true for OrderedMaps.
    */
  inline def isMap(maybeMap: Any): /* is immutable.immutable.Map<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(maybeMap.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Map<unknown, unknown> */ Boolean]
  
  /**
    * True if `maybeOrdered` is a Collection where iteration order is well
    * defined. True for Collection.Indexed as well as OrderedMap and OrderedSet.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { isOrdered, Map, OrderedMap, List, Set } = require('immutable');
    * isOrdered([]); // false
    * isOrdered({}); // false
    * isOrdered(Map()); // false
    * isOrdered(OrderedMap()); // true
    * isOrdered(List()); // true
    * isOrdered(Set()); // false
    * ```
    */
  inline def isOrdered(maybeOrdered: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrdered")(maybeOrdered.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * True if `maybeOrderedMap` is an OrderedMap.
    */
  inline def isOrderedMap(maybeOrderedMap: Any): /* is immutable.immutable.OrderedMap<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrderedMap")(maybeOrderedMap.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.OrderedMap<unknown, unknown> */ Boolean]
  
  /**
    * True if `maybeOrderedSet` is an OrderedSet.
    */
  inline def isOrderedSet(maybeOrderedSet: Any): /* is immutable.immutable.OrderedSet<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrderedSet")(maybeOrderedSet.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.OrderedSet<unknown> */ Boolean]
  
  /**
    * True if `maybeRecord` is a Record.
    */
  inline def isRecord(maybeRecord: Any): /* is immutable.immutable.Record<{}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRecord")(maybeRecord.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Record<{}> */ Boolean]
  
  /**
    * True if `maybeSeq` is a Seq.
    */
  inline def isSeq(maybeSeq: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSeq")(maybeSeq.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * True if `maybeSet` is a Set.
    *
    * Also true for OrderedSets.
    */
  inline def isSet(maybeSet: Any): /* is immutable.immutable.Set<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(maybeSet.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Set<unknown> */ Boolean]
  
  /**
    * True if `maybeStack` is a Stack.
    */
  inline def isStack(maybeStack: Any): /* is immutable.immutable.Stack<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStack")(maybeStack.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.Stack<unknown> */ Boolean]
  
  /**
    * True if `maybeValue` is a JavaScript Object which has *both* `equals()`
    * and `hashCode()` methods.
    *
    * Any two instances of *value objects* can be compared for value equality with
    * `Immutable.is()` and can be used as keys in a `Map` or members in a `Set`.
    */
  inline def isValueObject(maybeValue: Any): /* is immutable.immutable.ValueObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValueObject")(maybeValue.asInstanceOf[js.Any]).asInstanceOf[/* is immutable.immutable.ValueObject */ Boolean]
  
  /**
    * Returns a copy of the collection with the remaining collections merged in.
    *
    * A functional alternative to `collection.merge()` which will also work with
    * plain Objects and Arrays.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { merge } = require('immutable')
    * const original = { x: 123, y: 456 }
    * merge(original, { y: 789, z: 'abc' }) // { x: 123, y: 789, z: 'abc' }
    * console.log(original) // { x: 123, y: 456 }
    * ```
    */
  inline def merge[C](collection: C, collections: ((js.Iterable[Any | (js.Tuple2[Any, Any])]) | StringDictionary[Any])*): C = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scala.List(collection.asInstanceOf[js.Any]).`++`(collections.asInstanceOf[scala.Seq[js.Any]])*).asInstanceOf[C]
  
  /**
    * Like `merge()`, but when two compatible collections are encountered with
    * the same key, it merges them as well, recursing deeply through the nested
    * data. Two collections are considered to be compatible (and thus will be
    * merged together) if they both fall into one of three categories: keyed
    * (e.g., `Map`s, `Record`s, and objects), indexed (e.g., `List`s and
    * arrays), or set-like (e.g., `Set`s). If they fall into separate
    * categories, `mergeDeep` will replace the existing collection with the
    * collection being merged in. This behavior can be customized by using
    * `mergeDeepWith()`.
    *
    * Note: Indexed and set-like collections are merged using
    * `concat()`/`union()` and therefore do not recurse.
    *
    * A functional alternative to `collection.mergeDeep()` which will also work
    * with plain Objects and Arrays.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { mergeDeep } = require('immutable')
    * const original = { x: { y: 123 }}
    * mergeDeep(original, { x: { z: 456 }}) // { x: { y: 123, z: 456 }}
    * console.log(original) // { x: { y: 123 }}
    * ```
    */
  inline def mergeDeep[C](collection: C, collections: ((js.Iterable[Any | (js.Tuple2[Any, Any])]) | StringDictionary[Any])*): C = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeep")(scala.List(collection.asInstanceOf[js.Any]).`++`(collections.asInstanceOf[scala.Seq[js.Any]])*).asInstanceOf[C]
  
  /**
    * Like `mergeDeep()`, but when two non-collections or incompatible
    * collections are encountered at the same key, it uses the `merger` function
    * to determine the resulting value. Collections are considered incompatible
    * if they fall into separate categories between keyed, indexed, and set-like.
    *
    * A functional alternative to `collection.mergeDeepWith()` which will also
    * work with plain Objects and Arrays.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { mergeDeepWith } = require('immutable')
    * const original = { x: { y: 123 }}
    * mergeDeepWith(
    *   (oldVal, newVal) => oldVal + newVal,
    *   original,
    *   { x: { y: 456 }}
    * ) // { x: { y: 579 }}
    * console.log(original) // { x: { y: 123 }}
    * ```
    */
  inline def mergeDeepWith[C](
    merger: js.Function3[/* oldVal */ Any, /* newVal */ Any, /* key */ Any, Any],
    collection: C,
    collections: ((js.Iterable[Any | (js.Tuple2[Any, Any])]) | StringDictionary[Any])*
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeepWith")((scala.List(merger.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).`++`(collections.asInstanceOf[scala.Seq[js.Any]])*)).asInstanceOf[C]
  
  /**
    * Returns a copy of the collection with the remaining collections merged in,
    * calling the `merger` function whenever an existing value is encountered.
    *
    * A functional alternative to `collection.mergeWith()` which will also work
    * with plain Objects and Arrays.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { mergeWith } = require('immutable')
    * const original = { x: 123, y: 456 }
    * mergeWith(
    *   (oldVal, newVal) => oldVal + newVal,
    *   original,
    *   { y: 789, z: 'abc' }
    * ) // { x: 123, y: 1245, z: 'abc' }
    * console.log(original) // { x: 123, y: 456 }
    * ```
    */
  inline def mergeWith[C](
    merger: js.Function3[/* oldVal */ Any, /* newVal */ Any, /* key */ Any, Any],
    collection: C,
    collections: ((js.Iterable[Any | (js.Tuple2[Any, Any])]) | StringDictionary[Any])*
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeWith")((scala.List(merger.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).`++`(collections.asInstanceOf[scala.Seq[js.Any]])*)).asInstanceOf[C]
  
  inline def remove[C /* <: js.Array[Any] */](collection: C, key: Double): C = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[C]
  /**
    * Returns a copy of the collection with the value at key removed.
    *
    * A functional alternative to `collection.remove(key)` which will also work
    * with plain Objects and Arrays as an alternative for
    * `delete collectionCopy[key]`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { remove } = require('immutable')
    * const originalArray = [ 'dog', 'frog', 'cat' ]
    * remove(originalArray, 1) // [ 'dog', 'cat' ]
    * console.log(originalArray) // [ 'dog', 'frog', 'cat' ]
    * const originalObject = { x: 123, y: 456 }
    * remove(originalObject, 'x') // { y: 456 }
    * console.log(originalObject) // { x: 123, y: 456 }
    * ```
    */
  inline def remove[K, C /* <: Collection[K, Any] */](collection: C, key: K): C = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[C]
  
  /**
    * Returns a copy of the collection with the value at the key path removed.
    *
    * A functional alternative to `collection.removeIn(keypath)` which will also
    * work with plain Objects and Arrays.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { removeIn } = require('immutable')
    * const original = { x: { y: { z: 123 }}}
    * removeIn(original, ['x', 'y', 'z']) // { x: { y: {}}}
    * console.log(original) // { x: { y: { z: 123 }}}
    * ```
    */
  inline def removeIn[C](collection: C, keyPath: js.Iterable[Any]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIn")(collection.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def remove_CK[C, K /* <: /* keyof C */ String */](collection: C, key: K): C = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def remove_TPropsCK[TProps /* <: js.Object */, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */](collection: C, key: K): C = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def set[V, C /* <: StringDictionary[V] */](collection: C, key: String, value: V): C = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def set[V, C /* <: js.Array[V] */](collection: C, key: Double, value: V): C = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def set[C, K /* <: /* keyof C */ String */](
    `object`: C,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[C]
  /**
    * Returns a copy of the collection with the value at key set to the provided
    * value.
    *
    * A functional alternative to `collection.set(key, value)` which will also
    * work with plain Objects and Arrays as an alternative for
    * `collectionCopy[key] = value`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { set } = require('immutable')
    * const originalArray = [ 'dog', 'frog', 'cat' ]
    * set(originalArray, 1, 'cow') // [ 'dog', 'cow', 'cat' ]
    * console.log(originalArray) // [ 'dog', 'frog', 'cat' ]
    * const originalObject = { x: 123, y: 456 }
    * set(originalObject, 'x', 789) // { x: 789, y: 456 }
    * console.log(originalObject) // { x: 123, y: 456 }
    * ```
    */
  inline def set[K, V, C /* <: Collection[K, V] */](collection: C, key: K, value: V): C = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[C]
  
  /**
    * Returns a copy of the collection with the value at the key path set to the
    * provided value.
    *
    * A functional alternative to `collection.setIn(keypath)` which will also
    * work with plain Objects and Arrays.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { setIn } = require('immutable')
    * const original = { x: { y: { z: 123 }}}
    * setIn(original, ['x', 'y', 'z'], 456) // { x: { y: { z: 456 }}}
    * console.log(original) // { x: { y: { z: 123 }}}
    * ```
    */
  inline def setIn[C](collection: C, keyPath: js.Iterable[Any], value: Any): C = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(collection.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def set_TPropsCK[TProps /* <: js.Object */, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */](
    record: C,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(record.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def update[V](collection: js.Array[V], key: Double, updater: js.Function1[/* value */ V, V]): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
  inline def update[V, NSV](
    collection: js.Array[V],
    key: Double,
    notSetValue: NSV,
    updater: js.Function1[/* value */ V | NSV, V]
  ): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
  inline def update[C, K /* <: /* keyof C */ String */](
    `object`: C,
    key: K,
    updater: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def update[C, K /* <: /* keyof C */ String */, NSV](
    `object`: C,
    key: K,
    notSetValue: NSV,
    updater: js.Function1[
      /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any) | NSV, 
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def updateIn[C](
    collection: C,
    keyPath: js.Iterable[Any],
    notSetValue: Any,
    updater: js.Function1[/* value */ Any, Any]
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIn")(collection.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[C]
  /**
    * Returns a copy of the collection with the value at key path set to the
    * result of providing the existing value to the updating function.
    *
    * A functional alternative to `collection.updateIn(keypath)` which will also
    * work with plain Objects and Arrays.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { updateIn } = require('immutable')
    * const original = { x: { y: { z: 123 }}}
    * updateIn(original, ['x', 'y', 'z'], val => val * 6) // { x: { y: { z: 738 }}}
    * console.log(original) // { x: { y: { z: 123 }}}
    * ```
    */
  inline def updateIn[C](collection: C, keyPath: js.Iterable[Any], updater: js.Function1[/* value */ Any, Any]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIn")(collection.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[C]
  
  /**
    * Returns a copy of the collection with the value at key set to the result of
    * providing the existing value to the updating function.
    *
    * A functional alternative to `collection.update(key, fn)` which will also
    * work with plain Objects and Arrays as an alternative for
    * `collectionCopy[key] = fn(collection[key])`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { update } = require('immutable')
    * const originalArray = [ 'dog', 'frog', 'cat' ]
    * update(originalArray, 1, val => val.toUpperCase()) // [ 'dog', 'FROG', 'cat' ]
    * console.log(originalArray) // [ 'dog', 'frog', 'cat' ]
    * const originalObject = { x: 123, y: 456 }
    * update(originalObject, 'x', val => val * 6) // { x: 738, y: 456 }
    * console.log(originalObject) // { x: 123, y: 456 }
    * ```
    */
  inline def update_KVC[K, V, C /* <: Collection[K, V] */](collection: C, key: K, updater: js.Function1[/* value */ js.UndefOr[V], V]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def update_KVCNSV[K, V, C /* <: Collection[K, V] */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def update_TPropsCK[TProps /* <: js.Object */, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */](
    record: C,
    key: K,
    updater: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(record.asInstanceOf[js.Any], key.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def update_TPropsCKNSV[TProps /* <: js.Object */, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */, NSV](
    record: C,
    key: K,
    notSetValue: NSV,
    updater: js.Function1[
      /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any) | NSV, 
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(record.asInstanceOf[js.Any], key.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def update_VCKNSV_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): StringDictionary[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], notSetValue.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[V]]
  
  inline def update_VCK_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): StringDictionary[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[V]]
  
  /**
    * RecordOf<T> is used in TypeScript to define interfaces expecting an
    * instance of record with type T.
    *
    * This is equivalent to an instance of a record created by a Record Factory.
    */
  type RecordOf[TProps /* <: js.Object */] = Record[TProps] & TProps
  
  /**
    * The interface to fulfill to qualify as a Value Object.
    */
  trait ValueObject extends StObject
}
