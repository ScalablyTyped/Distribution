package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Call
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.filterMod.BaseFilter
import typings.grpcGrpcJs.filterMod.FilterFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/deadline-filter", JSImport.Namespace)
@js.native
object deadlineFilterMod extends js.Object {
  
  @js.native
  class DeadlineFilter protected () extends BaseFilter {
    def this(channel: Channel, callStream: Call) = this()
    
    val callStream: js.Any = js.native
    
    val channel: js.Any = js.native
    
    var deadline: js.Any = js.native
    
    var timer: js.Any = js.native
  }
  
  @js.native
  class DeadlineFilterFactory protected () extends FilterFactory[DeadlineFilter] {
    def this(channel: Channel) = this()
    
    val channel: js.Any = js.native
  }
}
