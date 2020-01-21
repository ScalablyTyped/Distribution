package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for google.datastore.admin.v1.DatastoreAdmin.ExportEntities.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1ExportEntitiesResponse extends js.Object {
  /**
    * Location of the output metadata file. This can be used to begin an import
    * into Cloud Datastore (this project or another project). See
    * google.datastore.admin.v1.ImportEntitiesRequest.input_url. Only present
    * if the operation completed successfully.
    */
  var outputUrl: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1ExportEntitiesResponse {
  @scala.inline
  def apply(outputUrl: String = null): SchemaGoogleDatastoreAdminV1ExportEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (outputUrl != null) __obj.updateDynamic("outputUrl")(outputUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ExportEntitiesResponse]
  }
}

