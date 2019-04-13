package typings
package hashtableLib.hashtableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hashtable", JSImport.Namespace)
@js.native
class ^[TKey, TValue] ()
  extends hashtableLib.IHashtable[TKey, TValue] {
  def this(hashCode: js.Function1[/* value */ TValue, _]) = this()
  def this(options: hashtableLib.IHashtableOptions[TKey]) = this()
  def this(hashCode: js.Function1[/* value */ TValue, _], equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, scala.Boolean]) = this()
}

@JSImport("hashtable", JSImport.Namespace)
@js.native
object ^
  extends org.scalablytyped.runtime.TopLevel[hashtableLib.IHashtableStatic]

