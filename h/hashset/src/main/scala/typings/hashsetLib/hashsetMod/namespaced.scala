package typings
package hashsetLib.hashsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hashset", JSImport.Namespace)
@js.native
class namespaced[TValue] ()
  extends hashsetLib.IHashSet[TValue] {
  def this(hashCode: js.Function1[/* value */ TValue, _]) = this()
  def this(options: hashtableLib.IHashtableOptions[TValue]) = this()
  def this(hashCode: js.Function1[/* value */ TValue, _], equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, scala.Boolean]) = this()
  /* CompleteClass */
  override def add(value: TValue): scala.Unit = js.native
  /* CompleteClass */
  override def addAll(arr: js.Array[TValue]): scala.Unit = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def complement(set: hashsetLib.IHashSet[TValue]): hashsetLib.IHashSet[TValue] = js.native
  /* CompleteClass */
  override def contains(value: TValue): scala.Boolean = js.native
  /* CompleteClass */
  override def intersection(set: hashsetLib.IHashSet[TValue]): hashsetLib.IHashSet[TValue] = js.native
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSubsetOf(set: hashsetLib.IHashSet[TValue]): scala.Boolean = js.native
  /* CompleteClass */
  override def remove(value: TValue): scala.Unit = js.native
  /* CompleteClass */
  override def size(): scala.Double = js.native
  /* CompleteClass */
  override def union(set: hashsetLib.IHashSet[TValue]): hashsetLib.IHashSet[TValue] = js.native
  /* CompleteClass */
  override def values(): js.Array[TValue] = js.native
}

