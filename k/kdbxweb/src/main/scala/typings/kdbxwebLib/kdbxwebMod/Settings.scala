package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var binaries: js.UndefOr[scala.Boolean] = js.undefined
  var customIcons: js.UndefOr[scala.Boolean] = js.undefined
  var historyRules: js.UndefOr[scala.Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    binaries: js.UndefOr[scala.Boolean] = js.undefined,
    customIcons: js.UndefOr[scala.Boolean] = js.undefined,
    historyRules: js.UndefOr[scala.Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binaries)) __obj.updateDynamic("binaries")(binaries)
    if (!js.isUndefined(customIcons)) __obj.updateDynamic("customIcons")(customIcons)
    if (!js.isUndefined(historyRules)) __obj.updateDynamic("historyRules")(historyRules)
    __obj.asInstanceOf[Settings]
  }
}

