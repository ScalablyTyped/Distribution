package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iterable[K, V] extends js.Object {
  /**
       * Note: this is here as a convenience to work around an issue with
       * TypeScript https://github.com/Microsoft/TypeScript/issues/285, but
       * Iterable does not define `size`, instead `Seq` defines `size` as
       * nullable number, and `Collection` defines `size` as always a number.
       *
       * @ignore
       */
  var size: scala.Double = js.native
  /**
       * Returns a new Iterable of the same type containing all entries except
       * the last.
       */
  def butLast(): Iterable[K, V] = js.native
  // Combination
  /**
       * Returns a new Iterable of the same type with other values and
       * iterable-like concatenated to this one.
       *
       * For Seqs, all entries will be present in
       * the resulting iterable, even if they have the same key.
       */
  def concat(valuesOrIterables: js.Any*): Iterable[K, V] = js.native
  def contains(value: V): scala.Boolean = js.native
  /**
       * Returns the size of this Iterable.
       *
       * Regardless of if this Iterable can describe its size lazily (some Seqs
       * cannot), this method will always return the correct size. E.g. it
       * evaluates a lazy `Seq` if necessary.
       *
       * If `predicate` is provided, then this returns the count of entries in the
       * Iterable for which the `predicate` returns true.
       */
  def count(): scala.Double = js.native
  def count(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): scala.Double = js.native
  def count(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): scala.Double = js.native
  /**
       * Returns a `Seq.Keyed` of counts, grouped by the return value of
       * the `grouper` function.
       *
       * Note: This is not a lazy operation.
       */
  def countBy[G](
    grouper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      G
    ]
  ): Map[G, scala.Double] = js.native
  /**
       * Returns a `Seq.Keyed` of counts, grouped by the return value of
       * the `grouper` function.
       *
       * Note: This is not a lazy operation.
       */
  def countBy[G](
    grouper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      G
    ],
    context: js.Any
  ): Map[G, scala.Double] = js.native
  /**
       * An iterator of this `Iterable`'s entries as `[key, value]` tuples.
       *
       * Note: this will return an ES6 iterator which does not support Immutable JS sequence algorithms. Use `entrySeq` instead, if this is what you want.
       */
  def entries(): Iterator[js.Array[_]] = js.native
  /**
       * Returns a new Seq.Indexed of [key, value] tuples.
       */
  def entrySeq(): immutableLib.immutableMod.SeqNs.Indexed[js.Array[_]] = js.native
  // Value equality
  /**
       * True if this and the other Iterable have value equality, as defined
       * by `Immutable.is()`.
       *
       * Note: This is equivalent to `Immutable.is(this, other)`, but provided to
       * allow for chained expressions.
       */
  def equals(other: Iterable[K, V]): scala.Boolean = js.native
  /**
       * True if `predicate` returns true for all entries in the Iterable.
       */
  def every(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  /**
       * True if `predicate` returns true for all entries in the Iterable.
       */
  def every(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): scala.Boolean = js.native
  /**
       * Returns a new Iterable of the same type with only the entries for which
       * the `predicate` function returns true.
       *
       *     Seq({a:1,b:2,c:3,d:4}).filter(x => x % 2 === 0)
       *     // Seq { b: 2, d: 4 }
       *
       */
  def filter(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type with only the entries for which
       * the `predicate` function returns true.
       *
       *     Seq({a:1,b:2,c:3,d:4}).filter(x => x % 2 === 0)
       *     // Seq { b: 2, d: 4 }
       *
       */
  def filter(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type with only the entries for which
       * the `predicate` function returns false.
       *
       *     Seq({a:1,b:2,c:3,d:4}).filterNot(x => x % 2 === 0)
       *     // Seq { a: 1, c: 3 }
       *
       */
  def filterNot(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type with only the entries for which
       * the `predicate` function returns false.
       *
       *     Seq({a:1,b:2,c:3,d:4}).filterNot(x => x % 2 === 0)
       *     // Seq { a: 1, c: 3 }
       *
       */
  def filterNot(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): Iterable[K, V] = js.native
  // Search for value
  /**
       * Returns the first value for which the `predicate` returns true.
       */
  def find(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): V = js.native
  // Search for value
  /**
       * Returns the first value for which the `predicate` returns true.
       */
  def find(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): V = js.native
  // Search for value
  /**
       * Returns the first value for which the `predicate` returns true.
       */
  def find(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any,
    notSetValue: V
  ): V = js.native
  /**
       * Returns the first [key, value] entry for which the `predicate` returns true.
       */
  def findEntry(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): js.Array[_] = js.native
  /**
       * Returns the first [key, value] entry for which the `predicate` returns true.
       */
  def findEntry(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): js.Array[_] = js.native
  /**
       * Returns the first [key, value] entry for which the `predicate` returns true.
       */
  def findEntry(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any,
    notSetValue: V
  ): js.Array[_] = js.native
  /**
       * Returns the key for which the `predicate` returns true.
       */
  def findKey(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[immutableLib.immutableMod.IterableNs.Keyed[K, V]], 
      scala.Boolean
    ]
  ): K = js.native
  /**
       * Returns the key for which the `predicate` returns true.
       */
  def findKey(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[immutableLib.immutableMod.IterableNs.Keyed[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): K = js.native
  /**
       * Returns the last value for which the `predicate` returns true.
       *
       * Note: `predicate` will be called for each entry in reverse.
       */
  def findLast(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): V = js.native
  /**
       * Returns the last value for which the `predicate` returns true.
       *
       * Note: `predicate` will be called for each entry in reverse.
       */
  def findLast(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): V = js.native
  /**
       * Returns the last value for which the `predicate` returns true.
       *
       * Note: `predicate` will be called for each entry in reverse.
       */
  def findLast(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any,
    notSetValue: V
  ): V = js.native
  /**
       * Returns the last [key, value] entry for which the `predicate`
       * returns true.
       *
       * Note: `predicate` will be called for each entry in reverse.
       */
  def findLastEntry(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): js.Array[_] = js.native
  /**
       * Returns the last [key, value] entry for which the `predicate`
       * returns true.
       *
       * Note: `predicate` will be called for each entry in reverse.
       */
  def findLastEntry(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): js.Array[_] = js.native
  /**
       * Returns the last [key, value] entry for which the `predicate`
       * returns true.
       *
       * Note: `predicate` will be called for each entry in reverse.
       */
  def findLastEntry(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any,
    notSetValue: V
  ): js.Array[_] = js.native
  /**
       * Returns the last key for which the `predicate` returns true.
       *
       * Note: `predicate` will be called for each entry in reverse.
       */
  def findLastKey(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[immutableLib.immutableMod.IterableNs.Keyed[K, V]], 
      scala.Boolean
    ]
  ): K = js.native
  /**
       * Returns the last key for which the `predicate` returns true.
       *
       * Note: `predicate` will be called for each entry in reverse.
       */
  def findLastKey(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[immutableLib.immutableMod.IterableNs.Keyed[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): K = js.native
  /**
       * The first value in the Iterable.
       */
  def first(): V = js.native
  /**
       * Flat-maps the Iterable, returning an Iterable of the same type.
       *
       * Similar to `iter.map(...).flatten(true)`.
       */
  def flatMap[MK, MV](
    mapper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      _ | (Iterable[MK, MV])
    ]
  ): Iterable[MK, MV] = js.native
  /**
       * Flat-maps the Iterable, returning an Iterable of the same type.
       *
       * Similar to `iter.map(...).flatten(true)`.
       */
  def flatMap[MK, MV](
    mapper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      _ | (Iterable[MK, MV])
    ],
    context: js.Any
  ): Iterable[MK, MV] = js.native
  /**
       * Flattens nested Iterables.
       *
       * Will deeply flatten the Iterable by default, returning an Iterable of the
       * same type, but a `depth` can be provided in the form of a number or
       * boolean (where true means to shallowly flatten one level). A depth of 0
       * (or shallow: false) will deeply flatten.
       *
       * Flattens only others Iterable, not Arrays or Objects.
       *
       * Note: `flatten(true)` operates on Iterable<any, Iterable<K, V>> and
       * returns Iterable<K, V>
       */
  def flatten(): Iterable[_, _] = js.native
  /**
       * Flattens nested Iterables.
       *
       * Will deeply flatten the Iterable by default, returning an Iterable of the
       * same type, but a `depth` can be provided in the form of a number or
       * boolean (where true means to shallowly flatten one level). A depth of 0
       * (or shallow: false) will deeply flatten.
       *
       * Flattens only others Iterable, not Arrays or Objects.
       *
       * Note: `flatten(true)` operates on Iterable<any, Iterable<K, V>> and
       * returns Iterable<K, V>
       */
  def flatten(depth: scala.Double): Iterable[_, _] = js.native
  def flatten(shallow: scala.Boolean): Iterable[_, _] = js.native
  // Side effects
  /**
       * The `sideEffect` is executed for every entry in the Iterable.
       *
       * Unlike `Array#forEach`, if any call of `sideEffect` returns
       * `false`, the iteration will stop. Returns the number of entries iterated
       * (including the last iteration which returned false).
       */
  def forEach(
    sideEffect: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      _
    ]
  ): scala.Double = js.native
  // Side effects
  /**
       * The `sideEffect` is executed for every entry in the Iterable.
       *
       * Unlike `Array#forEach`, if any call of `sideEffect` returns
       * `false`, the iteration will stop. Returns the number of entries iterated
       * (including the last iteration which returned false).
       */
  def forEach(
    sideEffect: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      _
    ],
    context: js.Any
  ): scala.Double = js.native
  // Reading values
  /**
       * Returns the value associated with the provided key, or notSetValue if
       * the Iterable does not contain this key.
       *
       * Note: it is possible a key may be associated with an `undefined` value,
       * so if `notSetValue` is not provided and this method returns `undefined`,
       * that does not guarantee the key was not found.
       */
  def get(key: K): V = js.native
  // Reading values
  /**
       * Returns the value associated with the provided key, or notSetValue if
       * the Iterable does not contain this key.
       *
       * Note: it is possible a key may be associated with an `undefined` value,
       * so if `notSetValue` is not provided and this method returns `undefined`,
       * that does not guarantee the key was not found.
       */
  def get(key: K, notSetValue: V): V = js.native
  def getIn(searchKeyPath: Iterable[_, _]): js.Any = js.native
  def getIn(searchKeyPath: Iterable[_, _], notSetValue: js.Any): js.Any = js.native
  // Reading deep values
  /**
       * Returns the value found by following a path of keys or indices through
       * nested Iterables.
       */
  def getIn(searchKeyPath: js.Array[_]): js.Any = js.native
  // Reading deep values
  /**
       * Returns the value found by following a path of keys or indices through
       * nested Iterables.
       */
  def getIn(searchKeyPath: js.Array[_], notSetValue: js.Any): js.Any = js.native
  /**
       * Returns a `Iterable.Keyed` of `Iterable.Keyeds`, grouped by the return
       * value of the `grouper` function.
       *
       * Note: This is always an eager operation.
       */
  def groupBy[G](
    grouper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      G
    ]
  ): immutableLib.immutableMod.SeqNs.Keyed[G, Iterable[K, V]] = js.native
  /**
       * Returns a `Iterable.Keyed` of `Iterable.Keyeds`, grouped by the return
       * value of the `grouper` function.
       *
       * Note: This is always an eager operation.
       */
  def groupBy[G](
    grouper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      G
    ],
    context: js.Any
  ): immutableLib.immutableMod.SeqNs.Keyed[G, Iterable[K, V]] = js.native
  /**
       * True if a key exists within this `Iterable`, using `Immutable.is` to determine equality
       */
  def has(key: K): scala.Boolean = js.native
  def hasIn(searchKeyPath: Iterable[_, _]): scala.Boolean = js.native
  /**
       * True if the result of following a path of keys or indices through nested
       * Iterables results in a set value.
       */
  def hasIn(searchKeyPath: js.Array[_]): scala.Boolean = js.native
  /**
       * True if a value exists within this `Iterable`, using `Immutable.is` to determine equality
       * @alias contains
       */
  def includes(value: V): scala.Boolean = js.native
  /**
       * Returns true if this Iterable includes no values.
       *
       * For some lazy `Seq`, `isEmpty` might need to iterate to determine
       * emptiness. At most one iteration will occur.
       */
  def isEmpty(): scala.Boolean = js.native
  // Comparison
  /**
       * True if `iter` includes every value in this Iterable.
       */
  def isSubset(iter: Iterable[_, V]): scala.Boolean = js.native
  def isSubset(iter: js.Array[V]): scala.Boolean = js.native
  /**
       * True if this Iterable includes every value in `iter`.
       */
  def isSuperset(iter: Iterable[_, V]): scala.Boolean = js.native
  def isSuperset(iter: js.Array[V]): scala.Boolean = js.native
  /**
       * Joins values together as a string, inserting a separator between each.
       * The default separator is `","`.
       */
  def join(): java.lang.String = js.native
  /**
       * Joins values together as a string, inserting a separator between each.
       * The default separator is `","`.
       */
  def join(separator: java.lang.String): java.lang.String = js.native
  /**
       * Returns the key associated with the search value, or undefined.
       */
  def keyOf(searchValue: V): K = js.native
  // Iterables (Seq)
  /**
       * Returns a new Seq.Indexed of the keys of this Iterable,
       * discarding values.
       */
  def keySeq(): immutableLib.immutableMod.SeqNs.Indexed[K] = js.native
  // Iterators
  /**
       * An iterator of this `Iterable`'s keys.
       *
       * Note: this will return an ES6 iterator which does not support Immutable JS sequence algorithms. Use `keySeq` instead, if this is what you want.
       */
  def keys(): Iterator[K] = js.native
  /**
       * The last value in the Iterable.
       */
  def last(): V = js.native
  /**
       * Returns the last key associated with the search value, or undefined.
       */
  def lastKeyOf(searchValue: V): K = js.native
  // Sequence algorithms
  /**
       * Returns a new Iterable of the same type with values passed through a
       * `mapper` function.
       *
       *     Seq({ a: 1, b: 2 }).map(x => 10 * x)
       *     // Seq { a: 10, b: 20 }
       *
       */
  def map[M](
    mapper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      M
    ]
  ): Iterable[K, M] = js.native
  // Sequence algorithms
  /**
       * Returns a new Iterable of the same type with values passed through a
       * `mapper` function.
       *
       *     Seq({ a: 1, b: 2 }).map(x => 10 * x)
       *     // Seq { a: 10, b: 20 }
       *
       */
  def map[M](
    mapper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      M
    ],
    context: js.Any
  ): Iterable[K, M] = js.native
  /**
       * Returns the maximum value in this collection. If any values are
       * comparatively equivalent, the first one found will be returned.
       *
       * The `comparator` is used in the same way as `Iterable#sort`. If it is not
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
  def max(): V = js.native
  /**
       * Returns the maximum value in this collection. If any values are
       * comparatively equivalent, the first one found will be returned.
       *
       * The `comparator` is used in the same way as `Iterable#sort`. If it is not
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
  def max(comparator: js.Function2[/* valueA */ V, /* valueB */ V, scala.Double]): V = js.native
  /**
       * Like `max`, but also accepts a `comparatorValueMapper` which allows for
       * comparing by more sophisticated means:
       *
       *     hitters.maxBy(hitter => hitter.avgHits);
       *
       */
  def maxBy[C](
    comparatorValueMapper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      C
    ]
  ): V = js.native
  /**
       * Like `max`, but also accepts a `comparatorValueMapper` which allows for
       * comparing by more sophisticated means:
       *
       *     hitters.maxBy(hitter => hitter.avgHits);
       *
       */
  def maxBy[C](
    comparatorValueMapper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      C
    ],
    comparator: js.Function2[/* valueA */ C, /* valueB */ C, scala.Double]
  ): V = js.native
  /**
       * Returns the minimum value in this collection. If any values are
       * comparatively equivalent, the first one found will be returned.
       *
       * The `comparator` is used in the same way as `Iterable#sort`. If it is not
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
  def min(): V = js.native
  /**
       * Returns the minimum value in this collection. If any values are
       * comparatively equivalent, the first one found will be returned.
       *
       * The `comparator` is used in the same way as `Iterable#sort`. If it is not
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
  def min(comparator: js.Function2[/* valueA */ V, /* valueB */ V, scala.Double]): V = js.native
  /**
       * Like `min`, but also accepts a `comparatorValueMapper` which allows for
       * comparing by more sophisticated means:
       *
       *     hitters.minBy(hitter => hitter.avgHits);
       *
       */
  def minBy[C](
    comparatorValueMapper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      C
    ]
  ): V = js.native
  /**
       * Like `min`, but also accepts a `comparatorValueMapper` which allows for
       * comparing by more sophisticated means:
       *
       *     hitters.minBy(hitter => hitter.avgHits);
       *
       */
  def minBy[C](
    comparatorValueMapper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      C
    ],
    comparator: js.Function2[/* valueA */ C, /* valueB */ C, scala.Double]
  ): V = js.native
  // Reducing a value
  /**
       * Reduces the Iterable to a value by calling the `reducer` for every entry
       * in the Iterable and passing along the reduced value.
       *
       * If `initialReduction` is not provided, or is null, the first item in the
       * Iterable will be used.
       *
       * @see `Array#reduce`.
       */
  def reduce[R](
    reducer: js.Function4[
      /* reduction */ js.UndefOr[R], 
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      R
    ]
  ): R = js.native
  // Reducing a value
  /**
       * Reduces the Iterable to a value by calling the `reducer` for every entry
       * in the Iterable and passing along the reduced value.
       *
       * If `initialReduction` is not provided, or is null, the first item in the
       * Iterable will be used.
       *
       * @see `Array#reduce`.
       */
  def reduce[R](
    reducer: js.Function4[
      /* reduction */ js.UndefOr[R], 
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      R
    ],
    initialReduction: R
  ): R = js.native
  // Reducing a value
  /**
       * Reduces the Iterable to a value by calling the `reducer` for every entry
       * in the Iterable and passing along the reduced value.
       *
       * If `initialReduction` is not provided, or is null, the first item in the
       * Iterable will be used.
       *
       * @see `Array#reduce`.
       */
  def reduce[R](
    reducer: js.Function4[
      /* reduction */ js.UndefOr[R], 
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      R
    ],
    initialReduction: R,
    context: js.Any
  ): R = js.native
  /**
       * Reduces the Iterable in reverse (from the right side).
       *
       * Note: Similar to this.reverse().reduce(), and provided for parity
       * with `Array#reduceRight`.
       */
  def reduceRight[R](
    reducer: js.Function4[
      /* reduction */ js.UndefOr[R], 
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      R
    ]
  ): R = js.native
  /**
       * Reduces the Iterable in reverse (from the right side).
       *
       * Note: Similar to this.reverse().reduce(), and provided for parity
       * with `Array#reduceRight`.
       */
  def reduceRight[R](
    reducer: js.Function4[
      /* reduction */ js.UndefOr[R], 
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      R
    ],
    initialReduction: R
  ): R = js.native
  /**
       * Reduces the Iterable in reverse (from the right side).
       *
       * Note: Similar to this.reverse().reduce(), and provided for parity
       * with `Array#reduceRight`.
       */
  def reduceRight[R](
    reducer: js.Function4[
      /* reduction */ js.UndefOr[R], 
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      R
    ],
    initialReduction: R,
    context: js.Any
  ): R = js.native
  /**
       * Returns a new Iterable of the same type containing all entries except
       * the first.
       */
  def rest(): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type in reverse order.
       */
  def reverse(): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which excludes the first `amount`
       * entries from this Iterable.
       */
  def skip(amount: scala.Double): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which excludes the last `amount`
       * entries from this Iterable.
       */
  def skipLast(amount: scala.Double): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes entries starting
       * from when `predicate` first returns true.
       *
       *     Seq.of('dog','frog','cat','hat','god')
       *       .skipUntil(x => x.match(/hat/))
       *     // Seq [ 'hat', 'god' ]
       *
       */
  def skipUntil(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes entries starting
       * from when `predicate` first returns true.
       *
       *     Seq.of('dog','frog','cat','hat','god')
       *       .skipUntil(x => x.match(/hat/))
       *     // Seq [ 'hat', 'god' ]
       *
       */
  def skipUntil(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes entries starting
       * from when `predicate` first returns false.
       *
       *     Seq.of('dog','frog','cat','hat','god')
       *       .skipWhile(x => x.match(/g/))
       *     // Seq [ 'cat', 'hat', 'god' ]
       *
       */
  def skipWhile(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes entries starting
       * from when `predicate` first returns false.
       *
       *     Seq.of('dog','frog','cat','hat','god')
       *       .skipWhile(x => x.match(/g/))
       *     // Seq [ 'cat', 'hat', 'god' ]
       *
       */
  def skipWhile(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): Iterable[K, V] = js.native
  // Creating subsets
  /**
       * Returns a new Iterable of the same type representing a portion of this
       * Iterable from start up to but not including end.
       *
       * If begin is negative, it is offset from the end of the Iterable. e.g.
       * `slice(-2)` returns a Iterable of the last two entries. If it is not
       * provided the new Iterable will begin at the beginning of this Iterable.
       *
       * If end is negative, it is offset from the end of the Iterable. e.g.
       * `slice(0, -1)` returns an Iterable of everything but the last entry. If
       * it is not provided, the new Iterable will continue through the end of
       * this Iterable.
       *
       * If the requested slice is equivalent to the current Iterable, then it
       * will return itself.
       */
  def slice(): Iterable[K, V] = js.native
  // Creating subsets
  /**
       * Returns a new Iterable of the same type representing a portion of this
       * Iterable from start up to but not including end.
       *
       * If begin is negative, it is offset from the end of the Iterable. e.g.
       * `slice(-2)` returns a Iterable of the last two entries. If it is not
       * provided the new Iterable will begin at the beginning of this Iterable.
       *
       * If end is negative, it is offset from the end of the Iterable. e.g.
       * `slice(0, -1)` returns an Iterable of everything but the last entry. If
       * it is not provided, the new Iterable will continue through the end of
       * this Iterable.
       *
       * If the requested slice is equivalent to the current Iterable, then it
       * will return itself.
       */
  def slice(begin: scala.Double): Iterable[K, V] = js.native
  // Creating subsets
  /**
       * Returns a new Iterable of the same type representing a portion of this
       * Iterable from start up to but not including end.
       *
       * If begin is negative, it is offset from the end of the Iterable. e.g.
       * `slice(-2)` returns a Iterable of the last two entries. If it is not
       * provided the new Iterable will begin at the beginning of this Iterable.
       *
       * If end is negative, it is offset from the end of the Iterable. e.g.
       * `slice(0, -1)` returns an Iterable of everything but the last entry. If
       * it is not provided, the new Iterable will continue through the end of
       * this Iterable.
       *
       * If the requested slice is equivalent to the current Iterable, then it
       * will return itself.
       */
  def slice(begin: scala.Double, end: scala.Double): Iterable[K, V] = js.native
  /**
       * True if `predicate` returns true for any entry in the Iterable.
       */
  def some(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  /**
       * True if `predicate` returns true for any entry in the Iterable.
       */
  def some(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): scala.Boolean = js.native
  /**
       * Returns a new Iterable of the same type which includes the same entries,
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
       */
  def sort(): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes the same entries,
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
       */
  def sort(comparator: js.Function2[/* valueA */ V, /* valueB */ V, scala.Double]): Iterable[K, V] = js.native
  /**
       * Like `sort`, but also accepts a `comparatorValueMapper` which allows for
       * sorting by more sophisticated means:
       *
       *     hitters.sortBy(hitter => hitter.avgHits);
       *
       */
  def sortBy[C](
    comparatorValueMapper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      C
    ]
  ): Iterable[K, V] = js.native
  /**
       * Like `sort`, but also accepts a `comparatorValueMapper` which allows for
       * sorting by more sophisticated means:
       *
       *     hitters.sortBy(hitter => hitter.avgHits);
       *
       */
  def sortBy[C](
    comparatorValueMapper: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      C
    ],
    comparator: js.Function2[/* valueA */ C, /* valueB */ C, scala.Double]
  ): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes the first `amount`
       * entries from this Iterable.
       */
  def take(amount: scala.Double): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes the last `amount`
       * entries from this Iterable.
       */
  def takeLast(amount: scala.Double): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes entries from this
       * Iterable as long as the `predicate` returns false.
       *
       *     Seq.of('dog','frog','cat','hat','god').takeUntil(x => x.match(/at/))
       *     // ['dog', 'frog']
       *
       */
  def takeUntil(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes entries from this
       * Iterable as long as the `predicate` returns false.
       *
       *     Seq.of('dog','frog','cat','hat','god').takeUntil(x => x.match(/at/))
       *     // ['dog', 'frog']
       *
       */
  def takeUntil(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes entries from this
       * Iterable as long as the `predicate` returns true.
       *
       *     Seq.of('dog','frog','cat','hat','god')
       *       .takeWhile(x => x.match(/o/))
       *     // Seq [ 'dog', 'frog' ]
       *
       */
  def takeWhile(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ]
  ): Iterable[K, V] = js.native
  /**
       * Returns a new Iterable of the same type which includes entries from this
       * Iterable as long as the `predicate` returns true.
       *
       *     Seq.of('dog','frog','cat','hat','god')
       *       .takeWhile(x => x.match(/o/))
       *     // Seq [ 'dog', 'frog' ]
       *
       */
  def takeWhile(
    predicate: js.Function3[
      /* value */ js.UndefOr[V], 
      /* key */ js.UndefOr[K], 
      /* iter */ js.UndefOr[Iterable[K, V]], 
      scala.Boolean
    ],
    context: js.Any
  ): Iterable[K, V] = js.native
  /**
       * Shallowly converts this iterable to an Array, discarding keys.
       */
  def toArray(): js.Array[V] = js.native
  /**
       * Returns an Seq.Indexed of the values of this Iterable, discarding keys.
       */
  def toIndexedSeq(): immutableLib.immutableMod.SeqNs.Indexed[V] = js.native
  // Conversion to JavaScript types
  /**
       * Deeply converts this Iterable to equivalent JS.
       *
       * `Iterable.Indexeds`, and `Iterable.Sets` become Arrays, while
       * `Iterable.Keyeds` become Objects.
       *
       * @alias toJSON
       */
  def toJS(): js.Any = js.native
  /**
       * Returns a Seq.Keyed from this Iterable where indices are treated as keys.
       *
       * This is useful if you want to operate on an
       * Iterable.Indexed and preserve the [index, value] pairs.
       *
       * The returned Seq will have identical iteration order as
       * this Iterable.
       *
       * Example:
       *
       *     var indexedSeq = Immutable.Seq.of('A', 'B', 'C');
       *     indexedSeq.filter(v => v === 'B').toString() // Seq [ 'B' ]
       *     var keyedSeq = indexedSeq.toKeyedSeq();
       *     keyedSeq.filter(v => v === 'B').toString() // Seq { 1: 'B' }
       *
       */
  def toKeyedSeq(): immutableLib.immutableMod.SeqNs.Keyed[K, V] = js.native
  /**
       * Converts this Iterable to a List, discarding keys.
       *
       * Note: This is equivalent to `List(this)`, but provided to allow
       * for chained expressions.
       */
  def toList(): List[V] = js.native
  // Conversion to Collections
  /**
       * Converts this Iterable to a Map, Throws if keys are not hashable.
       *
       * Note: This is equivalent to `Map(this.toKeyedSeq())`, but provided
       * for convenience and to allow for chained expressions.
       */
  def toMap(): Map[K, V] = js.native
  /**
       * Shallowly converts this Iterable to an Object.
       *
       * Throws if keys are not strings.
       */
  def toObject(): ScalablyTyped.runtime.StringDictionary[V] = js.native
  /**
       * Converts this Iterable to a Map, maintaining the order of iteration.
       *
       * Note: This is equivalent to `OrderedMap(this.toKeyedSeq())`, but
       * provided for convenience and to allow for chained expressions.
       */
  def toOrderedMap(): OrderedMap[K, V] = js.native
  /**
       * Converts this Iterable to a Set, maintaining the order of iteration and
       * discarding keys.
       *
       * Note: This is equivalent to `OrderedSet(this.valueSeq())`, but provided
       * for convenience and to allow for chained expressions.
       */
  def toOrderedSet(): OrderedSet[V] = js.native
  // Conversion to Seq
  /**
       * Converts this Iterable to a Seq of the same kind (indexed,
       * keyed, or set).
       */
  def toSeq(): Seq[K, V] = js.native
  /**
       * Converts this Iterable to a Set, discarding keys. Throws if values
       * are not hashable.
       *
       * Note: This is equivalent to `Set(this)`, but provided to allow for
       * chained expressions.
       */
  def toSet(): Set[V] = js.native
  /**
       * Returns a Seq.Set of the values of this Iterable, discarding keys.
       */
  def toSetSeq(): immutableLib.immutableMod.SeqNs.Set[V] = js.native
  /**
       * Converts this Iterable to a Stack, discarding keys. Throws if values
       * are not hashable.
       *
       * Note: This is equivalent to `Stack(this)`, but provided to allow for
       * chained expressions.
       */
  def toStack(): Stack[V] = js.native
  /**
       * Returns an Seq.Indexed of the values of this Iterable, discarding keys.
       */
  def valueSeq(): immutableLib.immutableMod.SeqNs.Indexed[V] = js.native
  /**
       * An iterator of this `Iterable`'s values.
       *
       * Note: this will return an ES6 iterator which does not support Immutable JS sequence algorithms. Use `valueSeq` instead, if this is what you want.
       */
  def values(): Iterator[V] = js.native
}

