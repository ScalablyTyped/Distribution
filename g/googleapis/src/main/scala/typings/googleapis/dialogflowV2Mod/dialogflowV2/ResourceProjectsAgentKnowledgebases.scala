package typings.googleapis.dialogflowV2Mod.dialogflowV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent$Knowledgebases")
@js.native
open class ResourceProjectsAgentKnowledgebases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2KnowledgeBase]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def create(params: ParamsResourceProjectsAgentKnowledgebasesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def create(
    params: ParamsResourceProjectsAgentKnowledgebasesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2KnowledgeBase]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentKnowledgebasesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2KnowledgeBase],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2KnowledgeBase]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAgentKnowledgebasesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def create(
    params: ParamsResourceProjectsAgentKnowledgebasesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2KnowledgeBase]
  ): Unit = js.native
  /**
    * Creates a knowledge base.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.knowledgeBases.create({
    *     // Required. The project to create a knowledge base for. Format: `projects//locations/`.
    *     parent: 'projects/my-project/agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "languageCode": "my_languageCode",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "languageCode": "my_languageCode",
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
  def create(params: ParamsResourceProjectsAgentKnowledgebasesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAgentKnowledgebasesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsAgentKnowledgebasesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentKnowledgebasesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentKnowledgebasesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentKnowledgebasesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentKnowledgebasesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified knowledge base.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.knowledgeBases.delete({
    *     // Optional. Force deletes the knowledge base. When set to true, any documents in the knowledge base are also deleted.
    *     force: 'placeholder-value',
    *     // Required. The name of the knowledge base to delete. Format: `projects//locations//knowledgeBases/`.
    *     name: 'projects/my-project/agent/knowledgeBases/my-knowledgeBase',
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
  def delete(params: ParamsResourceProjectsAgentKnowledgebasesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsAgentKnowledgebasesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var documents: ResourceProjectsAgentKnowledgebasesDocuments = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2KnowledgeBase]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def get(params: ParamsResourceProjectsAgentKnowledgebasesGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def get(
    params: ParamsResourceProjectsAgentKnowledgebasesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2KnowledgeBase]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentKnowledgebasesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2KnowledgeBase],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2KnowledgeBase]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentKnowledgebasesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def get(
    params: ParamsResourceProjectsAgentKnowledgebasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2KnowledgeBase]
  ): Unit = js.native
  /**
    * Retrieves the specified knowledge base.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.knowledgeBases.get({
    *     // Required. The name of the knowledge base to retrieve. Format `projects//locations//knowledgeBases/`.
    *     name: 'projects/my-project/agent/knowledgeBases/my-knowledgeBase',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "languageCode": "my_languageCode",
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
  def get(params: ParamsResourceProjectsAgentKnowledgebasesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAgentKnowledgebasesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListKnowledgeBasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListKnowledgeBasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListKnowledgeBasesResponse] = js.native
  def list(params: ParamsResourceProjectsAgentKnowledgebasesList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListKnowledgeBasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentKnowledgebasesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListKnowledgeBasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentKnowledgebasesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListKnowledgeBasesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListKnowledgeBasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAgentKnowledgebasesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListKnowledgeBasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentKnowledgebasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListKnowledgeBasesResponse]
  ): Unit = js.native
  /**
    * Returns the list of all knowledge bases of the specified agent.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.knowledgeBases.list({
    *     // The filter expression used to filter knowledge bases returned by the list method. The expression has the following syntax: [AND ] ... The following fields and operators are supported: * display_name with has(:) operator * language_code with equals(=) operator Examples: * 'language_code=en-us' matches knowledge bases with en-us language code. * 'display_name:articles' matches knowledge bases whose display name contains "articles". * 'display_name:"Best Articles"' matches knowledge bases whose display name contains "Best Articles". * 'language_code=en-gb AND display_name=articles' matches all knowledge bases whose display name contains "articles" and whose language code is "en-gb". Note: An empty filter string (i.e. "") is a no-op and will result in no filtering. For more information about filtering, see [API Filtering](https://aip.dev/160).
    *     filter: 'placeholder-value',
    *     // The maximum number of items to return in a single page. By default 10 and at most 100.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The project to list of knowledge bases for. Format: `projects//locations/`.
    *     parent: 'projects/my-project/agent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "knowledgeBases": [],
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
  def list(params: ParamsResourceProjectsAgentKnowledgebasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAgentKnowledgebasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2KnowledgeBase]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def patch(params: ParamsResourceProjectsAgentKnowledgebasesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def patch(
    params: ParamsResourceProjectsAgentKnowledgebasesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2KnowledgeBase]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentKnowledgebasesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2KnowledgeBase],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2KnowledgeBase]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentKnowledgebasesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.native
  def patch(
    params: ParamsResourceProjectsAgentKnowledgebasesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2KnowledgeBase]
  ): Unit = js.native
  /**
    * Updates the specified knowledge base.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.knowledgeBases.patch({
    *     // The knowledge base resource name. The name must be empty when creating a knowledge base. Format: `projects//locations//knowledgeBases/`.
    *     name: 'projects/my-project/agent/knowledgeBases/my-knowledgeBase',
    *     // Optional. Not specified means `update all`. Currently, only `display_name` can be updated, an InvalidArgument will be returned for attempting to update other fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "languageCode": "my_languageCode",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "languageCode": "my_languageCode",
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
  def patch(params: ParamsResourceProjectsAgentKnowledgebasesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAgentKnowledgebasesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
