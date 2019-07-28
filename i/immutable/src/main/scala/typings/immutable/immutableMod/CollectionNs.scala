package typings.immutable.immutableMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.CollectionNs.Indexed
import typings.immutable.immutableMod.CollectionNs.Keyed
import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Collection")
@js.native
object CollectionNs extends js.Object {
  @js.native
  trait Indexed[T] extends Collection[Double, T] {
    @JSName(scala.scalajs.js.Symbol.iterator)
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
    ): Indexed[F] = js.native
    @JSName("filter")
    def filter_F_T_Indexed[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): Indexed[F] = js.native
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
    def fromEntrySeq(): typings.immutable.immutableMod.SeqNs.Keyed[_, _] = js.native
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
    def interleave(collections: (Collection[_, T])*): this.type = js.native
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
    def zip(collections: (Collection[_, _])*): Indexed[_] = js.native
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
    def zip[U](other: Collection[_, U]): Indexed[js.Tuple2[T, U]] = js.native
    def zip[U, V](other: Collection[_, U], other2: Collection[_, V]): Indexed[js.Tuple3[T, U, V]] = js.native
    def zipAll(collections: (Collection[_, _])*): Indexed[_] = js.native
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
    def zipAll[U](other: Collection[_, U]): Indexed[js.Tuple2[T, U]] = js.native
    def zipAll[U, V](other: Collection[_, U], other2: Collection[_, V]): Indexed[js.Tuple3[T, U, V]] = js.native
    def zipWith[Z](zipper: js.Function1[/* repeated */ js.Any, Z], collections: (Collection[_, _])*): Indexed[Z] = js.native
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
    def zipWith[U, Z](zipper: js.Function2[/* value */ T, /* otherValue */ U, Z], otherCollection: Collection[_, U]): Indexed[Z] = js.native
    def zipWith[U, V, Z](
      zipper: js.Function3[/* value */ T, /* otherValue */ U, /* thirdValue */ V, Z],
      otherCollection: Collection[_, U],
      thirdCollection: Collection[_, V]
    ): Indexed[Z] = js.native
  }
  
  @js.native
  trait Keyed[K, V] extends Collection[K, V] {
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    /**
      * Returns a new Collection with other collections concatenated to this one.
      */
    @JSName("concat")
    def concat_KCVC[KC, VC](collections: (Iterable[js.Tuple2[KC, VC]])*): Keyed[K | KC, V | VC] = js.native
    /**
      * Returns a new Collection with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_V_Keyed[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): Keyed[K, F] = js.native
    @JSName("filter")
    def filter_F_V_Keyed[F /* <: V */](
      predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): Keyed[K, F] = js.native
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
    def flip(): Keyed[V, K] = js.native
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
    ): Keyed[KM, VM] = js.native
    def mapEntries[KM, VM](
      mapper: js.Function3[
          /* entry */ js.Tuple2[K, V], 
          /* index */ Double, 
          /* iter */ this.type, 
          js.Tuple2[KM, VM]
        ],
      context: js.Any
    ): Keyed[KM, VM] = js.native
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
    def mapKeys[M](mapper: js.Function3[/* key */ K, /* value */ V, /* iter */ this.type, M]): Keyed[M, V] = js.native
    def mapKeys[M](mapper: js.Function3[/* key */ K, /* value */ V, /* iter */ this.type, M], context: js.Any): Keyed[M, V] = js.native
  }
  
  @js.native
  trait Set[T] extends Collection[T, T] {
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[T]] = js.native
    /**
      * Returns a new Collection with only the values for which the `predicate`
      * function returns true.
      *
      * Note: `filter()` always returns a new instance, even if it results in
      * not filtering out any values.
      */
    @JSName("filter")
    def filter_F_T_Set[F /* <: T */](predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean]): typings.immutable.immutableMod.CollectionNs.Set[F] = js.native
    @JSName("filter")
    def filter_F_T_Set[F /* <: T */](
      predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean],
      context: js.Any
    ): typings.immutable.immutableMod.CollectionNs.Set[F] = js.native
  }
  
  def Indexed[T](collection: Iterable[T]): Indexed[T] = js.native
  def Keyed[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
  def Keyed[K, V](collection: Iterable[js.Tuple2[K, V]]): Keyed[K, V] = js.native
  def Set[T](collection: Iterable[T]): typings.immutable.immutableMod.CollectionNs.Set[T] = js.native
  /**
    * @deprecated use `const { isAssociative } = require('immutable')`
    */
  def isAssociative(maybeAssociative: js.Any): Boolean = js.native
  /**
    * @deprecated use `const { isIndexed } = require('immutable')`
    */
  def isIndexed(maybeIndexed: js.Any): /* is immutable.immutable.Collection.Indexed<any> */ Boolean = js.native
  /**
    * @deprecated use `const { isKeyed } = require('immutable')`
    */
  def isKeyed(maybeKeyed: js.Any): /* is immutable.immutable.Collection.Keyed<any, any> */ Boolean = js.native
  /**
    * @deprecated use `const { isOrdered } = require('immutable')`
    */
  def isOrdered(maybeOrdered: js.Any): Boolean = js.native
}

