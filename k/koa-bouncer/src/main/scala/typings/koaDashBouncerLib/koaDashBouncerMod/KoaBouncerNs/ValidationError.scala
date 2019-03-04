package typings
package koaDashBouncerLib.koaDashBouncerMod.KoaBouncerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends nodeLib.Error {
  var bouncer: koaDashBouncerLib.Anon_Key
  var message: java.lang.String
  var name: java.lang.String
}

object ValidationError {
  @scala.inline
  def apply(
    bouncer: koaDashBouncerLib.Anon_Key,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(bouncer = bouncer, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ValidationError]
  }
}

