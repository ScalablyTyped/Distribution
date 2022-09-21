package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebaseappcheck/v1", "firebaseappcheck_v1.Resource$Projects$Apps$Devicecheckconfig")
@js.native
open class ResourceProjectsAppsDevicecheckconfig protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGet(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse] = js.native
  def batchGet(params: ParamsResourceProjectsAppsDevicecheckconfigBatchget): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsDevicecheckconfigBatchget,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsDevicecheckconfigBatchget,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceProjectsAppsDevicecheckconfigBatchget, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsDevicecheckconfigBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse]
  ): Unit = js.native
  /**
    * Atomically gets the DeviceCheckConfigs for the specified list of apps. For security reasons, the `private_key` field is never populated in the response.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.deviceCheckConfig.batchGet({
    *     // Required. The relative resource names of the DeviceCheckConfigs to retrieve, in the format ``` projects/{project_number\}/apps/{app_id\}/deviceCheckConfig ``` A maximum of 100 objects can be retrieved in a batch.
    *     names: 'placeholder-value',
    *     // Required. The parent project name shared by all DeviceCheckConfigs being retrieved, in the format ``` projects/{project_number\} ``` The parent collection in the `name` field of any resource being retrieved must match this field, or the entire batch fails.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configs": []
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
  def batchGet(params: ParamsResourceProjectsAppsDevicecheckconfigBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceProjectsAppsDevicecheckconfigBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig] = js.native
  def get(params: ParamsResourceProjectsAppsDevicecheckconfigGet): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig] = js.native
  def get(
    params: ParamsResourceProjectsAppsDevicecheckconfigGet,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAppsDevicecheckconfigGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAppsDevicecheckconfigGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig] = js.native
  def get(
    params: ParamsResourceProjectsAppsDevicecheckconfigGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig]
  ): Unit = js.native
  /**
    * Gets the DeviceCheckConfig for the specified app. For security reasons, the `private_key` field is never populated in the response.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.deviceCheckConfig.get({
    *     // Required. The relative resource name of the DeviceCheckConfig, in the format: ``` projects/{project_number\}/apps/{app_id\}/deviceCheckConfig ```
    *     name: 'projects/my-project/apps/my-app/deviceCheckConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "keyId": "my_keyId",
    *   //   "name": "my_name",
    *   //   "privateKey": "my_privateKey",
    *   //   "privateKeySet": false,
    *   //   "tokenTtl": "my_tokenTtl"
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
  def get(params: ParamsResourceProjectsAppsDevicecheckconfigGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAppsDevicecheckconfigGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig] = js.native
  def patch(params: ParamsResourceProjectsAppsDevicecheckconfigPatch): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig] = js.native
  def patch(
    params: ParamsResourceProjectsAppsDevicecheckconfigPatch,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAppsDevicecheckconfigPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAppsDevicecheckconfigPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig] = js.native
  def patch(
    params: ParamsResourceProjectsAppsDevicecheckconfigPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig]
  ): Unit = js.native
  /**
    * Updates the DeviceCheckConfig for the specified app. While this configuration is incomplete or invalid, the app will be unable to exchange DeviceCheck tokens for App Check tokens. For security reasons, the `private_key` field is never populated in the response.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.apps.deviceCheckConfig.patch({
    *     // Required. The relative resource name of the DeviceCheck configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/deviceCheckConfig ```
    *     name: 'projects/my-project/apps/my-app/deviceCheckConfig',
    *     // Required. A comma-separated list of names of fields in the DeviceCheckConfig Gets to update. Example: `key_id,private_key`.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "keyId": "my_keyId",
    *       //   "name": "my_name",
    *       //   "privateKey": "my_privateKey",
    *       //   "privateKeySet": false,
    *       //   "tokenTtl": "my_tokenTtl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "keyId": "my_keyId",
    *   //   "name": "my_name",
    *   //   "privateKey": "my_privateKey",
    *   //   "privateKeySet": false,
    *   //   "tokenTtl": "my_tokenTtl"
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
  def patch(params: ParamsResourceProjectsAppsDevicecheckconfigPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAppsDevicecheckconfigPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
