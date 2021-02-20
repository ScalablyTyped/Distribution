package typings.hashset

import org.scalablytyped.runtime.Shortcut
import typings.hashtable.IHashtableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hashset", JSImport.Namespace)
  @js.native
  class ^[TValue] () extends IHashSet[TValue] {
    def this(hashCode: js.Function1[/* value */ TValue, _]) = this()
    def this(options: IHashtableOptions[TValue]) = this()
    def this(
      hashCode: js.UndefOr[scala.Nothing],
      equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
    ) = this()
    def this(
      hashCode: js.Function1[/* value */ TValue, _],
      equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
    ) = this()
  }
  @JSImport("hashset", JSImport.Namespace)
  @js.native
  val ^ : IHashSetStatic = js.native
  
  type _To = IHashSetStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IHashSetStatic = ^
}
