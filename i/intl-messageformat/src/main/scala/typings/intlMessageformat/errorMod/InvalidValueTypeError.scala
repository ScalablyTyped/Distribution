package typings.intlMessageformat.errorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib/src/error", "InvalidValueTypeError")
@js.native
class InvalidValueTypeError protected () extends FormatError {
  def this(value: js.Any, `type`: String) = this()
  def this(value: js.Any, `type`: String, originalMessage: String) = this()
}

