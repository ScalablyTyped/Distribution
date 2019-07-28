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
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONDataSourceSettings]
  }
}

