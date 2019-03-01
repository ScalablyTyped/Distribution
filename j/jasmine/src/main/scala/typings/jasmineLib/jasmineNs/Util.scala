package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  def argsToArray(args: js.Any): js.Any
  def extend(destination: js.Any, source: js.Any): js.Any
  def formatException(e: js.Any): js.Any
  def htmlEscape(str: java.lang.String): java.lang.String
  def inherit(childClass: js.Function, parentClass: js.Function): js.Any
}

object Util {
  @scala.inline
  def apply(
    argsToArray: js.Function1[js.Any, js.Any],
    extend: js.Function2[js.Any, js.Any, js.Any],
    formatException: js.Function1[js.Any, js.Any],
    htmlEscape: js.Function1[java.lang.String, java.lang.String],
    inherit: js.Function2[js.Function, js.Function, js.Any]
  ): Util = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argsToArray")(argsToArray)
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("formatException")(formatException)
    __obj.updateDynamic("htmlEscape")(htmlEscape)
    __obj.updateDynamic("inherit")(inherit)
    __obj.asInstanceOf[Util]
  }
}

