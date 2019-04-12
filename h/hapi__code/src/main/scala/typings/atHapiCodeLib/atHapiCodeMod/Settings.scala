package typings
package atHapiCodeLib.atHapiCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * Ignore object prototypes when doing a deep comparison?
    * Defaults to false.
    */
  var comparePrototypes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Truncate long assertion error messages for readability?
    * Defaults to true.
    */
  var truncateMessages: js.UndefOr[scala.Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    comparePrototypes: js.UndefOr[scala.Boolean] = js.undefined,
    truncateMessages: js.UndefOr[scala.Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comparePrototypes)) __obj.updateDynamic("comparePrototypes")(comparePrototypes)
    if (!js.isUndefined(truncateMessages)) __obj.updateDynamic("truncateMessages")(truncateMessages)
    __obj.asInstanceOf[Settings]
  }
}

