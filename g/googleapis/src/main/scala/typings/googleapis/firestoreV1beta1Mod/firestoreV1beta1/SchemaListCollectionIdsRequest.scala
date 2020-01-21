package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

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
  def apply(pageSize: Int | Double = null, pageToken: String = null): SchemaListCollectionIdsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCollectionIdsRequest]
  }
}

