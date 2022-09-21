package typings.googleapis.loggingV2Mod.loggingV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Folders$Locations$Buckets")
@js.native
open class ResourceFoldersLocationsBuckets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaLogBucket] = js.native
  def create(callback: BodyResponseCallback[SchemaLogBucket]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogBucket] = js.native
  def create(params: ParamsResourceFoldersLocationsBucketsCreate): GaxiosPromise[SchemaLogBucket] = js.native
  def create(
    params: ParamsResourceFoldersLocationsBucketsCreate,
    callback: BodyResponseCallback[SchemaLogBucket]
  ): Unit = js.native
  def create(
    params: ParamsResourceFoldersLocationsBucketsCreate,
    options: BodyResponseCallback[Readable | SchemaLogBucket],
    callback: BodyResponseCallback[Readable | SchemaLogBucket]
  ): Unit = js.native
  def create(params: ParamsResourceFoldersLocationsBucketsCreate, options: MethodOptions): GaxiosPromise[SchemaLogBucket] = js.native
  def create(
    params: ParamsResourceFoldersLocationsBucketsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogBucket]
  ): Unit = js.native
  /**
    * Creates a log bucket that can be used to store log entries. After a bucket has been created, the bucket's location cannot be changed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.folders.locations.buckets.create({
    *     // Required. A client-assigned identifier such as "my-bucket". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods.
    *     bucketId: 'placeholder-value',
    *     // Required. The resource in which to create the log bucket: "projects/[PROJECT_ID]/locations/[LOCATION_ID]" For example:"projects/my-project/locations/global"
    *     parent: 'folders/my-folder/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cmekSettings": {},
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "indexConfigs": [],
    *       //   "lifecycleState": "my_lifecycleState",
    *       //   "locked": false,
    *       //   "name": "my_name",
    *       //   "restrictedFields": [],
    *       //   "retentionDays": 0,
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cmekSettings": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "indexConfigs": [],
    *   //   "lifecycleState": "my_lifecycleState",
    *   //   "locked": false,
    *   //   "name": "my_name",
    *   //   "restrictedFields": [],
    *   //   "retentionDays": 0,
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceFoldersLocationsBucketsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceFoldersLocationsBucketsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceFoldersLocationsBucketsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceFoldersLocationsBucketsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceFoldersLocationsBucketsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceFoldersLocationsBucketsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceFoldersLocationsBucketsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a log bucket.Changes the bucket's lifecycle_state to the DELETE_REQUESTED state. After 7 days, the bucket will be purged and all log entries in the bucket will be permanently deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.folders.locations.buckets.delete({
    *     // Required. The full resource name of the bucket to delete. "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket"
    *     name: 'folders/my-folder/locations/my-location/buckets/my-bucket',
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
  def delete(params: ParamsResourceFoldersLocationsBucketsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceFoldersLocationsBucketsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLogBucket] = js.native
  def get(callback: BodyResponseCallback[SchemaLogBucket]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogBucket] = js.native
  def get(params: ParamsResourceFoldersLocationsBucketsGet): GaxiosPromise[SchemaLogBucket] = js.native
  def get(params: ParamsResourceFoldersLocationsBucketsGet, callback: BodyResponseCallback[SchemaLogBucket]): Unit = js.native
  def get(
    params: ParamsResourceFoldersLocationsBucketsGet,
    options: BodyResponseCallback[Readable | SchemaLogBucket],
    callback: BodyResponseCallback[Readable | SchemaLogBucket]
  ): Unit = js.native
  def get(params: ParamsResourceFoldersLocationsBucketsGet, options: MethodOptions): GaxiosPromise[SchemaLogBucket] = js.native
  def get(
    params: ParamsResourceFoldersLocationsBucketsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogBucket]
  ): Unit = js.native
  /**
    * Gets a log bucket.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.folders.locations.buckets.get({
    *     // Required. The resource name of the bucket: "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket"
    *     name: 'folders/my-folder/locations/my-location/buckets/my-bucket',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cmekSettings": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "indexConfigs": [],
    *   //   "lifecycleState": "my_lifecycleState",
    *   //   "locked": false,
    *   //   "name": "my_name",
    *   //   "restrictedFields": [],
    *   //   "retentionDays": 0,
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceFoldersLocationsBucketsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFoldersLocationsBucketsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListBucketsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBucketsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBucketsResponse] = js.native
  def list(params: ParamsResourceFoldersLocationsBucketsList): GaxiosPromise[SchemaListBucketsResponse] = js.native
  def list(
    params: ParamsResourceFoldersLocationsBucketsList,
    callback: BodyResponseCallback[SchemaListBucketsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFoldersLocationsBucketsList,
    options: BodyResponseCallback[Readable | SchemaListBucketsResponse],
    callback: BodyResponseCallback[Readable | SchemaListBucketsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFoldersLocationsBucketsList, options: MethodOptions): GaxiosPromise[SchemaListBucketsResponse] = js.native
  def list(
    params: ParamsResourceFoldersLocationsBucketsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBucketsResponse]
  ): Unit = js.native
  /**
    * Lists log buckets.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.folders.locations.buckets.list({
    *     // Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource whose buckets are to be listed: "projects/[PROJECT_ID]/locations/[LOCATION_ID]" "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]" "folders/[FOLDER_ID]/locations/[LOCATION_ID]" Note: The locations portion of the resource must be specified, but supplying the character - in place of LOCATION_ID will return all buckets.
    *     parent: 'folders/my-folder/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "buckets": [],
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
  def list(params: ParamsResourceFoldersLocationsBucketsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFoldersLocationsBucketsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaLogBucket] = js.native
  def patch(callback: BodyResponseCallback[SchemaLogBucket]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogBucket] = js.native
  def patch(params: ParamsResourceFoldersLocationsBucketsPatch): GaxiosPromise[SchemaLogBucket] = js.native
  def patch(
    params: ParamsResourceFoldersLocationsBucketsPatch,
    callback: BodyResponseCallback[SchemaLogBucket]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFoldersLocationsBucketsPatch,
    options: BodyResponseCallback[Readable | SchemaLogBucket],
    callback: BodyResponseCallback[Readable | SchemaLogBucket]
  ): Unit = js.native
  def patch(params: ParamsResourceFoldersLocationsBucketsPatch, options: MethodOptions): GaxiosPromise[SchemaLogBucket] = js.native
  def patch(
    params: ParamsResourceFoldersLocationsBucketsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogBucket]
  ): Unit = js.native
  /**
    * Updates a log bucket. This method replaces the following fields in the existing bucket with values from the new bucket: retention_periodIf the retention period is decreased and the bucket is locked, FAILED_PRECONDITION will be returned.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been created, the bucket's location cannot be changed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.folders.locations.buckets.patch({
    *     // Required. The full resource name of the bucket to update. "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket"
    *     name: 'folders/my-folder/locations/my-location/buckets/my-bucket',
    *     // Required. Field mask that specifies the fields in bucket that need an update. A bucket field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see: https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=retention_days
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cmekSettings": {},
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "indexConfigs": [],
    *       //   "lifecycleState": "my_lifecycleState",
    *       //   "locked": false,
    *       //   "name": "my_name",
    *       //   "restrictedFields": [],
    *       //   "retentionDays": 0,
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cmekSettings": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "indexConfigs": [],
    *   //   "lifecycleState": "my_lifecycleState",
    *   //   "locked": false,
    *   //   "name": "my_name",
    *   //   "restrictedFields": [],
    *   //   "retentionDays": 0,
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceFoldersLocationsBucketsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceFoldersLocationsBucketsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undelete(): GaxiosPromise[SchemaEmpty] = js.native
  def undelete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def undelete(params: ParamsResourceFoldersLocationsBucketsUndelete): GaxiosPromise[SchemaEmpty] = js.native
  def undelete(params: ParamsResourceFoldersLocationsBucketsUndelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def undelete(
    params: ParamsResourceFoldersLocationsBucketsUndelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def undelete(params: ParamsResourceFoldersLocationsBucketsUndelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def undelete(
    params: ParamsResourceFoldersLocationsBucketsUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Undeletes a log bucket. A bucket that has been deleted can be undeleted within the grace period of 7 days.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.folders.locations.buckets.undelete({
    *     // Required. The full resource name of the bucket to undelete. "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" "folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket"
    *     name: 'folders/my-folder/locations/my-location/buckets/my-bucket',
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
  def undelete(params: ParamsResourceFoldersLocationsBucketsUndelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undelete(
    params: ParamsResourceFoldersLocationsBucketsUndelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var views: ResourceFoldersLocationsBucketsViews = js.native
}
