package typings.googleapis.servicedirectoryV1beta1Mod.servicedirectoryV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicedirectory/v1beta1", "servicedirectory_v1beta1.Resource$Projects$Locations$Namespaces$Services$Endpoints")
@js.native
open class ResourceProjectsLocationsNamespacesServicesEndpoints protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaEndpoint] = js.native
  def create(callback: BodyResponseCallback[SchemaEndpoint]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEndpoint] = js.native
  def create(params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate): GaxiosPromise[SchemaEndpoint] = js.native
  def create(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate,
    callback: BodyResponseCallback[SchemaEndpoint]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate,
    options: BodyResponseCallback[Readable | SchemaEndpoint],
    callback: BodyResponseCallback[Readable | SchemaEndpoint]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate, options: MethodOptions): GaxiosPromise[SchemaEndpoint] = js.native
  def create(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEndpoint]
  ): Unit = js.native
  /**
    * Creates an endpoint, and returns the new endpoint.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicedirectory.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicedirectory = google.servicedirectory('v1beta1');
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
    *     await servicedirectory.projects.locations.namespaces.services.endpoints.create(
    *       {
    *         // Required. The Resource ID must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z](?:[-a-z0-9]{0,61\}[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    *         endpointId: 'placeholder-value',
    *         // Required. The resource name of the service that this endpoint provides.
    *         parent:
    *           'projects/my-project/locations/my-location/namespaces/my-namespace/services/my-service',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "address": "my_address",
    *           //   "createTime": "my_createTime",
    *           //   "metadata": {},
    *           //   "name": "my_name",
    *           //   "network": "my_network",
    *           //   "port": 0,
    *           //   "updateTime": "my_updateTime"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": "my_address",
    *   //   "createTime": "my_createTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "network": "my_network",
    *   //   "port": 0,
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
  def create(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an endpoint.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicedirectory.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicedirectory = google.servicedirectory('v1beta1');
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
    *     await servicedirectory.projects.locations.namespaces.services.endpoints.delete(
    *       {
    *         // Required. The name of the endpoint to delete.
    *         name: 'projects/my-project/locations/my-location/namespaces/my-namespace/services/my-service/endpoints/my-endpoint',
    *       }
    *     );
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
  def delete(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaEndpoint] = js.native
  def get(callback: BodyResponseCallback[SchemaEndpoint]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEndpoint] = js.native
  def get(params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet): GaxiosPromise[SchemaEndpoint] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet,
    callback: BodyResponseCallback[SchemaEndpoint]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet,
    options: BodyResponseCallback[Readable | SchemaEndpoint],
    callback: BodyResponseCallback[Readable | SchemaEndpoint]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet, options: MethodOptions): GaxiosPromise[SchemaEndpoint] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEndpoint]
  ): Unit = js.native
  /**
    * Gets an endpoint.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicedirectory.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicedirectory = google.servicedirectory('v1beta1');
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
    *     await servicedirectory.projects.locations.namespaces.services.endpoints.get(
    *       {
    *         // Required. The name of the endpoint to get.
    *         name: 'projects/my-project/locations/my-location/namespaces/my-namespace/services/my-service/endpoints/my-endpoint',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": "my_address",
    *   //   "createTime": "my_createTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "network": "my_network",
    *   //   "port": 0,
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
  def get(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListEndpointsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEndpointsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEndpointsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsList): GaxiosPromise[SchemaListEndpointsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsList,
    callback: BodyResponseCallback[SchemaListEndpointsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsList,
    options: BodyResponseCallback[Readable | SchemaListEndpointsResponse],
    callback: BodyResponseCallback[Readable | SchemaListEndpointsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsList, options: MethodOptions): GaxiosPromise[SchemaListEndpointsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEndpointsResponse]
  ): Unit = js.native
  /**
    * Lists all endpoints.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicedirectory.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicedirectory = google.servicedirectory('v1beta1');
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
    *     await servicedirectory.projects.locations.namespaces.services.endpoints.list(
    *       {
    *         // Optional. The filter to list results by. General `filter` string syntax: ` ()` * `` can be `name`, `address`, `port`, `metadata.` for map field, or `attributes.` for attributes field * `` can be `<`, `\>`, `<=`, `\>=`, `!=`, `=`, `:`. Of which `:` means `HAS`, and is roughly the same as `=` * `` must be the same data type as field * `` can be `AND`, `OR`, `NOT` Examples of valid filters: * `metadata.owner` returns endpoints that have a metadata with the key `owner`, this is the same as `metadata:owner` * `metadata.protocol=gRPC` returns endpoints that have key/value `protocol=gRPC` * `address=192.108.1.105` returns endpoints that have this address * `port\>8080` returns endpoints that have port number larger than 8080 * `name\>projects/my-project/locations/us-east1/namespaces/my-namespace/services/my-service/endpoints/endpoint-c` returns endpoints that have name that is alphabetically later than the string, so "endpoint-e" is returned but "endpoint-a" is not * `metadata.owner!=sd AND metadata.foo=bar` returns endpoints that have `owner` in metadata key but value is not `sd` AND have key/value `foo=bar` * `doesnotexist.foo=bar` returns an empty list. Note that endpoint doesn't have a field called "doesnotexist". Since the filter does not match any endpoints, it returns no results * `attributes.kubernetes_resource_type=KUBERNETES_RESOURCE_TYPE_CLUSTER_ IP` returns endpoints with the corresponding kubernetes_resource_type For more information about filtering, see [API Filtering](https://aip.dev/160).
    *         filter: 'placeholder-value',
    *         // Optional. The order to list results by. General `order_by` string syntax: ` () (,)` * `` allows values: `name`, `address`, `port` * `` ascending or descending order by ``. If this is left blank, `asc` is used Note that an empty `order_by` string results in default order, which is order by `name` in ascending order.
    *         orderBy: 'placeholder-value',
    *         // Optional. The maximum number of items to return.
    *         pageSize: 'placeholder-value',
    *         // Optional. The next_page_token value returned from a previous List request, if any.
    *         pageToken: 'placeholder-value',
    *         // Required. The resource name of the service whose endpoints you'd like to list.
    *         parent:
    *           'projects/my-project/locations/my-location/namespaces/my-namespace/services/my-service',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "endpoints": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaEndpoint] = js.native
  def patch(callback: BodyResponseCallback[SchemaEndpoint]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEndpoint] = js.native
  def patch(params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsPatch): GaxiosPromise[SchemaEndpoint] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsPatch,
    callback: BodyResponseCallback[SchemaEndpoint]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsPatch,
    options: BodyResponseCallback[Readable | SchemaEndpoint],
    callback: BodyResponseCallback[Readable | SchemaEndpoint]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsPatch, options: MethodOptions): GaxiosPromise[SchemaEndpoint] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEndpoint]
  ): Unit = js.native
  /**
    * Updates an endpoint.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicedirectory.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicedirectory = google.servicedirectory('v1beta1');
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
    *     await servicedirectory.projects.locations.namespaces.services.endpoints.patch(
    *       {
    *         // Immutable. The resource name for the endpoint in the format `projects/x/locations/x/namespaces/x/services/x/endpoints/x`.
    *         name: 'projects/my-project/locations/my-location/namespaces/my-namespace/services/my-service/endpoints/my-endpoint',
    *         // Required. List of fields to be updated in this request.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "address": "my_address",
    *           //   "createTime": "my_createTime",
    *           //   "metadata": {},
    *           //   "name": "my_name",
    *           //   "network": "my_network",
    *           //   "port": 0,
    *           //   "updateTime": "my_updateTime"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": "my_address",
    *   //   "createTime": "my_createTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "network": "my_network",
    *   //   "port": 0,
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
  def patch(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsNamespacesServicesEndpointsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
