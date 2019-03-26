package typings
package hashsetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HashSet")
@js.native
class HashSet[TValue] () extends IHashSet[TValue] {
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
  override def complement(set: IHashSet[TValue]): IHashSet[TValue] = js.native
  /* CompleteClass */
  override def contains(value: TValue): scala.Boolean = js.native
  /* CompleteClass */
  override def intersection(set: IHashSet[TValue]): IHashSet[TValue] = js.native
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSubsetOf(set: IHashSet[TValue]): scala.Boolean = js.native
  /* CompleteClass */
  override def remove(value: TValue): scala.Unit = js.native
  /* CompleteClass */
  override def size(): scala.Double = js.native
  /* CompleteClass */
  override def union(set: IHashSet[TValue]): IHashSet[TValue] = js.native
  /* CompleteClass */
  override def values(): js.Array[TValue] = js.native
}

