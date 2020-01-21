package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTimePickerItemsDelta
  extends /**
	 * Option for IgTimePickerItemsDelta
	 */
/* optionName */ StringDictionary[js.Any] {
  var hours: js.UndefOr[Double] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
}

object IgTimePickerItemsDelta {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTimePickerItemsDelta
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    hours: Int | Double = null,
    minutes: Int | Double = null
  ): IgTimePickerItemsDelta = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTimePickerItemsDelta]
  }
}

