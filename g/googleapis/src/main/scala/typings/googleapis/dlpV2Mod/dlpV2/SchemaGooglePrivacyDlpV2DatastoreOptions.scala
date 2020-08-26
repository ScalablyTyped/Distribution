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
  def apply(): SchemaGooglePrivacyDlpV2DatastoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DatastoreOptions]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DatastoreOptionsOps[Self <: SchemaGooglePrivacyDlpV2DatastoreOptions] (val x: Self) extends AnyVal {
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
    def setKind(value: SchemaGooglePrivacyDlpV2KindExpression): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPartitionId(value: SchemaGooglePrivacyDlpV2PartitionId): Self = this.set("partitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionId: Self = this.set("partitionId", js.undefined)
  }
  
}

