package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverDnsMod {
  
  @JSImport("@grpc/grpc-js/build/src/resolver-dns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
  
  trait DnsUrl extends StObject {
    
    var host: String
    
    var port: js.UndefOr[String] = js.undefined
  }
  object DnsUrl {
    
    inline def apply(host: String): DnsUrl = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnsUrl]
    }
    
    extension [Self <: DnsUrl](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
