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

@JSImport("googleapis/build/src/apis/datacatalog/v1beta1", "datacatalog_v1beta1.Resource$Projects$Locations$Entrygroups$Entries$Tags")
@js.native
open class ResourceProjectsLocationsEntrygroupsEntriesTags protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Tag] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Tag]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Tag] = js.native
  def create(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsCreate): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Tag] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Tag]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Tag],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Tag]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Tag] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Tag]
  ): Unit = js.native
  /**
    * Creates a tag on an Entry. Note: The project identified by the `parent` parameter for the [tag](https://cloud.google.com/data-catalog/docs/reference/rest/v1beta1/projects.locations.entryGroups.entries.tags/create#path-parameters) and the [tag template](https://cloud.google.com/data-catalog/docs/reference/rest/v1beta1/projects.locations.tagTemplates/create#path-parameters) used to create the tag must be from the same organization.
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
    *     await datacatalog.projects.locations.entryGroups.entries.tags.create({
    *       // Required. The name of the resource to attach this tag to. Tags can be attached to Entries. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}/entries/{entry_id\} Note that this Tag and its child resources may not actually be stored in the location in this name.
    *       parent:
    *         'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "column": "my_column",
    *         //   "fields": {},
    *         //   "name": "my_name",
    *         //   "template": "my_template",
    *         //   "templateDisplayName": "my_templateDisplayName"
    *         // }
    *       },
    *     });
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
  def create(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsDelete,
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
    *     await datacatalog.projects.locations.entryGroups.entries.tags.delete({
    *       // Required. The name of the tag to delete. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}/entries/{entry_id\}/tags/{tag_id\}
    *       name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie/tags/my-tag',
    *     });
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
  def delete(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse]
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
    *     await datacatalog.projects.locations.entryGroups.entries.tags.list({
    *       // The maximum number of tags to return. Default is 10. Max limit is 1000.
    *       pageSize: 'placeholder-value',
    *       // Token that specifies which page is requested. If empty, the first page is returned.
    *       pageToken: 'placeholder-value',
    *       // Required. The name of the Data Catalog resource to list the tags of. The resource could be an Entry or an EntryGroup. Examples: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\} * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}/entries/{entry_id\}
    *       parent:
    *         'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
    *     });
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
  def list(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Tag] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Tag]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Tag] = js.native
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsPatch): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Tag] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Tag]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Tag],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Tag]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Tag] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Tag]
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
    *     await datacatalog.projects.locations.entryGroups.entries.tags.patch({
    *       // The resource name of the tag in URL format. Example: * projects/{project_id\}/locations/{location\}/entrygroups/{entry_group_id\}/entries/{entry_id\}/tags/{tag_id\} where `tag_id` is a system-generated identifier. Note that this Tag may not actually be stored in the location in this name.
    *       name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie/tags/my-tag',
    *       // Note: Currently, this parameter can only take `"fields"` as value. Names of fields whose values to overwrite on a tag. Currently, a tag has the only modifiable field with the name `fields`. In general, if this parameter is absent or empty, all modifiable fields are overwritten. If such fields are non-required and omitted in the request body, their values are emptied.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "column": "my_column",
    *         //   "fields": {},
    *         //   "name": "my_name",
    *         //   "template": "my_template",
    *         //   "templateDisplayName": "my_templateDisplayName"
    *         // }
    *       },
    *     });
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
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
