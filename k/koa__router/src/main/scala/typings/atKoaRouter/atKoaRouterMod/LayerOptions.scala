package typings.atKoaRouter.atKoaRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerOptions extends js.Object {
  var end: js.UndefOr[Boolean] = js.undefined
  var ignoreCaptures: js.UndefOr[Boolean] = js.undefined
  var name: String
  var prefix: js.UndefOr[String] = js.undefined
  var sensitive: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object LayerOptions {
  @scala.inline
  def apply(
    name: String,
    end: js.UndefOr[Boolean] = js.undefined,
    ignoreCaptures: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
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

