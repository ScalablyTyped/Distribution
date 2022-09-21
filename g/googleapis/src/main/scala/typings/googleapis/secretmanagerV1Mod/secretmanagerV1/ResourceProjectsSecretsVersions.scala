package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/secretmanager/v1", "secretmanager_v1.Resource$Projects$Secrets$Versions")
@js.native
open class ResourceProjectsSecretsVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def access(): GaxiosPromise[SchemaAccessSecretVersionResponse] = js.native
  def access(callback: BodyResponseCallback[SchemaAccessSecretVersionResponse]): Unit = js.native
  def access(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccessSecretVersionResponse] = js.native
  def access(params: ParamsResourceProjectsSecretsVersionsAccess): GaxiosPromise[SchemaAccessSecretVersionResponse] = js.native
  def access(
    params: ParamsResourceProjectsSecretsVersionsAccess,
    callback: BodyResponseCallback[SchemaAccessSecretVersionResponse]
  ): Unit = js.native
  def access(
    params: ParamsResourceProjectsSecretsVersionsAccess,
    options: BodyResponseCallback[Readable | SchemaAccessSecretVersionResponse],
    callback: BodyResponseCallback[Readable | SchemaAccessSecretVersionResponse]
  ): Unit = js.native
  def access(params: ParamsResourceProjectsSecretsVersionsAccess, options: MethodOptions): GaxiosPromise[SchemaAccessSecretVersionResponse] = js.native
  def access(
    params: ParamsResourceProjectsSecretsVersionsAccess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccessSecretVersionResponse]
  ): Unit = js.native
  /**
    * Accesses a SecretVersion. This call returns the secret data. `projects/x/secrets/x/versions/latest` is an alias to the most recently created SecretVersion.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/secretmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const secretmanager = google.secretmanager('v1');
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
    *   const res = await secretmanager.projects.secrets.versions.access({
    *     // Required. The resource name of the SecretVersion in the format `projects/x/secrets/x/versions/x`. `projects/x/secrets/x/versions/latest` is an alias to the most recently created SecretVersion.
    *     name: 'projects/my-project/secrets/my-secret/versions/my-version',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "payload": {}
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
  def access(params: ParamsResourceProjectsSecretsVersionsAccess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def access(
    params: ParamsResourceProjectsSecretsVersionsAccess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def destroy(): GaxiosPromise[SchemaSecretVersion] = js.native
  def destroy(callback: BodyResponseCallback[SchemaSecretVersion]): Unit = js.native
  def destroy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecretVersion] = js.native
  def destroy(params: ParamsResourceProjectsSecretsVersionsDestroy): GaxiosPromise[SchemaSecretVersion] = js.native
  def destroy(
    params: ParamsResourceProjectsSecretsVersionsDestroy,
    callback: BodyResponseCallback[SchemaSecretVersion]
  ): Unit = js.native
  def destroy(
    params: ParamsResourceProjectsSecretsVersionsDestroy,
    options: BodyResponseCallback[Readable | SchemaSecretVersion],
    callback: BodyResponseCallback[Readable | SchemaSecretVersion]
  ): Unit = js.native
  def destroy(params: ParamsResourceProjectsSecretsVersionsDestroy, options: MethodOptions): GaxiosPromise[SchemaSecretVersion] = js.native
  def destroy(
    params: ParamsResourceProjectsSecretsVersionsDestroy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecretVersion]
  ): Unit = js.native
  /**
    * Destroys a SecretVersion. Sets the state of the SecretVersion to DESTROYED and irrevocably destroys the secret data.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/secretmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const secretmanager = google.secretmanager('v1');
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
    *   const res = await secretmanager.projects.secrets.versions.destroy({
    *     // Required. The resource name of the SecretVersion to destroy in the format `projects/x/secrets/x/versions/x`.
    *     name: 'projects/my-project/secrets/my-secret/versions/my-version',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientSpecifiedPayloadChecksum": false,
    *   //   "createTime": "my_createTime",
    *   //   "destroyTime": "my_destroyTime",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "replicationStatus": {},
    *   //   "state": "my_state"
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
  def destroy(params: ParamsResourceProjectsSecretsVersionsDestroy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def destroy(
    params: ParamsResourceProjectsSecretsVersionsDestroy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def disable(): GaxiosPromise[SchemaSecretVersion] = js.native
  def disable(callback: BodyResponseCallback[SchemaSecretVersion]): Unit = js.native
  def disable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecretVersion] = js.native
  def disable(params: ParamsResourceProjectsSecretsVersionsDisable): GaxiosPromise[SchemaSecretVersion] = js.native
  def disable(
    params: ParamsResourceProjectsSecretsVersionsDisable,
    callback: BodyResponseCallback[SchemaSecretVersion]
  ): Unit = js.native
  def disable(
    params: ParamsResourceProjectsSecretsVersionsDisable,
    options: BodyResponseCallback[Readable | SchemaSecretVersion],
    callback: BodyResponseCallback[Readable | SchemaSecretVersion]
  ): Unit = js.native
  def disable(params: ParamsResourceProjectsSecretsVersionsDisable, options: MethodOptions): GaxiosPromise[SchemaSecretVersion] = js.native
  def disable(
    params: ParamsResourceProjectsSecretsVersionsDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecretVersion]
  ): Unit = js.native
  /**
    * Disables a SecretVersion. Sets the state of the SecretVersion to DISABLED.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/secretmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const secretmanager = google.secretmanager('v1');
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
    *   const res = await secretmanager.projects.secrets.versions.disable({
    *     // Required. The resource name of the SecretVersion to disable in the format `projects/x/secrets/x/versions/x`.
    *     name: 'projects/my-project/secrets/my-secret/versions/my-version',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientSpecifiedPayloadChecksum": false,
    *   //   "createTime": "my_createTime",
    *   //   "destroyTime": "my_destroyTime",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "replicationStatus": {},
    *   //   "state": "my_state"
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
  def disable(params: ParamsResourceProjectsSecretsVersionsDisable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def disable(
    params: ParamsResourceProjectsSecretsVersionsDisable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def enable(): GaxiosPromise[SchemaSecretVersion] = js.native
  def enable(callback: BodyResponseCallback[SchemaSecretVersion]): Unit = js.native
  def enable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecretVersion] = js.native
  def enable(params: ParamsResourceProjectsSecretsVersionsEnable): GaxiosPromise[SchemaSecretVersion] = js.native
  def enable(
    params: ParamsResourceProjectsSecretsVersionsEnable,
    callback: BodyResponseCallback[SchemaSecretVersion]
  ): Unit = js.native
  def enable(
    params: ParamsResourceProjectsSecretsVersionsEnable,
    options: BodyResponseCallback[Readable | SchemaSecretVersion],
    callback: BodyResponseCallback[Readable | SchemaSecretVersion]
  ): Unit = js.native
  def enable(params: ParamsResourceProjectsSecretsVersionsEnable, options: MethodOptions): GaxiosPromise[SchemaSecretVersion] = js.native
  def enable(
    params: ParamsResourceProjectsSecretsVersionsEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecretVersion]
  ): Unit = js.native
  /**
    * Enables a SecretVersion. Sets the state of the SecretVersion to ENABLED.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/secretmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const secretmanager = google.secretmanager('v1');
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
    *   const res = await secretmanager.projects.secrets.versions.enable({
    *     // Required. The resource name of the SecretVersion to enable in the format `projects/x/secrets/x/versions/x`.
    *     name: 'projects/my-project/secrets/my-secret/versions/my-version',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientSpecifiedPayloadChecksum": false,
    *   //   "createTime": "my_createTime",
    *   //   "destroyTime": "my_destroyTime",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "replicationStatus": {},
    *   //   "state": "my_state"
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
  def enable(params: ParamsResourceProjectsSecretsVersionsEnable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def enable(
    params: ParamsResourceProjectsSecretsVersionsEnable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSecretVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaSecretVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecretVersion] = js.native
  def get(params: ParamsResourceProjectsSecretsVersionsGet): GaxiosPromise[SchemaSecretVersion] = js.native
  def get(
    params: ParamsResourceProjectsSecretsVersionsGet,
    callback: BodyResponseCallback[SchemaSecretVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsSecretsVersionsGet,
    options: BodyResponseCallback[Readable | SchemaSecretVersion],
    callback: BodyResponseCallback[Readable | SchemaSecretVersion]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsSecretsVersionsGet, options: MethodOptions): GaxiosPromise[SchemaSecretVersion] = js.native
  def get(
    params: ParamsResourceProjectsSecretsVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecretVersion]
  ): Unit = js.native
  /**
    * Gets metadata for a SecretVersion. `projects/x/secrets/x/versions/latest` is an alias to the most recently created SecretVersion.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/secretmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const secretmanager = google.secretmanager('v1');
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
    *   const res = await secretmanager.projects.secrets.versions.get({
    *     // Required. The resource name of the SecretVersion in the format `projects/x/secrets/x/versions/x`. `projects/x/secrets/x/versions/latest` is an alias to the most recently created SecretVersion.
    *     name: 'projects/my-project/secrets/my-secret/versions/my-version',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientSpecifiedPayloadChecksum": false,
    *   //   "createTime": "my_createTime",
    *   //   "destroyTime": "my_destroyTime",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "replicationStatus": {},
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceProjectsSecretsVersionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsSecretsVersionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSecretVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSecretVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSecretVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsSecretsVersionsList): GaxiosPromise[SchemaListSecretVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsSecretsVersionsList,
    callback: BodyResponseCallback[SchemaListSecretVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsSecretsVersionsList,
    options: BodyResponseCallback[Readable | SchemaListSecretVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSecretVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsSecretsVersionsList, options: MethodOptions): GaxiosPromise[SchemaListSecretVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsSecretsVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSecretVersionsResponse]
  ): Unit = js.native
  /**
    * Lists SecretVersions. This call does not return secret data.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/secretmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const secretmanager = google.secretmanager('v1');
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
    *   const res = await secretmanager.projects.secrets.versions.list({
    *     // Optional. Filter string, adhering to the rules in [List-operation filtering](https://cloud.google.com/secret-manager/docs/filtering). List only secret versions matching the filter. If filter is empty, all secret versions are listed.
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of results to be returned in a single page. If set to 0, the server decides the number of results to return. If the number is greater than 25000, it is capped at 25000.
    *     pageSize: 'placeholder-value',
    *     // Optional. Pagination token, returned earlier via ListSecretVersionsResponse.next_page_token][].
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the Secret associated with the SecretVersions to list, in the format `projects/x/secrets/x`.
    *     parent: 'projects/my-project/secrets/my-secret',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0,
    *   //   "versions": []
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
  def list(params: ParamsResourceProjectsSecretsVersionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsSecretsVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
