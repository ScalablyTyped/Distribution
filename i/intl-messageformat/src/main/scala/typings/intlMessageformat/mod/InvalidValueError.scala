package typings.intlMessageformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", "InvalidValueError")
@js.native
class InvalidValueError protected () extends FormatError {
  def this(variableId: String, value: js.Any, options: js.Array[String]) = this()
  def this(variableId: String, value: js.Any, options: js.Array[String], originalMessage: String) = this()
}

