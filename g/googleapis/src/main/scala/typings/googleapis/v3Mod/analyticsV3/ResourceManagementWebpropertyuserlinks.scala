package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Webpropertyuserlinks")
@js.native
class ResourceManagementWebpropertyuserlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analytics.management.webpropertyUserLinks.delete
    * @desc Removes a user from the given web property.
    * @alias analytics.management.webpropertyUserLinks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the user link for.
    * @param {string} params.linkId Link ID to delete the user link for.
    * @param {string} params.webPropertyId Web Property ID to delete the user link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementWebpropertyuserlinksDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementWebpropertyuserlinksDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementWebpropertyuserlinksDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementWebpropertyuserlinksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementWebpropertyuserlinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * analytics.management.webpropertyUserLinks.insert
    * @desc Adds a new user to the given web property.
    * @alias analytics.management.webpropertyUserLinks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the user link for.
    * @param {string} params.webPropertyId Web Property ID to create the user link for.
    * @param {().EntityUserLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(callback: BodyResponseCallback[SchemaEntityUserLink]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(params: ParamsResourceManagementWebpropertyuserlinksInsert): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertyuserlinksInsert,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementWebpropertyuserlinksInsert,
    options: BodyResponseCallback[SchemaEntityUserLink],
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementWebpropertyuserlinksInsert, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertyuserlinksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  
  /**
    * analytics.management.webpropertyUserLinks.list
    * @desc Lists webProperty-user links for a given web property.
    * @alias analytics.management.webpropertyUserLinks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID which the given web property belongs to.
    * @param {integer=} params.max-results The maximum number of webProperty-user Links to include in this response.
    * @param {integer=} params.start-index An index of the first webProperty-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web Property ID for the webProperty-user links to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(callback: BodyResponseCallback[SchemaEntityUserLinks]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(params: ParamsResourceManagementWebpropertyuserlinksList): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(
    params: ParamsResourceManagementWebpropertyuserlinksList,
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementWebpropertyuserlinksList,
    options: BodyResponseCallback[SchemaEntityUserLinks],
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  def list(params: ParamsResourceManagementWebpropertyuserlinksList, options: MethodOptions): GaxiosPromise[SchemaEntityUserLinks] = js.native
  def list(
    params: ParamsResourceManagementWebpropertyuserlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLinks]
  ): Unit = js.native
  
  /**
    * analytics.management.webpropertyUserLinks.update
    * @desc Updates permissions for an existing user on the given web property.
    * @alias analytics.management.webpropertyUserLinks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to update the account-user link for.
    * @param {string} params.linkId Link ID to update the account-user link for.
    * @param {string} params.webPropertyId Web property ID to update the account-user link for.
    * @param {().EntityUserLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(callback: BodyResponseCallback[SchemaEntityUserLink]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(params: ParamsResourceManagementWebpropertyuserlinksUpdate): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(
    params: ParamsResourceManagementWebpropertyuserlinksUpdate,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementWebpropertyuserlinksUpdate,
    options: BodyResponseCallback[SchemaEntityUserLink],
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
  def update(params: ParamsResourceManagementWebpropertyuserlinksUpdate, options: MethodOptions): GaxiosPromise[SchemaEntityUserLink] = js.native
  def update(
    params: ParamsResourceManagementWebpropertyuserlinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityUserLink]
  ): Unit = js.native
}
