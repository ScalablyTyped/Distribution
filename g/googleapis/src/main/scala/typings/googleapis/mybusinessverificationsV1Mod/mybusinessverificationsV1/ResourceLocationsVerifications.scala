package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessverifications/v1", "mybusinessverifications_v1.Resource$Locations$Verifications")
@js.native
open class ResourceLocationsVerifications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def complete(): GaxiosPromise[SchemaCompleteVerificationResponse] = js.native
  def complete(callback: BodyResponseCallback[SchemaCompleteVerificationResponse]): Unit = js.native
  def complete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCompleteVerificationResponse] = js.native
  def complete(params: ParamsResourceLocationsVerificationsComplete): GaxiosPromise[SchemaCompleteVerificationResponse] = js.native
  def complete(
    params: ParamsResourceLocationsVerificationsComplete,
    callback: BodyResponseCallback[SchemaCompleteVerificationResponse]
  ): Unit = js.native
  def complete(
    params: ParamsResourceLocationsVerificationsComplete,
    options: BodyResponseCallback[Readable | SchemaCompleteVerificationResponse],
    callback: BodyResponseCallback[Readable | SchemaCompleteVerificationResponse]
  ): Unit = js.native
  def complete(params: ParamsResourceLocationsVerificationsComplete, options: MethodOptions): GaxiosPromise[SchemaCompleteVerificationResponse] = js.native
  def complete(
    params: ParamsResourceLocationsVerificationsComplete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompleteVerificationResponse]
  ): Unit = js.native
  /**
    * Completes a `PENDING` verification. It is only necessary for non `AUTO` verification methods. `AUTO` verification request is instantly `VERIFIED` upon creation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessverifications.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessverifications = google.mybusinessverifications('v1');
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
    *   const res = await mybusinessverifications.locations.verifications.complete({
    *     // Required. Resource name of the verification to complete.
    *     name: 'locations/my-location/verifications/my-verification',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "pin": "my_pin"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "verification": {}
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
  def complete(params: ParamsResourceLocationsVerificationsComplete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def complete(
    params: ParamsResourceLocationsVerificationsComplete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListVerificationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVerificationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVerificationsResponse] = js.native
  def list(params: ParamsResourceLocationsVerificationsList): GaxiosPromise[SchemaListVerificationsResponse] = js.native
  def list(
    params: ParamsResourceLocationsVerificationsList,
    callback: BodyResponseCallback[SchemaListVerificationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLocationsVerificationsList,
    options: BodyResponseCallback[Readable | SchemaListVerificationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListVerificationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLocationsVerificationsList, options: MethodOptions): GaxiosPromise[SchemaListVerificationsResponse] = js.native
  def list(
    params: ParamsResourceLocationsVerificationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVerificationsResponse]
  ): Unit = js.native
  /**
    * List verifications of a location, ordered by create time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessverifications.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessverifications = google.mybusinessverifications('v1');
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
    *   const res = await mybusinessverifications.locations.verifications.list({
    *     // How many verification to include per page. Minimum is 1, and the default and maximum page size is 100.
    *     pageSize: 'placeholder-value',
    *     // If specified, returns the next page of verifications.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the location that verification requests belong to.
    *     parent: 'locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "verifications": []
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
  def list(params: ParamsResourceLocationsVerificationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLocationsVerificationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
