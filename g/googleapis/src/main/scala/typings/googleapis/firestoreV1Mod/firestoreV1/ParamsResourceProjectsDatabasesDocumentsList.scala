package typings.googleapis.firestoreV1Mod.firestoreV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDatabasesDocumentsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The collection ID, relative to `parent`, to list. For example:
    * `chatrooms` or `messages`.
    */
  var collectionId: js.UndefOr[String] = js.native
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * The order to sort results by. For example: `priority desc, name`.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of documents to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The `next_page_token` value returned from a previous List request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The parent resource name. In the format:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * For example: `projects/my-project/databases/my-database/documents` or
    * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Reads documents as they were at the given time. This may not be older
    * than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * If the list should show missing documents. A missing document is a
    * document that does not exist but has sub-documents. These documents will
    * be returned with a key but will not have fields, Document.create_time, or
    * Document.update_time set.  Requests with `show_missing` may not specify
    * `where` or `order_by`.
    */
  var showMissing: js.UndefOr[Boolean] = js.native
  /**
    * Reads documents in a transaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsDatabasesDocumentsList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    collectionId: String = null,
    fields: String = null,
    key: String = null,
    maskDotfieldPaths: js.Array[String] = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    readTime: String = null,
    showMissing: js.UndefOr[Boolean] = js.undefined,
    transaction: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsDatabasesDocumentsList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (collectionId != null) __obj.updateDynamic("collectionId")(collectionId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maskDotfieldPaths != null) __obj.updateDynamic("mask.fieldPaths")(maskDotfieldPaths.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showMissing)) __obj.updateDynamic("showMissing")(showMissing.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsList]
  }
}

