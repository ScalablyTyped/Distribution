package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for GroupsService.ListGroups.
  */
@js.native
trait SchemaListGroupsResponse extends js.Object {
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * A list of groups that match the API request parameters. Each item in the
    * list represents a `group` resource.
    */
  var items: js.UndefOr[js.Array[SchemaGroup]] = js.native
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#groupListResponse`.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The token that can be used as the value of the `pageToken` parameter to
    * retrieve the next page in the result set.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListGroupsResponse {
  @scala.inline
  def apply(
    errors: SchemaErrors = null,
    etag: String = null,
    items: js.Array[SchemaGroup] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListGroupsResponse]
  }
}

