package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.ListDocuments.
  */
@js.native
trait SchemaListDocumentsResponse extends js.Object {
  /**
    * The Documents found.
    */
  var documents: js.UndefOr[js.Array[SchemaDocument]] = js.native
  /**
    * The next page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDocumentsResponse {
  @scala.inline
  def apply(documents: js.Array[SchemaDocument] = null, nextPageToken: String = null): SchemaListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDocumentsResponse]
  }
}

