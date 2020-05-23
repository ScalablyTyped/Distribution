package typings.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var binaries: js.UndefOr[Boolean] = js.undefined
  var customIcons: js.UndefOr[Boolean] = js.undefined
  var historyRules: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    binaries: js.UndefOr[Boolean] = js.undefined,
    customIcons: js.UndefOr[Boolean] = js.undefined,
    historyRules: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binaries)) __obj.updateDynamic("binaries")(binaries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(customIcons)) __obj.updateDynamic("customIcons")(customIcons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(historyRules)) __obj.updateDynamic("historyRules")(historyRules.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

