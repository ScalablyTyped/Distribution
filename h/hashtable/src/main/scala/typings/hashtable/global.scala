package typings.hashtable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Hashtable")
  @js.native
  class Hashtable[TKey, TValue] ()
    extends StObject
       with IHashtable[TKey, TValue] {
    def this(hashCode: js.Function1[/* value */ TValue, js.Any]) = this()
    def this(options: IHashtableOptions[TKey]) = this()
    def this(
      hashCode: js.Function1[/* value */ TValue, js.Any],
      equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
    ) = this()
    def this(hashCode: Unit, equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]) = this()
  }
  @JSGlobal("Hashtable")
  @js.native
  def Hashtable: IHashtableStatic = js.native
  inline def Hashtable_=(x: IHashtableStatic): Unit = js.Dynamic.global.updateDynamic("Hashtable")(x.asInstanceOf[js.Any])
}
