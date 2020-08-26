package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnFilterableCell extends js.Object {
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var dataTextField: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var inputWidth: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var operator: js.UndefOr[String] = js.native
  var showOperators: js.UndefOr[Boolean] = js.native
  var suggestionOperator: js.UndefOr[String] = js.native
  var template: js.UndefOr[js.Function] = js.native
}

object GridColumnFilterableCell {
  @scala.inline
  def apply(): GridColumnFilterableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnFilterableCell]
  }
  @scala.inline
  implicit class GridColumnFilterableCellOps[Self <: GridColumnFilterableCell] (val x: Self) extends AnyVal {
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
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataTextField(value: String): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setInputWidth(value: Double): Self = this.set("inputWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputWidth: Self = this.set("inputWidth", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setShowOperators(value: Boolean): Self = this.set("showOperators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOperators: Self = this.set("showOperators", js.undefined)
    @scala.inline
    def setSuggestionOperator(value: String): Self = this.set("suggestionOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionOperator: Self = this.set("suggestionOperator", js.undefined)
    @scala.inline
    def setTemplate(value: js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

