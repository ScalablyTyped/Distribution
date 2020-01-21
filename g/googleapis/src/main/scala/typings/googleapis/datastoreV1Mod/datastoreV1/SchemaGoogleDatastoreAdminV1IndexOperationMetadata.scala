package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for Index operations.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1IndexOperationMetadata extends js.Object {
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1CommonMetadata] = js.native
  /**
    * The index resource ID that this operation is acting on.
    */
  var indexId: js.UndefOr[String] = js.native
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1Progress] = js.native
}

object SchemaGoogleDatastoreAdminV1IndexOperationMetadata {
  @scala.inline
  def apply(
    common: SchemaGoogleDatastoreAdminV1CommonMetadata = null,
    indexId: String = null,
    progressEntities: SchemaGoogleDatastoreAdminV1Progress = null
  ): SchemaGoogleDatastoreAdminV1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (indexId != null) __obj.updateDynamic("indexId")(indexId.asInstanceOf[js.Any])
    if (progressEntities != null) __obj.updateDynamic("progressEntities")(progressEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1IndexOperationMetadata]
  }
}

