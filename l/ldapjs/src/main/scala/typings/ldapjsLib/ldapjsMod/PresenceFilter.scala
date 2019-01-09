package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "PresenceFilter")
@js.native
class PresenceFilter protected () extends Filter {
  def this(options: ldapjsLib.Anon_AttributeString) = this()
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): scala.Boolean = js.native
}

