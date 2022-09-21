package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drivelabels/v2beta", "drivelabels_v2beta.Resource$Labels")
@js.native
open class ResourceLabels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def create(params: ParamsResourceLabelsCreate): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def create(
    params: ParamsResourceLabelsCreate,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def create(
    params: ParamsResourceLabelsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def create(params: ParamsResourceLabelsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def create(
    params: ParamsResourceLabelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  /**
    * Creates a new Label.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
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
    *   const res = await drivelabels.labels.create({
    *     // The BCP-47 language code to use for evaluating localized Field labels in response. When not specified, values in the default configured language will be used.
    *     languageCode: 'placeholder-value',
    *     // Set to `true` in order to use the user's admin privileges. The server will verify the user is an admin before allowing access.
    *     useAdminAccess: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appliedCapabilities": {},
    *       //   "appliedLabelPolicy": {},
    *       //   "createTime": "my_createTime",
    *       //   "creator": {},
    *       //   "disableTime": "my_disableTime",
    *       //   "disabler": {},
    *       //   "displayHints": {},
    *       //   "fields": [],
    *       //   "id": "my_id",
    *       //   "labelType": "my_labelType",
    *       //   "learnMoreUri": "my_learnMoreUri",
    *       //   "lifecycle": {},
    *       //   "lockStatus": {},
    *       //   "name": "my_name",
    *       //   "properties": {},
    *       //   "publishTime": "my_publishTime",
    *       //   "publisher": {},
    *       //   "revisionCreateTime": "my_revisionCreateTime",
    *       //   "revisionCreator": {},
    *       //   "revisionId": "my_revisionId",
    *       //   "schemaCapabilities": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedCapabilities": {},
    *   //   "appliedLabelPolicy": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "disableTime": "my_disableTime",
    *   //   "disabler": {},
    *   //   "displayHints": {},
    *   //   "fields": [],
    *   //   "id": "my_id",
    *   //   "labelType": "my_labelType",
    *   //   "learnMoreUri": "my_learnMoreUri",
    *   //   "lifecycle": {},
    *   //   "lockStatus": {},
    *   //   "name": "my_name",
    *   //   "properties": {},
    *   //   "publishTime": "my_publishTime",
    *   //   "publisher": {},
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionCreator": {},
    *   //   "revisionId": "my_revisionId",
    *   //   "schemaCapabilities": {}
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
  def create(params: ParamsResourceLabelsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceLabelsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceLabelsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceLabelsDelete, callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceLabelsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceLabelsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceLabelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Permanently deletes a Label and related metadata on Drive Items. Once deleted, the Label and related Drive item metadata will be deleted. Only draft Labels, and disabled Labels may be deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
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
    *   const res = await drivelabels.labels.delete({
    *     // Required. Label resource name.
    *     name: 'labels/my-label',
    *     // Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    *     useAdminAccess: 'placeholder-value',
    *     // The revision_id of the label that the write request will be applied to. If this is not the latest revision of the label, the request will not be processed and will return a 400 Bad Request error.
    *     'writeControl.requiredRevisionId': 'placeholder-value',
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
  def delete(params: ParamsResourceLabelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceLabelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delta(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse] = js.native
  def delta(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse]): Unit = js.native
  def delta(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse] = js.native
  def delta(params: ParamsResourceLabelsDelta): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse] = js.native
  def delta(
    params: ParamsResourceLabelsDelta,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse]
  ): Unit = js.native
  def delta(
    params: ParamsResourceLabelsDelta,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse]
  ): Unit = js.native
  def delta(params: ParamsResourceLabelsDelta, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse] = js.native
  def delta(
    params: ParamsResourceLabelsDelta,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse]
  ): Unit = js.native
  /**
    * Updates a single Label by applying a set of update requests resulting in a new draft revision. The batch update is all-or-nothing: If any of the update requests are invalid, no changes are applied. The resulting draft revision must be published before the changes may be used with Drive Items.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
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
    *   const res = await drivelabels.labels.delta({
    *     // Required. The resource name of the Label to update.
    *     name: 'labels/my-label',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "languageCode": "my_languageCode",
    *       //   "requests": [],
    *       //   "useAdminAccess": false,
    *       //   "view": "my_view",
    *       //   "writeControl": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "responses": [],
    *   //   "updatedLabel": {}
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
  def delta(params: ParamsResourceLabelsDelta, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delta(
    params: ParamsResourceLabelsDelta,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def disable(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def disable(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]): Unit = js.native
  def disable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def disable(params: ParamsResourceLabelsDisable): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def disable(
    params: ParamsResourceLabelsDisable,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def disable(
    params: ParamsResourceLabelsDisable,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def disable(params: ParamsResourceLabelsDisable, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def disable(
    params: ParamsResourceLabelsDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  /**
    * Disable a published Label. Disabling a Label will result in a new disabled published revision based on the current published revision. If there is a draft revision, a new disabled draft revision will be created based on the latest draft revision. Older draft revisions will be deleted. Once disabled, a label may be deleted with `DeleteLabel`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
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
    *   const res = await drivelabels.labels.disable({
    *     // Required. Label resource name.
    *     name: 'labels/my-label',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disabledPolicy": {},
    *       //   "languageCode": "my_languageCode",
    *       //   "updateMask": "my_updateMask",
    *       //   "useAdminAccess": false,
    *       //   "writeControl": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedCapabilities": {},
    *   //   "appliedLabelPolicy": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "disableTime": "my_disableTime",
    *   //   "disabler": {},
    *   //   "displayHints": {},
    *   //   "fields": [],
    *   //   "id": "my_id",
    *   //   "labelType": "my_labelType",
    *   //   "learnMoreUri": "my_learnMoreUri",
    *   //   "lifecycle": {},
    *   //   "lockStatus": {},
    *   //   "name": "my_name",
    *   //   "properties": {},
    *   //   "publishTime": "my_publishTime",
    *   //   "publisher": {},
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionCreator": {},
    *   //   "revisionId": "my_revisionId",
    *   //   "schemaCapabilities": {}
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
  def disable(params: ParamsResourceLabelsDisable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def disable(
    params: ParamsResourceLabelsDisable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def enable(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def enable(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]): Unit = js.native
  def enable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def enable(params: ParamsResourceLabelsEnable): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def enable(
    params: ParamsResourceLabelsEnable,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def enable(
    params: ParamsResourceLabelsEnable,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def enable(params: ParamsResourceLabelsEnable, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def enable(
    params: ParamsResourceLabelsEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  /**
    * Enable a disabled Label and restore it to its published state. This will result in a new published revision based on the current disabled published revision. If there is an existing disabled draft revision, a new revision will be created based on that draft and will be enabled.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
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
    *   const res = await drivelabels.labels.enable({
    *     // Required. Label resource name.
    *     name: 'labels/my-label',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "languageCode": "my_languageCode",
    *       //   "useAdminAccess": false,
    *       //   "writeControl": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedCapabilities": {},
    *   //   "appliedLabelPolicy": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "disableTime": "my_disableTime",
    *   //   "disabler": {},
    *   //   "displayHints": {},
    *   //   "fields": [],
    *   //   "id": "my_id",
    *   //   "labelType": "my_labelType",
    *   //   "learnMoreUri": "my_learnMoreUri",
    *   //   "lifecycle": {},
    *   //   "lockStatus": {},
    *   //   "name": "my_name",
    *   //   "properties": {},
    *   //   "publishTime": "my_publishTime",
    *   //   "publisher": {},
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionCreator": {},
    *   //   "revisionId": "my_revisionId",
    *   //   "schemaCapabilities": {}
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
  def enable(params: ParamsResourceLabelsEnable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def enable(
    params: ParamsResourceLabelsEnable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def get(params: ParamsResourceLabelsGet): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def get(
    params: ParamsResourceLabelsGet,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def get(
    params: ParamsResourceLabelsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def get(params: ParamsResourceLabelsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def get(
    params: ParamsResourceLabelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  /**
    * Get a label by its resource name. Resource name may be any of: * `labels/{id\}` - See `labels/{id\}@latest` * `labels/{id\}@latest` - Gets the latest revision of the label. * `labels/{id\}@published` - Gets the current published revision of the label. * `labels/{id\}@{revision_id\}` - Gets the label at the specified revision ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
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
    *   const res = await drivelabels.labels.get({
    *     // The BCP-47 language code to use for evaluating localized field labels. When not specified, values in the default configured language are used.
    *     languageCode: 'placeholder-value',
    *     // Required. Label resource name. May be any of: * `labels/{id\}` (equivalent to labels/{id\}@latest) * `labels/{id\}@latest` * `labels/{id\}@published` * `labels/{id\}@{revision_id\}`
    *     name: 'labels/my-label',
    *     // Set to `true` in order to use the user's admin credentials. The server verifies that the user is an admin for the label before allowing access.
    *     useAdminAccess: 'placeholder-value',
    *     // When specified, only certain fields belonging to the indicated view are returned.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedCapabilities": {},
    *   //   "appliedLabelPolicy": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "disableTime": "my_disableTime",
    *   //   "disabler": {},
    *   //   "displayHints": {},
    *   //   "fields": [],
    *   //   "id": "my_id",
    *   //   "labelType": "my_labelType",
    *   //   "learnMoreUri": "my_learnMoreUri",
    *   //   "lifecycle": {},
    *   //   "lockStatus": {},
    *   //   "name": "my_name",
    *   //   "properties": {},
    *   //   "publishTime": "my_publishTime",
    *   //   "publisher": {},
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionCreator": {},
    *   //   "revisionId": "my_revisionId",
    *   //   "schemaCapabilities": {}
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
  def get(params: ParamsResourceLabelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLabelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse] = js.native
  def list(params: ParamsResourceLabelsList): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse] = js.native
  def list(
    params: ParamsResourceLabelsList,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLabelsList,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLabelsList, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse] = js.native
  def list(
    params: ParamsResourceLabelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse]
  ): Unit = js.native
  /**
    * List labels.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
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
    *   const res = await drivelabels.labels.list({
    *     // The BCP-47 language code to use for evaluating localized field labels. When not specified, values in the default configured language are used.
    *     languageCode: 'placeholder-value',
    *     // Specifies the level of access the user must have on the returned Labels. The minimum role a user must have on a label. Defaults to `READER`.
    *     minimumRole: 'placeholder-value',
    *     // Maximum number of labels to return per page. Default: 50. Max: 200.
    *     pageSize: 'placeholder-value',
    *     // The token of the page to return.
    *     pageToken: 'placeholder-value',
    *     // Whether to include only published labels in the results. * When `true`, only the current published label revisions are returned. Disabled labels are included. Returned label resource names reference the published revision (`labels/{id\}/{revision_id\}`). * When `false`, the current label revisions are returned, which might not be published. Returned label resource names don't reference a specific revision (`labels/{id\}`).
    *     publishedOnly: 'placeholder-value',
    *     // Set to `true` in order to use the user's admin credentials. This will return all Labels within the customer.
    *     useAdminAccess: 'placeholder-value',
    *     // When specified, only certain fields belonging to the indicated view are returned.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "labels": [],
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
  def list(params: ParamsResourceLabelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLabelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var locks: ResourceLabelsLocks = js.native
  
  var permissions: ResourceLabelsPermissions = js.native
  
  def publish(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def publish(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]): Unit = js.native
  def publish(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def publish(params: ParamsResourceLabelsPublish): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def publish(
    params: ParamsResourceLabelsPublish,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def publish(
    params: ParamsResourceLabelsPublish,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def publish(params: ParamsResourceLabelsPublish, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def publish(
    params: ParamsResourceLabelsPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  /**
    * Publish all draft changes to the Label. Once published, the Label may not return to its draft state. See `google.apps.drive.labels.v2.Lifecycle` for more information. Publishing a Label will result in a new published revision. All previous draft revisions will be deleted. Previous published revisions will be kept but are subject to automated deletion as needed. Once published, some changes are no longer permitted. Generally, any change that would invalidate or cause new restrictions on existing metadata related to the Label will be rejected. For example, the following changes to a Label will be rejected after the Label is published: * The label cannot be directly deleted. It must be disabled first, then deleted. * Field.FieldType cannot be changed. * Changes to Field validation options cannot reject something that was previously accepted. * Reducing the max entries.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
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
    *   const res = await drivelabels.labels.publish({
    *     // Required. Label resource name.
    *     name: 'labels/my-label',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "languageCode": "my_languageCode",
    *       //   "useAdminAccess": false,
    *       //   "writeControl": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedCapabilities": {},
    *   //   "appliedLabelPolicy": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "disableTime": "my_disableTime",
    *   //   "disabler": {},
    *   //   "displayHints": {},
    *   //   "fields": [],
    *   //   "id": "my_id",
    *   //   "labelType": "my_labelType",
    *   //   "learnMoreUri": "my_learnMoreUri",
    *   //   "lifecycle": {},
    *   //   "lockStatus": {},
    *   //   "name": "my_name",
    *   //   "properties": {},
    *   //   "publishTime": "my_publishTime",
    *   //   "publisher": {},
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionCreator": {},
    *   //   "revisionId": "my_revisionId",
    *   //   "schemaCapabilities": {}
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
  def publish(params: ParamsResourceLabelsPublish, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def publish(
    params: ParamsResourceLabelsPublish,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var revisions: ResourceLabelsRevisions = js.native
  
  def updateLabelCopyMode(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def updateLabelCopyMode(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]): Unit = js.native
  def updateLabelCopyMode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def updateLabelCopyMode(params: ParamsResourceLabelsUpdatelabelcopymode): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def updateLabelCopyMode(
    params: ParamsResourceLabelsUpdatelabelcopymode,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def updateLabelCopyMode(
    params: ParamsResourceLabelsUpdatelabelcopymode,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  def updateLabelCopyMode(params: ParamsResourceLabelsUpdatelabelcopymode, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.native
  def updateLabelCopyMode(
    params: ParamsResourceLabelsUpdatelabelcopymode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabel]
  ): Unit = js.native
  /**
    * Updates a Label's `CopyMode`. Changes to this policy are not revisioned, do not require publishing, and take effect immediately.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
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
    *   const res = await drivelabels.labels.updateLabelCopyMode({
    *     // Required. The resource name of the Label to update.
    *     name: 'labels/my-label',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "copyMode": "my_copyMode",
    *       //   "languageCode": "my_languageCode",
    *       //   "useAdminAccess": false,
    *       //   "view": "my_view"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedCapabilities": {},
    *   //   "appliedLabelPolicy": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "disableTime": "my_disableTime",
    *   //   "disabler": {},
    *   //   "displayHints": {},
    *   //   "fields": [],
    *   //   "id": "my_id",
    *   //   "labelType": "my_labelType",
    *   //   "learnMoreUri": "my_learnMoreUri",
    *   //   "lifecycle": {},
    *   //   "lockStatus": {},
    *   //   "name": "my_name",
    *   //   "properties": {},
    *   //   "publishTime": "my_publishTime",
    *   //   "publisher": {},
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionCreator": {},
    *   //   "revisionId": "my_revisionId",
    *   //   "schemaCapabilities": {}
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
  def updateLabelCopyMode(params: ParamsResourceLabelsUpdatelabelcopymode, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateLabelCopyMode(
    params: ParamsResourceLabelsUpdatelabelcopymode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
