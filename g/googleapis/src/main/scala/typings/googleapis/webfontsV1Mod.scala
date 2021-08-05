package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
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

object webfontsV1Mod {
  
  object webfontsV1 {
    
    @JSImport("googleapis/build/src/apis/webfonts/v1", "webfonts_v1.Resource$Webfonts")
    @js.native
    class ResourceWebfonts protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * webfonts.webfonts.list
        * @desc Retrieves the list of fonts currently served by the Google Fonts
        * Developer API
        * @alias webfonts.webfonts.list
        * @memberOf! ()
        *
        * @param {object=} params Parameters for request
        * @param {string=} params.sort Enables sorting of the list
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaWebfontList] = js.native
      def list(callback: BodyResponseCallback[SchemaWebfontList]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebfontList] = js.native
      def list(params: ParamsResourceWebfontsList): GaxiosPromise[SchemaWebfontList] = js.native
      def list(params: ParamsResourceWebfontsList, callback: BodyResponseCallback[SchemaWebfontList]): Unit = js.native
      def list(
        params: ParamsResourceWebfontsList,
        options: BodyResponseCallback[SchemaWebfontList],
        callback: BodyResponseCallback[SchemaWebfontList]
      ): Unit = js.native
      def list(params: ParamsResourceWebfontsList, options: MethodOptions): GaxiosPromise[SchemaWebfontList] = js.native
      def list(
        params: ParamsResourceWebfontsList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaWebfontList]
      ): Unit = js.native
    }
    
    /**
      * Google Fonts Developer API
      *
      * Accesses the metadata for all families served by Google Fonts, providing a
      * list of families currently available (including available styles and a list
      * of supported script subsets).
      *
      * @example
      * const {google} = require('googleapis');
      * const webfonts = google.webfonts('v1');
      *
      * @namespace webfonts
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Webfonts
      */
    @JSImport("googleapis/build/src/apis/webfonts/v1", "webfonts_v1.Webfonts")
    @js.native
    class Webfonts protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var webfonts: ResourceWebfonts = js.native
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
    
    trait ParamsResourceWebfontsList
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Enables sorting of the list
        */
      var sort: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceWebfontsList {
      
      inline def apply(): ParamsResourceWebfontsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceWebfontsList]
      }
      
      extension [Self <: ParamsResourceWebfontsList](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
        
        inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      }
    }
    
    trait SchemaWebfont extends StObject {
      
      /**
        * The category of the font.
        */
      var category: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the font.
        */
      var family: js.UndefOr[String] = js.undefined
      
      /**
        * The font files (with all supported scripts) for each one of the available
        * variants, as a key : value map.
        */
      var files: js.UndefOr[StringDictionary[String]] = js.undefined
      
      /**
        * This kind represents a webfont object in the webfonts service.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * The date (format &quot;yyyy-MM-dd&quot;) the font was modified for the
        * last time.
        */
      var lastModified: js.UndefOr[String] = js.undefined
      
      /**
        * The scripts supported by the font.
        */
      var subsets: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The available variants for the font.
        */
      var variants: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The font version.
        */
      var version: js.UndefOr[String] = js.undefined
    }
    object SchemaWebfont {
      
      inline def apply(): SchemaWebfont = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaWebfont]
      }
      
      extension [Self <: SchemaWebfont](x: Self) {
        
        inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
        
        inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
        
        inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
        
        inline def setFiles(value: StringDictionary[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
        
        inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
        
        inline def setSubsets(value: js.Array[String]): Self = StObject.set(x, "subsets", value.asInstanceOf[js.Any])
        
        inline def setSubsetsUndefined: Self = StObject.set(x, "subsets", js.undefined)
        
        inline def setSubsetsVarargs(value: String*): Self = StObject.set(x, "subsets", js.Array(value :_*))
        
        inline def setVariants(value: js.Array[String]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
        
        inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
        
        inline def setVariantsVarargs(value: String*): Self = StObject.set(x, "variants", js.Array(value :_*))
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    trait SchemaWebfontList extends StObject {
      
      /**
        * The list of fonts currently served by the Google Fonts API.
        */
      var items: js.UndefOr[js.Array[SchemaWebfont]] = js.undefined
      
      /**
        * This kind represents a list of webfont objects in the webfonts service.
        */
      var kind: js.UndefOr[String] = js.undefined
    }
    object SchemaWebfontList {
      
      inline def apply(): SchemaWebfontList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaWebfontList]
      }
      
      extension [Self <: SchemaWebfontList](x: Self) {
        
        inline def setItems(value: js.Array[SchemaWebfont]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SchemaWebfont*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
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
