package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uriParserMod {
  
  @JSImport("@grpc/grpc-js/build/src/uri-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseUri(uriString: String): GrpcUri | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUri")(uriString.asInstanceOf[js.Any]).asInstanceOf[GrpcUri | Null]
  
  @scala.inline
  def splitHostPort(path: String): HostPort | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("splitHostPort")(path.asInstanceOf[js.Any]).asInstanceOf[HostPort | Null]
  
  @scala.inline
  def uriToString(uri: GrpcUri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uriToString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait GrpcUri extends StObject {
    
    var authority: js.UndefOr[String] = js.undefined
    
    var path: String
    
    var scheme: js.UndefOr[String] = js.undefined
  }
  object GrpcUri {
    
    @scala.inline
    def apply(path: String): GrpcUri = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrpcUri]
    }
    
    @scala.inline
    implicit class GrpcUriMutableBuilder[Self <: GrpcUri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
  
  trait HostPort extends StObject {
    
    var host: String
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object HostPort {
    
    @scala.inline
    def apply(host: String): HostPort = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostPort]
    }
    
    @scala.inline
    implicit class HostPortMutableBuilder[Self <: HostPort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
