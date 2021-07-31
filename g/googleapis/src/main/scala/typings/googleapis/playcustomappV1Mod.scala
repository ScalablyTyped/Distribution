package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playcustomappV1Mod {
  
  object playcustomappV1 {
    
    /**
      * Google Play Custom App Publishing API
      *
      * An API to publish custom Android apps.
      *
      * @example
      * const {google} = require('googleapis');
      * const playcustomapp = google.playcustomapp('v1');
      *
      * @namespace playcustomapp
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Playcustomapp
      */
    @JSImport("googleapis/build/src/apis/playcustomapp/v1", "playcustomapp_v1.Playcustomapp")
    @js.native
    class Playcustomapp protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var accounts: ResourceAccounts = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/playcustomapp/v1", "playcustomapp_v1.Resource$Accounts")
    @js.native
    class ResourceAccounts protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var customApps: ResourceAccountsCustomapps = js.native
    }
    
    @JSImport("googleapis/build/src/apis/playcustomapp/v1", "playcustomapp_v1.Resource$Accounts$Customapps")
    @js.native
    class ResourceAccountsCustomapps protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * playcustomapp.accounts.customApps.create
        * @desc Create and publish a new custom app.
        * @alias playcustomapp.accounts.customApps.create
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.account Developer account ID.
        * @param  {object} params.resource Media resource metadata
        * @param {object} params.media Media object
        * @param {string} params.media.mimeType Media mime-type
        * @param {string|object} params.media.body Media body contents
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def create(): GaxiosPromise[SchemaCustomApp] = js.native
      def create(callback: BodyResponseCallback[SchemaCustomApp]): Unit = js.native
      def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomApp] = js.native
      def create(params: ParamsResourceAccountsCustomappsCreate): GaxiosPromise[SchemaCustomApp] = js.native
      def create(params: ParamsResourceAccountsCustomappsCreate, callback: BodyResponseCallback[SchemaCustomApp]): Unit = js.native
      def create(
        params: ParamsResourceAccountsCustomappsCreate,
        options: BodyResponseCallback[SchemaCustomApp],
        callback: BodyResponseCallback[SchemaCustomApp]
      ): Unit = js.native
      def create(params: ParamsResourceAccountsCustomappsCreate, options: MethodOptions): GaxiosPromise[SchemaCustomApp] = js.native
      def create(
        params: ParamsResourceAccountsCustomappsCreate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaCustomApp]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceAccountsCustomappsCreate
      extends StObject
         with StandardParameters {
      
      /**
        * Developer account ID.
        */
      var account: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Media metadata
        */
      var media: js.UndefOr[Body] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaCustomApp] = js.undefined
    }
    object ParamsResourceAccountsCustomappsCreate {
      
      @scala.inline
      def apply(): ParamsResourceAccountsCustomappsCreate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceAccountsCustomappsCreate]
      }
      
      @scala.inline
      implicit class ParamsResourceAccountsCustomappsCreateMutableBuilder[Self <: ParamsResourceAccountsCustomappsCreate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaCustomApp): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    /**
      * This resource represents a custom app.
      */
    trait SchemaCustomApp extends StObject {
      
      /**
        * Default listing language in BCP 47 format.
        */
      var languageCode: js.UndefOr[String] = js.undefined
      
      /**
        * Title for the Android app.
        */
      var title: js.UndefOr[String] = js.undefined
    }
    object SchemaCustomApp {
      
      @scala.inline
      def apply(): SchemaCustomApp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaCustomApp]
      }
      
      @scala.inline
      implicit class SchemaCustomAppMutableBuilder[Self <: SchemaCustomApp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
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
