package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var modification: org.scalablytyped.runtime.StringDictionary[js.Any]
  var operation: java.lang.String
}

@JSImport("ldapjs", "Change")
@js.native
class ChangeCls protected () extends Change {
  def this(change: Change) = this()
  /* CompleteClass */
  override var modification: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override var operation: java.lang.String = js.native
}

@JSImport("ldapjs", "Change")
@js.native
object Change
  extends org.scalablytyped.runtime.Instantiable1[/* change */ Change, Change]

