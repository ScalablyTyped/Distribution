package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.anon.Identifier
import typings.googleapis.googleapisStrings.v1
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

object siteVerificationV1Mod {
  
  object siteVerificationV1 {
    
    @JSImport("googleapis/build/src/apis/siteVerification/v1", "siteVerification_v1.Resource$Webresource")
    @js.native
    open class ResourceWebresource protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def delete(): GaxiosPromise[Unit] = js.native
      def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
      def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def delete(params: ParamsResourceWebresourceDelete): GaxiosPromise[Unit] = js.native
      def delete(params: ParamsResourceWebresourceDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
      def delete(
        params: ParamsResourceWebresourceDelete,
        options: BodyResponseCallback[Readable | Unit],
        callback: BodyResponseCallback[Readable | Unit]
      ): Unit = js.native
      def delete(params: ParamsResourceWebresourceDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def delete(
        params: ParamsResourceWebresourceDelete,
        options: MethodOptions,
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      /**
        * Relinquish ownership of a website or domain.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/siteVerification.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const siteVerification = google.siteVerification('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/siteverification'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await siteVerification.webResource.delete({
        *     // The id of a verified site or domain.
        *     id: 'placeholder-value',
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
      def delete(params: ParamsResourceWebresourceDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def delete(
        params: ParamsResourceWebresourceDelete,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def get(): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def get(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def get(params: ParamsResourceWebresourceGet): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def get(
        params: ParamsResourceWebresourceGet,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      def get(
        params: ParamsResourceWebresourceGet,
        options: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceResource],
        callback: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      def get(params: ParamsResourceWebresourceGet, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def get(
        params: ParamsResourceWebresourceGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      /**
        * Get the most current data for a website or domain.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/siteVerification.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const siteVerification = google.siteVerification('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/siteverification'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await siteVerification.webResource.get({
        *     // The id of a verified site or domain.
        *     id: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "id": "my_id",
        *   //   "owners": [],
        *   //   "site": {}
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
      def get(params: ParamsResourceWebresourceGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceWebresourceGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def getToken(): GaxiosPromise[SchemaSiteVerificationWebResourceGettokenResponse] = js.native
      def getToken(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceGettokenResponse]): Unit = js.native
      def getToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceGettokenResponse] = js.native
      def getToken(params: ParamsResourceWebresourceGettoken): GaxiosPromise[SchemaSiteVerificationWebResourceGettokenResponse] = js.native
      def getToken(
        params: ParamsResourceWebresourceGettoken,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceGettokenResponse]
      ): Unit = js.native
      def getToken(
        params: ParamsResourceWebresourceGettoken,
        options: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceGettokenResponse],
        callback: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceGettokenResponse]
      ): Unit = js.native
      def getToken(params: ParamsResourceWebresourceGettoken, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceGettokenResponse] = js.native
      def getToken(
        params: ParamsResourceWebresourceGettoken,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceGettokenResponse]
      ): Unit = js.native
      /**
        * Get a verification token for placing on a website or domain.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/siteVerification.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const siteVerification = google.siteVerification('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/siteverification',
        *       'https://www.googleapis.com/auth/siteverification.verify_only',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await siteVerification.webResource.getToken({
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "site": {},
        *       //   "verificationMethod": "my_verificationMethod"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "method": "my_method",
        *   //   "token": "my_token"
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
      def getToken(params: ParamsResourceWebresourceGettoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def getToken(
        params: ParamsResourceWebresourceGettoken,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def insert(): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def insert(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]): Unit = js.native
      def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def insert(params: ParamsResourceWebresourceInsert): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def insert(
        params: ParamsResourceWebresourceInsert,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      def insert(
        params: ParamsResourceWebresourceInsert,
        options: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceResource],
        callback: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      def insert(params: ParamsResourceWebresourceInsert, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def insert(
        params: ParamsResourceWebresourceInsert,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      /**
        * Attempt verification of a website or domain.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/siteVerification.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const siteVerification = google.siteVerification('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/siteverification',
        *       'https://www.googleapis.com/auth/siteverification.verify_only',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await siteVerification.webResource.insert({
        *     // The method to use for verifying a site or domain.
        *     verificationMethod: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "id": "my_id",
        *       //   "owners": [],
        *       //   "site": {}
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "id": "my_id",
        *   //   "owners": [],
        *   //   "site": {}
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
      def insert(params: ParamsResourceWebresourceInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def insert(
        params: ParamsResourceWebresourceInsert,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def list(): GaxiosPromise[SchemaSiteVerificationWebResourceListResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceListResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceListResponse] = js.native
      def list(params: ParamsResourceWebresourceList): GaxiosPromise[SchemaSiteVerificationWebResourceListResponse] = js.native
      def list(
        params: ParamsResourceWebresourceList,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceListResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceWebresourceList,
        options: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceListResponse],
        callback: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceListResponse]
      ): Unit = js.native
      def list(params: ParamsResourceWebresourceList, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceListResponse] = js.native
      def list(
        params: ParamsResourceWebresourceList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceListResponse]
      ): Unit = js.native
      /**
        * Get the list of your verified websites and domains.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/siteVerification.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const siteVerification = google.siteVerification('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/siteverification'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await siteVerification.webResource.list({});
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "items": []
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
      def list(params: ParamsResourceWebresourceList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceWebresourceList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def patch(): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def patch(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]): Unit = js.native
      def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def patch(params: ParamsResourceWebresourcePatch): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def patch(
        params: ParamsResourceWebresourcePatch,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      def patch(
        params: ParamsResourceWebresourcePatch,
        options: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceResource],
        callback: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      def patch(params: ParamsResourceWebresourcePatch, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def patch(
        params: ParamsResourceWebresourcePatch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      /**
        * Modify the list of owners for your website or domain. This method supports patch semantics.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/siteVerification.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const siteVerification = google.siteVerification('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/siteverification'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await siteVerification.webResource.patch({
        *     // The id of a verified site or domain.
        *     id: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "id": "my_id",
        *       //   "owners": [],
        *       //   "site": {}
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "id": "my_id",
        *   //   "owners": [],
        *   //   "site": {}
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
      def patch(params: ParamsResourceWebresourcePatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def patch(
        params: ParamsResourceWebresourcePatch,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def update(): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def update(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]): Unit = js.native
      def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def update(params: ParamsResourceWebresourceUpdate): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def update(
        params: ParamsResourceWebresourceUpdate,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      def update(
        params: ParamsResourceWebresourceUpdate,
        options: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceResource],
        callback: BodyResponseCallback[Readable | SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      def update(params: ParamsResourceWebresourceUpdate, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
      def update(
        params: ParamsResourceWebresourceUpdate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
      ): Unit = js.native
      /**
        * Modify the list of owners for your website or domain.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/siteVerification.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const siteVerification = google.siteVerification('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/siteverification'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await siteVerification.webResource.update({
        *     // The id of a verified site or domain.
        *     id: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "id": "my_id",
        *       //   "owners": [],
        *       //   "site": {}
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "id": "my_id",
        *   //   "owners": [],
        *   //   "site": {}
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
      def update(params: ParamsResourceWebresourceUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def update(
        params: ParamsResourceWebresourceUpdate,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/siteVerification/v1", "siteVerification_v1.Siteverification")
    @js.native
    open class Siteverification protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var webResource: ResourceWebresource = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceWebresourceDelete
      extends StObject
         with StandardParameters {
      
      /**
        * The id of a verified site or domain.
        */
      var id: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceWebresourceDelete {
      
      inline def apply(): ParamsResourceWebresourceDelete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceWebresourceDelete]
      }
      
      extension [Self <: ParamsResourceWebresourceDelete](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    trait ParamsResourceWebresourceGet
      extends StObject
         with StandardParameters {
      
      /**
        * The id of a verified site or domain.
        */
      var id: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceWebresourceGet {
      
      inline def apply(): ParamsResourceWebresourceGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceWebresourceGet]
      }
      
      extension [Self <: ParamsResourceWebresourceGet](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    trait ParamsResourceWebresourceGettoken
      extends StObject
         with StandardParameters {
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaSiteVerificationWebResourceGettokenRequest] = js.undefined
    }
    object ParamsResourceWebresourceGettoken {
      
      inline def apply(): ParamsResourceWebresourceGettoken = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceWebresourceGettoken]
      }
      
      extension [Self <: ParamsResourceWebresourceGettoken](x: Self) {
        
        inline def setRequestBody(value: SchemaSiteVerificationWebResourceGettokenRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceWebresourceInsert
      extends StObject
         with StandardParameters {
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaSiteVerificationWebResourceResource] = js.undefined
      
      /**
        * The method to use for verifying a site or domain.
        */
      var verificationMethod: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceWebresourceInsert {
      
      inline def apply(): ParamsResourceWebresourceInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceWebresourceInsert]
      }
      
      extension [Self <: ParamsResourceWebresourceInsert](x: Self) {
        
        inline def setRequestBody(value: SchemaSiteVerificationWebResourceResource): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setVerificationMethod(value: String): Self = StObject.set(x, "verificationMethod", value.asInstanceOf[js.Any])
        
        inline def setVerificationMethodUndefined: Self = StObject.set(x, "verificationMethod", js.undefined)
      }
    }
    
    type ParamsResourceWebresourceList = StandardParameters
    
    trait ParamsResourceWebresourcePatch
      extends StObject
         with StandardParameters {
      
      /**
        * The id of a verified site or domain.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaSiteVerificationWebResourceResource] = js.undefined
    }
    object ParamsResourceWebresourcePatch {
      
      inline def apply(): ParamsResourceWebresourcePatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceWebresourcePatch]
      }
      
      extension [Self <: ParamsResourceWebresourcePatch](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setRequestBody(value: SchemaSiteVerificationWebResourceResource): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceWebresourceUpdate
      extends StObject
         with StandardParameters {
      
      /**
        * The id of a verified site or domain.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaSiteVerificationWebResourceResource] = js.undefined
    }
    object ParamsResourceWebresourceUpdate {
      
      inline def apply(): ParamsResourceWebresourceUpdate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceWebresourceUpdate]
      }
      
      extension [Self <: ParamsResourceWebresourceUpdate](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setRequestBody(value: SchemaSiteVerificationWebResourceResource): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait SchemaSiteVerificationWebResourceGettokenRequest extends StObject {
      
      /**
        * The site for which a verification token will be generated.
        */
      var site: js.UndefOr[Identifier | Null] = js.undefined
      
      /**
        * The verification method that will be used to verify this site. For sites, 'FILE' or 'META' methods may be used. For domains, only 'DNS' may be used.
        */
      var verificationMethod: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaSiteVerificationWebResourceGettokenRequest {
      
      inline def apply(): SchemaSiteVerificationWebResourceGettokenRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSiteVerificationWebResourceGettokenRequest]
      }
      
      extension [Self <: SchemaSiteVerificationWebResourceGettokenRequest](x: Self) {
        
        inline def setSite(value: Identifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
        
        inline def setSiteNull: Self = StObject.set(x, "site", null)
        
        inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
        
        inline def setVerificationMethod(value: String): Self = StObject.set(x, "verificationMethod", value.asInstanceOf[js.Any])
        
        inline def setVerificationMethodNull: Self = StObject.set(x, "verificationMethod", null)
        
        inline def setVerificationMethodUndefined: Self = StObject.set(x, "verificationMethod", js.undefined)
      }
    }
    
    trait SchemaSiteVerificationWebResourceGettokenResponse extends StObject {
      
      /**
        * The verification method to use in conjunction with this token. For FILE, the token should be placed in the top-level directory of the site, stored inside a file of the same name. For META, the token should be placed in the HEAD tag of the default page that is loaded for the site. For DNS, the token should be placed in a TXT record of the domain.
        */
      var method: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The verification token. The token must be placed appropriately in order for verification to succeed.
        */
      var token: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaSiteVerificationWebResourceGettokenResponse {
      
      inline def apply(): SchemaSiteVerificationWebResourceGettokenResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSiteVerificationWebResourceGettokenResponse]
      }
      
      extension [Self <: SchemaSiteVerificationWebResourceGettokenResponse](x: Self) {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodNull: Self = StObject.set(x, "method", null)
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenNull: Self = StObject.set(x, "token", null)
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    trait SchemaSiteVerificationWebResourceListResponse extends StObject {
      
      /**
        * The list of sites that are owned by the authenticated user.
        */
      var items: js.UndefOr[js.Array[SchemaSiteVerificationWebResourceResource]] = js.undefined
    }
    object SchemaSiteVerificationWebResourceListResponse {
      
      inline def apply(): SchemaSiteVerificationWebResourceListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSiteVerificationWebResourceListResponse]
      }
      
      extension [Self <: SchemaSiteVerificationWebResourceListResponse](x: Self) {
        
        inline def setItems(value: js.Array[SchemaSiteVerificationWebResourceResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SchemaSiteVerificationWebResourceResource*): Self = StObject.set(x, "items", js.Array(value*))
      }
    }
    
    trait SchemaSiteVerificationWebResourceResource extends StObject {
      
      /**
        * The string used to identify this site. This value should be used in the "id" portion of the REST URL for the Get, Update, and Delete operations.
        */
      var id: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The email addresses of all verified owners.
        */
      var owners: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * The address and type of a site that is verified or will be verified.
        */
      var site: js.UndefOr[Identifier | Null] = js.undefined
    }
    object SchemaSiteVerificationWebResourceResource {
      
      inline def apply(): SchemaSiteVerificationWebResourceResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSiteVerificationWebResourceResource]
      }
      
      extension [Self <: SchemaSiteVerificationWebResourceResource](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdNull: Self = StObject.set(x, "id", null)
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
        
        inline def setOwnersNull: Self = StObject.set(x, "owners", null)
        
        inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
        
        inline def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value*))
        
        inline def setSite(value: Identifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
        
        inline def setSiteNull: Self = StObject.set(x, "site", null)
        
        inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
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
        * An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAuth(
          value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
        ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
        
        inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
