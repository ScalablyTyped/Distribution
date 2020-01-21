package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDatabasesCollectiongroupsFieldsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The filter to apply to list results. Currently, FirestoreAdmin.ListFields
    * only supports listing fields that have been explicitly overridden. To
    * issue this query, call FirestoreAdmin.ListFields with the filter set to
    * `indexConfig.usesAncestorConfig:false`.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A page token, returned from a previous call to FirestoreAdmin.ListFields,
    * that may be used to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * A parent name of the form
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
    */
  var parent: js.UndefOr[String] = js.native
}

