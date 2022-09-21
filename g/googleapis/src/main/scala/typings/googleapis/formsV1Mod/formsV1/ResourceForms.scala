package typings.googleapis.formsV1Mod.formsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/forms/v1", "forms_v1.Resource$Forms")
@js.native
open class ResourceForms protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdateFormResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdateFormResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateFormResponse] = js.native
  def batchUpdate(params: ParamsResourceFormsBatchupdate): GaxiosPromise[SchemaBatchUpdateFormResponse] = js.native
  def batchUpdate(
    params: ParamsResourceFormsBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdateFormResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceFormsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaBatchUpdateFormResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdateFormResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceFormsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateFormResponse] = js.native
  def batchUpdate(
    params: ParamsResourceFormsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateFormResponse]
  ): Unit = js.native
  /**
    * Change the form with a batch of updates.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/forms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const forms = google.forms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/forms.body',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await forms.forms.batchUpdate({
    *     // Required. The form ID.
    *     formId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "includeFormInResponse": false,
    *       //   "requests": [],
    *       //   "writeControl": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "form": {},
    *   //   "replies": [],
    *   //   "writeControl": {}
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
  def batchUpdate(params: ParamsResourceFormsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceFormsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaForm] = js.native
  def create(callback: BodyResponseCallback[SchemaForm]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaForm] = js.native
  def create(params: ParamsResourceFormsCreate): GaxiosPromise[SchemaForm] = js.native
  def create(params: ParamsResourceFormsCreate, callback: BodyResponseCallback[SchemaForm]): Unit = js.native
  def create(
    params: ParamsResourceFormsCreate,
    options: BodyResponseCallback[Readable | SchemaForm],
    callback: BodyResponseCallback[Readable | SchemaForm]
  ): Unit = js.native
  def create(params: ParamsResourceFormsCreate, options: MethodOptions): GaxiosPromise[SchemaForm] = js.native
  def create(
    params: ParamsResourceFormsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaForm]
  ): Unit = js.native
  /**
    * Create a new form using the title given in the provided form message in the request. *Important:* Only the form.info.title and form.info.document_title fields are copied to the new form. All other fields including the form description, items and settings are disallowed. To create a new form and add items, you must first call forms.create to create an empty form with a title and (optional) document title, and then call forms.update to add the items.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/forms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const forms = google.forms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/forms.body',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await forms.forms.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "formId": "my_formId",
    *       //   "info": {},
    *       //   "items": [],
    *       //   "linkedSheetId": "my_linkedSheetId",
    *       //   "responderUri": "my_responderUri",
    *       //   "revisionId": "my_revisionId",
    *       //   "settings": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "formId": "my_formId",
    *   //   "info": {},
    *   //   "items": [],
    *   //   "linkedSheetId": "my_linkedSheetId",
    *   //   "responderUri": "my_responderUri",
    *   //   "revisionId": "my_revisionId",
    *   //   "settings": {}
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
  def create(params: ParamsResourceFormsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceFormsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaForm] = js.native
  def get(callback: BodyResponseCallback[SchemaForm]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaForm] = js.native
  def get(params: ParamsResourceFormsGet): GaxiosPromise[SchemaForm] = js.native
  def get(params: ParamsResourceFormsGet, callback: BodyResponseCallback[SchemaForm]): Unit = js.native
  def get(
    params: ParamsResourceFormsGet,
    options: BodyResponseCallback[Readable | SchemaForm],
    callback: BodyResponseCallback[Readable | SchemaForm]
  ): Unit = js.native
  def get(params: ParamsResourceFormsGet, options: MethodOptions): GaxiosPromise[SchemaForm] = js.native
  def get(params: ParamsResourceFormsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaForm]): Unit = js.native
  /**
    * Get a form.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/forms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const forms = google.forms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/forms.body',
    *       'https://www.googleapis.com/auth/forms.body.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await forms.forms.get({
    *     // Required. The form ID.
    *     formId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "formId": "my_formId",
    *   //   "info": {},
    *   //   "items": [],
    *   //   "linkedSheetId": "my_linkedSheetId",
    *   //   "responderUri": "my_responderUri",
    *   //   "revisionId": "my_revisionId",
    *   //   "settings": {}
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
  def get(params: ParamsResourceFormsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFormsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var responses: ResourceFormsResponses = js.native
  
  var watches: ResourceFormsWatches = js.native
}
