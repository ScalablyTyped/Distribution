package typings.intlMessageformat.srcErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/src/error", "MissingValueError")
@js.native
class MissingValueError protected () extends FormatError {
  def this(variableId: String) = this()
  def this(variableId: String, originalMessage: String) = this()
}

