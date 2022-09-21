package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Instructions")
@js.native
open class ResourceProjectsInstructions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsInstructionsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsInstructionsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsInstructionsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstructionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsInstructionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates an instruction for how data should be labeled.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.instructions.create({
    *     // Required. Instruction resource parent, format: projects/{project_id\}
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "instruction": {}
    *       // }
    *     },
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
  def create(params: ParamsResourceProjectsInstructionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsInstructionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsInstructionsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstructionsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsInstructionsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsInstructionsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstructionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes an instruction object by resource name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.instructions.delete({
    *     // Required. Instruction resource name, format: projects/{project_id\}/instructions/{instruction_id\}
    *     name: 'projects/my-project/instructions/my-instruction',
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
  def delete(params: ParamsResourceProjectsInstructionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsInstructionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Instruction] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Instruction]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Instruction] = js.native
  def get(params: ParamsResourceProjectsInstructionsGet): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Instruction] = js.native
  def get(
    params: ParamsResourceProjectsInstructionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Instruction]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstructionsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1Instruction],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1Instruction]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstructionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Instruction] = js.native
  def get(
    params: ParamsResourceProjectsInstructionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Instruction]
  ): Unit = js.native
  /**
    * Gets an instruction by resource name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.instructions.get({
    *     // Required. Instruction resource name, format: projects/{project_id\}/instructions/{instruction_id\}
    *     name: 'projects/my-project/instructions/my-instruction',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blockingResources": [],
    *   //   "createTime": "my_createTime",
    *   //   "csvInstruction": {},
    *   //   "dataType": "my_dataType",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "pdfInstruction": {},
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
  def get(params: ParamsResourceProjectsInstructionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsInstructionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse] = js.native
  def list(params: ParamsResourceProjectsInstructionsList): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstructionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstructionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstructionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstructionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse]
  ): Unit = js.native
  /**
    * Lists instructions for a project. Pagination is supported.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.instructions.list({
    *     // Optional. Filter is not supported at this moment.
    *     filter: 'placeholder-value',
    *     // Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token identifying a page of results for the server to return. Typically obtained by ListInstructionsResponse.next_page_token of the previous [DataLabelingService.ListInstructions] call. Return first page if empty.
    *     pageToken: 'placeholder-value',
    *     // Required. Instruction resource parent, format: projects/{project_id\}
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "instructions": [],
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
  def list(params: ParamsResourceProjectsInstructionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsInstructionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
