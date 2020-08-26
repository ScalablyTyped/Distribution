package typings.handsontable.mod.Handsontable.multiColumnSorting

import typings.handsontable.handsontableNumbers.`-1`
import typings.handsontable.handsontableNumbers.`0`
import typings.handsontable.handsontableNumbers.`1`
import typings.handsontable.mod.Handsontable.GridSettings
import typings.handsontable.mod.Handsontable.columnSorting.Config
import typings.handsontable.mod.Handsontable.columnSorting.SortOrderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var compareFunctionFactory: js.UndefOr[
    js.Function2[
      /* sortOrder */ SortOrderType, 
      /* columnMeta */ GridSettings, 
      js.Function2[/* value */ _, /* nextValue */ _, `-1` | `0` | `1`]
    ]
  ] = js.native
  var headerAction: js.UndefOr[Boolean] = js.native
  var indicator: js.UndefOr[Boolean] = js.native
  var initialConfig: js.UndefOr[Config | js.Array[Config]] = js.native
  var sortEmptyCells: js.UndefOr[Boolean] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompareFunctionFactory(
      value: (/* sortOrder */ SortOrderType, /* columnMeta */ GridSettings) => js.Function2[/* value */ _, /* nextValue */ _, `-1` | `0` | `1`]
    ): Self = this.set("compareFunctionFactory", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCompareFunctionFactory: Self = this.set("compareFunctionFactory", js.undefined)
    @scala.inline
    def setHeaderAction(value: Boolean): Self = this.set("headerAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderAction: Self = this.set("headerAction", js.undefined)
    @scala.inline
    def setIndicator(value: Boolean): Self = this.set("indicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    @scala.inline
    def setInitialConfigVarargs(value: Config*): Self = this.set("initialConfig", js.Array(value :_*))
    @scala.inline
    def setInitialConfig(value: Config | js.Array[Config]): Self = this.set("initialConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialConfig: Self = this.set("initialConfig", js.undefined)
    @scala.inline
    def setSortEmptyCells(value: Boolean): Self = this.set("sortEmptyCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortEmptyCells: Self = this.set("sortEmptyCells", js.undefined)
  }
  
}

