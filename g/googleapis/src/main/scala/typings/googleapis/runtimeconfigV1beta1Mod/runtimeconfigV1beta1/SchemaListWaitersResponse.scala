package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListWaiters()` method. Order of returned waiter objects
  * is arbitrary.
  */
@js.native
trait SchemaListWaitersResponse extends js.Object {
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Found waiters in the project.
    */
  var waiters: js.UndefOr[js.Array[SchemaWaiter]] = js.native
}

object SchemaListWaitersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, waiters: js.Array[SchemaWaiter] = null): SchemaListWaitersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (waiters != null) __obj.updateDynamic("waiters")(waiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListWaitersResponse]
  }
}

