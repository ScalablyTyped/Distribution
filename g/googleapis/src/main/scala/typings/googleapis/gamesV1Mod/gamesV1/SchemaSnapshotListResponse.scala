package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of snapshot objects.
  */
@js.native
trait SchemaSnapshotListResponse extends js.Object {
  /**
    * The snapshots.
    */
  var items: js.UndefOr[js.Array[SchemaSnapshot]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#snapshotListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token corresponding to the next page of results. If there are no more
    * results, the token is omitted.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaSnapshotListResponse {
  @scala.inline
  def apply(): SchemaSnapshotListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshotListResponse]
  }
  @scala.inline
  implicit class SchemaSnapshotListResponseOps[Self <: SchemaSnapshotListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaSnapshot*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaSnapshot]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
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

