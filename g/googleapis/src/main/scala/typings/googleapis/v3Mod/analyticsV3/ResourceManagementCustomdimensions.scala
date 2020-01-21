package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Customdimensions")
@js.native
class ResourceManagementCustomdimensions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.customDimensions.get
    * @desc Get a custom dimension to which the user has access.
    * @alias analytics.management.customDimensions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom dimension to retrieve.
    * @param {string} params.customDimensionId The ID of the custom dimension to retrieve.
    * @param {string} params.webPropertyId Web property ID for the custom dimension to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCustomDimension] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomDimension]): Unit = js.native
  def get(params: ParamsResourceManagementCustomdimensionsGet): GaxiosPromise[SchemaCustomDimension] = js.native
  def get(
    params: ParamsResourceManagementCustomdimensionsGet,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementCustomdimensionsGet,
    options: BodyResponseCallback[SchemaCustomDimension],
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def get(params: ParamsResourceManagementCustomdimensionsGet, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def get(
    params: ParamsResourceManagementCustomdimensionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  /**
    * analytics.management.customDimensions.insert
    * @desc Create a new custom dimension.
    * @alias analytics.management.customDimensions.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom dimension to create.
    * @param {string} params.webPropertyId Web property ID for the custom dimension to create.
    * @param {().CustomDimension} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCustomDimension] = js.native
  def insert(callback: BodyResponseCallback[SchemaCustomDimension]): Unit = js.native
  def insert(params: ParamsResourceManagementCustomdimensionsInsert): GaxiosPromise[SchemaCustomDimension] = js.native
  def insert(
    params: ParamsResourceManagementCustomdimensionsInsert,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementCustomdimensionsInsert,
    options: BodyResponseCallback[SchemaCustomDimension],
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementCustomdimensionsInsert, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def insert(
    params: ParamsResourceManagementCustomdimensionsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  /**
    * analytics.management.customDimensions.list
    * @desc Lists custom dimensions to which the user has access.
    * @alias analytics.management.customDimensions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom dimensions to retrieve.
    * @param {integer=} params.max-results The maximum number of custom dimensions to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID for the custom dimensions to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCustomDimensions] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomDimensions]): Unit = js.native
  def list(params: ParamsResourceManagementCustomdimensionsList): GaxiosPromise[SchemaCustomDimensions] = js.native
  def list(
    params: ParamsResourceManagementCustomdimensionsList,
    callback: BodyResponseCallback[SchemaCustomDimensions]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementCustomdimensionsList,
    options: BodyResponseCallback[SchemaCustomDimensions],
    callback: BodyResponseCallback[SchemaCustomDimensions]
  ): Unit = js.native
  def list(params: ParamsResourceManagementCustomdimensionsList, options: MethodOptions): GaxiosPromise[SchemaCustomDimensions] = js.native
  def list(
    params: ParamsResourceManagementCustomdimensionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomDimensions]
  ): Unit = js.native
  /**
    * analytics.management.customDimensions.patch
    * @desc Updates an existing custom dimension. This method supports patch
    * semantics.
    * @alias analytics.management.customDimensions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom dimension to update.
    * @param {string} params.customDimensionId Custom dimension ID for the custom dimension to update.
    * @param {boolean=} params.ignoreCustomDataSourceLinks Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set.
    * @param {string} params.webPropertyId Web property ID for the custom dimension to update.
    * @param {().CustomDimension} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCustomDimension] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomDimension]): Unit = js.native
  def patch(params: ParamsResourceManagementCustomdimensionsPatch): GaxiosPromise[SchemaCustomDimension] = js.native
  def patch(
    params: ParamsResourceManagementCustomdimensionsPatch,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementCustomdimensionsPatch,
    options: BodyResponseCallback[SchemaCustomDimension],
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementCustomdimensionsPatch, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def patch(
    params: ParamsResourceManagementCustomdimensionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  /**
    * analytics.management.customDimensions.update
    * @desc Updates an existing custom dimension.
    * @alias analytics.management.customDimensions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom dimension to update.
    * @param {string} params.customDimensionId Custom dimension ID for the custom dimension to update.
    * @param {boolean=} params.ignoreCustomDataSourceLinks Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set.
    * @param {string} params.webPropertyId Web property ID for the custom dimension to update.
    * @param {().CustomDimension} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCustomDimension] = js.native
  def update(callback: BodyResponseCallback[SchemaCustomDimension]): Unit = js.native
  def update(params: ParamsResourceManagementCustomdimensionsUpdate): GaxiosPromise[SchemaCustomDimension] = js.native
  def update(
    params: ParamsResourceManagementCustomdimensionsUpdate,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementCustomdimensionsUpdate,
    options: BodyResponseCallback[SchemaCustomDimension],
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
  def update(params: ParamsResourceManagementCustomdimensionsUpdate, options: MethodOptions): GaxiosPromise[SchemaCustomDimension] = js.native
  def update(
    params: ParamsResourceManagementCustomdimensionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomDimension]
  ): Unit = js.native
}

