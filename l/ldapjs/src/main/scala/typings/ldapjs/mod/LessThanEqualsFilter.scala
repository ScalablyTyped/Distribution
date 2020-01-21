package typings.ldapjs.mod

import typings.ldapjs.AnonAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "LessThanEqualsFilter")
@js.native
class LessThanEqualsFilter protected () extends Filter {
  def this(options: AnonAttribute) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

