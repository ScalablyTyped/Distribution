package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to import resources. The FHIR resources to be imported must have
  * client supplied IDs. The server will retain the resource IDs. The import
  * operation is idempotent. Retry will overwrite existing data identified by
  * client supplied IDs. The import operation is not transactional. The server
  * will not roll back any committed changes upon partial failures.
  */
@js.native
trait SchemaImportResourcesRequest extends js.Object {
  /**
    * The content structure in the source location. The default is BUNDLE.
    */
  var contentStructure: js.UndefOr[String] = js.native
  /**
    * The Cloud Storage bucket/folder path to write files that contain error
    * details.
    */
  var gcsErrorLocation: js.UndefOr[SchemaGcsDataLocation] = js.native
  /**
    * Cloud Storage source data locations. Each Cloud Storage object should be
    * a text file that contains newline delimited JSON structures conforming to
    * FHIR standard.
    */
  var gcsSourceLocation: js.UndefOr[SchemaGcsDataLocation] = js.native
}

object SchemaImportResourcesRequest {
  @scala.inline
  def apply(): SchemaImportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportResourcesRequest]
  }
  @scala.inline
  implicit class SchemaImportResourcesRequestOps[Self <: SchemaImportResourcesRequest] (val x: Self) extends AnyVal {
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
    def setContentStructure(value: String): Self = this.set("contentStructure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStructure: Self = this.set("contentStructure", js.undefined)
    @scala.inline
    def setGcsErrorLocation(value: SchemaGcsDataLocation): Self = this.set("gcsErrorLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsErrorLocation: Self = this.set("gcsErrorLocation", js.undefined)
    @scala.inline
    def setGcsSourceLocation(value: SchemaGcsDataLocation): Self = this.set("gcsSourceLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsSourceLocation: Self = this.set("gcsSourceLocation", js.undefined)
  }
  
}

