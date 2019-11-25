package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgResponsiveContainer
  extends /**
	 * Option for igResponsiveContainer
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
    StringDictionary: /**
  	 * Option for igResponsiveContainer
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    pollingInterval: Int | Double = null
  ): IgResponsiveContainer = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (pollingInterval != null) __obj.updateDynamic("pollingInterval")(pollingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgResponsiveContainer]
  }
}

