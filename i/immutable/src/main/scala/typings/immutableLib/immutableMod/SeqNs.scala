package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Seq")
@js.native
object SeqNs extends js.Object {
  @js.native
  trait Indexed[T]
    extends immutableLib.immutableMod.Seq[scala.Double, T]
       with immutableLib.immutableMod.IterableNs.Indexed[T]
  
  @js.native
  trait Keyed[K, V]
    extends immutableLib.immutableMod.Seq[K, V]
       with immutableLib.immutableMod.IterableNs.Keyed[K, V]
  
  @js.native
  trait Set[T]
    extends immutableLib.immutableMod.Seq[T, T]
       with immutableLib.immutableMod.IterableNs.Set[T]
  
  def Indexed[T](): Indexed[T] = js.native
  def Indexed[T](array: js.Array[T]): Indexed[T] = js.native
  def Indexed[T](iterable: js.Object): Indexed[T] = js.native
  def Indexed[T](iterator: immutableLib.immutableMod.Iterator[T]): Indexed[T] = js.native
  def Indexed[T](seq: immutableLib.immutableMod.IterableNs.Indexed[T]): Indexed[T] = js.native
  def Indexed[T](seq: immutableLib.immutableMod.IterableNs.Set[T]): Indexed[T] = js.native
  def Indexed[K, V](seq: immutableLib.immutableMod.IterableNs.Keyed[K, V]): Indexed[_] = js.native
  def Keyed[V](obj: ScalablyTyped.runtime.StringDictionary[V]): Keyed[java.lang.String, V] = js.native
  def Keyed[K, V](): Keyed[K, V] = js.native
  def Keyed[K, V](array: js.Array[_]): Keyed[K, V] = js.native
  def Keyed[K, V](iterable: js.Object): Keyed[K, V] = js.native
  def Keyed[K, V](iterator: immutableLib.immutableMod.Iterator[_]): Keyed[K, V] = js.native
  def Keyed[K, V](seq: immutableLib.immutableMod.Iterable[_, _]): Keyed[K, V] = js.native
  def Keyed[K, V](seq: immutableLib.immutableMod.IterableNs.Keyed[K, V]): Keyed[K, V] = js.native
  def Set[T](): Set[T] = js.native
  def Set[T](array: js.Array[T]): Set[T] = js.native
  def Set[T](iterable: js.Object): Set[T] = js.native
  def Set[T](iterator: immutableLib.immutableMod.Iterator[T]): Set[T] = js.native
  def Set[T](seq: immutableLib.immutableMod.IterableNs.Indexed[T]): Set[T] = js.native
  def Set[T](seq: immutableLib.immutableMod.IterableNs.Set[T]): Set[T] = js.native
  def Set[K, V](seq: immutableLib.immutableMod.IterableNs.Keyed[K, V]): Set[_] = js.native
  /**
       * True if `maybeSeq` is a Seq, it is not backed by a concrete
       * structure such as Map, List, or Set.
       */
  def isSeq(maybeSeq: js.Any): scala.Boolean = js.native
  /**
       * Returns a Seq of the values provided. Alias for `Seq.Indexed.of()`.
       */
  def of[T](values: T*): Indexed[T] = js.native
  /**
       * `Seq` which represents an ordered indexed list of values.
       */
  @JSName("Indexed")
  @js.native
  object IndexedNs extends js.Object {
    /**
           * Provides an Seq.Indexed of the values provided.
           */
    def of[T](values: T*): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  }
  
  @JSName("Set")
  @js.native
  object SetNs extends js.Object {
    /**
           * Returns a Seq.Set of the provided values
           */
    def of[T](values: T*): immutableLib.immutableMod.SeqNs.Set[T] = js.native
  }
  
}

