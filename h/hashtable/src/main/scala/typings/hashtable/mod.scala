package typings.hashtable

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hashtable", JSImport.Namespace)
  @js.native
  open class ^[TKey, TValue] ()
    extends StObject
       with IHashtable[TKey, TValue] {
    def this(hashCode: js.Function1[/* value */ TValue, Any]) = this()
    def this(options: IHashtableOptions[TKey]) = this()
    def this(
      hashCode: js.Function1[/* value */ TValue, Any],
      equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
    ) = this()
    def this(hashCode: Unit, equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]) = this()
  }
  @JSImport("hashtable", JSImport.Namespace)
  @js.native
  val ^ : js.Object & IHashtableStatic = js.native
  
  type _To = js.Object & IHashtableStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & IHashtableStatic = ^
}
