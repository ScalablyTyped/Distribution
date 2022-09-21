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

object licensingV1Mod {
  
  object licensingV1 {
    
    @JSImport("googleapis/build/src/apis/licensing/v1", "licensing_v1.Licensing")
    @js.native
    open class Licensing protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var licenseAssignments: ResourceLicenseassignments = js.native
    }
    
    @JSImport("googleapis/build/src/apis/licensing/v1", "licensing_v1.Resource$Licenseassignments")
    @js.native
    open class ResourceLicenseassignments protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def delete(): GaxiosPromise[SchemaEmpty] = js.native
      def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def delete(params: ParamsResourceLicenseassignmentsDelete): GaxiosPromise[SchemaEmpty] = js.native
      def delete(params: ParamsResourceLicenseassignmentsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def delete(
        params: ParamsResourceLicenseassignmentsDelete,
        options: BodyResponseCallback[Readable | SchemaEmpty],
        callback: BodyResponseCallback[Readable | SchemaEmpty]
      ): Unit = js.native
      def delete(params: ParamsResourceLicenseassignmentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def delete(
        params: ParamsResourceLicenseassignmentsDelete,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      /**
        * Revoke a license.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/licensing.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const licensing = google.licensing('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/apps.licensing'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await licensing.licenseAssignments.delete({
        *     // A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        *     productId: 'placeholder-value',
        *     // A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        *     skuId: 'placeholder-value',
        *     // The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
        *     userId: 'placeholder-value',
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
      def delete(params: ParamsResourceLicenseassignmentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def delete(
        params: ParamsResourceLicenseassignmentsDelete,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def get(): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def get(callback: BodyResponseCallback[SchemaLicenseAssignment]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def get(params: ParamsResourceLicenseassignmentsGet): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def get(
        params: ParamsResourceLicenseassignmentsGet,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      def get(
        params: ParamsResourceLicenseassignmentsGet,
        options: BodyResponseCallback[Readable | SchemaLicenseAssignment],
        callback: BodyResponseCallback[Readable | SchemaLicenseAssignment]
      ): Unit = js.native
      def get(params: ParamsResourceLicenseassignmentsGet, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def get(
        params: ParamsResourceLicenseassignmentsGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      /**
        * Get a specific user's license by product SKU.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/licensing.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const licensing = google.licensing('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/apps.licensing'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await licensing.licenseAssignments.get({
        *     // A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        *     productId: 'placeholder-value',
        *     // A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        *     skuId: 'placeholder-value',
        *     // The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
        *     userId: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "etags": "my_etags",
        *   //   "kind": "my_kind",
        *   //   "productId": "my_productId",
        *   //   "productName": "my_productName",
        *   //   "selfLink": "my_selfLink",
        *   //   "skuId": "my_skuId",
        *   //   "skuName": "my_skuName",
        *   //   "userId": "my_userId"
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
      def get(params: ParamsResourceLicenseassignmentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceLicenseassignmentsGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def insert(): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def insert(callback: BodyResponseCallback[SchemaLicenseAssignment]): Unit = js.native
      def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def insert(params: ParamsResourceLicenseassignmentsInsert): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def insert(
        params: ParamsResourceLicenseassignmentsInsert,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      def insert(
        params: ParamsResourceLicenseassignmentsInsert,
        options: BodyResponseCallback[Readable | SchemaLicenseAssignment],
        callback: BodyResponseCallback[Readable | SchemaLicenseAssignment]
      ): Unit = js.native
      def insert(params: ParamsResourceLicenseassignmentsInsert, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def insert(
        params: ParamsResourceLicenseassignmentsInsert,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      /**
        * Assign a license.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/licensing.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const licensing = google.licensing('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/apps.licensing'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await licensing.licenseAssignments.insert({
        *     // A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        *     productId: 'placeholder-value',
        *     // A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        *     skuId: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "userId": "my_userId"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "etags": "my_etags",
        *   //   "kind": "my_kind",
        *   //   "productId": "my_productId",
        *   //   "productName": "my_productName",
        *   //   "selfLink": "my_selfLink",
        *   //   "skuId": "my_skuId",
        *   //   "skuName": "my_skuName",
        *   //   "userId": "my_userId"
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
      def insert(params: ParamsResourceLicenseassignmentsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def insert(
        params: ParamsResourceLicenseassignmentsInsert,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def listForProduct(): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
      def listForProduct(callback: BodyResponseCallback[SchemaLicenseAssignmentList]): Unit = js.native
      def listForProduct(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
      def listForProduct(params: ParamsResourceLicenseassignmentsListforproduct): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
      def listForProduct(
        params: ParamsResourceLicenseassignmentsListforproduct,
        callback: BodyResponseCallback[SchemaLicenseAssignmentList]
      ): Unit = js.native
      def listForProduct(
        params: ParamsResourceLicenseassignmentsListforproduct,
        options: BodyResponseCallback[Readable | SchemaLicenseAssignmentList],
        callback: BodyResponseCallback[Readable | SchemaLicenseAssignmentList]
      ): Unit = js.native
      def listForProduct(params: ParamsResourceLicenseassignmentsListforproduct, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
      def listForProduct(
        params: ParamsResourceLicenseassignmentsListforproduct,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignmentList]
      ): Unit = js.native
      /**
        * List all users assigned licenses for a specific product SKU.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/licensing.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const licensing = google.licensing('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/apps.licensing'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await licensing.licenseAssignments.listForProduct({
        *     // The customer's unique ID as defined in the Admin console, such as `C00000000`. If the customer is suspended, the server returns an error.
        *     customerId: 'placeholder-value',
        *     // The `maxResults` query string determines how many entries are returned on each page of a large response. This is an optional parameter. The value must be a positive number.
        *     maxResults: 'placeholder-value',
        *     // Token to fetch the next page of data. The `maxResults` query string is related to the `pageToken` since `maxResults` determines how many entries are returned on each page. This is an optional query string. If not specified, the server returns the first page.
        *     pageToken: 'placeholder-value',
        *     // A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        *     productId: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "etag": "my_etag",
        *   //   "items": [],
        *   //   "kind": "my_kind",
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
      def listForProduct(params: ParamsResourceLicenseassignmentsListforproduct, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def listForProduct(
        params: ParamsResourceLicenseassignmentsListforproduct,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def listForProductAndSku(): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
      def listForProductAndSku(callback: BodyResponseCallback[SchemaLicenseAssignmentList]): Unit = js.native
      def listForProductAndSku(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
      def listForProductAndSku(params: ParamsResourceLicenseassignmentsListforproductandsku): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
      def listForProductAndSku(
        params: ParamsResourceLicenseassignmentsListforproductandsku,
        callback: BodyResponseCallback[SchemaLicenseAssignmentList]
      ): Unit = js.native
      def listForProductAndSku(
        params: ParamsResourceLicenseassignmentsListforproductandsku,
        options: BodyResponseCallback[Readable | SchemaLicenseAssignmentList],
        callback: BodyResponseCallback[Readable | SchemaLicenseAssignmentList]
      ): Unit = js.native
      def listForProductAndSku(params: ParamsResourceLicenseassignmentsListforproductandsku, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
      def listForProductAndSku(
        params: ParamsResourceLicenseassignmentsListforproductandsku,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignmentList]
      ): Unit = js.native
      /**
        * List all users assigned licenses for a specific product SKU.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/licensing.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const licensing = google.licensing('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/apps.licensing'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await licensing.licenseAssignments.listForProductAndSku({
        *     // The customer's unique ID as defined in the Admin console, such as `C00000000`. If the customer is suspended, the server returns an error.
        *     customerId: 'placeholder-value',
        *     // The `maxResults` query string determines how many entries are returned on each page of a large response. This is an optional parameter. The value must be a positive number.
        *     maxResults: 'placeholder-value',
        *     // Token to fetch the next page of data. The `maxResults` query string is related to the `pageToken` since `maxResults` determines how many entries are returned on each page. This is an optional query string. If not specified, the server returns the first page.
        *     pageToken: 'placeholder-value',
        *     // A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        *     productId: 'placeholder-value',
        *     // A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        *     skuId: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "etag": "my_etag",
        *   //   "items": [],
        *   //   "kind": "my_kind",
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
      def listForProductAndSku(params: ParamsResourceLicenseassignmentsListforproductandsku, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def listForProductAndSku(
        params: ParamsResourceLicenseassignmentsListforproductandsku,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def patch(): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def patch(callback: BodyResponseCallback[SchemaLicenseAssignment]): Unit = js.native
      def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def patch(params: ParamsResourceLicenseassignmentsPatch): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def patch(
        params: ParamsResourceLicenseassignmentsPatch,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      def patch(
        params: ParamsResourceLicenseassignmentsPatch,
        options: BodyResponseCallback[Readable | SchemaLicenseAssignment],
        callback: BodyResponseCallback[Readable | SchemaLicenseAssignment]
      ): Unit = js.native
      def patch(params: ParamsResourceLicenseassignmentsPatch, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def patch(
        params: ParamsResourceLicenseassignmentsPatch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      /**
        * Reassign a user's product SKU with a different SKU in the same product. This method supports patch semantics.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/licensing.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const licensing = google.licensing('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/apps.licensing'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await licensing.licenseAssignments.patch({
        *     // A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        *     productId: 'placeholder-value',
        *     // A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        *     skuId: 'placeholder-value',
        *     // The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
        *     userId: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "etags": "my_etags",
        *       //   "kind": "my_kind",
        *       //   "productId": "my_productId",
        *       //   "productName": "my_productName",
        *       //   "selfLink": "my_selfLink",
        *       //   "skuId": "my_skuId",
        *       //   "skuName": "my_skuName",
        *       //   "userId": "my_userId"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "etags": "my_etags",
        *   //   "kind": "my_kind",
        *   //   "productId": "my_productId",
        *   //   "productName": "my_productName",
        *   //   "selfLink": "my_selfLink",
        *   //   "skuId": "my_skuId",
        *   //   "skuName": "my_skuName",
        *   //   "userId": "my_userId"
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
      def patch(params: ParamsResourceLicenseassignmentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def patch(
        params: ParamsResourceLicenseassignmentsPatch,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def update(): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def update(callback: BodyResponseCallback[SchemaLicenseAssignment]): Unit = js.native
      def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def update(params: ParamsResourceLicenseassignmentsUpdate): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def update(
        params: ParamsResourceLicenseassignmentsUpdate,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      def update(
        params: ParamsResourceLicenseassignmentsUpdate,
        options: BodyResponseCallback[Readable | SchemaLicenseAssignment],
        callback: BodyResponseCallback[Readable | SchemaLicenseAssignment]
      ): Unit = js.native
      def update(params: ParamsResourceLicenseassignmentsUpdate, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def update(
        params: ParamsResourceLicenseassignmentsUpdate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      /**
        * Reassign a user's product SKU with a different SKU in the same product.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/licensing.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const licensing = google.licensing('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/apps.licensing'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await licensing.licenseAssignments.update({
        *     // A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        *     productId: 'placeholder-value',
        *     // A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        *     skuId: 'placeholder-value',
        *     // The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
        *     userId: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "etags": "my_etags",
        *       //   "kind": "my_kind",
        *       //   "productId": "my_productId",
        *       //   "productName": "my_productName",
        *       //   "selfLink": "my_selfLink",
        *       //   "skuId": "my_skuId",
        *       //   "skuName": "my_skuName",
        *       //   "userId": "my_userId"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "etags": "my_etags",
        *   //   "kind": "my_kind",
        *   //   "productId": "my_productId",
        *   //   "productName": "my_productName",
        *   //   "selfLink": "my_selfLink",
        *   //   "skuId": "my_skuId",
        *   //   "skuName": "my_skuName",
        *   //   "userId": "my_userId"
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
      def update(params: ParamsResourceLicenseassignmentsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def update(
        params: ParamsResourceLicenseassignmentsUpdate,
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
    
    trait ParamsResourceLicenseassignmentsDelete
      extends StObject
         with StandardParameters {
      
      /**
        * A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        */
      var skuId: js.UndefOr[String] = js.undefined
      
      /**
        * The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
        */
      var userId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsDelete {
      
      inline def apply(): ParamsResourceLicenseassignmentsDelete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsDelete]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsDelete](x: Self) {
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait ParamsResourceLicenseassignmentsGet
      extends StObject
         with StandardParameters {
      
      /**
        * A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        */
      var skuId: js.UndefOr[String] = js.undefined
      
      /**
        * The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
        */
      var userId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsGet {
      
      inline def apply(): ParamsResourceLicenseassignmentsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsGet]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsGet](x: Self) {
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait ParamsResourceLicenseassignmentsInsert
      extends StObject
         with StandardParameters {
      
      /**
        * A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaLicenseAssignmentInsert] = js.undefined
      
      /**
        * A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        */
      var skuId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsInsert {
      
      inline def apply(): ParamsResourceLicenseassignmentsInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsInsert]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsInsert](x: Self) {
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setRequestBody(value: SchemaLicenseAssignmentInsert): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
      }
    }
    
    trait ParamsResourceLicenseassignmentsListforproduct
      extends StObject
         with StandardParameters {
      
      /**
        * The customer's unique ID as defined in the Admin console, such as `C00000000`. If the customer is suspended, the server returns an error.
        */
      var customerId: js.UndefOr[String] = js.undefined
      
      /**
        * The `maxResults` query string determines how many entries are returned on each page of a large response. This is an optional parameter. The value must be a positive number.
        */
      var maxResults: js.UndefOr[Double] = js.undefined
      
      /**
        * Token to fetch the next page of data. The `maxResults` query string is related to the `pageToken` since `maxResults` determines how many entries are returned on each page. This is an optional query string. If not specified, the server returns the first page.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        */
      var productId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsListforproduct {
      
      inline def apply(): ParamsResourceLicenseassignmentsListforproduct = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsListforproduct]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsListforproduct](x: Self) {
        
        inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      }
    }
    
    trait ParamsResourceLicenseassignmentsListforproductandsku
      extends StObject
         with StandardParameters {
      
      /**
        * The customer's unique ID as defined in the Admin console, such as `C00000000`. If the customer is suspended, the server returns an error.
        */
      var customerId: js.UndefOr[String] = js.undefined
      
      /**
        * The `maxResults` query string determines how many entries are returned on each page of a large response. This is an optional parameter. The value must be a positive number.
        */
      var maxResults: js.UndefOr[Double] = js.undefined
      
      /**
        * Token to fetch the next page of data. The `maxResults` query string is related to the `pageToken` since `maxResults` determines how many entries are returned on each page. This is an optional query string. If not specified, the server returns the first page.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        */
      var skuId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsListforproductandsku {
      
      inline def apply(): ParamsResourceLicenseassignmentsListforproductandsku = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsListforproductandsku]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsListforproductandsku](x: Self) {
        
        inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
      }
    }
    
    trait ParamsResourceLicenseassignmentsPatch
      extends StObject
         with StandardParameters {
      
      /**
        * A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaLicenseAssignment] = js.undefined
      
      /**
        * A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        */
      var skuId: js.UndefOr[String] = js.undefined
      
      /**
        * The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
        */
      var userId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsPatch {
      
      inline def apply(): ParamsResourceLicenseassignmentsPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsPatch]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsPatch](x: Self) {
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setRequestBody(value: SchemaLicenseAssignment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait ParamsResourceLicenseassignmentsUpdate
      extends StObject
         with StandardParameters {
      
      /**
        * A product's unique identifier. For more information about products in this version of the API, see Products and SKUs.
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaLicenseAssignment] = js.undefined
      
      /**
        * A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        */
      var skuId: js.UndefOr[String] = js.undefined
      
      /**
        * The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
        */
      var userId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsUpdate {
      
      inline def apply(): ParamsResourceLicenseassignmentsUpdate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsUpdate]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsUpdate](x: Self) {
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setRequestBody(value: SchemaLicenseAssignment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait SchemaEmpty extends StObject
    
    trait SchemaLicenseAssignment extends StObject {
      
      /**
        * ETag of the resource.
        */
      var etags: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Identifies the resource as a LicenseAssignment, which is `licensing#licenseAssignment`.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * A product's unique identifier. For more information about products in this version of the API, see Product and SKU IDs.
        */
      var productId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Display Name of the product.
        */
      var productName: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Link to this page.
        */
      var selfLink: js.UndefOr[String | Null] = js.undefined
      
      /**
        * A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs.
        */
      var skuId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Display Name of the sku of the product.
        */
      var skuName: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use a `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
        */
      var userId: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaLicenseAssignment {
      
      inline def apply(): SchemaLicenseAssignment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLicenseAssignment]
      }
      
      extension [Self <: SchemaLicenseAssignment](x: Self) {
        
        inline def setEtags(value: String): Self = StObject.set(x, "etags", value.asInstanceOf[js.Any])
        
        inline def setEtagsNull: Self = StObject.set(x, "etags", null)
        
        inline def setEtagsUndefined: Self = StObject.set(x, "etags", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdNull: Self = StObject.set(x, "productId", null)
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
        
        inline def setProductNameNull: Self = StObject.set(x, "productName", null)
        
        inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        inline def setSkuIdNull: Self = StObject.set(x, "skuId", null)
        
        inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        inline def setSkuName(value: String): Self = StObject.set(x, "skuName", value.asInstanceOf[js.Any])
        
        inline def setSkuNameNull: Self = StObject.set(x, "skuName", null)
        
        inline def setSkuNameUndefined: Self = StObject.set(x, "skuName", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdNull: Self = StObject.set(x, "userId", null)
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait SchemaLicenseAssignmentInsert extends StObject {
      
      /**
        * Email id of the user
        */
      var userId: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaLicenseAssignmentInsert {
      
      inline def apply(): SchemaLicenseAssignmentInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLicenseAssignmentInsert]
      }
      
      extension [Self <: SchemaLicenseAssignmentInsert](x: Self) {
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdNull: Self = StObject.set(x, "userId", null)
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait SchemaLicenseAssignmentList extends StObject {
      
      /**
        * ETag of the resource.
        */
      var etag: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The LicenseAssignments in this page of results.
        */
      var items: js.UndefOr[js.Array[SchemaLicenseAssignment]] = js.undefined
      
      /**
        * Identifies the resource as a collection of LicenseAssignments.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The token that you must submit in a subsequent request to retrieve additional license results matching your query parameters. The `maxResults` query string is related to the `nextPageToken` since `maxResults` determines how many entries are returned on each next page.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaLicenseAssignmentList {
      
      inline def apply(): SchemaLicenseAssignmentList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLicenseAssignmentList]
      }
      
      extension [Self <: SchemaLicenseAssignmentList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagNull: Self = StObject.set(x, "etag", null)
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[SchemaLicenseAssignment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SchemaLicenseAssignment*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
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
