package typings.hashtable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Hashtable")
  @js.native
  class Hashtable[TKey, TValue] () extends IHashtable[TKey, TValue] {
    def this(hashCode: js.Function1[/* value */ TValue, _]) = this()
    def this(options: IHashtableOptions[TKey]) = this()
    def this(
      hashCode: js.UndefOr[scala.Nothing],
      equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
    ) = this()
    def this(
      hashCode: js.Function1[/* value */ TValue, _],
      equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
    ) = this()
  }
  @JSGlobal("Hashtable")
  @js.native
  def Hashtable: IHashtableStatic = js.native
  @scala.inline
  def Hashtable_=(x: IHashtableStatic): Unit = js.Dynamic.global.updateDynamic("Hashtable")(x.asInstanceOf[js.Any])
}
