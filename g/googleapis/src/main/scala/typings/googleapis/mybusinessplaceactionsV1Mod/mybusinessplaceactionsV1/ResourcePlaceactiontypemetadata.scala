package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessplaceactions/v1", "mybusinessplaceactions_v1.Resource$Placeactiontypemetadata")
@js.native
open class ResourcePlaceactiontypemetadata protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListPlaceActionTypeMetadataResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPlaceActionTypeMetadataResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPlaceActionTypeMetadataResponse] = js.native
  def list(params: ParamsResourcePlaceactiontypemetadataList): GaxiosPromise[SchemaListPlaceActionTypeMetadataResponse] = js.native
  def list(
    params: ParamsResourcePlaceactiontypemetadataList,
    callback: BodyResponseCallback[SchemaListPlaceActionTypeMetadataResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePlaceactiontypemetadataList,
    options: BodyResponseCallback[Readable | SchemaListPlaceActionTypeMetadataResponse],
    callback: BodyResponseCallback[Readable | SchemaListPlaceActionTypeMetadataResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlaceactiontypemetadataList, options: MethodOptions): GaxiosPromise[SchemaListPlaceActionTypeMetadataResponse] = js.native
  def list(
    params: ParamsResourcePlaceactiontypemetadataList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPlaceActionTypeMetadataResponse]
  ): Unit = js.native
  /**
    * Returns the list of available place action types for a location or country.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessplaceactions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessplaceactions = google.mybusinessplaceactions('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessplaceactions.placeActionTypeMetadata.list({
    *     // Optional. A filter constraining the place action types to return metadata for. The response includes entries that match the filter. We support only the following filters: 1. location=XYZ where XYZ is a string indicating the resource name of a location, in the format `locations/{location_id\}`. 2. region_code=XYZ where XYZ is a Unicode CLDR region code to find available action types. If no filter is provided, all place action types are returned.
    *     filter: 'placeholder-value',
    *     // Optional. The IETF BCP-47 code of language to get display names in. If this language is not available, they will be provided in English.
    *     languageCode: 'placeholder-value',
    *     // Optional. How many action types to include per page. Default is 10, minimum is 1.
    *     pageSize: 'placeholder-value',
    *     // Optional. If specified, the next page of place action type metadata is retrieved. The `pageToken` is returned when a call to `placeActionTypeMetadata.list` returns more results than can fit into the requested page size.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "placeActionTypeMetadata": []
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
  def list(params: ParamsResourcePlaceactiontypemetadataList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePlaceactiontypemetadataList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
