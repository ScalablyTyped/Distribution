package typings.grpcGrpcJs.anon

import org.scalablytyped.runtime.Instantiable3
import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.buildSrcClientMod.ClientOptions
import typings.grpcGrpcJs.buildSrcGeneratedChannelzMod.SubtypeConstructor
import typings.grpcGrpcJs.mod.Client
import typings.grpcProtoLoader.mod.MessageTypeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var Address: MessageTypeDefinition
  
  var Channel: MessageTypeDefinition
  
  var ChannelConnectivityState: MessageTypeDefinition
  
  var ChannelData: MessageTypeDefinition
  
  var ChannelRef: MessageTypeDefinition
  
  var ChannelTrace: MessageTypeDefinition
  
  var ChannelTraceEvent: MessageTypeDefinition
  
  /**
    * Channelz is a service exposed by gRPC servers that provides detailed debug
    * information.
    */
  var Channelz: (SubtypeConstructor[
    Instantiable3[
      /* address */ String, 
      /* credentials */ ChannelCredentials, 
      /* options */ js.UndefOr[ClientOptions], 
      Client
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _grpc_channelz_v1_ChannelzClient */ scala.Any
  ]) & Service
  
  var GetChannelRequest: MessageTypeDefinition
  
  var GetChannelResponse: MessageTypeDefinition
  
  var GetServerRequest: MessageTypeDefinition
  
  var GetServerResponse: MessageTypeDefinition
  
  var GetServerSocketsRequest: MessageTypeDefinition
  
  var GetServerSocketsResponse: MessageTypeDefinition
  
  var GetServersRequest: MessageTypeDefinition
  
  var GetServersResponse: MessageTypeDefinition
  
  var GetSocketRequest: MessageTypeDefinition
  
  var GetSocketResponse: MessageTypeDefinition
  
  var GetSubchannelRequest: MessageTypeDefinition
  
  var GetSubchannelResponse: MessageTypeDefinition
  
  var GetTopChannelsRequest: MessageTypeDefinition
  
  var GetTopChannelsResponse: MessageTypeDefinition
  
  var Security: MessageTypeDefinition
  
  var Server: MessageTypeDefinition
  
  var ServerData: MessageTypeDefinition
  
  var ServerRef: MessageTypeDefinition
  
  var Socket: MessageTypeDefinition
  
  var SocketData: MessageTypeDefinition
  
  var SocketOption: MessageTypeDefinition
  
  var SocketOptionLinger: MessageTypeDefinition
  
  var SocketOptionTcpInfo: MessageTypeDefinition
  
  var SocketOptionTimeout: MessageTypeDefinition
  
  var SocketRef: MessageTypeDefinition
  
  var Subchannel: MessageTypeDefinition
  
  var SubchannelRef: MessageTypeDefinition
}
object Address {
  
