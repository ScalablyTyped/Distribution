package typings.googleapis.storageV1Mod.storageV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Buckets")
@js.native
class ResourceBuckets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.buckets.delete
    * @desc Permanently deletes an empty bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.buckets.delete(request, function(err) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.buckets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch If set, only deletes the bucket if its metageneration matches this value.
    * @param {string=} params.ifMetagenerationNotMatch If set, only deletes the bucket if its metageneration does not match this value.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceBucketsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceBucketsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceBucketsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * storage.buckets.get
    * @desc Returns metadata for the specified bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.buckets.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.buckets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBucket] = js.native
  def get(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def get(params: ParamsResourceBucketsGet): GaxiosPromise[SchemaBucket] = js.native
  def get(params: ParamsResourceBucketsGet, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def get(
    params: ParamsResourceBucketsGet,
    options: BodyResponseCallback[SchemaBucket],
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  def get(params: ParamsResourceBucketsGet, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def get(
    params: ParamsResourceBucketsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.getIamPolicy
    * @desc Returns an IAM policy for the specified bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.buckets.getIamPolicy(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.buckets.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceBucketsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceBucketsGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceBucketsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceBucketsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceBucketsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * storage.buckets.insert
    * @desc Creates a new bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // A valid API project identifier.
    *     project: '',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.buckets.insert(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.buckets.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.predefinedAcl Apply a predefined set of access controls to this bucket.
    * @param {string=} params.predefinedDefaultObjectAcl Apply a predefined set of default object access controls to this bucket.
    * @param {string} params.project A valid API project identifier.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the bucket resource specifies acl or defaultObjectAcl properties, when it defaults to full.
    * @param {string=} params.userProject The project to be billed for this request.
    * @param {().Bucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaBucket] = js.native
  def insert(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def insert(params: ParamsResourceBucketsInsert): GaxiosPromise[SchemaBucket] = js.native
  def insert(params: ParamsResourceBucketsInsert, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def insert(
    params: ParamsResourceBucketsInsert,
    options: BodyResponseCallback[SchemaBucket],
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  def insert(params: ParamsResourceBucketsInsert, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def insert(
    params: ParamsResourceBucketsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.list
    * @desc Retrieves a list of buckets for a given project.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // A valid API project identifier.
    *     project: '',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var itemsPage = response['items'];
    *     if (!itemsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < itemsPage.length; i++) {
    *       // TODO: Change code below to process each resource in `itemsPage`:
    *       console.log(JSON.stringify(itemsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       storage.buckets.list(request, handlePage);
    *     }
    *   };
    *
    *   storage.buckets.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.buckets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of buckets to return in a single response. The service will use this parameter or 1,000 items, whichever is smaller.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string=} params.prefix Filter results to buckets whose names begin with this prefix.
    * @param {string} params.project A valid API project identifier.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {string=} params.userProject The project to be billed for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBuckets] = js.native
  def list(callback: BodyResponseCallback[SchemaBuckets]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBuckets] = js.native
  def list(params: ParamsResourceBucketsList): GaxiosPromise[SchemaBuckets] = js.native
  def list(params: ParamsResourceBucketsList, callback: BodyResponseCallback[SchemaBuckets]): Unit = js.native
  def list(
    params: ParamsResourceBucketsList,
    options: BodyResponseCallback[SchemaBuckets],
    callback: BodyResponseCallback[SchemaBuckets]
  ): Unit = js.native
  def list(params: ParamsResourceBucketsList, options: MethodOptions): GaxiosPromise[SchemaBuckets] = js.native
  def list(
    params: ParamsResourceBucketsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuckets]
  ): Unit = js.native
  /**
    * storage.buckets.lockRetentionPolicy
    * @desc Locks retention policy on a bucket.
    * @alias storage.buckets.lockRetentionPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.ifMetagenerationMatch Makes the operation conditional on whether bucket's current metageneration matches the given value.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def lockRetentionPolicy(): GaxiosPromise[SchemaBucket] = js.native
  def lockRetentionPolicy(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def lockRetentionPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def lockRetentionPolicy(params: ParamsResourceBucketsLockretentionpolicy): GaxiosPromise[SchemaBucket] = js.native
  def lockRetentionPolicy(params: ParamsResourceBucketsLockretentionpolicy, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def lockRetentionPolicy(
    params: ParamsResourceBucketsLockretentionpolicy,
    options: BodyResponseCallback[SchemaBucket],
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  def lockRetentionPolicy(params: ParamsResourceBucketsLockretentionpolicy, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def lockRetentionPolicy(
    params: ParamsResourceBucketsLockretentionpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.patch
    * @desc Patches a bucket. Changes to the bucket will be readable
    * immediately after writing, but configuration changes may take time to
    * propagate.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.buckets.patch(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.buckets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.predefinedAcl Apply a predefined set of access controls to this bucket.
    * @param {string=} params.predefinedDefaultObjectAcl Apply a predefined set of default object access controls to this bucket.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().Bucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaBucket] = js.native
  def patch(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def patch(params: ParamsResourceBucketsPatch): GaxiosPromise[SchemaBucket] = js.native
  def patch(params: ParamsResourceBucketsPatch, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def patch(
    params: ParamsResourceBucketsPatch,
    options: BodyResponseCallback[SchemaBucket],
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  def patch(params: ParamsResourceBucketsPatch, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def patch(
    params: ParamsResourceBucketsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  /**
    * storage.buckets.setIamPolicy
    * @desc Updates an IAM policy for the specified bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.buckets.setIamPolicy(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.buckets.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().Policy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceBucketsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceBucketsSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceBucketsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceBucketsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceBucketsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * storage.buckets.testIamPermissions
    * @desc Tests a set of permissions on the given bucket to see which, if
    * any, are held by the caller.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Permissions to test.
    *     permissions: [],  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.buckets.testIamPermissions(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.buckets.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.permissions Permissions to test.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceBucketsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBucketsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceBucketsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceBucketsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBucketsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * storage.buckets.update
    * @desc Updates a bucket. Changes to the bucket will be readable
    * immediately after writing, but configuration changes may take time to
    * propagate.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.buckets.update(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.buckets.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.predefinedAcl Apply a predefined set of access controls to this bucket.
    * @param {string=} params.predefinedDefaultObjectAcl Apply a predefined set of default object access controls to this bucket.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().Bucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaBucket] = js.native
  def update(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def update(params: ParamsResourceBucketsUpdate): GaxiosPromise[SchemaBucket] = js.native
  def update(params: ParamsResourceBucketsUpdate, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
  def update(
    params: ParamsResourceBucketsUpdate,
    options: BodyResponseCallback[SchemaBucket],
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
  def update(params: ParamsResourceBucketsUpdate, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
  def update(
    params: ParamsResourceBucketsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBucket]
  ): Unit = js.native
}

