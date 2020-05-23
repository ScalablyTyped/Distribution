package typings.hashset

import org.scalablytyped.runtime.TopLevel
import typings.hashtable.IHashtableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class HashSet[TValue] () extends IHashSet[TValue] {
    def this(hashCode: js.Function1[/* value */ TValue, _]) = this()
    def this(options: IHashtableOptions[TValue]) = this()
    def this(
      hashCode: js.Function1[/* value */ TValue, _],
      equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
    ) = this()
    /* CompleteClass */
    override def add(value: TValue): Unit = js.native
    /* CompleteClass */
    override def addAll(arr: js.Array[TValue]): Unit = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def complement(set: IHashSet[TValue]): IHashSet[TValue] = js.native
    /* CompleteClass */
    override def contains(value: TValue): Boolean = js.native
    /* CompleteClass */
    override def intersection(set: IHashSet[TValue]): IHashSet[TValue] = js.native
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    /* CompleteClass */
    override def isSubsetOf(set: IHashSet[TValue]): Boolean = js.native
    /* CompleteClass */
    override def remove(value: TValue): Unit = js.native
    /* CompleteClass */
    override def size(): Double = js.native
    /* CompleteClass */
    override def union(set: IHashSet[TValue]): IHashSet[TValue] = js.native
    /* CompleteClass */
    override def values(): js.Array[TValue] = js.native
  }
  
  @js.native
  object HashSet extends TopLevel[IHashSetStatic]
  
}

