package typings.logDashProcessDashErrors

import typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.default
import typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.silent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[
    js.Function1[
      /* error */ Error, 
      silent | typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.default
    ]
  ] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(default: /* error */ Error => silent | default = null): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(js.Any.fromFunction1(default))
    __obj.asInstanceOf[Anon_Default]
  }
}

