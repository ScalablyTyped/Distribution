package typings.koaJwt

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koaJwt.anon.Custom
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): Middleware = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  @JSImport("koa-jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, CustomT>> * / any */ @js.native
  trait Middleware extends StObject {
    
    def unless(): typings.koa.mod.Middleware[DefaultState, DefaultContext] = js.native
    def unless(params: Custom): typings.koa.mod.Middleware[DefaultState, DefaultContext] = js.native
  }
  
  trait Options extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var cookie: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var getToken: js.UndefOr[js.Function2[/* ctx */ Context, /* opts */ this.type, String]] = js.undefined
    
    var isRevoked: js.UndefOr[
        js.Function3[
          /* ctx */ Context, 
          /* decodedToken */ js.Object, 
          /* token */ String, 
          js.Promise[Boolean]
        ]
      ] = js.undefined
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var passthrough: js.UndefOr[Boolean] = js.undefined
    
    var secret: String | (js.Array[Buffer | String]) | Buffer | SecretLoader
    
    var tokenKey: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(secret: String | (js.Array[Buffer | String]) | Buffer | SecretLoader): Options = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGetToken(value: (/* ctx */ Context, Options) => String): Self = StObject.set(x, "getToken", js.Any.fromFunction2(value))
      
      inline def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      inline def setIsRevoked(
        value: (/* ctx */ Context, /* decodedToken */ js.Object, /* token */ String) => js.Promise[Boolean]
      ): Self = StObject.set(x, "isRevoked", js.Any.fromFunction3(value))
      
      inline def setIsRevokedUndefined: Self = StObject.set(x, "isRevoked", js.undefined)
      
      inline def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value :_*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPassthrough(value: Boolean): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      inline def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
      
      inline def setSecret(value: String | (js.Array[Buffer | String]) | Buffer | SecretLoader): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretFunction2(
        value: (/* header */ js.Any, /* payload */ js.Any) => js.Promise[String | (js.Array[Buffer | String]) | Buffer]
      ): Self = StObject.set(x, "secret", js.Any.fromFunction2(value))
      
      inline def setSecretVarargs(value: (Buffer | String)*): Self = StObject.set(x, "secret", js.Array(value :_*))
      
      inline def setTokenKey(value: String): Self = StObject.set(x, "tokenKey", value.asInstanceOf[js.Any])
      
      inline def setTokenKeyUndefined: Self = StObject.set(x, "tokenKey", js.undefined)
    }
  }
  
  type SecretLoader = js.Function2[
    /* header */ js.Any, 
    /* payload */ js.Any, 
    js.Promise[String | (js.Array[Buffer | String]) | Buffer]
  ]
}
