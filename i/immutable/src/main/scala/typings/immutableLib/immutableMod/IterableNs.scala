package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Iterable")
@js.native
object IterableNs extends js.Object {
  @js.native
  trait Indexed[T]
    extends immutableLib.immutableMod.Iterable[scala.Double, T] {
    /**
           * Returns the first index in the Iterable where a value satisfies the
           * provided predicate function. Otherwise -1 is returned.
           */
    def findIndex(
      predicate: js.Function3[
          /* value */ js.UndefOr[T], 
          /* index */ js.UndefOr[scala.Double], 
          /* iter */ js.UndefOr[Indexed[T]], 
          scala.Boolean
        ]
    ): scala.Double = js.native
    /**
           * Returns the first index in the Iterable where a value satisfies the
           * provided predicate function. Otherwise -1 is returned.
           */
    def findIndex(
      predicate: js.Function3[
          /* value */ js.UndefOr[T], 
          /* index */ js.UndefOr[scala.Double], 
          /* iter */ js.UndefOr[Indexed[T]], 
          scala.Boolean
        ],
      context: js.Any
    ): scala.Double = js.native
    /**
           * Returns the last index in the Iterable where a value satisfies the
           * provided predicate function. Otherwise -1 is returned.
           */
    def findLastIndex(
      predicate: js.Function3[
          /* value */ js.UndefOr[T], 
          /* index */ js.UndefOr[scala.Double], 
          /* iter */ js.UndefOr[Indexed[T]], 
          scala.Boolean
        ]
    ): scala.Double = js.native
    /**
           * Returns the last index in the Iterable where a value satisfies the
           * provided predicate function. Otherwise -1 is returned.
           */
    def findLastIndex(
      predicate: js.Function3[
          /* value */ js.UndefOr[T], 
          /* index */ js.UndefOr[scala.Double], 
          /* iter */ js.UndefOr[Indexed[T]], 
          scala.Boolean
        ],
      context: js.Any
    ): scala.Double = js.native
    /**
           * If this is an iterable of [key, value] entry tuples, it will return a
           * Seq.Keyed of those entries.
           */
    def fromEntrySeq(): immutableLib.immutableMod.SeqNs.Keyed[_, _] = js.native
    // Search for value
    /**
           * Returns the first index at which a given value can be found in the
           * Iterable, or -1 if it is not present.
           */
    def indexOf(searchValue: T): scala.Double = js.native
    /**
           * Returns an Iterable of the same type with the provided `iterables`
           * interleaved into this iterable.
           *
           * The resulting Iterable includes the first item from each, then the
           * second from each, etc.
           *
           *     I.Seq.of(1,2,3).interleave(I.Seq.of('A','B','C'))
           *     // Seq [ 1, 'A', 2, 'B', 3, 'C' ]
           *
           * The shortest Iterable stops interleave.
           *
           *     I.Seq.of(1,2,3).interleave(
           *       I.Seq.of('A','B'),
           *       I.Seq.of('X','Y','Z')
           *     )
           *     // Seq [ 1, 'A', 'X', 2, 'B', 'Y' ]
           */
    def interleave(iterables: (immutableLib.immutableMod.Iterable[_, T])*): Indexed[T] = js.native
    // Combination
    /**
           * Returns an Iterable of the same type with `separator` between each item
           * in this Iterable.
           */
    def interpose(separator: T): Indexed[T] = js.native
    /**
           * Returns the last index at which a given value can be found in the
           * Iterable, or -1 if it is not present.
           */
    def lastIndexOf(searchValue: T): scala.Double = js.native
    /**
           * Splice returns a new indexed Iterable by replacing a region of this
           * Iterable with new values. If values are not provided, it only skips the
           * region to be removed.
           *
           * `index` may be a negative number, which indexes back from the end of the
           * Iterable. `s.splice(-2)` splices after the second to last item.
           *
           *     Seq(['a','b','c','d']).splice(1, 2, 'q', 'r', 's')
           *     // Seq ['a', 'q', 'r', 's', 'd']
           *
           */
    def splice(index: scala.Double, removeNum: scala.Double, values: js.Any*): Indexed[T] = js.native
    /**
           * Returns an Iterable of the same type "zipped" with the provided
           * iterables.
           *
           * Like `zipWith`, but using the default `zipper`: creating an `Array`.
           *
           *     var a = Seq.of(1, 2, 3);
           *     var b = Seq.of(4, 5, 6);
           *     var c = a.zip(b); // Seq [ [ 1, 4 ], [ 2, 5 ], [ 3, 6 ] ]
           *
           */
    def zip(iterables: (immutableLib.immutableMod.Iterable[_, _])*): Indexed[_] = js.native
    def zipWith[Z](
      zipper: js.Function1[/* repeated */js.Any, Z],
      iterables: (immutableLib.immutableMod.Iterable[_, _])*
    ): Indexed[Z] = js.native
    /**
           * Returns an Iterable of the same type "zipped" with the provided
           * iterables by using a custom `zipper` function.
           *
           *     var a = Seq.of(1, 2, 3);
           *     var b = Seq.of(4, 5, 6);
           *     var c = a.zipWith((a, b) => a + b, b); // Seq [ 5, 7, 9 ]
           *
           */
    def zipWith[U, Z](
      zipper: js.Function2[/* value */ T, /* otherValue */ U, Z],
      otherIterable: immutableLib.immutableMod.Iterable[_, U]
    ): Indexed[Z] = js.native
    def zipWith[U, V, Z](
      zipper: js.Function3[/* value */ T, /* otherValue */ U, /* thirdValue */ V, Z],
      otherIterable: immutableLib.immutableMod.Iterable[_, U],
      thirdIterable: immutableLib.immutableMod.Iterable[_, V]
    ): Indexed[Z] = js.native
  }
  
