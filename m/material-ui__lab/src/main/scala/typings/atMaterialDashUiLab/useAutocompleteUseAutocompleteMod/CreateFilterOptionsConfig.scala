package typings.atMaterialDashUiLab.useAutocompleteUseAutocompleteMod

import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.any
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFilterOptionsConfig extends js.Object {
  var ignoreAccents: js.UndefOr[Boolean] = js.undefined
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var matchFrom: js.UndefOr[any | start] = js.undefined
  var stringify: js.UndefOr[js.Function1[/* option */ js.Any, String]] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
}

object CreateFilterOptionsConfig {
  @scala.inline
  def apply(
    ignoreAccents: js.UndefOr[Boolean] = js.undefined,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    matchFrom: any | start = null,
    stringify: /* option */ js.Any => String = null,
    trim: js.UndefOr[Boolean] = js.undefined
  ): CreateFilterOptionsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreAccents)) __obj.updateDynamic("ignoreAccents")(ignoreAccents.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (matchFrom != null) __obj.updateDynamic("matchFrom")(matchFrom.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction1(stringify))
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilterOptionsConfig]
  }
}

