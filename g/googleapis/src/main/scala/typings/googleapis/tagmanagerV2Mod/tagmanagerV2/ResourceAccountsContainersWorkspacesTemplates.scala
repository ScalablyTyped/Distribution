package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Templates")
@js.native
open class ResourceAccountsContainersWorkspacesTemplates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCustomTemplate] = js.native
  def create(callback: BodyResponseCallback[SchemaCustomTemplate]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomTemplate] = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesTemplatesCreate): GaxiosPromise[SchemaCustomTemplate] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesCreate,
    callback: BodyResponseCallback[SchemaCustomTemplate]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesCreate,
    options: BodyResponseCallback[Readable | SchemaCustomTemplate],
    callback: BodyResponseCallback[Readable | SchemaCustomTemplate]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersWorkspacesTemplatesCreate, options: MethodOptions): GaxiosPromise[SchemaCustomTemplate] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomTemplate]
  ): Unit = js.native
  /**
    * Creates a GTM Custom Template.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.edit.containers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.templates.create({
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     parent:
    *       'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "galleryReference": {},
    *       //   "name": "my_name",
    *       //   "path": "my_path",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "templateData": "my_templateData",
    *       //   "templateId": "my_templateId",
    *       //   "workspaceId": "my_workspaceId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "galleryReference": {},
    *   //   "name": "my_name",
    *   //   "path": "my_path",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "templateData": "my_templateData",
    *   //   "templateId": "my_templateId",
    *   //   "workspaceId": "my_workspaceId"
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
  def create(params: ParamsResourceAccountsContainersWorkspacesTemplatesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTemplatesDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersWorkspacesTemplatesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a GTM Template.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.edit.containers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.templates.delete({
    *     // GTM Custom Template's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/templates/{template_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/templates/my-template',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceAccountsContainersWorkspacesTemplatesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCustomTemplate] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomTemplate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomTemplate] = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesTemplatesGet): GaxiosPromise[SchemaCustomTemplate] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesGet,
    callback: BodyResponseCallback[SchemaCustomTemplate]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesGet,
    options: BodyResponseCallback[Readable | SchemaCustomTemplate],
    callback: BodyResponseCallback[Readable | SchemaCustomTemplate]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersWorkspacesTemplatesGet, options: MethodOptions): GaxiosPromise[SchemaCustomTemplate] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomTemplate]
  ): Unit = js.native
  /**
    * Gets a GTM Template.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/tagmanager.edit.containers',
    *       'https://www.googleapis.com/auth/tagmanager.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.templates.get({
    *     // GTM Custom Template's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/templates/{template_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/templates/my-template',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "galleryReference": {},
    *   //   "name": "my_name",
    *   //   "path": "my_path",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "templateData": "my_templateData",
    *   //   "templateId": "my_templateId",
    *   //   "workspaceId": "my_workspaceId"
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
  def get(params: ParamsResourceAccountsContainersWorkspacesTemplatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTemplatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTemplatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTemplatesResponse] = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesTemplatesList): GaxiosPromise[SchemaListTemplatesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesList,
    callback: BodyResponseCallback[SchemaListTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesList,
    options: BodyResponseCallback[Readable | SchemaListTemplatesResponse],
    callback: BodyResponseCallback[Readable | SchemaListTemplatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersWorkspacesTemplatesList, options: MethodOptions): GaxiosPromise[SchemaListTemplatesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTemplatesResponse]
  ): Unit = js.native
  /**
    * Lists all GTM Templates of a GTM container workspace.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/tagmanager.edit.containers',
    *       'https://www.googleapis.com/auth/tagmanager.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.templates.list({
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *     // GTM Workspace's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    *     parent:
    *       'accounts/my-account/containers/my-container/workspaces/my-workspace',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "template": []
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
  def list(params: ParamsResourceAccountsContainersWorkspacesTemplatesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaRevertTemplateResponse] = js.native
  def revert(callback: BodyResponseCallback[SchemaRevertTemplateResponse]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevertTemplateResponse] = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesTemplatesRevert): GaxiosPromise[SchemaRevertTemplateResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesRevert,
    callback: BodyResponseCallback[SchemaRevertTemplateResponse]
  ): Unit = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesRevert,
    options: BodyResponseCallback[Readable | SchemaRevertTemplateResponse],
    callback: BodyResponseCallback[Readable | SchemaRevertTemplateResponse]
  ): Unit = js.native
  def revert(params: ParamsResourceAccountsContainersWorkspacesTemplatesRevert, options: MethodOptions): GaxiosPromise[SchemaRevertTemplateResponse] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevertTemplateResponse]
  ): Unit = js.native
  /**
    * Reverts changes to a GTM Template in a GTM Workspace.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.edit.containers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.templates.revert({
    *     // When provided, this fingerprint must match the fingerprint of the template in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Custom Template's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/templates/{template_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/templates/my-template',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "template": {}
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
  def revert(params: ParamsResourceAccountsContainersWorkspacesTemplatesRevert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCustomTemplate] = js.native
  def update(callback: BodyResponseCallback[SchemaCustomTemplate]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomTemplate] = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesTemplatesUpdate): GaxiosPromise[SchemaCustomTemplate] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesUpdate,
    callback: BodyResponseCallback[SchemaCustomTemplate]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesUpdate,
    options: BodyResponseCallback[Readable | SchemaCustomTemplate],
    callback: BodyResponseCallback[Readable | SchemaCustomTemplate]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersWorkspacesTemplatesUpdate, options: MethodOptions): GaxiosPromise[SchemaCustomTemplate] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomTemplate]
  ): Unit = js.native
  /**
    * Updates a GTM Template.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.edit.containers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.containers.workspaces.templates.update({
    *     // When provided, this fingerprint must match the fingerprint of the templates in storage.
    *     fingerprint: 'placeholder-value',
    *     // GTM Custom Template's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/templates/{template_id\}
    *     path: 'accounts/my-account/containers/my-container/workspaces/my-workspace/templates/my-template',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "containerId": "my_containerId",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "galleryReference": {},
    *       //   "name": "my_name",
    *       //   "path": "my_path",
    *       //   "tagManagerUrl": "my_tagManagerUrl",
    *       //   "templateData": "my_templateData",
    *       //   "templateId": "my_templateId",
    *       //   "workspaceId": "my_workspaceId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "containerId": "my_containerId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "galleryReference": {},
    *   //   "name": "my_name",
    *   //   "path": "my_path",
    *   //   "tagManagerUrl": "my_tagManagerUrl",
    *   //   "templateData": "my_templateData",
    *   //   "templateId": "my_templateId",
    *   //   "workspaceId": "my_workspaceId"
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
  def update(params: ParamsResourceAccountsContainersWorkspacesTemplatesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersWorkspacesTemplatesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
