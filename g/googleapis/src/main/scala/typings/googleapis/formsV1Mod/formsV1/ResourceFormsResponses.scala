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

@JSImport("googleapis/build/src/apis/forms/v1", "forms_v1.Resource$Forms$Responses")
@js.native
open class ResourceFormsResponses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaFormResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaFormResponse]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFormResponse] = js.native
  def get(params: ParamsResourceFormsResponsesGet): GaxiosPromise[SchemaFormResponse] = js.native
  def get(params: ParamsResourceFormsResponsesGet, callback: BodyResponseCallback[SchemaFormResponse]): Unit = js.native
  def get(
    params: ParamsResourceFormsResponsesGet,
    options: BodyResponseCallback[Readable | SchemaFormResponse],
    callback: BodyResponseCallback[Readable | SchemaFormResponse]
  ): Unit = js.native
  def get(params: ParamsResourceFormsResponsesGet, options: MethodOptions): GaxiosPromise[SchemaFormResponse] = js.native
  def get(
    params: ParamsResourceFormsResponsesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFormResponse]
  ): Unit = js.native
  /**
    * Get one response from the form.
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
    *       'https://www.googleapis.com/auth/forms.responses.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await forms.forms.responses.get({
    *     // Required. The form ID.
    *     formId: 'placeholder-value',
    *     // Required. The response ID within the form.
    *     responseId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "answers": {},
    *   //   "createTime": "my_createTime",
    *   //   "formId": "my_formId",
    *   //   "lastSubmittedTime": "my_lastSubmittedTime",
    *   //   "respondentEmail": "my_respondentEmail",
    *   //   "responseId": "my_responseId",
    *   //   "totalScore": {}
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
  def get(params: ParamsResourceFormsResponsesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFormsResponsesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFormResponsesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFormResponsesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFormResponsesResponse] = js.native
  def list(params: ParamsResourceFormsResponsesList): GaxiosPromise[SchemaListFormResponsesResponse] = js.native
  def list(
    params: ParamsResourceFormsResponsesList,
    callback: BodyResponseCallback[SchemaListFormResponsesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFormsResponsesList,
    options: BodyResponseCallback[Readable | SchemaListFormResponsesResponse],
    callback: BodyResponseCallback[Readable | SchemaListFormResponsesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFormsResponsesList, options: MethodOptions): GaxiosPromise[SchemaListFormResponsesResponse] = js.native
  def list(
    params: ParamsResourceFormsResponsesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFormResponsesResponse]
  ): Unit = js.native
  /**
    * List a form's responses.
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
    *       'https://www.googleapis.com/auth/forms.responses.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await forms.forms.responses.list({
    *     // Which form responses to return. Currently, the only supported filters are: * timestamp \> *N* which means to get all form responses submitted after (but not at) timestamp *N*. * timestamp \>= *N* which means to get all form responses submitted at and after timestamp *N*. For both supported filters, timestamp must be formatted in RFC3339 UTC "Zulu" format. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
    *     filter: 'placeholder-value',
    *     // Required. ID of the Form whose responses to list.
    *     formId: 'placeholder-value',
    *     // The maximum number of responses to return. The service may return fewer than this value. If unspecified or zero, at most 5000 responses are returned.
    *     pageSize: 'placeholder-value',
    *     // A page token returned by a previous list response. If this field is set, the form and the values of the filter must be the same as for the original request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "responses": []
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
  def list(params: ParamsResourceFormsResponsesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFormsResponsesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
