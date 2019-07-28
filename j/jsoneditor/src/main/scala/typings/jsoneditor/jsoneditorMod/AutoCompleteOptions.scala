package typings.jsoneditor.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * @default [39, 35, 9]
    */
  var confirmKeys: js.UndefOr[js.Array[Double]] = js.undefined
  var getOptions: js.UndefOr[AutoCompleteOptionsGetter] = js.undefined
}

object AutoCompleteOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    confirmKeys: js.Array[Double] = null,
    getOptions: AutoCompleteOptionsGetter = null
  ): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (confirmKeys != null) __obj.updateDynamic("confirmKeys")(confirmKeys)
    if (getOptions != null) __obj.updateDynamic("getOptions")(getOptions)
    __obj.asInstanceOf[AutoCompleteOptions]
  }
}

