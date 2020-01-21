package typings.hashtable.mod

import org.scalablytyped.runtime.TopLevel
import typings.hashtable.IHashtable
import typings.hashtable.IHashtableOptions
import typings.hashtable.IHashtableStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hashtable", JSImport.Namespace)
@js.native
class ^[TKey, TValue] () extends IHashtable[TKey, TValue] {
  def this(hashCode: js.Function1[/* value */ TValue, _]) = this()
  def this(options: IHashtableOptions[TKey]) = this()
  def this(
    hashCode: js.Function1[/* value */ TValue, _],
    equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
  ) = this()
}

@JSImport("hashtable", JSImport.Namespace)
@js.native
object ^ extends TopLevel[IHashtableStatic]

