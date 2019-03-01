package typings
package gulpDashShellLib.gulpDashShellMod.shellNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * Sets the current working directory for the command.
    * @default process.cwd()
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default, all the commands will be executed in an environment with all the variables in process.env
    * and PATH prepended by ./node_modules/.bin (allowing you to run executables in your Node's dependencies).
    * You can override any environment variables with this option.
    * For example, setting it to {PATH: process.env.PATH} will reset the PATH
    * if the default one brings your some troubles.
    */
  var env: js.UndefOr[js.Any] = js.undefined
  /**
    * You can add a custom error message for when the command fails. This can be a template which can be
    * interpolated with the current command, some file info (e.g. file.path) and some error info
    * (e.g. error.code).
    * @default 'Command `<%= command %>` failed with exit code <%= error.code %>'
    */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default, it will emit an error event when the command finishes unsuccessfully.
    * @default false
    */
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * You won't need to set this option unless you encounter a "stdout maxBuffer exceeded" error.
    * @default 16MB(16 * 1024 * 1024)
    */
  var maxBuffer: js.UndefOr[scala.Double] = js.undefined
  /**
    * By default, it will print the command output.
    * @default false
    */
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The data that can be accessed in template.
    */
  var templateData: js.UndefOr[js.Any] = js.undefined
  /**
    * The maximum amount of time in milliseconds the process is allowed to run.
    * @default
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    env: js.Any = null,
    errorMessage: java.lang.String = null,
    ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined,
    maxBuffer: scala.Int | scala.Double = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    templateData: js.Any = null,
    timeout: scala.Int | scala.Double = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (templateData != null) __obj.updateDynamic("templateData")(templateData)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

