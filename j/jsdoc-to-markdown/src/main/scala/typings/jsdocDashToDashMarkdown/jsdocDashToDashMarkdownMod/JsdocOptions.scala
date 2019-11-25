package typings.jsdocDashToDashMarkdown.jsdocDashToDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsdocOptions extends js.Object {
  /**
    * The path to the jsdoc configuration file.
    *  Default: path/to/jsdoc/conf.json.
    */
  var configure: js.UndefOr[String] = js.undefined
  /**
    * One or more filenames to process.
    * Accepts globs (e.g. *.js). Either files, source or data must be supplied.
    */
  var files: String | js.Array[String]
  /**
    * By default results are cached to speed up repeat invocations.
    * Set to true to disable this.
    */
  var noCache: js.UndefOr[Boolean] = js.undefined
  /**
    * A string containing source code to process.
    * Either files, source or data must be supplied.
    */
  var source: js.UndefOr[String] = js.undefined
}

object JsdocOptions {
  @scala.inline
  def apply(
    files: String | js.Array[String],
    configure: String = null,
    noCache: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): JsdocOptions = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    if (configure != null) __obj.updateDynamic("configure")(configure.asInstanceOf[js.Any])
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsdocOptions]
  }
}

