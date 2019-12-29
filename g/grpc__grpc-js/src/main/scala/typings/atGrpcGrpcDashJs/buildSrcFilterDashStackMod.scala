package typings.atGrpcGrpcDashJs

import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.Call
import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.WriteObject
import typings.atGrpcGrpcDashJs.buildSrcFilterMod.Filter
import typings.atGrpcGrpcDashJs.buildSrcFilterMod.FilterFactory
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/filter-stack", JSImport.Namespace)
@js.native
object buildSrcFilterDashStackMod extends js.Object {
  @js.native
  class FilterStack protected () extends Filter {
    def this(filters: js.Array[Filter]) = this()
    val filters: js.Any = js.native
    /* CompleteClass */
    override def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
    /* CompleteClass */
    override def receiveMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
    /* CompleteClass */
    override def receiveTrailers(status: js.Promise[StatusObject]): js.Promise[StatusObject] = js.native
    /* CompleteClass */
    override def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
    /* CompleteClass */
    override def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
  }
  
  @js.native
  class FilterStackFactory protected () extends FilterFactory[FilterStack] {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
    val factories: js.Any = js.native
    /* CompleteClass */
    override def createFilter(callStream: Call): FilterStack = js.native
  }
  
}

