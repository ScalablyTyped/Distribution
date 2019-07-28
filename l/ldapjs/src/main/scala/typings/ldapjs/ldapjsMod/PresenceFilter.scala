package typings.ldapjs.ldapjsMod

import typings.ldapjs.Anon_AttributeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "PresenceFilter")
@js.native
class PresenceFilter protected () extends Filter {
  def this(options: Anon_AttributeString) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

