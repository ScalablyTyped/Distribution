package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridGroupByColumnSettingsSummaries
  extends /**
	 * Option for IgGridGroupByColumnSettingsSummaries
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies a custom summary function, which is called for each group, it should return the custom summary result.It takes as argument object with the following signature: {dataRecords: [], array: [], key: "", allGroupData: []} where,
  	 * dataRecords - array of grouped (for the [data view](ig.datasource#methods:dataView)) data records,
  	 * array - array of cell values for the specified column,
  	 * key - key of the grouped column,
  	 * allGroupData - array of data records for the group(for the whole data source - not only for the data view)
  	 *
  	 *
  	 * Valid values:
  	 * "string" the name of the function as a string located in the global window object.
  	 * "function" which will be used for calculating the summary value.
  	 */
  var customSummary: js.UndefOr[String | js.Function] = js.undefined
  /**
  	 * the summary function key
  	 *
  	 *
  	 * Valid values:
  	 * "avg" average summary function
  	 * "min" minimum summary function
  	 * "max" maximum summary function
  	 * "sum" sum summary function
  	 * "count" count summary function
  	 * "custom" custom summary summary function
  	 */
  var summaryFunction: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the summary text that will be shown before the value
  	 *
  	 */
  var text: js.UndefOr[String] = js.undefined
}

object IgGridGroupByColumnSettingsSummaries {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridGroupByColumnSettingsSummaries
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    customSummary: String | js.Function = null,
    summaryFunction: String = null,
    text: String = null
  ): IgGridGroupByColumnSettingsSummaries = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (customSummary != null) __obj.updateDynamic("customSummary")(customSummary.asInstanceOf[js.Any])
    if (summaryFunction != null) __obj.updateDynamic("summaryFunction")(summaryFunction.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridGroupByColumnSettingsSummaries]
  }
}

