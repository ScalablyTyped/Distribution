package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options defining a data set within Google Cloud Datastore.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DatastoreOptions extends js.Object {
  /**
    * The kind to process.
    */
  var kind: js.UndefOr[SchemaGooglePrivacyDlpV2KindExpression] = js.native
  /**
    * A partition ID identifies a grouping of entities. The grouping is always
    * by project and namespace, however the namespace ID may be empty.
    */
  var partitionId: js.UndefOr[SchemaGooglePrivacyDlpV2PartitionId] = js.native
}

object SchemaGooglePrivacyDlpV2DatastoreOptions {
  @scala.inline
  def apply(
    kind: SchemaGooglePrivacyDlpV2KindExpression = null,
    partitionId: SchemaGooglePrivacyDlpV2PartitionId = null
  ): SchemaGooglePrivacyDlpV2DatastoreOptions = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (partitionId != null) __obj.updateDynamic("partitionId")(partitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DatastoreOptions]
  }
}

