package typings.gulpDashShell.gulpDashShellMod

import typings.gulpDashShell.gulpDashShellNumbers.`true`
import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var shell: js.UndefOr[`true` | String] = js.undefined
  var templateData: js.UndefOr[js.Object] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: String = null,
    env: ProcessEnv = null,
    errorMessage: String = null,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    quiet: js.UndefOr[Boolean] = js.undefined,
    shell: `true` | String = null,
    templateData: js.Object = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (templateData != null) __obj.updateDynamic("templateData")(templateData.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

