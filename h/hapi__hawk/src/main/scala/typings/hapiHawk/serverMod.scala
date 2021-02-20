package typings.hapiHawk

import typings.hapiHawk.clientMod.Message_
import typings.hapiHawk.cryptoMod.Artifacts
import typings.hapiHawk.hapiHawkStrings.sha1
import typings.hapiHawk.hapiHawkStrings.sha256
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("@hapi/hawk/lib/server", "authenticate")
  @js.native
  def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): js.Promise[Authentication] = js.native
  @JSImport("@hapi/hawk/lib/server", "authenticate")
  @js.native
  def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateOptions): js.Promise[Authentication] = js.native
  
  @JSImport("@hapi/hawk/lib/server", "authenticateBewit")
  @js.native
  def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc): AuthenticatedBewit = js.native
  @JSImport("@hapi/hawk/lib/server", "authenticateBewit")
  @js.native
  def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): AuthenticatedBewit = js.native
  
  @JSImport("@hapi/hawk/lib/server", "authenticateMessage")
  @js.native
  def authenticateMessage(
    host: String,
    port: Double,
    message: String,
    authorization: Message_,
    credentialsFunc: CredentialsFunc,
    options: AuthenticateMessageOptions
  ): js.Promise[AuthenticatedMessage] = js.native
  
  @JSImport("@hapi/hawk/lib/server", "authenticatePayload")
  @js.native
  def authenticatePayload(payload: String, credentials: Credentials, artifacts: Artifacts, contentType: String): Unit = js.native
  
  @JSImport("@hapi/hawk/lib/server", "authenticatePayloadHash")
  @js.native
  def authenticatePayloadHash(calculatedHash: String, artifacts: Artifacts): Unit = js.native
  
  @JSImport("@hapi/hawk/lib/server", "header")
  @js.native
  def header(credentials: Credentials, artifacts: Artifacts): String = js.native
  @JSImport("@hapi/hawk/lib/server", "header")
  @js.native
  def header(credentials: Credentials, artifacts: Artifacts, options: HeaderOptions): String = js.native
  
  /* Inlined std.Pick<@hapi/hawk.@hapi/hawk/lib/server.AuthenticateOptions, 'hostHeaderName' | 'localtimeOffsetMsec' | 'host' | 'port'> */
  @js.native
  trait AuthenticateBewitOptions extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var hostHeaderName: js.UndefOr[String] = js.native
    
    var localtimeOffsetMsec: js.UndefOr[Double] = js.native
    
    var port: js.UndefOr[Double] = js.native
  }
  object AuthenticateBewitOptions {
    
    @scala.inline
    def apply(): AuthenticateBewitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateBewitOptions]
    }
    
    @scala.inline
    implicit class AuthenticateBewitOptionsMutableBuilder[Self <: AuthenticateBewitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostHeaderName(value: String): Self = StObject.set(x, "hostHeaderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostHeaderNameUndefined: Self = StObject.set(x, "hostHeaderName", js.undefined)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaltimeOffsetMsecUndefined: Self = StObject.set(x, "localtimeOffsetMsec", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@hapi/hawk.@hapi/hawk/lib/server.AuthenticateOptions, 'nonceFunc' | 'timestampSkewSec' | 'localtimeOffsetMsec'> */
  @js.native
  trait AuthenticateMessageOptions extends StObject {
    
    var localtimeOffsetMsec: js.UndefOr[Double] = js.native
    
    var nonceFunc: js.UndefOr[NonceFunc] = js.native
    
    var timestampSkewSec: js.UndefOr[Double] = js.native
  }
  object AuthenticateMessageOptions {
    
    @scala.inline
    def apply(): AuthenticateMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateMessageOptions]
    }
    
    @scala.inline
    implicit class AuthenticateMessageOptionsMutableBuilder[Self <: AuthenticateMessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaltimeOffsetMsecUndefined: Self = StObject.set(x, "localtimeOffsetMsec", js.undefined)
      
      @scala.inline
      def setNonceFunc(value: (/* key */ String, /* nonce */ String, /* ts */ String) => js.Promise[Unit] | Unit): Self = StObject.set(x, "nonceFunc", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNonceFuncUndefined: Self = StObject.set(x, "nonceFunc", js.undefined)
      
      @scala.inline
      def setTimestampSkewSec(value: Double): Self = StObject.set(x, "timestampSkewSec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampSkewSecUndefined: Self = StObject.set(x, "timestampSkewSec", js.undefined)
    }
  }
  
  @js.native
  trait AuthenticateOptions extends StObject {
    
    /**
      * optional host name override. Only used when passed a node request object.
      */
    var host: js.UndefOr[String] = js.native
    
    /**
      * optional header field name, used to override the default 'Host' header when used
      * behind a cache of a proxy. Apache2 changes the value of the 'Host' header while preserving
      * the original (which is what the module must verify) in the 'x-forwarded-host' header field.
      * Only used when passed a node `http.ServerRequest` object.
      */
    var hostHeaderName: js.UndefOr[String] = js.native
    
    /**
      * Optional local clock time offset express in a number of milliseconds (positive or negative).
      * Defaults to 0.
      */
    var localtimeOffsetMsec: js.UndefOr[Double] = js.native
    
    /**
      * optional nonce validation function. The function signature is `async function(key, nonce, ts)`
      * and it must return no value for success or throw an error for invalid state.
      */
    var nonceFunc: js.UndefOr[NonceFunc] = js.native
    
    /**
      * optional payload for validation. The client calculates the hash value and includes it via the 'hash'
      * header attribute. The server always ensures the value provided has been included in the request
      * MAC. When this option is provided, it validates the hash value itself. Validation is done by calculating
      * a hash value over the entire payload (assuming it has already be normalized to the same format and
      * encoding used by the client to calculate the hash on request). If the payload is not available at the time
      * of authentication, the `authenticatePayload()` method can be used by passing it the credentials and
      * `attributes.hash` returned from `authenticate()`.
      */
    var payload: js.UndefOr[String] = js.native
    
    /**
      * optional port override. Only used when passed a node request object.
      */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * optional number of seconds of permitted clock skew for incoming timestamps. Defaults to 60 seconds.
      * Provides a +/- skew which means actual allowed window is double the number of seconds.
      */
    var timestampSkewSec: js.UndefOr[Double] = js.native
  }
  object AuthenticateOptions {
    
    @scala.inline
    def apply(): AuthenticateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateOptions]
    }
    
    @scala.inline
    implicit class AuthenticateOptionsMutableBuilder[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostHeaderName(value: String): Self = StObject.set(x, "hostHeaderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostHeaderNameUndefined: Self = StObject.set(x, "hostHeaderName", js.undefined)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaltimeOffsetMsecUndefined: Self = StObject.set(x, "localtimeOffsetMsec", js.undefined)
      
      @scala.inline
      def setNonceFunc(value: (/* key */ String, /* nonce */ String, /* ts */ String) => js.Promise[Unit] | Unit): Self = StObject.set(x, "nonceFunc", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNonceFuncUndefined: Self = StObject.set(x, "nonceFunc", js.undefined)
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setTimestampSkewSec(value: Double): Self = StObject.set(x, "timestampSkewSec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampSkewSecUndefined: Self = StObject.set(x, "timestampSkewSec", js.undefined)
    }
  }
  
  @js.native
  trait AuthenticatedBewit extends AuthenticatedMessage {
    
    var bewit: Bewit = js.native
  }
  object AuthenticatedBewit {
    
    @scala.inline
    def apply(bewit: Bewit, credentials: Credentials): AuthenticatedBewit = {
      val __obj = js.Dynamic.literal(bewit = bewit.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticatedBewit]
    }
    
    @scala.inline
    implicit class AuthenticatedBewitMutableBuilder[Self <: AuthenticatedBewit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBewit(value: Bewit): Self = StObject.set(x, "bewit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthenticatedMessage extends StObject {
    
    var credentials: Credentials = js.native
  }
  object AuthenticatedMessage {
    
    @scala.inline
    def apply(credentials: Credentials): AuthenticatedMessage = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticatedMessage]
    }
    
    @scala.inline
    implicit class AuthenticatedMessageMutableBuilder[Self <: AuthenticatedMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Authentication extends StObject {
    
    var artifacts: Artifacts = js.native
    
    var credentials: Credentials = js.native
  }
  object Authentication {
    
    @scala.inline
    def apply(artifacts: Artifacts, credentials: Credentials): Authentication = {
      val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authentication]
    }
    
    @scala.inline
    implicit class AuthenticationMutableBuilder[Self <: Authentication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtifacts(value: Artifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bewit extends StObject {
    
    var exp: String = js.native
    
    var ext: String = js.native
    
    var id: String = js.native
    
    var mac: String = js.native
  }
  object Bewit {
    
    @scala.inline
    def apply(exp: String, ext: String, id: String, mac: String): Bewit = {
      val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bewit]
    }
    
    @scala.inline
    implicit class BewitMutableBuilder[Self <: Bewit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Credentials extends StObject {
    
    var algorithm: sha1 | sha256 = js.native
    
    var key: String = js.native
    
    var user: String = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(algorithm: sha1 | sha256, key: String, user: String): Credentials = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: sha1 | sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  type CredentialsFunc = js.Function1[/* id */ String, js.Promise[Credentials] | Credentials]
  
  @js.native
  trait HeaderOptions extends StObject {
    
    /** Payload content-type (ignored if hash provided) */
    var contentType: js.UndefOr[String] = js.native
    
    /** Application specific data sent via the ext attribute */
    var ext: js.UndefOr[String] = js.native
    
    /** Pre-calculated payload hash */
    var hash: js.UndefOr[String] = js.native
    
    /** UTF-8 encoded string for body hash generation (ignored if hash provided) */
    var payload: js.UndefOr[String] = js.native
  }
  object HeaderOptions {
    
    @scala.inline
    def apply(): HeaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderOptions]
    }
    
    @scala.inline
    implicit class HeaderOptionsMutableBuilder[Self <: HeaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  type NonceFunc = js.Function3[/* key */ String, /* nonce */ String, /* ts */ String, js.Promise[Unit] | Unit]
}
