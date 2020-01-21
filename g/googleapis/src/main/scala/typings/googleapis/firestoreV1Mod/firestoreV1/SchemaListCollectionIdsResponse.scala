package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from Firestore.ListCollectionIds.
  */
@js.native
trait SchemaListCollectionIdsResponse extends js.Object {
  /**
    * The collection ids.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A page token that may be used to continue the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCollectionIdsResponse {
  @scala.inline
  def apply(collectionIds: js.Array[String] = null, nextPageToken: String = null): SchemaListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    if (collectionIds != null) __obj.updateDynamic("collectionIds")(collectionIds.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCollectionIdsResponse]
  }
}

