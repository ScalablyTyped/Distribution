package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgComboLoadOnDemandSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets option to enable load on demand.
    *
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets/Sets number of records loaded on each request.
    *
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}

object IgComboLoadOnDemandSettings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined
  ): IgComboLoadOnDemandSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgComboLoadOnDemandSettings]
  }
}

