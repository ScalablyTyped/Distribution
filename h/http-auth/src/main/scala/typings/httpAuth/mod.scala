package typings.httpAuth

import typings.httpAuth.anon.IncomingMessageuserstring
import typings.httpAuth.httpAuthBooleans.`false`
import typings.httpAuth.httpAuthBooleans.`true`
import typings.httpAuth.httpAuthStrings.auth
import typings.httpAuth.httpAuthStrings.error
import typings.httpAuth.httpAuthStrings.fail
import typings.httpAuth.httpAuthStrings.success
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def basic(options: BasicOptions): Basic_ = ^.asInstanceOf[js.Dynamic].applyDynamic("basic")(options.asInstanceOf[js.Any]).asInstanceOf[Basic_]
  @scala.inline
  def basic(options: BasicOptions, checker: BasicChecker): Basic_ = (^.asInstanceOf[js.Dynamic].applyDynamic("basic")(options.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Basic_]
  
  @scala.inline
  def digest(options: DigestOptions): Digest_ = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(options.asInstanceOf[js.Any]).asInstanceOf[Digest_]
  @scala.inline
  def digest(options: DigestOptions, checker: DigestChecker): Digest_ = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(options.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Digest_]
  
  /* Rewritten from type alias, can be one of: 
    - typings.httpAuth.httpAuthStrings.MD5
    - typings.httpAuth.httpAuthStrings.`MD5-sess`
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    @scala.inline
    def MD5: typings.httpAuth.httpAuthStrings.MD5 = "MD5".asInstanceOf[typings.httpAuth.httpAuthStrings.MD5]
    
    @scala.inline
    def `MD5-sess`: typings.httpAuth.httpAuthStrings.`MD5-sess` = "MD5-sess".asInstanceOf[typings.httpAuth.httpAuthStrings.`MD5-sess`]
  }
  
  @js.native
  trait Base extends EventEmitter {
    
    /* private */ def ask(res: ServerResponse, result: BasicResult[Boolean]): Unit = js.native
    /* private */ def ask(res: ServerResponse, result: DigestResult[Boolean]): Unit = js.native
    
    def check(): CheckedRequestListener = js.native
    def check(callback: CheckedRequestListener): CheckedRequestListener = js.native
    
    def findUser(req: IncomingMessage, hashOrClientOptions: String, callback: ResultEmitter): Unit = js.native
    def findUser(req: IncomingMessage, hashOrClientOptions: ClientOptions, callback: ResultEmitter): Unit = js.native
    
    def generateHeader(): String = js.native
    def generateHeader(result: DigestResult[Boolean]): String = js.native
    
    /* private */ def isAuthenticated(req: IncomingMessage, callback: ResultEmitter): Unit = js.native
    
    /* private */ def loadUsers(): Unit = js.native
    
    def on(
      event: fail,
      callback: js.Function1[/* result */ BasicResult[`false`] | DigestResult[`false`], Unit]
    ): this.type = js.native
    def on(
      event: success,
      callback: js.Function1[/* result */ BasicResult[`true`] | DigestResult[`true`], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, callback: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    def parseAuthorization(header: String): js.UndefOr[String | ClientOptions] = js.native
    
    def processLine(userLine: String): Unit = js.native
  }
  
  type BasicChecker = js.Function3[
    /* username */ String, 
    /* password */ String, 
    /* callback */ js.Function1[/* isAuthorized */ Boolean, Unit], 
    Unit
  ]
  
  trait BasicOptions extends StObject {
    
    /**
      * Content type for failed authentication page.
      * @default 'text/plain'
      */
    var contentType: js.UndefOr[String] = js.undefined
    
    /**
      * File where user details are stored.
      * - Line format is {user:pass} or {user:passHash} for basic access.
      * - Line format is {user:realm:passHash} for digest access.
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * Message for failed authentication 401 page.
      * @default '401 Unauthorized'
      */
    var msg401: js.UndefOr[String] = js.undefined
    
    /**
      * Message for failed authentication 407 page.
      * @default '407 Proxy authentication required
      */
    var msg407: js.UndefOr[String] = js.undefined
    
    /**
      * Set this to true, if you want to use it with http-proxy (https://github.com/http-party/node-http-proxy).
      * @default false
      */
    var proxy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Authentication realm, by default it is 'users'.
      * @default 'users'
      */
    var realm: js.UndefOr[String] = js.undefined
    
    /**
      * Set this to true, if you don't want req.user to be filled with authentication info.
      */
    var skipUser: js.UndefOr[Boolean] = js.undefined
  }
  object BasicOptions {
    
    @scala.inline
    def apply(): BasicOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicOptions]
    }
    
    @scala.inline
    implicit class BasicOptionsMutableBuilder[Self <: BasicOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setMsg401(value: String): Self = StObject.set(x, "msg401", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg401Undefined: Self = StObject.set(x, "msg401", js.undefined)
      
      @scala.inline
      def setMsg407(value: String): Self = StObject.set(x, "msg407", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg407Undefined: Self = StObject.set(x, "msg407", js.undefined)
      
      @scala.inline
      def setProxy(value: Boolean): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      @scala.inline
      def setSkipUser(value: Boolean): Self = StObject.set(x, "skipUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUserUndefined: Self = StObject.set(x, "skipUser", js.undefined)
    }
  }
  
  trait BasicResult[T /* <: Boolean */] extends StObject {
    
    var pass: js.UndefOr[T] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object BasicResult {
    
    @scala.inline
    def apply[T /* <: Boolean */](): BasicResult[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicResult[T]]
    }
    
    @scala.inline
    implicit class BasicResultMutableBuilder[Self <: BasicResult[?], T /* <: Boolean */] (val x: Self & BasicResult[T]) extends AnyVal {
      
      @scala.inline
      def setPass(value: T): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait Basic_ extends Base {
    
    /* private */ def validate(hash: String, password: String): Boolean = js.native
  }
  
  type CheckedRequestListener = js.Function2[/* req */ IncomingMessageuserstring, /* res */ ServerResponse, Unit]
  
  trait ClientOptions extends StObject {
    
    var algorithm: Algorithm
    
    var cnonce: js.UndefOr[String] = js.undefined
    
    var nc: js.UndefOr[String] = js.undefined
    
    var nonce: String
    
    var qop: js.UndefOr[auth] = js.undefined
    
    var realm: String
    
    var response: String
    
    var uri: String
    
    var username: String
  }
  object ClientOptions {
    
    @scala.inline
    def apply(
      algorithm: Algorithm,
      nonce: String,
      realm: String,
      response: String,
      uri: String,
      username: String
    ): ClientOptions = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCnonce(value: String): Self = StObject.set(x, "cnonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCnonceUndefined: Self = StObject.set(x, "cnonce", js.undefined)
      
      @scala.inline
      def setNc(value: String): Self = StObject.set(x, "nc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNcUndefined: Self = StObject.set(x, "nc", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQop(value: auth): Self = StObject.set(x, "qop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQopUndefined: Self = StObject.set(x, "qop", js.undefined)
      
      @scala.inline
      def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  type DigestChecker = js.Function2[
    /* username */ String, 
    /* callback */ js.Function1[/* hash */ js.UndefOr[String], Unit], 
    Unit
  ]
  
  trait DigestOptions
    extends StObject
       with BasicOptions {
    
    /**
      * Algorithm that will be used only for digest access authentication.
      * 'MD5' or 'MD5-sess' can be set.
      * @default 'MD5'
      */
    var algorithm: js.UndefOr[Algorithm] = js.undefined
    
    /**
      * Quality of protection that is used only for digest access authentication
      * - 'auth' is set by default.
      * - 'none' this option is disabling protection.
      * @default 'auth
      */
    var qop: js.UndefOr[Qop] = js.undefined
  }
  object DigestOptions {
    
    @scala.inline
    def apply(): DigestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DigestOptions]
    }
    
    @scala.inline
    implicit class DigestOptionsMutableBuilder[Self <: DigestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setQop(value: Qop): Self = StObject.set(x, "qop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQopUndefined: Self = StObject.set(x, "qop", js.undefined)
    }
  }
  
  trait DigestResult[T /* <: Boolean */]
    extends StObject
       with BasicResult[T] {
    
    var stale: js.UndefOr[`true`] = js.undefined
  }
  object DigestResult {
    
    @scala.inline
    def apply[T /* <: Boolean */](): DigestResult[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DigestResult[T]]
    }
    
    @scala.inline
    implicit class DigestResultMutableBuilder[Self <: DigestResult[?], T /* <: Boolean */] (val x: Self & DigestResult[T]) extends AnyVal {
      
      @scala.inline
      def setStale(value: `true`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    }
  }
  
  @js.native
  trait Digest_ extends Base {
    
    /* private */ def askNonce(): String = js.native
    
    var nonces: js.Array[Nonce] = js.native
    
    /* private */ def removeNonces(nonces: js.Array[Nonce]): Unit = js.native
    
    /* private */ def validate(ha2: String, clientOptions: ClientOptions, hash: String): Boolean = js.native
    
    /* private */ def validateNonce(nonce: String, qop: Qop, nc: String): Boolean = js.native
  }
  
  type Nonce = js.Tuple3[String, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.httpAuth.httpAuthStrings.auth
    - typings.httpAuth.httpAuthStrings.none
  */
  trait Qop extends StObject
  object Qop {
    
    @scala.inline
    def auth: typings.httpAuth.httpAuthStrings.auth = "auth".asInstanceOf[typings.httpAuth.httpAuthStrings.auth]
    
    @scala.inline
    def none: typings.httpAuth.httpAuthStrings.none = "none".asInstanceOf[typings.httpAuth.httpAuthStrings.none]
  }
  
  type ResultEmitter = js.Function1[/* result */ BasicResult[Boolean] | DigestResult[Boolean] | Error, Unit]
}
