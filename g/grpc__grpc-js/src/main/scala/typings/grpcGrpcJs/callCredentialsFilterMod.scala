package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Call
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.filterMod.BaseFilter
import typings.grpcGrpcJs.filterMod.FilterFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/call-credentials-filter", JSImport.Namespace)
@js.native
object callCredentialsFilterMod extends js.Object {
  @js.native
  class CallCredentialsFilter protected () extends BaseFilter {
    def this(channel: Channel, stream: Call) = this()
    val channel: js.Any = js.native
    var serviceUrl: js.Any = js.native
    val stream: js.Any = js.native
  }
  
  @js.native
  class CallCredentialsFilterFactory protected () extends FilterFactory[CallCredentialsFilter] {
    def this(channel: Channel) = this()
    val channel: js.Any = js.native
  }
  
}

