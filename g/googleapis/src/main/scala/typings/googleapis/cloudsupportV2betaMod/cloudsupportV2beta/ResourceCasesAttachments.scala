package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsupport/v2beta", "cloudsupport_v2beta.Resource$Cases$Attachments")
@js.native
open class ResourceCasesAttachments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListAttachmentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAttachmentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAttachmentsResponse] = js.native
  def list(params: ParamsResourceCasesAttachmentsList): GaxiosPromise[SchemaListAttachmentsResponse] = js.native
  def list(
    params: ParamsResourceCasesAttachmentsList,
    callback: BodyResponseCallback[SchemaListAttachmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCasesAttachmentsList,
    options: BodyResponseCallback[Readable | SchemaListAttachmentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAttachmentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCasesAttachmentsList, options: MethodOptions): GaxiosPromise[SchemaListAttachmentsResponse] = js.native
  def list(
    params: ParamsResourceCasesAttachmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAttachmentsResponse]
  ): Unit = js.native
  /**
    * Retrieve all attachments associated with a support case.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsupport.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsupport = google.cloudsupport('v2beta');
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
    *   const res = await cloudsupport.cases.attachments.list({
    *     // The maximum number of attachments fetched with each request. If not provided, the default is 10. The maximum page size that will be returned is 100.
    *     pageSize: 'placeholder-value',
    *     // A token identifying the page of results to return. If unspecified, the first page is retrieved.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of Case object for which attachments should be listed.
    *     parent: '[^/]+/[^/]+/cases/my-case',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attachments": [],
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
  def list(params: ParamsResourceCasesAttachmentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCasesAttachmentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
