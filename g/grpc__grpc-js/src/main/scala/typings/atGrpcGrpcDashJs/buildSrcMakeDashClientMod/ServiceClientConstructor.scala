package typings.atGrpcGrpcDashJs.buildSrcMakeDashClientMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials
import typings.atGrpcGrpcDashJs.buildSrcChannelDashOptionsMod.ChannelOptions
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

