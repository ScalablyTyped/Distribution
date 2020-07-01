package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListGroupMembers response.
  */
@js.native
trait SchemaListGroupMembersResponse extends js.Object {
  /**
    * A set of monitored resources in the group.
    */
  var members: js.UndefOr[js.Array[SchemaMonitoredResource]] = js.native
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of elements matching this request.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object SchemaListGroupMembersResponse {
  @scala.inline
  def apply(
    members: js.Array[SchemaMonitoredResource] = null,
    nextPageToken: String = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): SchemaListGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListGroupMembersResponse]
  }
}

