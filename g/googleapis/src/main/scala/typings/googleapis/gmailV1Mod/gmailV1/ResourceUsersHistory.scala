package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$History")
@js.native
class ResourceUsersHistory protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gmail.users.history.list
    * @desc Lists the history of all changes to the given mailbox. History
    * results are returned in chronological order (increasing historyId).
    * @alias gmail.users.history.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.historyTypes History types to be returned by the function
    * @param {string=} params.labelId Only return messages with a label matching the ID.
    * @param {integer=} params.maxResults The maximum number of history records to return.
    * @param {string=} params.pageToken Page token to retrieve a specific page of results in the list.
    * @param {string=} params.startHistoryId Required. Returns history records after the specified startHistoryId. The supplied startHistoryId should be obtained from the historyId of a message, thread, or previous list response. History IDs increase chronologically but are not contiguous with random gaps in between valid IDs. Supplying an invalid or out of date startHistoryId typically returns an HTTP 404 error code. A historyId is typically valid for at least a week, but in some rare circumstances may be valid for only a few hours. If you receive an HTTP 404 error response, your application should perform a full sync. If you receive no nextPageToken in the response, there are no updates to retrieve and you can store the returned historyId for a future request.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListHistoryResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListHistoryResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListHistoryResponse] = js.native
  def list(params: ParamsResourceUsersHistoryList): GaxiosPromise[SchemaListHistoryResponse] = js.native
  def list(params: ParamsResourceUsersHistoryList, callback: BodyResponseCallback[SchemaListHistoryResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersHistoryList,
    options: BodyResponseCallback[SchemaListHistoryResponse],
    callback: BodyResponseCallback[SchemaListHistoryResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersHistoryList, options: MethodOptions): GaxiosPromise[SchemaListHistoryResponse] = js.native
  def list(
    params: ParamsResourceUsersHistoryList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListHistoryResponse]
  ): Unit = js.native
}
