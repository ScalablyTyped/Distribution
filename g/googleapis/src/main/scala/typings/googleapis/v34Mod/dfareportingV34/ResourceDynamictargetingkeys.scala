package typings.googleapis.v34Mod.dfareportingV34

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Dynamictargetingkeys")
@js.native
open class ResourceDynamictargetingkeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDynamictargetingkeysDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDynamictargetingkeysDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDynamictargetingkeysDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDynamictargetingkeysDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceDynamictargetingkeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing dynamic targeting key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.dynamicTargetingKeys.delete({
    *     // Name of this dynamic targeting key. This is a required field. Must be less than 256 characters long and cannot contain commas. All characters are converted to lowercase.
    *     name: 'placeholder-value',
    *     // ID of the object of this dynamic targeting key. This is a required field.
    *     objectId: 'placeholder-value',
    *     // Type of the object of this dynamic targeting key. This is a required field.
    *     objectType: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
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
  def delete(params: ParamsResourceDynamictargetingkeysDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDynamictargetingkeysDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaDynamicTargetingKey] = js.native
  def insert(callback: BodyResponseCallback[SchemaDynamicTargetingKey]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDynamicTargetingKey] = js.native
  def insert(params: ParamsResourceDynamictargetingkeysInsert): GaxiosPromise[SchemaDynamicTargetingKey] = js.native
  def insert(
    params: ParamsResourceDynamictargetingkeysInsert,
    callback: BodyResponseCallback[SchemaDynamicTargetingKey]
  ): Unit = js.native
  def insert(
    params: ParamsResourceDynamictargetingkeysInsert,
    options: BodyResponseCallback[Readable | SchemaDynamicTargetingKey],
    callback: BodyResponseCallback[Readable | SchemaDynamicTargetingKey]
  ): Unit = js.native
  def insert(params: ParamsResourceDynamictargetingkeysInsert, options: MethodOptions): GaxiosPromise[SchemaDynamicTargetingKey] = js.native
  def insert(
    params: ParamsResourceDynamictargetingkeysInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDynamicTargetingKey]
  ): Unit = js.native
  /**
    * Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or placements. There is a maximum of 1000 keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.dynamicTargetingKeys.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "objectId": "my_objectId",
    *       //   "objectType": "my_objectType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "objectId": "my_objectId",
    *   //   "objectType": "my_objectType"
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
  def insert(params: ParamsResourceDynamictargetingkeysInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceDynamictargetingkeysInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDynamicTargetingKeysListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDynamicTargetingKeysListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDynamicTargetingKeysListResponse] = js.native
  def list(params: ParamsResourceDynamictargetingkeysList): GaxiosPromise[SchemaDynamicTargetingKeysListResponse] = js.native
  def list(
    params: ParamsResourceDynamictargetingkeysList,
    callback: BodyResponseCallback[SchemaDynamicTargetingKeysListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDynamictargetingkeysList,
    options: BodyResponseCallback[Readable | SchemaDynamicTargetingKeysListResponse],
    callback: BodyResponseCallback[Readable | SchemaDynamicTargetingKeysListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDynamictargetingkeysList, options: MethodOptions): GaxiosPromise[SchemaDynamicTargetingKeysListResponse] = js.native
  def list(
    params: ParamsResourceDynamictargetingkeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDynamicTargetingKeysListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of dynamic targeting keys.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.dynamicTargetingKeys.list({
    *     // Select only dynamic targeting keys whose object has this advertiser ID.
    *     advertiserId: 'placeholder-value',
    *     // Select only dynamic targeting keys exactly matching these names.
    *     names: 'placeholder-value',
    *     // Select only dynamic targeting keys with this object ID.
    *     objectId: 'placeholder-value',
    *     // Select only dynamic targeting keys with this object type.
    *     objectType: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dynamicTargetingKeys": [],
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
  def list(params: ParamsResourceDynamictargetingkeysList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDynamictargetingkeysList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
