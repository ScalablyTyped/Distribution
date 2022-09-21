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

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Projects$Serviceaccounts$Keys")
@js.native
open class ResourceProjectsServiceaccountsKeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def create(callback: BodyResponseCallback[SchemaServiceAccountKey]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def create(params: ParamsResourceProjectsServiceaccountsKeysCreate): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def create(
    params: ParamsResourceProjectsServiceaccountsKeysCreate,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsServiceaccountsKeysCreate,
    options: BodyResponseCallback[Readable | SchemaServiceAccountKey],
    callback: BodyResponseCallback[Readable | SchemaServiceAccountKey]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsServiceaccountsKeysCreate, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def create(
    params: ParamsResourceProjectsServiceaccountsKeysCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  /**
    * Creates a ServiceAccountKey.
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
    *   const res = await iam.projects.serviceAccounts.keys.create({
    *     // Required. The resource name of the service account in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    *     name: 'projects/my-project/serviceAccounts/my-serviceAccount',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "keyAlgorithm": "my_keyAlgorithm",
    *       //   "privateKeyType": "my_privateKeyType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disabled": false,
    *   //   "keyAlgorithm": "my_keyAlgorithm",
    *   //   "keyOrigin": "my_keyOrigin",
    *   //   "keyType": "my_keyType",
    *   //   "name": "my_name",
    *   //   "privateKeyData": "my_privateKeyData",
    *   //   "privateKeyType": "my_privateKeyType",
    *   //   "publicKeyData": "my_publicKeyData",
    *   //   "validAfterTime": "my_validAfterTime",
    *   //   "validBeforeTime": "my_validBeforeTime"
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
  def create(params: ParamsResourceProjectsServiceaccountsKeysCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsServiceaccountsKeysCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsServiceaccountsKeysDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsServiceaccountsKeysDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsServiceaccountsKeysDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsServiceaccountsKeysDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsServiceaccountsKeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a ServiceAccountKey. Deleting a service account key does not revoke short-lived credentials that have been issued based on the service account key.
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
    *   const res = await iam.projects.serviceAccounts.keys.delete({
    *     // Required. The resource name of the service account key in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}/keys/{key\}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    *     name: 'projects/my-project/serviceAccounts/my-serviceAccount/keys/my-key',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsServiceaccountsKeysDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsServiceaccountsKeysDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def disable(): GaxiosPromise[SchemaEmpty] = js.native
  def disable(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def disable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def disable(params: ParamsResourceProjectsServiceaccountsKeysDisable): GaxiosPromise[SchemaEmpty] = js.native
  def disable(
    params: ParamsResourceProjectsServiceaccountsKeysDisable,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def disable(
    params: ParamsResourceProjectsServiceaccountsKeysDisable,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def disable(params: ParamsResourceProjectsServiceaccountsKeysDisable, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def disable(
    params: ParamsResourceProjectsServiceaccountsKeysDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Disable a ServiceAccountKey. A disabled service account key can be re-enabled with EnableServiceAccountKey.
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
    *   const res = await iam.projects.serviceAccounts.keys.disable({
    *     // Required. The resource name of the service account key in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}/keys/{key\}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    *     name: 'projects/my-project/serviceAccounts/my-serviceAccount/keys/my-key',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def disable(params: ParamsResourceProjectsServiceaccountsKeysDisable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def disable(
    params: ParamsResourceProjectsServiceaccountsKeysDisable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def enable(): GaxiosPromise[SchemaEmpty] = js.native
  def enable(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def enable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def enable(params: ParamsResourceProjectsServiceaccountsKeysEnable): GaxiosPromise[SchemaEmpty] = js.native
  def enable(
    params: ParamsResourceProjectsServiceaccountsKeysEnable,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def enable(
    params: ParamsResourceProjectsServiceaccountsKeysEnable,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def enable(params: ParamsResourceProjectsServiceaccountsKeysEnable, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def enable(
    params: ParamsResourceProjectsServiceaccountsKeysEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Enable a ServiceAccountKey.
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
    *   const res = await iam.projects.serviceAccounts.keys.enable({
    *     // Required. The resource name of the service account key in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}/keys/{key\}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    *     name: 'projects/my-project/serviceAccounts/my-serviceAccount/keys/my-key',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def enable(params: ParamsResourceProjectsServiceaccountsKeysEnable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def enable(
    params: ParamsResourceProjectsServiceaccountsKeysEnable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def get(callback: BodyResponseCallback[SchemaServiceAccountKey]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def get(params: ParamsResourceProjectsServiceaccountsKeysGet): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountsKeysGet,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountsKeysGet,
    options: BodyResponseCallback[Readable | SchemaServiceAccountKey],
    callback: BodyResponseCallback[Readable | SchemaServiceAccountKey]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsServiceaccountsKeysGet, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountsKeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  /**
    * Gets a ServiceAccountKey.
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
    *   const res = await iam.projects.serviceAccounts.keys.get({
    *     // Required. The resource name of the service account key in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}/keys/{key\}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    *     name: 'projects/my-project/serviceAccounts/my-serviceAccount/keys/my-key',
    *     // Optional. The output format of the public key. The default is `TYPE_NONE`, which means that the public key is not returned.
    *     publicKeyType: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disabled": false,
    *   //   "keyAlgorithm": "my_keyAlgorithm",
    *   //   "keyOrigin": "my_keyOrigin",
    *   //   "keyType": "my_keyType",
    *   //   "name": "my_name",
    *   //   "privateKeyData": "my_privateKeyData",
    *   //   "privateKeyType": "my_privateKeyType",
    *   //   "publicKeyData": "my_publicKeyData",
    *   //   "validAfterTime": "my_validAfterTime",
    *   //   "validBeforeTime": "my_validBeforeTime"
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
  def get(params: ParamsResourceProjectsServiceaccountsKeysGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountsKeysGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListServiceAccountKeysResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServiceAccountKeysResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListServiceAccountKeysResponse] = js.native
  def list(params: ParamsResourceProjectsServiceaccountsKeysList): GaxiosPromise[SchemaListServiceAccountKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsServiceaccountsKeysList,
    callback: BodyResponseCallback[SchemaListServiceAccountKeysResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsServiceaccountsKeysList,
    options: BodyResponseCallback[Readable | SchemaListServiceAccountKeysResponse],
    callback: BodyResponseCallback[Readable | SchemaListServiceAccountKeysResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsServiceaccountsKeysList, options: MethodOptions): GaxiosPromise[SchemaListServiceAccountKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsServiceaccountsKeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServiceAccountKeysResponse]
  ): Unit = js.native
  /**
    * Lists every ServiceAccountKey for a service account.
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
    *   const res = await iam.projects.serviceAccounts.keys.list({
    *     // Filters the types of keys the user wants to include in the list response. Duplicate key types are not allowed. If no key type is provided, all keys are returned.
    *     keyTypes: 'placeholder-value',
    *     // Required. The resource name of the service account in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}`. Using `-` as a wildcard for the `PROJECT_ID`, will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    *     name: 'projects/my-project/serviceAccounts/my-serviceAccount',
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
  def list(params: ParamsResourceProjectsServiceaccountsKeysList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsServiceaccountsKeysList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upload(): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def upload(callback: BodyResponseCallback[SchemaServiceAccountKey]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def upload(params: ParamsResourceProjectsServiceaccountsKeysUpload): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def upload(
    params: ParamsResourceProjectsServiceaccountsKeysUpload,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  def upload(
    params: ParamsResourceProjectsServiceaccountsKeysUpload,
    options: BodyResponseCallback[Readable | SchemaServiceAccountKey],
    callback: BodyResponseCallback[Readable | SchemaServiceAccountKey]
  ): Unit = js.native
  def upload(params: ParamsResourceProjectsServiceaccountsKeysUpload, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def upload(
    params: ParamsResourceProjectsServiceaccountsKeysUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  /**
    * Uploads the public key portion of a key pair that you manage, and associates the public key with a ServiceAccount. After you upload the public key, you can use the private key from the key pair as a service account key.
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
    *   const res = await iam.projects.serviceAccounts.keys.upload({
    *     // The resource name of the service account in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    *     name: 'projects/my-project/serviceAccounts/my-serviceAccount',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "publicKeyData": "my_publicKeyData"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disabled": false,
    *   //   "keyAlgorithm": "my_keyAlgorithm",
    *   //   "keyOrigin": "my_keyOrigin",
    *   //   "keyType": "my_keyType",
    *   //   "name": "my_name",
    *   //   "privateKeyData": "my_privateKeyData",
    *   //   "privateKeyType": "my_privateKeyType",
    *   //   "publicKeyData": "my_publicKeyData",
    *   //   "validAfterTime": "my_validAfterTime",
    *   //   "validBeforeTime": "my_validBeforeTime"
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
  def upload(params: ParamsResourceProjectsServiceaccountsKeysUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceProjectsServiceaccountsKeysUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
