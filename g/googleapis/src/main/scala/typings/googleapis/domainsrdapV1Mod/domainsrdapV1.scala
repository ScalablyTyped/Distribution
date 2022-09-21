package typings.googleapis.domainsrdapV1Mod

import org.scalablytyped.runtime.StringDictionary
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

object domainsrdapV1 {
  
  @JSImport("googleapis/build/src/apis/domainsrdap/v1", "domainsrdap_v1.Domainsrdap")
  @js.native
  open class Domainsrdap protected () extends StObject {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    
    var autnum: ResourceAutnum = js.native
    
    var context: APIRequestContext = js.native
    
    var domain: ResourceDomain = js.native
    
    var entity: ResourceEntity = js.native
    
    var ip: ResourceIp = js.native
    
    var nameserver: ResourceNameserver = js.native
    
    var v1: ResourceV1 = js.native
  }
  
  @JSImport("googleapis/build/src/apis/domainsrdap/v1", "domainsrdap_v1.Resource$Autnum")
  @js.native
  open class ResourceAutnum protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    def get(): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(params: ParamsResourceAutnumGet): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(params: ParamsResourceAutnumGet, callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def get(
      params: ParamsResourceAutnumGet,
      options: BodyResponseCallback[Readable | SchemaRdapResponse],
      callback: BodyResponseCallback[Readable | SchemaRdapResponse]
    ): Unit = js.native
    def get(params: ParamsResourceAutnumGet, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(
      params: ParamsResourceAutnumGet,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaRdapResponse]
    ): Unit = js.native
    /**
      * The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/domainsrdap.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const domainsrdap = google.domainsrdap('v1');
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
      *   const res = await domainsrdap.autnum.get({
      *     autnumId: 'placeholder-value',
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "description": [],
      *   //   "errorCode": 0,
      *   //   "jsonResponse": {},
      *   //   "lang": "my_lang",
      *   //   "notices": [],
      *   //   "rdapConformance": [],
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
    def get(params: ParamsResourceAutnumGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def get(
      params: ParamsResourceAutnumGet,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
  }
  
  @JSImport("googleapis/build/src/apis/domainsrdap/v1", "domainsrdap_v1.Resource$Domain")
  @js.native
  open class ResourceDomain protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    def get(): GaxiosPromise[SchemaHttpBody] = js.native
    def get(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
    def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
    def get(params: ParamsResourceDomainGet): GaxiosPromise[SchemaHttpBody] = js.native
    def get(params: ParamsResourceDomainGet, callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
    def get(
      params: ParamsResourceDomainGet,
      options: BodyResponseCallback[Readable | SchemaHttpBody],
      callback: BodyResponseCallback[Readable | SchemaHttpBody]
    ): Unit = js.native
    def get(params: ParamsResourceDomainGet, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
    def get(
      params: ParamsResourceDomainGet,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaHttpBody]
    ): Unit = js.native
    /**
      * Look up RDAP information for a domain by name.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/domainsrdap.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const domainsrdap = google.domainsrdap('v1');
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
      *   const res = await domainsrdap.domain.get({
      *     // Full domain name to look up. Example: "example.com"
      *     domainName: '[^/]+',
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "contentType": "my_contentType",
      *   //   "data": "my_data",
      *   //   "extensions": []
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
    def get(params: ParamsResourceDomainGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def get(
      params: ParamsResourceDomainGet,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
  }
  
  @JSImport("googleapis/build/src/apis/domainsrdap/v1", "domainsrdap_v1.Resource$Entity")
  @js.native
  open class ResourceEntity protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    def get(): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(params: ParamsResourceEntityGet): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(params: ParamsResourceEntityGet, callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def get(
      params: ParamsResourceEntityGet,
      options: BodyResponseCallback[Readable | SchemaRdapResponse],
      callback: BodyResponseCallback[Readable | SchemaRdapResponse]
    ): Unit = js.native
    def get(params: ParamsResourceEntityGet, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(
      params: ParamsResourceEntityGet,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaRdapResponse]
    ): Unit = js.native
    /**
      * The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/domainsrdap.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const domainsrdap = google.domainsrdap('v1');
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
      *   const res = await domainsrdap.entity.get({
      *     entityId: 'placeholder-value',
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "description": [],
      *   //   "errorCode": 0,
      *   //   "jsonResponse": {},
      *   //   "lang": "my_lang",
      *   //   "notices": [],
      *   //   "rdapConformance": [],
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
    def get(params: ParamsResourceEntityGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def get(
      params: ParamsResourceEntityGet,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
  }
  
  @JSImport("googleapis/build/src/apis/domainsrdap/v1", "domainsrdap_v1.Resource$Ip")
  @js.native
  open class ResourceIp protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    def get(): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(params: ParamsResourceIpGet): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(params: ParamsResourceIpGet, callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def get(
      params: ParamsResourceIpGet,
      options: BodyResponseCallback[Readable | SchemaRdapResponse],
      callback: BodyResponseCallback[Readable | SchemaRdapResponse]
    ): Unit = js.native
    def get(params: ParamsResourceIpGet, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(
      params: ParamsResourceIpGet,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaRdapResponse]
    ): Unit = js.native
    /**
      * The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/domainsrdap.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const domainsrdap = google.domainsrdap('v1');
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
      *   const res = await domainsrdap.ip.get({
      *     ipId: 'placeholder-value',
      *
      *     ipId1: 'placeholder-value',
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "description": [],
      *   //   "errorCode": 0,
      *   //   "jsonResponse": {},
      *   //   "lang": "my_lang",
      *   //   "notices": [],
      *   //   "rdapConformance": [],
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
    def get(params: ParamsResourceIpGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def get(
      params: ParamsResourceIpGet,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
  }
  
  @JSImport("googleapis/build/src/apis/domainsrdap/v1", "domainsrdap_v1.Resource$Nameserver")
  @js.native
  open class ResourceNameserver protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    def get(): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(params: ParamsResourceNameserverGet): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(params: ParamsResourceNameserverGet, callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def get(
      params: ParamsResourceNameserverGet,
      options: BodyResponseCallback[Readable | SchemaRdapResponse],
      callback: BodyResponseCallback[Readable | SchemaRdapResponse]
    ): Unit = js.native
    def get(params: ParamsResourceNameserverGet, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def get(
      params: ParamsResourceNameserverGet,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaRdapResponse]
    ): Unit = js.native
    /**
      * The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/domainsrdap.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const domainsrdap = google.domainsrdap('v1');
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
      *   const res = await domainsrdap.nameserver.get({
      *     nameserverId: 'placeholder-value',
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "description": [],
      *   //   "errorCode": 0,
      *   //   "jsonResponse": {},
      *   //   "lang": "my_lang",
      *   //   "notices": [],
      *   //   "rdapConformance": [],
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
    def get(params: ParamsResourceNameserverGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def get(
      params: ParamsResourceNameserverGet,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
  }
  
  @JSImport("googleapis/build/src/apis/domainsrdap/v1", "domainsrdap_v1.Resource$V1")
  @js.native
  open class ResourceV1 protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    def getDomains(): GaxiosPromise[SchemaRdapResponse] = js.native
    def getDomains(callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def getDomains(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def getDomains(params: ParamsResourceV1Getdomains): GaxiosPromise[SchemaRdapResponse] = js.native
    def getDomains(params: ParamsResourceV1Getdomains, callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def getDomains(
      params: ParamsResourceV1Getdomains,
      options: BodyResponseCallback[Readable | SchemaRdapResponse],
      callback: BodyResponseCallback[Readable | SchemaRdapResponse]
    ): Unit = js.native
    def getDomains(params: ParamsResourceV1Getdomains, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def getDomains(
      params: ParamsResourceV1Getdomains,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaRdapResponse]
    ): Unit = js.native
    /**
      * The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/domainsrdap.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const domainsrdap = google.domainsrdap('v1');
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
      *   const res = await domainsrdap.getDomains({});
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "description": [],
      *   //   "errorCode": 0,
      *   //   "jsonResponse": {},
      *   //   "lang": "my_lang",
      *   //   "notices": [],
      *   //   "rdapConformance": [],
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
    def getDomains(params: ParamsResourceV1Getdomains, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def getDomains(
      params: ParamsResourceV1Getdomains,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def getEntities(): GaxiosPromise[SchemaRdapResponse] = js.native
    def getEntities(callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def getEntities(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def getEntities(params: ParamsResourceV1Getentities): GaxiosPromise[SchemaRdapResponse] = js.native
    def getEntities(params: ParamsResourceV1Getentities, callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def getEntities(
      params: ParamsResourceV1Getentities,
      options: BodyResponseCallback[Readable | SchemaRdapResponse],
      callback: BodyResponseCallback[Readable | SchemaRdapResponse]
    ): Unit = js.native
    def getEntities(params: ParamsResourceV1Getentities, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def getEntities(
      params: ParamsResourceV1Getentities,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaRdapResponse]
    ): Unit = js.native
    /**
      * The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/domainsrdap.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const domainsrdap = google.domainsrdap('v1');
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
      *   const res = await domainsrdap.getEntities({});
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "description": [],
      *   //   "errorCode": 0,
      *   //   "jsonResponse": {},
      *   //   "lang": "my_lang",
      *   //   "notices": [],
      *   //   "rdapConformance": [],
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
    def getEntities(params: ParamsResourceV1Getentities, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def getEntities(
      params: ParamsResourceV1Getentities,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def getHelp(): GaxiosPromise[SchemaHttpBody] = js.native
    def getHelp(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
    def getHelp(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
    def getHelp(params: ParamsResourceV1Gethelp): GaxiosPromise[SchemaHttpBody] = js.native
    def getHelp(params: ParamsResourceV1Gethelp, callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
    def getHelp(
      params: ParamsResourceV1Gethelp,
      options: BodyResponseCallback[Readable | SchemaHttpBody],
      callback: BodyResponseCallback[Readable | SchemaHttpBody]
    ): Unit = js.native
    def getHelp(params: ParamsResourceV1Gethelp, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
    def getHelp(
      params: ParamsResourceV1Gethelp,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaHttpBody]
    ): Unit = js.native
    /**
      * Get help information for the RDAP API, including links to documentation.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/domainsrdap.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const domainsrdap = google.domainsrdap('v1');
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
      *   const res = await domainsrdap.getHelp({});
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "contentType": "my_contentType",
      *   //   "data": "my_data",
      *   //   "extensions": []
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
    def getHelp(params: ParamsResourceV1Gethelp, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def getHelp(
      params: ParamsResourceV1Gethelp,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def getIp(): GaxiosPromise[SchemaHttpBody] = js.native
    def getIp(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
    def getIp(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
    def getIp(params: ParamsResourceV1Getip): GaxiosPromise[SchemaHttpBody] = js.native
    def getIp(params: ParamsResourceV1Getip, callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
    def getIp(
      params: ParamsResourceV1Getip,
      options: BodyResponseCallback[Readable | SchemaHttpBody],
      callback: BodyResponseCallback[Readable | SchemaHttpBody]
    ): Unit = js.native
    def getIp(params: ParamsResourceV1Getip, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
    def getIp(
      params: ParamsResourceV1Getip,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaHttpBody]
    ): Unit = js.native
    /**
      * The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/domainsrdap.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const domainsrdap = google.domainsrdap('v1');
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
      *   const res = await domainsrdap.getIp({});
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "contentType": "my_contentType",
      *   //   "data": "my_data",
      *   //   "extensions": []
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
    def getIp(params: ParamsResourceV1Getip, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def getIp(
      params: ParamsResourceV1Getip,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def getNameservers(): GaxiosPromise[SchemaRdapResponse] = js.native
    def getNameservers(callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def getNameservers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def getNameservers(params: ParamsResourceV1Getnameservers): GaxiosPromise[SchemaRdapResponse] = js.native
    def getNameservers(params: ParamsResourceV1Getnameservers, callback: BodyResponseCallback[SchemaRdapResponse]): Unit = js.native
    def getNameservers(
      params: ParamsResourceV1Getnameservers,
      options: BodyResponseCallback[Readable | SchemaRdapResponse],
      callback: BodyResponseCallback[Readable | SchemaRdapResponse]
    ): Unit = js.native
    def getNameservers(params: ParamsResourceV1Getnameservers, options: MethodOptions): GaxiosPromise[SchemaRdapResponse] = js.native
    def getNameservers(
      params: ParamsResourceV1Getnameservers,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaRdapResponse]
    ): Unit = js.native
    /**
      * The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/domainsrdap.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const domainsrdap = google.domainsrdap('v1');
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
      *   const res = await domainsrdap.getNameservers({});
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "description": [],
      *   //   "errorCode": 0,
      *   //   "jsonResponse": {},
      *   //   "lang": "my_lang",
      *   //   "notices": [],
      *   //   "rdapConformance": [],
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
    def getNameservers(params: ParamsResourceV1Getnameservers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def getNameservers(
      params: ParamsResourceV1Getnameservers,
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
  
  trait ParamsResourceAutnumGet
    extends StObject
       with StandardParameters {
    
    /**
      *
      */
    var autnumId: js.UndefOr[String] = js.undefined
  }
  object ParamsResourceAutnumGet {
    
