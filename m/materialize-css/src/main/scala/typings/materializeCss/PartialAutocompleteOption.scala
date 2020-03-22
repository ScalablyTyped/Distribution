package typings.materializeCss

import typings.materializeCss.M.AutocompleteData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.AutocompleteOptions> */
trait PartialAutocompleteOption extends js.Object {
  var data: js.UndefOr[AutocompleteData] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var onAutocomplete: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* text */ String, Unit]] = js.undefined
  var sortFunction: js.UndefOr[js.Function3[/* a */ String, /* b */ String, /* inputText */ String, Double]] = js.undefined
}

object PartialAutocompleteOption {
  @scala.inline
  def apply(
    data: AutocompleteData = null,
    limit: Int | Double = null,
    minLength: Int | Double = null,
    onAutocomplete: js.ThisFunction1[PartialAutocompleteOption, /* text */ String, Unit] = null,
    sortFunction: (/* a */ String, /* b */ String, /* inputText */ String) => Double = null
  ): PartialAutocompleteOption = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (onAutocomplete != null) __obj.updateDynamic("onAutocomplete")(onAutocomplete.asInstanceOf[js.Any])
    if (sortFunction != null) __obj.updateDynamic("sortFunction")(js.Any.fromFunction3(sortFunction))
    __obj.asInstanceOf[PartialAutocompleteOption]
  }
}

