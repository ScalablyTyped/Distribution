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
  def apply(
    assetId: String = null,
    assetImportId: String = null,
    assetImportMessages: js.Array[SchemaAssetImportMessage] = null,
    publishUrl: String = null
  ): SchemaStartAssetImportResponse = {
    val __obj = js.Dynamic.literal()
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (assetImportId != null) __obj.updateDynamic("assetImportId")(assetImportId.asInstanceOf[js.Any])
    if (assetImportMessages != null) __obj.updateDynamic("assetImportMessages")(assetImportMessages.asInstanceOf[js.Any])
    if (publishUrl != null) __obj.updateDynamic("publishUrl")(publishUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStartAssetImportResponse]
  }
}

