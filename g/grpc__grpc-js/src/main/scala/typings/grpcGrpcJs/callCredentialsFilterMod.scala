package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Call
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.filterMod.BaseFilter
import typings.grpcGrpcJs.filterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callCredentialsFilterMod {
  
  @JSImport("@grpc/grpc-js/build/src/call-credentials-filter", "CallCredentialsFilter")
  @js.native
  class CallCredentialsFilter protected () extends BaseFilter {
    def this(channel: Channel, stream: Call) = this()
    
    val channel: js.Any = js.native
    
    var serviceUrl: js.Any = js.native
    
    val stream: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/call-credentials-filter", "CallCredentialsFilterFactory")
  @js.native
  class CallCredentialsFilterFactory protected ()
    extends StObject
       with FilterFactory[CallCredentialsFilter] {
    def this(channel: Channel) = this()
    
    val channel: js.Any = js.native
    
    /* CompleteClass */
    override def createFilter(callStream: Call): CallCredentialsFilter = js.native
  }
}
