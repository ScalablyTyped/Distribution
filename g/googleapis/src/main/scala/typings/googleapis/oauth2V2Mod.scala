package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v2
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

object oauth2V2Mod {
  
  object oauth2V2 {
    
    @JSImport("googleapis/build/src/apis/oauth2/v2", "oauth2_v2.Oauth2")
    @js.native
    open class Oauth2 protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      def tokeninfo(): GaxiosPromise[SchemaTokeninfo] = js.native
      def tokeninfo(callback: BodyResponseCallback[SchemaTokeninfo]): Unit = js.native
      def tokeninfo(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTokeninfo] = js.native
      def tokeninfo(params: ParamsTokeninfo): GaxiosPromise[SchemaTokeninfo] = js.native
      def tokeninfo(params: ParamsTokeninfo, callback: BodyResponseCallback[SchemaTokeninfo]): Unit = js.native
      def tokeninfo(
        params: ParamsTokeninfo,
        options: BodyResponseCallback[Readable | SchemaTokeninfo],
        callback: BodyResponseCallback[Readable | SchemaTokeninfo]
      ): Unit = js.native
      def tokeninfo(params: ParamsTokeninfo, options: MethodOptions): GaxiosPromise[SchemaTokeninfo] = js.native
      def tokeninfo(params: ParamsTokeninfo, options: MethodOptions, callback: BodyResponseCallback[SchemaTokeninfo]): Unit = js.native
      /**
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/oauth2.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const oauth2 = google.oauth2('v2');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await oauth2.tokeninfo({
        *     access_token: 'placeholder-value',
        *
        *     id_token: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "audience": "my_audience",
        *   //   "email": "my_email",
        *   //   "expires_in": 0,
        *   //   "issued_to": "my_issued_to",
        *   //   "scope": "my_scope",
        *   //   "user_id": "my_user_id",
        *   //   "verified_email": false
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
      def tokeninfo(params: ParamsTokeninfo, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def tokeninfo(params: ParamsTokeninfo, options: StreamMethodOptions, callback: BodyResponseCallback[Readable]): Unit = js.native
      
      var userinfo: ResourceUserinfo = js.native
    }
    
    @JSImport("googleapis/build/src/apis/oauth2/v2", "oauth2_v2.Resource$Userinfo")
    @js.native
    open class ResourceUserinfo protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaUserinfo] = js.native
      def get(callback: BodyResponseCallback[SchemaUserinfo]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserinfo] = js.native
      def get(params: ParamsResourceUserinfoGet): GaxiosPromise[SchemaUserinfo] = js.native
      def get(params: ParamsResourceUserinfoGet, callback: BodyResponseCallback[SchemaUserinfo]): Unit = js.native
      def get(
        params: ParamsResourceUserinfoGet,
        options: BodyResponseCallback[Readable | SchemaUserinfo],
        callback: BodyResponseCallback[Readable | SchemaUserinfo]
      ): Unit = js.native
      def get(params: ParamsResourceUserinfoGet, options: MethodOptions): GaxiosPromise[SchemaUserinfo] = js.native
      def get(
        params: ParamsResourceUserinfoGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaUserinfo]
      ): Unit = js.native
      /**
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/oauth2.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const oauth2 = google.oauth2('v2');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'openid',
        *       'https://www.googleapis.com/auth/userinfo.email',
        *       'https://www.googleapis.com/auth/userinfo.profile',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await oauth2.userinfo.get({});
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "email": "my_email",
        *   //   "family_name": "my_family_name",
        *   //   "gender": "my_gender",
        *   //   "given_name": "my_given_name",
        *   //   "hd": "my_hd",
        *   //   "id": "my_id",
        *   //   "link": "my_link",
        *   //   "locale": "my_locale",
        *   //   "name": "my_name",
        *   //   "picture": "my_picture",
        *   //   "verified_email": false
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
      def get(params: ParamsResourceUserinfoGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceUserinfoGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      var v2: ResourceUserinfoV2 = js.native
    }
    
    @JSImport("googleapis/build/src/apis/oauth2/v2", "oauth2_v2.Resource$Userinfo$V2")
    @js.native
    open class ResourceUserinfoV2 protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var me: ResourceUserinfoV2Me = js.native
    }
    
    @JSImport("googleapis/build/src/apis/oauth2/v2", "oauth2_v2.Resource$Userinfo$V2$Me")
    @js.native
    open class ResourceUserinfoV2Me protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaUserinfo] = js.native
      def get(callback: BodyResponseCallback[SchemaUserinfo]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserinfo] = js.native
      def get(params: ParamsResourceUserinfoV2MeGet): GaxiosPromise[SchemaUserinfo] = js.native
      def get(params: ParamsResourceUserinfoV2MeGet, callback: BodyResponseCallback[SchemaUserinfo]): Unit = js.native
      def get(
        params: ParamsResourceUserinfoV2MeGet,
        options: BodyResponseCallback[Readable | SchemaUserinfo],
        callback: BodyResponseCallback[Readable | SchemaUserinfo]
      ): Unit = js.native
      def get(params: ParamsResourceUserinfoV2MeGet, options: MethodOptions): GaxiosPromise[SchemaUserinfo] = js.native
      def get(
        params: ParamsResourceUserinfoV2MeGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaUserinfo]
      ): Unit = js.native
      /**
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/oauth2.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const oauth2 = google.oauth2('v2');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'openid',
        *       'https://www.googleapis.com/auth/userinfo.email',
        *       'https://www.googleapis.com/auth/userinfo.profile',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await oauth2.userinfo.v2.me.get({});
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "email": "my_email",
        *   //   "family_name": "my_family_name",
        *   //   "gender": "my_gender",
        *   //   "given_name": "my_given_name",
        *   //   "hd": "my_hd",
        *   //   "id": "my_id",
        *   //   "link": "my_link",
        *   //   "locale": "my_locale",
        *   //   "name": "my_name",
        *   //   "picture": "my_picture",
        *   //   "verified_email": false
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
      def get(params: ParamsResourceUserinfoV2MeGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceUserinfoV2MeGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v2
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v2")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v2): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    type ParamsResourceUserinfoGet = StandardParameters
    
    type ParamsResourceUserinfoV2MeGet = StandardParameters
    
    trait ParamsTokeninfo
      extends StObject
         with StandardParameters {
      
      /**
        *
        */
      var access_token: js.UndefOr[String] = js.undefined
      
