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

@JSImport("googleapis/build/src/apis/datacatalog/v1", "datacatalog_v1.Resource$Projects$Locations$Entrygroups$Tags")
@js.native
open class ResourceProjectsLocationsEntrygroupsTags protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Tag] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Tag]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Tag] = js.native
  def create(params: ParamsResourceProjectsLocationsEntrygroupsTagsCreate): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Tag] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Tag]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Tag],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Tag]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsEntrygroupsTagsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Tag] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Tag]
  ): Unit = js.native
  /**
    * Creates a tag and assigns it to: * An Entry if the method name is `projects.locations.entryGroups.entries.tags.create`. * Or EntryGroupif the method name is `projects.locations.entryGroups.tags.create`. Note: The project identified by the `parent` parameter for the [tag] (https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries.tags/create#path-parameters) and the [tag template] (https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.tagTemplates/create#path-parameters) used to create the tag must be in the same organization.
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
    *   const res = await datacatalog.projects.locations.entryGroups.tags.create({
    *     // Required. The name of the resource to attach this tag to. Tags can be attached to entries or entry groups. An entry can have up to 1000 attached tags. Note: The tag and its child resources might not be stored in the location specified in its name.
    *     parent:
    *       'projects/my-project/locations/my-location/entryGroups/my-entryGroup',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "column": "my_column",
    *       //   "fields": {},
    *       //   "name": "my_name",
    *       //   "template": "my_template",
    *       //   "templateDisplayName": "my_templateDisplayName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "column": "my_column",
    *   //   "fields": {},
    *   //   "name": "my_name",
    *   //   "template": "my_template",
    *   //   "templateDisplayName": "my_templateDisplayName"
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
  def create(params: ParamsResourceProjectsLocationsEntrygroupsTagsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsEntrygroupsTagsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsEntrygroupsTagsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a tag.
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
    *   const res = await datacatalog.projects.locations.entryGroups.tags.delete({
    *     // Required. The name of the tag to delete.
    *     name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/tags/my-tag',
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
  def delete(params: ParamsResourceProjectsLocationsEntrygroupsTagsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListTagsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ListTagsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListTagsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsEntrygroupsTagsList): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListTagsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1ListTagsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1ListTagsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsEntrygroupsTagsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListTagsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ListTagsResponse]
  ): Unit = js.native
  /**
    * Lists tags assigned to an Entry. The columns in the response are lowercased.
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
    *   const res = await datacatalog.projects.locations.entryGroups.tags.list({
    *     // The maximum number of tags to return. Default is 10. Maximum limit is 1000.
    *     pageSize: 'placeholder-value',
    *     // Pagination token that specifies the next page to return. If empty, the first page is returned.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the Data Catalog resource to list the tags of. The resource can be an Entry or an EntryGroup (without `/entries/{entries\}` at the end).
    *     parent:
    *       'projects/my-project/locations/my-location/entryGroups/my-entryGroup',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "tags": []
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
  def list(params: ParamsResourceProjectsLocationsEntrygroupsTagsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Tag] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Tag]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Tag] = js.native
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsTagsPatch): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Tag] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Tag]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Tag],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Tag]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsTagsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Tag] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Tag]
  ): Unit = js.native
  /**
    * Updates an existing tag.
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
    *   const res = await datacatalog.projects.locations.entryGroups.tags.patch({
    *     // The resource name of the tag in URL format where tag ID is a system-generated identifier. Note: The tag itself might not be stored in the location specified in its name.
    *     name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/tags/my-tag',
    *     // Names of fields whose values to overwrite on a tag. Currently, a tag has the only modifiable field with the name `fields`. In general, if this parameter is absent or empty, all modifiable fields are overwritten. If such fields are non-required and omitted in the request body, their values are emptied.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "column": "my_column",
    *       //   "fields": {},
    *       //   "name": "my_name",
    *       //   "template": "my_template",
    *       //   "templateDisplayName": "my_templateDisplayName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "column": "my_column",
    *   //   "fields": {},
    *   //   "name": "my_name",
    *   //   "template": "my_template",
    *   //   "templateDisplayName": "my_templateDisplayName"
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
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsTagsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsTagsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
