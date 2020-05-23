package typings.gulpStylus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var compress: js.UndefOr[Boolean] = js.undefined
  var `include css`: js.UndefOr[Boolean] = js.undefined
  var linenos: js.UndefOr[Boolean] = js.undefined
  var rawDefine: js.UndefOr[VariableDefinitions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compress: js.UndefOr[Boolean] = js.undefined,
    `include css`: js.UndefOr[Boolean] = js.undefined,
    linenos: js.UndefOr[Boolean] = js.undefined,
    rawDefine: VariableDefinitions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`include css`)) __obj.updateDynamic("include css")(((`include css`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(linenos)) __obj.updateDynamic("linenos")(linenos.get.asInstanceOf[js.Any])
    if (rawDefine != null) __obj.updateDynamic("rawDefine")(rawDefine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

