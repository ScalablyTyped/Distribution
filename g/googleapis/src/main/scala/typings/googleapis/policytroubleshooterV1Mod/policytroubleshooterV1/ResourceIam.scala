package typings.googleapis.policytroubleshooterV1Mod.policytroubleshooterV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/policytroubleshooter/v1", "policytroubleshooter_v1.Resource$Iam")
@js.native
open class ResourceIam protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def troubleshoot(): GaxiosPromise[SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse] = js.native
  def troubleshoot(
    callback: BodyResponseCallback[SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse]
  ): Unit = js.native
  def troubleshoot(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse] = js.native
  def troubleshoot(params: ParamsResourceIamTroubleshoot): GaxiosPromise[SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse] = js.native
  def troubleshoot(
    params: ParamsResourceIamTroubleshoot,
    callback: BodyResponseCallback[SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse]
  ): Unit = js.native
  def troubleshoot(
    params: ParamsResourceIamTroubleshoot,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse]
  ): Unit = js.native
  def troubleshoot(params: ParamsResourceIamTroubleshoot, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse] = js.native
  def troubleshoot(
    params: ParamsResourceIamTroubleshoot,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse]
  ): Unit = js.native
  /**
    * Checks whether a principal has a specific permission for a specific resource, and explains why the principal does or does not have that permission.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/policytroubleshooter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const policytroubleshooter = google.policytroubleshooter('v1');
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
    *   const res = await policytroubleshooter.iam.troubleshoot({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessTuple": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access": "my_access",
    *   //   "errors": [],
    *   //   "explainedPolicies": []
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
  def troubleshoot(params: ParamsResourceIamTroubleshoot, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def troubleshoot(
    params: ParamsResourceIamTroubleshoot,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
