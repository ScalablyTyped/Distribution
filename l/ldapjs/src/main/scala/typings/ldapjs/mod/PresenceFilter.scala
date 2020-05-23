package typings.ldapjs.mod

import typings.ldapjs.anon.AttributeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "PresenceFilter")
@js.native
class PresenceFilter protected () extends Filter {
  def this(options: AttributeString) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

