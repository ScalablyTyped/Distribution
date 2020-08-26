package typings.hashset.mod

import org.scalablytyped.runtime.TopLevel
import typings.hashset.IHashSet
import typings.hashset.IHashSetStatic
import typings.hashtable.IHashtableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object ^ extends TopLevel[IHashSetStatic]

