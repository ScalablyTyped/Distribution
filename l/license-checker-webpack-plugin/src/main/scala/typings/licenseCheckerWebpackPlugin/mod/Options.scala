package typings.licenseCheckerWebpackPlugin.mod

import typings.licenseCheckerWebpackPlugin.anon.PartialDependency
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * SPDX expression with allowed licenses.
    *
    * Default: `"(Apache-2.0 OR BSD-2-Clause OR BSD-3-Clause OR MIT)"`
    */
  var allow: String
  /**
    * Whether to emit errors instead of warnings.
    *
    * Default: `false`
    */
  var emitError: Boolean
  /**
    * Regular expression that matches the file paths of dependencies to check.
    */
  var filter: RegExp
  /**
    * Array of dependencies to ignore, in the format `["<dependency name>@<version range>"]`.
    * For example, `["assignment@^2.0.0"]`.
    *
    * Default: `[]`
    */
  var ignore: js.Array[String]
  /**
    * Name of the third-party notices file with all licensing information.
    *
    * Default: `"ThirdPartyNotices.txt"`
    */
  var outputFilename: String
  /**
    * Path to a `.ejs` template, or function that will generate the contents
    * of the third-party notices file.
    */
  var outputWriter: String | OutputWriter
  /**
    * Object of dependencies to override, in the format `{"<dependency name>@<version range>": { ... }}`.
    * For example, `{"assignment@^2.0.0": { licenseName: "MIT" }}`.
    *
    * Default: `{}`
    */
  var `override`: Record[String, PartialDependency]
}

object Options {
  @scala.inline
  def apply(
    allow: String,
    emitError: Boolean,
    filter: RegExp,
    ignore: js.Array[String],
    outputFilename: String,
    outputWriter: String | OutputWriter,
    `override`: Record[String, PartialDependency]
  ): Options = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], emitError = emitError.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], outputFilename = outputFilename.asInstanceOf[js.Any], outputWriter = outputWriter.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

