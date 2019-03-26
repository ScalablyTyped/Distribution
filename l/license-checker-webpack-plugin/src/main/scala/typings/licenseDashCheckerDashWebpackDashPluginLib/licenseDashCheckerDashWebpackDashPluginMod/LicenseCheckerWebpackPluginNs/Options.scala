package typings
package licenseDashCheckerDashWebpackDashPluginLib.licenseDashCheckerDashWebpackDashPluginMod.LicenseCheckerWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * SPDX expression with allowed licenses.
    *
    * Default: `"(Apache-2.0 OR BSD-2-Clause OR BSD-3-Clause OR MIT)"`
    */
  var allow: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to emit errors instead of warnings.
    *
    * Default: `false`
    */
  var emitError: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Regular expression that matches the file paths of dependencies to check.
    */
  var filter: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Array of dependencies to ignore, in the format `["<dependency name>@<version range>"]`.
    * For example, `["assignment@^2.0.0"]`.
    *
    * Default: `[]`
    */
  var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Name of the third-party notices file with all licensing information.
    *
    * Default: `"ThirdPartyNotices.txt"`
    */
  var outputFilename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path to a `.ejs` template, or function that will generate the contents
    * of the third-party notices file.
    */
  var outputWriter: js.UndefOr[
    java.lang.String | (js.Function1[/* dependencies */ js.Array[Dependency], java.lang.String])
  ] = js.undefined
  /**
    * Object of dependencies to override, in the format `{"<dependency name>@<version range>": { ... }}`.
    * For example, `{"assignment@^2.0.0": { licenseName: "MIT" }}`.
    *
    * Default: `{}`
    */
  var `override`: js.UndefOr[stdLib.Record[java.lang.String, stdLib.Partial[Dependency]]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allow: java.lang.String = null,
    emitError: js.UndefOr[scala.Boolean] = js.undefined,
    filter: stdLib.RegExp = null,
    ignore: js.Array[java.lang.String] = null,
    outputFilename: java.lang.String = null,
    outputWriter: java.lang.String | (js.Function1[/* dependencies */ js.Array[Dependency], java.lang.String]) = null,
    `override`: stdLib.Record[java.lang.String, stdLib.Partial[Dependency]] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow)
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (outputFilename != null) __obj.updateDynamic("outputFilename")(outputFilename)
    if (outputWriter != null) __obj.updateDynamic("outputWriter")(outputWriter.asInstanceOf[js.Any])
    if (`override` != null) __obj.updateDynamic("override")(`override`)
    __obj.asInstanceOf[Options]
  }
}

