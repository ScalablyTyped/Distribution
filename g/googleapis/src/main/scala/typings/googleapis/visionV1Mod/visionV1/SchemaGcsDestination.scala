package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Google Cloud Storage location where the output will be written to.
  */
@js.native
trait SchemaGcsDestination extends js.Object {
  /**
    * Google Cloud Storage URI where the results will be stored. Results will
    * be in JSON format and preceded by its corresponding input URI. This field
    * can either represent a single file, or a prefix for multiple outputs.
    * Prefixes must end in a `/`.  Examples:  *    File:
    * gs://bucket-name/filename.json *    Prefix: gs://bucket-name/prefix/here/
    * *    File: gs://bucket-name/prefix/here  If multiple outputs, each
    * response is still AnnotateFileResponse, each of which contains some
    * subset of the full list of AnnotateImageResponse. Multiple outputs can
    * happen if, for example, the output JSON is too large and overflows into
    * multiple sharded files.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGcsDestination {
  @scala.inline
  def apply(): SchemaGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsDestination]
  }
  @scala.inline
  implicit class SchemaGcsDestinationOps[Self <: SchemaGcsDestination] (val x: Self) extends AnyVal {
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