  inline def apply(
    Address: MessageTypeDefinition,
    Channel: MessageTypeDefinition,
    ChannelConnectivityState: MessageTypeDefinition,
    ChannelData: MessageTypeDefinition,
    ChannelRef: MessageTypeDefinition,
    ChannelTrace: MessageTypeDefinition,
    ChannelTraceEvent: MessageTypeDefinition,
    Channelz: (SubtypeConstructor[
      Instantiable3[
        /* address */ String, 
        /* credentials */ ChannelCredentials, 
        /* options */ js.UndefOr[ClientOptions], 
        Client
      ], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _grpc_channelz_v1_ChannelzClient */ scala.Any
    ]) & Service,
    GetChannelRequest: MessageTypeDefinition,
    GetChannelResponse: MessageTypeDefinition,
    GetServerRequest: MessageTypeDefinition,
    GetServerResponse: MessageTypeDefinition,
    GetServerSocketsRequest: MessageTypeDefinition,
    GetServerSocketsResponse: MessageTypeDefinition,
    GetServersRequest: MessageTypeDefinition,
    GetServersResponse: MessageTypeDefinition,
    GetSocketRequest: MessageTypeDefinition,
    GetSocketResponse: MessageTypeDefinition,
    GetSubchannelRequest: MessageTypeDefinition,
    GetSubchannelResponse: MessageTypeDefinition,
    GetTopChannelsRequest: MessageTypeDefinition,
    GetTopChannelsResponse: MessageTypeDefinition,
    Security: MessageTypeDefinition,
    Server: MessageTypeDefinition,
    ServerData: MessageTypeDefinition,
    ServerRef: MessageTypeDefinition,
    Socket: MessageTypeDefinition,
    SocketData: MessageTypeDefinition,
    SocketOption: MessageTypeDefinition,
    SocketOptionLinger: MessageTypeDefinition,
    SocketOptionTcpInfo: MessageTypeDefinition,
    SocketOptionTimeout: MessageTypeDefinition,
    SocketRef: MessageTypeDefinition,
    Subchannel: MessageTypeDefinition,
    SubchannelRef: MessageTypeDefinition
  ): Address = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Channel = Channel.asInstanceOf[js.Any], ChannelConnectivityState = ChannelConnectivityState.asInstanceOf[js.Any], ChannelData = ChannelData.asInstanceOf[js.Any], ChannelRef = ChannelRef.asInstanceOf[js.Any], ChannelTrace = ChannelTrace.asInstanceOf[js.Any], ChannelTraceEvent = ChannelTraceEvent.asInstanceOf[js.Any], Channelz = Channelz.asInstanceOf[js.Any], GetChannelRequest = GetChannelRequest.asInstanceOf[js.Any], GetChannelResponse = GetChannelResponse.asInstanceOf[js.Any], GetServerRequest = GetServerRequest.asInstanceOf[js.Any], GetServerResponse = GetServerResponse.asInstanceOf[js.Any], GetServerSocketsRequest = GetServerSocketsRequest.asInstanceOf[js.Any], GetServerSocketsResponse = GetServerSocketsResponse.asInstanceOf[js.Any], GetServersRequest = GetServersRequest.asInstanceOf[js.Any], GetServersResponse = GetServersResponse.asInstanceOf[js.Any], GetSocketRequest = GetSocketRequest.asInstanceOf[js.Any], GetSocketResponse = GetSocketResponse.asInstanceOf[js.Any], GetSubchannelRequest = GetSubchannelRequest.asInstanceOf[js.Any], GetSubchannelResponse = GetSubchannelResponse.asInstanceOf[js.Any], GetTopChannelsRequest = GetTopChannelsRequest.asInstanceOf[js.Any], GetTopChannelsResponse = GetTopChannelsResponse.asInstanceOf[js.Any], Security = Security.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any], ServerData = ServerData.asInstanceOf[js.Any], ServerRef = ServerRef.asInstanceOf[js.Any], Socket = Socket.asInstanceOf[js.Any], SocketData = SocketData.asInstanceOf[js.Any], SocketOption = SocketOption.asInstanceOf[js.Any], SocketOptionLinger = SocketOptionLinger.asInstanceOf[js.Any], SocketOptionTcpInfo = SocketOptionTcpInfo.asInstanceOf[js.Any], SocketOptionTimeout = SocketOptionTimeout.asInstanceOf[js.Any], SocketRef = SocketRef.asInstanceOf[js.Any], Subchannel = Subchannel.asInstanceOf[js.Any], SubchannelRef = SubchannelRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: MessageTypeDefinition): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: MessageTypeDefinition): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setChannelConnectivityState(value: MessageTypeDefinition): Self = StObject.set(x, "ChannelConnectivityState", value.asInstanceOf[js.Any])
    
    inline def setChannelData(value: MessageTypeDefinition): Self = StObject.set(x, "ChannelData", value.asInstanceOf[js.Any])
    
    inline def setChannelRef(value: MessageTypeDefinition): Self = StObject.set(x, "ChannelRef", value.asInstanceOf[js.Any])
    
    inline def setChannelTrace(value: MessageTypeDefinition): Self = StObject.set(x, "ChannelTrace", value.asInstanceOf[js.Any])
    
    inline def setChannelTraceEvent(value: MessageTypeDefinition): Self = StObject.set(x, "ChannelTraceEvent", value.asInstanceOf[js.Any])
    
    inline def setChannelz(
      value: (SubtypeConstructor[
          Instantiable3[
            /* address */ String, 
            /* credentials */ ChannelCredentials, 
            /* options */ js.UndefOr[ClientOptions], 
            Client
          ], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _grpc_channelz_v1_ChannelzClient */ scala.Any
        ]) & Service
    ): Self = StObject.set(x, "Channelz", value.asInstanceOf[js.Any])
    
    inline def setGetChannelRequest(value: MessageTypeDefinition): Self = StObject.set(x, "GetChannelRequest", value.asInstanceOf[js.Any])
    
    inline def setGetChannelResponse(value: MessageTypeDefinition): Self = StObject.set(x, "GetChannelResponse", value.asInstanceOf[js.Any])
    
    inline def setGetServerRequest(value: MessageTypeDefinition): Self = StObject.set(x, "GetServerRequest", value.asInstanceOf[js.Any])
    
    inline def setGetServerResponse(value: MessageTypeDefinition): Self = StObject.set(x, "GetServerResponse", value.asInstanceOf[js.Any])
    
    inline def setGetServerSocketsRequest(value: MessageTypeDefinition): Self = StObject.set(x, "GetServerSocketsRequest", value.asInstanceOf[js.Any])
    
    inline def setGetServerSocketsResponse(value: MessageTypeDefinition): Self = StObject.set(x, "GetServerSocketsResponse", value.asInstanceOf[js.Any])
    
    inline def setGetServersRequest(value: MessageTypeDefinition): Self = StObject.set(x, "GetServersRequest", value.asInstanceOf[js.Any])
    
    inline def setGetServersResponse(value: MessageTypeDefinition): Self = StObject.set(x, "GetServersResponse", value.asInstanceOf[js.Any])
    
    inline def setGetSocketRequest(value: MessageTypeDefinition): Self = StObject.set(x, "GetSocketRequest", value.asInstanceOf[js.Any])
    
    inline def setGetSocketResponse(value: MessageTypeDefinition): Self = StObject.set(x, "GetSocketResponse", value.asInstanceOf[js.Any])
    
    inline def setGetSubchannelRequest(value: MessageTypeDefinition): Self = StObject.set(x, "GetSubchannelRequest", value.asInstanceOf[js.Any])
    
    inline def setGetSubchannelResponse(value: MessageTypeDefinition): Self = StObject.set(x, "GetSubchannelResponse", value.asInstanceOf[js.Any])
    
    inline def setGetTopChannelsRequest(value: MessageTypeDefinition): Self = StObject.set(x, "GetTopChannelsRequest", value.asInstanceOf[js.Any])
    
    inline def setGetTopChannelsResponse(value: MessageTypeDefinition): Self = StObject.set(x, "GetTopChannelsResponse", value.asInstanceOf[js.Any])
    
    inline def setSecurity(value: MessageTypeDefinition): Self = StObject.set(x, "Security", value.asInstanceOf[js.Any])
    
    inline def setServer(value: MessageTypeDefinition): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerData(value: MessageTypeDefinition): Self = StObject.set(x, "ServerData", value.asInstanceOf[js.Any])
    
    inline def setServerRef(value: MessageTypeDefinition): Self = StObject.set(x, "ServerRef", value.asInstanceOf[js.Any])
    
    inline def setSocket(value: MessageTypeDefinition): Self = StObject.set(x, "Socket", value.asInstanceOf[js.Any])
    
    inline def setSocketData(value: MessageTypeDefinition): Self = StObject.set(x, "SocketData", value.asInstanceOf[js.Any])
    
    inline def setSocketOption(value: MessageTypeDefinition): Self = StObject.set(x, "SocketOption", value.asInstanceOf[js.Any])
    
    inline def setSocketOptionLinger(value: MessageTypeDefinition): Self = StObject.set(x, "SocketOptionLinger", value.asInstanceOf[js.Any])
    
    inline def setSocketOptionTcpInfo(value: MessageTypeDefinition): Self = StObject.set(x, "SocketOptionTcpInfo", value.asInstanceOf[js.Any])
    
    inline def setSocketOptionTimeout(value: MessageTypeDefinition): Self = StObject.set(x, "SocketOptionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSocketRef(value: MessageTypeDefinition): Self = StObject.set(x, "SocketRef", value.asInstanceOf[js.Any])
    
    inline def setSubchannel(value: MessageTypeDefinition): Self = StObject.set(x, "Subchannel", value.asInstanceOf[js.Any])
    
    inline def setSubchannelRef(value: MessageTypeDefinition): Self = StObject.set(x, "SubchannelRef", value.asInstanceOf[js.Any])
  }
}
