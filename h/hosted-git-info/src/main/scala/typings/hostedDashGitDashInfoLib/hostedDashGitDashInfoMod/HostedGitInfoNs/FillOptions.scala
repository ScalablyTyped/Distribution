package typings
package hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillOptions extends Options {
  var auth: js.UndefOr[java.lang.String] = js.undefined
  var committish: js.UndefOr[java.lang.String] = js.undefined
  var fragment: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var treepath: js.UndefOr[java.lang.String] = js.undefined
}

object FillOptions {
  @scala.inline
  def apply(
    auth: java.lang.String = null,
    committish: java.lang.String = null,
    fragment: java.lang.String = null,
    noCommittish: js.UndefOr[scala.Boolean] = js.undefined,
    noGitPlus: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    treepath: java.lang.String = null
  ): FillOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (committish != null) __obj.updateDynamic("committish")(committish)
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (!js.isUndefined(noCommittish)) __obj.updateDynamic("noCommittish")(noCommittish)
    if (!js.isUndefined(noGitPlus)) __obj.updateDynamic("noGitPlus")(noGitPlus)
    if (path != null) __obj.updateDynamic("path")(path)
    if (treepath != null) __obj.updateDynamic("treepath")(treepath)
    __obj.asInstanceOf[FillOptions]
  }
}

