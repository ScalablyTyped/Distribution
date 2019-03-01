package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObjectHeaderOptions extends js.Object {
  var append: js.UndefOr[scala.Boolean] = js.undefined
  var duplicate: js.UndefOr[scala.Boolean] = js.undefined
  var `override`: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object ResponseObjectHeaderOptions {
  @scala.inline
  def apply(
    append: js.UndefOr[scala.Boolean] = js.undefined,
    duplicate: js.UndefOr[scala.Boolean] = js.undefined,
    `override`: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null
  ): ResponseObjectHeaderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append)
    if (!js.isUndefined(duplicate)) __obj.updateDynamic("duplicate")(duplicate)
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[ResponseObjectHeaderOptions]
  }
}

