package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUriParserMod {
  
  @JSImport("@grpc/grpc-js/build/src/uri-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseUri(uriString: String): GrpcUri | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUri")(uriString.asInstanceOf[js.Any]).asInstanceOf[GrpcUri | Null]
  
  inline def splitHostPort(path: String): HostPort | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("splitHostPort")(path.asInstanceOf[js.Any]).asInstanceOf[HostPort | Null]
  
  inline def uriToString(uri: GrpcUri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uriToString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait GrpcUri extends StObject {
    
    var authority: js.UndefOr[String] = js.undefined
    
    var path: String
    
    var scheme: js.UndefOr[String] = js.undefined
  }
  object GrpcUri {
    
    inline def apply(path: String): GrpcUri = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrpcUri]
    }
    
    extension [Self <: GrpcUri](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
  
  trait HostPort extends StObject {
    
    var host: String
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object HostPort {
    
    inline def apply(host: String): HostPort = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostPort]
    }
    
    extension [Self <: HostPort](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
