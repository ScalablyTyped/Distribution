package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for
  * google.datastore.admin.v1beta1.DatastoreAdmin.ExportEntities.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponse extends js.Object {
  /**
    * Location of the output metadata file. This can be used to begin an import
    * into Cloud Datastore (this project or another project). See
    * google.datastore.admin.v1beta1.ImportEntitiesRequest.input_url. Only
    * present if the operation completed successfully.
    */
  var outputUrl: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponse {
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponseOps[Self <: SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponse] (val x: Self) extends AnyVal {
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
    def setOutputUrl(value: String): Self = this.set("outputUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputUrl: Self = this.set("outputUrl", js.undefined)
  }
  
}

