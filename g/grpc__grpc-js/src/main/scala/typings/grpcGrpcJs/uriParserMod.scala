package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uriParserMod {
  
  @JSImport("@grpc/grpc-js/build/src/uri-parser", "parseUri")
  @js.native
  def parseUri(uriString: String): GrpcUri | Null = js.native
  
  @JSImport("@grpc/grpc-js/build/src/uri-parser", "splitHostPort")
  @js.native
  def splitHostPort(path: String): HostPort | Null = js.native
  
  @JSImport("@grpc/grpc-js/build/src/uri-parser", "uriToString")
  @js.native
  def uriToString(uri: GrpcUri): String = js.native
  
  @js.native
  trait GrpcUri extends StObject {
    
    var authority: js.UndefOr[String] = js.native
    
    var path: String = js.native
    
    var scheme: js.UndefOr[String] = js.native
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
  
  @js.native
  trait HostPort extends StObject {
    
    var host: String = js.native
    
    var port: js.UndefOr[Double] = js.native
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