      /**
        *
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
        
        inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
        
        inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      }
    }
    
    trait SchemaTokeninfo extends StObject {
      
      /**
        * Who is the intended audience for this token. In general the same as issued_to.
        */
      var audience: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The email address of the user. Present only if the email scope is present in the request.
        */
      var email: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The expiry time of the token, as number of seconds left until expiry.
        */
      var expires_in: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * To whom was the token issued to. In general the same as audience.
        */
      var issued_to: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The space separated list of scopes granted to this token.
        */
      var scope: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The obfuscated user id.
        */
      var user_id: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Boolean flag which is true if the email address is verified. Present only if the email scope is present in the request.
        */
      var verified_email: js.UndefOr[Boolean | Null] = js.undefined
    }
    object SchemaTokeninfo {
      
      inline def apply(): SchemaTokeninfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTokeninfo]
      }
      
      extension [Self <: SchemaTokeninfo](x: Self) {
        
        inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
        
        inline def setAudienceNull: Self = StObject.set(x, "audience", null)
        
        inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailNull: Self = StObject.set(x, "email", null)
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
        
        inline def setExpires_inNull: Self = StObject.set(x, "expires_in", null)
        
        inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
        
        inline def setIssued_to(value: String): Self = StObject.set(x, "issued_to", value.asInstanceOf[js.Any])
        
        inline def setIssued_toNull: Self = StObject.set(x, "issued_to", null)
        
        inline def setIssued_toUndefined: Self = StObject.set(x, "issued_to", js.undefined)
        
        inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeNull: Self = StObject.set(x, "scope", null)
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
        
        inline def setUser_idNull: Self = StObject.set(x, "user_id", null)
        
        inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
        
        inline def setVerified_email(value: Boolean): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
        
        inline def setVerified_emailNull: Self = StObject.set(x, "verified_email", null)
        
        inline def setVerified_emailUndefined: Self = StObject.set(x, "verified_email", js.undefined)
      }
    }
    
    trait SchemaUserinfo extends StObject {
      
      /**
        * The user's email address.
        */
      var email: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The user's last name.
        */
      var family_name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The user's gender.
        */
      var gender: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The user's first name.
        */
      var given_name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The hosted domain e.g. example.com if the user is Google apps user.
        */
      var hd: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The obfuscated ID of the user.
        */
      var id: js.UndefOr[String | Null] = js.undefined
      
      /**
        * URL of the profile page.
        */
      var link: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The user's preferred locale.
        */
      var locale: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The user's full name.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * URL of the user's picture image.
        */
      var picture: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Boolean flag which is true if the email address is verified. Always verified because we only return the user's primary email address.
        */
      var verified_email: js.UndefOr[Boolean | Null] = js.undefined
    }
    object SchemaUserinfo {
      
      inline def apply(): SchemaUserinfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUserinfo]
      }
      
      extension [Self <: SchemaUserinfo](x: Self) {
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailNull: Self = StObject.set(x, "email", null)
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
        
        inline def setFamily_nameNull: Self = StObject.set(x, "family_name", null)
        
        inline def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
        
        inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
        
        inline def setGenderNull: Self = StObject.set(x, "gender", null)
        
        inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
        
        inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
        
        inline def setGiven_nameNull: Self = StObject.set(x, "given_name", null)
        
        inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
        
        inline def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
        
        inline def setHdNull: Self = StObject.set(x, "hd", null)
        
        inline def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdNull: Self = StObject.set(x, "id", null)
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkNull: Self = StObject.set(x, "link", null)
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        inline def setLocaleNull: Self = StObject.set(x, "locale", null)
        
        inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        inline def setPictureNull: Self = StObject.set(x, "picture", null)
        
        inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
        
        inline def setVerified_email(value: Boolean): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
        
        inline def setVerified_emailNull: Self = StObject.set(x, "verified_email", null)
        
        inline def setVerified_emailUndefined: Self = StObject.set(x, "verified_email", js.undefined)
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
