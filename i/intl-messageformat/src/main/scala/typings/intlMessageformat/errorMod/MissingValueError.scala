package typings.intlMessageformat.errorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intl-messageformat/lib/src/error", "MissingValueError")
@js.native
class MissingValueError protected () extends FormatError {
  def this(variableId: String) = this()
  def this(variableId: String, originalMessage: String) = this()
}
