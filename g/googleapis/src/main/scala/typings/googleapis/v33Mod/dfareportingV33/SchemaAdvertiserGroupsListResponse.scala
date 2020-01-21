package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advertiser Group List Response
  */
@js.native
trait SchemaAdvertiserGroupsListResponse extends js.Object {
  /**
    * Advertiser group collection.
    */
  var advertiserGroups: js.UndefOr[js.Array[SchemaAdvertiserGroup]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiserGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaAdvertiserGroupsListResponse {
  @scala.inline
  def apply(
    advertiserGroups: js.Array[SchemaAdvertiserGroup] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaAdvertiserGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (advertiserGroups != null) __obj.updateDynamic("advertiserGroups")(advertiserGroups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdvertiserGroupsListResponse]
  }
}

