package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Call
import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.callStreamMod.WriteObject
import typings.grpcGrpcJs.filterMod.Filter
import typings.grpcGrpcJs.filterMod.FilterFactory
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterStackMod {
  
  @JSImport("@grpc/grpc-js/build/src/filter-stack", "FilterStack")
  @js.native
  class FilterStack protected ()
    extends StObject
       with Filter {
    def this(filters: js.Array[Filter]) = this()
    
    /* private */ val filters: js.Any = js.native
    
    /* CompleteClass */
    override def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def receiveMetadata(metadata: Metadata): Metadata = js.native
    
    /* CompleteClass */
    override def receiveTrailers(status: StatusObject): StatusObject = js.native
    
    /* CompleteClass */
    override def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
    
    /* CompleteClass */
    override def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/filter-stack", "FilterStackFactory")
  @js.native
  class FilterStackFactory protected ()
    extends StObject
       with FilterFactory[FilterStack] {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
    
    /* CompleteClass */
    override def createFilter(callStream: Call): FilterStack = js.native
    
    /* private */ val factories: js.Any = js.native
  }
}
