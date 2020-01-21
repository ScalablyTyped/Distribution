package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsSummaries
  extends /**
	 * Option for DataSourceSettingsSummaries
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A list of column settings that specifies custom summaries options per column basis
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Key for retrieving data from the summaries response - used only when summaries are remote
  	 *
  	 */
  var summariesResponseKey: js.UndefOr[String] = js.undefined
  /**
  	 * Determines when the summary values are calculated
  	 *
  	 *
  	 * Valid values:
  	 * "priortofilteringandpaging"
  	 * "afterfilteringbeforepaging"
  	 * "afterfilteringandpaging"
  	 */
  var summaryExecution: js.UndefOr[String] = js.undefined
  /**
  	 * Url key for retrieving data from response - used only when summaries are remote
  	 *
  	 */
  var summaryExprUrlKey: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies whether summaries will be applied locally or remotely (via a remote request)
  	 *
  	 *
  	 * Valid values:
  	 * "remote" A remote request is done and URL params encoded
  	 * "local" Data is paged client-side.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object DataSourceSettingsSummaries {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for DataSourceSettingsSummaries
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    columnSettings: js.Array[_] = null,
    summariesResponseKey: String = null,
    summaryExecution: String = null,
    summaryExprUrlKey: String = null,
    `type`: String = null
  ): DataSourceSettingsSummaries = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings.asInstanceOf[js.Any])
    if (summariesResponseKey != null) __obj.updateDynamic("summariesResponseKey")(summariesResponseKey.asInstanceOf[js.Any])
    if (summaryExecution != null) __obj.updateDynamic("summaryExecution")(summaryExecution.asInstanceOf[js.Any])
    if (summaryExprUrlKey != null) __obj.updateDynamic("summaryExprUrlKey")(summaryExprUrlKey.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSettingsSummaries]
  }
}

