package typings.googleapis.v1beta3Mod.datastoreV1beta3

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
  def apply(): SchemaGoogleDatastoreAdminV1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1IndexOperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1IndexOperationMetadataOps[Self <: SchemaGoogleDatastoreAdminV1IndexOperationMetadata] (val x: Self) extends AnyVal {
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
    def setCommon(value: SchemaGoogleDatastoreAdminV1CommonMetadata): Self = this.set("common", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    @scala.inline
    def setIndexId(value: String): Self = this.set("indexId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexId: Self = this.set("indexId", js.undefined)
    @scala.inline
    def setProgressEntities(value: SchemaGoogleDatastoreAdminV1Progress): Self = this.set("progressEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressEntities: Self = this.set("progressEntities", js.undefined)
  }
  
}

