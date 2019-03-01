package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgResponsiveContainer
  extends /**
	 * Option for igResponsiveContainer
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * The time between two resize checks in milliseconds.
  	 */
  var pollingInterval: js.UndefOr[scala.Double] = js.undefined
}

object IgResponsiveContainer {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igResponsiveContainer
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    pollingInterval: scala.Int | scala.Double = null
  ): IgResponsiveContainer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (pollingInterval != null) __obj.updateDynamic("pollingInterval")(pollingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgResponsiveContainer]
  }
}

