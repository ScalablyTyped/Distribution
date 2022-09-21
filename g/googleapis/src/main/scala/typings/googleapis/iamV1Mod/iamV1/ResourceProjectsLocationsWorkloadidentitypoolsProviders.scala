package typings.googleapis.iamV1Mod.iamV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Projects$Locations$Workloadidentitypools$Providers")
@js.native
open class ResourceProjectsLocationsWorkloadidentitypoolsProviders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new WorkloadIdentityPoolProvider in a WorkloadIdentityPool. You cannot reuse the name of a deleted provider until 30 days after deletion.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *     await iam.projects.locations.workloadIdentityPools.providers.create({
    *       // Required. The pool to create this provider in.
    *       parent:
    *         'projects/my-project/locations/my-location/workloadIdentityPools/my-workloadIdentityPool',
    *       // Required. The ID for the provider, which becomes the final component of the resource name. This value must be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix `gcp-` is reserved for use by Google, and may not be specified.
    *       workloadIdentityPoolProviderId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "attributeCondition": "my_attributeCondition",
    *         //   "attributeMapping": {},
    *         //   "aws": {},
    *         //   "description": "my_description",
    *         //   "disabled": false,
    *         //   "displayName": "my_displayName",
    *         //   "name": "my_name",
    *         //   "oidc": {},
    *         //   "saml": {},
    *         //   "state": "my_state"
    *         // }
    *       },
    *     });
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
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a WorkloadIdentityPoolProvider. Deleting a provider does not revoke credentials that have already been issued; they continue to grant access. You can undelete a provider for 30 days. After 30 days, deletion is permanent. You cannot update deleted providers. However, you can view and list them.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *     await iam.projects.locations.workloadIdentityPools.providers.delete({
    *       // Required. The name of the provider to delete.
    *       name: 'projects/my-project/locations/my-location/workloadIdentityPools/my-workloadIdentityPool/providers/my-provider',
    *     });
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
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaWorkloadIdentityPoolProvider] = js.native
  def get(callback: BodyResponseCallback[SchemaWorkloadIdentityPoolProvider]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkloadIdentityPoolProvider] = js.native
  def get(params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersGet): GaxiosPromise[SchemaWorkloadIdentityPoolProvider] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersGet,
    callback: BodyResponseCallback[SchemaWorkloadIdentityPoolProvider]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersGet,
    options: BodyResponseCallback[Readable | SchemaWorkloadIdentityPoolProvider],
    callback: BodyResponseCallback[Readable | SchemaWorkloadIdentityPoolProvider]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersGet, options: MethodOptions): GaxiosPromise[SchemaWorkloadIdentityPoolProvider] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkloadIdentityPoolProvider]
  ): Unit = js.native
  /**
    * Gets an individual WorkloadIdentityPoolProvider.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.projects.locations.workloadIdentityPools.providers.get({
    *     // Required. The name of the provider to retrieve.
    *     name: 'projects/my-project/locations/my-location/workloadIdentityPools/my-workloadIdentityPool/providers/my-provider',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributeCondition": "my_attributeCondition",
    *   //   "attributeMapping": {},
    *   //   "aws": {},
    *   //   "description": "my_description",
    *   //   "disabled": false,
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "oidc": {},
    *   //   "saml": {},
    *   //   "state": "my_state"
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
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var keys: ResourceProjectsLocationsWorkloadidentitypoolsProvidersKeys = js.native
  
  def list(): GaxiosPromise[SchemaListWorkloadIdentityPoolProvidersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWorkloadIdentityPoolProvidersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWorkloadIdentityPoolProvidersResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList): GaxiosPromise[SchemaListWorkloadIdentityPoolProvidersResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList,
    callback: BodyResponseCallback[SchemaListWorkloadIdentityPoolProvidersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList,
    options: BodyResponseCallback[Readable | SchemaListWorkloadIdentityPoolProvidersResponse],
    callback: BodyResponseCallback[Readable | SchemaListWorkloadIdentityPoolProvidersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList, options: MethodOptions): GaxiosPromise[SchemaListWorkloadIdentityPoolProvidersResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWorkloadIdentityPoolProvidersResponse]
  ): Unit = js.native
  /**
    * Lists all non-deleted WorkloadIdentityPoolProviders in a WorkloadIdentityPool. If `show_deleted` is set to `true`, then deleted providers are also listed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.projects.locations.workloadIdentityPools.providers.list(
    *     {
    *       // The maximum number of providers to return. If unspecified, at most 50 providers are returned. The maximum value is 100; values above 100 are truncated to 100.
    *       pageSize: 'placeholder-value',
    *       // A page token, received from a previous `ListWorkloadIdentityPoolProviders` call. Provide this to retrieve the subsequent page.
    *       pageToken: 'placeholder-value',
    *       // Required. The pool to list providers for.
    *       parent:
    *         'projects/my-project/locations/my-location/workloadIdentityPools/my-workloadIdentityPool',
    *       // Whether to return soft-deleted providers.
    *       showDeleted: 'placeholder-value',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "workloadIdentityPoolProviders": []
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
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceProjectsLocationsWorkloadidentitypoolsProvidersOperations = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates an existing WorkloadIdentityPoolProvider.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *     await iam.projects.locations.workloadIdentityPools.providers.patch({
    *       // Output only. The resource name of the provider.
    *       name: 'projects/my-project/locations/my-location/workloadIdentityPools/my-workloadIdentityPool/providers/my-provider',
    *       // Required. The list of fields to update.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "attributeCondition": "my_attributeCondition",
    *         //   "attributeMapping": {},
    *         //   "aws": {},
    *         //   "description": "my_description",
    *         //   "disabled": false,
    *         //   "displayName": "my_displayName",
    *         //   "name": "my_name",
    *         //   "oidc": {},
    *         //   "saml": {},
    *         //   "state": "my_state"
    *         // }
    *       },
    *     });
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
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undelete(): GaxiosPromise[SchemaOperation] = js.native
  def undelete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def undelete(params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersUndelete): GaxiosPromise[SchemaOperation] = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersUndelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersUndelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersUndelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Undeletes a WorkloadIdentityPoolProvider, as long as it was deleted fewer than 30 days ago.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *     await iam.projects.locations.workloadIdentityPools.providers.undelete({
    *       // Required. The name of the provider to undelete.
    *       name: 'projects/my-project/locations/my-location/workloadIdentityPools/my-workloadIdentityPool/providers/my-provider',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
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
  def undelete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersUndelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersUndelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
