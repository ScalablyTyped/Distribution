package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/transcoder/v1beta1", "transcoder_v1beta1.Resource$Projects$Locations$Jobtemplates")
@js.native
open class ResourceProjectsLocationsJobtemplates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaJobTemplate] = js.native
  def create(callback: BodyResponseCallback[SchemaJobTemplate]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJobTemplate] = js.native
  def create(params: ParamsResourceProjectsLocationsJobtemplatesCreate): GaxiosPromise[SchemaJobTemplate] = js.native
  def create(
    params: ParamsResourceProjectsLocationsJobtemplatesCreate,
    callback: BodyResponseCallback[SchemaJobTemplate]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsJobtemplatesCreate,
    options: BodyResponseCallback[Readable | SchemaJobTemplate],
    callback: BodyResponseCallback[Readable | SchemaJobTemplate]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsJobtemplatesCreate, options: MethodOptions): GaxiosPromise[SchemaJobTemplate] = js.native
  def create(
    params: ParamsResourceProjectsLocationsJobtemplatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJobTemplate]
  ): Unit = js.native
  /**
    * Creates a job template in the specified region.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/transcoder.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const transcoder = google.transcoder('v1beta1');
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
    *   const res = await transcoder.projects.locations.jobTemplates.create({
    *     // Required. The ID to use for the job template, which will become the final component of the job template's resource name. This value should be 4-63 characters, and valid characters must match the regular expression `a-zA-Z*`.
    *     jobTemplateId: 'placeholder-value',
    *     // Required. The parent location to create this job template. Format: `projects/{project\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "config": {},
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "config": {},
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceProjectsLocationsJobtemplatesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsJobtemplatesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsJobtemplatesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsJobtemplatesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsJobtemplatesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsJobtemplatesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsJobtemplatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a job template.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/transcoder.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const transcoder = google.transcoder('v1beta1');
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
    *   const res = await transcoder.projects.locations.jobTemplates.delete({
    *     // Required. The name of the job template to delete. `projects/{project\}/locations/{location\}/jobTemplates/{job_template\}`
    *     name: 'projects/my-project/locations/my-location/jobTemplates/my-jobTemplate',
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
  def delete(params: ParamsResourceProjectsLocationsJobtemplatesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsJobtemplatesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaJobTemplate] = js.native
  def get(callback: BodyResponseCallback[SchemaJobTemplate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJobTemplate] = js.native
  def get(params: ParamsResourceProjectsLocationsJobtemplatesGet): GaxiosPromise[SchemaJobTemplate] = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobtemplatesGet,
    callback: BodyResponseCallback[SchemaJobTemplate]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobtemplatesGet,
    options: BodyResponseCallback[Readable | SchemaJobTemplate],
    callback: BodyResponseCallback[Readable | SchemaJobTemplate]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsJobtemplatesGet, options: MethodOptions): GaxiosPromise[SchemaJobTemplate] = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobtemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJobTemplate]
  ): Unit = js.native
  /**
    * Returns the job template data.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/transcoder.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const transcoder = google.transcoder('v1beta1');
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
    *   const res = await transcoder.projects.locations.jobTemplates.get({
    *     // Required. The name of the job template to retrieve. Format: `projects/{project\}/locations/{location\}/jobTemplates/{job_template\}`
    *     name: 'projects/my-project/locations/my-location/jobTemplates/my-jobTemplate',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "config": {},
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsLocationsJobtemplatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobtemplatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListJobTemplatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobTemplatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListJobTemplatesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsJobtemplatesList): GaxiosPromise[SchemaListJobTemplatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobtemplatesList,
    callback: BodyResponseCallback[SchemaListJobTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobtemplatesList,
    options: BodyResponseCallback[Readable | SchemaListJobTemplatesResponse],
    callback: BodyResponseCallback[Readable | SchemaListJobTemplatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsJobtemplatesList, options: MethodOptions): GaxiosPromise[SchemaListJobTemplatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobtemplatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListJobTemplatesResponse]
  ): Unit = js.native
  /**
    * Lists job templates in the specified region.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/transcoder.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const transcoder = google.transcoder('v1beta1');
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
    *   const res = await transcoder.projects.locations.jobTemplates.list({
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The `next_page_token` value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent location from which to retrieve the collection of job templates. Format: `projects/{project\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "jobTemplates": [],
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
  def list(params: ParamsResourceProjectsLocationsJobtemplatesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobtemplatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
