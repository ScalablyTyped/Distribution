package typings.atHapiHoek.atHapiHoekMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReachOptions extends js.Object {
  /** Value to return if the path or value is not present. Default is undefined. */
  var default: js.UndefOr[js.Any] = js.undefined
  /** Allow traversing functions for properties? */
  var functions: js.UndefOr[Boolean] = js.undefined
  /** String to split chain path on. Defaults to ".". */
  var separator: js.UndefOr[String] = js.undefined
  /** Throw an error on missing member? Default is false. */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object ReachOptions {
  @scala.inline
  def apply(
    default: js.Any = null,
    functions: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): ReachOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(functions)) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReachOptions]
  }
}

