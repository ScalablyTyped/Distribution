package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebasestorageV1betaMod {
  
  object firebasestorageV1beta {
    
    @JSImport("googleapis/build/src/apis/firebasestorage/v1beta", "firebasestorage_v1beta.Firebasestorage")
    @js.native
    open class Firebasestorage protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var projects: ResourceProjects = js.native
    }
    
    @JSImport("googleapis/build/src/apis/firebasestorage/v1beta", "firebasestorage_v1beta.Resource$Projects")
    @js.native
    open class ResourceProjects protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var buckets: ResourceProjectsBuckets = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/firebasestorage/v1beta", "firebasestorage_v1beta.Resource$Projects$Buckets")
    @js.native
    open class ResourceProjectsBuckets protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      def addFirebase(): GaxiosPromise[SchemaBucket] = js.native
      def addFirebase(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
      def addFirebase(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
      def addFirebase(params: ParamsResourceProjectsBucketsAddfirebase): GaxiosPromise[SchemaBucket] = js.native
      def addFirebase(params: ParamsResourceProjectsBucketsAddfirebase, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
      def addFirebase(
        params: ParamsResourceProjectsBucketsAddfirebase,
        options: BodyResponseCallback[Readable | SchemaBucket],
        callback: BodyResponseCallback[Readable | SchemaBucket]
      ): Unit = js.native
      def addFirebase(params: ParamsResourceProjectsBucketsAddfirebase, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
      def addFirebase(
        params: ParamsResourceProjectsBucketsAddfirebase,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaBucket]
      ): Unit = js.native
      /**
        * Links a Google Cloud Storage bucket to a Firebase project.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/firebasestorage.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const firebasestorage = google.firebasestorage('v1beta');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/firebase',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await firebasestorage.projects.buckets.addFirebase({
        *     // Required. Resource name of the bucket, mirrors the ID of the underlying Google Cloud Storage bucket, `projects/{project_number\}/buckets/{bucket_id\}`.
        *     bucket: 'projects/my-project/buckets/my-bucket',
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
        *   // {
        *   //   "location": "my_location",
        *   //   "name": "my_name",
        *   //   "reconciling": false
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
      def addFirebase(params: ParamsResourceProjectsBucketsAddfirebase, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def addFirebase(
        params: ParamsResourceProjectsBucketsAddfirebase,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaBucket] = js.native
      def get(callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
      def get(params: ParamsResourceProjectsBucketsGet): GaxiosPromise[SchemaBucket] = js.native
      def get(params: ParamsResourceProjectsBucketsGet, callback: BodyResponseCallback[SchemaBucket]): Unit = js.native
      def get(
        params: ParamsResourceProjectsBucketsGet,
        options: BodyResponseCallback[Readable | SchemaBucket],
        callback: BodyResponseCallback[Readable | SchemaBucket]
      ): Unit = js.native
      def get(params: ParamsResourceProjectsBucketsGet, options: MethodOptions): GaxiosPromise[SchemaBucket] = js.native
      def get(
        params: ParamsResourceProjectsBucketsGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaBucket]
      ): Unit = js.native
      /**
        * Gets a single linked storage bucket.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/firebasestorage.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const firebasestorage = google.firebasestorage('v1beta');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/firebase',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await firebasestorage.projects.buckets.get({
        *     // Required. Resource name of the bucket, mirrors the ID of the underlying Google Cloud Storage bucket, `projects/{project_number\}/buckets/{bucket_id\}`.
        *     name: 'projects/my-project/buckets/my-bucket',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "location": "my_location",
        *   //   "name": "my_name",
        *   //   "reconciling": false
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
      def get(params: ParamsResourceProjectsBucketsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceProjectsBucketsGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def list(): GaxiosPromise[SchemaListBucketsResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListBucketsResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBucketsResponse] = js.native
      def list(params: ParamsResourceProjectsBucketsList): GaxiosPromise[SchemaListBucketsResponse] = js.native
      def list(
        params: ParamsResourceProjectsBucketsList,
        callback: BodyResponseCallback[SchemaListBucketsResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceProjectsBucketsList,
        options: BodyResponseCallback[Readable | SchemaListBucketsResponse],
        callback: BodyResponseCallback[Readable | SchemaListBucketsResponse]
      ): Unit = js.native
      def list(params: ParamsResourceProjectsBucketsList, options: MethodOptions): GaxiosPromise[SchemaListBucketsResponse] = js.native
      def list(
        params: ParamsResourceProjectsBucketsList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListBucketsResponse]
      ): Unit = js.native
      /**
        * Lists the linked storage buckets for a project.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/firebasestorage.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const firebasestorage = google.firebasestorage('v1beta');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/firebase',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await firebasestorage.projects.buckets.list({
        *     // The maximum number of buckets to return. If not set, the server will use a reasonable default.
        *     pageSize: 'placeholder-value',
        *     // A page token, received from a previous `ListBuckets` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListBuckets` must match the call that provided the page token.
        *     pageToken: 'placeholder-value',
        *     // Required. Resource name of the parent Firebase project, `projects/{project_number\}`.
        *     parent: 'projects/my-project',
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
      def list(params: ParamsResourceProjectsBucketsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceProjectsBucketsList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def removeFirebase(): GaxiosPromise[SchemaEmpty] = js.native
      def removeFirebase(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def removeFirebase(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def removeFirebase(params: ParamsResourceProjectsBucketsRemovefirebase): GaxiosPromise[SchemaEmpty] = js.native
      def removeFirebase(params: ParamsResourceProjectsBucketsRemovefirebase, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def removeFirebase(
        params: ParamsResourceProjectsBucketsRemovefirebase,
        options: BodyResponseCallback[Readable | SchemaEmpty],
        callback: BodyResponseCallback[Readable | SchemaEmpty]
      ): Unit = js.native
      def removeFirebase(params: ParamsResourceProjectsBucketsRemovefirebase, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def removeFirebase(
        params: ParamsResourceProjectsBucketsRemovefirebase,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      /**
        * Unlinks a linked Google Cloud Storage bucket from a Firebase project.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/firebasestorage.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const firebasestorage = google.firebasestorage('v1beta');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/firebase',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await firebasestorage.projects.buckets.removeFirebase({
        *     // Required. Resource name of the bucket, mirrors the ID of the underlying Google Cloud Storage bucket, `projects/{project_number\}/buckets/{bucket_id\}`.
        *     bucket: 'projects/my-project/buckets/my-bucket',
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
      def removeFirebase(params: ParamsResourceProjectsBucketsRemovefirebase, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def removeFirebase(
        params: ParamsResourceProjectsBucketsRemovefirebase,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1beta
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1beta")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1beta): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceProjectsBucketsAddfirebase
      extends StObject
         with StandardParameters {
      
      /**
        * Required. Resource name of the bucket, mirrors the ID of the underlying Google Cloud Storage bucket, `projects/{project_number\}/buckets/{bucket_id\}`.
        */
      var bucket: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaAddFirebaseRequest] = js.undefined
    }
    object ParamsResourceProjectsBucketsAddfirebase {
      
      inline def apply(): ParamsResourceProjectsBucketsAddfirebase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsBucketsAddfirebase]
      }
      
      extension [Self <: ParamsResourceProjectsBucketsAddfirebase](x: Self) {
        
        inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
        
        inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
        
        inline def setRequestBody(value: SchemaAddFirebaseRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsBucketsGet
      extends StObject
         with StandardParameters {
      
      /**
        * Required. Resource name of the bucket, mirrors the ID of the underlying Google Cloud Storage bucket, `projects/{project_number\}/buckets/{bucket_id\}`.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsBucketsGet {
      
      inline def apply(): ParamsResourceProjectsBucketsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsBucketsGet]
      }
      
      extension [Self <: ParamsResourceProjectsBucketsGet](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsBucketsList
      extends StObject
         with StandardParameters {
      
      /**
        * The maximum number of buckets to return. If not set, the server will use a reasonable default.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * A page token, received from a previous `ListBuckets` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListBuckets` must match the call that provided the page token.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Required. Resource name of the parent Firebase project, `projects/{project_number\}`.
        */
      var parent: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsBucketsList {
      
      inline def apply(): ParamsResourceProjectsBucketsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsBucketsList]
      }
      
      extension [Self <: ParamsResourceProjectsBucketsList](x: Self) {
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsBucketsRemovefirebase
      extends StObject
         with StandardParameters {
      
      /**
        * Required. Resource name of the bucket, mirrors the ID of the underlying Google Cloud Storage bucket, `projects/{project_number\}/buckets/{bucket_id\}`.
        */
      var bucket: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaRemoveFirebaseRequest] = js.undefined
    }
    object ParamsResourceProjectsBucketsRemovefirebase {
      
      inline def apply(): ParamsResourceProjectsBucketsRemovefirebase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsBucketsRemovefirebase]
      }
      
      extension [Self <: ParamsResourceProjectsBucketsRemovefirebase](x: Self) {
        
        inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
        
        inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
        
        inline def setRequestBody(value: SchemaRemoveFirebaseRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait SchemaAddFirebaseRequest extends StObject
    
    trait SchemaBucket extends StObject {
      
      /**
        * Output only. Location of the storage bucket.
        */
      var location: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Resource name of the bucket.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Output only. Represents whether a bucket is being moved to a new location, in which case reconciling is set to true.
        */
      var reconciling: js.UndefOr[Boolean | Null] = js.undefined
    }
    object SchemaBucket {
      
      inline def apply(): SchemaBucket = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaBucket]
      }
      
      extension [Self <: SchemaBucket](x: Self) {
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationNull: Self = StObject.set(x, "location", null)
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setReconciling(value: Boolean): Self = StObject.set(x, "reconciling", value.asInstanceOf[js.Any])
        
        inline def setReconcilingNull: Self = StObject.set(x, "reconciling", null)
        
        inline def setReconcilingUndefined: Self = StObject.set(x, "reconciling", js.undefined)
      }
    }
    
    trait SchemaEmpty extends StObject
    
    trait SchemaGoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata extends StObject {
      
      /**
        * The time the LRO was created.
        */
      var createTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The time the LRO was last updated.
        */
      var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The current state of the migration.
        */
      var state: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaGoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata {
      
      inline def apply(): SchemaGoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata]
      }
      
      extension [Self <: SchemaGoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata](x: Self) {
        
        inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
        
        inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
        
        inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
        
        inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
        
        inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
        
        inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateNull: Self = StObject.set(x, "state", null)
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
    
    trait SchemaGoogleFirebaseStorageControlplaneV1betaMigrateLocationDestructivelyMetadata extends StObject {
      
      /**
        * The time the LRO was created.
        */
      var createTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The time the LRO was last updated.
        */
      var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The current state of the migration.
        */
      var state: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaGoogleFirebaseStorageControlplaneV1betaMigrateLocationDestructivelyMetadata {
      
      inline def apply(): SchemaGoogleFirebaseStorageControlplaneV1betaMigrateLocationDestructivelyMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleFirebaseStorageControlplaneV1betaMigrateLocationDestructivelyMetadata]
      }
      
      extension [Self <: SchemaGoogleFirebaseStorageControlplaneV1betaMigrateLocationDestructivelyMetadata](x: Self) {
        
        inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
        
        inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
        
        inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
        
        inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
        
        inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
        
        inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateNull: Self = StObject.set(x, "state", null)
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
    
    trait SchemaListBucketsResponse extends StObject {
      
      /**
        * The list of linked buckets.
        */
      var buckets: js.UndefOr[js.Array[SchemaBucket]] = js.undefined
      
      /**
        * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaListBucketsResponse {
      
      inline def apply(): SchemaListBucketsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListBucketsResponse]
      }
      
      extension [Self <: SchemaListBucketsResponse](x: Self) {
        
        inline def setBuckets(value: js.Array[SchemaBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
        
        inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
        
        inline def setBucketsVarargs(value: SchemaBucket*): Self = StObject.set(x, "buckets", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait SchemaRemoveFirebaseRequest extends StObject
    
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.undefined
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.undefined
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.undefined
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAuth(
          value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
        ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
