package typings.ldapjs.ldapjsMod

import typings.ldapjs.Anon_Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "NotFilter")
@js.native
class NotFilter protected () extends Filter {
  def this(options: Anon_Filter) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

