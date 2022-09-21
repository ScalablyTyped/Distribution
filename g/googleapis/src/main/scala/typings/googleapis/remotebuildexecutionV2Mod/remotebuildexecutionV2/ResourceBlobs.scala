package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Resource$Blobs")
@js.native
open class ResourceBlobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchRead(): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse] = js.native
  def batchRead(callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse]): Unit = js.native
  def batchRead(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse] = js.native
  def batchRead(params: ParamsResourceBlobsBatchread): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse] = js.native
  def batchRead(
    params: ParamsResourceBlobsBatchread,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  ): Unit = js.native
  def batchRead(
    params: ParamsResourceBlobsBatchread,
    options: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse],
    callback: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  ): Unit = js.native
  def batchRead(params: ParamsResourceBlobsBatchread, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse] = js.native
  def batchRead(
    params: ParamsResourceBlobsBatchread,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  ): Unit = js.native
  /**
    * Download many blobs at once. The server may enforce a limit of the combined total size of blobs to be downloaded using this API. This limit may be obtained using the Capabilities API. Requests exceeding the limit should either be split into smaller chunks or downloaded using the ByteStream API, as appropriate. This request is equivalent to calling a Bytestream `Read` request on each individual blob, in parallel. The requests may succeed or fail independently. Errors: * `INVALID_ARGUMENT`: The client attempted to read more than the server supported limit. Every error on individual read will be returned in the corresponding digest status.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/remotebuildexecution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v2');
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
    *   const res = await remotebuildexecution.blobs.batchRead({
    *     // The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    *     instanceName: '.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "digests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "responses": []
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
  def batchRead(params: ParamsResourceBlobsBatchread, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchRead(
    params: ParamsResourceBlobsBatchread,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdate(): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] = js.native
  def batchUpdate(params: ParamsResourceBlobsBatchupdate): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] = js.native
  def batchUpdate(
    params: ParamsResourceBlobsBatchupdate,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceBlobsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse],
    callback: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceBlobsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] = js.native
  def batchUpdate(
    params: ParamsResourceBlobsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  ): Unit = js.native
  /**
    * Upload many blobs at once. The server may enforce a limit of the combined total size of blobs to be uploaded using this API. This limit may be obtained using the Capabilities API. Requests exceeding the limit should either be split into smaller chunks or uploaded using the ByteStream API, as appropriate. This request is equivalent to calling a Bytestream `Write` request on each individual blob, in parallel. The requests may succeed or fail independently. Errors: * `INVALID_ARGUMENT`: The client attempted to upload more than the server supported limit. Individual requests may return the following errors, additionally: * `RESOURCE_EXHAUSTED`: There is insufficient disk quota to store the blob. * `INVALID_ARGUMENT`: The Digest does not match the provided data.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/remotebuildexecution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v2');
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
    *   const res = await remotebuildexecution.blobs.batchUpdate({
    *     // The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    *     instanceName: '.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "responses": []
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
  def batchUpdate(params: ParamsResourceBlobsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceBlobsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def findMissing(): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse] = js.native
  def findMissing(callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse]): Unit = js.native
  def findMissing(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse] = js.native
  def findMissing(params: ParamsResourceBlobsFindmissing): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse] = js.native
  def findMissing(
    params: ParamsResourceBlobsFindmissing,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  ): Unit = js.native
  def findMissing(
    params: ParamsResourceBlobsFindmissing,
    options: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse],
    callback: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  ): Unit = js.native
  def findMissing(params: ParamsResourceBlobsFindmissing, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse] = js.native
  def findMissing(
    params: ParamsResourceBlobsFindmissing,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  ): Unit = js.native
  /**
    * Determine if blobs are present in the CAS. Clients can use this API before uploading blobs to determine which ones are already present in the CAS and do not need to be uploaded again. Servers SHOULD increase the lifetimes of the referenced blobs if necessary and applicable. There are no method-specific errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/remotebuildexecution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v2');
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
    *   const res = await remotebuildexecution.blobs.findMissing({
    *     // The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    *     instanceName: '.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "blobDigests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "missingBlobDigests": []
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
  def findMissing(params: ParamsResourceBlobsFindmissing, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def findMissing(
    params: ParamsResourceBlobsFindmissing,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getTree(): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2GetTreeResponse] = js.native
  def getTree(callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2GetTreeResponse]): Unit = js.native
  def getTree(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2GetTreeResponse] = js.native
  def getTree(params: ParamsResourceBlobsGettree): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2GetTreeResponse] = js.native
  def getTree(
    params: ParamsResourceBlobsGettree,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2GetTreeResponse]
  ): Unit = js.native
  def getTree(
    params: ParamsResourceBlobsGettree,
    options: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2GetTreeResponse],
    callback: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2GetTreeResponse]
  ): Unit = js.native
  def getTree(params: ParamsResourceBlobsGettree, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2GetTreeResponse] = js.native
  def getTree(
    params: ParamsResourceBlobsGettree,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2GetTreeResponse]
  ): Unit = js.native
  /**
    * Fetch the entire directory tree rooted at a node. This request must be targeted at a Directory stored in the ContentAddressableStorage (CAS). The server will enumerate the `Directory` tree recursively and return every node descended from the root. The GetTreeRequest.page_token parameter can be used to skip ahead in the stream (e.g. when retrying a partially completed and aborted request), by setting it to a value taken from GetTreeResponse.next_page_token of the last successfully processed GetTreeResponse). The exact traversal order is unspecified and, unless retrieving subsequent pages from an earlier request, is not guaranteed to be stable across multiple invocations of `GetTree`. If part of the tree is missing from the CAS, the server will return the portion present and omit the rest. Errors: * `NOT_FOUND`: The requested tree root is not present in the CAS.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/remotebuildexecution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v2');
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
    *   const res = await remotebuildexecution.blobs.getTree({
    *     // The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long.
    *     hash: 'placeholder-value',
    *     // The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    *     instanceName: '.*',
    *     // A maximum page size to request. If present, the server will request no more than this many items. Regardless of whether a page size is specified, the server may place its own limit on the number of items to be returned and require the client to retrieve more items using a subsequent request.
    *     pageSize: 'placeholder-value',
    *     // A page token, which must be a value received in a previous GetTreeResponse. If present, the server will use that token as an offset, returning only that page and the ones that succeed it.
    *     pageToken: 'placeholder-value',
    *     // The size of the blob, in bytes.
    *     sizeBytes: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "directories": [],
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
  def getTree(params: ParamsResourceBlobsGettree, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getTree(
    params: ParamsResourceBlobsGettree,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
