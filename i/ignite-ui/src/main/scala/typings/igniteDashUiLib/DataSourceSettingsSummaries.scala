package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceSettingsSummaries
  extends /**
	 * Option for DataSourceSettingsSummaries
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A list of column settings that specifies custom summaries options per column basis
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Key for retrieving data from the summaries response - used only when summaries are remote
  	 *
  	 */
  var summariesResponseKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Determines when the summary values are calculated
  	 *
  	 *
  	 * Valid values:
  	 * "priortofilteringandpaging"
  	 * "afterfilteringbeforepaging"
  	 * "afterfilteringandpaging"
  	 */
  var summaryExecution: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Url key for retrieving data from response - used only when summaries are remote
  	 *
  	 */
  var summaryExprUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies whether summaries will be applied locally or remotely (via a remote request)
  	 *
  	 *
  	 * Valid values:
  	 * "remote" A remote request is done and URL params encoded
  	 * "local" Data is paged client-side.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

