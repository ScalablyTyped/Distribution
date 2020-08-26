package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List Users operation in Apps Directory API.
  */
@js.native
trait SchemaUsers extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Event that triggered this response (only used in case of Push Response)
    */
  var trigger_event: js.UndefOr[String] = js.native
  /**
    * List of user objects.
    */
  var users: js.UndefOr[js.Array[SchemaUser]] = js.native
}

object SchemaUsers {
  @scala.inline
  def apply(): SchemaUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsers]
  }
  @scala.inline
  implicit class SchemaUsersOps[Self <: SchemaUsers] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTrigger_event(value: String): Self = this.set("trigger_event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger_event: Self = this.set("trigger_event", js.undefined)
    @scala.inline
    def setUsersVarargs(value: SchemaUser*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[SchemaUser]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
  
}

