package typings
package atHapiHoekLib.atHapiHoekMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReachOptions extends js.Object {
  /** Value to return if the path or value is not present. Default is undefined. */
  var default: js.UndefOr[js.Any] = js.undefined
  /** Allow traversing functions for properties? */
  var functions: js.UndefOr[scala.Boolean] = js.undefined
  /** String to split chain path on. Defaults to ".". */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /** Throw an error on missing member? Default is false. */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object ReachOptions {
  @scala.inline
  def apply(
    default: js.Any = null,
    functions: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): ReachOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(functions)) __obj.updateDynamic("functions")(functions)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[ReachOptions]
  }
}

