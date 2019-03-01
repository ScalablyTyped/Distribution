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
       with immutableLib.immutableMod.CollectionNs.Indexed[T]
  
  @js.native
  trait Keyed[K, V]
    extends immutableLib.immutableMod.Seq[K, V]
       with immutableLib.immutableMod.CollectionNs.Keyed[K, V]
  
  @js.native
  trait Set[T]
    extends immutableLib.immutableMod.Seq[T, T]
       with immutableLib.immutableMod.CollectionNs.Set[T]
  
  def Indexed(): Indexed[_] = js.native
  def Indexed[T](collection: stdLib.Iterable[T]): Indexed[T] = js.native
  @JSName("Indexed")
  def Indexed_T[T](): Indexed[T] = js.native
  def Keyed(): Keyed[_, _] = js.native
  def Keyed[V](obj: org.scalablytyped.runtime.StringDictionary[V]): Keyed[java.lang.String, V] = js.native
  def Keyed[K, V](collection: stdLib.Iterable[js.Tuple2[K, V]]): Keyed[K, V] = js.native
  @JSName("Keyed")
  def Keyed_KV[K, V](): Keyed[K, V] = js.native
  def Set(): Set[_] = js.native
  def Set[T](collection: stdLib.Iterable[T]): Set[T] = js.native
  @JSName("Set")
  def Set_T[T](): Set[T] = js.native
  /**
    * True if `maybeSeq` is a Seq, it is not backed by a concrete
    * structure such as Map, List, or Set.
    */
  def isSeq(maybeSeq: js.Any): scala.Boolean = js.native
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

