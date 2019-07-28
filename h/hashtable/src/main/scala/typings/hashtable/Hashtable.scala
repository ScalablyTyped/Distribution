package typings.hashtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Hashtable")
@js.native
class Hashtable[TKey, TValue] () extends IHashtable[TKey, TValue] {
  def this(hashCode: js.Function1[/* value */ TValue, _]) = this()
  def this(options: IHashtableOptions[TKey]) = this()
  def this(
    hashCode: js.Function1[/* value */ TValue, _],
    equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
  ) = this()
}

