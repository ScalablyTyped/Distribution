package typings.jwtExpress

import typings.express.mod.CookieOptions
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.jsonwebtoken.mod.SignOptions
import typings.jsonwebtoken.mod.VerifyOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jwt-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jwt-express", "active")
  @js.native
  def active(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("jwt-express", "clear")
  @js.native
  def clear(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("jwt-express", "create")
  @js.native
  def create(secret: String, payload: js.Any): JWT = js.native
  @JSImport("jwt-express", "create")
  @js.native
  def create(secret: js.Function1[/* payload */ js.Any, String], payload: js.Any): JWT = js.native
  
  @JSImport("jwt-express", "init")
  @js.native
  def init(secret: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("jwt-express", "init")
  @js.native
  def init(secret: String, options: JWTExpressOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("jwt-express", "init")
  @js.native
  def init(secret: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("jwt-express", "init")
  @js.native
  def init(
    secret: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String],
    options: JWTExpressOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("jwt-express", "options")
  @js.native
  def options: JWTExpressOptions = js.native
  @scala.inline
  def options_=(x: JWTExpressOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  @JSImport("jwt-express", "require")
  @js.native
  def require(key: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("jwt-express", "require")
  @js.native
  def require(key: String, operator: js.UndefOr[scala.Nothing], value: js.Any): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("jwt-express", "require")
  @js.native
  def require(key: String, operator: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("jwt-express", "require")
  @js.native
  def require(key: String, operator: String, value: js.Any): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("jwt-express", "valid")
  @js.native
  def valid(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait JWT extends StObject {
    
    /**
      * Indicates if the JWT is expired. valid will always be false if this is true.
      */
    var expired: Boolean = js.native
    
    /**
      * The jwt-express options.
      */
    var options: JWTExpressOptions = js.native
    
    /**
      * The payload of the JWT (must be an object). jwt-express will add a stales key-value pair to the payload for stale.
      */
    var payload: js.Any = js.native
    
    /**
      * Resigns this JWT Objects's payload.
      *
      * @return this
      */
    def resign(): JWT = js.native
    
    /**
      * Calls the revoke function defined in the jwt.init() options with this JWT Object as the first parameter.
      *
      * @return this
      */
    def revoke(): JWT = js.native
    
    /**
      * The secret used to sign /verify the JWT.
      */
    var secret: String = js.native
    
    /**
      * Generates a signed token from the payload.
      *
      * @param payload The payload of the JWT (must be an object).
      * @return this
      */
    def sign(payload: js.Any): JWT = js.native
    
    /**
      * Indicates if the JWT is stale. The default timeout before a JWT is considered stale is 15 minutes.
      */
    var stale: Boolean = js.native
    
    /**
      * Stores this JWT in the cookie (if configured to use cookies).
      *
      * @param res The response in which to store the JWT.
      * @return this
      */
    def store(res: Response_[_]): JWT = js.native
    
    /**
      * This function is called when the jwt is passed through JSON.stringify.
      * We don't want the secret or options to be stringified.
      *
      * @return The JSON form of the object.
      */
    def toJSON(): js.Any = js.native
    
    /**
      * The signed token of the JWT.
      */
    var token: String = js.native
    
    /**
      * Indicates if this JWT is valid. This means that the payload hasn't been tampered with and that the JWT hasn't expired yet.
      */
    var valid: Boolean = js.native
    
    /**
      * Verify the token and load the info into this JWT.
      *
      * @param token The signed token to verify.
      * @return this
      */
    def verify(token: String): JWT = js.native
  }
  object JWT {
    
    @scala.inline
    def apply(
      expired: Boolean,
      options: JWTExpressOptions,
      payload: js.Any,
      resign: () => JWT,
      revoke: () => JWT,
      secret: String,
      sign: js.Any => JWT,
      stale: Boolean,
      store: Response_[_] => JWT,
      toJSON: () => js.Any,
      token: String,
      valid: Boolean,
      verify: String => JWT
    ): JWT = {
      val __obj = js.Dynamic.literal(expired = expired.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], resign = js.Any.fromFunction0(resign), revoke = js.Any.fromFunction0(revoke), secret = secret.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign), stale = stale.asInstanceOf[js.Any], store = js.Any.fromFunction1(store), toJSON = js.Any.fromFunction0(toJSON), token = token.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], verify = js.Any.fromFunction1(verify))
      __obj.asInstanceOf[JWT]
    }
    
    @scala.inline
    implicit class JWTMutableBuilder[Self <: JWT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: JWTExpressOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResign(value: () => JWT): Self = StObject.set(x, "resign", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRevoke(value: () => JWT): Self = StObject.set(x, "revoke", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign(value: js.Any => JWT): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStore(value: Response_[_] => JWT): Self = StObject.set(x, "store", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerify(value: String => JWT): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait JWTExpressError extends Error
  object JWTExpressError {
    
    @scala.inline
    def apply(message: String, name: String): JWTExpressError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTExpressError]
    }
  }
  
  @js.native
  trait JWTExpressOptions extends StObject {
    
    /**
      * The name of the cookie (default: 'jwt-express')
      */
    var cookie: js.UndefOr[String] = js.native
    
    /**
      * Options to use when storing the cookie (default: {httpOnly: true})
      */
    var cookieOptions: js.UndefOr[CookieOptions] = js.native
    
    /**
      * If true, will use cookies, otherwise will use the Authorization header (default: true)
      */
    var cookies: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if the JWT should be refreshed and stored every request (default: true)
      */
    var refresh: js.UndefOr[Boolean] = js.native
    
    /**
      * The property of req to populate (default: 'jwt')
      */
    var reqProperty: js.UndefOr[String] = js.native
    
    /**
      * jwt.revoke() will call this function (default: function(jwt) {})
      */
    var revoke: js.UndefOr[js.Function1[/* jwt */ JWT, Unit]] = js.native
    
    /**
      * Options to use when signing the JWT (default: {})
      */
    var signOptions: js.UndefOr[SignOptions] = js.native
    
    /**
      * Milliseconds when the jwt will go stale (default: 900000 (15 minutes))
      */
    var stales: js.UndefOr[Double] = js.native
    
    /**
      * Additional verification. Must return a boolean (default: function(jwt) {return true})
      */
    var verify: js.UndefOr[js.Function1[/* jwt */ JWT, Boolean]] = js.native
    
    /**
      * Options to use when verifying the JWT (default: {})
      */
    var verifyOptions: js.UndefOr[VerifyOptions] = js.native
  }
  object JWTExpressOptions {
    
    @scala.inline
    def apply(): JWTExpressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWTExpressOptions]
    }
    
    @scala.inline
    implicit class JWTExpressOptionsMutableBuilder[Self <: JWTExpressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieOptions(value: CookieOptions): Self = StObject.set(x, "cookieOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieOptionsUndefined: Self = StObject.set(x, "cookieOptions", js.undefined)
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      @scala.inline
      def setReqProperty(value: String): Self = StObject.set(x, "reqProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqPropertyUndefined: Self = StObject.set(x, "reqProperty", js.undefined)
      
      @scala.inline
      def setRevoke(value: /* jwt */ JWT => Unit): Self = StObject.set(x, "revoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRevokeUndefined: Self = StObject.set(x, "revoke", js.undefined)
      
      @scala.inline
      def setSignOptions(value: SignOptions): Self = StObject.set(x, "signOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignOptionsUndefined: Self = StObject.set(x, "signOptions", js.undefined)
      
      @scala.inline
      def setStales(value: Double): Self = StObject.set(x, "stales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStalesUndefined: Self = StObject.set(x, "stales", js.undefined)
      
      @scala.inline
      def setVerify(value: /* jwt */ JWT => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerifyOptions(value: VerifyOptions): Self = StObject.set(x, "verifyOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyOptionsUndefined: Self = StObject.set(x, "verifyOptions", js.undefined)
      
      @scala.inline
      def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        var jwt: JWT = js.native
      }
      object Request {
        
        @scala.inline
        def apply(jwt: JWT): Request = {
          val __obj = js.Dynamic.literal(jwt = jwt.asInstanceOf[js.Any])
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setJwt(value: JWT): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Response extends StObject {
        
        /**
          * Returns a newly created / signed JWT Object from the payload. If you are using cookies,
          * it will automatically store the JWT in the cookie as well.
          *
          * @param payload The payload of the JWT
          * @return The newly created JWT
          */
        def jwt(payload: js.Any): JWT = js.native
      }
      object Response {
        
        @scala.inline
        def apply(jwt: js.Any => JWT): Response = {
          val __obj = js.Dynamic.literal(jwt = js.Any.fromFunction1(jwt))
          __obj.asInstanceOf[Response]
        }
        
        @scala.inline
        implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setJwt(value: js.Any => JWT): Self = StObject.set(x, "jwt", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
