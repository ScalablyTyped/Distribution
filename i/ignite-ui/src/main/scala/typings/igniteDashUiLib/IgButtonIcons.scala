package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgButtonIcons
  extends /**
	 * Option for IgButtonIcons
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var primary: js.UndefOr[js.Any] = js.undefined
  var secondary: js.UndefOr[js.Any] = js.undefined
}

object IgButtonIcons {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgButtonIcons
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    primary: js.Any = null,
    secondary: js.Any = null
  ): IgButtonIcons = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary)
    __obj.asInstanceOf[IgButtonIcons]
  }
}

