package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTDataSourceSettings
  extends /**
	 * Option for RESTDataSourceSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Settings related to REST compliant update routine
  	 */
  var restSettings: js.UndefOr[RESTDataSourceSettingsRestSettings] = js.undefined
}

object RESTDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for RESTDataSourceSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    restSettings: RESTDataSourceSettingsRestSettings = null
  ): RESTDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (restSettings != null) __obj.updateDynamic("restSettings")(restSettings)
    __obj.asInstanceOf[RESTDataSourceSettings]
  }
}

