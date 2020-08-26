package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSummariesColumnSettingSummaryOperand
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * If it is false the summary operand will be shown in dropdown but it will not be made calculation
    *
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a format that will be applied to the current summary operant.
    * When this option is not set, the [format](ui.iggrid#options:columns.format) of the column it is in will taken into account.
    * When this option and the column [format](ui.iggrid#options:columns.format) is not set, the regional settings will be taken depending on the [autoFormat](ui.iggrid#options:autoFormat) option.
    * If the column type is not specified in the [autoFormat](ui.iggrid#options:autoFormat) option and no format is set for both column and summary operand, no formatting is applied.
    *
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Specifies the order of elements in dropdown. It is recommended to set order of custom operands and to be greater or equal to 5
    *
    */
  var order: js.UndefOr[Double] = js.native
  /**
    * Text of the summary method which is shown in summary cell
    *
    */
  var rowDisplayLabel: js.UndefOr[String] = js.native
  /**
    * Name of the custom summary function which should be executed when type is custom
    *
    */
  var summaryCalculator: js.UndefOr[String] = js.native
  /**
    * Set type of summary operand
    *
    *
    * Valid values:
    * "count" calculate count of result rows for the specified column
    * "min" calculate min of result rows for the specified column
    * "max" calculate max of result rows for the specified column
    * "sum" calculate sum of result rows for the specified column
    * "avg" calculate average of result rows for the specified column
    * "custom" calculate custom function (specified by summaryCalculator property) of result rows for the specified column
    */
  var `type`: js.UndefOr[String] = js.native
}

object IgGridSummariesColumnSettingSummaryOperand {
  @scala.inline
  def apply(): IgGridSummariesColumnSettingSummaryOperand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummariesColumnSettingSummaryOperand]
  }
  @scala.inline
  implicit class IgGridSummariesColumnSettingSummaryOperandOps[Self <: IgGridSummariesColumnSettingSummaryOperand] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setRowDisplayLabel(value: String): Self = this.set("rowDisplayLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDisplayLabel: Self = this.set("rowDisplayLabel", js.undefined)
    @scala.inline
    def setSummaryCalculator(value: String): Self = this.set("summaryCalculator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryCalculator: Self = this.set("summaryCalculator", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

