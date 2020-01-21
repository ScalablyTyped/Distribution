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

