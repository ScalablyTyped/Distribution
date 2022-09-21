package typings.googleapis.essentialcontactsV1Mod.essentialcontactsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/essentialcontacts/v1", "essentialcontacts_v1.Resource$Folders$Contacts")
@js.native
open class ResourceFoldersContacts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def compute(): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse] = js.native
  def compute(callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse]): Unit = js.native
  def compute(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse] = js.native
  def compute(params: ParamsResourceFoldersContactsCompute): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse] = js.native
  def compute(
    params: ParamsResourceFoldersContactsCompute,
    callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse]
  ): Unit = js.native
  def compute(
    params: ParamsResourceFoldersContactsCompute,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse]
  ): Unit = js.native
  def compute(params: ParamsResourceFoldersContactsCompute, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse] = js.native
  def compute(
    params: ParamsResourceFoldersContactsCompute,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse]
  ): Unit = js.native
  /**
    * Lists all contacts for the resource that are subscribed to the specified notification categories, including contacts inherited from any parent resources.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/essentialcontacts.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const essentialcontacts = google.essentialcontacts('v1');
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
    *   const res = await essentialcontacts.folders.contacts.compute({
    *     // The categories of notifications to compute contacts for. If ALL is included in this list, contacts subscribed to any notification category will be returned.
    *     notificationCategories: 'placeholder-value',
    *     // Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available. If not specified, the default page_size is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, retrieves the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of other method parameters should be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the resource to compute contacts for. Format: organizations/{organization_id\}, folders/{folder_id\} or projects/{project_id\}
    *     parent: 'folders/my-folder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contacts": [],
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
  def compute(params: ParamsResourceFoldersContactsCompute, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def compute(
    params: ParamsResourceFoldersContactsCompute,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1Contact]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def create(params: ParamsResourceFoldersContactsCreate): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def create(
    params: ParamsResourceFoldersContactsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1Contact]
  ): Unit = js.native
  def create(
    params: ParamsResourceFoldersContactsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudEssentialcontactsV1Contact],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudEssentialcontactsV1Contact]
  ): Unit = js.native
  def create(params: ParamsResourceFoldersContactsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def create(
    params: ParamsResourceFoldersContactsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1Contact]
  ): Unit = js.native
  /**
    * Adds a new contact for a resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/essentialcontacts.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const essentialcontacts = google.essentialcontacts('v1');
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
    *   const res = await essentialcontacts.folders.contacts.create({
    *     // Required. The resource to save this contact for. Format: organizations/{organization_id\}, folders/{folder_id\} or projects/{project_id\}
    *     parent: 'folders/my-folder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "email": "my_email",
    *       //   "languageTag": "my_languageTag",
    *       //   "name": "my_name",
    *       //   "notificationCategorySubscriptions": [],
    *       //   "validateTime": "my_validateTime",
    *       //   "validationState": "my_validationState"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email": "my_email",
    *   //   "languageTag": "my_languageTag",
    *   //   "name": "my_name",
    *   //   "notificationCategorySubscriptions": [],
    *   //   "validateTime": "my_validateTime",
    *   //   "validationState": "my_validationState"
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
  def create(params: ParamsResourceFoldersContactsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceFoldersContactsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceFoldersContactsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceFoldersContactsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceFoldersContactsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceFoldersContactsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceFoldersContactsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a contact.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/essentialcontacts.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const essentialcontacts = google.essentialcontacts('v1');
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
    *   const res = await essentialcontacts.folders.contacts.delete({
    *     // Required. The name of the contact to delete. Format: organizations/{organization_id\}/contacts/{contact_id\}, folders/{folder_id\}/contacts/{contact_id\} or projects/{project_id\}/contacts/{contact_id\}
    *     name: 'folders/my-folder/contacts/my-contact',
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
  def delete(params: ParamsResourceFoldersContactsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceFoldersContactsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1Contact]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def get(params: ParamsResourceFoldersContactsGet): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def get(
    params: ParamsResourceFoldersContactsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1Contact]
  ): Unit = js.native
  def get(
    params: ParamsResourceFoldersContactsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudEssentialcontactsV1Contact],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudEssentialcontactsV1Contact]
  ): Unit = js.native
  def get(params: ParamsResourceFoldersContactsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def get(
    params: ParamsResourceFoldersContactsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1Contact]
  ): Unit = js.native
  /**
    * Gets a single contact.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/essentialcontacts.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const essentialcontacts = google.essentialcontacts('v1');
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
    *   const res = await essentialcontacts.folders.contacts.get({
    *     // Required. The name of the contact to retrieve. Format: organizations/{organization_id\}/contacts/{contact_id\}, folders/{folder_id\}/contacts/{contact_id\} or projects/{project_id\}/contacts/{contact_id\}
    *     name: 'folders/my-folder/contacts/my-contact',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email": "my_email",
    *   //   "languageTag": "my_languageTag",
    *   //   "name": "my_name",
    *   //   "notificationCategorySubscriptions": [],
    *   //   "validateTime": "my_validateTime",
    *   //   "validationState": "my_validationState"
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
  def get(params: ParamsResourceFoldersContactsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFoldersContactsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1ListContactsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1ListContactsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1ListContactsResponse] = js.native
  def list(params: ParamsResourceFoldersContactsList): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1ListContactsResponse] = js.native
  def list(
    params: ParamsResourceFoldersContactsList,
    callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1ListContactsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFoldersContactsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudEssentialcontactsV1ListContactsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudEssentialcontactsV1ListContactsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFoldersContactsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1ListContactsResponse] = js.native
  def list(
    params: ParamsResourceFoldersContactsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1ListContactsResponse]
  ): Unit = js.native
  /**
    * Lists the contacts that have been set on a resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/essentialcontacts.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const essentialcontacts = google.essentialcontacts('v1');
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
    *   const res = await essentialcontacts.folders.contacts.list({
    *     // Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available. If not specified, the default page_size is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, retrieves the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of other method parameters should be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name. Format: organizations/{organization_id\}, folders/{folder_id\} or projects/{project_id\}
    *     parent: 'folders/my-folder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contacts": [],
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
  def list(params: ParamsResourceFoldersContactsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFoldersContactsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1Contact]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def patch(params: ParamsResourceFoldersContactsPatch): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def patch(
    params: ParamsResourceFoldersContactsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1Contact]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFoldersContactsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudEssentialcontactsV1Contact],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudEssentialcontactsV1Contact]
  ): Unit = js.native
  def patch(params: ParamsResourceFoldersContactsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudEssentialcontactsV1Contact] = js.native
  def patch(
    params: ParamsResourceFoldersContactsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudEssentialcontactsV1Contact]
  ): Unit = js.native
  /**
    * Updates a contact. Note: A contact's email address cannot be changed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/essentialcontacts.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const essentialcontacts = google.essentialcontacts('v1');
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
    *   const res = await essentialcontacts.folders.contacts.patch({
    *     // The identifier for the contact. Format: {resource_type\}/{resource_id\}/contacts/{contact_id\}
    *     name: 'folders/my-folder/contacts/my-contact',
    *     // Optional. The update mask applied to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "email": "my_email",
    *       //   "languageTag": "my_languageTag",
    *       //   "name": "my_name",
    *       //   "notificationCategorySubscriptions": [],
    *       //   "validateTime": "my_validateTime",
    *       //   "validationState": "my_validationState"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email": "my_email",
    *   //   "languageTag": "my_languageTag",
    *   //   "name": "my_name",
    *   //   "notificationCategorySubscriptions": [],
    *   //   "validateTime": "my_validateTime",
    *   //   "validationState": "my_validationState"
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
  def patch(params: ParamsResourceFoldersContactsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceFoldersContactsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def sendTestMessage(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def sendTestMessage(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def sendTestMessage(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def sendTestMessage(params: ParamsResourceFoldersContactsSendtestmessage): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def sendTestMessage(
    params: ParamsResourceFoldersContactsSendtestmessage,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def sendTestMessage(
    params: ParamsResourceFoldersContactsSendtestmessage,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def sendTestMessage(params: ParamsResourceFoldersContactsSendtestmessage, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def sendTestMessage(
    params: ParamsResourceFoldersContactsSendtestmessage,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Allows a contact admin to send a test message to contact to verify that it has been configured correctly.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/essentialcontacts.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const essentialcontacts = google.essentialcontacts('v1');
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
    *   const res = await essentialcontacts.folders.contacts.sendTestMessage({
    *     // Required. The name of the resource to send the test message for. All contacts must either be set directly on this resource or inherited from another resource that is an ancestor of this one. Format: organizations/{organization_id\}, folders/{folder_id\} or projects/{project_id\}
    *     resource: 'folders/my-folder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contacts": [],
    *       //   "notificationCategory": "my_notificationCategory"
    *       // }
    *     },
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
  def sendTestMessage(params: ParamsResourceFoldersContactsSendtestmessage, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def sendTestMessage(
    params: ParamsResourceFoldersContactsSendtestmessage,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
