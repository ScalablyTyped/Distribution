package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSONPDataSourceSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Override the callback function name in a jsonp request. Sets option jsonp in $.ajax functionbool Setting the jsonp option to false prevents jQuery from adding the "?callback" string to the URL or attempting to use "=?" for transformation
  	 *
  	 */
  var jsonp: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
  	 * Specify the callback function name for a JSONP request. Sets option jsonpCallback in $.ajax function
  	 */
  var jsonpCallback: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
  	 * Type of the data source.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

