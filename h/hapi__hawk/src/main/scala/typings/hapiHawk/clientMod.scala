package typings.hapiHawk

import typings.hapiHawk.cryptoMod.Artifacts
import typings.hapiHawk.hapiHawkStrings.sha1
import typings.hapiHawk.hapiHawkStrings.sha256
import typings.node.httpMod.IncomingMessage
import typings.request.mod.Response
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("@hapi/hawk/lib/client", "authenticate")
  @js.native
  def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts): Authentication = js.native
  @JSImport("@hapi/hawk/lib/client", "authenticate")
  @js.native
  def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = js.native
  @JSImport("@hapi/hawk/lib/client", "authenticate")
  @js.native
  def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts): Authentication = js.native
  @JSImport("@hapi/hawk/lib/client", "authenticate")
  @js.native
  def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = js.native
  
  @JSImport("@hapi/hawk/lib/client", "getBewit")
  @js.native
  def getBewit(uri: String, options: BewitOptions): String = js.native
  
  @JSImport("@hapi/hawk/lib/client", "header")
  @js.native
  def header(uri: String, method: String): Header_ = js.native
  @JSImport("@hapi/hawk/lib/client", "header")
  @js.native
  def header(uri: String, method: String, options: HeaderOptions): Header_ = js.native
  
  @JSImport("@hapi/hawk/lib/client", "message")
  @js.native
  def message(host: String, port: Double, message: String): Message_ = js.native
  @JSImport("@hapi/hawk/lib/client", "message")
  @js.native
  def message(host: String, port: Double, message: String, options: MessageOptions): Message_ = js.native
  
  @js.native
  trait AuthenticateOptions extends StObject {
    
    /** optional payload received */
    var payload: js.UndefOr[String] = js.native
    
    /** specifies if a Server-Authorization header is required. Defaults to 'false' */
    var required: js.UndefOr[Boolean] = js.native
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
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  @js.native
  trait Authentication extends StObject {
    
    var headers: Record[String, String] = js.native
  }
  object Authentication {
    
    @scala.inline
    def apply(headers: Record[String, String]): Authentication = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authentication]
    }
    
    @scala.inline
    implicit class AuthenticationMutableBuilder[Self <: Authentication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BewitOptions extends StObject {
    
    var credentials: Credentials = js.native
    
    /** Application specific data sent via the ext attribute */
    var ext: js.UndefOr[String] = js.native
    
    /** Time offset to sync with server time */
    var localtimeOffsetMsec: Double = js.native
    
    /** TTL in seconds */
    var ttlSec: Double = js.native
  }
  object BewitOptions {
    
    @scala.inline
    def apply(credentials: Credentials, localtimeOffsetMsec: Double, ttlSec: Double): BewitOptions = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], localtimeOffsetMsec = localtimeOffsetMsec.asInstanceOf[js.Any], ttlSec = ttlSec.asInstanceOf[js.Any])
      __obj.asInstanceOf[BewitOptions]
    }
    
    @scala.inline
    implicit class BewitOptionsMutableBuilder[Self <: BewitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlSec(value: Double): Self = StObject.set(x, "ttlSec", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Credentials extends StObject {
    
    var algorithm: sha1 | sha256 = js.native
    
    var id: String = js.native
    
    var key: String = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(algorithm: sha1 | sha256, id: String, key: String): Credentials = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: sha1 | sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HeaderOptions extends StObject {
    
    /** Oz application id */
    var app: js.UndefOr[String] = js.native
    
    /** Payload content-type (ignored if hash provided) */
    var contentType: js.UndefOr[String] = js.native
    
    var credentials: Credentials = js.native
    
    /** Oz delegated-by application id */
    var dlg: js.UndefOr[String] = js.native
    
    /** Application specific data sent via the ext attribute */
    var ext: js.UndefOr[String] = js.native
    
    /** Pre-calculated payload hash */
    var hash: js.UndefOr[String] = js.native
    
    /** Time offset to sync with server time (ignored if timestamp provided) */
    var localtimeOffsetMsec: js.UndefOr[Double] = js.native
    
    /** A pre-generated nonce */
    var nonce: js.UndefOr[String] = js.native
    
    /** UTF-8 encoded string for body hash generation (ignored if hash provided) */
    var payload: js.UndefOr[String] = js.native
    
    /** A pre-calculated timestamp in seconds */
    var timestamp: js.UndefOr[Double] = js.native
  }
  object HeaderOptions {
    
    @scala.inline
    def apply(credentials: Credentials): HeaderOptions = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderOptions]
    }
    
    @scala.inline
    implicit class HeaderOptionsMutableBuilder[Self <: HeaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDlg(value: String): Self = StObject.set(x, "dlg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDlgUndefined: Self = StObject.set(x, "dlg", js.undefined)
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaltimeOffsetMsecUndefined: Self = StObject.set(x, "localtimeOffsetMsec", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  @js.native
  trait Header_ extends StObject {
    
    var artifacts: Artifacts = js.native
    
    var header: String = js.native
  }
  object Header_ {
    
    @scala.inline
    def apply(artifacts: Artifacts, header: String): Header_ = {
      val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header_]
    }
    
    @scala.inline
    implicit class Header_MutableBuilder[Self <: Header_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtifacts(value: Artifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageOptions extends StObject {
    
    var credentials: Credentials = js.native
    
    /** Time offset to sync with server time (ignored if timestamp provided) */
    var localtimeOffsetMsec: Double = js.native
    
    /** A pre-generated nonce */
    var nonce: String = js.native
    
    /** A pre-calculated timestamp in seconds */
    var timestamp: Double = js.native
  }
  object MessageOptions {
    
    @scala.inline
    def apply(credentials: Credentials, localtimeOffsetMsec: Double, nonce: String, timestamp: Double): MessageOptions = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], localtimeOffsetMsec = localtimeOffsetMsec.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageOptions]
    }
    
    @scala.inline
    implicit class MessageOptionsMutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Message_ extends StObject {
    
    var hash: String = js.native
    
    var id: String = js.native
    
    var mac: String = js.native
    
    var nonce: String = js.native
    
    var ts: String = js.native
  }
  object Message_ {
    
    @scala.inline
    def apply(hash: String, id: String, mac: String, nonce: String, ts: String): Message_ = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message_]
    }
    
    @scala.inline
    implicit class Message_MutableBuilder[Self <: Message_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTs(value: String): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    }
  }
}
