package typings.ixJs

import typings.ixJs.Ix.Enumerable
import typings.ixJs.Ix.EnumerableStatic
import typings.ixJs.Ix.Enumerator
import typings.ixJs.Ix.EnumeratorStatic
import typings.ixJs.Ix.EqualityComparer
import typings.ixJs.Ix.KeyValuePair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ixMod {
  
  @JSImport("ix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ix", "Dictionary")
  @js.native
  open class Dictionary[TKey, TValue] ()
    extends StObject
       with typings.ixJs.Ix.Dictionary[TKey, TValue] {
    def this(capacity: Double) = this()
    def this(capacity: Double, comparer: EqualityComparer[TKey, TKey]) = this()
    def this(capacity: Unit, comparer: EqualityComparer[TKey, TKey]) = this()
    
    /* CompleteClass */
    override def add(key: TKey, value: TValue): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: TKey): TValue = js.native
    
    /* CompleteClass */
    override def getValues(): js.Array[TValue] = js.native
    
    /* CompleteClass */
    override def has(key: TKey): Boolean = js.native
    
    /* CompleteClass */
    override def length(): Double = js.native
    
    /* CompleteClass */
    override def remove(key: TKey): Boolean = js.native
    
    /* CompleteClass */
    override def set(key: TKey, value: TValue): Unit = js.native
    
    /* CompleteClass */
    override def toEnumerable(): Enumerable[KeyValuePair[TKey, TValue]] = js.native
    
    /* CompleteClass */
    override def tryGetValue(key: TKey): TValue = js.native
  }
  
  @JSImport("ix", "Enumerable")
  @js.native
  def Enumerable: EnumerableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ix", "Enumerable")
  @js.native
  open class EnumerableCls[T] protected ()
    extends StObject
       with Enumerable[T] {
    def this(getEnumerator: js.Function0[Enumerator[T]]) = this()
  }
  
  inline def Enumerable_=(x: EnumerableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enumerable")(x.asInstanceOf[js.Any])
  
  @JSImport("ix", "Enumerator")
  @js.native
  def Enumerator: EnumeratorStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ix", "Enumerator")
  @js.native
  open class EnumeratorCls[T] protected ()
    extends StObject
       with Enumerator[T] {
    def this(moveNext: js.Function0[Boolean], getCurrent: js.Function0[T], dispose: js.Function0[Unit]) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getCurrent(): T = js.native
    
    /* CompleteClass */
    override def moveNext(): Boolean = js.native
  }
  
  inline def Enumerator_=(x: EnumeratorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enumerator")(x.asInstanceOf[js.Any])
}
