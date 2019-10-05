package typings.handsontable.handsontableMod.Handsontable.multiColumnSorting

import typings.handsontable.handsontableMod.Handsontable.GridSettings
import typings.handsontable.handsontableMod.Handsontable.columnSorting.Config
import typings.handsontable.handsontableMod.Handsontable.columnSorting.SortOrderType
import typings.handsontable.handsontableNumbers.`-1`
import typings.handsontable.handsontableNumbers.`0`
import typings.handsontable.handsontableNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var compareFunctionFactory: js.UndefOr[
    js.Function2[
      /* sortOrder */ SortOrderType, 
      /* columnMeta */ GridSettings, 
      js.Function2[/* value */ _, /* nextValue */ _, `-1` | `0` | `1`]
    ]
  ] = js.undefined
  var headerAction: js.UndefOr[Boolean] = js.undefined
  var indicator: js.UndefOr[Boolean] = js.undefined
  var initialConfig: js.UndefOr[Config | js.Array[Config]] = js.undefined
  var sortEmptyCells: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    compareFunctionFactory: (/* sortOrder */ SortOrderType, /* columnMeta */ GridSettings) => js.Function2[/* value */ _, /* nextValue */ _, `-1` | `0` | `1`] = null,
    headerAction: js.UndefOr[Boolean] = js.undefined,
    indicator: js.UndefOr[Boolean] = js.undefined,
    initialConfig: Config | js.Array[Config] = null,
    sortEmptyCells: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (compareFunctionFactory != null) __obj.updateDynamic("compareFunctionFactory")(js.Any.fromFunction2(compareFunctionFactory))
    if (!js.isUndefined(headerAction)) __obj.updateDynamic("headerAction")(headerAction)
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator)
    if (initialConfig != null) __obj.updateDynamic("initialConfig")(initialConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(sortEmptyCells)) __obj.updateDynamic("sortEmptyCells")(sortEmptyCells)
    __obj.asInstanceOf[Settings]
  }
}

