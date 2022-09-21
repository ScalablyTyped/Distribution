package typings.googleapis.testingV1Mod.testingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/testing/v1", "testing_v1.Resource$Applicationdetailservice")
@js.native
open class ResourceApplicationdetailservice protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getApkDetails(): GaxiosPromise[SchemaGetApkDetailsResponse] = js.native
  def getApkDetails(callback: BodyResponseCallback[SchemaGetApkDetailsResponse]): Unit = js.native
  def getApkDetails(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetApkDetailsResponse] = js.native
  def getApkDetails(params: ParamsResourceApplicationdetailserviceGetapkdetails): GaxiosPromise[SchemaGetApkDetailsResponse] = js.native
  def getApkDetails(
    params: ParamsResourceApplicationdetailserviceGetapkdetails,
    callback: BodyResponseCallback[SchemaGetApkDetailsResponse]
  ): Unit = js.native
  def getApkDetails(
    params: ParamsResourceApplicationdetailserviceGetapkdetails,
    options: BodyResponseCallback[Readable | SchemaGetApkDetailsResponse],
    callback: BodyResponseCallback[Readable | SchemaGetApkDetailsResponse]
  ): Unit = js.native
  def getApkDetails(params: ParamsResourceApplicationdetailserviceGetapkdetails, options: MethodOptions): GaxiosPromise[SchemaGetApkDetailsResponse] = js.native
  def getApkDetails(
    params: ParamsResourceApplicationdetailserviceGetapkdetails,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetApkDetailsResponse]
  ): Unit = js.native
  /**
    * Gets the details of an Android application APK.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/testing.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const testing = google.testing('v1');
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
    *   const res = await testing.applicationDetailService.getApkDetails({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "gcsPath": "my_gcsPath"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apkDetail": {}
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
  def getApkDetails(params: ParamsResourceApplicationdetailserviceGetapkdetails, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getApkDetails(
    params: ParamsResourceApplicationdetailserviceGetapkdetails,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
