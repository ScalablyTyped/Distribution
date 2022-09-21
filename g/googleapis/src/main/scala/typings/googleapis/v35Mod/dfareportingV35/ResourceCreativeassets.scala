package typings.googleapis.v35Mod.dfareportingV35

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Creativeassets")
@js.native
open class ResourceCreativeassets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def insert(): GaxiosPromise[SchemaCreativeAssetMetadata] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreativeAssetMetadata]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeAssetMetadata] = js.native
  def insert(params: ParamsResourceCreativeassetsInsert): GaxiosPromise[SchemaCreativeAssetMetadata] = js.native
  def insert(
    params: ParamsResourceCreativeassetsInsert,
    callback: BodyResponseCallback[SchemaCreativeAssetMetadata]
  ): Unit = js.native
  def insert(
    params: ParamsResourceCreativeassetsInsert,
    options: BodyResponseCallback[Readable | SchemaCreativeAssetMetadata],
    callback: BodyResponseCallback[Readable | SchemaCreativeAssetMetadata]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativeassetsInsert, options: MethodOptions): GaxiosPromise[SchemaCreativeAssetMetadata] = js.native
  def insert(
    params: ParamsResourceCreativeassetsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeAssetMetadata]
  ): Unit = js.native
  /**
    * Inserts a new creative asset.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.creativeAssets.insert({
    *     // Advertiser ID of this creative. This is a required field.
    *     advertiserId: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "assetIdentifier": {},
    *       //   "clickTags": [],
    *       //   "counterCustomEvents": [],
    *       //   "detectedFeatures": [],
    *       //   "exitCustomEvents": [],
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "richMedia": false,
    *       //   "timerCustomEvents": [],
    *       //   "warnedValidationRules": []
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assetIdentifier": {},
    *   //   "clickTags": [],
    *   //   "counterCustomEvents": [],
    *   //   "detectedFeatures": [],
    *   //   "exitCustomEvents": [],
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "richMedia": false,
    *   //   "timerCustomEvents": [],
    *   //   "warnedValidationRules": []
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
  def insert(params: ParamsResourceCreativeassetsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCreativeassetsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
