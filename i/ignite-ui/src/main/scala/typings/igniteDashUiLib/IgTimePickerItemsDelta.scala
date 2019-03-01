package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTimePickerItemsDelta
  extends /**
	 * Option for IgTimePickerItemsDelta
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var hours: js.UndefOr[scala.Double] = js.undefined
  var minutes: js.UndefOr[scala.Double] = js.undefined
}

object IgTimePickerItemsDelta {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTimePickerItemsDelta
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    hours: scala.Int | scala.Double = null,
    minutes: scala.Int | scala.Double = null
  ): IgTimePickerItemsDelta = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTimePickerItemsDelta]
  }
}

