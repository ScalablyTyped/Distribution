package typings.jwtExpress

import typings.express.mod.CookieOptions
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.jsonwebtoken.mod.SignOptions
import typings.jsonwebtoken.mod.VerifyOptions
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jwt-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def active(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("active")().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  inline def clear(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  inline def create(secret: String, payload: Any): JWT = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(secret.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[JWT]
  inline def create(secret: js.Function1[/* payload */ Any, String], payload: Any): JWT = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(secret.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[JWT]
  
  inline def init(secret: String): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(secret.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def init(secret: String, options: JWTExpressOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def init(
    secret: js.Function1[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      String
    ]
  ): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(secret.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def init(
    secret: js.Function1[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      String
    ],
    options: JWTExpressOptions
  ): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("jwt-express", "options")
  @js.native
  def options: JWTExpressOptions = js.native
  inline def options_=(x: JWTExpressOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  inline def require(key: String): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(key.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def require(key: String, operator: String): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(key.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def require(key: String, operator: String, value: Any): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(key.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def require(key: String, operator: Unit, value: Any): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(key.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  inline def valid(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  trait JWT extends StObject {
    
    /**
      * Indicates if the JWT is expired. valid will always be false if this is true.
      */
    var expired: Boolean
    
    /**
      * The jwt-express options.
      */
    var options: JWTExpressOptions
    
    /**
      * The payload of the JWT (must be an object). jwt-express will add a stales key-value pair to the payload for stale.
      */
    var payload: Any
    
    /**
      * Resigns this JWT Objects's payload.
      *
      * @return this
      */
    def resign(): JWT
    
    /**
      * Calls the revoke function defined in the jwt.init() options with this JWT Object as the first parameter.
      *
      * @return this
      */
    def revoke(): JWT
    
    /**
      * The secret used to sign /verify the JWT.
      */
    var secret: String
    
    /**
      * Generates a signed token from the payload.
      *
      * @param payload The payload of the JWT (must be an object).
      * @return this
      */
    def sign(payload: Any): JWT
    
    /**
      * Indicates if the JWT is stale. The default timeout before a JWT is considered stale is 15 minutes.
      */
    var stale: Boolean
    
    /**
      * Stores this JWT in the cookie (if configured to use cookies).
      *
      * @param res The response in which to store the JWT.
      * @return this
      */
    def store(res: Response_[Any, Record[String, Any]]): JWT
    
    /**
      * This function is called when the jwt is passed through JSON.stringify.
      * We don't want the secret or options to be stringified.
      *
      * @return The JSON form of the object.
      */
    def toJSON(): Any
    
    /**
      * The signed token of the JWT.
      */
    var token: String
    
    /**
      * Indicates if this JWT is valid. This means that the payload hasn't been tampered with and that the JWT hasn't expired yet.
      */
    var valid: Boolean
    
    /**
      * Verify the token and load the info into this JWT.
      *
      * @param token The signed token to verify.
      * @return this
      */
    def verify(token: String): JWT
  }
  object JWT {
    
    inline def apply(
      expired: Boolean,
      options: JWTExpressOptions,
      payload: Any,
      resign: () => JWT,
      revoke: () => JWT,
      secret: String,
      sign: Any => JWT,
      stale: Boolean,
      store: Response_[Any, Record[String, Any]] => JWT,
      toJSON: () => Any,
      token: String,
      valid: Boolean,
      verify: String => JWT
    ): JWT = {
      val __obj = js.Dynamic.literal(expired = expired.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], resign = js.Any.fromFunction0(resign), revoke = js.Any.fromFunction0(revoke), secret = secret.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign), stale = stale.asInstanceOf[js.Any], store = js.Any.fromFunction1(store), toJSON = js.Any.fromFunction0(toJSON), token = token.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], verify = js.Any.fromFunction1(verify))
      __obj.asInstanceOf[JWT]
    }
    
    extension [Self <: JWT](x: Self) {
      
      inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: JWTExpressOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setResign(value: () => JWT): Self = StObject.set(x, "resign", js.Any.fromFunction0(value))
      
      inline def setRevoke(value: () => JWT): Self = StObject.set(x, "revoke", js.Any.fromFunction0(value))
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSign(value: Any => JWT): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      inline def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Response_[Any, Record[String, Any]] => JWT): Self = StObject.set(x, "store", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setVerify(value: String => JWT): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
    }
  }
  
  trait JWTExpressError
    extends StObject
       with Error
  object JWTExpressError {
    
    inline def apply(message: String, name: String): JWTExpressError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTExpressError]
    }
  }
  
  trait JWTExpressOptions extends StObject {
    
    /**
      * The name of the cookie (default: 'jwt-express')
      */
    var cookie: js.UndefOr[String] = js.undefined
    
    /**
      * Options to use when storing the cookie (default: {httpOnly: true})
      */
    var cookieOptions: js.UndefOr[CookieOptions] = js.undefined
    
    /**
      * If true, will use cookies, otherwise will use the Authorization header (default: true)
      */
    var cookies: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if the JWT should be refreshed and stored every request (default: true)
      */
    var refresh: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The property of req to populate (default: 'jwt')
      */
    var reqProperty: js.UndefOr[String] = js.undefined
    
    /**
      * jwt.revoke() will call this function (default: function(jwt) {})
      */
    var revoke: js.UndefOr[js.Function1[/* jwt */ JWT, Unit]] = js.undefined
    
    /**
      * Options to use when signing the JWT (default: {})
      */
    var signOptions: js.UndefOr[SignOptions] = js.undefined
    
    /**
      * Milliseconds when the jwt will go stale (default: 900000 (15 minutes))
      */
    var stales: js.UndefOr[Double] = js.undefined
    
    /**
      * Additional verification. Must return a boolean (default: function(jwt) {return true})
      */
    var verify: js.UndefOr[js.Function1[/* jwt */ JWT, Boolean]] = js.undefined
    
    /**
      * Options to use when verifying the JWT (default: {})
      */
    var verifyOptions: js.UndefOr[VerifyOptions] = js.undefined
  }
  object JWTExpressOptions {
    
    inline def apply(): JWTExpressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWTExpressOptions]
    }
    
    extension [Self <: JWTExpressOptions](x: Self) {
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieOptions(value: CookieOptions): Self = StObject.set(x, "cookieOptions", value.asInstanceOf[js.Any])
      
      inline def setCookieOptionsUndefined: Self = StObject.set(x, "cookieOptions", js.undefined)
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setReqProperty(value: String): Self = StObject.set(x, "reqProperty", value.asInstanceOf[js.Any])
      
      inline def setReqPropertyUndefined: Self = StObject.set(x, "reqProperty", js.undefined)
      
      inline def setRevoke(value: /* jwt */ JWT => Unit): Self = StObject.set(x, "revoke", js.Any.fromFunction1(value))
      
      inline def setRevokeUndefined: Self = StObject.set(x, "revoke", js.undefined)
      
      inline def setSignOptions(value: SignOptions): Self = StObject.set(x, "signOptions", value.asInstanceOf[js.Any])
      
      inline def setSignOptionsUndefined: Self = StObject.set(x, "signOptions", js.undefined)
      
      inline def setStales(value: Double): Self = StObject.set(x, "stales", value.asInstanceOf[js.Any])
      
      inline def setStalesUndefined: Self = StObject.set(x, "stales", js.undefined)
      
      inline def setVerify(value: /* jwt */ JWT => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
      
      inline def setVerifyOptions(value: VerifyOptions): Self = StObject.set(x, "verifyOptions", value.asInstanceOf[js.Any])
      
      inline def setVerifyOptionsUndefined: Self = StObject.set(x, "verifyOptions", js.undefined)
      
      inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var jwt: JWT
      }
      object Request {
        
        inline def apply(jwt: JWT): Request = {
          val __obj = js.Dynamic.literal(jwt = jwt.asInstanceOf[js.Any])
          __obj.asInstanceOf[Request]
        }
        
        extension [Self <: Request](x: Self) {
          
          inline def setJwt(value: JWT): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
        }
      }
      
      trait Response extends StObject {
        
        /**
          * Returns a newly created / signed JWT Object from the payload. If you are using cookies,
          * it will automatically store the JWT in the cookie as well.
          *
          * @param payload The payload of the JWT
          * @return The newly created JWT
          */
        def jwt(payload: Any): JWT
      }
      object Response {
        
        inline def apply(jwt: Any => JWT): Response = {
          val __obj = js.Dynamic.literal(jwt = js.Any.fromFunction1(jwt))
          __obj.asInstanceOf[Response]
        }
        
        extension [Self <: Response](x: Self) {
          
          inline def setJwt(value: Any => JWT): Self = StObject.set(x, "jwt", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
