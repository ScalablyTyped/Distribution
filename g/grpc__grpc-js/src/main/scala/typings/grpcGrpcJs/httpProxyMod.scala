package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import typings.grpcGrpcJs.uriParserMod.GrpcUri
import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpProxyMod {
  
  @JSImport("@grpc/grpc-js/build/src/http_proxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProxiedConnection(address: SubchannelAddress, channelOptions: ChannelOptions, connectionOptions: ConnectionOptions): js.Promise[ProxyConnectionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProxiedConnection")(address.asInstanceOf[js.Any], channelOptions.asInstanceOf[js.Any], connectionOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProxyConnectionResult]]
  
  inline def mapProxyName(target: GrpcUri, options: ChannelOptions): ProxyMapResult = (^.asInstanceOf[js.Dynamic].applyDynamic("mapProxyName")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProxyMapResult]
  
  trait ProxyConnectionResult extends StObject {
    
    var realTarget: js.UndefOr[GrpcUri] = js.undefined
    
    var socket: js.UndefOr[Socket] = js.undefined
  }
  object ProxyConnectionResult {
    
    inline def apply(): ProxyConnectionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyConnectionResult]
    }
    
    extension [Self <: ProxyConnectionResult](x: Self) {
      
      inline def setRealTarget(value: GrpcUri): Self = StObject.set(x, "realTarget", value.asInstanceOf[js.Any])
      
      inline def setRealTargetUndefined: Self = StObject.set(x, "realTarget", js.undefined)
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  trait ProxyMapResult extends StObject {
    
    var extraOptions: ChannelOptions
    
    var target: GrpcUri
  }
  object ProxyMapResult {
    
    inline def apply(extraOptions: ChannelOptions, target: GrpcUri): ProxyMapResult = {
      val __obj = js.Dynamic.literal(extraOptions = extraOptions.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyMapResult]
    }
    
    extension [Self <: ProxyMapResult](x: Self) {
      
      inline def setExtraOptions(value: ChannelOptions): Self = StObject.set(x, "extraOptions", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: GrpcUri): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
