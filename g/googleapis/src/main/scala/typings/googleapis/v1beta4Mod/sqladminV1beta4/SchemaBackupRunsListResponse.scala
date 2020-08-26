package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Backup run list results.
  */
@js.native
trait SchemaBackupRunsListResponse extends js.Object {
  /**
    * A list of backup runs in reverse chronological order of the enqueued
    * time.
    */
  var items: js.UndefOr[js.Array[SchemaBackupRun]] = js.native
  /**
    * This is always sql#backupRunsList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaBackupRunsListResponse {
  @scala.inline
  def apply(): SchemaBackupRunsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupRunsListResponse]
  }
  @scala.inline
  implicit class SchemaBackupRunsListResponseOps[Self <: SchemaBackupRunsListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaBackupRun*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaBackupRun]): Self = this.set("items", value.asInstanceOf[js.Any])
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

