package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
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

object libraryagentV1Mod {
  
  object libraryagentV1 {
    
    @JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Libraryagent")
    @js.native
    open class Libraryagent protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var shelves: ResourceShelves = js.native
    }
    
    @JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Resource$Shelves")
    @js.native
    open class ResourceShelves protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var books: ResourceShelvesBooks = js.native
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
      def get(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
      def get(params: ParamsResourceShelvesGet): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
      def get(
        params: ParamsResourceShelvesGet,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]
      ): Unit = js.native
      def get(
        params: ParamsResourceShelvesGet,
        options: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1Shelf],
        callback: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1Shelf]
      ): Unit = js.native
      def get(params: ParamsResourceShelvesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
      def get(
        params: ParamsResourceShelvesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]
      ): Unit = js.native
      /**
        * Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/libraryagent.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const libraryagent = google.libraryagent('v1');
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
        *   const res = await libraryagent.shelves.get({
        *     // Required. The name of the shelf to retrieve.
        *     name: 'shelves/my-shelve',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "name": "my_name",
        *   //   "theme": "my_theme"
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
      def get(params: ParamsResourceShelvesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceShelvesGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def list(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
      def list(params: ParamsResourceShelvesList): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
      def list(
        params: ParamsResourceShelvesList,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceShelvesList,
        options: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1ListShelvesResponse],
        callback: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
      ): Unit = js.native
      def list(params: ParamsResourceShelvesList, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
      def list(
        params: ParamsResourceShelvesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
      ): Unit = js.native
      /**
        * Lists shelves. The order is unspecified but deterministic. Newly created shelves will not necessarily be added to the end of this list.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/libraryagent.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const libraryagent = google.libraryagent('v1');
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
        *   const res = await libraryagent.shelves.list({
        *     // Requested page size. Server may return fewer shelves than requested. If unspecified, server will pick an appropriate default.
        *     pageSize: 'placeholder-value',
        *     // A token identifying a page of results the server should return. Typically, this is the value of ListShelvesResponse.next_page_token returned from the previous call to `ListShelves` method.
        *     pageToken: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "nextPageToken": "my_nextPageToken",
        *   //   "shelves": []
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
      def list(params: ParamsResourceShelvesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceShelvesList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Resource$Shelves$Books")
    @js.native
    open class ResourceShelvesBooks protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      def borrow(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def borrow(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]): Unit = js.native
      def borrow(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def borrow(params: ParamsResourceShelvesBooksBorrow): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def borrow(
        params: ParamsResourceShelvesBooksBorrow,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def borrow(
        params: ParamsResourceShelvesBooksBorrow,
        options: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1Book],
        callback: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def borrow(params: ParamsResourceShelvesBooksBorrow, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def borrow(
        params: ParamsResourceShelvesBooksBorrow,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      /**
        * Borrow a book from the library. Returns the book if it is borrowed successfully. Returns NOT_FOUND if the book does not exist in the library. Returns quota exceeded error if the amount of books borrowed exceeds allocation quota in any dimensions.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/libraryagent.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const libraryagent = google.libraryagent('v1');
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
        *   const res = await libraryagent.shelves.books.borrow({
        *     // Required. The name of the book to borrow.
        *     name: 'shelves/my-shelve/books/my-book',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "author": "my_author",
        *   //   "name": "my_name",
        *   //   "read": false,
        *   //   "title": "my_title"
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
      def borrow(params: ParamsResourceShelvesBooksBorrow, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def borrow(
        params: ParamsResourceShelvesBooksBorrow,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def get(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def get(params: ParamsResourceShelvesBooksGet): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def get(
        params: ParamsResourceShelvesBooksGet,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def get(
        params: ParamsResourceShelvesBooksGet,
        options: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1Book],
        callback: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def get(params: ParamsResourceShelvesBooksGet, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def get(
        params: ParamsResourceShelvesBooksGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      /**
        * Gets a book. Returns NOT_FOUND if the book does not exist.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/libraryagent.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const libraryagent = google.libraryagent('v1');
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
        *   const res = await libraryagent.shelves.books.get({
        *     // Required. The name of the book to retrieve.
        *     name: 'shelves/my-shelve/books/my-book',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "author": "my_author",
        *   //   "name": "my_name",
        *   //   "read": false,
        *   //   "title": "my_title"
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
      def get(params: ParamsResourceShelvesBooksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceShelvesBooksGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def list(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
      def list(params: ParamsResourceShelvesBooksList): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
      def list(
        params: ParamsResourceShelvesBooksList,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceShelvesBooksList,
        options: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1ListBooksResponse],
        callback: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1ListBooksResponse]
      ): Unit = js.native
      def list(params: ParamsResourceShelvesBooksList, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
      def list(
        params: ParamsResourceShelvesBooksList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
      ): Unit = js.native
      /**
        * Lists books in a shelf. The order is unspecified but deterministic. Newly created books will not necessarily be added to the end of this list. Returns NOT_FOUND if the shelf does not exist.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/libraryagent.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const libraryagent = google.libraryagent('v1');
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
        *   const res = await libraryagent.shelves.books.list({
        *     // Requested page size. Server may return fewer books than requested. If unspecified, server will pick an appropriate default.
        *     pageSize: 'placeholder-value',
        *     // A token identifying a page of results the server should return. Typically, this is the value of ListBooksResponse.next_page_token. returned from the previous call to `ListBooks` method.
        *     pageToken: 'placeholder-value',
        *     // Required. The name of the shelf whose books we'd like to list.
        *     parent: 'shelves/my-shelve',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "books": [],
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
      def list(params: ParamsResourceShelvesBooksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceShelvesBooksList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def `return`(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def `return`(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]): Unit = js.native
      def `return`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def `return`(params: ParamsResourceShelvesBooksReturn): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def `return`(
        params: ParamsResourceShelvesBooksReturn,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def `return`(
        params: ParamsResourceShelvesBooksReturn,
        options: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1Book],
        callback: BodyResponseCallback[Readable | SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def `return`(params: ParamsResourceShelvesBooksReturn, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def `return`(
        params: ParamsResourceShelvesBooksReturn,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      /**
        * Return a book to the library. Returns the book if it is returned to the library successfully. Returns error if the book does not belong to the library or the users didn't borrow before.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/libraryagent.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const libraryagent = google.libraryagent('v1');
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
        *   const res = await libraryagent.shelves.books.return({
        *     // Required. The name of the book to return.
        *     name: 'shelves/my-shelve/books/my-book',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "author": "my_author",
        *   //   "name": "my_name",
        *   //   "read": false,
        *   //   "title": "my_title"
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
      def `return`(params: ParamsResourceShelvesBooksReturn, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def `return`(
        params: ParamsResourceShelvesBooksReturn,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
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
    
    trait ParamsResourceShelvesBooksBorrow
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The name of the book to borrow.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceShelvesBooksBorrow {
      
      inline def apply(): ParamsResourceShelvesBooksBorrow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesBooksBorrow]
      }
      
      extension [Self <: ParamsResourceShelvesBooksBorrow](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceShelvesBooksGet
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The name of the book to retrieve.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceShelvesBooksGet {
      
      inline def apply(): ParamsResourceShelvesBooksGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesBooksGet]
      }
      
      extension [Self <: ParamsResourceShelvesBooksGet](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceShelvesBooksList
      extends StObject
         with StandardParameters {
      
      /**
        * Requested page size. Server may return fewer books than requested. If unspecified, server will pick an appropriate default.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * A token identifying a page of results the server should return. Typically, this is the value of ListBooksResponse.next_page_token. returned from the previous call to `ListBooks` method.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Required. The name of the shelf whose books we'd like to list.
        */
      var parent: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceShelvesBooksList {
      
      inline def apply(): ParamsResourceShelvesBooksList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesBooksList]
      }
      
      extension [Self <: ParamsResourceShelvesBooksList](x: Self) {
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
    
    trait ParamsResourceShelvesBooksReturn
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The name of the book to return.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceShelvesBooksReturn {
      
      inline def apply(): ParamsResourceShelvesBooksReturn = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesBooksReturn]
      }
      
      extension [Self <: ParamsResourceShelvesBooksReturn](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceShelvesGet
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The name of the shelf to retrieve.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceShelvesGet {
      
      inline def apply(): ParamsResourceShelvesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesGet]
      }
      
      extension [Self <: ParamsResourceShelvesGet](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceShelvesList
      extends StObject
         with StandardParameters {
      
      /**
        * Requested page size. Server may return fewer shelves than requested. If unspecified, server will pick an appropriate default.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * A token identifying a page of results the server should return. Typically, this is the value of ListShelvesResponse.next_page_token returned from the previous call to `ListShelves` method.
        */
      var pageToken: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceShelvesList {
      
      inline def apply(): ParamsResourceShelvesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesList]
      }
      
      extension [Self <: ParamsResourceShelvesList](x: Self) {
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      }
    }
    
    trait SchemaGoogleExampleLibraryagentV1Book extends StObject {
      
      /**
        * The name of the book author.
        */
      var author: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The resource name of the book. Book names have the form `shelves/{shelf_id\}/books/{book_id\}`. The name is ignored when creating a book.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Value indicating whether the book has been read.
        */
      var read: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * The title of the book.
        */
      var title: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaGoogleExampleLibraryagentV1Book {
      
      inline def apply(): SchemaGoogleExampleLibraryagentV1Book = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1Book]
      }
      
      extension [Self <: SchemaGoogleExampleLibraryagentV1Book](x: Self) {
        
        inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
        
        inline def setAuthorNull: Self = StObject.set(x, "author", null)
        
        inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
        
        inline def setReadNull: Self = StObject.set(x, "read", null)
        
        inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait SchemaGoogleExampleLibraryagentV1ListBooksResponse extends StObject {
      
      /**
        * The list of books.
        */
      var books: js.UndefOr[js.Array[SchemaGoogleExampleLibraryagentV1Book]] = js.undefined
      
      /**
        * A token to retrieve next page of results. Pass this value in the ListBooksRequest.page_token field in the subsequent call to `ListBooks` method to retrieve the next page of results.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaGoogleExampleLibraryagentV1ListBooksResponse {
      
      inline def apply(): SchemaGoogleExampleLibraryagentV1ListBooksResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
      }
      
      extension [Self <: SchemaGoogleExampleLibraryagentV1ListBooksResponse](x: Self) {
        
        inline def setBooks(value: js.Array[SchemaGoogleExampleLibraryagentV1Book]): Self = StObject.set(x, "books", value.asInstanceOf[js.Any])
        
        inline def setBooksUndefined: Self = StObject.set(x, "books", js.undefined)
        
        inline def setBooksVarargs(value: SchemaGoogleExampleLibraryagentV1Book*): Self = StObject.set(x, "books", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait SchemaGoogleExampleLibraryagentV1ListShelvesResponse extends StObject {
      
      /**
        * A token to retrieve next page of results. Pass this value in the ListShelvesRequest.page_token field in the subsequent call to `ListShelves` method to retrieve the next page of results.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The list of shelves.
        */
      var shelves: js.UndefOr[js.Array[SchemaGoogleExampleLibraryagentV1Shelf]] = js.undefined
    }
    object SchemaGoogleExampleLibraryagentV1ListShelvesResponse {
      
      inline def apply(): SchemaGoogleExampleLibraryagentV1ListShelvesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
      }
      
      extension [Self <: SchemaGoogleExampleLibraryagentV1ListShelvesResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setShelves(value: js.Array[SchemaGoogleExampleLibraryagentV1Shelf]): Self = StObject.set(x, "shelves", value.asInstanceOf[js.Any])
        
        inline def setShelvesUndefined: Self = StObject.set(x, "shelves", js.undefined)
        
        inline def setShelvesVarargs(value: SchemaGoogleExampleLibraryagentV1Shelf*): Self = StObject.set(x, "shelves", js.Array(value*))
      }
    }
    
    trait SchemaGoogleExampleLibraryagentV1Shelf extends StObject {
      
      /**
        * Output only. The resource name of the shelf. Shelf names have the form `shelves/{shelf_id\}`. The name is ignored when creating a shelf.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The theme of the shelf
        */
      var theme: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaGoogleExampleLibraryagentV1Shelf {
      
      inline def apply(): SchemaGoogleExampleLibraryagentV1Shelf = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1Shelf]
      }
      
      extension [Self <: SchemaGoogleExampleLibraryagentV1Shelf](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
        
        inline def setThemeNull: Self = StObject.set(x, "theme", null)
        
        inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
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
