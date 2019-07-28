package typings.immutable.immutableMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.SeqNs.Indexed
import typings.immutable.immutableMod.SeqNs.Keyed
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Seq")
@js.native
object SeqNs extends js.Object {
  @js.native
  trait Indexed[T]
    extends Seq[Double, T]
       with typings.immutable.immutableMod.CollectionNs.Indexed[T]
  
  @js.native
  trait Keyed[K, V]
    extends Seq[K, V]
       with typings.immutable.immutableMod.CollectionNs.Keyed[K, V]
  
  @js.native
  trait Set[T]
    extends Seq[T, T]
       with typings.immutable.immutableMod.CollectionNs.Set[T]
  
  def Indexed(): Indexed[_] = js.native
  def Indexed[T](collection: Iterable[T]): Indexed[T] = js.native
  @JSName("Indexed")
  def Indexed_T[T](): Indexed[T] = js.native
  def Keyed(): Keyed[_, _] = js.native
  def Keyed[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
  def Keyed[K, V](collection: Iterable[js.Tuple2[K, V]]): Keyed[K, V] = js.native
  @JSName("Keyed")
  def Keyed_KV[K, V](): Keyed[K, V] = js.native
  def Set(): typings.immutable.immutableMod.SeqNs.Set[_] = js.native
  def Set[T](collection: Iterable[T]): typings.immutable.immutableMod.SeqNs.Set[T] = js.native
  @JSName("Set")
  def Set_T[T](): typings.immutable.immutableMod.SeqNs.Set[T] = js.native
  /**
    * True if `maybeSeq` is a Seq, it is not backed by a concrete
    * structure such as Map, List, or Set.
    */
  def isSeq(maybeSeq: js.Any): Boolean = js.native
  /**
    * `Seq` which represents an ordered indexed list of values.
    */
  @JSName("Indexed")
  @js.native
  object IndexedNs extends js.Object {
    /**
      * Provides an Seq.Indexed of the values provided.
      */
    def of[T](values: T*): Indexed[T] = js.native
  }
  
  @JSName("Set")
  @js.native
  object SetNs extends js.Object {
    /**
      * Returns a Seq.Set of the provided values
      */
    def of[T](values: T*): typings.immutable.immutableMod.SeqNs.Set[T] = js.native
  }
  
}

