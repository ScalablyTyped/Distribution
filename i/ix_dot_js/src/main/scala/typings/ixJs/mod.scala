package typings.ixJs

import typings.ixJs.Ix.Enumerable
import typings.ixJs.Ix.EnumerableStatic
import typings.ixJs.Ix.Enumerator
import typings.ixJs.Ix.EnumeratorStatic
import typings.ixJs.Ix.EqualityComparer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ix", "Dictionary")
  @js.native
  class Dictionary[TKey, TValue] ()
    extends typings.ixJs.Ix.Dictionary[TKey, TValue] {
    def this(capacity: Double) = this()
    def this(capacity: js.UndefOr[scala.Nothing], comparer: EqualityComparer[TKey, TKey]) = this()
    def this(capacity: Double, comparer: EqualityComparer[TKey, TKey]) = this()
  }
  
  @JSImport("ix", "Enumerable")
  @js.native
  def Enumerable: EnumerableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ix", "Enumerable")
  @js.native
  class EnumerableCls[T] protected () extends Enumerable[T] {
    def this(getEnumerator: js.Function0[Enumerator[T]]) = this()
  }
  
  @scala.inline
  def Enumerable_=(x: EnumerableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enumerable")(x.asInstanceOf[js.Any])
  
  @JSImport("ix", "Enumerator")
  @js.native
  def Enumerator: EnumeratorStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ix", "Enumerator")
  @js.native
  class EnumeratorCls[T] protected () extends Enumerator[T] {
    def this(moveNext: js.Function0[Boolean], getCurrent: js.Function0[T], dispose: js.Function0[Unit]) = this()
  }
  
  @scala.inline
  def Enumerator_=(x: EnumeratorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enumerator")(x.asInstanceOf[js.Any])
}
