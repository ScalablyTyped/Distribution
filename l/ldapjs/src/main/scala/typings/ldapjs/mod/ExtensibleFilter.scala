package typings.ldapjs.mod

import typings.ldapjs.anon.DnAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "ExtensibleFilter")
@js.native
class ExtensibleFilter protected () extends Filter {
  def this(options: DnAttributes) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

