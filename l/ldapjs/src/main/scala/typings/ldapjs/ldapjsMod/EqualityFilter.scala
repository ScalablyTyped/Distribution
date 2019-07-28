package typings.ldapjs.ldapjsMod

import typings.ldapjs.Anon_Attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "EqualityFilter")
@js.native
class EqualityFilter protected () extends Filter {
  def this(options: Anon_Attribute) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

