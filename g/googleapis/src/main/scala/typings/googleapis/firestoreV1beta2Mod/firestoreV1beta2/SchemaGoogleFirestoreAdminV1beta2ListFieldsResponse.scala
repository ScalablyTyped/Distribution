package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirestoreAdmin.ListFields.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse extends js.Object {
  /**
    * The requested fields.
    */
  var fields: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta2Field]] = js.native
  /**
    * A page token that may be used to request another page of results. If
    * blank, this is the last page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse {
  @scala.inline
  def apply(fields: js.Array[SchemaGoogleFirestoreAdminV1beta2Field] = null, nextPageToken: String = null): SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse]
  }
}

