package typings.grpcGrpcJs.resolverMod

import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.uriParserMod.GrpcUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/resolver", "createResolver")
@js.native
object createResolver extends js.Object {
  
  def apply(target: GrpcUri, listener: ResolverListener, options: ChannelOptions): Resolver = js.native
}
