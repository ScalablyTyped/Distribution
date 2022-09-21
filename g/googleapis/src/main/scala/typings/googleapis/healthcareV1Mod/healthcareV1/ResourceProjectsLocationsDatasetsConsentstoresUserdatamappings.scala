package typings.googleapis.healthcareV1Mod.healthcareV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1", "healthcare_v1.Resource$Projects$Locations$Datasets$Consentstores$Userdatamappings")
@js.native
open class ResourceProjectsLocationsDatasetsConsentstoresUserdatamappings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def archive(): GaxiosPromise[SchemaArchiveUserDataMappingResponse] = js.native
  def archive(callback: BodyResponseCallback[SchemaArchiveUserDataMappingResponse]): Unit = js.native
  def archive(params: Unit, options: MethodOptions): GaxiosPromise[SchemaArchiveUserDataMappingResponse] = js.native
  def archive(params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive): GaxiosPromise[SchemaArchiveUserDataMappingResponse] = js.native
  def archive(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive,
    callback: BodyResponseCallback[SchemaArchiveUserDataMappingResponse]
  ): Unit = js.native
  def archive(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive,
    options: BodyResponseCallback[Readable | SchemaArchiveUserDataMappingResponse],
    callback: BodyResponseCallback[Readable | SchemaArchiveUserDataMappingResponse]
  ): Unit = js.native
  def archive(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive,
    options: MethodOptions
  ): GaxiosPromise[SchemaArchiveUserDataMappingResponse] = js.native
  def archive(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaArchiveUserDataMappingResponse]
  ): Unit = js.native
  /**
    * Archives the specified User data mapping.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.userDataMappings.archive(
    *       {
    *         // Required. The resource name of the User data mapping to archive.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/userDataMappings/my-userDataMapping',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {}
    *         },
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
  def archive(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def archive(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaUserDataMapping] = js.native
  def create(callback: BodyResponseCallback[SchemaUserDataMapping]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserDataMapping] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate): GaxiosPromise[SchemaUserDataMapping] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate,
    callback: BodyResponseCallback[SchemaUserDataMapping]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate,
    options: BodyResponseCallback[Readable | SchemaUserDataMapping],
    callback: BodyResponseCallback[Readable | SchemaUserDataMapping]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaUserDataMapping] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserDataMapping]
  ): Unit = js.native
  /**
    * Creates a new User data mapping in the parent consent store.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.userDataMappings.create(
    *       {
    *         // Required. Name of the consent store.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "archiveTime": "my_archiveTime",
    *           //   "archived": false,
    *           //   "dataId": "my_dataId",
    *           //   "name": "my_name",
    *           //   "resourceAttributes": [],
    *           //   "userId": "my_userId"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "archiveTime": "my_archiveTime",
    *   //   "archived": false,
    *   //   "dataId": "my_dataId",
    *   //   "name": "my_name",
    *   //   "resourceAttributes": [],
    *   //   "userId": "my_userId"
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified User data mapping.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.userDataMappings.delete(
    *       {
    *         // Required. The resource name of the User data mapping to delete.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/userDataMappings/my-userDataMapping',
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUserDataMapping] = js.native
  def get(callback: BodyResponseCallback[SchemaUserDataMapping]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserDataMapping] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet): GaxiosPromise[SchemaUserDataMapping] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet,
    callback: BodyResponseCallback[SchemaUserDataMapping]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet,
    options: BodyResponseCallback[Readable | SchemaUserDataMapping],
    callback: BodyResponseCallback[Readable | SchemaUserDataMapping]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaUserDataMapping] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserDataMapping]
  ): Unit = js.native
  /**
    * Gets the specified User data mapping.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.userDataMappings.get(
    *       {
    *         // Required. The resource name of the User data mapping to retrieve.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/userDataMappings/my-userDataMapping',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "archiveTime": "my_archiveTime",
    *   //   "archived": false,
    *   //   "dataId": "my_dataId",
    *   //   "name": "my_name",
    *   //   "resourceAttributes": [],
    *   //   "userId": "my_userId"
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListUserDataMappingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUserDataMappingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUserDataMappingsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsList): GaxiosPromise[SchemaListUserDataMappingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsList,
    callback: BodyResponseCallback[SchemaListUserDataMappingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsList,
    options: BodyResponseCallback[Readable | SchemaListUserDataMappingsResponse],
    callback: BodyResponseCallback[Readable | SchemaListUserDataMappingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListUserDataMappingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUserDataMappingsResponse]
  ): Unit = js.native
  /**
    * Lists the User data mappings in the specified consent store.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.userDataMappings.list(
    *       {
    *         // Optional. Restricts the User data mappings returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `"query text"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `"Comment = great"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. The fields available for filtering are: - data_id - user_id. For example, `filter=user_id=\"user123\"`. - archived - archive_time
    *         filter: 'placeholder-value',
    *         // Optional. Limit on the number of User data mappings to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    *         pageSize: 'placeholder-value',
    *         // Optional. Token to retrieve the next page of results, or empty to get the first page.
    *         pageToken: 'placeholder-value',
    *         // Required. Name of the consent store to retrieve User data mappings from.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "userDataMappings": []
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaUserDataMapping] = js.native
  def patch(callback: BodyResponseCallback[SchemaUserDataMapping]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserDataMapping] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsPatch): GaxiosPromise[SchemaUserDataMapping] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsPatch,
    callback: BodyResponseCallback[SchemaUserDataMapping]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsPatch,
    options: BodyResponseCallback[Readable | SchemaUserDataMapping],
    callback: BodyResponseCallback[Readable | SchemaUserDataMapping]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaUserDataMapping] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserDataMapping]
  ): Unit = js.native
  /**
    * Updates the specified User data mapping.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.userDataMappings.patch(
    *       {
    *         // Resource name of the User data mapping, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/userDataMappings/{user_data_mapping_id\}`.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/userDataMappings/my-userDataMapping',
    *         // Required. The update mask that applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask. Only the `data_id`, `user_id` and `resource_attributes` fields can be updated.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "archiveTime": "my_archiveTime",
    *           //   "archived": false,
    *           //   "dataId": "my_dataId",
    *           //   "name": "my_name",
    *           //   "resourceAttributes": [],
    *           //   "userId": "my_userId"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "archiveTime": "my_archiveTime",
    *   //   "archived": false,
    *   //   "dataId": "my_dataId",
    *   //   "name": "my_name",
    *   //   "resourceAttributes": [],
    *   //   "userId": "my_userId"
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
