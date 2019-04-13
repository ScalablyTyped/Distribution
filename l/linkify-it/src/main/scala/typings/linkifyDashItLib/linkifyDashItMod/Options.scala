package typings
package linkifyDashItLib.linkifyDashItMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fuzzyEmail: js.UndefOr[scala.Boolean] = js.undefined
  var fuzzyIP: js.UndefOr[scala.Boolean] = js.undefined
  var fuzzyLink: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fuzzyEmail: js.UndefOr[scala.Boolean] = js.undefined,
    fuzzyIP: js.UndefOr[scala.Boolean] = js.undefined,
    fuzzyLink: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fuzzyEmail)) __obj.updateDynamic("fuzzyEmail")(fuzzyEmail)
    if (!js.isUndefined(fuzzyIP)) __obj.updateDynamic("fuzzyIP")(fuzzyIP)
    if (!js.isUndefined(fuzzyLink)) __obj.updateDynamic("fuzzyLink")(fuzzyLink)
    __obj.asInstanceOf[Options]
  }
}

