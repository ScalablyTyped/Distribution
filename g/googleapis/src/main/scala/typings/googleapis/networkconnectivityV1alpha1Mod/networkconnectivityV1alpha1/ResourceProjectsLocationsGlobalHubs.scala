package typings.googleapis.networkconnectivityV1alpha1Mod.networkconnectivityV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/networkconnectivity/v1alpha1", "networkconnectivity_v1alpha1.Resource$Projects$Locations$Global$Hubs")
@js.native
open class ResourceProjectsLocationsGlobalHubs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsGlobalHubsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlobalHubsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlobalHubsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsGlobalHubsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlobalHubsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates a new Network Connectivity Center hub in the specified project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/networkconnectivity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const networkconnectivity = google.networkconnectivity('v1alpha1');
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
    *   const res = await networkconnectivity.projects.locations.global.hubs.create({
    *     // Optional. Unique id for the Hub to create.
    *     hubId: 'placeholder-value',
    *     // Required. The parent resource's name of the Hub.
    *     parent: 'projects/my-project/locations/global',
    *     // Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "spokes": [],
    *       //   "state": "my_state",
    *       //   "uniqueId": "my_uniqueId",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
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
  def create(params: ParamsResourceProjectsLocationsGlobalHubsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlobalHubsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsGlobalHubsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlobalHubsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlobalHubsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsGlobalHubsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlobalHubsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deletes a Network Connectivity Center hub.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/networkconnectivity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const networkconnectivity = google.networkconnectivity('v1alpha1');
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
    *   const res = await networkconnectivity.projects.locations.global.hubs.delete({
    *     // Required. The name of the Hub to delete.
    *     name: 'projects/my-project/locations/global/hubs/my-hub',
    *     // Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *   });
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
  def delete(params: ParamsResourceProjectsLocationsGlobalHubsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlobalHubsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaHub] = js.native
  def get(callback: BodyResponseCallback[SchemaHub]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHub] = js.native
  def get(params: ParamsResourceProjectsLocationsGlobalHubsGet): GaxiosPromise[SchemaHub] = js.native
  def get(params: ParamsResourceProjectsLocationsGlobalHubsGet, callback: BodyResponseCallback[SchemaHub]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalHubsGet,
    options: BodyResponseCallback[Readable | SchemaHub],
    callback: BodyResponseCallback[Readable | SchemaHub]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGlobalHubsGet, options: MethodOptions): GaxiosPromise[SchemaHub] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalHubsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHub]
  ): Unit = js.native
  /**
    * Gets details about a Network Connectivity Center hub.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/networkconnectivity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const networkconnectivity = google.networkconnectivity('v1alpha1');
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
    *   const res = await networkconnectivity.projects.locations.global.hubs.get({
    *     // Required. Name of the Hub resource to get.
    *     name: 'projects/my-project/locations/global/hubs/my-hub',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "spokes": [],
    *   //   "state": "my_state",
    *   //   "uniqueId": "my_uniqueId",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsGlobalHubsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalHubsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsGlobalHubsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalHubsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalHubsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsGlobalHubsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalHubsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/networkconnectivity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const networkconnectivity = google.networkconnectivity('v1alpha1');
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
    *     await networkconnectivity.projects.locations.global.hubs.getIamPolicy({
    *       // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *       'options.requestedPolicyVersion': 'placeholder-value',
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource: 'projects/my-project/locations/global/hubs/my-hub',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsGlobalHubsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalHubsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListHubsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListHubsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListHubsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsGlobalHubsList): GaxiosPromise[SchemaListHubsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalHubsList,
    callback: BodyResponseCallback[SchemaListHubsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalHubsList,
    options: BodyResponseCallback[Readable | SchemaListHubsResponse],
    callback: BodyResponseCallback[Readable | SchemaListHubsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsGlobalHubsList, options: MethodOptions): GaxiosPromise[SchemaListHubsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalHubsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListHubsResponse]
  ): Unit = js.native
  /**
    * Lists the Network Connectivity Center hubs associated with a given project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/networkconnectivity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const networkconnectivity = google.networkconnectivity('v1alpha1');
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
    *   const res = await networkconnectivity.projects.locations.global.hubs.list({
    *     // A filter expression that filters the results listed in the response.
    *     filter: 'placeholder-value',
    *     // Sort the results by a certain order.
    *     orderBy: 'placeholder-value',
    *     // The maximum number of results per page that should be returned.
    *     pageSize: 'placeholder-value',
    *     // The page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource's name.
    *     parent: 'projects/my-project/locations/global',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "hubs": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsGlobalHubsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalHubsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsGlobalHubsPatch): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlobalHubsPatch,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlobalHubsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsGlobalHubsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlobalHubsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Updates the description and/or labels of a Network Connectivity Center hub.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/networkconnectivity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const networkconnectivity = google.networkconnectivity('v1alpha1');
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
    *   const res = await networkconnectivity.projects.locations.global.hubs.patch({
    *     // Immutable. The name of a Hub resource.
    *     name: 'projects/my-project/locations/global/hubs/my-hub',
    *     // Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *     // Optional. Field mask is used to specify the fields to be overwritten in the Hub resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "spokes": [],
    *       //   "state": "my_state",
    *       //   "uniqueId": "my_uniqueId",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
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
  def patch(params: ParamsResourceProjectsLocationsGlobalHubsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlobalHubsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsGlobalHubsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalHubsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalHubsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsGlobalHubsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalHubsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/networkconnectivity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const networkconnectivity = google.networkconnectivity('v1alpha1');
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
    *     await networkconnectivity.projects.locations.global.hubs.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource: 'projects/my-project/locations/global/hubs/my-hub',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {},
    *         //   "updateMask": "my_updateMask"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsGlobalHubsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalHubsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsGlobalHubsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGlobalHubsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGlobalHubsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsGlobalHubsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGlobalHubsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/networkconnectivity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const networkconnectivity = google.networkconnectivity('v1alpha1');
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
    *     await networkconnectivity.projects.locations.global.hubs.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource: 'projects/my-project/locations/global/hubs/my-hub',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "permissions": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsGlobalHubsTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGlobalHubsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
