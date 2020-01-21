package typings.grpcGrpcJs.makeClientMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceClientConstructor
  extends Instantiable2[/* address */ String, /* credentials */ ChannelCredentials, ServiceClient]
     with Instantiable3[
      /* address */ String, 
      /* credentials */ ChannelCredentials, 
      /* options */ Partial[ChannelOptions], 
      ServiceClient
    ] {
  var service: ServiceDefinition = js.native
}

