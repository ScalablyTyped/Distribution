package typings.hawk

import typings.hawk.clientMod.Message_
import typings.hawk.cryptoMod.Artifacts
import typings.hawk.hawkStrings.sha1
import typings.hawk.hawkStrings.sha256
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("hawk/lib/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): js.Promise[Authentication] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Authentication]]
  inline def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateOptions): js.Promise[Authentication] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Authentication]]
  
  inline def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc): js.Promise[AuthenticatedBewit] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateBewit")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticatedBewit]]
  inline def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): js.Promise[AuthenticatedBewit] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateBewit")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticatedBewit]]
  
  inline def authenticateMessage(
    host: String,
    port: Double,
    message: String,
    authorization: Message_,
    credentialsFunc: CredentialsFunc,
    options: AuthenticateMessageOptions
  ): js.Promise[AuthenticatedMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateMessage")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], message.asInstanceOf[js.Any], authorization.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticatedMessage]]
  
  inline def authenticatePayload(payload: String, credentials: Credentials, artifacts: Artifacts, contentType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatePayload")(payload.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def authenticatePayloadHash(calculatedHash: String, artifacts: Artifacts): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatePayloadHash")(calculatedHash.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def header(credentials: Credentials, artifacts: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def header(credentials: Credentials, artifacts: Artifacts, options: HeaderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Inlined std.Pick<hawk.hawk/lib/server.AuthenticateOptions, 'hostHeaderName' | 'localtimeOffsetMsec' | 'host' | 'port'> */
  trait AuthenticateBewitOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostHeaderName: js.UndefOr[String] = js.undefined
    
    var localtimeOffsetMsec: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object AuthenticateBewitOptions {
    
    inline def apply(): AuthenticateBewitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateBewitOptions]
    }
    
    extension [Self <: AuthenticateBewitOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostHeaderName(value: String): Self = StObject.set(x, "hostHeaderName", value.asInstanceOf[js.Any])
      
      inline def setHostHeaderNameUndefined: Self = StObject.set(x, "hostHeaderName", js.undefined)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      inline def setLocaltimeOffsetMsecUndefined: Self = StObject.set(x, "localtimeOffsetMsec", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  /* Inlined std.Pick<hawk.hawk/lib/server.AuthenticateOptions, 'nonceFunc' | 'timestampSkewSec' | 'localtimeOffsetMsec'> */
  trait AuthenticateMessageOptions extends StObject {
    
    var localtimeOffsetMsec: js.UndefOr[Double] = js.undefined
    
    var nonceFunc: js.UndefOr[NonceFunc] = js.undefined
    
    var timestampSkewSec: js.UndefOr[Double] = js.undefined
  }
  object AuthenticateMessageOptions {
    
    inline def apply(): AuthenticateMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateMessageOptions]
    }
    
    extension [Self <: AuthenticateMessageOptions](x: Self) {
      
      inline def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      inline def setLocaltimeOffsetMsecUndefined: Self = StObject.set(x, "localtimeOffsetMsec", js.undefined)
      
      inline def setNonceFunc(value: (/* key */ String, /* nonce */ String, /* ts */ String) => js.Promise[Unit] | Unit): Self = StObject.set(x, "nonceFunc", js.Any.fromFunction3(value))
      
      inline def setNonceFuncUndefined: Self = StObject.set(x, "nonceFunc", js.undefined)
      
      inline def setTimestampSkewSec(value: Double): Self = StObject.set(x, "timestampSkewSec", value.asInstanceOf[js.Any])
      
      inline def setTimestampSkewSecUndefined: Self = StObject.set(x, "timestampSkewSec", js.undefined)
    }
  }
  
  trait AuthenticateOptions extends StObject {
    
    /**
      * optional host name override. Only used when passed a node request object.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * optional header field name, used to override the default 'Host' header when used
      * behind a cache of a proxy. Apache2 changes the value of the 'Host' header while preserving
      * the original (which is what the module must verify) in the 'x-forwarded-host' header field.
      * Only used when passed a node `http.ServerRequest` object.
      */
    var hostHeaderName: js.UndefOr[String] = js.undefined
    
    /**
      * Optional local clock time offset express in a number of milliseconds (positive or negative).
      * Defaults to 0.
      */
    var localtimeOffsetMsec: js.UndefOr[Double] = js.undefined
    
    /**
      * optional nonce validation function. The function signature is `async function(key, nonce, ts)`
      * and it must return no value for success or throw an error for invalid state.
      */
    var nonceFunc: js.UndefOr[NonceFunc] = js.undefined
    
    /**
      * optional payload for validation. The client calculates the hash value and includes it via the 'hash'
      * header attribute. The server always ensures the value provided has been included in the request
      * MAC. When this option is provided, it validates the hash value itself. Validation is done by calculating
      * a hash value over the entire payload (assuming it has already be normalized to the same format and
      * encoding used by the client to calculate the hash on request). If the payload is not available at the time
      * of authentication, the `authenticatePayload()` method can be used by passing it the credentials and
      * `attributes.hash` returned from `authenticate()`.
      */
    var payload: js.UndefOr[String] = js.undefined
    
    /**
      * optional port override. Only used when passed a node request object.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * optional number of seconds of permitted clock skew for incoming timestamps. Defaults to 60 seconds.
      * Provides a +/- skew which means actual allowed window is double the number of seconds.
      */
    var timestampSkewSec: js.UndefOr[Double] = js.undefined
  }
  object AuthenticateOptions {
    
    inline def apply(): AuthenticateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateOptions]
    }
    
    extension [Self <: AuthenticateOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostHeaderName(value: String): Self = StObject.set(x, "hostHeaderName", value.asInstanceOf[js.Any])
      
      inline def setHostHeaderNameUndefined: Self = StObject.set(x, "hostHeaderName", js.undefined)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      inline def setLocaltimeOffsetMsecUndefined: Self = StObject.set(x, "localtimeOffsetMsec", js.undefined)
      
      inline def setNonceFunc(value: (/* key */ String, /* nonce */ String, /* ts */ String) => js.Promise[Unit] | Unit): Self = StObject.set(x, "nonceFunc", js.Any.fromFunction3(value))
      
      inline def setNonceFuncUndefined: Self = StObject.set(x, "nonceFunc", js.undefined)
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTimestampSkewSec(value: Double): Self = StObject.set(x, "timestampSkewSec", value.asInstanceOf[js.Any])
      
      inline def setTimestampSkewSecUndefined: Self = StObject.set(x, "timestampSkewSec", js.undefined)
    }
  }
  
  trait AuthenticatedBewit
    extends StObject
       with AuthenticatedMessage {
    
    var bewit: Bewit
  }
  object AuthenticatedBewit {
    
    inline def apply(bewit: Bewit, credentials: Credentials): AuthenticatedBewit = {
      val __obj = js.Dynamic.literal(bewit = bewit.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticatedBewit]
    }
    
    extension [Self <: AuthenticatedBewit](x: Self) {
      
      inline def setBewit(value: Bewit): Self = StObject.set(x, "bewit", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthenticatedMessage extends StObject {
    
    var credentials: Credentials
  }
  object AuthenticatedMessage {
    
    inline def apply(credentials: Credentials): AuthenticatedMessage = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticatedMessage]
    }
    
    extension [Self <: AuthenticatedMessage](x: Self) {
      
      inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    }
  }
  
  trait Authentication extends StObject {
    
    var artifacts: Artifacts
    
    var credentials: Credentials
  }
  object Authentication {
    
    inline def apply(artifacts: Artifacts, credentials: Credentials): Authentication = {
      val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authentication]
    }
    
    extension [Self <: Authentication](x: Self) {
      
      inline def setArtifacts(value: Artifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bewit extends StObject {
    
    var exp: String
    
    var ext: String
    
    var id: String
    
    var mac: String
  }
  object Bewit {
    
    inline def apply(exp: String, ext: String, id: String, mac: String): Bewit = {
      val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bewit]
    }
    
    extension [Self <: Bewit](x: Self) {
      
      inline def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
  
  trait Credentials extends StObject {
    
    var algorithm: sha1 | sha256
    
    var key: String
    
    var user: String
  }
  object Credentials {
    
    inline def apply(algorithm: sha1 | sha256, key: String, user: String): Credentials = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setAlgorithm(value: sha1 | sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  type CredentialsFunc = js.Function1[/* id */ String, js.Promise[Credentials] | Credentials]
  
  trait HeaderOptions extends StObject {
    
    /** Payload content-type (ignored if hash provided) */
    var contentType: js.UndefOr[String] = js.undefined
    
    /** Application specific data sent via the ext attribute */
    var ext: js.UndefOr[String] = js.undefined
    
    /** Pre-calculated payload hash */
    var hash: js.UndefOr[String] = js.undefined
    
    /** UTF-8 encoded string for body hash generation (ignored if hash provided) */
    var payload: js.UndefOr[String] = js.undefined
  }
  object HeaderOptions {
    
    inline def apply(): HeaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderOptions]
    }
    
    extension [Self <: HeaderOptions](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  type NonceFunc = js.Function3[/* key */ String, /* nonce */ String, /* ts */ String, js.Promise[Unit] | Unit]
}
