package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSubchannelAddressMod {
  
  @JSImport("@grpc/grpc-js/build/src/subchannel-address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTcpSubchannelAddress(address: SubchannelAddress): /* is @grpc/grpc-js.@grpc/grpc-js/build/src/subchannel-address.TcpSubchannelAddress */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTcpSubchannelAddress")(address.asInstanceOf[js.Any]).asInstanceOf[/* is @grpc/grpc-js.@grpc/grpc-js/build/src/subchannel-address.TcpSubchannelAddress */ Boolean]
  
  inline def stringToSubchannelAddress(addressString: String): SubchannelAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToSubchannelAddress")(addressString.asInstanceOf[js.Any]).asInstanceOf[SubchannelAddress]
  inline def stringToSubchannelAddress(addressString: String, port: Double): SubchannelAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToSubchannelAddress")(addressString.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[SubchannelAddress]
  
  inline def subchannelAddressEqual(address1: SubchannelAddress, address2: SubchannelAddress): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subchannelAddressEqual")(address1.asInstanceOf[js.Any], address2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def subchannelAddressToString(address: SubchannelAddress): String = ^.asInstanceOf[js.Dynamic].applyDynamic("subchannelAddressToString")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IpcSubchannelAddress
    extends StObject
       with SubchannelAddress {
    
    var path: String
  }
  object IpcSubchannelAddress {
    
    inline def apply(path: String): IpcSubchannelAddress = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpcSubchannelAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IpcSubchannelAddress] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcGrpcJs.buildSrcSubchannelAddressMod.TcpSubchannelAddress
    - typings.grpcGrpcJs.buildSrcSubchannelAddressMod.IpcSubchannelAddress
  */
  trait SubchannelAddress extends StObject
  object SubchannelAddress {
    
    inline def IpcSubchannelAddress(path: String): typings.grpcGrpcJs.buildSrcSubchannelAddressMod.IpcSubchannelAddress = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.buildSrcSubchannelAddressMod.IpcSubchannelAddress]
    }
    
    inline def TcpSubchannelAddress(host: String, port: Double): typings.grpcGrpcJs.buildSrcSubchannelAddressMod.TcpSubchannelAddress = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.buildSrcSubchannelAddressMod.TcpSubchannelAddress]
    }
  }
  
  trait TcpSubchannelAddress
    extends StObject
       with SubchannelAddress {
    
    var host: String
    
    var port: Double
  }
  object TcpSubchannelAddress {
    
    inline def apply(host: String, port: Double): TcpSubchannelAddress = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[TcpSubchannelAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TcpSubchannelAddress] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
