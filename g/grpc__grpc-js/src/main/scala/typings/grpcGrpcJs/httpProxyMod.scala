package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import typings.grpcGrpcJs.uriParserMod.GrpcUri
import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpProxyMod {
  
  @JSImport("@grpc/grpc-js/build/src/http_proxy", "getProxiedConnection")
  @js.native
  def getProxiedConnection(address: SubchannelAddress, channelOptions: ChannelOptions, connectionOptions: ConnectionOptions): js.Promise[ProxyConnectionResult] = js.native
  
  @JSImport("@grpc/grpc-js/build/src/http_proxy", "mapProxyName")
  @js.native
  def mapProxyName(target: GrpcUri, options: ChannelOptions): ProxyMapResult = js.native
  
  @js.native
  trait ProxyConnectionResult extends StObject {
    
    var realTarget: js.UndefOr[GrpcUri] = js.native
    
    var socket: js.UndefOr[Socket] = js.native
  }
  object ProxyConnectionResult {
    
    @scala.inline
    def apply(): ProxyConnectionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyConnectionResult]
    }
    
    @scala.inline
    implicit class ProxyConnectionResultMutableBuilder[Self <: ProxyConnectionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRealTarget(value: GrpcUri): Self = StObject.set(x, "realTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealTargetUndefined: Self = StObject.set(x, "realTarget", js.undefined)
      
      @scala.inline
      def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  @js.native
  trait ProxyMapResult extends StObject {
    
    var extraOptions: ChannelOptions = js.native
    
    var target: GrpcUri = js.native
  }
  object ProxyMapResult {
    
    @scala.inline
    def apply(extraOptions: ChannelOptions, target: GrpcUri): ProxyMapResult = {
      val __obj = js.Dynamic.literal(extraOptions = extraOptions.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyMapResult]
    }
    
    @scala.inline
    implicit class ProxyMapResultMutableBuilder[Self <: ProxyMapResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraOptions(value: ChannelOptions): Self = StObject.set(x, "extraOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: GrpcUri): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
