package typings.hashset

import typings.hashtable.IHashtableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("HashSet")
  @js.native
  class HashSet[TValue] () extends IHashSet[TValue] {
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
  @JSGlobal("HashSet")
  @js.native
  def HashSet: IHashSetStatic = js.native
  @scala.inline
  def HashSet_=(x: IHashSetStatic): Unit = js.Dynamic.global.updateDynamic("HashSet")(x.asInstanceOf[js.Any])
}
