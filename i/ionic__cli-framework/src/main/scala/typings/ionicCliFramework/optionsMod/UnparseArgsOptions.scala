package typings.ionicCliFramework.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnparseArgsOptions extends js.Object {
  var allowCamelCase: js.UndefOr[Boolean] = js.undefined
  var ignoreFalse: js.UndefOr[Boolean] = js.undefined
  var useDoubleQuotes: js.UndefOr[Boolean] = js.undefined
  var useEquals: js.UndefOr[Boolean] = js.undefined
}

object UnparseArgsOptions {
  @scala.inline
  def apply(
    allowCamelCase: js.UndefOr[Boolean] = js.undefined,
    ignoreFalse: js.UndefOr[Boolean] = js.undefined,
    useDoubleQuotes: js.UndefOr[Boolean] = js.undefined,
    useEquals: js.UndefOr[Boolean] = js.undefined
  ): UnparseArgsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCamelCase)) __obj.updateDynamic("allowCamelCase")(allowCamelCase.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreFalse)) __obj.updateDynamic("ignoreFalse")(ignoreFalse.asInstanceOf[js.Any])
    if (!js.isUndefined(useDoubleQuotes)) __obj.updateDynamic("useDoubleQuotes")(useDoubleQuotes.asInstanceOf[js.Any])
    if (!js.isUndefined(useEquals)) __obj.updateDynamic("useEquals")(useEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnparseArgsOptions]
  }
}

