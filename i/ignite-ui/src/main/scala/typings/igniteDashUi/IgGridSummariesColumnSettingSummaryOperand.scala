package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridSummariesColumnSettingSummaryOperand
  extends /**
	 * Option for IgGridSummariesColumnSettingSummaryOperand
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If it is false the summary operand will be shown in dropdown but it will not be made calculation
  	 *
  	 */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies a format that will be applied to the current summary operant.
  	 * When this option is not set, the [format](ui.iggrid#options:columns.format) of the column it is in will taken into account.
  	 * When this option and the column [format](ui.iggrid#options:columns.format) is not set, the regional settings will be taken depending on the [autoFormat](ui.iggrid#options:autoFormat) option.
  	 * If the column type is not specified in the [autoFormat](ui.iggrid#options:autoFormat) option and no format is set for both column and summary operand, no formatting is applied.
  	 *
  	 */
  var format: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the order of elements in dropdown. It is recommended to set order of custom operands and to be greater or equal to 5
  	 *
  	 */
  var order: js.UndefOr[Double] = js.undefined
  /**
  	 * Text of the summary method which is shown in summary cell
  	 *
  	 */
  var rowDisplayLabel: js.UndefOr[String] = js.undefined
  /**
  	 * Name of the custom summary function which should be executed when type is custom
  	 *
  	 */
  var summaryCalculator: js.UndefOr[String] = js.undefined
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
  var `type`: js.UndefOr[String] = js.undefined
}

object IgGridSummariesColumnSettingSummaryOperand {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridSummariesColumnSettingSummaryOperand
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    order: Int | Double = null,
    rowDisplayLabel: String = null,
    summaryCalculator: String = null,
    `type`: String = null
  ): IgGridSummariesColumnSettingSummaryOperand = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (format != null) __obj.updateDynamic("format")(format)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (rowDisplayLabel != null) __obj.updateDynamic("rowDisplayLabel")(rowDisplayLabel)
    if (summaryCalculator != null) __obj.updateDynamic("summaryCalculator")(summaryCalculator)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IgGridSummariesColumnSettingSummaryOperand]
  }
}

