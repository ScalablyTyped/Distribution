package typings.materializeCss.anon

import typings.materializeCss.M.Autocomplete
import typings.materializeCss.M.AutocompleteData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.AutocompleteOptions> */
trait PartialAutocompleteOptionData extends js.Object {
  var data: js.UndefOr[AutocompleteData] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var onAutocomplete: js.UndefOr[js.ThisFunction1[/* this */ Autocomplete, /* text */ String, Unit]] = js.undefined
  var sortFunction: js.UndefOr[js.Function3[/* a */ String, /* b */ String, /* inputText */ String, Double]] = js.undefined
}

object PartialAutocompleteOptionData {
  @scala.inline
  def apply(
    data: AutocompleteData = null,
    limit: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    onAutocomplete: js.ThisFunction1[/* this */ Autocomplete, /* text */ String, Unit] = null,
    sortFunction: (/* a */ String, /* b */ String, /* inputText */ String) => Double = null
  ): PartialAutocompleteOptionData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (onAutocomplete != null) __obj.updateDynamic("onAutocomplete")(onAutocomplete.asInstanceOf[js.Any])
    if (sortFunction != null) __obj.updateDynamic("sortFunction")(js.Any.fromFunction3(sortFunction))
    __obj.asInstanceOf[PartialAutocompleteOptionData]
  }
}

