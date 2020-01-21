package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for google.datastore.admin.v1.DatastoreAdmin.ListIndexes.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1ListIndexesResponse extends js.Object {
  /**
    * The indexes.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleDatastoreAdminV1Index]] = js.native
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1ListIndexesResponse {
  @scala.inline
  def apply(indexes: js.Array[SchemaGoogleDatastoreAdminV1Index] = null, nextPageToken: String = null): SchemaGoogleDatastoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ListIndexesResponse]
  }
}

