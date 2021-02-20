package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverDnsMod {
  
  @JSImport("@grpc/grpc-js/build/src/resolver-dns", "setup")
  @js.native
  def setup(): Unit = js.native
  
  @js.native
  trait DnsUrl extends StObject {
    
    var host: String = js.native
    
    var port: js.UndefOr[String] = js.native
  }
  object DnsUrl {
    
    @scala.inline
    def apply(host: String): DnsUrl = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnsUrl]
    }
    
    @scala.inline
    implicit class DnsUrlMutableBuilder[Self <: DnsUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
