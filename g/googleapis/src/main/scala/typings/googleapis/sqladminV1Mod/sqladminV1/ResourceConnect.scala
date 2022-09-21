package typings.googleapis.sqladminV1Mod.sqladminV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sqladmin/v1", "sqladmin_v1.Resource$Connect")
@js.native
open class ResourceConnect protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generateEphemeralCert(): GaxiosPromise[SchemaGenerateEphemeralCertResponse] = js.native
  def generateEphemeralCert(callback: BodyResponseCallback[SchemaGenerateEphemeralCertResponse]): Unit = js.native
  def generateEphemeralCert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateEphemeralCertResponse] = js.native
  def generateEphemeralCert(params: ParamsResourceConnectGenerateephemeralcert): GaxiosPromise[SchemaGenerateEphemeralCertResponse] = js.native
  def generateEphemeralCert(
    params: ParamsResourceConnectGenerateephemeralcert,
    callback: BodyResponseCallback[SchemaGenerateEphemeralCertResponse]
  ): Unit = js.native
  def generateEphemeralCert(
    params: ParamsResourceConnectGenerateephemeralcert,
    options: BodyResponseCallback[Readable | SchemaGenerateEphemeralCertResponse],
    callback: BodyResponseCallback[Readable | SchemaGenerateEphemeralCertResponse]
  ): Unit = js.native
  def generateEphemeralCert(params: ParamsResourceConnectGenerateephemeralcert, options: MethodOptions): GaxiosPromise[SchemaGenerateEphemeralCertResponse] = js.native
  def generateEphemeralCert(
    params: ParamsResourceConnectGenerateephemeralcert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateEphemeralCertResponse]
  ): Unit = js.native
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use the certificate to authenticate as themselves when connecting to the database.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sqladmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sqladmin = google.sqladmin('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/sqlservice.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sql.connect.generateEphemeral({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "access_token": "my_access_token",
    *       //   "public_key": "my_public_key",
    *       //   "readTime": "my_readTime",
    *       //   "validDuration": "my_validDuration"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ephemeralCert": {}
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
  def generateEphemeralCert(params: ParamsResourceConnectGenerateephemeralcert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateEphemeralCert(
    params: ParamsResourceConnectGenerateephemeralcert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaConnectSettings] = js.native
  def get(callback: BodyResponseCallback[SchemaConnectSettings]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConnectSettings] = js.native
  def get(params: ParamsResourceConnectGet): GaxiosPromise[SchemaConnectSettings] = js.native
  def get(params: ParamsResourceConnectGet, callback: BodyResponseCallback[SchemaConnectSettings]): Unit = js.native
  def get(
    params: ParamsResourceConnectGet,
    options: BodyResponseCallback[Readable | SchemaConnectSettings],
    callback: BodyResponseCallback[Readable | SchemaConnectSettings]
  ): Unit = js.native
  def get(params: ParamsResourceConnectGet, options: MethodOptions): GaxiosPromise[SchemaConnectSettings] = js.native
  def get(
    params: ParamsResourceConnectGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConnectSettings]
  ): Unit = js.native
  /**
    * Retrieves connect settings about a Cloud SQL instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sqladmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sqladmin = google.sqladmin('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/sqlservice.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sql.connect.get({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *     // Optional. Optional snapshot read timestamp to trade freshness for performance.
    *     readTime: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backendType": "my_backendType",
    *   //   "databaseVersion": "my_databaseVersion",
    *   //   "ipAddresses": [],
    *   //   "kind": "my_kind",
    *   //   "region": "my_region",
    *   //   "serverCaCert": {}
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
  def get(params: ParamsResourceConnectGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceConnectGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
