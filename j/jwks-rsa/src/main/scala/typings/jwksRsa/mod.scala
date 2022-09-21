package typings.jwksRsa

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.jsonwebtoken.mod.Jwt
import typings.jsonwebtoken.mod.Secret
import typings.jwksRsa.anon.Key
import typings.jwksRsa.anon.Keys
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): JwksClient = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[JwksClient]
  
  @JSImport("jwks-rsa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jwks-rsa", "ArgumentError")
  @js.native
  open class ArgumentError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_ArgumentError: typings.jwksRsa.jwksRsaStrings.ArgumentError = js.native
  }
  
  @JSImport("jwks-rsa", "JwksClient")
  @js.native
  open class JwksClient protected () extends StObject {
    def this(options: Options) = this()
    
    def getKeys(): js.Promise[Any] = js.native
    
    def getSigningKey(): js.Promise[SigningKey] = js.native
    def getSigningKey(kid: String): js.Promise[SigningKey] = js.native
    def getSigningKey(kid: String, cb: js.Function2[/* err */ js.Error | Null, /* key */ js.UndefOr[SigningKey], Unit]): Unit = js.native
    def getSigningKey(kid: Null, cb: js.Function2[/* err */ js.Error | Null, /* key */ js.UndefOr[SigningKey], Unit]): Unit = js.native
    def getSigningKey(kid: Unit, cb: js.Function2[/* err */ js.Error | Null, /* key */ js.UndefOr[SigningKey], Unit]): Unit = js.native
    
    def getSigningKeys(): js.Promise[js.Array[SigningKey]] = js.native
  }
  
  @JSImport("jwks-rsa", "JwksError")
  @js.native
  open class JwksError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_JwksError: typings.jwksRsa.jwksRsaStrings.JwksError = js.native
  }
  
  @JSImport("jwks-rsa", "JwksRateLimitError")
  @js.native
  open class JwksRateLimitError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_JwksRateLimitError: typings.jwksRsa.jwksRsaStrings.JwksRateLimitError = js.native
  }
  
  @JSImport("jwks-rsa", "SigningKeyNotFoundError")
  @js.native
  open class SigningKeyNotFoundError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_SigningKeyNotFoundError: typings.jwksRsa.jwksRsaStrings.SigningKeyNotFoundError = js.native
  }
  
  inline def expressJwtSecret(options: ExpressJwtOptions): SecretCallbackLong | GetVerificationKey = ^.asInstanceOf[js.Dynamic].applyDynamic("expressJwtSecret")(options.asInstanceOf[js.Any]).asInstanceOf[SecretCallbackLong | GetVerificationKey]
  
  inline def hapiJwt2Key(options: HapiJwtOptions): js.Function2[/* decodedToken */ DecodedToken, /* cb */ HapiCallback, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hapiJwt2Key")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* decodedToken */ DecodedToken, /* cb */ HapiCallback, Unit]]
  
  inline def hapiJwt2KeyAsync(options: HapiJwtOptions): js.Function1[/* decodedToken */ DecodedToken, js.Promise[Key]] = ^.asInstanceOf[js.Dynamic].applyDynamic("hapiJwt2KeyAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* decodedToken */ DecodedToken, js.Promise[Key]]]
  
  inline def koaJwtSecret(options: KoaJwtOptions): js.Function1[/* header */ TokenHeader, js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("koaJwtSecret")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* header */ TokenHeader, js.Promise[String]]]
  
  inline def passportJwtSecret(options: ExpressJwtOptions): SecretCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("passportJwtSecret")(options.asInstanceOf[js.Any]).asInstanceOf[SecretCallback]
  
  trait CertSigningKey
    extends StObject
       with SigningKey {
    
    var alg: String
    
    def getPublicKey(): String
    
    var kid: String
    
    var publicKey: String
  }
  object CertSigningKey {
    
    inline def apply(alg: String, getPublicKey: () => String, kid: String, publicKey: String): CertSigningKey = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], getPublicKey = js.Any.fromFunction0(getPublicKey), kid = kid.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertSigningKey]
    }
    
    extension [Self <: CertSigningKey](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setGetPublicKey(value: () => String): Self = StObject.set(x, "getPublicKey", js.Any.fromFunction0(value))
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecodedToken extends StObject {
    
    var header: TokenHeader
  }
  object DecodedToken {
    
    inline def apply(header: TokenHeader): DecodedToken = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedToken]
    }
    
    extension [Self <: DecodedToken](x: Self) {
      
      inline def setHeader(value: TokenHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpressJwtOptions
    extends StObject
       with Options {
    
    var handleSigningKeyError: js.UndefOr[
        js.Function2[
          /* err */ js.Error | Null, 
          /* cb */ js.Function1[/* err */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object ExpressJwtOptions {
    
    inline def apply(jwksUri: String): ExpressJwtOptions = {
      val __obj = js.Dynamic.literal(jwksUri = jwksUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpressJwtOptions]
    }
    
    extension [Self <: ExpressJwtOptions](x: Self) {
      
      inline def setHandleSigningKeyError(value: (/* err */ js.Error | Null, /* cb */ js.Function1[/* err */ js.Error | Null, Unit]) => Unit): Self = StObject.set(x, "handleSigningKeyError", js.Any.fromFunction2(value))
      
      inline def setHandleSigningKeyErrorUndefined: Self = StObject.set(x, "handleSigningKeyError", js.undefined)
    }
  }
  
  /** Types from express-jwt@>=7 */
  type GetVerificationKey = js.Function2[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* token */ js.UndefOr[Jwt], 
    Secret | js.Promise[Secret]
  ]
  
  type HapiCallback = js.Function3[/* err */ js.Error | Null, /* publicKey */ String, /* signingKey */ SigningKey, Unit]
  
  trait HapiJwtOptions
    extends StObject
       with Options {
    
    var handleSigningKeyError: js.UndefOr[js.Function2[/* err */ js.Error | Null, /* cb */ HapiCallback, Unit]] = js.undefined
  }
  object HapiJwtOptions {
    
    inline def apply(jwksUri: String): HapiJwtOptions = {
      val __obj = js.Dynamic.literal(jwksUri = jwksUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[HapiJwtOptions]
    }
    
    extension [Self <: HapiJwtOptions](x: Self) {
      
      inline def setHandleSigningKeyError(value: (/* err */ js.Error | Null, /* cb */ HapiCallback) => Unit): Self = StObject.set(x, "handleSigningKeyError", js.Any.fromFunction2(value))
      
      inline def setHandleSigningKeyErrorUndefined: Self = StObject.set(x, "handleSigningKeyError", js.undefined)
    }
  }
  
  type Headers = StringDictionary[String]
  
  trait JSONWebKey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var alg: String
    
    var kid: String
  }
  object JSONWebKey {
    
    inline def apply(alg: String, kid: String): JSONWebKey = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONWebKey]
    }
    
    extension [Self <: JSONWebKey](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    }
  }
  
  trait KoaJwtOptions
    extends StObject
       with Options {
    
    var handleSigningKeyError: js.UndefOr[js.Function1[/* err */ js.Error | Null, js.Promise[Unit]]] = js.undefined
  }
  object KoaJwtOptions {
    
    inline def apply(jwksUri: String): KoaJwtOptions = {
      val __obj = js.Dynamic.literal(jwksUri = jwksUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[KoaJwtOptions]
    }
    
    extension [Self <: KoaJwtOptions](x: Self) {
      
      inline def setHandleSigningKeyError(value: /* err */ js.Error | Null => js.Promise[Unit]): Self = StObject.set(x, "handleSigningKeyError", js.Any.fromFunction1(value))
      
      inline def setHandleSigningKeyErrorUndefined: Self = StObject.set(x, "handleSigningKeyError", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var cacheMaxAge: js.UndefOr[Double] = js.undefined
    
    var cacheMaxEntries: js.UndefOr[Double] = js.undefined
    
    var fetcher: js.UndefOr[js.Function1[/* jwksUri */ String, js.Promise[Keys]]] = js.undefined
    
    var getKeysInterceptor: js.UndefOr[js.Function0[js.Promise[js.Array[JSONWebKey]]]] = js.undefined
    
    var jwksRequestsPerMinute: js.UndefOr[Double] = js.undefined
    
    var jwksUri: String
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var rateLimit: js.UndefOr[Boolean] = js.undefined
    
    var requestAgent: js.UndefOr[Agent | typings.node.httpsMod.Agent] = js.undefined
    
    var requestHeaders: js.UndefOr[Headers] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(jwksUri: String): Options = {
      val __obj = js.Dynamic.literal(jwksUri = jwksUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
      
      inline def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
      
      inline def setCacheMaxEntries(value: Double): Self = StObject.set(x, "cacheMaxEntries", value.asInstanceOf[js.Any])
      
      inline def setCacheMaxEntriesUndefined: Self = StObject.set(x, "cacheMaxEntries", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setFetcher(value: /* jwksUri */ String => js.Promise[Keys]): Self = StObject.set(x, "fetcher", js.Any.fromFunction1(value))
      
      inline def setFetcherUndefined: Self = StObject.set(x, "fetcher", js.undefined)
      
      inline def setGetKeysInterceptor(value: () => js.Promise[js.Array[JSONWebKey]]): Self = StObject.set(x, "getKeysInterceptor", js.Any.fromFunction0(value))
      
      inline def setGetKeysInterceptorUndefined: Self = StObject.set(x, "getKeysInterceptor", js.undefined)
      
      inline def setJwksRequestsPerMinute(value: Double): Self = StObject.set(x, "jwksRequestsPerMinute", value.asInstanceOf[js.Any])
      
      inline def setJwksRequestsPerMinuteUndefined: Self = StObject.set(x, "jwksRequestsPerMinute", js.undefined)
      
      inline def setJwksUri(value: String): Self = StObject.set(x, "jwksUri", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRateLimit(value: Boolean): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
      
      inline def setRequestAgent(value: Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "requestAgent", value.asInstanceOf[js.Any])
      
      inline def setRequestAgentUndefined: Self = StObject.set(x, "requestAgent", js.undefined)
      
      inline def setRequestHeaders(value: Headers): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait RsaSigningKey
    extends StObject
       with SigningKey {
    
    var alg: String
    
    def getPublicKey(): String
    
    var kid: String
    
    var rsaPublicKey: String
  }
  object RsaSigningKey {
    
    inline def apply(alg: String, getPublicKey: () => String, kid: String, rsaPublicKey: String): RsaSigningKey = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], getPublicKey = js.Any.fromFunction0(getPublicKey), kid = kid.asInstanceOf[js.Any], rsaPublicKey = rsaPublicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RsaSigningKey]
    }
    
    extension [Self <: RsaSigningKey](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setGetPublicKey(value: () => String): Self = StObject.set(x, "getPublicKey", js.Any.fromFunction0(value))
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setRsaPublicKey(value: String): Self = StObject.set(x, "rsaPublicKey", value.asInstanceOf[js.Any])
    }
  }
  
  type SecretCallback = js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* payload */ Any, 
    /* done */ js.Function2[/* err */ Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  
  type SecretCallbackLong = js.Function4[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* header */ Any, 
    /* payload */ Any, 
    /* done */ js.Function2[/* err */ Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jwksRsa.mod.CertSigningKey
    - typings.jwksRsa.mod.RsaSigningKey
  */
  trait SigningKey extends StObject
  object SigningKey {
    
    inline def CertSigningKey(alg: String, getPublicKey: () => String, kid: String, publicKey: String): typings.jwksRsa.mod.CertSigningKey = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], getPublicKey = js.Any.fromFunction0(getPublicKey), kid = kid.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jwksRsa.mod.CertSigningKey]
    }
    
    inline def RsaSigningKey(alg: String, getPublicKey: () => String, kid: String, rsaPublicKey: String): typings.jwksRsa.mod.RsaSigningKey = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], getPublicKey = js.Any.fromFunction0(getPublicKey), kid = kid.asInstanceOf[js.Any], rsaPublicKey = rsaPublicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jwksRsa.mod.RsaSigningKey]
    }
  }
  
  trait TokenHeader extends StObject {
    
    var alg: String
    
    var kid: String
  }
  object TokenHeader {
    
    inline def apply(alg: String, kid: String): TokenHeader = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenHeader]
    }
    
    extension [Self <: TokenHeader](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Types are duplicated from express-jwt@6/7
    * due to numerous breaking changes in the lib's types
    * whilst this lib supportd both <=6 & >=7  implementations
    *
    * express-jwt's installed version (or its @types)
    * will be the types used at transpilation time
    */
  /** Types from express-jwt@<=6 */
  type secretType = String | Buffer
}
