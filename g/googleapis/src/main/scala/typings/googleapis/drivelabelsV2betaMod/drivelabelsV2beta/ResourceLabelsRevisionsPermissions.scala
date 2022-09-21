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

@JSImport("googleapis/build/src/apis/drivelabels/v2beta", "drivelabels_v2beta.Resource$Labels$Revisions$Permissions")
@js.native
open class ResourceLabelsRevisionsPermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchDelete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(params: ParamsResourceLabelsRevisionsPermissionsBatchdelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(
    params: ParamsResourceLabelsRevisionsPermissionsBatchdelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceLabelsRevisionsPermissionsBatchdelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceLabelsRevisionsPermissionsBatchdelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(
    params: ParamsResourceLabelsRevisionsPermissionsBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes Label permissions. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
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
    *   const res = await drivelabels.labels.revisions.permissions.batchDelete({
    *     labelsId: 'placeholder-value',
    *
    *     revisionsId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": [],
    *       //   "useAdminAccess": false
    *       // }
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
  def batchDelete(params: ParamsResourceLabelsRevisionsPermissionsBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceLabelsRevisionsPermissionsBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdate(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse] = js.native
  def batchUpdate(
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse]
  ): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse] = js.native
  def batchUpdate(params: ParamsResourceLabelsRevisionsPermissionsBatchupdate): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse] = js.native
  def batchUpdate(
    params: ParamsResourceLabelsRevisionsPermissionsBatchupdate,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceLabelsRevisionsPermissionsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceLabelsRevisionsPermissionsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse] = js.native
  def batchUpdate(
    params: ParamsResourceLabelsRevisionsPermissionsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaBatchUpdateLabelPermissionsResponse]
  ): Unit = js.native
  /**
    * Updates Label permissions. If a permission for the indicated principal doesn't exist, a new Label Permission is created, otherwise the existing permission is updated. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
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
    *   const res = await drivelabels.labels.revisions.permissions.batchUpdate({
    *     // Required. The parent Label resource name shared by all permissions being updated. Format: labels/{label\} If this is set, the parent field in the UpdateLabelPermissionRequest messages must either be empty or match this field.
    *     parent: 'labels/my-label/revisions/my-revision',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": [],
    *       //   "useAdminAccess": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def batchUpdate(params: ParamsResourceLabelsRevisionsPermissionsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceLabelsRevisionsPermissionsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelPermission] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelPermission] = js.native
  def create(params: ParamsResourceLabelsRevisionsPermissionsCreate): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelPermission] = js.native
  def create(
    params: ParamsResourceLabelsRevisionsPermissionsCreate,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]
  ): Unit = js.native
  def create(
    params: ParamsResourceLabelsRevisionsPermissionsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabelPermission],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabelPermission]
  ): Unit = js.native
  def create(params: ParamsResourceLabelsRevisionsPermissionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelPermission] = js.native
  def create(
    params: ParamsResourceLabelsRevisionsPermissionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]
  ): Unit = js.native
  /**
    * Updates a Label's permissions. If a permission for the indicated principal doesn't exist, a new Label Permission is created, otherwise the existing permission is updated. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
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
    *   const res = await drivelabels.labels.revisions.permissions.create({
    *     // Required. The parent Label resource name on the Label Permission is created. Format: labels/{label\}
    *     parent: 'labels/my-label/revisions/my-revision',
    *     // Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    *     useAdminAccess: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "audience": "my_audience",
    *       //   "email": "my_email",
    *       //   "group": "my_group",
    *       //   "name": "my_name",
    *       //   "person": "my_person",
    *       //   "role": "my_role"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "audience": "my_audience",
    *   //   "email": "my_email",
    *   //   "group": "my_group",
    *   //   "name": "my_name",
    *   //   "person": "my_person",
    *   //   "role": "my_role"
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
  def create(params: ParamsResourceLabelsRevisionsPermissionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceLabelsRevisionsPermissionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceLabelsRevisionsPermissionsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceLabelsRevisionsPermissionsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceLabelsRevisionsPermissionsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceLabelsRevisionsPermissionsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceLabelsRevisionsPermissionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a Label's permission. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
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
    *   const res = await drivelabels.labels.revisions.permissions.delete({
    *     // Required. Label Permission resource name.
    *     name: 'labels/my-label/revisions/my-revision/permissions/my-permission',
    *     // Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    *     useAdminAccess: 'placeholder-value',
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
  def delete(params: ParamsResourceLabelsRevisionsPermissionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceLabelsRevisionsPermissionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse] = js.native
  def list(params: ParamsResourceLabelsRevisionsPermissionsList): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse] = js.native
  def list(
    params: ParamsResourceLabelsRevisionsPermissionsList,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLabelsRevisionsPermissionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLabelsRevisionsPermissionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse] = js.native
  def list(
    params: ParamsResourceLabelsRevisionsPermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaListLabelPermissionsResponse]
  ): Unit = js.native
  /**
    * Lists a Label's permissions.
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
    *   const res = await drivelabels.labels.revisions.permissions.list({
    *     // Maximum number of permissions to return per page. Default: 50. Max: 200.
    *     pageSize: 'placeholder-value',
    *     // The token of the page to return.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent Label resource name on which Label Permission are listed. Format: labels/{label\}
    *     parent: 'labels/my-label/revisions/my-revision',
    *     // Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    *     useAdminAccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "labelPermissions": [],
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
  def list(params: ParamsResourceLabelsRevisionsPermissionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLabelsRevisionsPermissionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelPermission] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelPermission] = js.native
  def patch(params: ParamsResourceLabelsRevisionsPermissionsPatch): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelPermission] = js.native
  def patch(
    params: ParamsResourceLabelsRevisionsPermissionsPatch,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]
  ): Unit = js.native
  def patch(
    params: ParamsResourceLabelsRevisionsPermissionsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabelPermission],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabelPermission]
  ): Unit = js.native
  def patch(params: ParamsResourceLabelsRevisionsPermissionsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelPermission] = js.native
  def patch(
    params: ParamsResourceLabelsRevisionsPermissionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]
  ): Unit = js.native
  /**
    * Updates a Label's permissions. If a permission for the indicated principal doesn't exist, a new Label Permission is created, otherwise the existing permission is updated. Permissions affect the Label resource as a whole, are not revisioned, and do not require publishing.
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
    *   const res = await drivelabels.labels.revisions.permissions.patch({
    *     // Required. The parent Label resource name.
    *     parent: 'labels/my-label/revisions/my-revision/permissions/my-permission',
    *     // Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    *     useAdminAccess: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "audience": "my_audience",
    *       //   "email": "my_email",
    *       //   "group": "my_group",
    *       //   "name": "my_name",
    *       //   "person": "my_person",
    *       //   "role": "my_role"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "audience": "my_audience",
    *   //   "email": "my_email",
    *   //   "group": "my_group",
    *   //   "name": "my_name",
    *   //   "person": "my_person",
    *   //   "role": "my_role"
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
  def patch(params: ParamsResourceLabelsRevisionsPermissionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceLabelsRevisionsPermissionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
