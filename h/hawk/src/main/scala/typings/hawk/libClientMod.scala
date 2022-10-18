package typings.hawk

import typings.hawk.hawkStrings.sha1
import typings.hawk.hawkStrings.sha256
import typings.hawk.libCryptoMod.Artifacts
import typings.node.httpMod.IncomingMessage
import typings.request.mod.Response
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientMod {
  
  @JSImport("hawk/lib/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[Authentication]
  inline def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Authentication]
  inline def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[Authentication]
  inline def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Authentication]
  
  inline def getBewit(uri: String, options: BewitOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBewit")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def header(uri: String, method: String): Header_ = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(uri.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Header_]
  inline def header(uri: String, method: String, options: HeaderOptions): Header_ = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(uri.asInstanceOf[js.Any], method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Header_]
  
  inline def message(host: String, port: Double, message: String): Message_ = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Message_]
  inline def message(host: String, port: Double, message: String, options: MessageOptions): Message_ = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Message_]
  
  trait AuthenticateOptions extends StObject {
    
    /** optional payload received */
    var payload: js.UndefOr[String] = js.undefined
    
    /** specifies if a Server-Authorization header is required. Defaults to 'false' */
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object AuthenticateOptions {
    
    inline def apply(): AuthenticateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateOptions]
    }
    
    extension [Self <: AuthenticateOptions](x: Self) {
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait Authentication extends StObject {
    
    var headers: Record[String, String]
  }
  object Authentication {
    
    inline def apply(headers: Record[String, String]): Authentication = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authentication]
    }
    
    extension [Self <: Authentication](x: Self) {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait BewitOptions extends StObject {
    
    var credentials: Credentials
    
    /** Application specific data sent via the ext attribute */
    var ext: js.UndefOr[String] = js.undefined
    
    /** Time offset to sync with server time */
    var localtimeOffsetMsec: Double
    
    /** TTL in seconds */
    var ttlSec: Double
  }
  object BewitOptions {
    
    inline def apply(credentials: Credentials, localtimeOffsetMsec: Double, ttlSec: Double): BewitOptions = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], localtimeOffsetMsec = localtimeOffsetMsec.asInstanceOf[js.Any], ttlSec = ttlSec.asInstanceOf[js.Any])
      __obj.asInstanceOf[BewitOptions]
    }
    
    extension [Self <: BewitOptions](x: Self) {
      
      inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      inline def setTtlSec(value: Double): Self = StObject.set(x, "ttlSec", value.asInstanceOf[js.Any])
    }
  }
  
  trait Credentials extends StObject {
    
    var algorithm: sha1 | sha256
    
    var id: String
    
    var key: String
  }
  object Credentials {
    
    inline def apply(algorithm: sha1 | sha256, id: String, key: String): Credentials = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setAlgorithm(value: sha1 | sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeaderOptions extends StObject {
    
    /** Oz application id */
    var app: js.UndefOr[String] = js.undefined
    
    /** Payload content-type (ignored if hash provided) */
    var contentType: js.UndefOr[String] = js.undefined
    
    var credentials: Credentials
    
    /** Oz delegated-by application id */
    var dlg: js.UndefOr[String] = js.undefined
    
    /** Application specific data sent via the ext attribute */
    var ext: js.UndefOr[String] = js.undefined
    
    /** Pre-calculated payload hash */
    var hash: js.UndefOr[String] = js.undefined
    
    /** Time offset to sync with server time (ignored if timestamp provided) */
    var localtimeOffsetMsec: js.UndefOr[Double] = js.undefined
    
    /** A pre-generated nonce */
    var nonce: js.UndefOr[String] = js.undefined
    
    /** UTF-8 encoded string for body hash generation (ignored if hash provided) */
    var payload: js.UndefOr[String] = js.undefined
    
    /** A pre-calculated timestamp in seconds */
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object HeaderOptions {
    
    inline def apply(credentials: Credentials): HeaderOptions = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderOptions]
    }
    
    extension [Self <: HeaderOptions](x: Self) {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setDlg(value: String): Self = StObject.set(x, "dlg", value.asInstanceOf[js.Any])
      
      inline def setDlgUndefined: Self = StObject.set(x, "dlg", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      inline def setLocaltimeOffsetMsecUndefined: Self = StObject.set(x, "localtimeOffsetMsec", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait Header_ extends StObject {
    
    var artifacts: Artifacts
    
    var header: String
  }
  object Header_ {
    
    inline def apply(artifacts: Artifacts, header: String): Header_ = {
      val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header_]
    }
    
    extension [Self <: Header_](x: Self) {
      
      inline def setArtifacts(value: Artifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageOptions extends StObject {
    
    var credentials: Credentials
    
    /** Time offset to sync with server time (ignored if timestamp provided) */
    var localtimeOffsetMsec: Double
    
    /** A pre-generated nonce */
    var nonce: String
    
    /** A pre-calculated timestamp in seconds */
    var timestamp: Double
  }
  object MessageOptions {
    
    inline def apply(credentials: Credentials, localtimeOffsetMsec: Double, nonce: String, timestamp: Double): MessageOptions = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], localtimeOffsetMsec = localtimeOffsetMsec.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageOptions]
    }
    
    extension [Self <: MessageOptions](x: Self) {
      
      inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message_ extends StObject {
    
    var hash: String
    
    var id: String
    
    var mac: String
    
    var nonce: String
    
    var ts: String
  }
  object Message_ {
    
    inline def apply(hash: String, id: String, mac: String, nonce: String, ts: String): Message_ = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message_]
    }
    
    extension [Self <: Message_](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setTs(value: String): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    }
  }
}
