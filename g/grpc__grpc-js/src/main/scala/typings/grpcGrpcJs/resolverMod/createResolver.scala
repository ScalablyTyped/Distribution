package typings.grpcGrpcJs.resolverMod

import typings.grpcGrpcJs.uriParserMod.GrpcUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/resolver", "createResolver")
@js.native
object createResolver extends js.Object {
  def apply(target: GrpcUri, listener: ResolverListener): Resolver = js.native
}

