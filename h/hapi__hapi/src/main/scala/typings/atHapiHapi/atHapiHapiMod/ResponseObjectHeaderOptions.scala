package typings.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObjectHeaderOptions extends js.Object {
  var append: js.UndefOr[Boolean] = js.undefined
  var duplicate: js.UndefOr[Boolean] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object ResponseObjectHeaderOptions {
  @scala.inline
  def apply(
    append: js.UndefOr[Boolean] = js.undefined,
    duplicate: js.UndefOr[Boolean] = js.undefined,
    `override`: js.UndefOr[Boolean] = js.undefined,
    separator: String = null
  ): ResponseObjectHeaderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (!js.isUndefined(duplicate)) __obj.updateDynamic("duplicate")(duplicate.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObjectHeaderOptions]
  }
}

