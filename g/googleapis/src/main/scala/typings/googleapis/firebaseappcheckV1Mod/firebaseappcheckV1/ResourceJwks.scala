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

@JSImport("googleapis/build/src/apis/firebaseappcheck/v1", "firebaseappcheck_v1.Resource$Jwks")
@js.native
open class ResourceJwks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PublicJwkSet] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1PublicJwkSet]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PublicJwkSet] = js.native
  def get(params: ParamsResourceJwksGet): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PublicJwkSet] = js.native
  def get(
    params: ParamsResourceJwksGet,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1PublicJwkSet]
  ): Unit = js.native
  def get(
    params: ParamsResourceJwksGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1PublicJwkSet],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1PublicJwkSet]
  ): Unit = js.native
  def get(params: ParamsResourceJwksGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1PublicJwkSet] = js.native
  def get(
    params: ParamsResourceJwksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1PublicJwkSet]
  ): Unit = js.native
  /**
    * Returns a public JWK set as specified by [RFC 7517](https://tools.ietf.org/html/rfc7517) that can be used to verify App Check tokens. Exactly one of the public keys in the returned set will successfully validate any App Check token that is currently valid.
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
    *   const res = await firebaseappcheck.jwks.get({
    *     // Required. The relative resource name to the public JWK set. Must always be exactly the string `jwks`.
    *     name: 'jwks',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "keys": []
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
  def get(params: ParamsResourceJwksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceJwksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
