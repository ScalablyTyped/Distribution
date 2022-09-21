package typings.httpAgent

import typings.request.mod.CoreOptions
import typings.request.mod.OptionsWithUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-agent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("http-agent", "HttpAgent")
  @js.native
  open class HttpAgent protected ()
    extends typings.node.eventsMod.^ {
    def this(host: String) = this()
    def this(host: HttpAgentOptions) = this()
    def this(host: String, urls: HttpAgentUrls) = this()
    def this(host: HttpAgentOptions, urls: HttpAgentUrls) = this()
    def this(host: String, urls: Unit, options: HttpAgentOptions) = this()
    def this(host: String, urls: HttpAgentUrls, options: HttpAgentOptions) = this()
    def this(host: HttpAgentOptions, urls: Unit, options: HttpAgentOptions) = this()
    def this(host: HttpAgentOptions, urls: HttpAgentUrls, options: HttpAgentOptions) = this()
    
    def addUrl(url: String): Unit = js.native
    
    def back(): Boolean | Unit = js.native
    
    var body: String = js.native
    
    var host: String = js.native
    
    def next(url: String): Unit = js.native
    
    val nextUrls: js.Array[String] = js.native
    
    var options: OptionsWithUri = js.native
    
    var port: Double = js.native
    
    val prevUrls: js.Array[String] = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    var url: String = js.native
  }
  
  inline def create(host: String): HttpAgent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any]).asInstanceOf[HttpAgent]
  inline def create(host: String, urls: Unit, options: HttpAgentOptions): HttpAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any], urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpAgent]
  inline def create(host: String, urls: HttpAgentUrls): HttpAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any], urls.asInstanceOf[js.Any])).asInstanceOf[HttpAgent]
  inline def create(host: String, urls: HttpAgentUrls, options: HttpAgentOptions): HttpAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any], urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpAgent]
  inline def create(host: HttpAgentOptions): HttpAgent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any]).asInstanceOf[HttpAgent]
  inline def create(host: HttpAgentOptions, urls: Unit, options: HttpAgentOptions): HttpAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any], urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpAgent]
  inline def create(host: HttpAgentOptions, urls: HttpAgentUrls): HttpAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any], urls.asInstanceOf[js.Any])).asInstanceOf[HttpAgent]
  inline def create(host: HttpAgentOptions, urls: HttpAgentUrls, options: HttpAgentOptions): HttpAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any], urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpAgent]
  
  trait HttpAgentOptions
    extends StObject
       with CoreOptions {
    
    var urls: js.UndefOr[HttpAgentUrls] = js.undefined
  }
  object HttpAgentOptions {
    
    inline def apply(): HttpAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpAgentOptions]
    }
    
    extension [Self <: HttpAgentOptions](x: Self) {
      
      inline def setUrls(value: HttpAgentUrls): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: HttpAgentUrl*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
  
  trait HttpAgentPrototype extends StObject {
    
    val nextUrls: String
    
    val prevUrls: String
  }
  object HttpAgentPrototype {
    
    inline def apply(nextUrls: String, prevUrls: String): HttpAgentPrototype = {
      val __obj = js.Dynamic.literal(nextUrls = nextUrls.asInstanceOf[js.Any], prevUrls = prevUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpAgentPrototype]
    }
    
    extension [Self <: HttpAgentPrototype](x: Self) {
      
      inline def setNextUrls(value: String): Self = StObject.set(x, "nextUrls", value.asInstanceOf[js.Any])
      
      inline def setPrevUrls(value: String): Self = StObject.set(x, "prevUrls", value.asInstanceOf[js.Any])
    }
  }
  
  type HttpAgentUrl = String | OptionsWithUri
  
  type HttpAgentUrls = js.Array[HttpAgentUrl]
}
