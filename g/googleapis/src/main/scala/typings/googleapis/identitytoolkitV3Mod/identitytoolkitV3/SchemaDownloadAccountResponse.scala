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
  def apply(kind: String = null, nextPageToken: String = null, users: js.Array[SchemaUserInfo] = null): SchemaDownloadAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDownloadAccountResponse]
  }
}

