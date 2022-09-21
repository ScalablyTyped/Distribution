package typings.hashset

import org.scalablytyped.runtime.Shortcut
import typings.hashtable.IHashtableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hashset", JSImport.Namespace)
  @js.native
  open class ^[TValue] ()
    extends StObject
       with IHashSet[TValue] {
    def this(hashCode: js.Function1[/* value */ TValue, Any]) = this()
    def this(options: IHashtableOptions[TValue]) = this()
    def this(
      hashCode: js.Function1[/* value */ TValue, Any],
      equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
    ) = this()
    def this(hashCode: Unit, equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]) = this()
    
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
  @JSImport("hashset", JSImport.Namespace)
  @js.native
  val ^ : js.Object & IHashSetStatic = js.native
  
  type _To = js.Object & IHashSetStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & IHashSetStatic = ^
}
