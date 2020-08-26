package typings.googleapis.v31Mod.dfareportingV31

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
  def apply(): SchemaAdvertiserGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserGroupsListResponse]
  }
  @scala.inline
  implicit class SchemaAdvertiserGroupsListResponseOps[Self <: SchemaAdvertiserGroupsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvertiserGroupsVarargs(value: SchemaAdvertiserGroup*): Self = this.set("advertiserGroups", js.Array(value :_*))
    @scala.inline
    def setAdvertiserGroups(value: js.Array[SchemaAdvertiserGroup]): Self = this.set("advertiserGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserGroups: Self = this.set("advertiserGroups", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

