package typings.hapiHawk

import typings.hapiBoom.mod.Boom
import typings.hapiBoom.mod.unauthorized.Attributes
import typings.hapiBoom.mod.unauthorized.MissingAuth
import typings.node.httpMod.RequestOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object limits {
    
    @JSImport("@hapi/hawk/lib/utils", "limits")
    @js.native
    val ^ : js.Any = js.native
    
    /** Limit the length of uris and headers to avoid a DoS attack on string matching */
    @JSImport("@hapi/hawk/lib/utils", "limits.maxMatchLength")
    @js.native
    def maxMatchLength: Double = js.native
    @scala.inline
    def maxMatchLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxMatchLength")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@hapi/hawk/lib/utils", "now")
  @js.native
  def now(localtimeOffsetMsec: Double): Double = js.native
  
  @JSImport("@hapi/hawk/lib/utils", "nowSecs")
  @js.native
  def nowSecs(localtimeOffsetMsec: Double): Double = js.native
  
  @JSImport("@hapi/hawk/lib/utils", "parseAuthorizationHeader")
  @js.native
  def parseAuthorizationHeader(header: String): Record[String, String] = js.native
  @JSImport("@hapi/hawk/lib/utils", "parseAuthorizationHeader")
  @js.native
  def parseAuthorizationHeader(header: String, keys: js.Array[String]): Record[String, String] = js.native
  
  @JSImport("@hapi/hawk/lib/utils", "parseContentType")
  @js.native
  def parseContentType(): String = js.native
  @JSImport("@hapi/hawk/lib/utils", "parseContentType")
  @js.native
  def parseContentType(header: String): String = js.native
  
  @JSImport("@hapi/hawk/lib/utils", "parseHost")
  @js.native
  def parseHost(req: RequestOptions): Host | Null = js.native
  @JSImport("@hapi/hawk/lib/utils", "parseHost")
  @js.native
  def parseHost(req: RequestOptions, hostHeaderName: String): Host | Null = js.native
  @JSImport("@hapi/hawk/lib/utils", "parseHost")
  @js.native
  def parseHost(req: typings.node.httpsMod.RequestOptions): Host | Null = js.native
  @JSImport("@hapi/hawk/lib/utils", "parseHost")
  @js.native
  def parseHost(req: typings.node.httpsMod.RequestOptions, hostHeaderName: String): Host | Null = js.native
  
  @JSImport("@hapi/hawk/lib/utils", "parseRequest")
  @js.native
  def parseRequest(req: RequestOptions): CustomRequest = js.native
  @JSImport("@hapi/hawk/lib/utils", "parseRequest")
  @js.native
  def parseRequest(req: RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
  @JSImport("@hapi/hawk/lib/utils", "parseRequest")
  @js.native
  def parseRequest(req: typings.node.httpsMod.RequestOptions): CustomRequest = js.native
  @JSImport("@hapi/hawk/lib/utils", "parseRequest")
  @js.native
  def parseRequest(req: typings.node.httpsMod.RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
  
  @JSImport("@hapi/hawk/lib/utils", "unauthorized")
  @js.native
  def unauthorized(): Boom[_] with MissingAuth = js.native
  @JSImport("@hapi/hawk/lib/utils", "unauthorized")
  @js.native
  def unauthorized(message: js.UndefOr[scala.Nothing], attributes: String): Boom[_] with MissingAuth = js.native
  @JSImport("@hapi/hawk/lib/utils", "unauthorized")
  @js.native
  def unauthorized(message: js.UndefOr[scala.Nothing], attributes: Attributes): Boom[_] with MissingAuth = js.native
  @JSImport("@hapi/hawk/lib/utils", "unauthorized")
  @js.native
  def unauthorized(message: String): Boom[_] with MissingAuth = js.native
  @JSImport("@hapi/hawk/lib/utils", "unauthorized")
  @js.native
  def unauthorized(message: String, attributes: String): Boom[_] with MissingAuth = js.native
  @JSImport("@hapi/hawk/lib/utils", "unauthorized")
  @js.native
  def unauthorized(message: String, attributes: Attributes): Boom[_] with MissingAuth = js.native
  
  @JSImport("@hapi/hawk/lib/utils", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait CustomRequest extends StObject {
    
    var authorization: String = js.native
    
    var contentType: String = js.native
    
    var host: String = js.native
    
    var method: String = js.native
    
    var port: Double = js.native
    
    var url: String = js.native
  }
  object CustomRequest {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CustomRequestMutableBuilder[Self <: CustomRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var name: String = js.native
    
    var port: Double = js.native
  }
  object Host {
    
    @scala.inline
    def apply(name: String, port: Double): Host = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseRequestOptions extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var hostHeaderName: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
  }
  object ParseRequestOptions {
    
    @scala.inline
    def apply(): ParseRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseRequestOptions]
    }
    
    @scala.inline
    implicit class ParseRequestOptionsMutableBuilder[Self <: ParseRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostHeaderName(value: String): Self = StObject.set(x, "hostHeaderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostHeaderNameUndefined: Self = StObject.set(x, "hostHeaderName", js.undefined)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
