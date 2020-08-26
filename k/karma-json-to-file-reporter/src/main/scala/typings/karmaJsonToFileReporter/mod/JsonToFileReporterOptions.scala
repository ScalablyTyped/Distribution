package typings.karmaJsonToFileReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON messages logged via console.log(_) will be filtered
  * and saved to local json file you specified in config.
  */
@js.native
trait JsonToFileReporterOptions extends js.Object {
  /**
    * File name pattern. You can use wildcards:
    * `*timestamp*` - for current karma run timestamp.
    * `*index*` - for log entry index: 1, 2, 3, etc.
    * @default 'logFile_start-timestamp.json'
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * Filter for json objects. This option can be:
    * - string - filter JSONs by field on the root level
    * - predicate function
    */
  var filter: js.UndefOr[String | (js.Function1[/* obj */ js.Object, Boolean])] = js.native
  /** Path for your json output file. By default it will save your files in the root of your project. */
  var outputPath: js.UndefOr[String] = js.native
  /**
    * Set it true to overwrite files if it already exists. If false, log entries will be added to the end
    */
  var overwrite: js.UndefOr[Boolean] = js.native
}

object JsonToFileReporterOptions {
  @scala.inline
  def apply(): JsonToFileReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonToFileReporterOptions]
  }
  @scala.inline
  implicit class JsonToFileReporterOptionsOps[Self <: JsonToFileReporterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFilterFunction1(value: /* obj */ js.Object => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setFilter(value: String | (js.Function1[/* obj */ js.Object, Boolean])): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
  }
  
}

