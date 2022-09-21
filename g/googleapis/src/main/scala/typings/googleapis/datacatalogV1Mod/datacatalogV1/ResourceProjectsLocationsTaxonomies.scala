package typings.googleapis.datacatalogV1Mod.datacatalogV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datacatalog/v1", "datacatalog_v1.Resource$Projects$Locations$Taxonomies")
@js.native
open class ResourceProjectsLocationsTaxonomies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def create(params: ParamsResourceProjectsLocationsTaxonomiesCreate): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTaxonomiesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsTaxonomiesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Taxonomy],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsTaxonomiesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTaxonomiesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  /**
    * Creates a taxonomy in a specified project. The taxonomy is initially empty, that is, it doesn't contain policy tags.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.create({
    *     // Required. Resource name of the project that the taxonomy will belong to.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activatedPolicyTypes": [],
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "policyTagCount": 0,
    *       //   "taxonomyTimestamps": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activatedPolicyTypes": [],
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "policyTagCount": 0,
    *   //   "taxonomyTimestamps": {}
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
  def create(params: ParamsResourceProjectsLocationsTaxonomiesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTaxonomiesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsTaxonomiesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTaxonomiesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTaxonomiesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsTaxonomiesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTaxonomiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a taxonomy, including all policy tags in this taxonomy, their associated policies, and the policy tags references from BigQuery columns.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.delete({
    *     // Required. Resource name of the taxonomy to delete. Note: All policy tags in this taxonomy are also deleted.
    *     name: 'projects/my-project/locations/my-location/taxonomies/my-taxonomie',
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
  def delete(params: ParamsResourceProjectsLocationsTaxonomiesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTaxonomiesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `export`(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse] = js.native
  def `export`(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse] = js.native
  def `export`(params: ParamsResourceProjectsLocationsTaxonomiesExport): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsTaxonomiesExport,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse]
  ): Unit = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsTaxonomiesExport,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse]
  ): Unit = js.native
  def `export`(params: ParamsResourceProjectsLocationsTaxonomiesExport, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsTaxonomiesExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse]
  ): Unit = js.native
  /**
    * Exports taxonomies in the requested type and returns them, including their policy tags. The requested taxonomies must belong to the same project. This method generates `SerializedTaxonomy` protocol buffers with nested policy tags that can be used as input for `ImportTaxonomies` calls.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.export({
    *     // Required. Resource name of the project that the exported taxonomies belong to.
    *     parent: 'projects/my-project/locations/my-location',
    *     // Serialized export taxonomies that contain all the policy tags as nested protocol buffers.
    *     serializedTaxonomies: 'placeholder-value',
    *     // Required. Resource names of the taxonomies to export.
    *     taxonomies: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "taxonomies": []
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
  def `export`(params: ParamsResourceProjectsLocationsTaxonomiesExport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsTaxonomiesExport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def get(params: ParamsResourceProjectsLocationsTaxonomiesGet): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTaxonomiesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsTaxonomiesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Taxonomy],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsTaxonomiesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTaxonomiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  /**
    * Gets a taxonomy.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.get({
    *     // Required. Resource name of the taxonomy to get.
    *     name: 'projects/my-project/locations/my-location/taxonomies/my-taxonomie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activatedPolicyTypes": [],
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "policyTagCount": 0,
    *   //   "taxonomyTimestamps": {}
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
  def get(params: ParamsResourceProjectsLocationsTaxonomiesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTaxonomiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsTaxonomiesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsTaxonomiesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the IAM policy for a policy tag or a taxonomy.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.getIamPolicy({
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/locations/my-location/taxonomies/my-taxonomie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "options": {}
    *       // }
    *     },
    *   });
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsTaxonomiesGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse] = js.native
  def `import`(params: ParamsResourceProjectsLocationsTaxonomiesImport): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsTaxonomiesImport,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsTaxonomiesImport,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsTaxonomiesImport, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsTaxonomiesImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse]
  ): Unit = js.native
  /**
    * Creates new taxonomies (including their policy tags) in a given project by importing from inlined or cross-regional sources. For a cross-regional source, new taxonomies are created by copying from a source in another region. For an inlined source, taxonomies and policy tags are created in bulk using nested protocol buffer structures.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.import({
    *     // Required. Resource name of project that the imported taxonomies will belong to.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "crossRegionalSource": {},
    *       //   "inlineSource": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "taxonomies": []
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
  def `import`(params: ParamsResourceProjectsLocationsTaxonomiesImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsTaxonomiesImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsTaxonomiesList): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTaxonomiesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsTaxonomiesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsTaxonomiesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTaxonomiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse]
  ): Unit = js.native
  /**
    * Lists all taxonomies in a project in a particular location that you have a permission to view.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.list({
    *     // The maximum number of items to return. Must be a value between 1 and 1000 inclusively. If not set, defaults to 50.
    *     pageSize: 'placeholder-value',
    *     // The pagination token of the next results page. If not set, the first page is returned. The token is returned in the response to a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the project to list the taxonomies of.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "taxonomies": []
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
  def list(params: ParamsResourceProjectsLocationsTaxonomiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTaxonomiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def patch(params: ParamsResourceProjectsLocationsTaxonomiesPatch): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTaxonomiesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTaxonomiesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Taxonomy],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsTaxonomiesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTaxonomiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  /**
    * Updates a taxonomy, including its display name, description, and activated policy types.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.patch({
    *     // Output only. Resource name of this taxonomy in URL format. Note: Policy tag manager generates unique taxonomy IDs.
    *     name: 'projects/my-project/locations/my-location/taxonomies/my-taxonomie',
    *     // Specifies fields to update. If not set, defaults to all fields you can update. For more information, see [FieldMask] (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activatedPolicyTypes": [],
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "policyTagCount": 0,
    *       //   "taxonomyTimestamps": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activatedPolicyTypes": [],
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "policyTagCount": 0,
    *   //   "taxonomyTimestamps": {}
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
  def patch(params: ParamsResourceProjectsLocationsTaxonomiesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTaxonomiesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var policyTags: ResourceProjectsLocationsTaxonomiesPolicytags = js.native
  
  def replace(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def replace(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]): Unit = js.native
  def replace(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def replace(params: ParamsResourceProjectsLocationsTaxonomiesReplace): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def replace(
    params: ParamsResourceProjectsLocationsTaxonomiesReplace,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  def replace(
    params: ParamsResourceProjectsLocationsTaxonomiesReplace,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Taxonomy],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  def replace(params: ParamsResourceProjectsLocationsTaxonomiesReplace, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Taxonomy] = js.native
  def replace(
    params: ParamsResourceProjectsLocationsTaxonomiesReplace,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Taxonomy]
  ): Unit = js.native
  /**
    * Replaces (updates) a taxonomy and all its policy tags. The taxonomy and its entire hierarchy of policy tags must be represented literally by `SerializedTaxonomy` and the nested `SerializedPolicyTag` messages. This operation automatically does the following: - Deletes the existing policy tags that are missing from the `SerializedPolicyTag`. - Creates policy tags that don't have resource names. They are considered new. - Updates policy tags with valid resources names accordingly.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.replace({
    *     // Required. Resource name of the taxonomy to update.
    *     name: 'projects/my-project/locations/my-location/taxonomies/my-taxonomie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "serializedTaxonomy": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activatedPolicyTypes": [],
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "policyTagCount": 0,
    *   //   "taxonomyTimestamps": {}
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
  def replace(params: ParamsResourceProjectsLocationsTaxonomiesReplace, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def replace(
    params: ParamsResourceProjectsLocationsTaxonomiesReplace,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsTaxonomiesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsTaxonomiesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the IAM policy for a policy tag or a taxonomy.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.taxonomies.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/locations/my-location/taxonomies/my-taxonomie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {}
    *       // }
    *     },
    *   });
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsTaxonomiesSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsTaxonomiesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsTaxonomiesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsTaxonomiesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsTaxonomiesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsTaxonomiesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsTaxonomiesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns your permissions on a specified policy tag or taxonomy.
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
    * const datacatalog = google.datacatalog('v1');
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
    *     await datacatalog.projects.locations.taxonomies.testIamPermissions({
    *       // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/taxonomies/my-taxonomie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "permissions": []
    *         // }
    *       },
    *     });
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsTaxonomiesTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsTaxonomiesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
