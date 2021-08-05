package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object licensingV1Mod {
  
  object licensingV1 {
    
    /**
      * Enterprise License Manager API
      *
      * Views and manages licenses for your domain.
      *
      * @example
      * const {google} = require('googleapis');
      * const licensing = google.licensing('v1');
      *
      * @namespace licensing
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Licensing
      */
    @JSImport("googleapis/build/src/apis/licensing/v1", "licensing_v1.Licensing")
    @js.native
    class Licensing protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var licenseAssignments: ResourceLicenseassignments = js.native
    }
    
    @JSImport("googleapis/build/src/apis/licensing/v1", "licensing_v1.Resource$Licenseassignments")
    @js.native
    class ResourceLicenseassignments protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * licensing.licenseAssignments.delete
        * @desc Revoke License.
        * @alias licensing.licenseAssignments.delete
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.productId Name for product
        * @param {string} params.skuId Name for sku
        * @param {string} params.userId email id or unique Id of the user
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def delete(): GaxiosPromise[Unit] = js.native
      def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
      def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def delete(params: ParamsResourceLicenseassignmentsDelete): GaxiosPromise[Unit] = js.native
      def delete(params: ParamsResourceLicenseassignmentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
      def delete(
        params: ParamsResourceLicenseassignmentsDelete,
        options: BodyResponseCallback[Unit],
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      def delete(params: ParamsResourceLicenseassignmentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def delete(
        params: ParamsResourceLicenseassignmentsDelete,
        options: MethodOptions,
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      
      /**
        * licensing.licenseAssignments.get
        * @desc Get license assignment of a particular product and sku for a user
        * @alias licensing.licenseAssignments.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.productId Name for product
        * @param {string} params.skuId Name for sku
        * @param {string} params.userId email id or unique Id of the user
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
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
        options: BodyResponseCallback[SchemaLicenseAssignment],
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      def get(params: ParamsResourceLicenseassignmentsGet, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def get(
        params: ParamsResourceLicenseassignmentsGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      
      /**
        * licensing.licenseAssignments.insert
        * @desc Assign License.
        * @alias licensing.licenseAssignments.insert
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.productId Name for product
        * @param {string} params.skuId Name for sku
        * @param {().LicenseAssignmentInsert} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
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
        options: BodyResponseCallback[SchemaLicenseAssignment],
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      def insert(params: ParamsResourceLicenseassignmentsInsert, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def insert(
        params: ParamsResourceLicenseassignmentsInsert,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      
      /**
        * licensing.licenseAssignments.listForProduct
        * @desc List license assignments for given product of the customer.
        * @alias licensing.licenseAssignments.listForProduct
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.customerId CustomerId represents the customer for whom licenseassignments are queried
        * @param {integer=} params.maxResults Maximum number of campaigns to return at one time. Must be positive. Optional. Default value is 100.
        * @param {string=} params.pageToken Token to fetch the next page.Optional. By default server will return first page
        * @param {string} params.productId Name for product
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
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
        options: BodyResponseCallback[SchemaLicenseAssignmentList],
        callback: BodyResponseCallback[SchemaLicenseAssignmentList]
      ): Unit = js.native
      def listForProduct(params: ParamsResourceLicenseassignmentsListforproduct, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
      def listForProduct(
        params: ParamsResourceLicenseassignmentsListforproduct,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignmentList]
      ): Unit = js.native
      
      /**
        * licensing.licenseAssignments.listForProductAndSku
        * @desc List license assignments for given product and sku of the customer.
        * @alias licensing.licenseAssignments.listForProductAndSku
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.customerId CustomerId represents the customer for whom licenseassignments are queried
        * @param {integer=} params.maxResults Maximum number of campaigns to return at one time. Must be positive. Optional. Default value is 100.
        * @param {string=} params.pageToken Token to fetch the next page.Optional. By default server will return first page
        * @param {string} params.productId Name for product
        * @param {string} params.skuId Name for sku
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
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
        options: BodyResponseCallback[SchemaLicenseAssignmentList],
        callback: BodyResponseCallback[SchemaLicenseAssignmentList]
      ): Unit = js.native
      def listForProductAndSku(params: ParamsResourceLicenseassignmentsListforproductandsku, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
      def listForProductAndSku(
        params: ParamsResourceLicenseassignmentsListforproductandsku,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignmentList]
      ): Unit = js.native
      
      /**
        * licensing.licenseAssignments.patch
        * @desc Assign License. This method supports patch semantics.
        * @alias licensing.licenseAssignments.patch
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.productId Name for product
        * @param {string} params.skuId Name for sku for which license would be revoked
        * @param {string} params.userId email id or unique Id of the user
        * @param {().LicenseAssignment} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
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
        options: BodyResponseCallback[SchemaLicenseAssignment],
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      def patch(params: ParamsResourceLicenseassignmentsPatch, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def patch(
        params: ParamsResourceLicenseassignmentsPatch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      
      /**
        * licensing.licenseAssignments.update
        * @desc Assign License.
        * @alias licensing.licenseAssignments.update
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.productId Name for product
        * @param {string} params.skuId Name for sku for which license would be revoked
        * @param {string} params.userId email id or unique Id of the user
        * @param {().LicenseAssignment} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
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
        options: BodyResponseCallback[SchemaLicenseAssignment],
        callback: BodyResponseCallback[SchemaLicenseAssignment]
      ): Unit = js.native
      def update(params: ParamsResourceLicenseassignmentsUpdate, options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
      def update(
        params: ParamsResourceLicenseassignmentsUpdate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLicenseAssignment]
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
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * Name for sku
        */
      var skuId: js.UndefOr[String] = js.undefined
      
      /**
        * email id or unique Id of the user
        */
      var userId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsDelete {
      
      inline def apply(): ParamsResourceLicenseassignmentsDelete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsDelete]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsDelete](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * Name for sku
        */
      var skuId: js.UndefOr[String] = js.undefined
      
      /**
        * email id or unique Id of the user
        */
      var userId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsGet {
      
      inline def apply(): ParamsResourceLicenseassignmentsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsGet]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsGet](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaLicenseAssignmentInsert] = js.undefined
      
      /**
        * Name for sku
        */
      var skuId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsInsert {
      
      inline def apply(): ParamsResourceLicenseassignmentsInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsInsert]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsInsert](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * CustomerId represents the customer for whom licenseassignments are
        * queried
        */
      var customerId: js.UndefOr[String] = js.undefined
      
      /**
        * Maximum number of campaigns to return at one time. Must be positive.
        * Optional. Default value is 100.
        */
      var maxResults: js.UndefOr[Double] = js.undefined
      
      /**
        * Token to fetch the next page.Optional. By default server will return
        * first page
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsListforproduct {
      
      inline def apply(): ParamsResourceLicenseassignmentsListforproduct = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsListforproduct]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsListforproduct](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * CustomerId represents the customer for whom licenseassignments are
        * queried
        */
      var customerId: js.UndefOr[String] = js.undefined
      
      /**
        * Maximum number of campaigns to return at one time. Must be positive.
        * Optional. Default value is 100.
        */
      var maxResults: js.UndefOr[Double] = js.undefined
      
      /**
        * Token to fetch the next page.Optional. By default server will return
        * first page
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * Name for sku
        */
      var skuId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsListforproductandsku {
      
      inline def apply(): ParamsResourceLicenseassignmentsListforproductandsku = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsListforproductandsku]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsListforproductandsku](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaLicenseAssignment] = js.undefined
      
      /**
        * Name for sku for which license would be revoked
        */
      var skuId: js.UndefOr[String] = js.undefined
      
      /**
        * email id or unique Id of the user
        */
      var userId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsPatch {
      
      inline def apply(): ParamsResourceLicenseassignmentsPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsPatch]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsPatch](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaLicenseAssignment] = js.undefined
      
      /**
        * Name for sku for which license would be revoked
        */
      var skuId: js.UndefOr[String] = js.undefined
      
      /**
        * email id or unique Id of the user
        */
      var userId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLicenseassignmentsUpdate {
      
      inline def apply(): ParamsResourceLicenseassignmentsUpdate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsUpdate]
      }
      
      extension [Self <: ParamsResourceLicenseassignmentsUpdate](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
    
    /**
      * Template for LiscenseAssignment Resource
      */
    trait SchemaLicenseAssignment extends StObject {
      
      /**
        * ETag of the resource.
        */
      var etags: js.UndefOr[String] = js.undefined
      
      /**
        * Identifies the resource as a LicenseAssignment.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * Id of the product.
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * Display Name of the product.
        */
      var productName: js.UndefOr[String] = js.undefined
      
      /**
        * Link to this page.
        */
      var selfLink: js.UndefOr[String] = js.undefined
      
      /**
        * Id of the sku of the product.
        */
      var skuId: js.UndefOr[String] = js.undefined
      
      /**
        * Display Name of the sku of the product.
        */
      var skuName: js.UndefOr[String] = js.undefined
      
      /**
        * Email id of the user.
        */
      var userId: js.UndefOr[String] = js.undefined
    }
    object SchemaLicenseAssignment {
      
      inline def apply(): SchemaLicenseAssignment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLicenseAssignment]
      }
      
      extension [Self <: SchemaLicenseAssignment](x: Self) {
        
        inline def setEtags(value: String): Self = StObject.set(x, "etags", value.asInstanceOf[js.Any])
        
        inline def setEtagsUndefined: Self = StObject.set(x, "etags", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
        
        inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        inline def setSkuName(value: String): Self = StObject.set(x, "skuName", value.asInstanceOf[js.Any])
        
        inline def setSkuNameUndefined: Self = StObject.set(x, "skuName", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    /**
      * Template for LicenseAssignment Insert request
      */
    trait SchemaLicenseAssignmentInsert extends StObject {
      
      /**
        * Email id of the user
        */
      var userId: js.UndefOr[String] = js.undefined
    }
    object SchemaLicenseAssignmentInsert {
      
      inline def apply(): SchemaLicenseAssignmentInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLicenseAssignmentInsert]
      }
      
      extension [Self <: SchemaLicenseAssignmentInsert](x: Self) {
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    /**
      * LicesnseAssignment List for a given product/sku for a customer.
      */
    trait SchemaLicenseAssignmentList extends StObject {
      
      /**
        * ETag of the resource.
        */
      var etag: js.UndefOr[String] = js.undefined
      
      /**
        * The LicenseAssignments in this page of results.
        */
      var items: js.UndefOr[js.Array[SchemaLicenseAssignment]] = js.undefined
      
      /**
        * Identifies the resource as a collection of LicenseAssignments.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * The continuation token, used to page through large result sets. Provide
        * this value in a subsequent request to return the next page of results.
        */
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object SchemaLicenseAssignmentList {
      
      inline def apply(): SchemaLicenseAssignmentList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLicenseAssignmentList]
      }
      
      extension [Self <: SchemaLicenseAssignmentList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[SchemaLicenseAssignment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SchemaLicenseAssignment*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
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
        * An opaque string that represents a user for quota purposes. Must not
        * exceed 40 characters.
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
