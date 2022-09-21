package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Orderreturns$Labels")
@js.native
open class ResourceOrderreturnsLabels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaReturnShippingLabel] = js.native
  def create(callback: BodyResponseCallback[SchemaReturnShippingLabel]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnShippingLabel] = js.native
  def create(params: ParamsResourceOrderreturnsLabelsCreate): GaxiosPromise[SchemaReturnShippingLabel] = js.native
  def create(
    params: ParamsResourceOrderreturnsLabelsCreate,
    callback: BodyResponseCallback[SchemaReturnShippingLabel]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrderreturnsLabelsCreate,
    options: BodyResponseCallback[Readable | SchemaReturnShippingLabel],
    callback: BodyResponseCallback[Readable | SchemaReturnShippingLabel]
  ): Unit = js.native
  def create(params: ParamsResourceOrderreturnsLabelsCreate, options: MethodOptions): GaxiosPromise[SchemaReturnShippingLabel] = js.native
  def create(
    params: ParamsResourceOrderreturnsLabelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnShippingLabel]
  ): Unit = js.native
  /**
    * Links a return shipping label to a return id. You can only create one return label per return id. Since the label is sent to the buyer, the linked return label cannot be updated or deleted. If you try to create multiple return shipping labels for a single return id, every create request except the first will fail.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.orderreturns.labels.create({
    *     // Required. The merchant the Return Shipping Label belongs to.
    *     merchantId: 'placeholder-value',
    *     // Required. Provide the Google-generated merchant order return ID.
    *     returnId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "carrier": "my_carrier",
    *       //   "labelUri": "my_labelUri",
    *       //   "trackingId": "my_trackingId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "carrier": "my_carrier",
    *   //   "labelUri": "my_labelUri",
    *   //   "trackingId": "my_trackingId"
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
  def create(params: ParamsResourceOrderreturnsLabelsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrderreturnsLabelsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
