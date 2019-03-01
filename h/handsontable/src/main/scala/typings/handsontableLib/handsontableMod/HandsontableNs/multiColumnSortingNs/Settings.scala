package typings
package handsontableLib.handsontableMod.HandsontableNs.multiColumnSortingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var compareFunctionFactory: js.UndefOr[
    js.Function2[
      /* sortOrder */ handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.SortOrderType, 
      /* columnMeta */ handsontableLib.handsontableMod.HandsontableNs.GridSettings, 
      js.Function2[
        /* value */ _, 
        /* nextValue */ _, 
        handsontableLib.handsontableLibNumbers.`-1` | handsontableLib.handsontableLibNumbers.`0` | handsontableLib.handsontableLibNumbers.`1`
      ]
    ]
  ] = js.undefined
  var headerAction: js.UndefOr[scala.Boolean] = js.undefined
  var indicator: js.UndefOr[scala.Boolean] = js.undefined
  var initialConfig: js.UndefOr[
    handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config | js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config]
  ] = js.undefined
  var sortEmptyCells: js.UndefOr[scala.Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    compareFunctionFactory: js.Function2[
      /* sortOrder */ handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.SortOrderType, 
      /* columnMeta */ handsontableLib.handsontableMod.HandsontableNs.GridSettings, 
      js.Function2[
        /* value */ _, 
        /* nextValue */ _, 
        handsontableLib.handsontableLibNumbers.`-1` | handsontableLib.handsontableLibNumbers.`0` | handsontableLib.handsontableLibNumbers.`1`
      ]
    ] = null,
    headerAction: js.UndefOr[scala.Boolean] = js.undefined,
    indicator: js.UndefOr[scala.Boolean] = js.undefined,
    initialConfig: handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config | js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config] = null,
    sortEmptyCells: js.UndefOr[scala.Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (compareFunctionFactory != null) __obj.updateDynamic("compareFunctionFactory")(compareFunctionFactory)
    if (!js.isUndefined(headerAction)) __obj.updateDynamic("headerAction")(headerAction)
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator)
    if (initialConfig != null) __obj.updateDynamic("initialConfig")(initialConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(sortEmptyCells)) __obj.updateDynamic("sortEmptyCells")(sortEmptyCells)
    __obj.asInstanceOf[Settings]
  }
}

