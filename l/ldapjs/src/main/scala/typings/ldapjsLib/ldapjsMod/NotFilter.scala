package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "NotFilter")
@js.native
class NotFilter protected () extends Filter {
  def this(options: ldapjsLib.Anon_Filter) = this()
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): scala.Boolean = js.native
}

