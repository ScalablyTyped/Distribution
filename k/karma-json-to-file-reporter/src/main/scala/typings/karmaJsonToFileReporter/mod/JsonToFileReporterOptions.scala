package typings.karmaJsonToFileReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON messages logged via console.log(_) will be filtered
  * and saved to local json file you specified in config.
  */
trait JsonToFileReporterOptions extends js.Object {
  /**
    * File name pattern. You can use wildcards:
    * `*timestamp*` - for current karma run timestamp.
    * `*index*` - for log entry index: 1, 2, 3, etc.
    * @default 'logFile_start-timestamp.json'
    */
  var fileName: js.UndefOr[String] = js.undefined
  /**
    * Filter for json objects. This option can be:
    * - string - filter JSONs by field on the root level
    * - predicate function
    */
  var filter: js.UndefOr[String | (js.Function1[/* obj */ js.Object, Boolean])] = js.undefined
  /** Path for your json output file. By default it will save your files in the root of your project. */
  var outputPath: js.UndefOr[String] = js.undefined
  /**
    * Set it true to overwrite files if it already exists. If false, log entries will be added to the end
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object JsonToFileReporterOptions {
  @scala.inline
  def apply(
    fileName: String = null,
    filter: String | (js.Function1[/* obj */ js.Object, Boolean]) = null,
    outputPath: String = null,
    overwrite: js.UndefOr[Boolean] = js.undefined
  ): JsonToFileReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonToFileReporterOptions]
  }
}

