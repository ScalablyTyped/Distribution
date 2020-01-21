package typings.ldapjs.mod

import typings.ldapjs.AnonFilters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "AndFilter")
@js.native
class AndFilter protected () extends Filter {
  def this(options: AnonFilters) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

