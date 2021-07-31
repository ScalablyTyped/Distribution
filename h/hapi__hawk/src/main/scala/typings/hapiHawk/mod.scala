package typings.hapiHawk

import typings.hapiBoom.mod.Boom
import typings.hapiBoom.mod.unauthorized.Attributes
import typings.hapiBoom.mod.unauthorized.MissingAuth
import typings.hapiHapi.mod.Server_
import typings.hapiHawk.clientMod.AuthenticateOptions
import typings.hapiHawk.clientMod.Authentication
import typings.hapiHawk.clientMod.BewitOptions
import typings.hapiHawk.clientMod.Credentials
import typings.hapiHawk.clientMod.HeaderOptions
import typings.hapiHawk.clientMod.Header_
import typings.hapiHawk.clientMod.MessageOptions
import typings.hapiHawk.clientMod.Message_
import typings.hapiHawk.cryptoMod.Artifacts
import typings.hapiHawk.cryptoMod.TimestampMessage_
import typings.hapiHawk.serverMod.AuthenticateBewitOptions
import typings.hapiHawk.serverMod.AuthenticateMessageOptions
import typings.hapiHawk.serverMod.AuthenticatedBewit
import typings.hapiHawk.serverMod.AuthenticatedMessage
import typings.hapiHawk.serverMod.CredentialsFunc
import typings.hapiHawk.utilsMod.CustomRequest
import typings.hapiHawk.utilsMod.Host
import typings.hapiHawk.utilsMod.ParseRequestOptions
import typings.hapiSntp.mod.Options
import typings.hapiSntp.mod.TimeOptions
import typings.node.cryptoMod.Hash
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.request.mod.Response
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object client {
    
    @JSImport("@hapi/hawk", "client")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[Authentication]
    @scala.inline
    def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Authentication]
    @scala.inline
    def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[Authentication]
    @scala.inline
    def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Authentication]
    
    @scala.inline
    def getBewit(uri: String, options: BewitOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBewit")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def header(uri: String, method: String): Header_ = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(uri.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Header_]
    @scala.inline
    def header(uri: String, method: String, options: HeaderOptions): Header_ = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(uri.asInstanceOf[js.Any], method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Header_]
    
    @scala.inline
    def message(host: String, port: Double, message: String): Message_ = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Message_]
    @scala.inline
    def message(host: String, port: Double, message: String, options: MessageOptions): Message_ = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Message_]
  }
  
  object crypto {
    
    @JSImport("@hapi/hawk", "crypto")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@hapi/hawk", "crypto.algorithms")
    @js.native
    val algorithms: js.Array[String] = js.native
    
    @scala.inline
    def calculateMac(`type`: String, credentials: Credentials, options: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateMac")(`type`.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def calculatePayloadHash(payload: String, algorithm: String, contentType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePayloadHash")(payload.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def calculateTsMac(ts: String, credentials: Credentials): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateTsMac")(ts.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def finalizePayloadHash(hash: Hash): String = ^.asInstanceOf[js.Dynamic].applyDynamic("finalizePayloadHash")(hash.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def generateNormalizedString(`type`: String, options: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateNormalizedString")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@hapi/hawk", "crypto.headerVersion")
    @js.native
    val headerVersion: String = js.native
    
    @scala.inline
    def initializePayloadHash(algorithm: String, contentType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("initializePayloadHash")(algorithm.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def timestampMessage(credentials: Credentials, localtimeOffsetMsec: Double): TimestampMessage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timestampMessage")(credentials.asInstanceOf[js.Any], localtimeOffsetMsec.asInstanceOf[js.Any])).asInstanceOf[TimestampMessage_]
  }
  
  object plugin {
    
    object plugin {
      
      @JSImport("@hapi/hawk", "plugin.plugin")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@hapi/hawk", "plugin.plugin.pkg")
      @js.native
      val pkg: Record[String, js.Any] = js.native
      
      @scala.inline
      def register(server: Server_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(server.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSImport("@hapi/hawk", "plugin.plugin.requirements")
      @js.native
      val requirements: Record[String, String] = js.native
    }
  }
  
  object server {
    
    @JSImport("@hapi/hawk", "server")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): js.Promise[typings.hapiHawk.serverMod.Authentication] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.hapiHawk.serverMod.Authentication]]
    @scala.inline
    def authenticate(
      req: IncomingMessage,
      credentialsFunc: CredentialsFunc,
      options: typings.hapiHawk.serverMod.AuthenticateOptions
    ): js.Promise[typings.hapiHawk.serverMod.Authentication] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.hapiHawk.serverMod.Authentication]]
    
    @scala.inline
    def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc): AuthenticatedBewit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateBewit")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any])).asInstanceOf[AuthenticatedBewit]
    @scala.inline
    def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): AuthenticatedBewit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateBewit")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AuthenticatedBewit]
    
    @scala.inline
    def authenticateMessage(
      host: String,
      port: Double,
      message: String,
      authorization: Message_,
      credentialsFunc: CredentialsFunc,
      options: AuthenticateMessageOptions
    ): js.Promise[AuthenticatedMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateMessage")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], message.asInstanceOf[js.Any], authorization.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticatedMessage]]
    
    @scala.inline
    def authenticatePayload(
      payload: String,
      credentials: typings.hapiHawk.serverMod.Credentials,
      artifacts: Artifacts,
      contentType: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatePayload")(payload.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def authenticatePayloadHash(calculatedHash: String, artifacts: Artifacts): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatePayloadHash")(calculatedHash.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def header(credentials: typings.hapiHawk.serverMod.Credentials, artifacts: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def header(
      credentials: typings.hapiHawk.serverMod.Credentials,
      artifacts: Artifacts,
      options: typings.hapiHawk.serverMod.HeaderOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object sntp {
    
    @JSImport("@hapi/hawk", "sntp")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    
    @scala.inline
    def offset(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[js.Promise[Double]]
    
    @scala.inline
    def start(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def start(options: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
    
    @scala.inline
    def time(): js.Promise[TimeOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[js.Promise[TimeOptions]]
    @scala.inline
    def time(options: Options): js.Promise[TimeOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TimeOptions]]
  }
  
  object uri {
    
    @JSImport("@hapi/hawk", "uri")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof server.authenticateBewit` */
    @scala.inline
    def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): AuthenticatedBewit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any])).asInstanceOf[AuthenticatedBewit]
    @scala.inline
    def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): AuthenticatedBewit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AuthenticatedBewit]
    
    /* was `typeof client.getBewit` */
    @scala.inline
    def getBewit(uri: String, options: BewitOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBewit")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object utils {
    
    @JSImport("@hapi/hawk", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    object limits {
      
      @JSImport("@hapi/hawk", "utils.limits")
      @js.native
      val ^ : js.Any = js.native
      
      /** Limit the length of uris and headers to avoid a DoS attack on string matching */
      @JSImport("@hapi/hawk", "utils.limits.maxMatchLength")
      @js.native
      def maxMatchLength: Double = js.native
      @scala.inline
      def maxMatchLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxMatchLength")(x.asInstanceOf[js.Any])
    }
    
    @scala.inline
    def now(localtimeOffsetMsec: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(localtimeOffsetMsec.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def nowSecs(localtimeOffsetMsec: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nowSecs")(localtimeOffsetMsec.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def parseAuthorizationHeader(header: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAuthorizationHeader")(header.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
    @scala.inline
    def parseAuthorizationHeader(header: String, keys: js.Array[String]): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAuthorizationHeader")(header.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
    
    @scala.inline
    def parseContentType(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentType")().asInstanceOf[String]
    @scala.inline
    def parseContentType(header: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentType")(header.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def parseHost(req: RequestOptions): Host | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any]).asInstanceOf[Host | Null]
    @scala.inline
    def parseHost(req: RequestOptions, hostHeaderName: String): Host | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any], hostHeaderName.asInstanceOf[js.Any])).asInstanceOf[Host | Null]
    @scala.inline
    def parseHost(req: typings.node.httpsMod.RequestOptions): Host | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any]).asInstanceOf[Host | Null]
    @scala.inline
    def parseHost(req: typings.node.httpsMod.RequestOptions, hostHeaderName: String): Host | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any], hostHeaderName.asInstanceOf[js.Any])).asInstanceOf[Host | Null]
    
    @scala.inline
    def parseRequest(req: RequestOptions): CustomRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any]).asInstanceOf[CustomRequest]
    @scala.inline
    def parseRequest(req: RequestOptions, options: ParseRequestOptions): CustomRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CustomRequest]
    @scala.inline
    def parseRequest(req: typings.node.httpsMod.RequestOptions): CustomRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any]).asInstanceOf[CustomRequest]
    @scala.inline
    def parseRequest(req: typings.node.httpsMod.RequestOptions, options: ParseRequestOptions): CustomRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CustomRequest]
    
    @scala.inline
    def unauthorized(): Boom[js.Any] & MissingAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")().asInstanceOf[Boom[js.Any] & MissingAuth]
    @scala.inline
    def unauthorized(message: String): Boom[js.Any] & MissingAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[js.Any] & MissingAuth]
    @scala.inline
    def unauthorized(message: String, attributes: String): Boom[js.Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[js.Any] & MissingAuth]
    @scala.inline
    def unauthorized(message: String, attributes: Attributes): Boom[js.Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[js.Any] & MissingAuth]
    @scala.inline
    def unauthorized(message: Unit, attributes: String): Boom[js.Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[js.Any] & MissingAuth]
    @scala.inline
    def unauthorized(message: Unit, attributes: Attributes): Boom[js.Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[js.Any] & MissingAuth]
    
    @JSImport("@hapi/hawk", "utils.version")
    @js.native
    val version: String = js.native
  }
}
