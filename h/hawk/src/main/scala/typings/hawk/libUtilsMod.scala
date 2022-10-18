package typings.hawk

import typings.hapiBoom.mod.Boom
import typings.hapiBoom.mod.unauthorized.Attributes
import typings.hapiBoom.mod.unauthorized.MissingAuth
import typings.node.httpMod.RequestOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("hawk/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object limits {
    
    @JSImport("hawk/lib/utils", "limits")
    @js.native
    val ^ : js.Any = js.native
    
    /** Limit the length of uris and headers to avoid a DoS attack on string matching */
    @JSImport("hawk/lib/utils", "limits.maxMatchLength")
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
  
  inline def unauthorized(): Boom[Any] & MissingAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")().asInstanceOf[Boom[Any] & MissingAuth]
  inline def unauthorized(message: String): Boom[Any] & MissingAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Any] & MissingAuth]
  inline def unauthorized(message: String, attributes: String): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
  inline def unauthorized(message: String, attributes: Attributes): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
  inline def unauthorized(message: Unit, attributes: String): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
  inline def unauthorized(message: Unit, attributes: Attributes): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
  
  @JSImport("hawk/lib/utils", "version")
  @js.native
  val version: String = js.native
  
  trait CustomRequest extends StObject {
    
    var authorization: String
    
    var contentType: String
    
    var host: String
    
    var method: String
    
    var port: Double
    
    var url: String
  }
  object CustomRequest {
    
    inline def apply(
      authorization: String,
      contentType: String,
      host: String,
      method: String,
      port: Double,
      url: String
    ): CustomRequest = {
      val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomRequest]
    }
    
    extension [Self <: CustomRequest](x: Self) {
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var name: String
    
    var port: Double
  }
  object Host {
    
    inline def apply(name: String, port: Double): Host = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseRequestOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostHeaderName: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object ParseRequestOptions {
    
    inline def apply(): ParseRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseRequestOptions]
    }
    
    extension [Self <: ParseRequestOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostHeaderName(value: String): Self = StObject.set(x, "hostHeaderName", value.asInstanceOf[js.Any])
      
      inline def setHostHeaderNameUndefined: Self = StObject.set(x, "hostHeaderName", js.undefined)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
