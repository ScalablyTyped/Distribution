package typings.ldapjs.mod

import typings.ldapjs.AnonAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "SubstringFilter")
@js.native
class SubstringFilter protected () extends Filter {
  def this(options: AnonAny) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

