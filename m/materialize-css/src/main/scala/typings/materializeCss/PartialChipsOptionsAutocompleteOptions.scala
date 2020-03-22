package typings.materializeCss

import typings.materializeCss.M.ChipData
import typings.materializeCss.M.Chips
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ChipsOptions> */
trait PartialChipsOptionsAutocompleteOptions extends js.Object {
  var autocompleteOptions: js.UndefOr[PartialAutocompleteOptionData] = js.undefined
  var data: js.UndefOr[js.Array[ChipData]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var onChipAdd: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.undefined
  var onChipDelete: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.undefined
  var onChipSelect: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var secondaryPlaceholder: js.UndefOr[String] = js.undefined
}

object PartialChipsOptionsAutocompleteOptions {
  @scala.inline
  def apply(
    autocompleteOptions: PartialAutocompleteOptionData = null,
    data: js.Array[ChipData] = null,
    limit: Int | Double = null,
    onChipAdd: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit] = null,
    onChipDelete: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit] = null,
    onChipSelect: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit] = null,
    placeholder: String = null,
    secondaryPlaceholder: String = null
  ): PartialChipsOptionsAutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (autocompleteOptions != null) __obj.updateDynamic("autocompleteOptions")(autocompleteOptions.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (onChipAdd != null) __obj.updateDynamic("onChipAdd")(onChipAdd.asInstanceOf[js.Any])
    if (onChipDelete != null) __obj.updateDynamic("onChipDelete")(onChipDelete.asInstanceOf[js.Any])
    if (onChipSelect != null) __obj.updateDynamic("onChipSelect")(onChipSelect.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (secondaryPlaceholder != null) __obj.updateDynamic("secondaryPlaceholder")(secondaryPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialChipsOptionsAutocompleteOptions]
  }
}