  @js.native
  trait Keyed[K, V]
    extends immutableLib.immutableMod.Iterable[K, V] {
    // Sequence functions
    /**
           * Returns a new Iterable.Keyed of the same type where the keys and values
           * have been flipped.
           *
           *     Seq({ a: 'z', b: 'y' }).flip() // { z: 'a', y: 'b' }
           *
           */
    def flip(): Keyed[V, K] = js.native
    /**
           * Returns a new Iterable.Keyed of the same type with entries
           * ([key, value] tuples) passed through a `mapper` function.
           *
           *     Seq({ a: 1, b: 2 })
           *       .mapEntries(([k, v]) => [k.toUpperCase(), v * 2])
           *     // Seq { A: 2, B: 4 }
           *
           */
    def mapEntries[KM, VM](
      mapper: js.Function3[
          /* entry */ js.UndefOr[js.Array[_]], 
          /* index */ js.UndefOr[scala.Double], 
          /* iter */ js.UndefOr[Keyed[K, V]], 
          js.Array[_]
        ]
    ): Keyed[KM, VM] = js.native
    /**
           * Returns a new Iterable.Keyed of the same type with entries
           * ([key, value] tuples) passed through a `mapper` function.
           *
           *     Seq({ a: 1, b: 2 })
           *       .mapEntries(([k, v]) => [k.toUpperCase(), v * 2])
           *     // Seq { A: 2, B: 4 }
           *
           */
    def mapEntries[KM, VM](
      mapper: js.Function3[
          /* entry */ js.UndefOr[js.Array[_]], 
          /* index */ js.UndefOr[scala.Double], 
          /* iter */ js.UndefOr[Keyed[K, V]], 
          js.Array[_]
        ],
      context: js.Any
    ): Keyed[KM, VM] = js.native
    /**
           * Returns a new Iterable.Keyed of the same type with keys passed through
           * a `mapper` function.
           *
           *     Seq({ a: 1, b: 2 })
           *       .mapKeys(x => x.toUpperCase())
           *     // Seq { A: 1, B: 2 }
           *
           */
    def mapKeys[M](
      mapper: js.Function3[
          /* key */ js.UndefOr[K], 
          /* value */ js.UndefOr[V], 
          /* iter */ js.UndefOr[Keyed[K, V]], 
          M
        ]
    ): Keyed[M, V] = js.native
    /**
           * Returns a new Iterable.Keyed of the same type with keys passed through
           * a `mapper` function.
           *
           *     Seq({ a: 1, b: 2 })
           *       .mapKeys(x => x.toUpperCase())
           *     // Seq { A: 1, B: 2 }
           *
           */
    def mapKeys[M](
      mapper: js.Function3[
          /* key */ js.UndefOr[K], 
          /* value */ js.UndefOr[V], 
          /* iter */ js.UndefOr[Keyed[K, V]], 
          M
        ],
      context: js.Any
    ): Keyed[M, V] = js.native
  }
  
  @js.native
  trait Set[T]
    extends immutableLib.immutableMod.Iterable[T, T]
  
  def Indexed[T](array: js.Array[T]): Indexed[T] = js.native
  def Indexed[T](iterable: js.Object): Indexed[T] = js.native
  def Indexed[T](iterator: immutableLib.immutableMod.Iterator[T]): Indexed[T] = js.native
  def Indexed[T](iter: Indexed[T]): Indexed[T] = js.native
  def Indexed[T](iter: Set[T]): Indexed[T] = js.native
  def Indexed[K, V](iter: Keyed[K, V]): Indexed[_] = js.native
  def Keyed[V](obj: ScalablyTyped.runtime.StringDictionary[V]): Keyed[java.lang.String, V] = js.native
  def Keyed[K, V](array: js.Array[_]): Keyed[K, V] = js.native
  def Keyed[K, V](iterable: js.Object): Keyed[K, V] = js.native
  def Keyed[K, V](iterator: immutableLib.immutableMod.Iterator[_]): Keyed[K, V] = js.native
  def Keyed[K, V](iter: immutableLib.immutableMod.Iterable[_, _]): Keyed[K, V] = js.native
  def Keyed[K, V](iter: Keyed[K, V]): Keyed[K, V] = js.native
  def Set[T](array: js.Array[T]): Set[T] = js.native
  def Set[T](iterable: js.Object): Set[T] = js.native
  def Set[T](iterator: immutableLib.immutableMod.Iterator[T]): Set[T] = js.native
  def Set[T](iter: Indexed[T]): Set[T] = js.native
  def Set[T](iter: Set[T]): Set[T] = js.native
  def Set[K, V](iter: Keyed[K, V]): Set[_] = js.native
  /**
       * True if `maybeAssociative` is either a keyed or indexed Iterable.
       */
  def isAssociative(maybeAssociative: js.Any): scala.Boolean = js.native
  /**
       * True if `maybeIndexed` is a Iterable.Indexed, or any of its subclasses.
       */
  def isIndexed(maybeIndexed: js.Any): scala.Boolean = js.native
  /**
       * True if `maybeIterable` is an Iterable, or any of its subclasses.
       */
  def isIterable(maybeIterable: js.Any): scala.Boolean = js.native
  /**
       * True if `maybeKeyed` is an Iterable.Keyed, or any of its subclasses.
       */
  def isKeyed(maybeKeyed: js.Any): scala.Boolean = js.native
  /**
       * True if `maybeOrdered` is an Iterable where iteration order is well
       * defined. True for Iterable.Indexed as well as OrderedMap and OrderedSet.
       */
  def isOrdered(maybeOrdered: js.Any): scala.Boolean = js.native
}

