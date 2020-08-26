package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBlobsGettree extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The hash. In the case of SHA-256, it will always be a lowercase hex
    * string exactly 64 characters long.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * The instance of the execution system to operate against. A server may
    * support multiple instances of the execution system (with their own
    * workers, storage, caches, etc.). The server MAY require use of this field
    * to select between them in an implementation-defined fashion, otherwise it
    * can be omitted.
    */
  var instanceName: js.UndefOr[String] = js.native
  /**
    * A maximum page size to request. If present, the server will request no
    * more than this many items. Regardless of whether a page size is
    * specified, the server may place its own limit on the number of items to
    * be returned and require the client to retrieve more items using a
    * subsequent request.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A page token, which must be a value received in a previous
    * GetTreeResponse. If present, the server will use it to return the
    * following page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The size of the blob, in bytes.
    */
  var sizeBytes: js.UndefOr[String] = js.native
}

object ParamsResourceBlobsGettree {
  @scala.inline
  def apply(): ParamsResourceBlobsGettree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlobsGettree]
  }
  @scala.inline
  implicit class ParamsResourceBlobsGettreeOps[Self <: ParamsResourceBlobsGettree] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setInstanceName(value: String): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceName: Self = this.set("instanceName", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setSizeBytes(value: String): Self = this.set("sizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeBytes: Self = this.set("sizeBytes", js.undefined)
  }
  
}

