package typings.googleapis.retailV2alphaMod.retailV2alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/retail/v2alpha", "retail_v2alpha.Resource$Projects$Locations$Operations")
@js.native
open class ResourceProjectsLocationsOperations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(params: ParamsResourceProjectsLocationsOperationsGet): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsOperationsGet,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsOperationsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsOperationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsOperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.operations.get({
    *     // The name of the operation resource.
    *     name: 'projects/my-project/locations/my-location/operations/my-operation',
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
  def get(params: ParamsResourceProjectsLocationsOperationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsOperationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleLongrunningListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleLongrunningListOperationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningListOperationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsOperationsList): GaxiosPromise[SchemaGoogleLongrunningListOperationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsOperationsList,
    callback: BodyResponseCallback[SchemaGoogleLongrunningListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsOperationsList,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningListOperationsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsOperationsList, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningListOperationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsOperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningListOperationsResponse]
  ): Unit = js.native
  /**
    * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE: the `name` binding allows API services to override the binding to use different resource name schemes, such as `users/x/operations`. To override the binding, API services can add a binding such as `"/v1/{name=users/x\}/operations"` to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must ensure the name binding is the parent resource, without the operations collection id.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.operations.list({
    *     // The standard list filter.
    *     filter: 'placeholder-value',
    *     // The name of the operation's parent resource.
    *     name: 'projects/my-project/locations/my-location',
    *     // The standard list page size.
    *     pageSize: 'placeholder-value',
    *     // The standard list page token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "operations": []
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
  def list(params: ParamsResourceProjectsLocationsOperationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsOperationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
