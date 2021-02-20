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
import scala.scalajs.js.`|`
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
      def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
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
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
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
      def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
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
      def listForProduct(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
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
      def listForProductAndSku(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignmentList] = js.native
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
      def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
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
      def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLicenseAssignment] = js.native
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
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v1 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v1): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceLicenseassignmentsDelete extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.native
      
      /**
        * Name for sku
        */
      var skuId: js.UndefOr[String] = js.native
      
      /**
        * email id or unique Id of the user
        */
      var userId: js.UndefOr[String] = js.native
    }
    object ParamsResourceLicenseassignmentsDelete {
      
      @scala.inline
      def apply(): ParamsResourceLicenseassignmentsDelete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsDelete]
      }
      
      @scala.inline
      implicit class ParamsResourceLicenseassignmentsDeleteMutableBuilder[Self <: ParamsResourceLicenseassignmentsDelete] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        @scala.inline
        def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceLicenseassignmentsGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.native
      
      /**
        * Name for sku
        */
      var skuId: js.UndefOr[String] = js.native
      
      /**
        * email id or unique Id of the user
        */
      var userId: js.UndefOr[String] = js.native
    }
    object ParamsResourceLicenseassignmentsGet {
      
      @scala.inline
      def apply(): ParamsResourceLicenseassignmentsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsGet]
      }
      
      @scala.inline
      implicit class ParamsResourceLicenseassignmentsGetMutableBuilder[Self <: ParamsResourceLicenseassignmentsGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        @scala.inline
        def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceLicenseassignmentsInsert extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaLicenseAssignmentInsert] = js.native
      
      /**
        * Name for sku
        */
      var skuId: js.UndefOr[String] = js.native
    }
    object ParamsResourceLicenseassignmentsInsert {
      
      @scala.inline
      def apply(): ParamsResourceLicenseassignmentsInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsInsert]
      }
      
      @scala.inline
      implicit class ParamsResourceLicenseassignmentsInsertMutableBuilder[Self <: ParamsResourceLicenseassignmentsInsert] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaLicenseAssignmentInsert): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        @scala.inline
        def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceLicenseassignmentsListforproduct extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * CustomerId represents the customer for whom licenseassignments are
        * queried
        */
      var customerId: js.UndefOr[String] = js.native
      
      /**
        * Maximum number of campaigns to return at one time. Must be positive.
        * Optional. Default value is 100.
        */
      var maxResults: js.UndefOr[Double] = js.native
      
      /**
        * Token to fetch the next page.Optional. By default server will return
        * first page
        */
      var pageToken: js.UndefOr[String] = js.native
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.native
    }
    object ParamsResourceLicenseassignmentsListforproduct {
      
      @scala.inline
      def apply(): ParamsResourceLicenseassignmentsListforproduct = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsListforproduct]
      }
      
      @scala.inline
      implicit class ParamsResourceLicenseassignmentsListforproductMutableBuilder[Self <: ParamsResourceLicenseassignmentsListforproduct] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        @scala.inline
        def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceLicenseassignmentsListforproductandsku extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * CustomerId represents the customer for whom licenseassignments are
        * queried
        */
      var customerId: js.UndefOr[String] = js.native
      
      /**
        * Maximum number of campaigns to return at one time. Must be positive.
        * Optional. Default value is 100.
        */
      var maxResults: js.UndefOr[Double] = js.native
      
      /**
        * Token to fetch the next page.Optional. By default server will return
        * first page
        */
      var pageToken: js.UndefOr[String] = js.native
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.native
      
      /**
        * Name for sku
        */
      var skuId: js.UndefOr[String] = js.native
    }
    object ParamsResourceLicenseassignmentsListforproductandsku {
      
      @scala.inline
      def apply(): ParamsResourceLicenseassignmentsListforproductandsku = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsListforproductandsku]
      }
      
      @scala.inline
      implicit class ParamsResourceLicenseassignmentsListforproductandskuMutableBuilder[Self <: ParamsResourceLicenseassignmentsListforproductandsku] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        @scala.inline
        def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        @scala.inline
        def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceLicenseassignmentsPatch extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaLicenseAssignment] = js.native
      
      /**
        * Name for sku for which license would be revoked
        */
      var skuId: js.UndefOr[String] = js.native
      
      /**
        * email id or unique Id of the user
        */
      var userId: js.UndefOr[String] = js.native
    }
    object ParamsResourceLicenseassignmentsPatch {
      
      @scala.inline
      def apply(): ParamsResourceLicenseassignmentsPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsPatch]
      }
      
      @scala.inline
      implicit class ParamsResourceLicenseassignmentsPatchMutableBuilder[Self <: ParamsResourceLicenseassignmentsPatch] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaLicenseAssignment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        @scala.inline
        def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceLicenseassignmentsUpdate extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Name for product
        */
      var productId: js.UndefOr[String] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaLicenseAssignment] = js.native
      
      /**
        * Name for sku for which license would be revoked
        */
      var skuId: js.UndefOr[String] = js.native
      
      /**
        * email id or unique Id of the user
        */
      var userId: js.UndefOr[String] = js.native
    }
    object ParamsResourceLicenseassignmentsUpdate {
      
      @scala.inline
      def apply(): ParamsResourceLicenseassignmentsUpdate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLicenseassignmentsUpdate]
      }
      
      @scala.inline
      implicit class ParamsResourceLicenseassignmentsUpdateMutableBuilder[Self <: ParamsResourceLicenseassignmentsUpdate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaLicenseAssignment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        @scala.inline
        def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    /**
      * Template for LiscenseAssignment Resource
      */
    @js.native
    trait SchemaLicenseAssignment extends StObject {
      
      /**
        * ETag of the resource.
        */
      var etags: js.UndefOr[String] = js.native
      
      /**
        * Identifies the resource as a LicenseAssignment.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * Id of the product.
        */
      var productId: js.UndefOr[String] = js.native
      
      /**
        * Display Name of the product.
        */
      var productName: js.UndefOr[String] = js.native
      
      /**
        * Link to this page.
        */
      var selfLink: js.UndefOr[String] = js.native
      
      /**
        * Id of the sku of the product.
        */
      var skuId: js.UndefOr[String] = js.native
      
      /**
        * Display Name of the sku of the product.
        */
      var skuName: js.UndefOr[String] = js.native
      
      /**
        * Email id of the user.
        */
      var userId: js.UndefOr[String] = js.native
    }
    object SchemaLicenseAssignment {
      
      @scala.inline
      def apply(): SchemaLicenseAssignment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLicenseAssignment]
      }
      
      @scala.inline
      implicit class SchemaLicenseAssignmentMutableBuilder[Self <: SchemaLicenseAssignment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtags(value: String): Self = StObject.set(x, "etags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagsUndefined: Self = StObject.set(x, "etags", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        @scala.inline
        def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
        
        @scala.inline
        def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        @scala.inline
        def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        @scala.inline
        def setSkuName(value: String): Self = StObject.set(x, "skuName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuNameUndefined: Self = StObject.set(x, "skuName", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    /**
      * Template for LicenseAssignment Insert request
      */
    @js.native
    trait SchemaLicenseAssignmentInsert extends StObject {
      
      /**
        * Email id of the user
        */
      var userId: js.UndefOr[String] = js.native
    }
    object SchemaLicenseAssignmentInsert {
      
      @scala.inline
      def apply(): SchemaLicenseAssignmentInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLicenseAssignmentInsert]
      }
      
      @scala.inline
      implicit class SchemaLicenseAssignmentInsertMutableBuilder[Self <: SchemaLicenseAssignmentInsert] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    /**
      * LicesnseAssignment List for a given product/sku for a customer.
      */
    @js.native
    trait SchemaLicenseAssignmentList extends StObject {
      
      /**
        * ETag of the resource.
        */
      var etag: js.UndefOr[String] = js.native
      
      /**
        * The LicenseAssignments in this page of results.
        */
      var items: js.UndefOr[js.Array[SchemaLicenseAssignment]] = js.native
      
      /**
        * Identifies the resource as a collection of LicenseAssignments.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * The continuation token, used to page through large result sets. Provide
        * this value in a subsequent request to return the next page of results.
        */
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object SchemaLicenseAssignmentList {
      
      @scala.inline
      def apply(): SchemaLicenseAssignmentList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLicenseAssignmentList]
      }
      
      @scala.inline
      implicit class SchemaLicenseAssignmentListMutableBuilder[Self <: SchemaLicenseAssignmentList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[SchemaLicenseAssignment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: SchemaLicenseAssignment*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.native
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.native
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.native
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.native
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.native
      
      /**
        * An opaque string that represents a user for quota purposes. Must not
        * exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.native
    }
    object StandardParameters {
      
      @scala.inline
      def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      @scala.inline
      implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        @scala.inline
        def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        @scala.inline
        def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        @scala.inline
        def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
