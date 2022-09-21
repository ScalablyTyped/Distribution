package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/serviceconsumermanagement/v1beta1", "serviceconsumermanagement_v1beta1.Resource$Services$Consumerquotametrics$Limits$Produceroverrides")
@js.native
open class ResourceServicesConsumerquotametricsLimitsProduceroverrides protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a producer override. A producer override is applied by the owner or administrator of a service to increase or decrease the amount of quota a consumer of the service is allowed to use. To create multiple overrides at once, use ImportProducerOverrides instead. If an override with the specified dimensions already exists, this call will fail. To overwrite an existing override if one is already present ("upsert" semantics), use ImportProducerOverrides instead.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceconsumermanagement.services.consumerQuotaMetrics.limits.producerOverrides.create(
    *       {
    *         // Whether to force the creation of the quota override. Setting the force parameter to 'true' ignores all quota safety checks that would fail the request. QuotaSafetyCheck lists all such validations.
    *         force: 'placeholder-value',
    *         // The list of quota safety checks to ignore before the override mutation. Unlike 'force' field that ignores all the quota safety checks, the 'force_only' field ignores only the specified checks; other checks are still enforced. The 'force' and 'force_only' fields cannot both be set.
    *         forceOnly: 'placeholder-value',
    *         // The resource name of the parent quota limit, returned by a ListConsumerQuotaMetrics or GetConsumerQuotaMetric call. An example name would be: `services/compute.googleapis.com/projects/123/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion`
    *         parent:
    *           'services/my-service/[^/]+/[^/]+/consumerQuotaMetrics/my-consumerQuotaMetric/limits/my-limit',
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
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a producer override.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceconsumermanagement.services.consumerQuotaMetrics.limits.producerOverrides.delete(
    *       {
    *         // Whether to force the deletion of the quota override. Setting the force parameter to 'true' ignores all quota safety checks that would fail the request. QuotaSafetyCheck lists all such validations.
    *         force: 'placeholder-value',
    *         // The list of quota safety checks to ignore before the override mutation. Unlike 'force' field that ignores all the quota safety checks, the 'force_only' field ignores only the specified checks; other checks are still enforced. The 'force' and 'force_only' fields cannot both be set.
    *         forceOnly: 'placeholder-value',
    *         // The resource name of the override to delete. An example name would be: `services/compute.googleapis.com/projects/123/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/producerOverrides/4a3f2c1d`
    *         name: 'services/my-service/[^/]+/[^/]+/consumerQuotaMetrics/my-consumerQuotaMetric/limits/my-limit/producerOverrides/my-producerOverride',
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
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaV1Beta1ListProducerOverridesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaV1Beta1ListProducerOverridesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaV1Beta1ListProducerOverridesResponse] = js.native
  def list(params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesList): GaxiosPromise[SchemaV1Beta1ListProducerOverridesResponse] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesList,
    callback: BodyResponseCallback[SchemaV1Beta1ListProducerOverridesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesList,
    options: BodyResponseCallback[Readable | SchemaV1Beta1ListProducerOverridesResponse],
    callback: BodyResponseCallback[Readable | SchemaV1Beta1ListProducerOverridesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesList,
    options: MethodOptions
  ): GaxiosPromise[SchemaV1Beta1ListProducerOverridesResponse] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaV1Beta1ListProducerOverridesResponse]
  ): Unit = js.native
  /**
    * Lists all producer overrides on this limit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceconsumermanagement.services.consumerQuotaMetrics.limits.producerOverrides.list(
    *       {
    *         // Requested size of the next page of data.
    *         pageSize: 'placeholder-value',
    *         // Token identifying which result to start with; returned by a previous list call.
    *         pageToken: 'placeholder-value',
    *         // The resource name of the parent quota limit, returned by a ListConsumerQuotaMetrics or GetConsumerQuotaMetric call. An example name would be: `services/compute.googleapis.com/projects/123/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion`
    *         parent:
    *           'services/my-service/[^/]+/[^/]+/consumerQuotaMetrics/my-consumerQuotaMetric/limits/my-limit',
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
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a producer override.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceconsumermanagement.services.consumerQuotaMetrics.limits.producerOverrides.patch(
    *       {
    *         // Whether to force the update of the quota override. Setting the force parameter to 'true' ignores all quota safety checks that would fail the request. QuotaSafetyCheck lists all such validations.
    *         force: 'placeholder-value',
    *         // The list of quota safety checks to ignore before the override mutation. Unlike 'force' field that ignores all the quota safety checks, the 'force_only' field ignores only the specified checks; other checks are still enforced. The 'force' and 'force_only' fields cannot both be set.
    *         forceOnly: 'placeholder-value',
    *         // The resource name of the override to update. An example name would be: `services/compute.googleapis.com/projects/123/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/producerOverrides/4a3f2c1d`
    *         name: 'services/my-service/[^/]+/[^/]+/consumerQuotaMetrics/my-consumerQuotaMetric/limits/my-limit/producerOverrides/my-producerOverride',
    *         // Update only the specified fields. If unset, all modifiable fields will be updated.
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
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
