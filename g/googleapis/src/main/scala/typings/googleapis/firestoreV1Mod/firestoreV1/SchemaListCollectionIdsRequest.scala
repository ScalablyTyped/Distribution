package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.ListCollectionIds.
  */
@js.native
trait SchemaListCollectionIdsRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A page token. Must be a value from ListCollectionIdsResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object SchemaListCollectionIdsRequest {
  @scala.inline
  def apply(pageSize: js.UndefOr[Double] = js.undefined, pageToken: String = null): SchemaListCollectionIdsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCollectionIdsRequest]
  }
}

