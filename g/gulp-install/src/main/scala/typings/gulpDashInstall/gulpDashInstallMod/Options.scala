package typings.gulpDashInstall.gulpDashInstallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowRoot: js.UndefOr[Boolean] = js.undefined
  var args: js.UndefOr[String | js.Array[String]] = js.undefined
  var ignoreScripts: js.UndefOr[Boolean] = js.undefined
  var noOptional: js.UndefOr[Boolean] = js.undefined
  var production: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowRoot: js.UndefOr[Boolean] = js.undefined,
    args: String | js.Array[String] = null,
    ignoreScripts: js.UndefOr[Boolean] = js.undefined,
    noOptional: js.UndefOr[Boolean] = js.undefined,
    production: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRoot)) __obj.updateDynamic("allowRoot")(allowRoot.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreScripts)) __obj.updateDynamic("ignoreScripts")(ignoreScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(noOptional)) __obj.updateDynamic("noOptional")(noOptional.asInstanceOf[js.Any])
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

