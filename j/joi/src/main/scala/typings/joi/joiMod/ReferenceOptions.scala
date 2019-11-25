package typings.joi.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceOptions extends js.Object {
  var contextPrefix: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var functions: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object ReferenceOptions {
  @scala.inline
  def apply(
    contextPrefix: String = null,
    default: js.Any = null,
    functions: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): ReferenceOptions = {
    val __obj = js.Dynamic.literal()
    if (contextPrefix != null) __obj.updateDynamic("contextPrefix")(contextPrefix.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(functions)) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceOptions]
  }
}

