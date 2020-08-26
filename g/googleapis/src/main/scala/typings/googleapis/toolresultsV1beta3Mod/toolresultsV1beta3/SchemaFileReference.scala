package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a file.
  */
@js.native
trait SchemaFileReference extends js.Object {
  /**
    * The URI of a file stored in Google Cloud Storage.  For example:
    * http://storage.googleapis.com/mybucket/path/to/test.xml or in gsutil
    * format: gs://mybucket/path/to/test.xml with version-specific info,
    * gs://mybucket/path/to/test.xml#1360383693690000  An INVALID_ARGUMENT
    * error will be returned if the URI format is not supported.  - In
    * response: always set - In create/update request: always set
    */
  var fileUri: js.UndefOr[String] = js.native
}

object SchemaFileReference {
  @scala.inline
  def apply(): SchemaFileReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileReference]
  }
  @scala.inline
  implicit class SchemaFileReferenceOps[Self <: SchemaFileReference] (val x: Self) extends AnyVal {
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
    def setFileUri(value: String): Self = this.set("fileUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileUri: Self = this.set("fileUri", js.undefined)
  }
  
}

