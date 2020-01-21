package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for FirestoreAdmin.ImportDocuments.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta1ImportDocumentsRequest extends js.Object {
  /**
    * Which collection ids to import. Unspecified means all collections
    * included in the import.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Location of the exported files. This must match the output_uri_prefix of
    * an ExportDocumentsResponse from an export that has completed
    * successfully. See:
    * google.firestore.admin.v1beta1.ExportDocumentsResponse.output_uri_prefix.
    */
  var inputUriPrefix: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1beta1ImportDocumentsRequest {
  @scala.inline
  def apply(collectionIds: js.Array[String] = null, inputUriPrefix: String = null): SchemaGoogleFirestoreAdminV1beta1ImportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    if (collectionIds != null) __obj.updateDynamic("collectionIds")(collectionIds.asInstanceOf[js.Any])
    if (inputUriPrefix != null) __obj.updateDynamic("inputUriPrefix")(inputUriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1ImportDocumentsRequest]
  }
}

