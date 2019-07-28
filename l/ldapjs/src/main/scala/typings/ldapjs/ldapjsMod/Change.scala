package typings.ldapjs.ldapjsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var modification: StringDictionary[js.Any]
  var operation: String
}

@JSImport("ldapjs", "Change")
@js.native
class ChangeCls protected () extends Change {
  def this(change: Change) = this()
  /* CompleteClass */
  override var modification: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override var operation: String = js.native
}

@JSImport("ldapjs", "Change")
@js.native
object Change extends Instantiable1[/* change */ Change, Change]

