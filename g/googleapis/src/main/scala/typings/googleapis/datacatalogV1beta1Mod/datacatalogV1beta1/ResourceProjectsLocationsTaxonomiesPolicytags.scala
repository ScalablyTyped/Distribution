package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datacatalog/v1beta1", "datacatalog_v1beta1.Resource$Projects$Locations$Taxonomies$Policytags")
@js.native
open class ResourceProjectsLocationsTaxonomiesPolicytags protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def create(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1PolicyTag],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1PolicyTag]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]
  ): Unit = js.native
  /**
    * Creates a policy tag in the specified taxonomy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.policyTags.create(
    *     {
    *       // Required. Resource name of the taxonomy that the policy tag will belong to.
    *       parent:
    *         'projects/my-project/locations/my-location/taxonomies/my-taxonomie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "childPolicyTags": [],
    *         //   "description": "my_description",
    *         //   "displayName": "my_displayName",
    *         //   "name": "my_name",
    *         //   "parentPolicyTag": "my_parentPolicyTag"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "childPolicyTags": [],
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "parentPolicyTag": "my_parentPolicyTag"
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
  def create(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a policy tag. Also deletes all of its descendant policy tags.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.policyTags.delete(
    *     {
    *       // Required. Resource name of the policy tag to be deleted. All of its descendant policy tags will also be deleted.
    *       name: 'projects/my-project/locations/my-location/taxonomies/my-taxonomie/policyTags/my-policyTag',
    *     }
    *   );
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
  def delete(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def get(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1PolicyTag],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1PolicyTag]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]
  ): Unit = js.native
  /**
    * Gets a policy tag.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.policyTags.get({
    *     // Required. Resource name of the requested policy tag.
    *     name: 'projects/my-project/locations/my-location/taxonomies/my-taxonomie/policyTags/my-policyTag',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "childPolicyTags": [],
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "parentPolicyTag": "my_parentPolicyTag"
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
  def get(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the IAM policy for a taxonomy or a policy tag.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *     await datacatalog.projects.locations.taxonomies.policyTags.getIamPolicy({
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/taxonomies/my-taxonomie/policyTags/my-policyTag',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "options": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsList): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1ListPolicyTagsResponse]
  ): Unit = js.native
  /**
    * Lists all policy tags in a taxonomy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.policyTags.list({
    *     // The maximum number of items to return. Must be a value between 1 and 1000. If not set, defaults to 50.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any. If not set, defaults to an empty string.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the taxonomy to list the policy tags of.
    *     parent: 'projects/my-project/locations/my-location/taxonomies/my-taxonomie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "policyTags": []
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
  def list(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def patch(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsPatch): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1PolicyTag],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1PolicyTag]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]
  ): Unit = js.native
  /**
    * Updates a policy tag.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.policyTags.patch({
    *     // Output only. Resource name of this policy tag, whose format is: "projects/{project_number\}/locations/{location_id\}/taxonomies/{taxonomy_id\}/policyTags/{id\}".
    *     name: 'projects/my-project/locations/my-location/taxonomies/my-taxonomie/policyTags/my-policyTag',
    *     // The update mask applies to the resource. Only display_name, description and parent_policy_tag can be updated and thus can be listed in the mask. If update_mask is not provided, all allowed fields (i.e. display_name, description and parent) will be updated. For more information including the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If not set, defaults to all of the fields that are allowed to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "childPolicyTags": [],
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "parentPolicyTag": "my_parentPolicyTag"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "childPolicyTags": [],
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "parentPolicyTag": "my_parentPolicyTag"
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
  def patch(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the IAM policy for a taxonomy or a policy tag.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *     await datacatalog.projects.locations.taxonomies.policyTags.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/taxonomies/my-taxonomie/policyTags/my-policyTag',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsSetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns the permissions that a caller has on the specified taxonomy or policy tag.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *     await datacatalog.projects.locations.taxonomies.policyTags.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/taxonomies/my-taxonomie/policyTags/my-policyTag',
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
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsTaxonomiesPolicytagsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
