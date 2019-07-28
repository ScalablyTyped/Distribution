package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridSummariesColumnSetting
  extends /**
	 * Option for IgGridSummariesColumnSetting
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables disables summaries for the column
  	 *
  	 */
  var allowSummaries: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Column index. Can be used in place of column key. The preferred way of populating a column setting is to always use the column keys as identifiers
  	 *
  	 */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Column key. This is a required property in every column setting if columnIndex is not set
  	 *
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Check defaultSummaryOperands
  	 *
  	 */
  var summaryOperands: js.UndefOr[js.Array[IgGridSummariesColumnSettingSummaryOperand]] = js.undefined
}

object IgGridSummariesColumnSetting {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridSummariesColumnSetting
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowSummaries: js.UndefOr[Boolean] = js.undefined,
    columnIndex: Int | Double = null,
    columnKey: String = null,
    summaryOperands: js.Array[IgGridSummariesColumnSettingSummaryOperand] = null
  ): IgGridSummariesColumnSetting = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowSummaries)) __obj.updateDynamic("allowSummaries")(allowSummaries)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (summaryOperands != null) __obj.updateDynamic("summaryOperands")(summaryOperands)
    __obj.asInstanceOf[IgGridSummariesColumnSetting]
  }
}

