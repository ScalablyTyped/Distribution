package typings.hostedGitInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var noCommittish: js.UndefOr[Boolean] = js.undefined
  var noGitPlus: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(noCommittish: js.UndefOr[Boolean] = js.undefined, noGitPlus: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noCommittish)) __obj.updateDynamic("noCommittish")(noCommittish.asInstanceOf[js.Any])
    if (!js.isUndefined(noGitPlus)) __obj.updateDynamic("noGitPlus")(noGitPlus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

