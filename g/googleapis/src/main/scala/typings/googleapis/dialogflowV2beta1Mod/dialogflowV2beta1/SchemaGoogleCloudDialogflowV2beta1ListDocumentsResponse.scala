package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Documents.ListDocuments.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse extends js.Object {
  /**
    * The list of documents.
    */
  var documents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Document]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse {
  @scala.inline
  def apply(
    documents: js.Array[SchemaGoogleCloudDialogflowV2beta1Document] = null,
    nextPageToken: String = null
  ): SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse]
  }
}

