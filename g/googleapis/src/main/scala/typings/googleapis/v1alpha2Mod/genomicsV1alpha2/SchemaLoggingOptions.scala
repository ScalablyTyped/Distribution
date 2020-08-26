package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The logging options for the pipeline run.
  */
@js.native
trait SchemaLoggingOptions extends js.Object {
  /**
    * The location in Google Cloud Storage to which the pipeline logs will be
    * copied. Can be specified as a fully qualified directory path, in which
    * case logs will be output with a unique identifier as the filename in that
    * directory, or as a fully specified path, which must end in `.log`, in
    * which case that path will be used, and the user must ensure that logs are
    * not overwritten. Stdout and stderr logs from the run are also generated
    * and output as `-stdout.log` and `-stderr.log`.
    */
  var gcsPath: js.UndefOr[String] = js.native
}

object SchemaLoggingOptions {
  @scala.inline
  def apply(): SchemaLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoggingOptions]
  }
  @scala.inline
  implicit class SchemaLoggingOptionsOps[Self <: SchemaLoggingOptions] (val x: Self) extends AnyVal {
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
    def setGcsPath(value: String): Self = this.set("gcsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsPath: Self = this.set("gcsPath", js.undefined)
  }
  
}

