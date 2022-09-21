package typings.googleapis.translateV3Mod.translateV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/translate/v3", "translate_v3.Resource$Projects$Locations$Glossaries$Glossaryentries")
@js.native
open class ResourceProjectsLocationsGlossariesGlossaryentries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def create(callback: BodyResponseCallback[SchemaGlossaryEntry]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def create(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate,
    callback: BodyResponseCallback[SchemaGlossaryEntry]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate,
    options: BodyResponseCallback[Readable | SchemaGlossaryEntry],
    callback: BodyResponseCallback[Readable | SchemaGlossaryEntry]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate, options: MethodOptions): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGlossaryEntry]
  ): Unit = js.native
  /**
    * Creates a glossary entry.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await translate.projects.locations.glossaries.glossaryEntries.create({
    *       // Required. The resource name of the glossary to create the entry under.
    *       parent:
    *         'projects/my-project/locations/my-location/glossaries/my-glossarie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "description": "my_description",
    *         //   "name": "my_name",
    *         //   "termsPair": {},
    *         //   "termsSet": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "name": "my_name",
    *   //   "termsPair": {},
    *   //   "termsSet": {}
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
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a single entry from the glossary
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await translate.projects.locations.glossaries.glossaryEntries.delete({
    *       // Required. The resource name of the glossary entry to delete
    *       name: 'projects/my-project/locations/my-location/glossaries/my-glossarie/glossaryEntries/my-glossaryEntrie',
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
  def delete(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def get(callback: BodyResponseCallback[SchemaGlossaryEntry]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def get(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesGet): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesGet,
    callback: BodyResponseCallback[SchemaGlossaryEntry]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesGet,
    options: BodyResponseCallback[Readable | SchemaGlossaryEntry],
    callback: BodyResponseCallback[Readable | SchemaGlossaryEntry]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesGet, options: MethodOptions): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGlossaryEntry]
  ): Unit = js.native
  /**
    * Gets a single glossary entry by the given id.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await translate.projects.locations.glossaries.glossaryEntries.get(
    *     {
    *       // Required. The resource name of the glossary entry to get
    *       name: 'projects/my-project/locations/my-location/glossaries/my-glossarie/glossaryEntries/my-glossaryEntrie',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "name": "my_name",
    *   //   "termsPair": {},
    *   //   "termsSet": {}
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
  def get(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListGlossaryEntriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGlossaryEntriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGlossaryEntriesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesList): GaxiosPromise[SchemaListGlossaryEntriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesList,
    callback: BodyResponseCallback[SchemaListGlossaryEntriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesList,
    options: BodyResponseCallback[Readable | SchemaListGlossaryEntriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListGlossaryEntriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesList, options: MethodOptions): GaxiosPromise[SchemaListGlossaryEntriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGlossaryEntriesResponse]
  ): Unit = js.native
  /**
    * List the entries for the glossary.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await translate.projects.locations.glossaries.glossaryEntries.list({
    *       // Optional. Requested page size. The server may return fewer glossary entries than requested. If unspecified, the server picks an appropriate default.
    *       pageSize: 'placeholder-value',
    *       // Optional. A token identifying a page of results the server should return. Typically, this is the value of [ListGlossaryEntriesResponse.next_page_token] returned from the previous call. The first page is returned if `page_token`is empty or missing.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent glossary resource name for listing the glossary's entries.
    *       parent:
    *         'projects/my-project/locations/my-location/glossaries/my-glossarie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "glossaryEntries": [],
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
  def list(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def patch(callback: BodyResponseCallback[SchemaGlossaryEntry]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def patch(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch,
    callback: BodyResponseCallback[SchemaGlossaryEntry]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch,
    options: BodyResponseCallback[Readable | SchemaGlossaryEntry],
    callback: BodyResponseCallback[Readable | SchemaGlossaryEntry]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch, options: MethodOptions): GaxiosPromise[SchemaGlossaryEntry] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGlossaryEntry]
  ): Unit = js.native
  /**
    * Updates a glossary entry.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await translate.projects.locations.glossaries.glossaryEntries.patch({
    *       // Required. The resource name of the entry. Format: "projects/x/locations/x/glossaries/x/glossaryEntries/x"
    *       name: 'projects/my-project/locations/my-location/glossaries/my-glossarie/glossaryEntries/my-glossaryEntrie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "description": "my_description",
    *         //   "name": "my_name",
    *         //   "termsPair": {},
    *         //   "termsSet": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "name": "my_name",
    *   //   "termsPair": {},
    *   //   "termsSet": {}
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
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
