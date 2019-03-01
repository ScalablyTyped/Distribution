package typings
package handlebarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockHelperMissing extends js.Object {
  var blockHelperMissing: js.UndefOr[scala.Boolean] = js.undefined
  var each: js.UndefOr[scala.Boolean] = js.undefined
  var helperMissing: js.UndefOr[scala.Boolean] = js.undefined
  var `if`: js.UndefOr[scala.Boolean] = js.undefined
  var log: js.UndefOr[scala.Boolean] = js.undefined
  var lookup: js.UndefOr[scala.Boolean] = js.undefined
  var unless: js.UndefOr[scala.Boolean] = js.undefined
  var `with`: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BlockHelperMissing {
  @scala.inline
  def apply(
    blockHelperMissing: js.UndefOr[scala.Boolean] = js.undefined,
    each: js.UndefOr[scala.Boolean] = js.undefined,
    helperMissing: js.UndefOr[scala.Boolean] = js.undefined,
    `if`: js.UndefOr[scala.Boolean] = js.undefined,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    lookup: js.UndefOr[scala.Boolean] = js.undefined,
    unless: js.UndefOr[scala.Boolean] = js.undefined,
    `with`: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BlockHelperMissing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockHelperMissing)) __obj.updateDynamic("blockHelperMissing")(blockHelperMissing)
    if (!js.isUndefined(each)) __obj.updateDynamic("each")(each)
    if (!js.isUndefined(helperMissing)) __obj.updateDynamic("helperMissing")(helperMissing)
    if (!js.isUndefined(`if`)) __obj.updateDynamic("if")(`if`)
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (!js.isUndefined(lookup)) __obj.updateDynamic("lookup")(lookup)
    if (!js.isUndefined(unless)) __obj.updateDynamic("unless")(unless)
    if (!js.isUndefined(`with`)) __obj.updateDynamic("with")(`with`)
    __obj.asInstanceOf[Anon_BlockHelperMissing]
  }
}

