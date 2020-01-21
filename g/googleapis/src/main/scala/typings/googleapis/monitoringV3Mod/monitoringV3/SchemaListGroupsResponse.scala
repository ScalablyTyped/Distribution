package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListGroups response.
  */
@js.native
trait SchemaListGroupsResponse extends js.Object {
  /**
    * The groups that match the specified filters.
    */
  var group: js.UndefOr[js.Array[SchemaGroup]] = js.native
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListGroupsResponse {
  @scala.inline
  def apply(group: js.Array[SchemaGroup] = null, nextPageToken: String = null): SchemaListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListGroupsResponse]
  }
}

