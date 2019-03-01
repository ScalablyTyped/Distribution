package typings
package gulpDashInstallLib.gulpDashInstallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowRoot: js.UndefOr[scala.Boolean] = js.undefined
  var args: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var ignoreScripts: js.UndefOr[scala.Boolean] = js.undefined
  var noOptional: js.UndefOr[scala.Boolean] = js.undefined
  var production: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowRoot: js.UndefOr[scala.Boolean] = js.undefined,
    args: java.lang.String | js.Array[java.lang.String] = null,
    ignoreScripts: js.UndefOr[scala.Boolean] = js.undefined,
    noOptional: js.UndefOr[scala.Boolean] = js.undefined,
    production: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRoot)) __obj.updateDynamic("allowRoot")(allowRoot)
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreScripts)) __obj.updateDynamic("ignoreScripts")(ignoreScripts)
    if (!js.isUndefined(noOptional)) __obj.updateDynamic("noOptional")(noOptional)
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production)
    __obj.asInstanceOf[Options]
  }
}

