package typings.grpcGrpcJs

import typings.grpcGrpcJs.callMod.ClientUnaryCall
import typings.grpcGrpcJs.clientMod.CallOptions
import typings.grpcGrpcJs.clientMod.UnaryCallback
import typings.grpcGrpcJs.getChannelRequestMod.GetChannelRequest
import typings.grpcGrpcJs.getChannelRequestMod.GetChannelRequestOutput
import typings.grpcGrpcJs.getChannelResponseMod.GetChannelResponse
import typings.grpcGrpcJs.getChannelResponseMod.GetChannelResponseOutput
import typings.grpcGrpcJs.getServerRequestMod.GetServerRequest
import typings.grpcGrpcJs.getServerRequestMod.GetServerRequestOutput
import typings.grpcGrpcJs.getServerResponseMod.GetServerResponse
import typings.grpcGrpcJs.getServerResponseMod.GetServerResponseOutput
import typings.grpcGrpcJs.getServerSocketsRequestMod.GetServerSocketsRequest
import typings.grpcGrpcJs.getServerSocketsRequestMod.GetServerSocketsRequestOutput
import typings.grpcGrpcJs.getServerSocketsResponseMod.GetServerSocketsResponse
import typings.grpcGrpcJs.getServerSocketsResponseMod.GetServerSocketsResponseOutput
import typings.grpcGrpcJs.getServersRequestMod.GetServersRequest
import typings.grpcGrpcJs.getServersRequestMod.GetServersRequestOutput
import typings.grpcGrpcJs.getServersResponseMod.GetServersResponse
import typings.grpcGrpcJs.getServersResponseMod.GetServersResponseOutput
import typings.grpcGrpcJs.getSocketRequestMod.GetSocketRequest
import typings.grpcGrpcJs.getSocketRequestMod.GetSocketRequestOutput
import typings.grpcGrpcJs.getSocketResponseMod.GetSocketResponse
import typings.grpcGrpcJs.getSocketResponseMod.GetSocketResponseOutput
import typings.grpcGrpcJs.getSubchannelRequestMod.GetSubchannelRequest
import typings.grpcGrpcJs.getSubchannelRequestMod.GetSubchannelRequestOutput
import typings.grpcGrpcJs.getSubchannelResponseMod.GetSubchannelResponse
import typings.grpcGrpcJs.getSubchannelResponseMod.GetSubchannelResponseOutput
import typings.grpcGrpcJs.getTopChannelsRequestMod.GetTopChannelsRequest
import typings.grpcGrpcJs.getTopChannelsRequestMod.GetTopChannelsRequestOutput
import typings.grpcGrpcJs.getTopChannelsResponseMod.GetTopChannelsResponse
import typings.grpcGrpcJs.getTopChannelsResponseMod.GetTopChannelsResponseOutput
import typings.grpcGrpcJs.mod.Client
import typings.grpcGrpcJs.mod.Metadata
import typings.grpcGrpcJs.serverCallMod.ServerUnaryCall
import typings.grpcGrpcJs.serverCallMod.handleUnaryCall
import typings.grpcGrpcJs.serverCallMod.sendUnaryData
import typings.grpcGrpcJs.srcServerMod.UntypedServiceImplementation
import typings.grpcProtoLoader.mod.MethodDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ChannelzMod {
  
  @js.native
  trait ChannelzClient extends Client {
    
    def GetChannel(argument: GetChannelRequest, callback: UnaryCallback[GetChannelResponseOutput]): ClientUnaryCall = js.native
    def GetChannel(argument: GetChannelRequest, metadata: Metadata, callback: UnaryCallback[GetChannelResponseOutput]): ClientUnaryCall = js.native
    /**
      * Returns a single Channel, or else a NOT_FOUND code.
      */
    def GetChannel(
      argument: GetChannelRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetChannelResponseOutput]
    ): ClientUnaryCall = js.native
    def GetChannel(
      argument: GetChannelRequest,
      options: CallOptions,
      callback: UnaryCallback[GetChannelResponseOutput]
    ): ClientUnaryCall = js.native
    
    def GetServer(argument: GetServerRequest, callback: UnaryCallback[GetServerResponseOutput]): ClientUnaryCall = js.native
    def GetServer(argument: GetServerRequest, metadata: Metadata, callback: UnaryCallback[GetServerResponseOutput]): ClientUnaryCall = js.native
    /**
      * Returns a single Server, or else a NOT_FOUND code.
      */
    def GetServer(
      argument: GetServerRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetServerResponseOutput]
    ): ClientUnaryCall = js.native
    def GetServer(argument: GetServerRequest, options: CallOptions, callback: UnaryCallback[GetServerResponseOutput]): ClientUnaryCall = js.native
    
    def GetServerSockets(argument: GetServerSocketsRequest, callback: UnaryCallback[GetServerSocketsResponseOutput]): ClientUnaryCall = js.native
    def GetServerSockets(
      argument: GetServerSocketsRequest,
      metadata: Metadata,
      callback: UnaryCallback[GetServerSocketsResponseOutput]
    ): ClientUnaryCall = js.native
    /**
      * Gets all server sockets that exist in the process.
      */
    def GetServerSockets(
      argument: GetServerSocketsRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetServerSocketsResponseOutput]
    ): ClientUnaryCall = js.native
    def GetServerSockets(
      argument: GetServerSocketsRequest,
      options: CallOptions,
      callback: UnaryCallback[GetServerSocketsResponseOutput]
    ): ClientUnaryCall = js.native
    
    def GetServers(argument: GetServersRequest, callback: UnaryCallback[GetServersResponseOutput]): ClientUnaryCall = js.native
    def GetServers(argument: GetServersRequest, metadata: Metadata, callback: UnaryCallback[GetServersResponseOutput]): ClientUnaryCall = js.native
    /**
      * Gets all servers that exist in the process.
      */
    def GetServers(
      argument: GetServersRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetServersResponseOutput]
    ): ClientUnaryCall = js.native
    def GetServers(
      argument: GetServersRequest,
      options: CallOptions,
      callback: UnaryCallback[GetServersResponseOutput]
    ): ClientUnaryCall = js.native
    
    def GetSocket(argument: GetSocketRequest, callback: UnaryCallback[GetSocketResponseOutput]): ClientUnaryCall = js.native
    def GetSocket(argument: GetSocketRequest, metadata: Metadata, callback: UnaryCallback[GetSocketResponseOutput]): ClientUnaryCall = js.native
    /**
      * Returns a single Socket or else a NOT_FOUND code.
      */
    def GetSocket(
      argument: GetSocketRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetSocketResponseOutput]
    ): ClientUnaryCall = js.native
    def GetSocket(argument: GetSocketRequest, options: CallOptions, callback: UnaryCallback[GetSocketResponseOutput]): ClientUnaryCall = js.native
    
    def GetSubchannel(argument: GetSubchannelRequest, callback: UnaryCallback[GetSubchannelResponseOutput]): ClientUnaryCall = js.native
    def GetSubchannel(
      argument: GetSubchannelRequest,
      metadata: Metadata,
      callback: UnaryCallback[GetSubchannelResponseOutput]
    ): ClientUnaryCall = js.native
    /**
      * Returns a single Subchannel, or else a NOT_FOUND code.
      */
    def GetSubchannel(
      argument: GetSubchannelRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetSubchannelResponseOutput]
    ): ClientUnaryCall = js.native
    def GetSubchannel(
      argument: GetSubchannelRequest,
      options: CallOptions,
      callback: UnaryCallback[GetSubchannelResponseOutput]
    ): ClientUnaryCall = js.native
    
    def GetTopChannels(argument: GetTopChannelsRequest, callback: UnaryCallback[GetTopChannelsResponseOutput]): ClientUnaryCall = js.native
    def GetTopChannels(
      argument: GetTopChannelsRequest,
      metadata: Metadata,
      callback: UnaryCallback[GetTopChannelsResponseOutput]
    ): ClientUnaryCall = js.native
    /**
      * Gets all root channels (i.e. channels the application has directly
      * created). This does not include subchannels nor non-top level channels.
      */
    def GetTopChannels(
      argument: GetTopChannelsRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetTopChannelsResponseOutput]
    ): ClientUnaryCall = js.native
    def GetTopChannels(
      argument: GetTopChannelsRequest,
      options: CallOptions,
      callback: UnaryCallback[GetTopChannelsResponseOutput]
    ): ClientUnaryCall = js.native
    
    def getServer(argument: GetServerRequest, callback: UnaryCallback[GetServerResponseOutput]): ClientUnaryCall = js.native
    def getServer(argument: GetServerRequest, metadata: Metadata, callback: UnaryCallback[GetServerResponseOutput]): ClientUnaryCall = js.native
    /**
      * Returns a single Server, or else a NOT_FOUND code.
      */
    def getServer(
      argument: GetServerRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetServerResponseOutput]
    ): ClientUnaryCall = js.native
    def getServer(argument: GetServerRequest, options: CallOptions, callback: UnaryCallback[GetServerResponseOutput]): ClientUnaryCall = js.native
    
    def getServerSockets(argument: GetServerSocketsRequest, callback: UnaryCallback[GetServerSocketsResponseOutput]): ClientUnaryCall = js.native
    def getServerSockets(
      argument: GetServerSocketsRequest,
      metadata: Metadata,
      callback: UnaryCallback[GetServerSocketsResponseOutput]
    ): ClientUnaryCall = js.native
    /**
      * Gets all server sockets that exist in the process.
      */
    def getServerSockets(
      argument: GetServerSocketsRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetServerSocketsResponseOutput]
    ): ClientUnaryCall = js.native
    def getServerSockets(
      argument: GetServerSocketsRequest,
      options: CallOptions,
      callback: UnaryCallback[GetServerSocketsResponseOutput]
    ): ClientUnaryCall = js.native
    
    def getServers(argument: GetServersRequest, callback: UnaryCallback[GetServersResponseOutput]): ClientUnaryCall = js.native
    def getServers(argument: GetServersRequest, metadata: Metadata, callback: UnaryCallback[GetServersResponseOutput]): ClientUnaryCall = js.native
    /**
      * Gets all servers that exist in the process.
      */
    def getServers(
      argument: GetServersRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetServersResponseOutput]
    ): ClientUnaryCall = js.native
    def getServers(
      argument: GetServersRequest,
      options: CallOptions,
      callback: UnaryCallback[GetServersResponseOutput]
    ): ClientUnaryCall = js.native
    
    def getSocket(argument: GetSocketRequest, callback: UnaryCallback[GetSocketResponseOutput]): ClientUnaryCall = js.native
    def getSocket(argument: GetSocketRequest, metadata: Metadata, callback: UnaryCallback[GetSocketResponseOutput]): ClientUnaryCall = js.native
    /**
      * Returns a single Socket or else a NOT_FOUND code.
      */
    def getSocket(
      argument: GetSocketRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetSocketResponseOutput]
    ): ClientUnaryCall = js.native
    def getSocket(argument: GetSocketRequest, options: CallOptions, callback: UnaryCallback[GetSocketResponseOutput]): ClientUnaryCall = js.native
    
    def getSubchannel(argument: GetSubchannelRequest, callback: UnaryCallback[GetSubchannelResponseOutput]): ClientUnaryCall = js.native
    def getSubchannel(
      argument: GetSubchannelRequest,
      metadata: Metadata,
      callback: UnaryCallback[GetSubchannelResponseOutput]
    ): ClientUnaryCall = js.native
    /**
      * Returns a single Subchannel, or else a NOT_FOUND code.
      */
    def getSubchannel(
      argument: GetSubchannelRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetSubchannelResponseOutput]
    ): ClientUnaryCall = js.native
    def getSubchannel(
      argument: GetSubchannelRequest,
      options: CallOptions,
      callback: UnaryCallback[GetSubchannelResponseOutput]
    ): ClientUnaryCall = js.native
    
    def getTopChannels(argument: GetTopChannelsRequest, callback: UnaryCallback[GetTopChannelsResponseOutput]): ClientUnaryCall = js.native
    def getTopChannels(
      argument: GetTopChannelsRequest,
      metadata: Metadata,
      callback: UnaryCallback[GetTopChannelsResponseOutput]
    ): ClientUnaryCall = js.native
    /**
      * Gets all root channels (i.e. channels the application has directly
      * created). This does not include subchannels nor non-top level channels.
      */
    def getTopChannels(
      argument: GetTopChannelsRequest,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[GetTopChannelsResponseOutput]
    ): ClientUnaryCall = js.native
    def getTopChannels(
      argument: GetTopChannelsRequest,
      options: CallOptions,
      callback: UnaryCallback[GetTopChannelsResponseOutput]
    ): ClientUnaryCall = js.native
  }
  
  /* Inlined parent @grpc/grpc-js.@grpc/grpc-js.ServiceDefinition<@grpc/grpc-js.@grpc/grpc-js/build/src/server.UntypedServiceImplementation> */
  trait ChannelzDefinition extends StObject {
    
    var GetChannel: MethodDefinition[
        GetChannelRequest, 
        GetChannelResponse, 
        GetChannelRequestOutput, 
        GetChannelResponseOutput
      ]
    
    var GetServer: MethodDefinition[GetServerRequest, GetServerResponse, GetServerRequestOutput, GetServerResponseOutput]
    
    var GetServerSockets: MethodDefinition[
        GetServerSocketsRequest, 
        GetServerSocketsResponse, 
        GetServerSocketsRequestOutput, 
        GetServerSocketsResponseOutput
      ]
    
    var GetServers: MethodDefinition[
        GetServersRequest, 
        GetServersResponse, 
        GetServersRequestOutput, 
        GetServersResponseOutput
      ]
    
    var GetSocket: MethodDefinition[GetSocketRequest, GetSocketResponse, GetSocketRequestOutput, GetSocketResponseOutput]
    
    var GetSubchannel: MethodDefinition[
        GetSubchannelRequest, 
        GetSubchannelResponse, 
        GetSubchannelRequestOutput, 
        GetSubchannelResponseOutput
      ]
    
    var GetTopChannels: MethodDefinition[
        GetTopChannelsRequest, 
        GetTopChannelsResponse, 
        GetTopChannelsRequestOutput, 
        GetTopChannelsResponseOutput
      ]
  }
  object ChannelzDefinition {
    
    inline def apply(
      GetChannel: MethodDefinition[
          GetChannelRequest, 
          GetChannelResponse, 
          GetChannelRequestOutput, 
          GetChannelResponseOutput
        ],
      GetServer: MethodDefinition[GetServerRequest, GetServerResponse, GetServerRequestOutput, GetServerResponseOutput],
      GetServerSockets: MethodDefinition[
          GetServerSocketsRequest, 
          GetServerSocketsResponse, 
          GetServerSocketsRequestOutput, 
          GetServerSocketsResponseOutput
        ],
      GetServers: MethodDefinition[
          GetServersRequest, 
          GetServersResponse, 
          GetServersRequestOutput, 
          GetServersResponseOutput
        ],
      GetSocket: MethodDefinition[GetSocketRequest, GetSocketResponse, GetSocketRequestOutput, GetSocketResponseOutput],
      GetSubchannel: MethodDefinition[
          GetSubchannelRequest, 
          GetSubchannelResponse, 
          GetSubchannelRequestOutput, 
          GetSubchannelResponseOutput
        ],
      GetTopChannels: MethodDefinition[
          GetTopChannelsRequest, 
          GetTopChannelsResponse, 
          GetTopChannelsRequestOutput, 
          GetTopChannelsResponseOutput
        ]
    ): ChannelzDefinition = {
      val __obj = js.Dynamic.literal(GetChannel = GetChannel.asInstanceOf[js.Any], GetServer = GetServer.asInstanceOf[js.Any], GetServerSockets = GetServerSockets.asInstanceOf[js.Any], GetServers = GetServers.asInstanceOf[js.Any], GetSocket = GetSocket.asInstanceOf[js.Any], GetSubchannel = GetSubchannel.asInstanceOf[js.Any], GetTopChannels = GetTopChannels.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelzDefinition]
    }
    
    extension [Self <: ChannelzDefinition](x: Self) {
      
      inline def setGetChannel(
        value: MethodDefinition[
              GetChannelRequest, 
              GetChannelResponse, 
              GetChannelRequestOutput, 
              GetChannelResponseOutput
            ]
      ): Self = StObject.set(x, "GetChannel", value.asInstanceOf[js.Any])
      
      inline def setGetServer(
        value: MethodDefinition[GetServerRequest, GetServerResponse, GetServerRequestOutput, GetServerResponseOutput]
      ): Self = StObject.set(x, "GetServer", value.asInstanceOf[js.Any])
      
      inline def setGetServerSockets(
        value: MethodDefinition[
              GetServerSocketsRequest, 
              GetServerSocketsResponse, 
              GetServerSocketsRequestOutput, 
              GetServerSocketsResponseOutput
            ]
      ): Self = StObject.set(x, "GetServerSockets", value.asInstanceOf[js.Any])
      
      inline def setGetServers(
        value: MethodDefinition[
              GetServersRequest, 
              GetServersResponse, 
              GetServersRequestOutput, 
              GetServersResponseOutput
            ]
      ): Self = StObject.set(x, "GetServers", value.asInstanceOf[js.Any])
      
      inline def setGetSocket(
        value: MethodDefinition[GetSocketRequest, GetSocketResponse, GetSocketRequestOutput, GetSocketResponseOutput]
      ): Self = StObject.set(x, "GetSocket", value.asInstanceOf[js.Any])
      
      inline def setGetSubchannel(
        value: MethodDefinition[
              GetSubchannelRequest, 
              GetSubchannelResponse, 
              GetSubchannelRequestOutput, 
              GetSubchannelResponseOutput
            ]
      ): Self = StObject.set(x, "GetSubchannel", value.asInstanceOf[js.Any])
      
      inline def setGetTopChannels(
        value: MethodDefinition[
              GetTopChannelsRequest, 
              GetTopChannelsResponse, 
              GetTopChannelsRequestOutput, 
              GetTopChannelsResponseOutput
            ]
      ): Self = StObject.set(x, "GetTopChannels", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelzHandlers
    extends StObject
       with UntypedServiceImplementation {
    
    /**
      * Returns a single Channel, or else a NOT_FOUND code.
      */
    def GetChannel(
      call: ServerUnaryCall[GetChannelRequestOutput, GetChannelResponse],
      callback: sendUnaryData[GetChannelResponse]
    ): Unit
    /**
      * Returns a single Channel, or else a NOT_FOUND code.
      */
    @JSName("GetChannel")
    var GetChannel_Original: handleUnaryCall[GetChannelRequestOutput, GetChannelResponse]
    
    /**
      * Returns a single Server, or else a NOT_FOUND code.
      */
    def GetServer(
      call: ServerUnaryCall[GetServerRequestOutput, GetServerResponse],
      callback: sendUnaryData[GetServerResponse]
    ): Unit
    
    /**
      * Gets all server sockets that exist in the process.
      */
    def GetServerSockets(
      call: ServerUnaryCall[GetServerSocketsRequestOutput, GetServerSocketsResponse],
      callback: sendUnaryData[GetServerSocketsResponse]
    ): Unit
    /**
      * Gets all server sockets that exist in the process.
      */
    @JSName("GetServerSockets")
    var GetServerSockets_Original: handleUnaryCall[GetServerSocketsRequestOutput, GetServerSocketsResponse]
    
    /**
      * Returns a single Server, or else a NOT_FOUND code.
      */
    @JSName("GetServer")
    var GetServer_Original: handleUnaryCall[GetServerRequestOutput, GetServerResponse]
    
    /**
      * Gets all servers that exist in the process.
      */
    def GetServers(
      call: ServerUnaryCall[GetServersRequestOutput, GetServersResponse],
      callback: sendUnaryData[GetServersResponse]
    ): Unit
    /**
      * Gets all servers that exist in the process.
      */
    @JSName("GetServers")
    var GetServers_Original: handleUnaryCall[GetServersRequestOutput, GetServersResponse]
    
    /**
      * Returns a single Socket or else a NOT_FOUND code.
      */
    def GetSocket(
      call: ServerUnaryCall[GetSocketRequestOutput, GetSocketResponse],
      callback: sendUnaryData[GetSocketResponse]
    ): Unit
    /**
      * Returns a single Socket or else a NOT_FOUND code.
      */
    @JSName("GetSocket")
    var GetSocket_Original: handleUnaryCall[GetSocketRequestOutput, GetSocketResponse]
    
    /**
      * Returns a single Subchannel, or else a NOT_FOUND code.
      */
    def GetSubchannel(
      call: ServerUnaryCall[GetSubchannelRequestOutput, GetSubchannelResponse],
      callback: sendUnaryData[GetSubchannelResponse]
    ): Unit
    /**
      * Returns a single Subchannel, or else a NOT_FOUND code.
      */
    @JSName("GetSubchannel")
    var GetSubchannel_Original: handleUnaryCall[GetSubchannelRequestOutput, GetSubchannelResponse]
    
    /**
      * Gets all root channels (i.e. channels the application has directly
      * created). This does not include subchannels nor non-top level channels.
      */
    def GetTopChannels(
      call: ServerUnaryCall[GetTopChannelsRequestOutput, GetTopChannelsResponse],
      callback: sendUnaryData[GetTopChannelsResponse]
    ): Unit
    /**
      * Gets all root channels (i.e. channels the application has directly
      * created). This does not include subchannels nor non-top level channels.
      */
    @JSName("GetTopChannels")
    var GetTopChannels_Original: handleUnaryCall[GetTopChannelsRequestOutput, GetTopChannelsResponse]
  }
  object ChannelzHandlers {
    
    inline def apply(
      GetChannel: (/* call */ ServerUnaryCall[GetChannelRequestOutput, GetChannelResponse], /* callback */ sendUnaryData[GetChannelResponse]) => Unit,
      GetServer: (/* call */ ServerUnaryCall[GetServerRequestOutput, GetServerResponse], /* callback */ sendUnaryData[GetServerResponse]) => Unit,
      GetServerSockets: (/* call */ ServerUnaryCall[GetServerSocketsRequestOutput, GetServerSocketsResponse], /* callback */ sendUnaryData[GetServerSocketsResponse]) => Unit,
      GetServers: (/* call */ ServerUnaryCall[GetServersRequestOutput, GetServersResponse], /* callback */ sendUnaryData[GetServersResponse]) => Unit,
      GetSocket: (/* call */ ServerUnaryCall[GetSocketRequestOutput, GetSocketResponse], /* callback */ sendUnaryData[GetSocketResponse]) => Unit,
      GetSubchannel: (/* call */ ServerUnaryCall[GetSubchannelRequestOutput, GetSubchannelResponse], /* callback */ sendUnaryData[GetSubchannelResponse]) => Unit,
      GetTopChannels: (/* call */ ServerUnaryCall[GetTopChannelsRequestOutput, GetTopChannelsResponse], /* callback */ sendUnaryData[GetTopChannelsResponse]) => Unit
    ): ChannelzHandlers = {
      val __obj = js.Dynamic.literal(GetChannel = js.Any.fromFunction2(GetChannel), GetServer = js.Any.fromFunction2(GetServer), GetServerSockets = js.Any.fromFunction2(GetServerSockets), GetServers = js.Any.fromFunction2(GetServers), GetSocket = js.Any.fromFunction2(GetSocket), GetSubchannel = js.Any.fromFunction2(GetSubchannel), GetTopChannels = js.Any.fromFunction2(GetTopChannels))
      __obj.asInstanceOf[ChannelzHandlers]
    }
    
    extension [Self <: ChannelzHandlers](x: Self) {
      
      inline def setGetChannel(
        value: (/* call */ ServerUnaryCall[GetChannelRequestOutput, GetChannelResponse], /* callback */ sendUnaryData[GetChannelResponse]) => Unit
      ): Self = StObject.set(x, "GetChannel", js.Any.fromFunction2(value))
      
      inline def setGetServer(
        value: (/* call */ ServerUnaryCall[GetServerRequestOutput, GetServerResponse], /* callback */ sendUnaryData[GetServerResponse]) => Unit
      ): Self = StObject.set(x, "GetServer", js.Any.fromFunction2(value))
      
      inline def setGetServerSockets(
        value: (/* call */ ServerUnaryCall[GetServerSocketsRequestOutput, GetServerSocketsResponse], /* callback */ sendUnaryData[GetServerSocketsResponse]) => Unit
      ): Self = StObject.set(x, "GetServerSockets", js.Any.fromFunction2(value))
      
      inline def setGetServers(
        value: (/* call */ ServerUnaryCall[GetServersRequestOutput, GetServersResponse], /* callback */ sendUnaryData[GetServersResponse]) => Unit
      ): Self = StObject.set(x, "GetServers", js.Any.fromFunction2(value))
      
      inline def setGetSocket(
        value: (/* call */ ServerUnaryCall[GetSocketRequestOutput, GetSocketResponse], /* callback */ sendUnaryData[GetSocketResponse]) => Unit
      ): Self = StObject.set(x, "GetSocket", js.Any.fromFunction2(value))
      
      inline def setGetSubchannel(
        value: (/* call */ ServerUnaryCall[GetSubchannelRequestOutput, GetSubchannelResponse], /* callback */ sendUnaryData[GetSubchannelResponse]) => Unit
      ): Self = StObject.set(x, "GetSubchannel", js.Any.fromFunction2(value))
      
      inline def setGetTopChannels(
        value: (/* call */ ServerUnaryCall[GetTopChannelsRequestOutput, GetTopChannelsResponse], /* callback */ sendUnaryData[GetTopChannelsResponse]) => Unit
      ): Self = StObject.set(x, "GetTopChannels", js.Any.fromFunction2(value))
    }
  }
}
