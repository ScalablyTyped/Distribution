package typings.intlMessageformat.errorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intl-messageformat/lib/src/error", "InvalidValueError")
@js.native
class InvalidValueError protected () extends FormatError {
  def this(variableId: String, value: js.Any, options: js.Array[String]) = this()
  def this(variableId: String, value: js.Any, options: js.Array[String], originalMessage: String) = this()
}
