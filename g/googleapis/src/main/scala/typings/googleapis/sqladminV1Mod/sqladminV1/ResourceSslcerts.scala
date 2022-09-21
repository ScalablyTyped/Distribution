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

@JSImport("googleapis/build/src/apis/sqladmin/v1", "sqladmin_v1.Resource$Sslcerts")
@js.native
open class ResourceSslcerts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def createEphemeral(): GaxiosPromise[SchemaSslCert] = js.native
  def createEphemeral(callback: BodyResponseCallback[SchemaSslCert]): Unit = js.native
  def createEphemeral(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSslCert] = js.native
  def createEphemeral(params: ParamsResourceSslcertsCreateephemeral): GaxiosPromise[SchemaSslCert] = js.native
  def createEphemeral(params: ParamsResourceSslcertsCreateephemeral, callback: BodyResponseCallback[SchemaSslCert]): Unit = js.native
  def createEphemeral(
    params: ParamsResourceSslcertsCreateephemeral,
    options: BodyResponseCallback[Readable | SchemaSslCert],
    callback: BodyResponseCallback[Readable | SchemaSslCert]
  ): Unit = js.native
  def createEphemeral(params: ParamsResourceSslcertsCreateephemeral, options: MethodOptions): GaxiosPromise[SchemaSslCert] = js.native
  def createEphemeral(
    params: ParamsResourceSslcertsCreateephemeral,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCert]
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
    *   const res = await sql.sslCerts.createEphemeral({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the Cloud SQL project.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "access_token": "my_access_token",
    *       //   "public_key": "my_public_key"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cert": "my_cert",
    *   //   "certSerialNumber": "my_certSerialNumber",
    *   //   "commonName": "my_commonName",
    *   //   "createTime": "my_createTime",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "instance": "my_instance",
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
    *   //   "sha1Fingerprint": "my_sha1Fingerprint"
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
  def createEphemeral(params: ParamsResourceSslcertsCreateephemeral, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createEphemeral(
    params: ParamsResourceSslcertsCreateephemeral,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSslcertsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSslcertsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceSslcertsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceSslcertsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceSslcertsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes the SSL certificate. For First Generation instances, the certificate remains valid until the instance is restarted.
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
    *   const res = await sql.sslCerts.delete({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *     // Sha1 FingerPrint.
    *     sha1Fingerprint: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backupContext": {},
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "exportContext": {},
    *   //   "importContext": {},
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationType": "my_operationType",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "targetProject": "my_targetProject",
    *   //   "user": "my_user"
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
  def delete(params: ParamsResourceSslcertsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSslcertsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSslCert] = js.native
  def get(callback: BodyResponseCallback[SchemaSslCert]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSslCert] = js.native
  def get(params: ParamsResourceSslcertsGet): GaxiosPromise[SchemaSslCert] = js.native
  def get(params: ParamsResourceSslcertsGet, callback: BodyResponseCallback[SchemaSslCert]): Unit = js.native
  def get(
    params: ParamsResourceSslcertsGet,
    options: BodyResponseCallback[Readable | SchemaSslCert],
    callback: BodyResponseCallback[Readable | SchemaSslCert]
  ): Unit = js.native
  def get(params: ParamsResourceSslcertsGet, options: MethodOptions): GaxiosPromise[SchemaSslCert] = js.native
  def get(
    params: ParamsResourceSslcertsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCert]
  ): Unit = js.native
  /**
    * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to initial creation.
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
    *   const res = await sql.sslCerts.get({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *     // Sha1 FingerPrint.
    *     sha1Fingerprint: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cert": "my_cert",
    *   //   "certSerialNumber": "my_certSerialNumber",
    *   //   "commonName": "my_commonName",
    *   //   "createTime": "my_createTime",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "instance": "my_instance",
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
    *   //   "sha1Fingerprint": "my_sha1Fingerprint"
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
  def get(params: ParamsResourceSslcertsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSslcertsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaSslCertsInsertResponse] = js.native
  def insert(callback: BodyResponseCallback[SchemaSslCertsInsertResponse]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSslCertsInsertResponse] = js.native
  def insert(params: ParamsResourceSslcertsInsert): GaxiosPromise[SchemaSslCertsInsertResponse] = js.native
  def insert(params: ParamsResourceSslcertsInsert, callback: BodyResponseCallback[SchemaSslCertsInsertResponse]): Unit = js.native
  def insert(
    params: ParamsResourceSslcertsInsert,
    options: BodyResponseCallback[Readable | SchemaSslCertsInsertResponse],
    callback: BodyResponseCallback[Readable | SchemaSslCertsInsertResponse]
  ): Unit = js.native
  def insert(params: ParamsResourceSslcertsInsert, options: MethodOptions): GaxiosPromise[SchemaSslCertsInsertResponse] = js.native
  def insert(
    params: ParamsResourceSslcertsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCertsInsertResponse]
  ): Unit = js.native
  /**
    * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the instance is restarted.
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
    *   const res = await sql.sslCerts.insert({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "commonName": "my_commonName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientCert": {},
    *   //   "kind": "my_kind",
    *   //   "operation": {},
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
  def insert(params: ParamsResourceSslcertsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceSslcertsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSslCertsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSslCertsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSslCertsListResponse] = js.native
  def list(params: ParamsResourceSslcertsList): GaxiosPromise[SchemaSslCertsListResponse] = js.native
  def list(params: ParamsResourceSslcertsList, callback: BodyResponseCallback[SchemaSslCertsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSslcertsList,
    options: BodyResponseCallback[Readable | SchemaSslCertsListResponse],
    callback: BodyResponseCallback[Readable | SchemaSslCertsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSslcertsList, options: MethodOptions): GaxiosPromise[SchemaSslCertsListResponse] = js.native
  def list(
    params: ParamsResourceSslcertsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCertsListResponse]
  ): Unit = js.native
  /**
    * Lists all of the current SSL certificates for the instance.
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
    *   const res = await sql.sslCerts.list({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind"
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
  def list(params: ParamsResourceSslcertsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSslcertsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
