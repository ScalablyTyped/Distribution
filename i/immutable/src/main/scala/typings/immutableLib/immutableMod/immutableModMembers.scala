package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", JSImport.Namespace)
@js.native
object immutableModMembers extends js.Object {
  def Iterable[T](array: js.Array[T]): immutableLib.immutableMod.IterableNs.Indexed[T] = js.native
  def Iterable[T](iterable: js.Object): immutableLib.immutableMod.IterableNs.Indexed[T] = js.native
  def Iterable[T](iterator: Iterator[T]): immutableLib.immutableMod.IterableNs.Indexed[T] = js.native
  def Iterable[V](obj: ScalablyTyped.runtime.StringDictionary[V]): immutableLib.immutableMod.IterableNs.Keyed[java.lang.String, V] = js.native
  def Iterable[V](value: V): immutableLib.immutableMod.IterableNs.Indexed[V] = js.native
  def Iterable[K, V](iterable: Iterable[K, V]): Iterable[K, V] = js.native
  def List[T](): List[T] = js.native
  def List[T](array: js.Array[T]): List[T] = js.native
  def List[T](iterable: js.Object): List[T] = js.native
  def List[T](iterator: Iterator[T]): List[T] = js.native
  def List[T](iter: immutableLib.immutableMod.IterableNs.Indexed[T]): List[T] = js.native
  def List[T](iter: immutableLib.immutableMod.IterableNs.Set[T]): List[T] = js.native
  def List[K, V](iter: immutableLib.immutableMod.IterableNs.Keyed[K, V]): List[_] = js.native
  def Map[V](obj: ScalablyTyped.runtime.StringDictionary[V]): Map[java.lang.String, V] = js.native
  def Map[K, V](): Map[K, V] = js.native
  def Map[K, V](array: js.Array[js.Array[_]]): Map[K, V] = js.native
  def Map[K, V](iterable: js.Object): Map[K, V] = js.native
  def Map[K, V](iterator: Iterator[js.Array[_]]): Map[K, V] = js.native
  def Map[K, V](iter: Iterable[_, js.Array[_]]): Map[K, V] = js.native
  def Map[K, V](iter: immutableLib.immutableMod.IterableNs.Keyed[K, V]): Map[K, V] = js.native
  def OrderedMap[V](obj: ScalablyTyped.runtime.StringDictionary[V]): OrderedMap[java.lang.String, V] = js.native
  def OrderedMap[K, V](): OrderedMap[K, V] = js.native
  def OrderedMap[K, V](array: js.Array[js.Array[_]]): OrderedMap[K, V] = js.native
  def OrderedMap[K, V](iterable: js.Object): OrderedMap[K, V] = js.native
  def OrderedMap[K, V](iterator: Iterator[js.Array[_]]): OrderedMap[K, V] = js.native
  def OrderedMap[K, V](iter: Iterable[_, js.Array[_]]): OrderedMap[K, V] = js.native
  def OrderedMap[K, V](iter: immutableLib.immutableMod.IterableNs.Keyed[K, V]): OrderedMap[K, V] = js.native
  def OrderedSet[T](): OrderedSet[T] = js.native
  def OrderedSet[T](array: js.Array[T]): OrderedSet[T] = js.native
  def OrderedSet[T](iterable: js.Object): OrderedSet[T] = js.native
  def OrderedSet[T](iterator: Iterator[T]): OrderedSet[T] = js.native
  def OrderedSet[T](iter: immutableLib.immutableMod.IterableNs.Indexed[T]): OrderedSet[T] = js.native
  def OrderedSet[T](iter: immutableLib.immutableMod.IterableNs.Set[T]): OrderedSet[T] = js.native
  def OrderedSet[K, V](iter: immutableLib.immutableMod.IterableNs.Keyed[K, V]): OrderedSet[_] = js.native
  def Range(): immutableLib.immutableMod.SeqNs.Indexed[scala.Double] = js.native
  def Range(start: scala.Double): immutableLib.immutableMod.SeqNs.Indexed[scala.Double] = js.native
  def Range(start: scala.Double, end: scala.Double): immutableLib.immutableMod.SeqNs.Indexed[scala.Double] = js.native
  def Range(start: scala.Double, end: scala.Double, step: scala.Double): immutableLib.immutableMod.SeqNs.Indexed[scala.Double] = js.native
  def Record(defaultValues: ScalablyTyped.runtime.StringDictionary[js.Any]): immutableLib.immutableMod.RecordNs.Class = js.native
  def Record(defaultValues: ScalablyTyped.runtime.StringDictionary[js.Any], name: java.lang.String): immutableLib.immutableMod.RecordNs.Class = js.native
  def Repeat[T](value: T): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  def Repeat[T](value: T, times: scala.Double): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  def Seq[T](array: js.Array[T]): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  def Seq[T](iterable: js.Object): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  def Seq[T](iterator: Iterator[T]): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  def Seq[V](obj: ScalablyTyped.runtime.StringDictionary[V]): immutableLib.immutableMod.SeqNs.Keyed[java.lang.String, V] = js.native
  def Seq[K, V](): Seq[K, V] = js.native
  def Seq[K, V](iterable: Iterable[K, V]): Seq[K, V] = js.native
  def Seq[K, V](seq: Seq[K, V]): Seq[K, V] = js.native
  def Set[T](): Set[T] = js.native
  def Set[T](array: js.Array[T]): Set[T] = js.native
  def Set[T](iterable: js.Object): Set[T] = js.native
  def Set[T](iterator: Iterator[T]): Set[T] = js.native
  def Set[T](iter: immutableLib.immutableMod.IterableNs.Indexed[T]): Set[T] = js.native
  def Set[T](iter: immutableLib.immutableMod.IterableNs.Set[T]): Set[T] = js.native
  def Set[K, V](iter: immutableLib.immutableMod.IterableNs.Keyed[K, V]): Set[_] = js.native
  def Stack[T](): Stack[T] = js.native
  def Stack[T](array: js.Array[T]): Stack[T] = js.native
  def Stack[T](iterable: js.Object): Stack[T] = js.native
  def Stack[T](iterator: Iterator[T]): Stack[T] = js.native
  def Stack[T](iter: immutableLib.immutableMod.IterableNs.Indexed[T]): Stack[T] = js.native
  def Stack[T](iter: immutableLib.immutableMod.IterableNs.Set[T]): Stack[T] = js.native
  def Stack[K, V](iter: immutableLib.immutableMod.IterableNs.Keyed[K, V]): Stack[_] = js.native
  def fromJS(json: js.Any): js.Any = js.native
  def fromJS(json: js.Any, reviver: js.Function2[/* k */ js.Any, /* v */ Iterable[_, _], _]): js.Any = js.native
  def is(first: js.Any, second: js.Any): scala.Boolean = js.native
}

