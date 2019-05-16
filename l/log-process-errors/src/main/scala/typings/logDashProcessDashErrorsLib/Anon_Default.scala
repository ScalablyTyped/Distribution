package typings
package logDashProcessDashErrorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[
    js.Function1[
      /* error */ stdLib.Error, 
      logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.silent | logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.default
    ]
  ] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    default: /* error */ stdLib.Error => logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.silent | logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.default = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(js.Any.fromFunction1(default))
    __obj.asInstanceOf[Anon_Default]
  }
}

