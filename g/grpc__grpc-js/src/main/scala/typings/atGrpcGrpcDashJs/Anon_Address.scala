package typings.atGrpcGrpcDashJs

import typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials
import typings.atGrpcGrpcDashJs.buildSrcChannelMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var channelFactoryOverride: js.UndefOr[
    js.Function3[
      /* address */ String, 
      /* credentials */ ChannelCredentials, 
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @grpc/grpc-js.@grpc/grpc-js/build/src/client.ClientOptions */ /* options */ js.Object, 
      Channel
    ]
  ] = js.undefined
  var channelOverride: js.UndefOr[Channel] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(
    channelFactoryOverride: (/* address */ String, /* credentials */ ChannelCredentials, /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @grpc/grpc-js.@grpc/grpc-js/build/src/client.ClientOptions */ /* options */ js.Object) => Channel = null,
    channelOverride: Channel = null
  ): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (channelFactoryOverride != null) __obj.updateDynamic("channelFactoryOverride")(js.Any.fromFunction3(channelFactoryOverride))
    if (channelOverride != null) __obj.updateDynamic("channelOverride")(channelOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Address]
  }
}

