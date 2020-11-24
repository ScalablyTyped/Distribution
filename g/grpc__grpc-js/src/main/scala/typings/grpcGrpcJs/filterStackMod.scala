package typings.grpcGrpcJs

import typings.grpcGrpcJs.filterMod.Filter
import typings.grpcGrpcJs.filterMod.FilterFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/filter-stack", JSImport.Namespace)
@js.native
object filterStackMod extends js.Object {
  
  @js.native
  class FilterStack protected () extends Filter {
    def this(filters: js.Array[Filter]) = this()
    
    val filters: js.Any = js.native
  }
  
  @js.native
  class FilterStackFactory protected () extends FilterFactory[FilterStack] {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
    
    val factories: js.Any = js.native
  }
}
