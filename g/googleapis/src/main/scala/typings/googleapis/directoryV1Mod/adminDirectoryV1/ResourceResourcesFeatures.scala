package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resources$Features")
@js.native
open class ResourceResourcesFeatures protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesFeaturesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesFeaturesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceResourcesFeaturesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceResourcesFeaturesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceResourcesFeaturesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a feature.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.features.delete({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *     // The unique ID of the feature to delete.
    *     featureKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceResourcesFeaturesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceResourcesFeaturesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaFeature] = js.native
  def get(callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def get(params: ParamsResourceResourcesFeaturesGet): GaxiosPromise[SchemaFeature] = js.native
  def get(params: ParamsResourceResourcesFeaturesGet, callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def get(
    params: ParamsResourceResourcesFeaturesGet,
    options: BodyResponseCallback[Readable | SchemaFeature],
    callback: BodyResponseCallback[Readable | SchemaFeature]
  ): Unit = js.native
  def get(params: ParamsResourceResourcesFeaturesGet, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def get(
    params: ParamsResourceResourcesFeaturesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  /**
    * Retrieves a feature.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.features.get({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *     // The unique ID of the feature to retrieve.
    *     featureKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etags": "my_etags",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceResourcesFeaturesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceResourcesFeaturesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaFeature] = js.native
  def insert(callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def insert(params: ParamsResourceResourcesFeaturesInsert): GaxiosPromise[SchemaFeature] = js.native
  def insert(params: ParamsResourceResourcesFeaturesInsert, callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def insert(
    params: ParamsResourceResourcesFeaturesInsert,
    options: BodyResponseCallback[Readable | SchemaFeature],
    callback: BodyResponseCallback[Readable | SchemaFeature]
  ): Unit = js.native
  def insert(params: ParamsResourceResourcesFeaturesInsert, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def insert(
    params: ParamsResourceResourcesFeaturesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  /**
    * Inserts a feature.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.features.insert({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etags": "my_etags",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etags": "my_etags",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def insert(params: ParamsResourceResourcesFeaturesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceResourcesFeaturesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaFeatures] = js.native
  def list(callback: BodyResponseCallback[SchemaFeatures]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFeatures] = js.native
  def list(params: ParamsResourceResourcesFeaturesList): GaxiosPromise[SchemaFeatures] = js.native
  def list(params: ParamsResourceResourcesFeaturesList, callback: BodyResponseCallback[SchemaFeatures]): Unit = js.native
  def list(
    params: ParamsResourceResourcesFeaturesList,
    options: BodyResponseCallback[Readable | SchemaFeatures],
    callback: BodyResponseCallback[Readable | SchemaFeatures]
  ): Unit = js.native
  def list(params: ParamsResourceResourcesFeaturesList, options: MethodOptions): GaxiosPromise[SchemaFeatures] = js.native
  def list(
    params: ParamsResourceResourcesFeaturesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeatures]
  ): Unit = js.native
  /**
    * Retrieves a list of features for an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.features.list({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Token to specify the next page in the list.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "features": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceResourcesFeaturesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceResourcesFeaturesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaFeature] = js.native
  def patch(callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def patch(params: ParamsResourceResourcesFeaturesPatch): GaxiosPromise[SchemaFeature] = js.native
  def patch(params: ParamsResourceResourcesFeaturesPatch, callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def patch(
    params: ParamsResourceResourcesFeaturesPatch,
    options: BodyResponseCallback[Readable | SchemaFeature],
    callback: BodyResponseCallback[Readable | SchemaFeature]
  ): Unit = js.native
  def patch(params: ParamsResourceResourcesFeaturesPatch, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def patch(
    params: ParamsResourceResourcesFeaturesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  /**
    * Patches a feature.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.features.patch({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *     // The unique ID of the feature to update.
    *     featureKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etags": "my_etags",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etags": "my_etags",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceResourcesFeaturesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceResourcesFeaturesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rename(): GaxiosPromise[Unit] = js.native
  def rename(callback: BodyResponseCallback[Unit]): Unit = js.native
  def rename(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def rename(params: ParamsResourceResourcesFeaturesRename): GaxiosPromise[Unit] = js.native
  def rename(params: ParamsResourceResourcesFeaturesRename, callback: BodyResponseCallback[Unit]): Unit = js.native
  def rename(
    params: ParamsResourceResourcesFeaturesRename,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def rename(params: ParamsResourceResourcesFeaturesRename, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def rename(
    params: ParamsResourceResourcesFeaturesRename,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Renames a feature.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.features.rename({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *     // The unique ID of the feature to rename.
    *     oldName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "newName": "my_newName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
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
  def rename(params: ParamsResourceResourcesFeaturesRename, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rename(
    params: ParamsResourceResourcesFeaturesRename,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaFeature] = js.native
  def update(callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def update(params: ParamsResourceResourcesFeaturesUpdate): GaxiosPromise[SchemaFeature] = js.native
  def update(params: ParamsResourceResourcesFeaturesUpdate, callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def update(
    params: ParamsResourceResourcesFeaturesUpdate,
    options: BodyResponseCallback[Readable | SchemaFeature],
    callback: BodyResponseCallback[Readable | SchemaFeature]
  ): Unit = js.native
  def update(params: ParamsResourceResourcesFeaturesUpdate, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def update(
    params: ParamsResourceResourcesFeaturesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  /**
    * Updates a feature.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.features.update({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *     // The unique ID of the feature to update.
    *     featureKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etags": "my_etags",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etags": "my_etags",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def update(params: ParamsResourceResourcesFeaturesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceResourcesFeaturesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
