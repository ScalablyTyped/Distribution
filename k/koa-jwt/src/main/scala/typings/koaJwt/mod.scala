package typings.koaJwt

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koaJwt.anon.Custom
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): Middleware = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  @JSImport("koa-jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, ContextT, ResponseBodyT>> * / any */ trait Middleware extends StObject {
    
    def unless(): typings.koa.mod.Middleware[DefaultState, DefaultContext, Any]
    def unless(params: Custom): typings.koa.mod.Middleware[DefaultState, DefaultContext, Any]
    @JSName("unless")
    var unless_Original: UnlessOptions
  }
  object Middleware {
    
    inline def apply(
      unless: /* params */ js.UndefOr[Custom] => typings.koa.mod.Middleware[DefaultState, DefaultContext, Any]
    ): Middleware = {
      val __obj = js.Dynamic.literal(unless = js.Any.fromFunction1(unless))
      __obj.asInstanceOf[Middleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Middleware] (val x: Self) extends AnyVal {
      
      inline def setUnless(
        value: /* params */ js.UndefOr[Custom] => typings.koa.mod.Middleware[DefaultState, DefaultContext, Any]
      ): Self = StObject.set(x, "unless", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var cookie: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var getToken: js.UndefOr[js.Function2[/* ctx */ Context, /* opts */ this.type, String | Null]] = js.undefined
    
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
    
    var secret: Secret | SecretLoader
    
    var tokenKey: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(secret: Secret | SecretLoader): Options = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGetToken(value: (/* ctx */ Context, Options) => String | Null): Self = StObject.set(x, "getToken", js.Any.fromFunction2(value))
      
      inline def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      inline def setIsRevoked(
        value: (/* ctx */ Context, /* decodedToken */ js.Object, /* token */ String) => js.Promise[Boolean]
      ): Self = StObject.set(x, "isRevoked", js.Any.fromFunction3(value))
      
      inline def setIsRevokedUndefined: Self = StObject.set(x, "isRevoked", js.undefined)
      
      inline def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPassthrough(value: Boolean): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      inline def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
      
      inline def setSecret(value: Secret | SecretLoader): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretFunction2(value: (/* header */ Any, /* payload */ Any) => js.Promise[Secret]): Self = StObject.set(x, "secret", js.Any.fromFunction2(value))
      
      inline def setSecretVarargs(value: (Buffer | String)*): Self = StObject.set(x, "secret", js.Array(value*))
      
      inline def setTokenKey(value: String): Self = StObject.set(x, "tokenKey", value.asInstanceOf[js.Any])
      
      inline def setTokenKeyUndefined: Self = StObject.set(x, "tokenKey", js.undefined)
    }
  }
  
  type Secret = String | (js.Array[Buffer | String]) | Buffer
  
  type SecretLoader = js.Function2[/* header */ Any, /* payload */ Any, js.Promise[Secret]]
  
  type UnlessOptions = js.Function1[
    /* params */ js.UndefOr[Custom], 
    typings.koa.mod.Middleware[DefaultState, DefaultContext, Any]
  ]
}
