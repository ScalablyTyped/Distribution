package typings
package jsdocDashToDashMarkdownLib.jsdocDashToDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsdocOptions extends js.Object {
  /**
    * The path to the jsdoc configuration file.
    *  Default: path/to/jsdoc/conf.json.
    */
  var configure: js.UndefOr[java.lang.String] = js.undefined
  /**
    * One or more filenames to process.
    * Accepts globs (e.g. *.js). Either files, source or data must be supplied.
    */
  var files: java.lang.String | js.Array[java.lang.String]
  /**
    * By default results are cached to speed up repeat invocations.
    * Set to true to disable this.
    */
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A string containing source code to process.
    * Either files, source or data must be supplied.
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object JsdocOptions {
  @scala.inline
  def apply(
    files: java.lang.String | js.Array[java.lang.String],
    configure: java.lang.String = null,
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): JsdocOptions = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    if (configure != null) __obj.updateDynamic("configure")(configure)
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[JsdocOptions]
  }
}

