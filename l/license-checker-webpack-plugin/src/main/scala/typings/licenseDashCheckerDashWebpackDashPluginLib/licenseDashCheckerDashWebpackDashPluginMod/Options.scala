package typings
package licenseDashCheckerDashWebpackDashPluginLib.licenseDashCheckerDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * SPDX expression with allowed licenses.
    *
    * Default: `"(Apache-2.0 OR BSD-2-Clause OR BSD-3-Clause OR MIT)"`
    */
  var allow: java.lang.String
  /**
    * Whether to emit errors instead of warnings.
    *
    * Default: `false`
    */
  var emitError: scala.Boolean
  /**
    * Regular expression that matches the file paths of dependencies to check.
    */
  var filter: stdLib.RegExp
  /**
    * Array of dependencies to ignore, in the format `["<dependency name>@<version range>"]`.
    * For example, `["assignment@^2.0.0"]`.
    *
    * Default: `[]`
    */
  var ignore: js.Array[java.lang.String]
  /**
    * Name of the third-party notices file with all licensing information.
    *
    * Default: `"ThirdPartyNotices.txt"`
    */
  var outputFilename: java.lang.String
  /**
    * Path to a `.ejs` template, or function that will generate the contents
    * of the third-party notices file.
    */
  var outputWriter: java.lang.String | (js.Function1[/* dependencies */ js.Array[Dependency], java.lang.String])
  /**
    * Object of dependencies to override, in the format `{"<dependency name>@<version range>": { ... }}`.
    * For example, `{"assignment@^2.0.0": { licenseName: "MIT" }}`.
    *
    * Default: `{}`
    */
  var `override`: stdLib.Record[java.lang.String, stdLib.Partial[Dependency]]
}

object Options {
  @scala.inline
  def apply(
    allow: java.lang.String,
    emitError: scala.Boolean,
    filter: stdLib.RegExp,
    ignore: js.Array[java.lang.String],
    outputFilename: java.lang.String,
    outputWriter: java.lang.String | (js.Function1[/* dependencies */ js.Array[Dependency], java.lang.String]),
    `override`: stdLib.Record[java.lang.String, stdLib.Partial[Dependency]]
  ): Options = {
    val __obj = js.Dynamic.literal(allow = allow, emitError = emitError, filter = filter, ignore = ignore, outputFilename = outputFilename, outputWriter = outputWriter.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`)
    __obj.asInstanceOf[Options]
  }
}