    inline def apply(): ParamsResourceAutnumGet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceAutnumGet]
    }
    
    extension [Self <: ParamsResourceAutnumGet](x: Self) {
      
      inline def setAutnumId(value: String): Self = StObject.set(x, "autnumId", value.asInstanceOf[js.Any])
      
      inline def setAutnumIdUndefined: Self = StObject.set(x, "autnumId", js.undefined)
    }
  }
  
  trait ParamsResourceDomainGet
    extends StObject
       with StandardParameters {
    
    /**
      * Full domain name to look up. Example: "example.com"
      */
    var domainName: js.UndefOr[String] = js.undefined
  }
  object ParamsResourceDomainGet {
    
    inline def apply(): ParamsResourceDomainGet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceDomainGet]
    }
    
    extension [Self <: ParamsResourceDomainGet](x: Self) {
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    }
  }
  
  trait ParamsResourceEntityGet
    extends StObject
       with StandardParameters {
    
    /**
      *
      */
    var entityId: js.UndefOr[String] = js.undefined
  }
  object ParamsResourceEntityGet {
    
    inline def apply(): ParamsResourceEntityGet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceEntityGet]
    }
    
    extension [Self <: ParamsResourceEntityGet](x: Self) {
      
      inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    }
  }
  
  trait ParamsResourceIpGet
    extends StObject
       with StandardParameters {
    
    /**
      *
      */
    var ipId: js.UndefOr[String] = js.undefined
    
    /**
      *
      */
    var ipId1: js.UndefOr[String] = js.undefined
  }
  object ParamsResourceIpGet {
    
    inline def apply(): ParamsResourceIpGet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceIpGet]
    }
    
    extension [Self <: ParamsResourceIpGet](x: Self) {
      
      inline def setIpId(value: String): Self = StObject.set(x, "ipId", value.asInstanceOf[js.Any])
      
      inline def setIpId1(value: String): Self = StObject.set(x, "ipId1", value.asInstanceOf[js.Any])
      
      inline def setIpId1Undefined: Self = StObject.set(x, "ipId1", js.undefined)
      
      inline def setIpIdUndefined: Self = StObject.set(x, "ipId", js.undefined)
    }
  }
  
  trait ParamsResourceNameserverGet
    extends StObject
       with StandardParameters {
    
    /**
      *
      */
    var nameserverId: js.UndefOr[String] = js.undefined
  }
  object ParamsResourceNameserverGet {
    
    inline def apply(): ParamsResourceNameserverGet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceNameserverGet]
    }
    
    extension [Self <: ParamsResourceNameserverGet](x: Self) {
      
      inline def setNameserverId(value: String): Self = StObject.set(x, "nameserverId", value.asInstanceOf[js.Any])
      
      inline def setNameserverIdUndefined: Self = StObject.set(x, "nameserverId", js.undefined)
    }
  }
  
  type ParamsResourceV1Getdomains = StandardParameters
  
  type ParamsResourceV1Getentities = StandardParameters
  
  type ParamsResourceV1Gethelp = StandardParameters
  
  type ParamsResourceV1Getip = StandardParameters
  
  type ParamsResourceV1Getnameservers = StandardParameters
  
  trait SchemaHttpBody extends StObject {
    
    /**
      * The HTTP Content-Type header value specifying the content type of the body.
      */
    var contentType: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The HTTP request/response body as raw binary.
      */
    var data: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Application specific response metadata. Must be set in the first response for streaming APIs.
      */
    var extensions: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
  }
  object SchemaHttpBody {
    
    inline def apply(): SchemaHttpBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaHttpBody]
    }
    
    extension [Self <: SchemaHttpBody](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setExtensions(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
  
  trait SchemaLink extends StObject {
    
    /**
      * Target URL of a link. Example: "http://example.com/previous".
      */
    var href: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Language code of a link. Example: "en".
      */
    var hreflang: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Media type of the link destination. Example: "screen".
      */
    var media: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Relation type of a link. Example: "previous".
      */
    var rel: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Title of this link. Example: "title".
      */
    var title: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Content type of the link. Example: "application/json".
      */
    var `type`: js.UndefOr[String | Null] = js.undefined
    
    /**
      * URL giving context for the link. Example: "http://example.com/current".
      */
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object SchemaLink {
    
    inline def apply(): SchemaLink = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaLink]
    }
    
    extension [Self <: SchemaLink](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefNull: Self = StObject.set(x, "href", null)
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
      
      inline def setHreflangNull: Self = StObject.set(x, "hreflang", null)
      
      inline def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaNull: Self = StObject.set(x, "media", null)
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelNull: Self = StObject.set(x, "rel", null)
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SchemaNotice extends StObject {
    
    /**
      * Description of the notice.
      */
    var description: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * Link to a document containing more information.
      */
    var links: js.UndefOr[js.Array[SchemaLink]] = js.undefined
    
    /**
      * Title of a notice. Example: "Terms of Service".
      */
    var title: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Type values defined in [section 10.2.1 of RFC 7483](https://tools.ietf.org/html/rfc7483#section-10.2.1) specific to a whole response: "result set truncated due to authorization", "result set truncated due to excessive load", "result set truncated due to unexplainable reasons".
      */
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object SchemaNotice {
    
    inline def apply(): SchemaNotice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaNotice]
    }
    
    extension [Self <: SchemaNotice](x: Self) {
      
      inline def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setLinks(value: js.Array[SchemaLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: SchemaLink*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SchemaRdapResponse extends StObject {
    
    /**
      * Error description.
      */
    var description: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * Error HTTP code. Example: "501".
      */
    var errorCode: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * HTTP response with content type set to "application/json+rdap".
      */
    var jsonResponse: js.UndefOr[SchemaHttpBody] = js.undefined
    
    /**
      * Error language code. Error response info fields are defined in [section 6 of RFC 7483](https://tools.ietf.org/html/rfc7483#section-6).
      */
    var lang: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Notices applying to this response.
      */
    var notices: js.UndefOr[js.Array[SchemaNotice]] = js.undefined
    
    /**
      * RDAP conformance level.
      */
    var rdapConformance: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * Error title.
      */
    var title: js.UndefOr[String | Null] = js.undefined
  }
  object SchemaRdapResponse {
    
    inline def apply(): SchemaRdapResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaRdapResponse]
    }
    
    extension [Self <: SchemaRdapResponse](x: Self) {
      
      inline def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setJsonResponse(value: SchemaHttpBody): Self = StObject.set(x, "jsonResponse", value.asInstanceOf[js.Any])
      
      inline def setJsonResponseUndefined: Self = StObject.set(x, "jsonResponse", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangNull: Self = StObject.set(x, "lang", null)
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setNotices(value: js.Array[SchemaNotice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
      
      inline def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
      
      inline def setNoticesVarargs(value: SchemaNotice*): Self = StObject.set(x, "notices", js.Array(value*))
      
      inline def setRdapConformance(value: js.Array[String]): Self = StObject.set(x, "rdapConformance", value.asInstanceOf[js.Any])
      
      inline def setRdapConformanceNull: Self = StObject.set(x, "rdapConformance", null)
      
      inline def setRdapConformanceUndefined: Self = StObject.set(x, "rdapConformance", js.undefined)
      
      inline def setRdapConformanceVarargs(value: String*): Self = StObject.set(x, "rdapConformance", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
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
