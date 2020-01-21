package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Accountuserlinks")
@js.native
class ResourceManagementAccountuserlinks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.accountUserLinks.delete
    * @desc Removes a user from the given account.
    * @alias analytics.management.accountUserLinks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the user link for.
    * @param {string} params.linkId Link ID to delete the user link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceManagementAccountuserlinksDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementAccountuserlinksDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementAccountuserlinksDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementAccountuserlinksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementAccountuserlinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.accountUserLinks.insert
    * @desc Adds a new user to the given account.
    * @alias analytics.management.accountUserLinks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the user link for.
    * @param {().EntityUserLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(callback: BodyResponseCallback[SchemaEntityUserLink]): Unit = js.native
  def insert(params: ParamsResourceManagementAccountuserlinksInsert): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(
    params: ParamsResourceManagementAccountuserlinksInsert,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementAccountuserlinksInsert,
    options: BodyResponseCallback[SchemaEntityUserLink],
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementAccountuserlinksInsert, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(
    params: ParamsResourceManagementAccountuserlinksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  /**
    * analytics.management.accountUserLinks.list
    * @desc Lists account-user links for a given account.
    * @alias analytics.management.accountUserLinks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve the user links for.
    * @param {integer=} params.max-results The maximum number of account-user links to include in this response.
    * @param {integer=} params.start-index An index of the first account-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(callback: BodyResponseCallback[SchemaEntityUserLinks]): Unit = js.native
  def list(params: ParamsResourceManagementAccountuserlinksList): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(
    params: ParamsResourceManagementAccountuserlinksList,
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementAccountuserlinksList,
    options: BodyResponseCallback[SchemaEntityUserLinks],
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  def list(params: ParamsResourceManagementAccountuserlinksList, options: MethodOptions): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(
    params: ParamsResourceManagementAccountuserlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  /**
    * analytics.management.accountUserLinks.update
    * @desc Updates permissions for an existing user on the given account.
    * @alias analytics.management.accountUserLinks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to update the account-user link for.
    * @param {string} params.linkId Link ID to update the account-user link for.
    * @param {().EntityUserLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(callback: BodyResponseCallback[SchemaEntityUserLink]): Unit = js.native
  def update(params: ParamsResourceManagementAccountuserlinksUpdate): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(
    params: ParamsResourceManagementAccountuserlinksUpdate,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementAccountuserlinksUpdate,
    options: BodyResponseCallback[SchemaEntityUserLink],
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def update(params: ParamsResourceManagementAccountuserlinksUpdate, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(
    params: ParamsResourceManagementAccountuserlinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
}

