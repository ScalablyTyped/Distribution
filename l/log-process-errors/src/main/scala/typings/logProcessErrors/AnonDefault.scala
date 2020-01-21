package typings.logProcessErrors

import typings.logProcessErrors.logProcessErrorsStrings.default
import typings.logProcessErrors.logProcessErrorsStrings.silent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var default: js.UndefOr[
    js.Function1[
      /* error */ Error, 
      silent | typings.logProcessErrors.logProcessErrorsStrings.default
    ]
  ] = js.undefined
}

object AnonDefault {
  @scala.inline
  def apply(default: /* error */ Error => silent | default = null): AnonDefault = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(js.Any.fromFunction1(default))
    __obj.asInstanceOf[AnonDefault]
  }
}

