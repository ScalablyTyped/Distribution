package typings
package grammarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeMessage extends js.Object {
  var code: scala.Double
  var message: java.lang.String
  var warning: grammarkdownLib.grammarkdownLibNumbers.`true`
}

object Anon_CodeMessage {
  @scala.inline
  def apply(
    code: scala.Double,
    message: java.lang.String,
    warning: grammarkdownLib.grammarkdownLibNumbers.`true`
  ): Anon_CodeMessage = {
    val __obj = js.Dynamic.literal(code = code, message = message, warning = warning)
  
    __obj.asInstanceOf[Anon_CodeMessage]
  }
}

