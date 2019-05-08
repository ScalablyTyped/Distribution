package typings
package grpcDashGcpLib.grpcDashGcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc-gcp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createGcpApiConfig(apiDefinition: js.Object): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig = js.native
  def gcpCallInvocationTransformer[RequestType, ResponseType](callProperties: InputCallProperties[RequestType, ResponseType]): OutputCallProperties[RequestType, ResponseType] = js.native
  def gcpChannelFactoryOverride(address: java.lang.String, credentials: grpcLib.grpcMod.ChannelCredentials, options: js.Object): grpcDashGcpLib.buildSrcGcpUnderscoreChannelUnderscoreFactoryMod.GcpChannelFactory = js.native
}

