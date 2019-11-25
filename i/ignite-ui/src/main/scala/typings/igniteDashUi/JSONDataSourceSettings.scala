package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONDataSourceSettings
  extends /**
	 * Option for JSONDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Type of the data source.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object JSONDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for JSONDataSourceSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    `type`: String = null
  ): JSONDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONDataSourceSettings]
  }
}

