package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drivelabels/v2", "drivelabels_v2.Resource$Labels")
@js.native
open class ResourceLabels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2Label] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2Label]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2Label] = js.native
  def get(params: ParamsResourceLabelsGet): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2Label] = js.native
  def get(
    params: ParamsResourceLabelsGet,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2Label]
  ): Unit = js.native
  def get(
    params: ParamsResourceLabelsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2Label],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2Label]
  ): Unit = js.native
  def get(params: ParamsResourceLabelsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2Label] = js.native
  def get(
    params: ParamsResourceLabelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2Label]
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
    * const drivelabels = google.drivelabels('v2');
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
  
  def list(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2ListLabelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2ListLabelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2ListLabelsResponse] = js.native
  def list(params: ParamsResourceLabelsList): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2ListLabelsResponse] = js.native
  def list(
    params: ParamsResourceLabelsList,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2ListLabelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLabelsList,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2ListLabelsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2ListLabelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLabelsList, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2ListLabelsResponse] = js.native
  def list(
    params: ParamsResourceLabelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2ListLabelsResponse]
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
    * const drivelabels = google.drivelabels('v2');
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
}
