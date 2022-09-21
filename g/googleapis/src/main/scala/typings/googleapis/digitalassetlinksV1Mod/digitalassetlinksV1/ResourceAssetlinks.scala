package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/digitalassetlinks/v1", "digitalassetlinks_v1.Resource$Assetlinks")
@js.native
open class ResourceAssetlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bulkCheck(): GaxiosPromise[SchemaBulkCheckResponse] = js.native
  def bulkCheck(callback: BodyResponseCallback[SchemaBulkCheckResponse]): Unit = js.native
  def bulkCheck(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkCheckResponse] = js.native
  def bulkCheck(params: ParamsResourceAssetlinksBulkcheck): GaxiosPromise[SchemaBulkCheckResponse] = js.native
  def bulkCheck(params: ParamsResourceAssetlinksBulkcheck, callback: BodyResponseCallback[SchemaBulkCheckResponse]): Unit = js.native
  def bulkCheck(
    params: ParamsResourceAssetlinksBulkcheck,
    options: BodyResponseCallback[Readable | SchemaBulkCheckResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkCheckResponse]
  ): Unit = js.native
  def bulkCheck(params: ParamsResourceAssetlinksBulkcheck, options: MethodOptions): GaxiosPromise[SchemaBulkCheckResponse] = js.native
  def bulkCheck(
    params: ParamsResourceAssetlinksBulkcheck,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkCheckResponse]
  ): Unit = js.native
  /**
    * Send a bundle of statement checks in a single RPC to minimize latency and service load. Statements need not be all for the same source and/or target. We recommend using this method when you need to check more than one statement in a short period of time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/digitalassetlinks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const digitalassetlinks = google.digitalassetlinks('v1');
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
    *   const res = await digitalassetlinks.assetlinks.bulkCheck({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allowGoogleInternalDataSources": false,
    *       //   "defaultRelation": "my_defaultRelation",
    *       //   "defaultSource": {},
    *       //   "defaultTarget": {},
    *       //   "skipCacheLookup": false,
    *       //   "statements": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bulkErrorCode": "my_bulkErrorCode",
    *   //   "checkResults": []
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
  def bulkCheck(params: ParamsResourceAssetlinksBulkcheck, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def bulkCheck(
    params: ParamsResourceAssetlinksBulkcheck,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def check(): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(callback: BodyResponseCallback[SchemaCheckResponse]): Unit = js.native
  def check(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(params: ParamsResourceAssetlinksCheck): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(params: ParamsResourceAssetlinksCheck, callback: BodyResponseCallback[SchemaCheckResponse]): Unit = js.native
  def check(
    params: ParamsResourceAssetlinksCheck,
    options: BodyResponseCallback[Readable | SchemaCheckResponse],
    callback: BodyResponseCallback[Readable | SchemaCheckResponse]
  ): Unit = js.native
  def check(params: ParamsResourceAssetlinksCheck, options: MethodOptions): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(
    params: ParamsResourceAssetlinksCheck,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckResponse]
  ): Unit = js.native
  /**
    * Determines whether the specified (directional) relationship exists between the specified source and target assets. The relation describes the intent of the link between the two assets as claimed by the source asset. An example for such relationships is the delegation of privileges or permissions. This command is most often used by infrastructure systems to check preconditions for an action. For example, a client may want to know if it is OK to send a web URL to a particular mobile app instead. The client can check for the relevant asset link from the website to the mobile app to decide if the operation should be allowed. A note about security: if you specify a secure asset as the source, such as an HTTPS website or an Android app, the API will ensure that any statements used to generate the response have been made in a secure way by the owner of that asset. Conversely, if the source asset is an insecure HTTP website (that is, the URL starts with `http://` instead of `https://`), the API cannot verify its statements securely, and it is not possible to ensure that the website's statements have not been altered by a third party. For more information, see the [Digital Asset Links technical design specification](https://github.com/google/digitalassetlinks/blob/master/well-known/details.md).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/digitalassetlinks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const digitalassetlinks = google.digitalassetlinks('v1');
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
    *   const res = await digitalassetlinks.assetlinks.check({
    *     // Query string for the relation. We identify relations with strings of the format `/`, where `` must be one of a set of pre-defined purpose categories, and `` is a free-form lowercase alphanumeric string that describes the specific use case of the statement. Refer to [our API documentation](/digital-asset-links/v1/relation-strings) for the current list of supported relations. For a query to match an asset link, both the query's and the asset link's relation strings must match exactly. Example: A query with relation `delegate_permission/common.handle_all_urls` matches an asset link with relation `delegate_permission/common.handle_all_urls`.
    *     relation: 'placeholder-value',
    *     // The uppercase SHA-265 fingerprint of the certificate. From the PEM certificate, it can be acquired like this: $ keytool -printcert -file $CERTFILE | grep SHA256: SHA256: 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \ 42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5 or like this: $ openssl x509 -in $CERTFILE -noout -fingerprint -sha256 SHA256 Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \ 16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5 In this example, the contents of this field would be `14:6D:E9:83:C5:73: 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF: 44:E5`. If these tools are not available to you, you can convert the PEM certificate into the DER format, compute the SHA-256 hash of that string and represent the result as a hexstring (that is, uppercase hexadecimal representations of each octet, separated by colons).
    *     'source.androidApp.certificate.sha256Fingerprint': 'placeholder-value',
    *     // Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
    *     'source.androidApp.packageName': 'placeholder-value',
    *     // Web assets are identified by a URL that contains only the scheme, hostname and port parts. The format is http[s]://[:] Hostnames must be fully qualified: they must end in a single period ("`.`"). Only the schemes "http" and "https" are currently allowed. Port numbers are given as a decimal number, and they must be omitted if the standard port numbers are used: 80 for http and 443 for https. We call this limited URL the "site". All URLs that share the same scheme, hostname and port are considered to be a part of the site and thus belong to the web asset. Example: the asset with the site `https://www.google.com` contains all these URLs: * `https://www.google.com/` * `https://www.google.com:443/` * `https://www.google.com/foo` * `https://www.google.com/foo?bar` * `https://www.google.com/foo#bar` * `https://user@password:www.google.com/` But it does not contain these URLs: * `http://www.google.com/` (wrong scheme) * `https://google.com/` (hostname does not match) * `https://www.google.com:444/` (port does not match) REQUIRED
    *     'source.web.site': 'placeholder-value',
    *     // The uppercase SHA-265 fingerprint of the certificate. From the PEM certificate, it can be acquired like this: $ keytool -printcert -file $CERTFILE | grep SHA256: SHA256: 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \ 42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5 or like this: $ openssl x509 -in $CERTFILE -noout -fingerprint -sha256 SHA256 Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \ 16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5 In this example, the contents of this field would be `14:6D:E9:83:C5:73: 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF: 44:E5`. If these tools are not available to you, you can convert the PEM certificate into the DER format, compute the SHA-256 hash of that string and represent the result as a hexstring (that is, uppercase hexadecimal representations of each octet, separated by colons).
    *     'target.androidApp.certificate.sha256Fingerprint': 'placeholder-value',
    *     // Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
    *     'target.androidApp.packageName': 'placeholder-value',
    *     // Web assets are identified by a URL that contains only the scheme, hostname and port parts. The format is http[s]://[:] Hostnames must be fully qualified: they must end in a single period ("`.`"). Only the schemes "http" and "https" are currently allowed. Port numbers are given as a decimal number, and they must be omitted if the standard port numbers are used: 80 for http and 443 for https. We call this limited URL the "site". All URLs that share the same scheme, hostname and port are considered to be a part of the site and thus belong to the web asset. Example: the asset with the site `https://www.google.com` contains all these URLs: * `https://www.google.com/` * `https://www.google.com:443/` * `https://www.google.com/foo` * `https://www.google.com/foo?bar` * `https://www.google.com/foo#bar` * `https://user@password:www.google.com/` But it does not contain these URLs: * `http://www.google.com/` (wrong scheme) * `https://google.com/` (hostname does not match) * `https://www.google.com:444/` (port does not match) REQUIRED
    *     'target.web.site': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "debugString": "my_debugString",
    *   //   "errorCode": [],
    *   //   "linked": false,
    *   //   "maxAge": "my_maxAge"
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
  def check(params: ParamsResourceAssetlinksCheck, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def check(
    params: ParamsResourceAssetlinksCheck,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
