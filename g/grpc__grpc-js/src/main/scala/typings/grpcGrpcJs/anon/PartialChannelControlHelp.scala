package typings.grpcGrpcJs.anon

import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcChannelzMod.ChannelRef
import typings.grpcGrpcJs.buildSrcChannelzMod.SubchannelRef
import typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typings.grpcGrpcJs.buildSrcPickerMod.Picker
import typings.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typings.grpcGrpcJs.buildSrcSubchannelInterfaceMod.SubchannelInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/load-balancer.ChannelControlHelper> */
trait PartialChannelControlHelp extends StObject {
  
  var addChannelzChild: js.UndefOr[js.Function1[/* child */ ChannelRef | SubchannelRef, Unit]] = js.undefined
  
  var createSubchannel: js.UndefOr[
    js.Function2[
      /* subchannelAddress */ SubchannelAddress, 
      /* subchannelArgs */ ChannelOptions, 
      SubchannelInterface
    ]
  ] = js.undefined
  
  var removeChannelzChild: js.UndefOr[js.Function1[/* child */ ChannelRef | SubchannelRef, Unit]] = js.undefined
  
  var requestReresolution: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var updateState: js.UndefOr[
    js.Function2[/* connectivityState */ ConnectivityState, /* picker */ Picker, Unit]
  ] = js.undefined
}
object PartialChannelControlHelp {
  
  inline def apply(): PartialChannelControlHelp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChannelControlHelp]
  }
  
  extension [Self <: PartialChannelControlHelp](x: Self) {
    
    inline def setAddChannelzChild(value: /* child */ ChannelRef | SubchannelRef => Unit): Self = StObject.set(x, "addChannelzChild", js.Any.fromFunction1(value))
    
    inline def setAddChannelzChildUndefined: Self = StObject.set(x, "addChannelzChild", js.undefined)
    
    inline def setCreateSubchannel(
      value: (/* subchannelAddress */ SubchannelAddress, /* subchannelArgs */ ChannelOptions) => SubchannelInterface
    ): Self = StObject.set(x, "createSubchannel", js.Any.fromFunction2(value))
    
    inline def setCreateSubchannelUndefined: Self = StObject.set(x, "createSubchannel", js.undefined)
    
    inline def setRemoveChannelzChild(value: /* child */ ChannelRef | SubchannelRef => Unit): Self = StObject.set(x, "removeChannelzChild", js.Any.fromFunction1(value))
    
    inline def setRemoveChannelzChildUndefined: Self = StObject.set(x, "removeChannelzChild", js.undefined)
    
    inline def setRequestReresolution(value: () => Unit): Self = StObject.set(x, "requestReresolution", js.Any.fromFunction0(value))
    
    inline def setRequestReresolutionUndefined: Self = StObject.set(x, "requestReresolution", js.undefined)
    
    inline def setUpdateState(value: (/* connectivityState */ ConnectivityState, /* picker */ Picker) => Unit): Self = StObject.set(x, "updateState", js.Any.fromFunction2(value))
    
    inline def setUpdateStateUndefined: Self = StObject.set(x, "updateState", js.undefined)
  }
}
