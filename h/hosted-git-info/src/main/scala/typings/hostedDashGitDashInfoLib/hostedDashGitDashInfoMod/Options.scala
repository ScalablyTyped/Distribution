package typings
package hostedDashGitDashInfoLib.hostedDashGitDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var noCommittish: js.UndefOr[scala.Boolean] = js.undefined
  var noGitPlus: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    noCommittish: js.UndefOr[scala.Boolean] = js.undefined,
    noGitPlus: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noCommittish)) __obj.updateDynamic("noCommittish")(noCommittish)
    if (!js.isUndefined(noGitPlus)) __obj.updateDynamic("noGitPlus")(noGitPlus)
    __obj.asInstanceOf[Options]
  }
}

