package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgComboLoadOnDemandSettings
  extends /**
	 * Option for IgComboLoadOnDemandSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets option to enable load on demand.
  	 *
  	 */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets number of records loaded on each request.
  	 *
  	 */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
}

object IgComboLoadOnDemandSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgComboLoadOnDemandSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    pageSize: scala.Int | scala.Double = null
  ): IgComboLoadOnDemandSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgComboLoadOnDemandSettings]
  }
}

