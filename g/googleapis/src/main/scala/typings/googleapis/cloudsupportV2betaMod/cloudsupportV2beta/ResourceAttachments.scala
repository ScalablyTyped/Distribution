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

@JSImport("googleapis/build/src/apis/cloudsupport/v2beta", "cloudsupport_v2beta.Resource$Attachments")
@js.native
open class ResourceAttachments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAttachment] = js.native
  def create(callback: BodyResponseCallback[SchemaAttachment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttachment] = js.native
  def create(params: ParamsResourceAttachmentsCreate): GaxiosPromise[SchemaAttachment] = js.native
  def create(params: ParamsResourceAttachmentsCreate, callback: BodyResponseCallback[SchemaAttachment]): Unit = js.native
  def create(
    params: ParamsResourceAttachmentsCreate,
    options: BodyResponseCallback[Readable | SchemaAttachment],
    callback: BodyResponseCallback[Readable | SchemaAttachment]
  ): Unit = js.native
  def create(params: ParamsResourceAttachmentsCreate, options: MethodOptions): GaxiosPromise[SchemaAttachment] = js.native
  def create(
    params: ParamsResourceAttachmentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttachment]
  ): Unit = js.native
  /**
    * Create a file attachment on a case or Cloud resource.
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
    *   const res = await cloudsupport.attachments.create({
    *     // Required. The resource name of the case to which attachment should be attached.
    *     parent: '[^/]+/[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attachment": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "filename": "my_filename",
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "sizeBytes": "my_sizeBytes"
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
  def create(params: ParamsResourceAttachmentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAttachmentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
