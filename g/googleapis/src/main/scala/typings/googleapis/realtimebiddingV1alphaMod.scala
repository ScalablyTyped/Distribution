package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1alpha
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

object realtimebiddingV1alphaMod {
  
  object realtimebiddingV1alpha {
    
    @JSImport("googleapis/build/src/apis/realtimebidding/v1alpha", "realtimebidding_v1alpha.Realtimebidding")
    @js.native
    open class Realtimebidding protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var bidders: ResourceBidders = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/realtimebidding/v1alpha", "realtimebidding_v1alpha.Resource$Bidders")
    @js.native
    open class ResourceBidders protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var biddingFunctions: ResourceBiddersBiddingfunctions = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/realtimebidding/v1alpha", "realtimebidding_v1alpha.Resource$Bidders$Biddingfunctions")
    @js.native
    open class ResourceBiddersBiddingfunctions protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      def activate(): GaxiosPromise[SchemaBiddingFunction] = js.native
      def activate(callback: BodyResponseCallback[SchemaBiddingFunction]): Unit = js.native
      def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBiddingFunction] = js.native
      def activate(params: ParamsResourceBiddersBiddingfunctionsActivate): GaxiosPromise[SchemaBiddingFunction] = js.native
      def activate(
        params: ParamsResourceBiddersBiddingfunctionsActivate,
        callback: BodyResponseCallback[SchemaBiddingFunction]
      ): Unit = js.native
      def activate(
        params: ParamsResourceBiddersBiddingfunctionsActivate,
        options: BodyResponseCallback[Readable | SchemaBiddingFunction],
        callback: BodyResponseCallback[Readable | SchemaBiddingFunction]
      ): Unit = js.native
      def activate(params: ParamsResourceBiddersBiddingfunctionsActivate, options: MethodOptions): GaxiosPromise[SchemaBiddingFunction] = js.native
      def activate(
        params: ParamsResourceBiddersBiddingfunctionsActivate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaBiddingFunction]
      ): Unit = js.native
      /**
        * Activates an existing bidding function. An activated function is available for invocation for the server-side TURTLEDOVE simulations.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const realtimebidding = google.realtimebidding('v1alpha');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await realtimebidding.bidders.biddingFunctions.activate({
        *     // Required. The name of the bidding function to activate. Format: `bidders/{bidder_account_id\}/biddingFunction/{bidding_function_name\}`
        *     name: 'bidders/my-bidder/biddingFunctions/my-biddingFunction',
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
        *   //   "biddingFunction": "my_biddingFunction",
        *   //   "name": "my_name",
        *   //   "state": "my_state",
        *   //   "type": "my_type"
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
      def activate(params: ParamsResourceBiddersBiddingfunctionsActivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def activate(
        params: ParamsResourceBiddersBiddingfunctionsActivate,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def archive(): GaxiosPromise[SchemaBiddingFunction] = js.native
      def archive(callback: BodyResponseCallback[SchemaBiddingFunction]): Unit = js.native
      def archive(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBiddingFunction] = js.native
      def archive(params: ParamsResourceBiddersBiddingfunctionsArchive): GaxiosPromise[SchemaBiddingFunction] = js.native
      def archive(
        params: ParamsResourceBiddersBiddingfunctionsArchive,
        callback: BodyResponseCallback[SchemaBiddingFunction]
      ): Unit = js.native
      def archive(
        params: ParamsResourceBiddersBiddingfunctionsArchive,
        options: BodyResponseCallback[Readable | SchemaBiddingFunction],
        callback: BodyResponseCallback[Readable | SchemaBiddingFunction]
      ): Unit = js.native
      def archive(params: ParamsResourceBiddersBiddingfunctionsArchive, options: MethodOptions): GaxiosPromise[SchemaBiddingFunction] = js.native
      def archive(
        params: ParamsResourceBiddersBiddingfunctionsArchive,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaBiddingFunction]
      ): Unit = js.native
      /**
        * Archives an existing bidding function. An archived function will not be available for function invocation for the server-side TURTLEDOVE simulations unless it is activated.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const realtimebidding = google.realtimebidding('v1alpha');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await realtimebidding.bidders.biddingFunctions.archive({
        *     // Required. The name of the bidding function to archive. Format: `bidders/{bidder_account_id\}/biddingFunction/{bidding_function_name\}`
        *     name: 'bidders/my-bidder/biddingFunctions/my-biddingFunction',
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
        *   //   "biddingFunction": "my_biddingFunction",
        *   //   "name": "my_name",
        *   //   "state": "my_state",
        *   //   "type": "my_type"
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
      def archive(params: ParamsResourceBiddersBiddingfunctionsArchive, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def archive(
        params: ParamsResourceBiddersBiddingfunctionsArchive,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
      
      def create(): GaxiosPromise[SchemaBiddingFunction] = js.native
      def create(callback: BodyResponseCallback[SchemaBiddingFunction]): Unit = js.native
      def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBiddingFunction] = js.native
      def create(params: ParamsResourceBiddersBiddingfunctionsCreate): GaxiosPromise[SchemaBiddingFunction] = js.native
      def create(
        params: ParamsResourceBiddersBiddingfunctionsCreate,
        callback: BodyResponseCallback[SchemaBiddingFunction]
      ): Unit = js.native
      def create(
        params: ParamsResourceBiddersBiddingfunctionsCreate,
        options: BodyResponseCallback[Readable | SchemaBiddingFunction],
        callback: BodyResponseCallback[Readable | SchemaBiddingFunction]
      ): Unit = js.native
      def create(params: ParamsResourceBiddersBiddingfunctionsCreate, options: MethodOptions): GaxiosPromise[SchemaBiddingFunction] = js.native
      def create(
        params: ParamsResourceBiddersBiddingfunctionsCreate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaBiddingFunction]
      ): Unit = js.native
      /**
        * Creates a new bidding function.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const realtimebidding = google.realtimebidding('v1alpha');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await realtimebidding.bidders.biddingFunctions.create({
        *     // Required. The name of the bidder for which to create the bidding function. Format: `bidders/{bidderAccountId\}`
        *     parent: 'bidders/my-bidder',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "biddingFunction": "my_biddingFunction",
        *       //   "name": "my_name",
        *       //   "state": "my_state",
        *       //   "type": "my_type"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "biddingFunction": "my_biddingFunction",
        *   //   "name": "my_name",
        *   //   "state": "my_state",
        *   //   "type": "my_type"
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
      def create(params: ParamsResourceBiddersBiddingfunctionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def create(
        params: ParamsResourceBiddersBiddingfunctionsCreate,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def list(): GaxiosPromise[SchemaListBiddingFunctionsResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListBiddingFunctionsResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBiddingFunctionsResponse] = js.native
      def list(params: ParamsResourceBiddersBiddingfunctionsList): GaxiosPromise[SchemaListBiddingFunctionsResponse] = js.native
      def list(
        params: ParamsResourceBiddersBiddingfunctionsList,
        callback: BodyResponseCallback[SchemaListBiddingFunctionsResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceBiddersBiddingfunctionsList,
        options: BodyResponseCallback[Readable | SchemaListBiddingFunctionsResponse],
        callback: BodyResponseCallback[Readable | SchemaListBiddingFunctionsResponse]
      ): Unit = js.native
      def list(params: ParamsResourceBiddersBiddingfunctionsList, options: MethodOptions): GaxiosPromise[SchemaListBiddingFunctionsResponse] = js.native
      def list(
        params: ParamsResourceBiddersBiddingfunctionsList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListBiddingFunctionsResponse]
      ): Unit = js.native
      /**
        * Lists the bidding functions that a bidder currently has registered.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const realtimebidding = google.realtimebidding('v1alpha');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await realtimebidding.bidders.biddingFunctions.list({
        *     // The maximum number of bidding functions to return.
        *     pageSize: 'placeholder-value',
        *     // A token identifying a page of results the server should return. This value is received from a previous `ListBiddingFunctions` call in ListBiddingFunctionsResponse.nextPageToken.
        *     pageToken: 'placeholder-value',
        *     // Required. Name of the bidder whose bidding functions will be listed. Format: `bidders/{bidder_account_id\}`
        *     parent: 'bidders/my-bidder',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "biddingFunctions": [],
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
      def list(params: ParamsResourceBiddersBiddingfunctionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceBiddersBiddingfunctionsList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1alpha
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1alpha")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1alpha): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceBiddersBiddingfunctionsActivate
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The name of the bidding function to activate. Format: `bidders/{bidder_account_id\}/biddingFunction/{bidding_function_name\}`
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaActivateBiddingFunctionRequest] = js.undefined
    }
    object ParamsResourceBiddersBiddingfunctionsActivate {
      
      inline def apply(): ParamsResourceBiddersBiddingfunctionsActivate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceBiddersBiddingfunctionsActivate]
      }
      
      extension [Self <: ParamsResourceBiddersBiddingfunctionsActivate](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRequestBody(value: SchemaActivateBiddingFunctionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceBiddersBiddingfunctionsArchive
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The name of the bidding function to archive. Format: `bidders/{bidder_account_id\}/biddingFunction/{bidding_function_name\}`
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaArchiveBiddingFunctionRequest] = js.undefined
    }
    object ParamsResourceBiddersBiddingfunctionsArchive {
      
      inline def apply(): ParamsResourceBiddersBiddingfunctionsArchive = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceBiddersBiddingfunctionsArchive]
      }
      
      extension [Self <: ParamsResourceBiddersBiddingfunctionsArchive](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRequestBody(value: SchemaArchiveBiddingFunctionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceBiddersBiddingfunctionsCreate
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The name of the bidder for which to create the bidding function. Format: `bidders/{bidderAccountId\}`
        */
      var parent: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaBiddingFunction] = js.undefined
    }
    object ParamsResourceBiddersBiddingfunctionsCreate {
      
      inline def apply(): ParamsResourceBiddersBiddingfunctionsCreate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceBiddersBiddingfunctionsCreate]
      }
      
      extension [Self <: ParamsResourceBiddersBiddingfunctionsCreate](x: Self) {
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        
        inline def setRequestBody(value: SchemaBiddingFunction): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceBiddersBiddingfunctionsList
      extends StObject
         with StandardParameters {
      
      /**
        * The maximum number of bidding functions to return.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * A token identifying a page of results the server should return. This value is received from a previous `ListBiddingFunctions` call in ListBiddingFunctionsResponse.nextPageToken.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Required. Name of the bidder whose bidding functions will be listed. Format: `bidders/{bidder_account_id\}`
        */
      var parent: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceBiddersBiddingfunctionsList {
      
      inline def apply(): ParamsResourceBiddersBiddingfunctionsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceBiddersBiddingfunctionsList]
      }
      
      extension [Self <: ParamsResourceBiddersBiddingfunctionsList](x: Self) {
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
    
    trait SchemaActivateBiddingFunctionRequest extends StObject
    
    trait SchemaArchiveBiddingFunctionRequest extends StObject
    
    trait SchemaBiddingFunction extends StObject {
      
      /**
        * The raw Javascript source code of the bidding function.
        */
      var biddingFunction: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The name of the bidding function that must follow the pattern: `bidders/{bidder_account_id\}/biddingFunctions/{bidding_function_name\}`.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Output only. The state of the bidding function.
        */
      var state: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The type of the bidding function to be created.
        */
      var `type`: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaBiddingFunction {
      
      inline def apply(): SchemaBiddingFunction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaBiddingFunction]
      }
      
      extension [Self <: SchemaBiddingFunction](x: Self) {
        
        inline def setBiddingFunction(value: String): Self = StObject.set(x, "biddingFunction", value.asInstanceOf[js.Any])
        
        inline def setBiddingFunctionNull: Self = StObject.set(x, "biddingFunction", null)
        
        inline def setBiddingFunctionUndefined: Self = StObject.set(x, "biddingFunction", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateNull: Self = StObject.set(x, "state", null)
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeNull: Self = StObject.set(x, "type", null)
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait SchemaListBiddingFunctionsResponse extends StObject {
      
      /**
        * A list of a bidder's bidding functions.
        */
      var biddingFunctions: js.UndefOr[js.Array[SchemaBiddingFunction]] = js.undefined
      
      /**
        * A token which can be passed to a subsequent call to the `ListBiddingFunctions` method to retrieve the next page of results in ListBiddingFunctionsRequest.pageToken.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaListBiddingFunctionsResponse {
      
      inline def apply(): SchemaListBiddingFunctionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListBiddingFunctionsResponse]
      }
      
      extension [Self <: SchemaListBiddingFunctionsResponse](x: Self) {
        
        inline def setBiddingFunctions(value: js.Array[SchemaBiddingFunction]): Self = StObject.set(x, "biddingFunctions", value.asInstanceOf[js.Any])
        
        inline def setBiddingFunctionsUndefined: Self = StObject.set(x, "biddingFunctions", js.undefined)
        
        inline def setBiddingFunctionsVarargs(value: SchemaBiddingFunction*): Self = StObject.set(x, "biddingFunctions", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
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
