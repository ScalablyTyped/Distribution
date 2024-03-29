package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/serviceusage/v1beta1", "serviceusage_v1beta1.Resource$Services$Consumerquotametrics$Limits$Adminoverrides")
@js.native
open class ResourceServicesConsumerquotametricsLimitsAdminoverrides protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates an admin override. An admin override is applied by an administrator of a parent folder or parent organization of the consumer receiving the override. An admin override is intended to limit the amount of quota the consumer can use out of the total quota pool allocated to all children of the folder or organization.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceusage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceusage = google.serviceusage('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/service.management',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceusage.services.consumerQuotaMetrics.limits.adminOverrides.create(
    *       {
    *         // Whether to force the creation of the quota override. Setting the force parameter to 'true' ignores all quota safety checks that would fail the request. QuotaSafetyCheck lists all such validations.
    *         force: 'placeholder-value',
    *         // The list of quota safety checks to ignore before the override mutation. Unlike 'force' field that ignores all the quota safety checks, the 'force_only' field ignores only the specified checks; other checks are still enforced. The 'force' and 'force_only' fields cannot both be set.
    *         forceOnly: 'placeholder-value',
    *         // The resource name of the parent quota limit, returned by a ListConsumerQuotaMetrics or GetConsumerQuotaMetric call. An example name would be: `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion`
    *         parent:
    *           '[^/]+/[^/]+/services/my-service/consumerQuotaMetrics/my-consumerQuotaMetric/limits/my-limit',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "adminOverrideAncestor": "my_adminOverrideAncestor",
    *           //   "dimensions": {},
    *           //   "metric": "my_metric",
    *           //   "name": "my_name",
    *           //   "overrideValue": "my_overrideValue",
    *           //   "unit": "my_unit"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes an admin override.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceusage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceusage = google.serviceusage('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/service.management',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceusage.services.consumerQuotaMetrics.limits.adminOverrides.delete(
    *       {
    *         // Whether to force the deletion of the quota override. Setting the force parameter to 'true' ignores all quota safety checks that would fail the request. QuotaSafetyCheck lists all such validations.
    *         force: 'placeholder-value',
    *         // The list of quota safety checks to ignore before the override mutation. Unlike 'force' field that ignores all the quota safety checks, the 'force_only' field ignores only the specified checks; other checks are still enforced. The 'force' and 'force_only' fields cannot both be set.
    *         forceOnly: 'placeholder-value',
    *         // The resource name of the override to delete. An example name would be: `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminOverrides/4a3f2c1d`
    *         name: '[^/]+/[^/]+/services/my-service/consumerQuotaMetrics/my-consumerQuotaMetric/limits/my-limit/adminOverrides/my-adminOverride',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAdminOverridesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAdminOverridesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAdminOverridesResponse] = js.native
  def list(params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesList): GaxiosPromise[SchemaListAdminOverridesResponse] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesList,
    callback: BodyResponseCallback[SchemaListAdminOverridesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesList,
    options: BodyResponseCallback[Readable | SchemaListAdminOverridesResponse],
    callback: BodyResponseCallback[Readable | SchemaListAdminOverridesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesList, options: MethodOptions): GaxiosPromise[SchemaListAdminOverridesResponse] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAdminOverridesResponse]
  ): Unit = js.native
  /**
    * Lists all admin overrides on this limit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceusage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceusage = google.serviceusage('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceusage.services.consumerQuotaMetrics.limits.adminOverrides.list(
    *       {
    *         // Requested size of the next page of data.
    *         pageSize: 'placeholder-value',
    *         // Token identifying which result to start with; returned by a previous list call.
    *         pageToken: 'placeholder-value',
    *         // The resource name of the parent quota limit, returned by a ListConsumerQuotaMetrics or GetConsumerQuotaMetric call. An example name would be: `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion`
    *         parent:
    *           '[^/]+/[^/]+/services/my-service/consumerQuotaMetrics/my-consumerQuotaMetric/limits/my-limit',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "overrides": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates an admin override.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceusage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceusage = google.serviceusage('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/service.management',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceusage.services.consumerQuotaMetrics.limits.adminOverrides.patch(
    *       {
    *         // Whether to force the update of the quota override. Setting the force parameter to 'true' ignores all quota safety checks that would fail the request. QuotaSafetyCheck lists all such validations.
    *         force: 'placeholder-value',
    *         // The list of quota safety checks to ignore before the override mutation. Unlike 'force' field that ignores all the quota safety checks, the 'force_only' field ignores only the specified checks; other checks are still enforced. The 'force' and 'force_only' fields cannot both be set.
    *         forceOnly: 'placeholder-value',
    *         // The resource name of the override to update. An example name would be: `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminOverrides/4a3f2c1d`
    *         name: '[^/]+/[^/]+/services/my-service/consumerQuotaMetrics/my-consumerQuotaMetric/limits/my-limit/adminOverrides/my-adminOverride',
    *         // Update only the specified fields of the override. If unset, all fields will be updated.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "adminOverrideAncestor": "my_adminOverrideAncestor",
    *           //   "dimensions": {},
    *           //   "metric": "my_metric",
    *           //   "name": "my_name",
    *           //   "overrideValue": "my_overrideValue",
    *           //   "unit": "my_unit"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsAdminoverridesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
