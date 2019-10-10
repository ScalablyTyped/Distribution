package typings.atHapiJoi.atHapiJoiMod

import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorReport extends Error {
  var code: String
  var flags: Record[String, ExtensionFlag]
  var messages: LanguageMessages
  var path: String
  var prefs: ValidationOptions
  var state: State
  var value: js.Any
}

object ErrorReport {
  @scala.inline
  def apply(
    code: String,
    flags: Record[String, ExtensionFlag],
    message: String,
    messages: LanguageMessages,
    name: String,
    path: String,
    prefs: ValidationOptions,
    state: State,
    value: js.Any,
    stack: String = null
  ): ErrorReport = {
    val __obj = js.Dynamic.literal(code = code, flags = flags, message = message, messages = messages, name = name, path = path, prefs = prefs, state = state, value = value)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ErrorReport]
  }
}

