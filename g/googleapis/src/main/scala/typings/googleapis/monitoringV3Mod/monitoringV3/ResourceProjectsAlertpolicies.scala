package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Alertpolicies")
@js.native
open class ResourceProjectsAlertpolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAlertPolicy] = js.native
  def create(callback: BodyResponseCallback[SchemaAlertPolicy]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def create(params: ParamsResourceProjectsAlertpoliciesCreate): GaxiosPromise[SchemaAlertPolicy] = js.native
  def create(
    params: ParamsResourceProjectsAlertpoliciesCreate,
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAlertpoliciesCreate,
    options: BodyResponseCallback[Readable | SchemaAlertPolicy],
    callback: BodyResponseCallback[Readable | SchemaAlertPolicy]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAlertpoliciesCreate, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def create(
    params: ParamsResourceProjectsAlertpoliciesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  /**
    * Creates a new alerting policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.alertPolicies.create({
    *     // Required. The project (https://cloud.google.com/monitoring/api/v3#project_name) in which to create the alerting policy. The format is: projects/[PROJECT_ID_OR_NUMBER] Note that this field names the parent container in which the alerting policy will be written, not the name of the created policy. |name| must be a host project of a Metrics Scope, otherwise INVALID_ARGUMENT error will return. The alerting policy that is returned will have a name that contains a normalized representation of this name as a prefix but adds a suffix of the form /alertPolicies/[ALERT_POLICY_ID], identifying the policy in the container.
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alertStrategy": {},
    *       //   "combiner": "my_combiner",
    *       //   "conditions": [],
    *       //   "creationRecord": {},
    *       //   "displayName": "my_displayName",
    *       //   "documentation": {},
    *       //   "enabled": false,
    *       //   "mutationRecord": {},
    *       //   "name": "my_name",
    *       //   "notificationChannels": [],
    *       //   "userLabels": {},
    *       //   "validity": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alertStrategy": {},
    *   //   "combiner": "my_combiner",
    *   //   "conditions": [],
    *   //   "creationRecord": {},
    *   //   "displayName": "my_displayName",
    *   //   "documentation": {},
    *   //   "enabled": false,
    *   //   "mutationRecord": {},
    *   //   "name": "my_name",
    *   //   "notificationChannels": [],
    *   //   "userLabels": {},
    *   //   "validity": {}
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
  def create(params: ParamsResourceProjectsAlertpoliciesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAlertpoliciesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsAlertpoliciesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsAlertpoliciesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAlertpoliciesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAlertpoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAlertpoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an alerting policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.alertPolicies.delete({
    *     // Required. The alerting policy to delete. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] For more information, see AlertPolicy.
    *     name: 'projects/my-project/alertPolicies/my-alertPolicie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsAlertpoliciesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsAlertpoliciesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAlertPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaAlertPolicy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def get(params: ParamsResourceProjectsAlertpoliciesGet): GaxiosPromise[SchemaAlertPolicy] = js.native
  def get(params: ParamsResourceProjectsAlertpoliciesGet, callback: BodyResponseCallback[SchemaAlertPolicy]): Unit = js.native
  def get(
    params: ParamsResourceProjectsAlertpoliciesGet,
    options: BodyResponseCallback[Readable | SchemaAlertPolicy],
    callback: BodyResponseCallback[Readable | SchemaAlertPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAlertpoliciesGet, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def get(
    params: ParamsResourceProjectsAlertpoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  /**
    * Gets a single alerting policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.alertPolicies.get({
    *     // Required. The alerting policy to retrieve. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID]
    *     name: 'projects/my-project/alertPolicies/my-alertPolicie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alertStrategy": {},
    *   //   "combiner": "my_combiner",
    *   //   "conditions": [],
    *   //   "creationRecord": {},
    *   //   "displayName": "my_displayName",
    *   //   "documentation": {},
    *   //   "enabled": false,
    *   //   "mutationRecord": {},
    *   //   "name": "my_name",
    *   //   "notificationChannels": [],
    *   //   "userLabels": {},
    *   //   "validity": {}
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
  def get(params: ParamsResourceProjectsAlertpoliciesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAlertpoliciesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAlertPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAlertPoliciesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAlertPoliciesResponse] = js.native
  def list(params: ParamsResourceProjectsAlertpoliciesList): GaxiosPromise[SchemaListAlertPoliciesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAlertpoliciesList,
    callback: BodyResponseCallback[SchemaListAlertPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAlertpoliciesList,
    options: BodyResponseCallback[Readable | SchemaListAlertPoliciesResponse],
    callback: BodyResponseCallback[Readable | SchemaListAlertPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAlertpoliciesList, options: MethodOptions): GaxiosPromise[SchemaListAlertPoliciesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAlertpoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAlertPoliciesResponse]
  ): Unit = js.native
  /**
    * Lists the existing alerting policies for the workspace.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.alertPolicies.list({
    *     // If provided, this field specifies the criteria that must be met by alert policies to be included in the response.For more details, see sorting and filtering (https://cloud.google.com/monitoring/api/v3/sorting-and-filtering).
    *     filter: 'placeholder-value',
    *     // Required. The project (https://cloud.google.com/monitoring/api/v3#project_name) whose alert policies are to be listed. The format is: projects/[PROJECT_ID_OR_NUMBER] Note that this field names the parent container in which the alerting policies to be listed are stored. To retrieve a single alerting policy by name, use the GetAlertPolicy operation, instead.
    *     name: 'projects/my-project',
    *     // A comma-separated list of fields by which to sort the result. Supports the same set of field references as the filter field. Entries can be prefixed with a minus sign to sort by the field in descending order.For more details, see sorting and filtering (https://cloud.google.com/monitoring/api/v3/sorting-and-filtering).
    *     orderBy: 'placeholder-value',
    *     // The maximum number of results to return in a single response.
    *     pageSize: 'placeholder-value',
    *     // If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return more results from the previous method call.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alertPolicies": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0
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
  def list(params: ParamsResourceProjectsAlertpoliciesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAlertpoliciesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAlertPolicy] = js.native
  def patch(callback: BodyResponseCallback[SchemaAlertPolicy]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def patch(params: ParamsResourceProjectsAlertpoliciesPatch): GaxiosPromise[SchemaAlertPolicy] = js.native
  def patch(
    params: ParamsResourceProjectsAlertpoliciesPatch,
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAlertpoliciesPatch,
    options: BodyResponseCallback[Readable | SchemaAlertPolicy],
    callback: BodyResponseCallback[Readable | SchemaAlertPolicy]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAlertpoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def patch(
    params: ParamsResourceProjectsAlertpoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  /**
    * Updates an alerting policy. You can either replace the entire policy with a new one or replace only certain fields in the current alerting policy by specifying the fields to be updated via updateMask. Returns the updated alerting policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.alertPolicies.patch({
    *     // Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Cloud Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
    *     name: 'projects/my-project/alertPolicies/my-alertPolicie',
    *     // Optional. A list of alerting policy field names. If this field is not empty, each listed field in the existing alerting policy is set to the value of the corresponding field in the supplied policy (alert_policy), or to the field's default value if the field is not in the supplied alerting policy. Fields not listed retain their previous value.Examples of valid field masks include display_name, documentation, documentation.content, documentation.mime_type, user_labels, user_label.nameofkey, enabled, conditions, combiner, etc.If this field is empty, then the supplied alerting policy replaces the existing policy. It is the same as deleting the existing policy and adding the supplied policy, except for the following: The new policy will have the same [ALERT_POLICY_ID] as the former policy. This gives you continuity with the former policy in your notifications and incidents. Conditions in the new policy will keep their former [CONDITION_ID] if the supplied condition includes the name field with that [CONDITION_ID]. If the supplied condition omits the name field, then a new [CONDITION_ID] is created.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alertStrategy": {},
    *       //   "combiner": "my_combiner",
    *       //   "conditions": [],
    *       //   "creationRecord": {},
    *       //   "displayName": "my_displayName",
    *       //   "documentation": {},
    *       //   "enabled": false,
    *       //   "mutationRecord": {},
    *       //   "name": "my_name",
    *       //   "notificationChannels": [],
    *       //   "userLabels": {},
    *       //   "validity": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alertStrategy": {},
    *   //   "combiner": "my_combiner",
    *   //   "conditions": [],
    *   //   "creationRecord": {},
    *   //   "displayName": "my_displayName",
    *   //   "documentation": {},
    *   //   "enabled": false,
    *   //   "mutationRecord": {},
    *   //   "name": "my_name",
    *   //   "notificationChannels": [],
    *   //   "userLabels": {},
    *   //   "validity": {}
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
  def patch(params: ParamsResourceProjectsAlertpoliciesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAlertpoliciesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
