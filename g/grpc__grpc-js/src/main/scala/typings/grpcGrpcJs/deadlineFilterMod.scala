package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Call
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.filterMod.BaseFilter
import typings.grpcGrpcJs.filterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deadlineFilterMod {
  
  @JSImport("@grpc/grpc-js/build/src/deadline-filter", "DeadlineFilter")
  @js.native
  open class DeadlineFilter protected () extends BaseFilter {
    def this(channel: Channel, callStream: Call) = this()
    
    /* private */ val callStream: Any = js.native
    
    /* private */ val channel: Any = js.native
    
    /* private */ var deadline: Any = js.native
    
    /* private */ var retreiveDeadline: Any = js.native
    
    /* private */ var runTimer: Any = js.native
    
    /* private */ var timer: Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/deadline-filter", "DeadlineFilterFactory")
  @js.native
  open class DeadlineFilterFactory protected ()
    extends StObject
       with FilterFactory[DeadlineFilter] {
    def this(channel: Channel) = this()
    
    /* private */ val channel: Any = js.native
    
    /* CompleteClass */
    override def createFilter(callStream: Call): DeadlineFilter = js.native
  }
}
