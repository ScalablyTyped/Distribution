package typings.googleapis.iamV1Mod.iamV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Permissions")
@js.native
open class ResourcePermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def queryTestablePermissions(): GaxiosPromise[SchemaQueryTestablePermissionsResponse] = js.native
  def queryTestablePermissions(callback: BodyResponseCallback[SchemaQueryTestablePermissionsResponse]): Unit = js.native
  def queryTestablePermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQueryTestablePermissionsResponse] = js.native
  def queryTestablePermissions(params: ParamsResourcePermissionsQuerytestablepermissions): GaxiosPromise[SchemaQueryTestablePermissionsResponse] = js.native
  def queryTestablePermissions(
    params: ParamsResourcePermissionsQuerytestablepermissions,
    callback: BodyResponseCallback[SchemaQueryTestablePermissionsResponse]
  ): Unit = js.native
  def queryTestablePermissions(
    params: ParamsResourcePermissionsQuerytestablepermissions,
    options: BodyResponseCallback[Readable | SchemaQueryTestablePermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaQueryTestablePermissionsResponse]
  ): Unit = js.native
  def queryTestablePermissions(params: ParamsResourcePermissionsQuerytestablepermissions, options: MethodOptions): GaxiosPromise[SchemaQueryTestablePermissionsResponse] = js.native
  def queryTestablePermissions(
    params: ParamsResourcePermissionsQuerytestablepermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryTestablePermissionsResponse]
  ): Unit = js.native
  /**
    * Lists every permission that you can test on a resource. A permission is testable if you can check whether a principal has that permission on the resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.permissions.queryTestablePermissions({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "fullResourceName": "my_fullResourceName",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "permissions": []
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
  def queryTestablePermissions(params: ParamsResourcePermissionsQuerytestablepermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def queryTestablePermissions(
    params: ParamsResourcePermissionsQuerytestablepermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
