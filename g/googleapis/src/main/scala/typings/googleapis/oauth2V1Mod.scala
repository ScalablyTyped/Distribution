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

object oauth2V1Mod {
  
  object oauth2V1 {
    
    /**
      * Google OAuth2 API
      *
      * Obtains end-user authorization grants for use with other Google APIs.
      *
      * @example
      * const {google} = require('googleapis');
      * const oauth2 = google.oauth2('v1');
      *
      * @namespace oauth2
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Oauth2
      */
    @JSImport("googleapis/build/src/apis/oauth2/v1", "oauth2_v1.Oauth2")
    @js.native
    class Oauth2 protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * oauth2.tokeninfo
        * @desc Get token info
        * @alias oauth2.tokeninfo
        * @memberOf! oauth2(v1)
        *
        * @param {object=} params Parameters for request
        * @param {string=} params.access_token The oauth2 access token
        * @param {string=} params.id_token The ID token
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def tokeninfo(): GaxiosPromise[SchemaTokeninfo] = js.native
      def tokeninfo(callback: BodyResponseCallback[SchemaTokeninfo]): Unit = js.native
      def tokeninfo(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTokeninfo] = js.native
      def tokeninfo(params: ParamsTokeninfo): GaxiosPromise[SchemaTokeninfo] = js.native
      def tokeninfo(params: ParamsTokeninfo, callback: BodyResponseCallback[SchemaTokeninfo]): Unit = js.native
      def tokeninfo(
        params: ParamsTokeninfo,
        options: BodyResponseCallback[SchemaTokeninfo],
        callback: BodyResponseCallback[SchemaTokeninfo]
      ): Unit = js.native
      def tokeninfo(params: ParamsTokeninfo, options: MethodOptions): GaxiosPromise[SchemaTokeninfo] = js.native
      def tokeninfo(params: ParamsTokeninfo, options: MethodOptions, callback: BodyResponseCallback[SchemaTokeninfo]): Unit = js.native
      
      var userinfo: ResourceUserinfo = js.native
    }
    
