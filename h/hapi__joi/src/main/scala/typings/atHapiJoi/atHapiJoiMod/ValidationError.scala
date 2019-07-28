package typings.atHapiJoi.atHapiJoiMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends Error
     with JoiObject {
  var _object: js.Any
  var details: js.Array[ValidationErrorItem]
  def annotate(): String
}

object ValidationError {
  @scala.inline
  def apply(
    _object: js.Any,
    annotate: () => String,
    details: js.Array[ValidationErrorItem],
    isJoi: Boolean,
    message: String,
    name: String,
    stack: String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(_object = _object, annotate = js.Any.fromFunction0(annotate), details = details, isJoi = isJoi, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ValidationError]
  }
}

