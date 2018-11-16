package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceSettingsPaging
  extends /**
	 * Option for DataSourceSettingsPaging
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Whether when a new page of data is requested we should append the new data to the existing data
  	 *
  	 */
  var appendPage: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Paging is not enabled by default
  	 *
  	 */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Current page index
  	 *
  	 */
  var pageIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page index
  	 *
  	 */
  var pageIndexUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Number of records on each page
  	 *
  	 */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page size
  	 *
  	 */
  var pageSizeUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Type for the paging operation
  	 *
  	 *
  	 * Valid values:
  	 * "local" Data is paged client-side.
  	 * "remote" A remote request is done and URL params encoded
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

