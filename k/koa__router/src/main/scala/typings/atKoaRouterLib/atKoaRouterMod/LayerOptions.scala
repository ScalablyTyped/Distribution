package typings
package atKoaRouterLib.atKoaRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerOptions extends js.Object {
  var end: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreCaptures: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object LayerOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    end: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCaptures: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): LayerOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(ignoreCaptures)) __obj.updateDynamic("ignoreCaptures")(ignoreCaptures)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[LayerOptions]
  }
}

