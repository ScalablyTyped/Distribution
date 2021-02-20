package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Alg
import typings.googleapis.googleapisStrings.v2
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth2V2Mod {
  
  object oauth2V2 {
    
    /**
      * Google OAuth2 API
      *
      * Obtains end-user authorization grants for use with other Google APIs.
      *
      * @example
      * const {google} = require('googleapis');
      * const oauth2 = google.oauth2('v2');
      *
      * @namespace oauth2
      * @type {Function}
      * @version v2
      * @variation v2
      * @param {object=} options Options for Oauth2
      */
    @JSImport("googleapis/build/src/apis/oauth2/v2", "oauth2_v2.Oauth2")
    @js.native
    class Oauth2 protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * oauth2.getCertForOpenIdConnect
        * @alias oauth2.getCertForOpenIdConnect
        * @memberOf! oauth2(v2)
        *
        * @param {object=} params Parameters for request
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def getCertForOpenIdConnect(): GaxiosPromise[SchemaJwk] = js.native
      def getCertForOpenIdConnect(callback: BodyResponseCallback[SchemaJwk]): Unit = js.native
      def getCertForOpenIdConnect(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJwk] = js.native
      def getCertForOpenIdConnect(params: ParamsGetcertforopenidconnect): GaxiosPromise[SchemaJwk] = js.native
      def getCertForOpenIdConnect(params: ParamsGetcertforopenidconnect, callback: BodyResponseCallback[SchemaJwk]): Unit = js.native
      def getCertForOpenIdConnect(
        params: ParamsGetcertforopenidconnect,
        options: BodyResponseCallback[SchemaJwk],
        callback: BodyResponseCallback[SchemaJwk]
      ): Unit = js.native
      def getCertForOpenIdConnect(params: ParamsGetcertforopenidconnect, options: MethodOptions): GaxiosPromise[SchemaJwk] = js.native
      def getCertForOpenIdConnect(
        params: ParamsGetcertforopenidconnect,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaJwk]
      ): Unit = js.native
      
      /**
        * oauth2.tokeninfo
        * @alias oauth2.tokeninfo
        * @memberOf! oauth2(v2)
        *
        * @param {object=} params Parameters for request
        * @param {string=} params.access_token
        * @param {string=} params.id_token
        * @param {string=} params.token_handle
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def tokeninfo(): GaxiosPromise[SchemaTokeninfo] = js.native
      def tokeninfo(callback: BodyResponseCallback[SchemaTokeninfo]): Unit = js.native
      def tokeninfo(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTokeninfo] = js.native
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
    
    @JSImport("googleapis/build/src/apis/oauth2/v2", "oauth2_v2.Resource$Userinfo")
    @js.native
    class ResourceUserinfo protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * oauth2.userinfo.get
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
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserinfoplus] = js.native
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
    
    @JSImport("googleapis/build/src/apis/oauth2/v2", "oauth2_v2.Resource$Userinfo$V2")
    @js.native
    class ResourceUserinfoV2 protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var me: ResourceUserinfoV2Me = js.native
    }
    
    @JSImport("googleapis/build/src/apis/oauth2/v2", "oauth2_v2.Resource$Userinfo$V2$Me")
    @js.native
    class ResourceUserinfoV2Me protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * oauth2.userinfo.v2.me.get
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
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserinfoplus] = js.native
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
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v2 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v2): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v2): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsGetcertforopenidconnect extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
    }
    object ParamsGetcertforopenidconnect {
      
      @scala.inline
      def apply(): ParamsGetcertforopenidconnect = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsGetcertforopenidconnect]
      }
      
      @scala.inline
      implicit class ParamsGetcertforopenidconnectMutableBuilder[Self <: ParamsGetcertforopenidconnect] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceUserinfoGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
    }
    object ParamsResourceUserinfoGet {
      
      @scala.inline
      def apply(): ParamsResourceUserinfoGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUserinfoGet]
      }
      
      @scala.inline
      implicit class ParamsResourceUserinfoGetMutableBuilder[Self <: ParamsResourceUserinfoGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceUserinfoV2MeGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
    }
    object ParamsResourceUserinfoV2MeGet {
      
      @scala.inline
      def apply(): ParamsResourceUserinfoV2MeGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUserinfoV2MeGet]
      }
      
      @scala.inline
      implicit class ParamsResourceUserinfoV2MeGetMutableBuilder[Self <: ParamsResourceUserinfoV2MeGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      }
    }
    
    @js.native
    trait ParamsTokeninfo extends StandardParameters {
      
      /**
        *
        */
      var access_token: js.UndefOr[String] = js.native
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        *
        */
      var id_token: js.UndefOr[String] = js.native
      
      /**
        *
        */
      var token_handle: js.UndefOr[String] = js.native
    }
    object ParamsTokeninfo {
      
      @scala.inline
      def apply(): ParamsTokeninfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsTokeninfo]
      }
      
      @scala.inline
      implicit class ParamsTokeninfoMutableBuilder[Self <: ParamsTokeninfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
        
        @scala.inline
        def setToken_handle(value: String): Self = StObject.set(x, "token_handle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToken_handleUndefined: Self = StObject.set(x, "token_handle", js.undefined)
      }
    }
    
    @js.native
    trait SchemaJwk extends StObject {
      
      var keys: js.UndefOr[js.Array[Alg]] = js.native
    }
    object SchemaJwk {
      
      @scala.inline
      def apply(): SchemaJwk = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaJwk]
      }
      
      @scala.inline
      implicit class SchemaJwkMutableBuilder[Self <: SchemaJwk] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKeys(value: js.Array[Alg]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
        
        @scala.inline
        def setKeysVarargs(value: Alg*): Self = StObject.set(x, "keys", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SchemaTokeninfo extends StObject {
      
      /**
        * The access type granted with this token. It can be offline or online.
        */
      var access_type: js.UndefOr[String] = js.native
      
      /**
        * Who is the intended audience for this token. In general the same as
        * issued_to.
        */
      var audience: js.UndefOr[String] = js.native
      
      /**
        * The email address of the user. Present only if the email scope is present
        * in the request.
        */
      var email: js.UndefOr[String] = js.native
      
      /**
        * The expiry time of the token, as number of seconds left until expiry.
        */
      var expires_in: js.UndefOr[Double] = js.native
      
      /**
        * To whom was the token issued to. In general the same as audience.
        */
      var issued_to: js.UndefOr[String] = js.native
      
      /**
        * The space separated list of scopes granted to this token.
        */
      var scope: js.UndefOr[String] = js.native
      
      /**
        * The token handle associated with this token.
        */
      var token_handle: js.UndefOr[String] = js.native
      
      /**
        * The obfuscated user id.
        */
      var user_id: js.UndefOr[String] = js.native
      
      /**
        * Boolean flag which is true if the email address is verified. Present only
        * if the email scope is present in the request.
        */
      var verified_email: js.UndefOr[Boolean] = js.native
    }
    object SchemaTokeninfo {
      
      @scala.inline
      def apply(): SchemaTokeninfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTokeninfo]
      }
      
      @scala.inline
      implicit class SchemaTokeninfoMutableBuilder[Self <: SchemaTokeninfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccess_type(value: String): Self = StObject.set(x, "access_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccess_typeUndefined: Self = StObject.set(x, "access_type", js.undefined)
        
        @scala.inline
        def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        @scala.inline
        def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
        
        @scala.inline
        def setIssued_to(value: String): Self = StObject.set(x, "issued_to", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIssued_toUndefined: Self = StObject.set(x, "issued_to", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        @scala.inline
        def setToken_handle(value: String): Self = StObject.set(x, "token_handle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToken_handleUndefined: Self = StObject.set(x, "token_handle", js.undefined)
        
        @scala.inline
        def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
        
        @scala.inline
        def setVerified_email(value: Boolean): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerified_emailUndefined: Self = StObject.set(x, "verified_email", js.undefined)
      }
    }
    
    @js.native
    trait SchemaUserinfoplus extends StObject {
      
      /**
        * The user&#39;s email address.
        */
      var email: js.UndefOr[String] = js.native
      
      /**
        * The user&#39;s last name.
        */
      var family_name: js.UndefOr[String] = js.native
      
      /**
        * The user&#39;s gender.
        */
      var gender: js.UndefOr[String] = js.native
      
      /**
        * The user&#39;s first name.
        */
      var given_name: js.UndefOr[String] = js.native
      
      /**
        * The hosted domain e.g. example.com if the user is Google apps user.
        */
      var hd: js.UndefOr[String] = js.native
      
      /**
        * The obfuscated ID of the user.
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * URL of the profile page.
        */
      var link: js.UndefOr[String] = js.native
      
      /**
        * The user&#39;s preferred locale.
        */
      var locale: js.UndefOr[String] = js.native
      
      /**
        * The user&#39;s full name.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * URL of the user&#39;s picture image.
        */
      var picture: js.UndefOr[String] = js.native
      
      /**
        * Boolean flag which is true if the email address is verified. Always
        * verified because we only return the user&#39;s primary email address.
        */
      var verified_email: js.UndefOr[Boolean] = js.native
    }
    object SchemaUserinfoplus {
      
      @scala.inline
      def apply(): SchemaUserinfoplus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUserinfoplus]
      }
      
      @scala.inline
      implicit class SchemaUserinfoplusMutableBuilder[Self <: SchemaUserinfoplus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        @scala.inline
        def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
        
        @scala.inline
        def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
        
        @scala.inline
        def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
        
        @scala.inline
        def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
        
        @scala.inline
        def setVerified_email(value: Boolean): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerified_emailUndefined: Self = StObject.set(x, "verified_email", js.undefined)
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
