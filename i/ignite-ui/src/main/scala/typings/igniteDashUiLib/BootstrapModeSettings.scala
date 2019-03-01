package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapModeSettings
  extends /**
	 * Option for BootstrapModeSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var visibilityTester: js.UndefOr[js.Any] = js.undefined
}

object BootstrapModeSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for BootstrapModeSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: java.lang.String = null,
    visibilityTester: js.Any = null
  ): BootstrapModeSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key)
    if (visibilityTester != null) __obj.updateDynamic("visibilityTester")(visibilityTester)
    __obj.asInstanceOf[BootstrapModeSettings]
  }
}

