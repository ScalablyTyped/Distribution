package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of downloading accounts in batch.
  */
@js.native
trait SchemaDownloadAccountResponse extends js.Object {
  /**
    * The fixed string &quot;identitytoolkit#DownloadAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The next page token. To be used in a subsequent request to return the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The user accounts data.
    */
  var users: js.UndefOr[js.Array[SchemaUserInfo]] = js.native
}

object SchemaDownloadAccountResponse {
  @scala.inline
  def apply(): SchemaDownloadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadAccountResponse]
  }
  @scala.inline
  implicit class SchemaDownloadAccountResponseOps[Self <: SchemaDownloadAccountResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setUsersVarargs(value: SchemaUserInfo*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[SchemaUserInfo]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
  
}

