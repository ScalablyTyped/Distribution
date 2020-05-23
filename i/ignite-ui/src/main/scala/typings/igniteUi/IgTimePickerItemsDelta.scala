package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTimePickerItemsDelta
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  var hours: js.UndefOr[Double] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
}

object IgTimePickerItemsDelta {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    hours: js.UndefOr[Double] = js.undefined,
    minutes: js.UndefOr[Double] = js.undefined
  ): IgTimePickerItemsDelta = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(hours)) __obj.updateDynamic("hours")(hours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTimePickerItemsDelta]
  }
}

