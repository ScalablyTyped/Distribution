package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Webproperties")
@js.native
class ResourceManagementWebproperties protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.webproperties.get
    * @desc Gets a web property to which the user has access.
    * @alias analytics.management.webproperties.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve the web property for.
    * @param {string} params.webPropertyId ID to retrieve the web property for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaWebproperty] = js.native
  def get(callback: BodyResponseCallback[SchemaWebproperty]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def get(params: ParamsResourceManagementWebpropertiesGet): GaxiosPromise[SchemaWebproperty] = js.native
  def get(
    params: ParamsResourceManagementWebpropertiesGet,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementWebpropertiesGet,
    options: BodyResponseCallback[SchemaWebproperty],
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def get(params: ParamsResourceManagementWebpropertiesGet, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def get(
    params: ParamsResourceManagementWebpropertiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  /**
    * analytics.management.webproperties.insert
    * @desc Create a new property if the account has fewer than 20 properties.
    * Web properties are visible in the Google Analytics interface only if they
    * have at least one profile.
    * @alias analytics.management.webproperties.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the web property for.
    * @param {().Webproperty} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaWebproperty] = js.native
  def insert(callback: BodyResponseCallback[SchemaWebproperty]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def insert(params: ParamsResourceManagementWebpropertiesInsert): GaxiosPromise[SchemaWebproperty] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertiesInsert,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementWebpropertiesInsert,
    options: BodyResponseCallback[SchemaWebproperty],
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementWebpropertiesInsert, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  /**
    * analytics.management.webproperties.list
    * @desc Lists web properties to which the user has access.
    * @alias analytics.management.webproperties.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve web properties for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    * @param {integer=} params.max-results The maximum number of web properties to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaWebproperties] = js.native
  def list(callback: BodyResponseCallback[SchemaWebproperties]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWebproperties] = js.native
  def list(params: ParamsResourceManagementWebpropertiesList): GaxiosPromise[SchemaWebproperties] = js.native
  def list(
    params: ParamsResourceManagementWebpropertiesList,
    callback: BodyResponseCallback[SchemaWebproperties]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementWebpropertiesList,
    options: BodyResponseCallback[SchemaWebproperties],
    callback: BodyResponseCallback[SchemaWebproperties]
  ): Unit = js.native
  def list(params: ParamsResourceManagementWebpropertiesList, options: MethodOptions): GaxiosPromise[SchemaWebproperties] = js.native
  def list(
    params: ParamsResourceManagementWebpropertiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebproperties]
  ): Unit = js.native
  /**
    * analytics.management.webproperties.patch
    * @desc Updates an existing web property. This method supports patch
    * semantics.
    * @alias analytics.management.webproperties.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the web property belongs
    * @param {string} params.webPropertyId Web property ID
    * @param {().Webproperty} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaWebproperty] = js.native
  def patch(callback: BodyResponseCallback[SchemaWebproperty]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def patch(params: ParamsResourceManagementWebpropertiesPatch): GaxiosPromise[SchemaWebproperty] = js.native
  def patch(
    params: ParamsResourceManagementWebpropertiesPatch,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementWebpropertiesPatch,
    options: BodyResponseCallback[SchemaWebproperty],
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementWebpropertiesPatch, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def patch(
    params: ParamsResourceManagementWebpropertiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  /**
    * analytics.management.webproperties.update
    * @desc Updates an existing web property.
    * @alias analytics.management.webproperties.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the web property belongs
    * @param {string} params.webPropertyId Web property ID
    * @param {().Webproperty} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaWebproperty] = js.native
  def update(callback: BodyResponseCallback[SchemaWebproperty]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def update(params: ParamsResourceManagementWebpropertiesUpdate): GaxiosPromise[SchemaWebproperty] = js.native
  def update(
    params: ParamsResourceManagementWebpropertiesUpdate,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementWebpropertiesUpdate,
    options: BodyResponseCallback[SchemaWebproperty],
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
  def update(params: ParamsResourceManagementWebpropertiesUpdate, options: MethodOptions): GaxiosPromise[SchemaWebproperty] = js.native
  def update(
    params: ParamsResourceManagementWebpropertiesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebproperty]
  ): Unit = js.native
}