    @JSImport("googleapis/build/src/apis/oauth2/v1", "oauth2_v1.Resource$Userinfo")
    @js.native
    class ResourceUserinfo protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * oauth2.userinfo.get
        * @desc Get user info
        * @alias oauth2.userinfo.get
        * @memberOf! ()
        *
        * @param {object=} params Parameters for request
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaUserinfoplus] = js.native
      def get(callback: BodyResponseCallback[SchemaUserinfoplus]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserinfoplus] = js.native
      def get(params: ParamsResourceUserinfoGet): GaxiosPromise[SchemaUserinfoplus] = js.native
      def get(params: ParamsResourceUserinfoGet, callback: BodyResponseCallback[SchemaUserinfoplus]): Unit = js.native
      def get(
        params: ParamsResourceUserinfoGet,
        options: BodyResponseCallback[SchemaUserinfoplus],
        callback: BodyResponseCallback[SchemaUserinfoplus]
      ): Unit = js.native
      def get(params: ParamsResourceUserinfoGet, options: MethodOptions): GaxiosPromise[SchemaUserinfoplus] = js.native
      def get(
        params: ParamsResourceUserinfoGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaUserinfoplus]
      ): Unit = js.native
      
      var v2: ResourceUserinfoV2 = js.native
    }
    
    @JSImport("googleapis/build/src/apis/oauth2/v1", "oauth2_v1.Resource$Userinfo$V2")
    @js.native
    class ResourceUserinfoV2 protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var me: ResourceUserinfoV2Me = js.native
    }
    
    @JSImport("googleapis/build/src/apis/oauth2/v1", "oauth2_v1.Resource$Userinfo$V2$Me")
    @js.native
    class ResourceUserinfoV2Me protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * oauth2.userinfo.v2.me.get
        * @desc Get user info
        * @alias oauth2.userinfo.v2.me.get
        * @memberOf! ()
        *
        * @param {object=} params Parameters for request
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaUserinfoplus] = js.native
      def get(callback: BodyResponseCallback[SchemaUserinfoplus]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserinfoplus] = js.native
      def get(params: ParamsResourceUserinfoV2MeGet): GaxiosPromise[SchemaUserinfoplus] = js.native
      def get(params: ParamsResourceUserinfoV2MeGet, callback: BodyResponseCallback[SchemaUserinfoplus]): Unit = js.native
      def get(
        params: ParamsResourceUserinfoV2MeGet,
        options: BodyResponseCallback[SchemaUserinfoplus],
        callback: BodyResponseCallback[SchemaUserinfoplus]
      ): Unit = js.native
      def get(params: ParamsResourceUserinfoV2MeGet, options: MethodOptions): GaxiosPromise[SchemaUserinfoplus] = js.native
      def get(
        params: ParamsResourceUserinfoV2MeGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaUserinfoplus]
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
    
    trait ParamsResourceUserinfoGet
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
    }
    object ParamsResourceUserinfoGet {
      
      inline def apply(): ParamsResourceUserinfoGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUserinfoGet]
      }
      
      extension [Self <: ParamsResourceUserinfoGet](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      }
    }
    
    trait ParamsResourceUserinfoV2MeGet
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
    }
    object ParamsResourceUserinfoV2MeGet {
      
      inline def apply(): ParamsResourceUserinfoV2MeGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUserinfoV2MeGet]
      }
      
      extension [Self <: ParamsResourceUserinfoV2MeGet](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      }
    }
    
    trait ParamsTokeninfo
      extends StObject
         with StandardParameters {
      
      /**
        * The oauth2 access token
        */
      var access_token: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * The ID token
        */
      var id_token: js.UndefOr[String] = js.undefined
    }
    object ParamsTokeninfo {
      
      inline def apply(): ParamsTokeninfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsTokeninfo]
      }
      
      extension [Self <: ParamsTokeninfo](x: Self) {
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
        
        inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      }
    }
    
    trait SchemaTokeninfo extends StObject {
      
      /**
        * The access type granted with this token. It can be offline or online.
        */
      var access_type: js.UndefOr[String] = js.undefined
      
      /**
        * Who is the intended audience for this token. In general the same as
        * issued_to.
        */
      var audience: js.UndefOr[String] = js.undefined
      
      /**
        * The email address of the user. Present only if the email scope is present
        * in the request.
        */
      var email: js.UndefOr[String] = js.undefined
      
      /**
        * Boolean flag which is true if the email address is verified. Present only
        * if the email scope is present in the request.
        */
      var email_verified: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The expiry time of the token, as number of seconds left until expiry.
        */
      var expires_in: js.UndefOr[Double] = js.undefined
      
      /**
        * The issue time of the token, as number of seconds.
        */
      var issued_at: js.UndefOr[Double] = js.undefined
      
      /**
        * To whom was the token issued to. In general the same as audience.
        */
      var issued_to: js.UndefOr[String] = js.undefined
      
      /**
        * Who issued the token.
        */
      var issuer: js.UndefOr[String] = js.undefined
      
      /**
        * Nonce of the id token.
        */
      var nonce: js.UndefOr[String] = js.undefined
      
      /**
        * The space separated list of scopes granted to this token.
        */
      var scope: js.UndefOr[String] = js.undefined
      
      /**
        * The obfuscated user id.
        */
      var user_id: js.UndefOr[String] = js.undefined
      
      /**
        * Boolean flag which is true if the email address is verified. Present only
        * if the email scope is present in the request.
        */
      var verified_email: js.UndefOr[Boolean] = js.undefined
    }
    object SchemaTokeninfo {
      
      inline def apply(): SchemaTokeninfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTokeninfo]
      }
      
      extension [Self <: SchemaTokeninfo](x: Self) {
        
        inline def setAccess_type(value: String): Self = StObject.set(x, "access_type", value.asInstanceOf[js.Any])
        
        inline def setAccess_typeUndefined: Self = StObject.set(x, "access_type", js.undefined)
        
        inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
        
        inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
        
        inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
        
        inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
        
        inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
        
        inline def setIssued_at(value: Double): Self = StObject.set(x, "issued_at", value.asInstanceOf[js.Any])
        
        inline def setIssued_atUndefined: Self = StObject.set(x, "issued_at", js.undefined)
        
        inline def setIssued_to(value: String): Self = StObject.set(x, "issued_to", value.asInstanceOf[js.Any])
        
        inline def setIssued_toUndefined: Self = StObject.set(x, "issued_to", js.undefined)
        
        inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
        
        inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
        
        inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
        
        inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
        
        inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
        
        inline def setVerified_email(value: Boolean): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
        
        inline def setVerified_emailUndefined: Self = StObject.set(x, "verified_email", js.undefined)
      }
    }
    
    trait SchemaUserinfoplus extends StObject {
      
      /**
        * The user&#39;s email address.
        */
      var email: js.UndefOr[String] = js.undefined
      
      /**
        * The user&#39;s last name.
        */
      var family_name: js.UndefOr[String] = js.undefined
      
      /**
        * The user&#39;s gender.
        */
      var gender: js.UndefOr[String] = js.undefined
      
      /**
        * The user&#39;s first name.
        */
      var given_name: js.UndefOr[String] = js.undefined
      
      /**
        * The hosted domain e.g. example.com if the user is Google apps user.
        */
      var hd: js.UndefOr[String] = js.undefined
      
      /**
        * The obfuscated ID of the user.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * URL of the profile page.
        */
      var link: js.UndefOr[String] = js.undefined
      
      /**
        * The user&#39;s preferred locale.
        */
      var locale: js.UndefOr[String] = js.undefined
      
      /**
        * The user&#39;s full name.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * URL of the user&#39;s picture image.
        */
      var picture: js.UndefOr[String] = js.undefined
      
      /**
        * Boolean flag which is true if the email address is verified. Always
        * verified because we only return the user&#39;s primary email address.
        */
      var verified_email: js.UndefOr[Boolean] = js.undefined
    }
    object SchemaUserinfoplus {
      
      inline def apply(): SchemaUserinfoplus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUserinfoplus]
      }
      
      extension [Self <: SchemaUserinfoplus](x: Self) {
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
        
        inline def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
        
        inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
        
        inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
        
        inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
        
        inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
        
        inline def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
        
        inline def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
        
        inline def setVerified_email(value: Boolean): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
        
        inline def setVerified_emailUndefined: Self = StObject.set(x, "verified_email", js.undefined)
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
