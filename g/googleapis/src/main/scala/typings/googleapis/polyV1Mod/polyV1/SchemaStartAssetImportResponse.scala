package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message from a request to startImport. This is returned in the
  * response field of the Operation.
  */
@js.native
trait SchemaStartAssetImportResponse extends js.Object {
  /**
    * The id of newly created asset. If this is empty when the operation is
    * complete it means the import failed. Please refer to the
    * assetImportMessages field to understand what went wrong.
    */
  var assetId: js.UndefOr[String] = js.native
  /**
    * The id of the asset import.
    */
  var assetImportId: js.UndefOr[String] = js.native
  /**
    * The message from the asset import. This will contain any warnings (or -
    * in the case of failure - errors) that occurred during import.
    */
  var assetImportMessages: js.UndefOr[js.Array[SchemaAssetImportMessage]] = js.native
  /**
    * The publish URL for the asset.
    */
  var publishUrl: js.UndefOr[String] = js.native
}

object SchemaStartAssetImportResponse {
  @scala.inline
  def apply(): SchemaStartAssetImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartAssetImportResponse]
  }
  @scala.inline
  implicit class SchemaStartAssetImportResponseOps[Self <: SchemaStartAssetImportResponse] (val x: Self) extends AnyVal {
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
    def setAssetId(value: String): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    @scala.inline
    def setAssetImportId(value: String): Self = this.set("assetImportId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetImportId: Self = this.set("assetImportId", js.undefined)
    @scala.inline
    def setAssetImportMessagesVarargs(value: SchemaAssetImportMessage*): Self = this.set("assetImportMessages", js.Array(value :_*))
    @scala.inline
    def setAssetImportMessages(value: js.Array[SchemaAssetImportMessage]): Self = this.set("assetImportMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetImportMessages: Self = this.set("assetImportMessages", js.undefined)
    @scala.inline
    def setPublishUrl(value: String): Self = this.set("publishUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishUrl: Self = this.set("publishUrl", js.undefined)
  }
  
}

