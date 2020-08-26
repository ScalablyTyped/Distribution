package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Floodlight Activity Group List Response
  */
@js.native
trait SchemaFloodlightActivityGroupsListResponse extends js.Object {
  /**
    * Floodlight activity group collection.
    */
  var floodlightActivityGroups: js.UndefOr[js.Array[SchemaFloodlightActivityGroup]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivityGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaFloodlightActivityGroupsListResponse {
  @scala.inline
  def apply(): SchemaFloodlightActivityGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivityGroupsListResponse]
  }
  @scala.inline
  implicit class SchemaFloodlightActivityGroupsListResponseOps[Self <: SchemaFloodlightActivityGroupsListResponse] (val x: Self) extends AnyVal {
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
    def setFloodlightActivityGroupsVarargs(value: SchemaFloodlightActivityGroup*): Self = this.set("floodlightActivityGroups", js.Array(value :_*))
    @scala.inline
    def setFloodlightActivityGroups(value: js.Array[SchemaFloodlightActivityGroup]): Self = this.set("floodlightActivityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityGroups: Self = this.set("floodlightActivityGroups", js.undefined)
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

