package typings.ipfsHttpClient

import typings.ipfsCoreTypes.mod.IPFS
import typings.ipfsHttpClient.anon.PartialIPLDOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.node.httpMod.Agent
import typings.std.Headers
import typings.std.Record
import typings.std.URL
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  trait EndpointConfig extends StObject {
    
    var `api-path`: String
    
    var host: String
    
    var pathname: String
    
    var port: String
    
    var protocol: String
  }
  object EndpointConfig {
    
    inline def apply(`api-path`: String, host: String, pathname: String, port: String, protocol: String): EndpointConfig = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.updateDynamic("api-path")(`api-path`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointConfig] (val x: Self) extends AnyVal {
      
      inline def `setApi-path`(value: String): Self = StObject.set(x, "api-path", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait HTTPClientExtraOptions extends StObject {
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var searchParams: js.UndefOr[URLSearchParams] = js.undefined
  }
  object HTTPClientExtraOptions {
    
    inline def apply(): HTTPClientExtraOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTTPClientExtraOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HTTPClientExtraOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setSearchParams(value: URLSearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
      
      inline def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
    }
  }
  
  @js.native
  trait IPFSHTTPClient
    extends StObject
       with IPFS[HTTPClientExtraOptions] {
    
    def getEndpointConfig(): EndpointConfig = js.native
  }
  
  trait IPLDOptions extends StObject {
    
    var bases: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
      ]
    
    var codecs: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ]
    
    var hashers: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ]
    
    def loadBase(codeOrName: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
      ]
    def loadBase(codeOrName: Double): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
      ]
    @JSName("loadBase")
    var loadBase_Original: LoadBaseFn
    
    def loadCodec(codeOrName: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ]
    def loadCodec(codeOrName: Double): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ]
    @JSName("loadCodec")
    var loadCodec_Original: LoadCodecFn
    
    def loadHasher(codeOrName: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ]
    def loadHasher(codeOrName: Double): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ]
    @JSName("loadHasher")
    var loadHasher_Original: LoadHasherFn
  }
  object IPLDOptions {
    
    inline def apply(
      bases: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
        ],
      codecs: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
        ],
      hashers: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
        ],
      loadBase: /* codeOrName */ Double | String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
        ],
      loadCodec: /* codeOrName */ Double | String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
        ],
      loadHasher: /* codeOrName */ Double | String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
        ]
    ): IPLDOptions = {
      val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], codecs = codecs.asInstanceOf[js.Any], hashers = hashers.asInstanceOf[js.Any], loadBase = js.Any.fromFunction1(loadBase), loadCodec = js.Any.fromFunction1(loadCodec), loadHasher = js.Any.fromFunction1(loadHasher))
      __obj.asInstanceOf[IPLDOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPLDOptions] (val x: Self) extends AnyVal {
      
      inline def setBases(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
            ]
      ): Self = StObject.set(x, "bases", value.asInstanceOf[js.Any])
      
      inline def setBasesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any)*
      ): Self = StObject.set(x, "bases", js.Array(value*))
      
      inline def setCodecs(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
            ]
      ): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
      
      inline def setCodecsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any)*
      ): Self = StObject.set(x, "codecs", js.Array(value*))
      
      inline def setHashers(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
            ]
      ): Self = StObject.set(x, "hashers", value.asInstanceOf[js.Any])
      
      inline def setHashersVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any)*
      ): Self = StObject.set(x, "hashers", js.Array(value*))
      
      inline def setLoadBase(
        value: /* codeOrName */ Double | String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
            ]
      ): Self = StObject.set(x, "loadBase", js.Any.fromFunction1(value))
      
      inline def setLoadCodec(
        value: /* codeOrName */ Double | String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
            ]
      ): Self = StObject.set(x, "loadCodec", js.Any.fromFunction1(value))
      
      inline def setLoadHasher(
        value: /* codeOrName */ Double | String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
            ]
      ): Self = StObject.set(x, "loadHasher", js.Any.fromFunction1(value))
    }
  }
  
  type LoadBaseFn = js.Function1[
    /* codeOrName */ Double | String, 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
    ]
  ]
  
  type LoadCodecFn = js.Function1[
    /* codeOrName */ Double | String, 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
    ]
  ]
  
  type LoadHasherFn = js.Function1[
    /* codeOrName */ Double | String, 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
    ]
  ]
  
  trait Options extends StObject {
    
    var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent] = js.undefined
    
    var apiPath: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Headers | (Record[String, String])] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var ipld: js.UndefOr[PartialIPLDOptions] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double | String] = js.undefined
    
    var url: js.UndefOr[URL | String | Multiaddr_] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setApiPath(value: String): Self = StObject.set(x, "apiPath", value.asInstanceOf[js.Any])
      
      inline def setApiPathUndefined: Self = StObject.set(x, "apiPath", js.undefined)
      
      inline def setHeaders(value: Headers | (Record[String, String])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIpld(value: PartialIPLDOptions): Self = StObject.set(x, "ipld", value.asInstanceOf[js.Any])
      
      inline def setIpldUndefined: Self = StObject.set(x, "ipld", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setTimeout(value: Double | String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: URL | String | Multiaddr_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
