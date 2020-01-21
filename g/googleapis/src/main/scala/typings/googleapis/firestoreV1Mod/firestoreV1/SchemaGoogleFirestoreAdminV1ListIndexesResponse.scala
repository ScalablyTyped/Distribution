package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirestoreAdmin.ListIndexes.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1ListIndexesResponse extends js.Object {
  /**
    * The requested indexes.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1Index]] = js.native
  /**
    * A page token that may be used to request another page of results. If
    * blank, this is the last page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1ListIndexesResponse {
  @scala.inline
  def apply(indexes: js.Array[SchemaGoogleFirestoreAdminV1Index] = null, nextPageToken: String = null): SchemaGoogleFirestoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ListIndexesResponse]
  }
}

