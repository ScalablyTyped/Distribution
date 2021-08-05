package typings.ipfsHttpClient

import org.scalablytyped.runtime.StringDictionary
import typings.ipfsHttpClient.anon.Formats
import typings.std.Headers
import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  /**
    * @typedef {Object} ClientOptions
    * @property {string} [host]
    * @property {number} [port]
    * @property {string} [protocol]
    * @property {Headers|Record<string, string>} [headers] - Request headers.
    * @property {number|string} [timeout] - Amount of time until request should timeout in ms or humand readable. https://www.npmjs.com/package/parse-duration for valid string values.
    * @property {string} [apiPath] - Path to the API.
    * @property {URL|string|Multiaddr} [url] - Full API URL.
    * @property {object} [ipld]
    * @property {any[]} [ipld.formats] - An array of additional [IPLD formats](https://github.com/ipld/interface-ipld-format) to support
    * @property {(format: string) => Promise<any>} [ipld.loadFormat] - an async function that takes the name of an [IPLD format](https://github.com/ipld/interface-ipld-format) as a string and should return the implementation of that codec
    */
  @JSImport("ipfs-http-client/dist/src/lib/core", JSImport.Namespace)
  @js.native
  /**
    * @param {ClientOptions|URL|Multiaddr|string} [options]
    */
  class ^ ()
    extends StObject
       with Client {
    def this(options: String) = this()
    def this(options: ClientOptions) = this()
    def this(options: typings.multiaddr.mod.^) = this()
    def this(options: URL) = this()
  }
  @JSImport("ipfs-http-client/dist/src/lib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorHandler(response: js.Any): js.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Nothing]]
  
  /**
    * @typedef {Object} ClientOptions
    * @property {string} [host]
    * @property {number} [port]
    * @property {string} [protocol]
    * @property {Headers|Record<string, string>} [headers] - Request headers.
    * @property {number|string} [timeout] - Amount of time until request should timeout in ms or humand readable. https://www.npmjs.com/package/parse-duration for valid string values.
    * @property {string} [apiPath] - Path to the API.
    * @property {URL|string|Multiaddr} [url] - Full API URL.
    * @property {object} [ipld]
    * @property {any[]} [ipld.formats] - An array of additional [IPLD formats](https://github.com/ipld/interface-ipld-format) to support
    * @property {(format: string) => Promise<any>} [ipld.loadFormat] - an async function that takes the name of an [IPLD format](https://github.com/ipld/interface-ipld-format) as a string and should return the implementation of that codec
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait Client
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    def fetch(resource: js.Any): js.Any = js.native
    def fetch(resource: js.Any, options: js.Object): js.Any = js.native
  }
  
  trait ClientOptions extends StObject {
    
    /**
      * - Path to the API.
      */
    var apiPath: js.UndefOr[String] = js.undefined
    
    /**
      * - Request headers.
      */
    var headers: js.UndefOr[Headers | (Record[String, String])] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var ipld: js.UndefOr[Formats] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
      * - Amount of time until request should timeout in ms or humand readable. https://www.npmjs.com/package/parse-duration for valid string values.
      */
    var timeout: js.UndefOr[String | Double] = js.undefined
    
    /**
      * - Full API URL.
      */
    var url: js.UndefOr[String | typings.multiaddr.mod.^ | URL] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setApiPath(value: String): Self = StObject.set(x, "apiPath", value.asInstanceOf[js.Any])
      
      inline def setApiPathUndefined: Self = StObject.set(x, "apiPath", js.undefined)
      
      inline def setHeaders(value: Headers | (Record[String, String])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIpld(value: Formats): Self = StObject.set(x, "ipld", value.asInstanceOf[js.Any])
      
      inline def setIpldUndefined: Self = StObject.set(x, "ipld", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String | typings.multiaddr.mod.^ | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
