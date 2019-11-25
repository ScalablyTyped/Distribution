package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPDataSourceSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Override the callback function name in a jsonp request. Sets option jsonp in $.ajax functionbool Setting the jsonp option to false prevents jQuery from adding the "?callback" string to the URL or attempting to use "=?" for transformation
  	 *
  	 */
  var jsonp: js.UndefOr[String | Boolean] = js.undefined
  /**
  	 * Specify the callback function name for a JSONP request. Sets option jsonpCallback in $.ajax function
  	 */
  var jsonpCallback: js.UndefOr[String | js.Function] = js.undefined
  /**
  	 * Type of the data source.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object JSONPDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for JSONPDataSourceSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    jsonp: String | Boolean = null,
    jsonpCallback: String | js.Function = null,
    `type`: String = null
  ): JSONPDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONPDataSourceSettings]
  }
}

