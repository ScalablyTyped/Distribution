package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for ExportEntities operations.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata extends js.Object {
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1CommonMetadata] = js.native
  /**
    * Description of which entities are being exported.
    */
  var entityFilter: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1EntityFilter] = js.native
  /**
    * Location for the export metadata and data files. This will be the same
    * value as the
    * google.datastore.admin.v1beta1.ExportEntitiesRequest.output_url_prefix
    * field. The final output location is provided in
    * google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url.
    */
  var outputUrlPrefix: js.UndefOr[String] = js.native
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1Progress] = js.native
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1Progress] = js.native
}

object SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata {
  @scala.inline
  def apply(
    common: SchemaGoogleDatastoreAdminV1beta1CommonMetadata = null,
    entityFilter: SchemaGoogleDatastoreAdminV1beta1EntityFilter = null,
    outputUrlPrefix: String = null,
    progressBytes: SchemaGoogleDatastoreAdminV1beta1Progress = null,
    progressEntities: SchemaGoogleDatastoreAdminV1beta1Progress = null
  ): SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (entityFilter != null) __obj.updateDynamic("entityFilter")(entityFilter.asInstanceOf[js.Any])
    if (outputUrlPrefix != null) __obj.updateDynamic("outputUrlPrefix")(outputUrlPrefix.asInstanceOf[js.Any])
    if (progressBytes != null) __obj.updateDynamic("progressBytes")(progressBytes.asInstanceOf[js.Any])
    if (progressEntities != null) __obj.updateDynamic("progressEntities")(progressEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata]
  }
}

