package typings.hawk

import typings.hapiBoom.mod.Boom
import typings.hapiBoom.mod.unauthorized.Attributes
import typings.hapiBoom.mod.unauthorized.MissingAuth
import typings.hawk.libClientMod.AuthenticateOptions
import typings.hawk.libClientMod.Authentication
import typings.hawk.libClientMod.BewitOptions
import typings.hawk.libClientMod.Credentials
import typings.hawk.libClientMod.HeaderOptions
import typings.hawk.libClientMod.Header_
import typings.hawk.libClientMod.MessageOptions
import typings.hawk.libClientMod.Message_
import typings.hawk.libCryptoMod.Artifacts
import typings.hawk.libCryptoMod.TimestampMessage_
import typings.hawk.libServerMod.AuthenticateBewitOptions
import typings.hawk.libServerMod.AuthenticateMessageOptions
import typings.hawk.libServerMod.AuthenticatedBewit
import typings.hawk.libServerMod.AuthenticatedMessage
import typings.hawk.libServerMod.CredentialsFunc
import typings.hawk.libUtilsMod.CustomRequest
import typings.hawk.libUtilsMod.Host
import typings.hawk.libUtilsMod.ParseRequestOptions
import typings.node.cryptoMod.Hash
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.request.mod.Response
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object hawk {
    
    object client {
      
      @JSGlobal("hawk.client")
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
    }
    
    object crypto {
      
      @JSGlobal("hawk.crypto")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("hawk.crypto.algorithms")
      @js.native
      val algorithms: js.Array[String] = js.native
      
      inline def calculateMac(`type`: String, credentials: Credentials, options: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateMac")(`type`.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def calculatePayloadHash(payload: String, algorithm: String, contentType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePayloadHash")(payload.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def calculateTsMac(ts: String, credentials: Credentials): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateTsMac")(ts.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def finalizePayloadHash(hash: Hash): String = ^.asInstanceOf[js.Dynamic].applyDynamic("finalizePayloadHash")(hash.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def generateNormalizedString(`type`: String, options: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateNormalizedString")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
      
      @JSGlobal("hawk.crypto.headerVersion")
      @js.native
      val headerVersion: String = js.native
      
      inline def initializePayloadHash(algorithm: String, contentType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("initializePayloadHash")(algorithm.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def timestampMessage(credentials: Credentials, localtimeOffsetMsec: Double): TimestampMessage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timestampMessage")(credentials.asInstanceOf[js.Any], localtimeOffsetMsec.asInstanceOf[js.Any])).asInstanceOf[TimestampMessage_]
    }
    
    object server {
      
      @JSGlobal("hawk.server")
      @js.native
      val ^ : js.Any = js.native
      
      inline def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): js.Promise[typings.hawk.libServerMod.Authentication] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.hawk.libServerMod.Authentication]]
      inline def authenticate(
        req: IncomingMessage,
        credentialsFunc: CredentialsFunc,
        options: typings.hawk.libServerMod.AuthenticateOptions
      ): js.Promise[typings.hawk.libServerMod.Authentication] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.hawk.libServerMod.Authentication]]
      
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
      
      inline def authenticatePayload(
        payload: String,
        credentials: typings.hawk.libServerMod.Credentials,
        artifacts: Artifacts,
        contentType: String
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatePayload")(payload.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def authenticatePayloadHash(calculatedHash: String, artifacts: Artifacts): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatePayloadHash")(calculatedHash.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def header(credentials: typings.hawk.libServerMod.Credentials, artifacts: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[String]
      inline def header(
        credentials: typings.hawk.libServerMod.Credentials,
        artifacts: Artifacts,
        options: typings.hawk.libServerMod.HeaderOptions
      ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    }
    
    object uri {
      
      @JSGlobal("hawk.uri")
      @js.native
      val ^ : js.Any = js.native
      
      /* was `typeof server.authenticateBewit` */
      inline def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): js.Promise[AuthenticatedBewit] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticatedBewit]]
      inline def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): js.Promise[AuthenticatedBewit] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticatedBewit]]
      
      /* was `typeof client.getBewit` */
      inline def getBewit(uri: String, options: BewitOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBewit")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    }
    
    object utils {
      
      @JSGlobal("hawk.utils")
      @js.native
      val ^ : js.Any = js.native
      
      object limits {
        
        @JSGlobal("hawk.utils.limits")
        @js.native
        val ^ : js.Any = js.native
        
        /** Limit the length of uris and headers to avoid a DoS attack on string matching */
        @JSGlobal("hawk.utils.limits.maxMatchLength")
        @js.native
        def maxMatchLength: Double = js.native
        inline def maxMatchLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxMatchLength")(x.asInstanceOf[js.Any])
      }
      
      inline def now(localtimeOffsetMsec: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(localtimeOffsetMsec.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def nowSecs(localtimeOffsetMsec: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nowSecs")(localtimeOffsetMsec.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def parseAuthorizationHeader(header: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAuthorizationHeader")(header.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
      inline def parseAuthorizationHeader(header: String, keys: js.Array[String]): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAuthorizationHeader")(header.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
      
      inline def parseContentType(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentType")().asInstanceOf[String]
      inline def parseContentType(header: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentType")(header.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def parseHost(req: RequestOptions): Host | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any]).asInstanceOf[Host | Null]
      inline def parseHost(req: RequestOptions, hostHeaderName: String): Host | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any], hostHeaderName.asInstanceOf[js.Any])).asInstanceOf[Host | Null]
      inline def parseHost(req: typings.node.httpsMod.RequestOptions): Host | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any]).asInstanceOf[Host | Null]
      inline def parseHost(req: typings.node.httpsMod.RequestOptions, hostHeaderName: String): Host | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any], hostHeaderName.asInstanceOf[js.Any])).asInstanceOf[Host | Null]
      
      inline def parseRequest(req: RequestOptions): CustomRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any]).asInstanceOf[CustomRequest]
      inline def parseRequest(req: RequestOptions, options: ParseRequestOptions): CustomRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CustomRequest]
      inline def parseRequest(req: typings.node.httpsMod.RequestOptions): CustomRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any]).asInstanceOf[CustomRequest]
      inline def parseRequest(req: typings.node.httpsMod.RequestOptions, options: ParseRequestOptions): CustomRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CustomRequest]
      
      inline def setTimeFunction(fn: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeFunction")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def unauthorized(): Boom[Any] & MissingAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")().asInstanceOf[Boom[Any] & MissingAuth]
      inline def unauthorized(message: String): Boom[Any] & MissingAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Any] & MissingAuth]
      inline def unauthorized(message: String, attributes: String): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
      inline def unauthorized(message: String, attributes: Attributes): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
      inline def unauthorized(message: Unit, attributes: String): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
      inline def unauthorized(message: Unit, attributes: Attributes): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
      
      @JSGlobal("hawk.utils.version")
      @js.native
      val version: String = js.native
    }
  }
}
