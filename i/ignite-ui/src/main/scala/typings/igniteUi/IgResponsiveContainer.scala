package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgResponsiveContainer
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * The time between two resize checks in milliseconds.
    */
  var pollingInterval: js.UndefOr[Double] = js.undefined
}

object IgResponsiveContainer {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    pollingInterval: js.UndefOr[Double] = js.undefined
  ): IgResponsiveContainer = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(pollingInterval)) __obj.updateDynamic("pollingInterval")(pollingInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgResponsiveContainer]
  }
}

