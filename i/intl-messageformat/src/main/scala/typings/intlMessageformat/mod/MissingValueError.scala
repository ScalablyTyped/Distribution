package typings.intlMessageformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", "MissingValueError")
@js.native
class MissingValueError protected () extends FormatError {
  def this(variableId: String) = this()
  def this(variableId: String, originalMessage: String) = this()
}

