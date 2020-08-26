package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Custommetrics")
@js.native
class ResourceManagementCustommetrics protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.customMetrics.get
    * @desc Get a custom metric to which the user has access.
    * @alias analytics.management.customMetrics.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom metric to retrieve.
    * @param {string} params.customMetricId The ID of the custom metric to retrieve.
    * @param {string} params.webPropertyId Web property ID for the custom metric to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCustomMetric] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomMetric]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def get(params: ParamsResourceManagementCustommetricsGet): GaxiosPromise[SchemaCustomMetric] = js.native
  def get(
    params: ParamsResourceManagementCustommetricsGet,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementCustommetricsGet,
    options: BodyResponseCallback[SchemaCustomMetric],
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def get(params: ParamsResourceManagementCustommetricsGet, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def get(
    params: ParamsResourceManagementCustommetricsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  /**
    * analytics.management.customMetrics.insert
    * @desc Create a new custom metric.
    * @alias analytics.management.customMetrics.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom metric to create.
    * @param {string} params.webPropertyId Web property ID for the custom dimension to create.
    * @param {().CustomMetric} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCustomMetric] = js.native
  def insert(callback: BodyResponseCallback[SchemaCustomMetric]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def insert(params: ParamsResourceManagementCustommetricsInsert): GaxiosPromise[SchemaCustomMetric] = js.native
  def insert(
    params: ParamsResourceManagementCustommetricsInsert,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementCustommetricsInsert,
    options: BodyResponseCallback[SchemaCustomMetric],
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementCustommetricsInsert, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def insert(
    params: ParamsResourceManagementCustommetricsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  /**
    * analytics.management.customMetrics.list
    * @desc Lists custom metrics to which the user has access.
    * @alias analytics.management.customMetrics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom metrics to retrieve.
    * @param {integer=} params.max-results The maximum number of custom metrics to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID for the custom metrics to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCustomMetrics] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomMetrics]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomMetrics] = js.native
  def list(params: ParamsResourceManagementCustommetricsList): GaxiosPromise[SchemaCustomMetrics] = js.native
  def list(
    params: ParamsResourceManagementCustommetricsList,
    callback: BodyResponseCallback[SchemaCustomMetrics]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementCustommetricsList,
    options: BodyResponseCallback[SchemaCustomMetrics],
    callback: BodyResponseCallback[SchemaCustomMetrics]
  ): Unit = js.native
  def list(params: ParamsResourceManagementCustommetricsList, options: MethodOptions): GaxiosPromise[SchemaCustomMetrics] = js.native
  def list(
    params: ParamsResourceManagementCustommetricsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomMetrics]
  ): Unit = js.native
  /**
    * analytics.management.customMetrics.patch
    * @desc Updates an existing custom metric. This method supports patch
    * semantics.
    * @alias analytics.management.customMetrics.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom metric to update.
    * @param {string} params.customMetricId Custom metric ID for the custom metric to update.
    * @param {boolean=} params.ignoreCustomDataSourceLinks Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set.
    * @param {string} params.webPropertyId Web property ID for the custom metric to update.
    * @param {().CustomMetric} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCustomMetric] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomMetric]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def patch(params: ParamsResourceManagementCustommetricsPatch): GaxiosPromise[SchemaCustomMetric] = js.native
  def patch(
    params: ParamsResourceManagementCustommetricsPatch,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementCustommetricsPatch,
    options: BodyResponseCallback[SchemaCustomMetric],
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementCustommetricsPatch, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def patch(
    params: ParamsResourceManagementCustommetricsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  /**
    * analytics.management.customMetrics.update
    * @desc Updates an existing custom metric.
    * @alias analytics.management.customMetrics.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom metric to update.
    * @param {string} params.customMetricId Custom metric ID for the custom metric to update.
    * @param {boolean=} params.ignoreCustomDataSourceLinks Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set.
    * @param {string} params.webPropertyId Web property ID for the custom metric to update.
    * @param {().CustomMetric} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCustomMetric] = js.native
  def update(callback: BodyResponseCallback[SchemaCustomMetric]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def update(params: ParamsResourceManagementCustommetricsUpdate): GaxiosPromise[SchemaCustomMetric] = js.native
  def update(
    params: ParamsResourceManagementCustommetricsUpdate,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementCustommetricsUpdate,
    options: BodyResponseCallback[SchemaCustomMetric],
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
  def update(params: ParamsResourceManagementCustommetricsUpdate, options: MethodOptions): GaxiosPromise[SchemaCustomMetric] = js.native
  def update(
    params: ParamsResourceManagementCustommetricsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomMetric]
  ): Unit = js.native
}

